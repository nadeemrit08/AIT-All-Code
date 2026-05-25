package in.nadeem.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.nadeem.dao.LoanDAO;
import in.nadeem.entities.Loan;

public class LoanDAOImpl implements LoanDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveLoan(Loan loan) {
		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		try {

			entityManager.merge(loan);
			transaction.commit();
			System.out.println("Loan Object is persisted successfully...!!!");

		} catch (Exception e) {

			transaction.rollback();
			e.printStackTrace();

		} finally {
			entityManager.close();
		}
	}

	@Override
	public Loan fetchLoanDetailsById(Integer loanId) {

		EntityManager entityManager = factory.createEntityManager();

		Loan loan = entityManager.find(Loan.class, loanId);
		
		/*
		 * //if u want to use fetchType.Lazy 
		 * loan.getCustomer().getCustomerName();
		 */
		entityManager.close();

		return loan;
	}

	@Override
	public void removeLoan(Integer loanId) {

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		try {

			Loan loan = entityManager.find(Loan.class, loanId);

			entityManager.remove(loan);

			transaction.commit();

			System.out.println("Loan Object is deleted...Successfully");

		} catch (Exception e) {
			
			transaction.rollback();
			e.printStackTrace();
			
		} finally {
			entityManager.close();
		}
	}

}
