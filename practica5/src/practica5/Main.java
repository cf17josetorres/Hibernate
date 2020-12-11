package practica5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En primer lugar se obtine la sessión creada por el Singleton.
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		
		//Abrimos sessión e iniciamos una transacción
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Inserto una fila en departamentos");
		//Creamos un nuevo objeto Departamentos y damos valor a sus atributos
		Departamentos dep = new Departamentos();
		dep.setCodDept(4);
		dep.setNombre("MARKETING");
		dep.setDireccion("GUADALAJARA");
		dep.setObjetivos(10000);
		
		//Guardamos en la base de datos y comprometemos la información
		session.save(dep);
		tx.commit();
		session.close();		
	}
}