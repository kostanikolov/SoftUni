import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> invitedGuests = new TreeSet<>();

        String reservations;
        while (!"PARTY".equals(reservations = scanner.nextLine())) {
            invitedGuests.add(reservations);
        }

        //Set<String> arrivedGuests = new TreeSet<>();
        while (!"END".equals(reservations = scanner.nextLine())) {
            invitedGuests.remove(reservations);
        }

        System.out.println(invitedGuests.size());
        for (String invitedGuest : invitedGuests) {
            System.out.println(invitedGuest);
        }
    }
}
