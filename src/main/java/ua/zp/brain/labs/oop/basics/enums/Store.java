package ua.zp.brain.labs.oop.basics.enums;

import java.util.Arrays;
import java.util.Objects;

public class Store {
    private String nameShop;
    private String urlShop;
    private User[] arrUsers;
    private User authorizedUser;

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getUrlShop() {
        return urlShop;
    }

    public void setUrlShop(String urlShop) {
        this.urlShop = urlShop;
    }

    public User[] getArrUsers() {
        return arrUsers;
    }

    public void setArrUsers(User[] arrUsers) {
        this.arrUsers = arrUsers;
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    public boolean switchLogin(String login, String password) {
        for (int i = 0; i < arrUsers.length; i++) {
            if (login.equalsIgnoreCase(arrUsers[i].getLogin())
                    && password.equals(arrUsers[i].getPassword())) {

                return true;
            }
        }
        return false;
    }


    void getCurrentUserRights(User... arrUsers) {
        for (int i = 0; i < arrUsers.length; i++) {
            if (arrUsers[i].getRole() == Role.DIRECTOR) {
                System.out.println("Директор магазина, может управлять кадрами, и ценами");
            } else if (arrUsers[i].getRole() == Role.ADMIN) {
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
            } else if (arrUsers[i].getRole() == Role.MANAGER) {
                System.out.println("Менеджер магазина, может общаться с клиентами");
            } else if (arrUsers[i].getRole() == Role.CLIENT) {
                System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
            } else if (arrUsers[i].getRole() == Role.ANONIMOUS) {
                System.out.println("Анонимный пользователь, может покупать товары и\\или авторизоваться");
            }

        }
    }

    void logout() {
        this.authorizedUser = null;
        System.out.println("Пользователь вышел из системы");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Store)) return false;
        Store store = (Store) o;
        return Objects.equals(getNameShop(), store.getNameShop()) &&
                Objects.equals(getUrlShop(), store.getUrlShop()) &&
                Arrays.equals(getArrUsers(), store.getArrUsers()) &&
                Objects.equals(getAuthorizedUser(), store.getAuthorizedUser());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNameShop(), getUrlShop(), getAuthorizedUser());
        result = 31 * result + Arrays.hashCode(getArrUsers());
        return result;
    }
}
