package shop;

public class Televisori extends Prodotto {

    private int polliciTV;

    private boolean smart;

    public int getPolliciTV(){
        return polliciTV;
    }

    public void setPolliciTV(int polliciTV){
         this.polliciTV = polliciTV;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart){
        this.smart = smart;
    }
}
