package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.zerry.jiaxiao.dao.StudentDao;
import group.zerry.jiaxiao.dao.TestDao;
import group.zerry.jiaxiao.entity.Student;
import group.zerry.jiaxiao.entity.Test;
import group.zerry.jiaxiao.service.StudentService;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public boolean register(Student stu) {
		// TODO Auto-generated method stub
		try {
			studentDao.addStudent(stu);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Student[] showInfo() throws Exception {
		// TODO Auto-generated method stub
		Student[] students = studentDao.selectStudents();
		return students;
	}

	@Override
	public Student showInfoById(int id) {
		// TODO Auto-generated method stub
		// 获取学生信息
		Student student = studentDao.selectStudentById(id);
		return student;
	}

	@Override
	public boolean deleteStudent(int stu_id) throws Exception {
		// TODO Auto-generated method stub
		try {
			studentDao.deleteStudent(stu_id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
