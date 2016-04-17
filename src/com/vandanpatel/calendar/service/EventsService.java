package com.vandanpatel.calendar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vandanpatel.calendar.dao.EventDAO;
import com.vandanpatel.calendar.model.Event;

@Service("eventsService")
public class EventsService {

	private EventDAO eventsDAO;

	@Autowired
	public void setEventsDAO(EventDAO eventsDAO) {
		this.eventsDAO = eventsDAO;
	}
	
	public List<Event> getCurrent(){
		return eventsDAO.getEvents();
	}
}