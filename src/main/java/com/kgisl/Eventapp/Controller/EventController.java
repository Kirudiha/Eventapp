package com.kgisl.Eventapp.Controller;

import java.util.List;

import com.kgisl.Eventapp.Service.EventService;
import com.kgisl.Eventapp.model.Agenda;
import com.kgisl.Eventapp.model.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")

@RequestMapping("/Event")
public class EventController{
    @Autowired
    private EventService eventService;
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<?> saveEvent(@RequestBody Event event){
        eventService.saveEvent(event);
        return new ResponseEntity<Event>(event,HttpStatus.OK);
    }
    public ResponseEntity<?> saveAgenda(@RequestBody Event event){
        eventService.saveEvent(event);
        return new ResponseEntity<Event>(event,HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.GET)
	public List<Event> getEvent() {
		return eventService.findAll();
	}
}