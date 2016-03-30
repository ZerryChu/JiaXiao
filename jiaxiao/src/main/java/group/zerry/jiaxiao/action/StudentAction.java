package group.zerry.jiaxiao.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs;

import group.zerry.jiaxiao.entity.Student;
import group.zerry.jiaxiao.service.StudentService;

@Controller
@Scope("prototype") 
public class StudentAction extends ActionSupport {
	
	private Student student;
	private int     id; // student id

	@Autowired
	private StudentService studentService;
	
	public String register() {
		if (studentService.register(student)) {
			return "success";
		} else {
			return "wrong";
		}
	}

	public void showStudentInfo() {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = null;
		try {
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			String info = JSON.toJSONString(studentService.showInfo());
			out.write(info.toCharArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
	}

	public void showStudentById() {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = null;
		try {
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			String info = JSON.toJSONString(studentService.showInfoById(id));
			out.write(info.toCharArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
