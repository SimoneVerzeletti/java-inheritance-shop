package shop;

public class Smartphone extends Prodotto {

    private String imei;

    private int ram;

    public Smartphone (String imei, String nome, String descrizione, double prezzo, double iva){
        this.imei = imei;
        super(nome, descrizione, prezzo, iva);
       } 

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
