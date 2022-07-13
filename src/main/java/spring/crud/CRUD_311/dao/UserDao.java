package spring.crud.CRUD_311.dao;

import spring.crud.CRUD_311.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   void removeUser(Long id);
   User getUser(Long id);
   User editUser(long id, User updated);
   List<User> listUsers();
}
