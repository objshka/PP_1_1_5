package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Sasha", "Maksimov", (byte) 30);
        userService.saveUser("Kolya", "Ershov", (byte) 45);
        userService.saveUser("Nastya", "Markina", (byte) 18);
        userService.saveUser("Sveta", "Egorova", (byte) 24);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
