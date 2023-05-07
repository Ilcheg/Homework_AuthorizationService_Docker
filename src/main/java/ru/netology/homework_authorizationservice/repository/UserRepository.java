package ru.netology.homework_authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.homework_authorizationservice.users.User;
import ru.netology.homework_authorizationservice.authorities.Authorities;

import java.util.*;

@Repository
public class UserRepository {
    List<User> userList = new ArrayList<>();

    public UserRepository() {
        userList.add(new User("Sergei", "1234", List.of(Authorities.WRITE, Authorities.DELETE)));
        userList.add(new User("Pavel", "5555", List.of(Authorities.READ)));
        userList.add(new User("Daria", "7777", List.of(Authorities.values())));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (User someUser : userList) {
            if (someUser.getLogin().equals(user) && someUser.getPassword().equals(password)) {
                return someUser.getAuthorities();
            }
        }
        return Collections.emptyList();
    }
}
