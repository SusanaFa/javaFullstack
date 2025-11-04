package TiendaOnline;

public class TiendaOnline {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado ";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";

        // Variables de productos (agrega las tuyas a continuación)
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalon = 30.3;
        double precioZapatos = 55.5;

        // Variables de clientes (agrega las tuyas a continuación)
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3 = "Miguel";

        // Estado de pedidos (agrega las tuyas a continuación)
        boolean pedidoConfirmadoCliente1 = true; // ana
        boolean pedidoConfirmadoCliente2 = true; // alex
        boolean pedidoConfirmadoCliente3 = true; // miguel

        // INTERACCIÓN DE LA APLICACIÓN ANA
        System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"

        if (pedidoConfirmadoCliente1) {
            System.out.println(cliente1 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + precioPantalon);
        } else {
            System.out.println(cliente1 = mensajeRechazo);
        }

        System.out.println("------------------------------");

        // Miguel (pedido con error)

        System.out.println(mensajeBienvenida + cliente3);

        double totalMiguelIncorrecto = precioCamiseta + precioPantalon;

        if (pedidoConfirmadoCliente3) {
            System.out.println(cliente3 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + totalMiguelIncorrecto);
        } else {
            System.out.println(cliente1 = mensajeRechazo);
        }

        System.out.println("------------------------------");

        // Miguel, pedido correcto
        double totalMiguelCorrecto = precioZapatos = precioLibro;
        double diferencia = totalMiguelIncorrecto - totalMiguelCorrecto;

        System.out.println("\n" + cliente3 + " ha detectado un cobro incorrecto");
        System.out.println("pedido correcto: zapatos + libro");
        System.out.println(mensajeMostrarTotal + totalMiguelCorrecto);
        System.out.println("Diferencia a reembolsar: $" + diferencia);

        System.out.println("------------------------------");
        // Alex
        System.out.println(mensajeBienvenida + cliente2);
        double totalAlex = (precioZapatos * 2) + precioLibro;

        if (pedidoConfirmadoCliente2) {
            System.out.println(cliente2 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + totalAlex);
        } else {
            System.out.println(cliente1 = mensajeRechazo);
        }

    }
}