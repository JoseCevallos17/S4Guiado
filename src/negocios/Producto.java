package negocios;

public class Producto {
    private String nombre;
    private double precio;
    private int ventas;
    private String categoria;
    private boolean disponible;

    public Producto(){
    }

    //*Constructor por parametros

    public Producto(String nombre, int ventas, double precio, String categoria){
        this.ventas= ventas;
        this.precio=precio;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    //Si los atributos tienen restricciones (se debe invocar a los metodos set)


    public void mostrarInformacion(){
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio + " dolares");
        System.out.println("Categoria: " + categoria);
        if(disponible) {
            System.out.println("Estado: Disponible");
        }else{
            System.out.println("Estado: No Disponible");
        }
    }
    public void cambiarDisponibilidad(boolean nuevaDisponibilidad){
        disponible = nuevaDisponibilidad;
        if (nuevaDisponibilidad) {
            System.out.println(nombre + " ahora esta disponible");
        }else{
            System.out.println(nombre + " ya no esta disponible");
        }
    }

    void mostrarPrecio(){
        System.out.println(nombre + ": " + precio + "dolares");
    }

    void mostrarDisponibilidad(){
        System.out.println(nombre + ": " + disponible);
    }
    /* ingresar informacion
    metodo set()
    "siempre" es void
    siempre recibe parametro
    parametro -> generealmente del mismo tipo que el atributo
     */
    public void setPrecio(double precio){
        //Si el valor es correcto asigne
        if(precio>=0)
            this.precio =precio;
    }

    public void setVentas(int ventas){
        //Si el valor es correcto asigne
        if(ventas>=0)
            this.ventas =ventas;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public void setCategoria(String categoria){
        if(categoria==null || categoria.isBlank()){

        }
        this.categoria=categoria;
    }

    public void isDisponible(boolean disponible){
        this.disponible=disponible;
    }

    /*sacar informacion
    metodo get()
    siempre retorna valor
    tipo de retorno generalemnte es del mismo tipo del atributo
     */

    public double getPrecio(){
        return precio;
    }

    public int getVentas(){
        return ventas;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCategoria(){
        return categoria;
    }

    public boolean getDisponible(){
        return disponible;
    }

}
