package com.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics=Arrays.asList(new Topic("Spring","spring framework","spring framework description"),
			new Topic("java","core java","core java description"),
			new Topic("Angular","Angular","Angular description")
	);
	
	/*private List<Topic> topics= new ArrayList<Topic>( Arrays.asList(new Topic("Spring","spring framework","spring framework description"),
			new Topic("java","core java","core java description"),
			new Topic("javascript","JavaScript","javascript description")
	));
	*/
	public List<Topic> getAllTopics(){
		return topics;
		
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
}
