package spring.crud.CRUD_311.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.crud.CRUD_311.dao.UserDao;
import spring.crud.CRUD_311.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private UserDao userDao;
   @Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public void removeUser(Long id) {
      userDao.removeUser(id);
   }

   @Transactional
   @Override
   public User getUser(Long id) {
      return userDao.getUser(id);
   }

   @Transactional
   @Override
   public User editUser(long id, User updated) {
      return userDao.editUser(id, updated);
   }

   @Transactional
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }
}
