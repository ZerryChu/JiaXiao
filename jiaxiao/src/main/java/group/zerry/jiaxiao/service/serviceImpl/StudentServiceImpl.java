package group.zerry.jiaxiao.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.zerry.jiaxiao.dao.StudentDao;
import group.zerry.jiaxiao.entity.Student;
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
	public Student[] showInfo() {
		// TODO Auto-generated method stub
		return studentDao.selectStudents();
	}

	@Override
	public Student showInfoById(int id) {
		// TODO Auto-generated method stub
		return studentDao.selectStudentById(id);
	}

}
