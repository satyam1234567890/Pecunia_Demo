
public interface EmployeeService {
	
	public void addEmployee(EmployeeCredentials e) throws UserException;
	
	pulic void addBranch(BranchDetails branchdetails )throws UserException;

	public void resetPassword(String employeeId, String mobileNumber, String employeePassword) throws UserException;

	public void updateEmployeeDetailsService(String username, String mobileNumber, Address address) throws UserException;

	

}