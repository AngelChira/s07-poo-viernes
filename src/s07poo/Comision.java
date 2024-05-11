package s07poo;

public class Comision {
    private float tasaComision;
    private float montoVendido;

    public Comision(float tasaComision, float montoVendido) {
        this.tasaComision = tasaComision;
        this.montoVendido = montoVendido;
    }

    public float getTasaComision() {
        return tasaComision;
    }

    public float getMontoVendido() {
        return montoVendido;
    }
    
    
}
