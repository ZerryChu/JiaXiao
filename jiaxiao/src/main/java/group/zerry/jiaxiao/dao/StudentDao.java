package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.Student;

public interface StudentDao {
	Student[] selectStudents(); 
	
	Student   selectStudentById(int id);
	
	void      addStudent(Student stu);
}
