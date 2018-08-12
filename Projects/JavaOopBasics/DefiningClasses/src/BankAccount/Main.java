package BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, BankAccount> accounts = new HashMap<>();

        String input = reader.readLine();
        while (!"End".equals(input)) {
            String[] commandArgs = input.split(" ");

            String command = commandArgs[0];
            int id = Integer.parseInt(commandArgs[1]);

            switch (command) {
                case "Create":
                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists");
                    } else {
                        BankAccount ba = new BankAccount();
                        ba.setId(id);
                        accounts.put(id, ba);
                    }
                    break;
                case "Deposit":
                    double depositAmount = Double.parseDouble(commandArgs[2]);

                    if (accounts.get(id) == null) {
                        System.out.println("Account does not exist");
                        break;
                    }

                    accounts.get(id).deposit(depositAmount);
                    break;
                case "Withdraw":
                    double withdrawAmount = Double.parseDouble(commandArgs[2]);
                    BankAccount acc = accounts.get(id);

                    if (acc != null) {
                        if (acc.getBalance() < withdrawAmount) {
                            System.out.println("Insufficient balance");
                        } else {
                            acc.withdraw(withdrawAmount);
                        }
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "Print":
                    if (accounts.get(id) == null) {
                        System.out.println("Account does not exist");
                        break;
                    }

                    System.out.println(accounts.get(id));
                    break;
            }


            input = reader.readLine();
        }

    }
}
