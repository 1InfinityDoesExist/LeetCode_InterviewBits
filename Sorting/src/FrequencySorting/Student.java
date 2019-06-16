package FrequencySorting;

public class Student {
    public String fristName;
    public String email;
    public String lastName;
    public Student() {
	super();
	// TODO Auto-generated constructor stub
    }
    public Student(String fristName, String email, String lastName) {
	super();
	this.fristName = fristName;
	this.email = email;
	this.lastName = lastName;
    }
    public String getFristName() {
        return fristName;
    }
    public void setFristName(String fristName) {
        this.fristName = fristName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((fristName == null) ? 0 : fristName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
	Student other = (Student) obj;
	if (email == null) {
	    if (other.email != null)
		return false;
	} else if (!email.equals(other.email))
	    return false;
	if (fristName == null) {
	    if (other.fristName != null)
		return false;
	} else if (!fristName.equals(other.fristName))
	    return false;
	if (lastName == null) {
	    if (other.lastName != null)
		return false;
	} else if (!lastName.equals(other.lastName))
	    return false;
	return true;
    }
    @Override
    public String toString() {
	return "Student [fristName=" + fristName + ", email=" + email + ", lastName=" + lastName + "]";
    }
    

}
