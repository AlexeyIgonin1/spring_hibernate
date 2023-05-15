package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   public void deleteUser(int id);
   List<User> listUsers();
   List<Car> listCars();
   List<User> listCarUser();
   List<User> carUsers(String model, int series);
}
