public class Escritorio extends Pc{
    int ram,almacenamiento;
    String hard;
    Boolean grafica;

    public Escritorio(int ram, int almacenamiento, String hard, Boolean grafica, String ip, String mascara, String hostname) {
        super(ip, mascara, hostname);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.hard = hard;
        this.grafica = grafica;
    }

    public Escritorio() {
    super();
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getHard() {
        return hard;
    }

    public void setHard(String hard) {
        this.hard = hard;
    }

    public Boolean getGrafica() {
        return grafica;
    }

    public void setGrafica(Boolean grafica) {
        this.grafica = grafica;
    }

    @Override
    public String toString() {
        return "Escritorio "+"RAM: " + ram + "\n Almacenamiento: " + almacenamiento + "\nDisco Duro: " + hard + "\n Grafica=" + grafica;
    }
    
    
}
