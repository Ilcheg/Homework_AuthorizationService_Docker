package ru.netology.homework_authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.homework_authorizationservice.authorities.Authorities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepository {
    private String user;
    private String password;

    public UserRepository() {
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (!Objects.equals(user, getUser()) && !Objects.equals(password, getPassword())) {
            return new ArrayList<>();
        }
        return null;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
