package spring.crud.CRUD_311.service;

import spring.crud.CRUD_311.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void removeUser(Long id);
    User getUser(Long id);
    User editUser(long id, User updated);
    List<User> listUsers();
}
