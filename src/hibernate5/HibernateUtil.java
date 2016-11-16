
package hibernate5;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    
     private static final  SessionFactory sessionFactory = buildSessionFactory();
    
    // static {
     private static SessionFactory buildSessionFactory(){
        try {
         return new Configuration().configure("/hibernate5/hibernate.cfg.xml").buildSessionFactory();
        //Configuration configuration = new Configuration().configure("/hibernate5/hibernate.cfg.xml");
       // StandardServiceRegistry registry = 
       //         new StandardServiceRegistryBuilder()
       //                 .applySettings(configuration.getProperties())
       //                 .build();
       // sessionFactory = configuration.buildSessionFactory(registry);                
        } catch(Exception ex) {
            System.err.println(ex.getMessage());
            throw new ExceptionInInitializerError("SessionFactory initialization failed!");
        }
     }
     
     public static SessionFactory getSessionFactory() {
        return sessionFactory;
}
}