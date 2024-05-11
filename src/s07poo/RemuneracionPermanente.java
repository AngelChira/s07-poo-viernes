package s07poo;

public class RemuneracionPermanente extends Remuneracion {
    private float sueldoBase;
    private float movilidad;
    public Aporte aporte;

    public RemuneracionPermanente(Aporte aporte, float sueldoBase) {
        this.aporte = aporte;
        this.sueldoBase = sueldoBase;
        descuento();
        movilidad();
    }
    
    @Override
    public float bonificacion() {
        return 0;
    }

    @Override
    public float ingreso() {
        return sueldoBase;
    }

    @Override
    public float descuento() {
        return sueldoBase * aporte.obtenerTasaAfilicacion();
    }
    
    @Override
    public float sueldoNeto() {
        return super.sueldoNeto() + movilidad();
    }
    
    public float movilidad() {
        if(ingreso() < 1000) {
            return 50;
        } else {
            return 40;
        }
    }
}
