package group.zerry.jiaxiao.service;

import group.zerry.jiaxiao.entity.Student;

public interface StudentService {
	public boolean register(Student stu);
	
	public Student[] showInfo();

	public Student showInfoById(int id);
	
}
