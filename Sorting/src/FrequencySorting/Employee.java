package FrequencySorting;

public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private int roolNumber;

    public Employee() {

    }

    public Employee(String firstName, String lastName, int roolNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.roolNumber = roolNumber;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public int getRoolNumber() {
	return roolNumber;
    }

    public void setRoolNumber(int roolNumber) {
	this.roolNumber = roolNumber;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	result = prime * result + roolNumber;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Employee other = (Employee) obj;
	if (firstName == null) {
	    if (other.firstName != null)
		return false;
	} else if (!firstName.equals(other.firstName))
	    return false;
	if (lastName == null) {
	    if (other.lastName != null)
		return false;
	} else if (!lastName.equals(other.lastName))
	    return false;
	if (roolNumber != other.roolNumber)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", roolNumber=" + roolNumber + "]";
    }

    @Override
    public int compareTo(Employee arg0) {
	return this.firstName.compareTo(arg0.firstName);
    }

}
