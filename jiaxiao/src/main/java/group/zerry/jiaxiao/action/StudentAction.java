package group.zerry.jiaxiao.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.jms.QueueReceiver;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.LifecycleState;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs;

import group.zerry.jiaxiao.entity.Student;
import group.zerry.jiaxiao.service.StudentService;

/**
 * 
 * @author  zhuzirui
 * @content 学生信息相关处理
 */
@Controller  
@Scope("prototype") 
public class StudentAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	// 身份验证
	private String        username;
	private String        userToken;
	
	private Student       student;
	private int           query_id; // student id
	private Student[]     students;

	@Autowired
	private StudentService studentService;

	public String register() {
		boolean result = false;
		try {
			result = studentService.register(student);
		} catch(Exception e) {
			// 
			e.printStackTrace();
			return "error";
		}
		
		if (true == result) {
			return "success";
		} else {
			return "wrong";
		}
	}

	public String showStudentInfo() {
		try {
			students =  studentService.showInfo();
		} catch (Exception e) {
			e.printStackTrace();
			// 写日记 
			return "error";
		}
		return "success";
	}

	public String showStudentById() {		
		// 未传参
		if (0 == query_id) {
			return "error";
		}
		
		try {
			students = new Student[1];
			students[0] = studentService.showInfoById(query_id);
		} catch(Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getQuery_id() {
		return query_id;
	}

	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}
	
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	

}
