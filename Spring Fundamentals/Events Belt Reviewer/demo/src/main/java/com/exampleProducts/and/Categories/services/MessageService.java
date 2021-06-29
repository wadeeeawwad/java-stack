package com.exampleProducts.and.Categories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exampleProducts.and.Categories.models.Event;
import com.exampleProducts.and.Categories.models.Message;
import com.exampleProducts.and.Categories.repositories.MessageReository;

@Service
public class MessageService {
	final private MessageReository messageReository;
	
	
	
	
	
	public MessageService(MessageReository messageReository) {
		
		this.messageReository = messageReository;
	}





	public Message createmessage(Message message) {
		return messageReository.save(message);

	}
	
    
    public Optional<Message> findById(Long message_id) {
        return messageReository.findById(message_id);
    }
    public List<Message> allMessages() {
    	return (List<Message>) messageReository.findAll();
    }
    public void delete(Long message_id) {
    	messageReository.deleteById(message_id);
    }
    public void update(Message message) {
    	messageReository.save(message);
    }

}




