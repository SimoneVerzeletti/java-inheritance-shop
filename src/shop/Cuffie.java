package shop;

public class Cuffie extends Prodotto {

    private String color;

    private boolean wireles;

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
