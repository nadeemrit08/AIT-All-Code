package in.nadeem;

import in.nadeem.dao.LoanDAO;
import in.nadeem.dao.imp.LoanDAOImpl;
import in.nadeem.entities.Customer;
import in.nadeem.entities.Loan;

public class App {
	public static void main(String[] args) {

		LoanDAO dao = new LoanDAOImpl();
		/*
		 * Loan personalLoan = new Loan(); personalLoan.setLoanId(101);
		 * personalLoan.setLoanType("PERSONAL LOAN"); personalLoan.setAmount(500000.0);
		 * 
		 * Loan homeLoan = new Loan(); homeLoan.setLoanId(102);
		 * homeLoan.setLoanType("HOME LOAN"); homeLoan.setAmount(2500000.0);
		 * 
		 * Loan carLoan = new Loan(); carLoan.setLoanId(103);
		 * carLoan.setLoanType("CAR LOAN"); carLoan.setAmount(800000.0);
		 * 
		 * Loan educationLoan = new Loan(); educationLoan.setLoanId(104);
		 * educationLoan.setLoanType("EDUCATION LOAN");
		 * educationLoan.setAmount(600000.0);
		 * 
		 * Loan goldLoan = new Loan(); goldLoan.setLoanId(105);
		 * goldLoan.setLoanType("GOLD LOAN"); goldLoan.setAmount(300000.0);
		 * 
		 * Loan businessLoan = new Loan(); businessLoan.setLoanId(106);
		 * businessLoan.setLoanType("BUSINESS LOAN"); businessLoan.setAmount(5000000.0);
		 * 
		 * Loan agricultureLoan = new Loan(); agricultureLoan.setLoanId(107);
		 * agricultureLoan.setLoanType("AGRICULTURE LOAN");
		 * agricultureLoan.setAmount(1200000.0);
		 * 
		 * Loan vehicleLoan = new Loan(); vehicleLoan.setLoanId(108);
		 * vehicleLoan.setLoanType("VEHICLE LOAN"); vehicleLoan.setAmount(900000.0);
		 * 
		 * Loan propertyLoan = new Loan(); propertyLoan.setLoanId(109);
		 * propertyLoan.setLoanType("PROPERTY LOAN"); propertyLoan.setAmount(3500000.0);
		 * 
		 * Loan mortgageLoan = new Loan(); mortgageLoan.setLoanId(110);
		 * mortgageLoan.setLoanType("MORTGAGE LOAN"); mortgageLoan.setAmount(7000000.0);
		 * 
		 * Customer customer = new Customer(); customer.setCustomeId(101);
		 * customer.setCustomerName("Nadeem Ahmad");
		 * 
		 * personalLoan.setCustomer(customer); homeLoan.setCustomer(customer);
		 * carLoan.setCustomer(customer); educationLoan.setCustomer(customer);
		 * goldLoan.setCustomer(customer); businessLoan.setCustomer(customer);
		 * agricultureLoan.setCustomer(customer); vehicleLoan.setCustomer(customer);
		 * propertyLoan.setCustomer(customer); mortgageLoan.setCustomer(customer);
		 * 
		 * dao.saveLoan(personalLoan); dao.saveLoan(homeLoan); dao.saveLoan(carLoan);
		 * dao.saveLoan(educationLoan); dao.saveLoan(goldLoan);
		 * dao.saveLoan(businessLoan); dao.saveLoan(agricultureLoan);
		 * dao.saveLoan(vehicleLoan); dao.saveLoan(propertyLoan);
		 * dao.saveLoan(mortgageLoan);
		 */
		
		
		/*
		 * Loan fetchLoanDetailsById = dao.fetchLoanDetailsById(105);
		 * System.out.println(fetchLoanDetailsById); Customer customer =
		 * fetchLoanDetailsById.getCustomer(); System.out.println(customer);
		 */
		
		dao.removeLoan(105);

	}
}
