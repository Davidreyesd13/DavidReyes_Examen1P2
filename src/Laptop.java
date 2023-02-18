public class Laptop extends Pc{
 String marca,pantalla;
 boolean luz;

    public Laptop(String marca, String pantalla, boolean luz, String ip, String mascara, String hostname) {
        super(ip, mascara, hostname);
        this.marca = marca;
        this.pantalla = pantalla;
        this.luz = luz;
    }

    public Laptop() {
        super();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isLuz() {
        return luz;
    }

    public void setLuz(boolean luz) {
        this.luz = luz;
    }

    @Override
    public String toString() {
        return " Laptop " + "marca=" + marca + ", pantalla=" + pantalla + ", luz=" + luz ;
    }
    
    
    public String toStringShow() {
        return   "Marca: " + marca + "\nPantalla: " + pantalla + "\nRGB: " + luz;
    }
 
}
