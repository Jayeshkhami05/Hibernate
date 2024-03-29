package hibrenate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updates {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jayesh");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		/* To update specific data */
		// Employee employee = entityManager.find(Employee.class, 1);
		// employee.setPassword("7057");

		/* To update all data in this way */
		Employee employee = new Employee();
		employee.setName("mivaan");
		employee.setId(4);
		employee.setEmail("mivaankhami@gmail.com");
		employee.setPassword("9834");
		employee.setPhone(45641230l);

		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
	}
}
