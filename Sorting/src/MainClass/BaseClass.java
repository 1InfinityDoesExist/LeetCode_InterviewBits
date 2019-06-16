package MainClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import FrequencySorting.Employee;
import FrequencySorting.Student;

public class BaseClass {
    public static void main(String[] args) {
	
	
	ArrayList<Employee> emp = new ArrayList<Employee>();
	emp.add(new Employee("Avinash", "Patel", 102));
        emp.add(new Employee("Ritika", "Raut", 102));
        emp.add(new Employee("Khanna", "DevSing", 102));
        emp.add(new Employee("Rajkumar", "Hashan", 102));
        emp.add(new Employee("Faizal", "Khan", 102));
	
	System.out.println(emp);
	Collections.sort(emp);
	System.out.println("After sorting");
	System.out.println(emp);
	
	ArrayList<Student> student = new ArrayList<Student>();
	student.add(new Student("Avinash", "yahoo@gmail.com", "Patel"));
	student.add(new Student("Avinash", "gahoo@gmail.com", "Patel"));
	student.add(new Student("Kvinash", "tahoo@gmail.com", "Patel"));
	student.add(new Student("Svinash", "hahoo@gmail.com", "Patel"));
	student.add(new Student("Rvinash", "zahoo@gmail.com", "Patel"));
	
	
	for(int iter = 0; iter < student.size(); iter++) {
	    System.out.println(student.get(iter).getFristName());
	}
	System.out.println(student);
	Comparator<Student> studentComparator = new Comparator<Student>() {
	    public int compare(Student s1, Student s2) {
		int x = s1.fristName.compareTo(s2.fristName);
		return x != 0 ? x : s1.email.compareTo(s2.email);
	    }
	};
	Collections.sort(student, studentComparator);
	for(int iter = 0; iter < student.size(); iter++) {
	    System.out.println(student.get(iter).getFristName()+ " " + student.get(iter).getEmail());
	}
	
	
	
	//HashCode Comparison because hashCode is same...it removes duplicate...!!!
	Set<Student> arrayList = new HashSet<Student>();
	arrayList.add(new Student("Avinash", "email", "patel"));
	arrayList.add(new Student("Avinash", "email", "patel"));
	for(int iter = 0; iter < arrayList.size(); iter++) {
	    System.out.println(arrayList);
	}
	
    }
}
