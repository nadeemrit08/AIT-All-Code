package in.nadeem.dao;

import in.nadeem.entities.Loan;

public interface LoanDAO {

	public void saveLoan(Loan loan);

	public Loan fetchLoanDetailsById(Integer loanId);

	public void removeLoan(Integer loanId);

}
