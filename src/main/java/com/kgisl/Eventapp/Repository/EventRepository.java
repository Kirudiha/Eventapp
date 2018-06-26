package com.kgisl.Eventapp.Repository;

import com.kgisl.Eventapp.model.Agenda;
import com.kgisl.Eventapp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

	void save(Agenda agenda);
    
    }