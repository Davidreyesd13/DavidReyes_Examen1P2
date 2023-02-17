
public class Pc {
    String ip;
    String mascara;
    String hostname;

    public Pc() {
    }

    public Pc(String ip, String mascara, String hostname) {
        this.ip = ip;
        this.mascara = mascara;
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "Pc: " + "IP: " + ip + "\n Mascara:" + mascara + "\n Hostname: " + hostname +"\n";
    }
    
}
