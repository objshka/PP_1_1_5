package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Petrov", (byte) 1);
        userService.saveUser("Danya", "Petrov", (byte) 2);
        userService.saveUser("Vasya", "Petrov", (byte) 3);
        userService.saveUser("Rome", "Petrov", (byte) 4);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }

}
