package com.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Jewellery;
import com.project.service.JewelleryService;
@Controller
public class JewelleryController {
	@Autowired
	private JewelleryService service;
	@RequestMapping("/")
	public String getIndex() {
		return "index.jsp";
	}
	@RequestMapping("/save")
	public ModelAndView saveJewellery(@ModelAttribute Jewellery jewellery) {
		Jewellery response=service.save(jewellery);
		ModelAndView mv=new ModelAndView("addjewellery.jsp");
		if(response!=null) {
			mv.addObject("response","jewellery Added Succesfully");
		}
		else {
            mv.addObject("response","jewellery not Added Succesfully");
		}
		return mv;
	}
	@RequestMapping("/findbyid")
	public ModelAndView searcheJewellery(@RequestParam Integer id) {
		Jewellery jewellery=service.findById(id);
		ModelAndView mv;
		if(jewellery.getId() ==0) {
			mv=new ModelAndView("searchejewellery.jsp");
			mv.addObject("response", "Jewellery not found for given id");
		}
		else {
			mv=new ModelAndView("searchejewelleryresult.jsp");
			mv.addObject("jewellery",jewellery );
		}
		return mv;
	}
	@RequestMapping("/findAll")
	public ModelAndView getAllJewelleries() {
		List<Jewellery> jewellery=service.findAll();
		ModelAndView mv=new ModelAndView("viewjewresult.jsp");
		mv.addObject("jewlist", jewellery);
		return mv;
	}
	@RequestMapping("editjewellery")
	public ModelAndView updateJewellery(@ModelAttribute Jewellery jewellery) {
		Jewellery response=service.update(jewellery);
		ModelAndView mv=new ModelAndView("/findAll");
	    return mv;	
	}
	@RequestMapping("deletebyid")
	public ModelAndView deleteJewellery(@RequestParam Integer id) {
		service.deleteById(id);
		ModelAndView mv=new ModelAndView("findAll");
		return mv;
	}
	
	  }
		
		

