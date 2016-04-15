package group.zerry.jiaxiao.service;

import group.zerry.jiaxiao.entity.Student;

public interface StudentService {
	public boolean register(Student stu) throws Exception;
	
	public Student[] showInfo() throws Exception;

	public Student showInfoById(int id) throws Exception;
	
}
