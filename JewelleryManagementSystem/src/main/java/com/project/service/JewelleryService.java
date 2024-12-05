package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Jewellery;
import com.project.repository.JewelleryRepository;
@Service
public class JewelleryService {
	@Autowired
	private JewelleryRepository repository;
	public Jewellery save(Jewellery jewellery) {
        return repository.save(jewellery);
	}
	public Jewellery findById(Integer id) {
		return repository.findById(id).orElse(new Jewellery());
	}
	public List<Jewellery> findAll() {
		return repository.findAll();
	}
	public Jewellery update(Jewellery jewellery) {
		return repository.save(jewellery);
		
		
	}
	public void deleteById(Integer id) {
       repository.deleteById(id);		
	}
	
}
