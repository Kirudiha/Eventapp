package com.kgisl.Eventapp.Service;

import java.util.List;

import com.kgisl.Eventapp.Repository.EventRepository;
import com.kgisl.Eventapp.model.Agenda;
import com.kgisl.Eventapp.model.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImp implements EventService{
    @Autowired
    private EventRepository eventrepository;

	@Override
	public List<Event> findAll() {
		return eventrepository.findAll();
	}

	@Override
	public void saveEvent(Event event) {
		eventrepository.save(event);
	}
	@Override
	public void saveAgenda(Agenda agenda) {
		eventrepository.save(agenda);
	}
}
