package shop;

public class Cuffie extends Prodotto {

    private String color;

    private boolean wireles;

    public Cuffie(String nome, String descrizione, double prezzo, double iva, String color, boolean wireles){
        this.color = color;
        this.wireles = wireles;
        super(nome, descrizione, prezzo, iva);

    }


    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isWireles() {
        return wireles;
    }

    public void setWireles(boolean wireles){
        this.wireles = wireles;
    }
}
