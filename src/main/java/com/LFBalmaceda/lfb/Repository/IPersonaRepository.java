package com.LFBalmaceda.lfb.Repository;

import com.LFBalmaceda.lfb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> { 
    
}
