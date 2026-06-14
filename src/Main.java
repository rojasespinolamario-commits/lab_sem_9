import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Pasajero> pasajeros = new HashMap<>();

        Pasajero pasajero1 = new Pasajero("Juan Perez", "12345678", "Lima", "15/06/2026", "08:00", "12");
        Pasajero pasajero2 = new Pasajero("Maria Lopez", "87654321", "Trujillo", "15/06/2026", "09:30", "18");
        Pasajero pasajero3 = new Pasajero("Carlos Ramirez", "45678912", "Chiclayo", "16/06/2026", "07:45", "5");
        Pasajero pasajero4 = new Pasajero("Ana Torres", "78912345", "Piura", "17/06/2026", "10:15", "22");
        Pasajero pasajero5 = new Pasajero("Luis Garcia", "32165498", "Arequipa", "17/06/2026", "06:30", "9");

        pasajeros.put(pasajero1.getDni(), pasajero1);
        pasajeros.put(pasajero2.getDni(), pasajero2);
        pasajeros.put(pasajero3.getDni(), pasajero3);
        pasajeros.put(pasajero4.getDni(), pasajero4);
        pasajeros.put(pasajero5.getDni(), pasajero5);

        String dniBuscado = "45678912";

        System.out.println("---- RECORRIDO DE PASAJEROS CON ITERATOR ----");

        Iterator<Map.Entry<String, Pasajero>> iterator = pasajeros.entrySet().iterator();

        Pasajero pasajeroEncontrado = null;

        while (iterator.hasNext()) {
            Map.Entry<String, Pasajero> entrada = iterator.next();
            Pasajero pasajero = entrada.getValue();

            System.out.println("-----------------");
            System.out.println(pasajero);

            if (pasajero.getDni().equals(dniBuscado)) {
                pasajeroEncontrado = pasajero;
            }
        }

        System.out.println("\n---- RESULTADO DE LA BUSQUEDA POR DNI ---");

        if(pasajeroEncontrado != null) {
            System.out.println("Pasajero encontrado:");
            System.out.println(pasajeroEncontrado);
        } else {
            System.out.println("No se encontro ningun pasajero con el DNI: " + dniBuscado);
        }
    }
}