package ua.zp.brain.labs.oop.basics.enums;

import java.util.Objects;

public class User {

    private String login;
    private String password;
    private String name;
    private Role role = Role.ANONIMOUS;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login.toLowerCase();
        this.password = password;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getName(), user.getName()) &&
                getRole() == user.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword(), getName(), getRole());
    }

    @Override
    public String toString() {
        return "\n" + "User: " + name
                + ", login " + login
                + ", role " + role;
    }
}

