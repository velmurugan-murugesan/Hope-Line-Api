package com.teama.helpline.repository

import com.teama.helpline.entity.Incident
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IncidentRepository : JpaRepository<Incident, Long>