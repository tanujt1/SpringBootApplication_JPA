package com.tanuj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicDAO topicDao;

	// Getting all the topics
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicDao.findAll().forEach(topics::add);
		return topics;
	}

	// Getting a particular topic
	public Topic getTopic(Integer id) {
		return topicDao.findOne(id);

	}

	// Adding a topic
	public void addTopic(Topic topic) {
		topicDao.save(topic);

	}

	// Deleting a topic
	public void deleteTopic(Integer id) {
		topicDao.delete(id);

	}

	// Updating a topic
	public void updateTopic(Integer id, Topic topic) {
		topicDao.save(topic);

	}

}
