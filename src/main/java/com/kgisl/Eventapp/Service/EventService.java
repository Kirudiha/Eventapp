package com.kgisl.Eventapp.Service;

import java.util.List;

import com.kgisl.Eventapp.model.Agenda;
import com.kgisl.Eventapp.model.Event;
public interface EventService {

	public List<Event> findAll();
public void saveAgenda(Agenda agenda);
	public void saveEvent(Event event);

}

