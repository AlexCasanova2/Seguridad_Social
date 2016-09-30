package SS;
import java.util.List;
import java.util.ArrayList;



public class SeguridadSocial {

    private List<Persona> personasList;


    public SeguridadSocial() {

        personasList = new ArrayList<>();
    }

    public void altaPersona(Persona persona) {
        boolean repetida =false;


        boolean repetido = personasList.stream().anyMatch(p -> p.getDni().equals(persona));

        for(Persona personaActual : personasList){ //recorremos todas las personas (personaActual se crea aqui y hace referencia a personasList)
            if(personaActual.getDni().equals(persona.getDni()) || personaActual.getNumSS().equals(persona.getNumSS())){ //comprobamos si coinciden
                repetida=true; //si coincide se pone a true y hacemos break para que pare
                break;
            }
        }
        if(!repetida){ //si no esta repetida la guardamos
            personasList.add(persona); //guarda la persona en el arrayList
        }
    }



    public void bajaPersona(String dni) {

        Persona aux=null;

        for(Persona personaActual : personasList){
            if(personaActual.getDni().equals(dni)){
                aux =personaActual;
                break;
            }
        }
        if(aux!=null){
            personasList.remove(aux);
        }
    }


    public Persona obtenerPersonaPorDNI(String dni) {

        for (Persona personaActual : personasList){
            if (personaActual.getDni().equals(dni)){
                return personaActual;
            }
        }
        return null;

    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

        for (Persona personaActual : personasList){
            if (personaActual.getNumSS().equals(numSS)){
                return personaActual;
            }
        }
        return null;

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

            List<Persona> aux = new ArrayList<>();

        for (Persona personaActual : personasList){
            if (personaActual.getSalario()>=min && personaActual.getSalario()<=max){
                aux.add(personaActual);
            }
        }
        return aux;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

        List<Persona> aux = new ArrayList<>();

        for (Persona personaActual : personasList){
            if (personaActual.getSalario()> edad){
                aux.add(personaActual);
            }
        }
        return aux;

    }

    public List<Persona> obtenerTodas(){

        return personasList;

    }

    @Override

    public String toString() {

        return "SeguridadSocial{" + "personasList=" + personasList + '}';

    }
}
