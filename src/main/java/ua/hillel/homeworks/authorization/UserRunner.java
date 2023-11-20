package ua.hillel.homeworks.authorization;

import java.util.Scanner;

public class UserRunner {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {

        int attempt = 0;
        User user;
        try {
            while (attempt < MAX_ATTEMPTS) {
                attempt++;
                user = createUser();
                if (user != null) {
                    return;
                }
            }
        } finally {
            System.out.println("Thank you that use our service...");
        }
        System.out.println("Unfortunately, user was not created"); // you see this message if user was not created
    }


    private static User createUser() {
        System.out.println("login: ");
        String login = SCANNER.nextLine();
        System.out.println("password: ");
        String password = SCANNER.nextLine();
        System.out.println("password confirmation: ");
        String passwordConfirmation = SCANNER.nextLine();

        try {
            return new User(login, password, passwordConfirmation);
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("ERROR!!! " + exception.getMessage());
        }

        return null;
    }
}
