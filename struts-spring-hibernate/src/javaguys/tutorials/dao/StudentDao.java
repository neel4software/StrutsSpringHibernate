package javaguys.tutorials.dao;

import java.util.List;

import javaguys.tutorials.beans.Student;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	public void saveOrUpdate(Student student) {
		hibernateTemplate.save(student);
	}
	public List<Student> getStudents() {
		return hibernateTemplate.loadAll(Student.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
