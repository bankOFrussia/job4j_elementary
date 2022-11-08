package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean on = true;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                on = false;
                return user;
            }
        }
        if (on) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsente");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException exception) {
            exception.printStackTrace();
        } catch (UserNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
