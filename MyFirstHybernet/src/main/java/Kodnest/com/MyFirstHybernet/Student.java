package Kodnest.com.MyFirstHybernet;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     int rollNo;
	@Column
     String Sname;
	@Column
     int marks;
     
     public Student() {
    	 
     }

	 /**
 	 * @param rollNo
 	 * @param sname
 	 * @param marks
 	 */
	 public Student(int rollNo, String sname, int marks) {
		super();
		this.rollNo = rollNo;
		Sname = sname;
		this.marks = marks;
	 }

	 /**
 	 * @param sname
 	 * @param marks
 	 */
	 public Student(String sname, int marks) {
		super();
		Sname = sname;
		this.marks = marks;
	 }

	 public int getRollNo() {
		 return rollNo;
	 }

	 public void setRollNo(int rollNo) {
		 this.rollNo = rollNo;
	 }

	 public String getSname() {
		 return Sname;
	 }

	 public void setSname(String sname) {
		 Sname = sname;
	 }

	 public int getMarks() {
		 return marks;
	 }

	 public void setMarks(int marks) {
		 this.marks = marks;
	 }

	 @Override
	 public String toString() {
		return "Student [rollNo=" + rollNo + ", Sname=" + Sname + ", marks=" + marks + "]";
	 }

	 @Override
	 public int hashCode() {
		return Objects.hash(Sname, marks, rollNo);
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
		return Objects.equals(Sname, other.Sname) && marks == other.marks && rollNo == other.rollNo;
	 }
     
	 
     
     
      
}
