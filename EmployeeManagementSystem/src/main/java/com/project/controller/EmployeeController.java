package com.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Employee;
import com.project.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@RequestMapping("/")
	public String getIndex() {
		return "index.jsp";
	}
	@RequestMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		Employee response=service.save(employee);
		ModelAndView mv = new ModelAndView("addemployee.jsp");
		if(response !=null) {
			mv.addObject("response", "Employee Added Successfully...");
			}
		else {
			mv.addObject("response", "Employee not Added");
		}
		return mv;	
	}	
	@RequestMapping("/findbyid")
	public ModelAndView searchEmployee(@RequestParam Integer id) {
		Employee employee=  service.findById(id);
		ModelAndView mv;
		if(employee.getId()==0) {
			mv=new ModelAndView("searchemployee.jsp");
			mv.addObject("response", "Employee Not Found For Given Id ");
		}
		else {
			mv=new ModelAndView("searchempresult.jsp");
			mv.addObject("employee", employee);	
		}
		return mv;
	}
	@RequestMapping("/findAll")
	public ModelAndView getAllEmployees() {
		List<Employee> employees=service.findAll();
		ModelAndView mv=new ModelAndView("viewempresult.jsp");
		mv.addObject("emplist", employees);
		return mv;	
	}
	@RequestMapping("/editemployee")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		Employee response=service.update(employee);
		ModelAndView mv=new ModelAndView("/findAll");
		return mv;	
	}	
	@RequestMapping("deletebyid")
	public  ModelAndView deleteEmployee(@RequestParam Integer id) {
		service.deleteById(id);	
		ModelAndView mv=new ModelAndView("findAll");
		return mv;
	}
}
	

