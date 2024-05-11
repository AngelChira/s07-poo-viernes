package s07poo;

public class Reporte {
    public String mostrarVendedor(Empleado empleado, RemuneracionVendedor remuneracionVendedor) {
        return "Reporte: "+ empleado.getTipo()+
                "\n----------------"+
                "\nNombre: "+ empleado.getNombre()+
                "\nApellido: "+ empleado.getApellido()+
                "\nDni: "+ empleado.getDni()+
                "\nIngreso: "+ remuneracionVendedor.ingreso()+
                "\nBonificacion: "+remuneracionVendedor.bonificacion()+
                "\nDescuento: "+ remuneracionVendedor.descuento()+
                "\nSueldo neto: "+remuneracionVendedor.sueldoNeto();
    }
    
    public String mostrarPermanente(Empleado empleado, RemuneracionPermanente remuneracionPermanente) {
        return "Reporte: "+ empleado.getTipo()+
                "\n----------------"+
                "\nNombre: "+ empleado.getNombre()+
                "\nApellido: "+ empleado.getApellido()+
                "\nDni: "+ empleado.getDni()+
                "\nIngreso: "+ remuneracionPermanente.ingreso()+
                "\nBonificacion: "+remuneracionPermanente.bonificacion()+
                "\nDescuento: "+ remuneracionPermanente.descuento()+
                "\nMovilidad: "+ remuneracionPermanente.movilidad()+
                "\nSueldo neto: "+remuneracionPermanente.sueldoNeto();
    }
}
