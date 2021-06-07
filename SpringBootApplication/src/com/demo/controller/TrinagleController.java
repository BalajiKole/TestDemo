package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrinagleController {

	@RequestMapping(value="/students")
	public List<String> getStudentsNames(){
		
			List<String> studList=new ArrayList<String>();
			studList.add("Balji");
			studList.add("Kole");
			return studList;
	}
}
