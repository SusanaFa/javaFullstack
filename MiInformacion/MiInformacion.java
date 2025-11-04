package MiInformacion;

public class MiInformacion {
    public static void main(String[] args) {
        int edad = 35;
        String nombre = "Susana Farías";
        String ciudad = "Angol";
        String region = "IX Región";
        String pais = "Chile";
        String hobby = "programar";
        String docente1 = "Cande";
        String docente2 = "Vale";

        System.out.println(String.format("Hola, mi nombre es %s. \nTengo %d años de edad. \nSoy de %s, %s, %s. \nMe gusta aprender a %s nuevos lenguajes.\nMis docentes en este nuevo lenguaje son %s y %s. ", nombre, edad, ciudad, region, pais, hobby, docente1, docente2 ));
    }
}
