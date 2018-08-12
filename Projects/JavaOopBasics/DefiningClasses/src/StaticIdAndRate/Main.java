package StaticIdAndRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, BankAccount> accounts = new HashMap<>();

        String line = reader.readLine();
        while (!"End".equals(line)) {
            String[] commandArgs = line.split(" ");

            switch (commandArgs[0]) {
                case "Create":
                    BankAccount acc = new BankAccount();
                    accounts.put(acc.getId(), acc);
                    System.out.printf("Account ID%d created%n", acc.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(commandArgs[1]);
                    double amount = Double.parseDouble(commandArgs[2]);

                    try {
                        accounts.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    } catch (Exception ex) {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterest(Double.parseDouble(commandArgs[1]));
                    break;
                case "GetInterest":
                    try {
                        System.out.printf("%.2f%n",
                                accounts.get(Integer.parseInt(commandArgs[1]))
                                        .getInterestRate(Integer.parseInt(commandArgs[2])));
                    } catch (Exception ex) {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            line = reader.readLine();
        }
    }
}
