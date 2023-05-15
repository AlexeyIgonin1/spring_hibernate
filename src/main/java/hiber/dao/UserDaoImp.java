package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {


   private final SessionFactory sessionFactory;
   @Autowired
   public UserDaoImp(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
   }


   @Override
   @Transactional
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   @Transactional
   public void deleteUser(int id){
      try(Session session = sessionFactory.openSession()){
         Transaction transaction = session.beginTransaction();
         session.delete(session.get(User.class, id));
         transaction.commit();
         System.out.println("Delete person " + id);
      } catch(HibernateException e){
         e.printStackTrace();
      }

   }

   @Override
   @SuppressWarnings("unchecked")
   @Transactional
   public List<User> listUsers() {
      Session session = sessionFactory.getCurrentSession();
      TypedQuery<User> query=session.createQuery("from User");
      return query.getResultList();
   }

   @Override
   @Transactional
   public List<Car> listCars(){
      Session session = sessionFactory.getCurrentSession();
      TypedQuery<Car> query = session.createQuery("from Car");
      return query.getResultList();
   }

   @Override
   @Transactional
   public List<User> listCarUser(){
      Session session = sessionFactory.getCurrentSession();
      TypedQuery<User> query = session.createQuery("from User");
      return query.getResultList();
   }
   @Override
   @Transactional
   public List<User> carUsers(String model, int series){
      Session session = sessionFactory.getCurrentSession();
      TypedQuery<User> query = session.createQuery(
              "from User where car.model = :model and car.series = :series");
      query.setParameter("model", model);
      query.setParameter("series", series);
      return query.getResultList();

   }


}
