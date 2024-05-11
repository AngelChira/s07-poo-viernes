package s07poo;

public class RemuneracionVendedor extends Remuneracion {
    private Comision comision;

    public RemuneracionVendedor(Comision comision) {
        this.comision = comision;
        ingreso();
        bonificacion();
        descuento();
    }

    @Override
    public float bonificacion() {
        if (comision.getMontoVendido() < 1000) {
         return 0;   
        } else if (comision.getMontoVendido() <= 5000) {
            return ingreso() * 0.05f;
        } else {
            return ingreso() * 0.10f;
        }
    }

    @Override
    public float ingreso() {
        return comision.getMontoVendido() * comision.getTasaComision();
    }

    @Override
    public float descuento() {
        if ( ingreso() < 1000) {
            return ingreso() * 0.11f;
        } else {
            return ingreso() * 0.15f;
        }
    }
}
