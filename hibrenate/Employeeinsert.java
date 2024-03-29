package hibrenate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Employeeinsert {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("Sudhir");
		employee.setEmail("Sudhirhanchate@gmail.com");
		employee.setPassword("2001");
		employee.setPhone(949372320887l);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jayesh");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}
