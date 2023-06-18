public class Propietario {

    private String rfc;
    private String nombre;
    private String direccion;
    private String telefono;

    public Propietario(String rfc, String nombre, String direccion, String telefono) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void RegVehiculo() {

    }

    public void ModRegVehiculo() {

    }

    @Override
    public String toString() {
        return "Propietario:" +
                "\nNombre: " + nombre +
                "\nRfc: " + rfc +
                "\nDireccion: " + direccion +
                "\nTelefono: " + telefono +
                "\n______________________________________";
    }
}
