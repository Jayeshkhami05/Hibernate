package hibrenate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetchdata {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jayesh");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		/* we can fetch the data in DB we can use a find methods way to this */
		/* we can use class name but retrun type of find method is class info */
		
		Employee employee = entityManager.find(Employee.class, 1);
		
		System.out.println(employee);
	}
}
