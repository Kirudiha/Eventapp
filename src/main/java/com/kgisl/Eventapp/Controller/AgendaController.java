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

@RequestMapping("/Agenda")
public class AgendaController{
    @Autowired
    private EventService eventService;
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<?> saveEvent(@RequestBody Agenda agenda){
        eventService.saveAgenda(agenda);
        return new ResponseEntity<Agenda>(agenda,HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.GET)
	public List<Event> getEvent() {
		return eventService.findAll();
	}
}