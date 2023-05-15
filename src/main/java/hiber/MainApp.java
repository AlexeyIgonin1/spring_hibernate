package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.hibernate.Session;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);


//      User user = new User("Ivan", "Mat", "com1@");
//      User user1 = new User("Ivan2", "Mat2", "com2@");
//      User user2 = new User("Ivan3", "Mat3", "com3@");
//      User user3 = new User("Ivan4", "Mat4", "com4@");
//
//      Car car = new Car("CarModel_1", 1);
//      Car car1 = new Car("CarModel_2", 2);
//      Car car2 = new Car("CarModel_3", 3);
//      Car car3 = new Car("CarModel_4", 4);

//      user.setCar(car);
//      user1.setCar(car1);
//      user2.setCar(car2);
//      user3.setCar(car3);

//      userService.add(user);
//      userService.add(user1);
//      userService.add(user2);
//      userService.add(user3);

//      userService.add(new User("User1", "Lastname1", "user1@mail.ru", new Car("CarModel_1", 1)));
//      userService.add(new User("User2", "Lastname2", "user2@mail.ru", new Car("CarModel_2", 2)));
//      userService.add(new User("User3", "Lastname3", "user3@mail.ru", new Car("CarModel_3", 3)));
//      userService.add(new User("User4", "Lastname4", "user4@mail.ru", new Car("CarModel_4", 4)));



//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }
//
//      List<Car> cars = userService.listCars();
//      for(Car car : cars){
//         System.out.println("Id = " + car.getId());
//         System.out.println("Model = " + car.getModel());
//         System.out.println("Series = " + car.getSeries());
//         System.out.println();
//      }
//
      userService.deleteUser(7);
//      userService.deleteUser(6);
//
//      List<User> users = userService.listCarUser();
//      for (User user : users) {
//
//         System.out.println(user.getId()+ " " + user.getLastName() + " " + user.getCar() + "\t");
//      }



//      for (User user : userService.listUsers()) {
//         System.out.println(user + " " + user.getCar());
//      }

//      List<User> users = userService.carUsers("CarModel_1", 1);
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }





      context.close();






   }
}
