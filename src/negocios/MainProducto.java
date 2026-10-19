package negocios;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Audifonos", 20, 10.2, "Tecnologia");

        /*producto1.nombre=" Audífonos Bluetooth";
        producto1.precio = 32.50;
        producto1.categoria = "Tecnología";
        producto1.disponible = true;*/

        /*producto1.setPrecio(10.2);
        producto1.setNombre("Audifonos");
        producto1.setCategoria("Audio");
        producto1.isDisponible(true);
        producto1.setVentas(20);*/




        System.out.println("El nombre del producto es "+producto1.getNombre()+ " y su precio es de "+ producto1.getPrecio() + " y se han realizado " + producto1.getVentas() + " ventas");


        //Producto producto2 = new Producto();
        /*producto2.nombre = "Teclado";
        producto2.precio = 67.00;
        producto2.categoria = "Escritorio";
        producto2.disponible = true;*/

        //Producto producto3 = new Producto();
        /*producto3.nombre = "Mouse";
        producto3.precio = 15.39;
        producto3.categoria = "Escritotio";
        producto3.disponible = false;*/

        //producto1.mostrarInformacion();
        /*producto1.cambiarDisponibilidad(false);
        producto1.mostrarDisponibilidad();


        producto2.mostrarInformacion();
        producto2.mostrarPrecio();

        producto3.mostrarInformacion();
        producto3.cambiarDisponibilidad(true);
        producto3.mostrarDisponibilidad();*/
    }
}
