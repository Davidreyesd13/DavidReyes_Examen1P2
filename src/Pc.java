
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

    
    public String toStringp() {
        return "Pc" + "ip= " + ip + ", mascara= " + mascara + ", hostname= " + hostname ;
    }

    public String toStringShowp() {
        return "IP: " + ip + "\n Mascara:" + mascara + "\n Hostname: " + hostname + "\n";
    }

}
