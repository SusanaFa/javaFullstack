import java.util.Date;
import Clases.Clases;

public class Aplicacion {
    public static void main(String[] args) {
        double resultado = Clases.multiplica(3.5, 6.2);
        System.out.println(resultado);

        System.out.println("--------------------------");
        Date fechaActual = new Date();
        System.out.println(fechaActual);
    }

}
