package com.main.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.cjc.model.Student;
import com.main.cjc.repository.HomeRepository;
import com.main.cjc.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	HomeRepository hr;

	@Override
	public Student savedata(Student s) {
		// TODO Auto-generated method stub
		return hr.save(s);
	}

}
