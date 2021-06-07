package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicservice;
	
	/*@RequestMapping("/topics")
	public List<Topic> getAllTopic(){
		return Arrays.asList(new Topic("Spring","spring framework","spring framework description"),
				new Topic("java","core java","core java description"),
				new Topic("javascript","JavaScript","javascript description")
		);
		
	}*/
	
	
	
	/*@RequestMapping("/topics")
	public List<Topic>getAllTopics(){
		return topicservice.getAllTopics();
		
	}*/
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic( @PathVariable String id){
		return topicservice.getTopic(id);
		
	}
	

}
