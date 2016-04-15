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

	@Autowired
	private TestDao testDao;

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
		Test test = null;
		for (int i = 0; i < students.length; i++) {
			int state_id = students[i].getState_id();
			if (0 == state_id) {
				students[i].setState("暂无");
			} else {
				test = testDao.selectTestById(students[i].getState_id());
				students[i].setState(test.getState());
			}
		}
		return students;
	}

	@Override
	public Student showInfoById(int id) {
		// TODO Auto-generated method stub
		// 获取学生信息
		Student student = studentDao.selectStudentById(id);

		// 获取学生考试信息
		int state_id = student.getState_id();
		if (0 == state_id) {
			student.setState("暂无");
		} else {
			Test test = testDao.selectTestById(state_id);
			student.setState(test.getState());
		}
		return student;
	}

}
