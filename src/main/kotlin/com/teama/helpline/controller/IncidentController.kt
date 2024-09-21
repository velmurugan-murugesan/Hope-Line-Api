package com.teama.helpline.controller

import com.teama.helpline.entity.Incident
import com.teama.helpline.repository.IncidentRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class IncidentController(private val incidentRepository: IncidentRepository) {

    @GetMapping("/incidents")
    fun getAllIncidents() : List<Incident> {
        return incidentRepository.findAll()
    }

    @PostMapping("/incidents")
    fun saveIncident(@RequestBody incident: Incident) : Incident {
        return incidentRepository.save(incident)
    }
}