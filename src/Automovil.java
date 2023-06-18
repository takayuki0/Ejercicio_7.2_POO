import java.util.Date;

public class Automovil extends Vehiculo {

    private Date fecVerificacion;

    public void setFecVerificacion(Date fecVerificacion) {
        this.fecVerificacion = fecVerificacion;
    }

    public void getFecVerificacion() {
        System.out.println(fecVerificacion);
    }
}
