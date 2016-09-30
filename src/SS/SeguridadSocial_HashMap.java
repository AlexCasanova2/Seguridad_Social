package SS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeguridadSocial_HashMap {

    Map<String, Persona> personaMapDni = new HashMap<>(); //creamos los hashmaps de cada uno
    Map<String, Persona> personaMapSS = new HashMap<>();

    public void altaPersona(Persona persona){

        if(!personaMapDni.containsKey(persona.getDni()) && !personaMapSS.containsKey(persona.getNumSS())){

            personaMapDni.put(persona.getDni(), persona); //se vincula la clave que es el dni con el objeto que es la persona
            personaMapSS.put(persona.getNumSS(),persona);
        }
    }

    public Persona bajaPersona (String dni){

        return personaMapDni.remove(dni);
    }

    public Persona obtenerPersonaPorDNI(String dni) {

        //personaMapDni.keySet(); //coger todas las keys
        // personaMapDni.values(); //coger todos los values

        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS){

        return personaMapSS.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

        List<Persona> aux = new ArrayList<>();

        for (Persona persona: personaMapDni.values()
             ) {
            if(persona.getSalario()>= min && persona.getSalario()<=max){
                aux.add(persona);
            }
        }
        return aux;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

        List<Persona> aux = new ArrayList<>();

        for (Persona persona: personaMapDni.values()
                ) {
            if(persona.getSalario()>= edad){
                aux.add(persona);
            }
        }
        return aux;
    }

    public List<Persona> obtenerTodas(){

        return new ArrayList<>(personaMapDni.values());
    }
}