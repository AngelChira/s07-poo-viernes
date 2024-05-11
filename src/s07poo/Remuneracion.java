package s07poo;

public abstract class Remuneracion {
    
    public abstract float bonificacion();
    public abstract float ingreso();
    public abstract float descuento();
            
    public float sueldoNeto() {
        return ingreso()+ bonificacion() - descuento();
    }
           
}
