package br.net.tiaws.HibernateExample;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("1234");
        stock.setStockName("ASDF");
        
        session.save(stock);
        session.getTransaction().commit();
    }
}
