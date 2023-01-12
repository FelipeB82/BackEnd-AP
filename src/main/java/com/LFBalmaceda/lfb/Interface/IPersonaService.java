package com.LFBalmaceda.lfb.Interface;

import com.LFBalmaceda.lfb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
//Traer lista personas
    public List<Persona> getPersona();
//Guardar objeto tipo persona
    public void savePersona(Persona persona);
    
//Eliminar objeto por id
    public void deletePersona(Long id);
    
//Buscar persona por id
    public Persona findPersona(Long id);
}
