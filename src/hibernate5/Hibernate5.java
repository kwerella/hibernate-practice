
package hibernate5;

import dto.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Hibernate5 {

   
    public static void main(String[] args) {
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
         Student x = new Student();
        x.setFirstname("prajakta");
        x.setLastname("ghorpade");
        
         session.persist(x);
        
        tx.commit();
        session.close();
        
       
        
    }
    
}
