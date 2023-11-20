package ua.hillel.homeworks.authorization;

public class User {
    private static final int LOGIN_MAX_LENGTH = 20;
    private static final int PASSWORD_MIN_LENGTH = 6;
    private static final int PASSWORD_MAX_LENGTH = 25;

    private String login;
    private String password;

    public User(String login, String password, String passwordConfirmation) {
        validateLogin(login);
        validatePassword(password, passwordConfirmation);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void validateLogin(String login) {
        if (login == null || login.length() == 0) {
            throw new WrongLoginException("Login is null or empty");
        }
        if (login.length() > LOGIN_MAX_LENGTH) {
            throw new WrongLoginException("Login is too long. Max length is " + LOGIN_MAX_LENGTH);
        }

        for (int i = 0; i < login.length(); i++) {
            char character = login.charAt(i);
            if ((('a' > character || character > 'z') && ('A' > character || character > 'Z'))) {
                throw new WrongLoginException("Login contains illegal character: " + character);
            }
        }
    }

    private void validatePassword(String password, String passwordConfirmation) {
        if (password == null) {
            throw new WrongPasswordException("Password is null");
        }
        if (password.length() < PASSWORD_MIN_LENGTH) {
            throw new WrongPasswordException("Password is too small. Min length is " + PASSWORD_MIN_LENGTH);
        }
        if (password.length() > PASSWORD_MAX_LENGTH) {
            throw new WrongPasswordException("Password is too long. Max length is " + PASSWORD_MAX_LENGTH);
        }
        if (!password.equals(passwordConfirmation)) {
            throw new WrongPasswordException("Password and confirmation are different");
        }
        int letters = 0;
        int numbers = 0;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (('a' <= character && character <= 'z') || ('A' <= character && character <= 'Z')) {
                letters++;
            } else if ('0' <= character && character <= '9') {
                numbers++;
            }
        }
        if (letters == 0 || numbers == 0) {
            throw new WrongPasswordException("Password must contains letter and numbers");
        }
    }
}
