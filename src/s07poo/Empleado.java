package s07poo;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private String tipo;

    public Empleado(String dni, String nombre, String apellido, String tipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
