package com.exampleProducts.and.Categories.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exampleProducts.and.Categories.models.Event;
import com.exampleProducts.and.Categories.models.User;
import com.exampleProducts.and.Categories.services.EventService;
import com.exampleProducts.and.Categories.services.MessageService;
import com.exampleProducts.and.Categories.services.UserService;

@Controller
public class EventController {
	private final EventService eventService;
	private final MessageService messageService;
	private final UserService userService;

	public EventController(EventService eventService, MessageService messageService, UserService userService) {

		this.eventService = eventService;
		this.messageService = messageService;
		this.userService = userService;
	}

	@RequestMapping("/events")
	public String eventshomepage(HttpSession session, Model model, @ModelAttribute("event") Event events) {
		Long userId = (Long) session.getAttribute("user_Id");
		User user = userService.findUserById(userId);
		model.addAttribute("user", user);
		String state = user.getState();
		List<Event> eventIn = eventService.eventInState(state);
		model.addAttribute("eventIn", eventIn);
		List<Event> eventNotInState = eventService.eventNotInState(state);
		model.addAttribute("eventNotInState", eventNotInState);
		return "/events.jsp";
	}

	@RequestMapping(value = ("/events"), method = RequestMethod.POST)
	public String addEvent(@Valid @ModelAttribute("event") Event event, BindingResult result, Model model, HttpSession session) {
		if (result.hasErrors()) {
			return "/events.jsp";
		} else {
			Long id = (Long) session.getAttribute("user_Id");
			User user = userService.findUserById(id);
			event.setHostess(user);
			eventService.createevent(event);

		}
		return "redirect:/events" ;
	}
	
	@RequestMapping("/events/{event_id}")
	public String showEvent(Model model, @PathVariable("event_id")Long event_id, HttpSession session) {
		session.setAttribute("event_id", event_id);
		Event thisevent=eventService.findEventById(event_id);
		model.addAttribute("thisevent" ,thisevent);
		
		return "/showEvent.jsp";
		
	}
	
//	@RequestMapping(value = ("/eee"), method = RequestMethod.POST)
//	public String addmessage(@PathVariable("id") Long id,@Valid @RequestParam("comment") String comment, BindingResult result, HttpSession session, Model model) {
//		if (result.hasErrors()) {
//			return "/showEvent.jsp";
//		} else {
//			
//			Long userId = (Long) session.getAttribute("user_Id");
//			User user = userService.findUserById(userId);
//			Event event=eventService.findEventById(userId);
//			
//			
//			
//			event.setMessage(message);
//			messageService.createmessage(message);
//	}
	
	}