package com.tanuj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	// Getting all the topics
	@RequestMapping("/getAllTopics")
	public List<Topic> getAllTopics() {
		List<Topic> allTopics = topicService.getAllTopics();
		return allTopics;
	}

	// Getting a particular topic
	@RequestMapping("/getTopic/{id}")
	public Topic getTopic(@PathVariable Integer id) {
		Topic getTopic = topicService.getTopic(id);
		return getTopic;
	}

	// Adding a topic
	@RequestMapping("/addTopic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);

	}

	// Deleting a topic
	@RequestMapping("/deleteTopic/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		topicService.deleteTopic(id);

	}

	// Updating a topic
	@RequestMapping("/updateTopic/{id}")
	public void updateTopic(@PathVariable Integer id, @RequestBody Topic topicVO) {
		topicService.updateTopic(id, topicVO);

	}

}
