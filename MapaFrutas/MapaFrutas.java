package MapaFrutas;

import java.util.HashMap;
import java.util.Set;

public class MapaFrutas {

    public static void main(String[] args) {

        // declaramos el hashmap

        HashMap<String, Integer> frutas = new HashMap<String, Integer>();

        // agregar frutas a nuestro hashMap
        frutas.put("Pera", 6);
        frutas.put("Naranja", 10);
        frutas.put("Toronja", 4);
        frutas.put("Manzana", 4);
        frutas.put("Platano", 5);

        // Buscar y extraer información de las frutas utilizando el método get
        System.out.println("-------------------- primera iteraccion ----------------------");

        String frutaBuscada = "Platano";
        int frutaCantidad = frutas.get(frutaBuscada);
        System.out.println(
                String.format("La fruta buscada es %s, y la cantidad a comprar es %d", frutaBuscada, frutaCantidad));
        System.out.println("-------------------- segunda iteraccion ----------------------");
        Set<String> claves = frutas.keySet();
        for (String clave : claves) {
            System.out.println(String.format("La fruta a comprar es %s, y la cantidad a comprar es %d", clave,
                    frutas.get(clave)));
        }

    }

}