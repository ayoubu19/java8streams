package fr.norsys;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        UserService userService=new UserService();
       List<User> users = Stream.of(args).map(User::new).collect(Collectors.toList());
        System.out.println("User Service"+userService.areAllUsersEmailsNotValid(users));
    }
}
