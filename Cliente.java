package BancoBoston;

public class Cliente implements InformacionCliente {
    private String nombre;
    private String rut;
    private String direccion;

    public Cliente(String nombre, String rut, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public void mostrarDatosCliente() {
        System.out.println("Cliente: " + nombre + " | RUT: " + rut + " | Dirección: " + direccion);
    }
}
