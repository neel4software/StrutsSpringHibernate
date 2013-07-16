package javaguys.tutorials.actions;

import java.util.ArrayList;
import java.util.List;

import javaguys.tutorials.beans.Student;
import javaguys.tutorials.dao.StudentDao;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CreateBean extends ActionSupport implements ModelDriven<Student> {
	
	private String studentId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String emailId;
	private String gender;
	private String city;

	private Student student = new Student();
	private StudentDao studentDao;
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	public String execute() throws Exception{
			student.setCity(city);
			student.setEmailId(emailId);
			student.setFirstName(firstName);
			student.setGender(gender);
			student.setLastName(lastName);
			student.setMiddleName(middleName);
			student.setPhoneNumber(phoneNumber);
			
			studentDao.saveOrUpdate(student);
			studentList = (ArrayList<Student>) studentDao.getStudents();
			
		return SUCCESS;
		}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}