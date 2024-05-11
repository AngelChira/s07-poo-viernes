package s07poo;

public class Aporte {
    private String afiliacion;

    public String getAfiliacion() {
        return afiliacion;
    }
    
    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }
    
    public float obtenerTasaAfilicacion() {
        float tasa = 0;
        switch (afiliacion) {
            case "AFP", "afp","Afp", "AFp","aFp":
                tasa = 0.15f;
                break;
            case "SNP":
                tasa = 0.11f;
                break;
            default:
                throw new AssertionError();
        }
        return tasa;
    }
}
