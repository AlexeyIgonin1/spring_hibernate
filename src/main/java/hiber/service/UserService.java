package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    public void deleteUser(int id);
    List<User> listUsers();
    List<Car> listCars();
    List<User> listCarUser();
    List<User> carUsers(String model, int series);
}
