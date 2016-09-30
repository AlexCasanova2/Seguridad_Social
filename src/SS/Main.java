package SS;

public class Main {

    public static void main(String[] args) {

        SeguridadSocial seguridadSocial = new SeguridadSocial();

        SeguridadSocial_HashMap lista_hash =  new SeguridadSocial_HashMap();

        SeguridadSocial_TreeMap lista_tree = new SeguridadSocial_TreeMap();


        Persona jose = new Persona("39425364H", "111111111", "Jose", "Tomás", 35, 45000.00);

        Persona maria = new Persona("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);

        Persona carlos = new Persona("39425355Q", "22222222", "Carlos", "Torres", 22, 23000.00);

        Persona anna = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);

        Persona alex = new Persona("25369405Z", "22222222", "Alex", "Casanova", 21,1234.5);

        seguridadSocial.altaPersona(jose);

        seguridadSocial.altaPersona(maria);

        seguridadSocial.altaPersona(carlos);

        seguridadSocial.altaPersona(anna);

        System.out.println("Altas a la seguridad social:" + seguridadSocial.obtenerTodas());

        System.out.println("Baja a la seguridad social:" + anna);

        seguridadSocial.bajaPersona(anna.getDni());

        System.out.println("Lista de afiliados a la S.S.:" + seguridadSocial.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + seguridadSocial.obtenerPersonaPorDNI(jose.getDni()));

        System.out.println("obtenerPersonaPorNumSS:" + seguridadSocial.obtenerPersonaPorNumSS(maria.getNumSS()));

        System.out.println("obtenerPersonasRangoSalarial: " + seguridadSocial.obtenerPersonasRangoSalarial(23000, 45000));

        System.out.println("obtenerPersonasMayoresQue: " + seguridadSocial.obtenerPersonasMayoresQue(25));

        lista_hash.altaPersona(jose);



        System.out.print("lista con hashmap"+lista_hash.obtenerTodas());


        //TREE

        lista_tree.altaPersona(jose);

        lista_tree.altaPersona(maria);

        lista_tree.altaPersona(carlos);

        lista_tree.altaPersona(anna);

        System.out.println("Altas a la seguridad social:" + lista_tree.obtenerTodas());

        System.out.println("Baja a la seguridad social:" + anna);

        lista_tree.bajaPersona(anna.getDni());

        System.out.println("Lista de afiliados a la S.S.:" + lista_tree.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + lista_tree.obtenerPersonaPorDNI(jose.getDni()));

        System.out.println("obtenerPersonaPorNumSS:" + lista_tree.obtenerPersonaPorNumSS(maria.getNumSS()));

        System.out.println("obtenerPersonasRangoSalarial: " + lista_tree.obtenerPersonasRangoSalarial(23000, 45000));

        System.out.println("obtenerPersonasMayoresQue: " + lista_tree.obtenerPersonasMayoresQue(25));


        lista_tree.altaPersona(alex);

        System.out.println("lista con treemap" + lista_tree.obtenerTodas());

    }
}
