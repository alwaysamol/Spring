package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.model.User;
import com.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	private StudentService service;

	@RequestMapping("/")
	public String landingPage() {
		return "index";
	}

	@RequestMapping("/register")
	public String registerPage() {
		System.out.println("Register Page Called..!");
		return "register";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/login-check")
	public String loginCheck(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
		List<Student> sList = service.loginCheck(username, password);
		
		System.out.println(sList);

		if (!sList.isEmpty()) {
			session.setAttribute("username", username);
			model.addAttribute("data", sList);
			return "success";
		} else {
			
			return "login";
		}

	}

	@RequestMapping("/save-student")
	public String saveStudent(@ModelAttribute Student stu) {
		System.out.println("Student in Controller:" + stu);
		service.saveStudent(stu);
		return "register";
	}
	
	@RequestMapping("/delete-student")
	public String deleteStudent(@RequestParam int sid, Model model)
	{
		List<Student> sList = service.deleteById(sid);
		
		if (!sList.isEmpty()) {
			model.addAttribute("data", sList);
			return "success";
		} else {
			return "login";
		}
	}
	
	@RequestMapping("/getStudentById")
	public String getStudentById(@RequestParam int sid, Model model)
	{
		Student stu = service.getStudentById(sid);
		System.out.println("Student for update:"+stu);
		model.addAttribute("data", stu);
		return "update";
	}
	
	@RequestMapping("/update-student")
	public String updateStudent(@ModelAttribute Student stu, Model model)
	{
		System.out.println("Update STudent in controller"+stu);
		List<Student> sList = service.updateStudent(stu);
		if (!sList.isEmpty()) {
			model.addAttribute("data", sList);
			return "success";
		} else {
			return "login";
		}
	}
	
	@RequestMapping("/search-record")
	public String searchStudent(@RequestParam String record, Model model)
	{
		List<Student> sList = service.searchData(record);
		if (!sList.isEmpty()) {
			model.addAttribute("data", sList);
			return "success";
		} else {
			return "login";
		}
	}
	
	@RequestMapping("/refresh-page")
	public String refreshPage(Model model)
	{
		List<Student> sList = service.refreshPage();
		if (!sList.isEmpty()) {
			model.addAttribute("data", sList);
			return "success";
		} else {
			return "login";
		}
	}
	
	@RequestMapping("/signup-page")
	public String signUpPage()
	{
		return "signup";
	}
	
	@RequestMapping("/register-user")
	public String registerUser(@ModelAttribute User user)
	{
		service.registerUser(user);
		return "login";
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate(); // Destroys session
	    return "redirect:/login"; // Redirect to login page
	}

}