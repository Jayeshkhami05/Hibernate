package hibrenate;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetchdataallindb {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jayesh");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		/* we can fetch all the data in Db we use a query method jbql 
		 *   */
		
		Query query = entityManager.createQuery("SELECT e FROM Employee e");

		List<Employee> employees = query.getResultList();

		System.out.println(employees);

	}
}
