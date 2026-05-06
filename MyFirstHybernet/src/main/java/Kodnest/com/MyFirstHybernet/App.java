package Kodnest.com.MyFirstHybernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println( "Enter name and marks");
        Student std = new Student(sc.nextLine(), sc.nextInt());
        
         Configuration conf  = new Configuration().configure("hibernate.cfg.xml");;
         //conf.configure("hibernate.cfg.xml");
         SessionFactory factory=conf.buildSessionFactory();
         
         Session session =factory.openSession();
         
         Transaction tranction = session.beginTransaction();
         
         session.persist(std);
         
         tranction.commit();
         
         session.close();
         factory.close();
         sc.close();
    }
}
