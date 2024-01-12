package com.example.techlab.repositories;

import com.example.techlab.entities.Echantillon;
import com.example.techlab.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EchantillonRepository extends JpaRepository<Echantillon,Long> {
}
