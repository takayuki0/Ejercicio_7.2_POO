public class Vehiculo implements regVehicular {

    private Object marca;
    private Object modelo;
    private Propietario duenio;
    private Object cveVehicular;

    public void setMarca(Object marca) {
        this.marca = marca;
    }

    public void setModelo(Object modelo) {
        this.modelo = modelo;
    }

    public void setDuenio(Propietario duenio) {
        this.duenio = duenio;
    }

    public void setCveVehicular(Object cveVehicular) {
        this.cveVehicular = cveVehicular;
    }

    public String getMarca() {
        return (String) marca;
    }

    public String getModelo() {
        return (String) modelo;
    }

    public Propietario getDuenio() {
        return duenio;
    }

    public String getCveVehicular() {
        return (String) cveVehicular;
    }

    @Override
    public double pagoTramite() {
        return 0;
    }

    @Override
    public String obtenerCveV() {
        return null;
    }
}
