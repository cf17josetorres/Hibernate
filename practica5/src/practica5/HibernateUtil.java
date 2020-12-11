package practica5;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		// TODO Auto-generated method stub
		try {
			return new Configuration().configure().
					buildSessionFactory(new StandardServiceRegistryBuilder().
					configure().build());
		}
		catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation faildes."+ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;		
	}
}
