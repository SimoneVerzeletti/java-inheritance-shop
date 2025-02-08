package shop;

public class Prodotto {
    
    //caratteristiche/attributi
    private int codice;

    private String nome;
    
    private String descrizione;
    
    private double prezzo;
    
    private double iva;  

    //costruttore
    public Prodotto(){
        Random ran = new Random();
        this.codice = ran.nextInt(1000, 9999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
   
    //metodi
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescrizione(){
        return descrizione;
    }
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }    
    public double getPrezzoBase() {
        return prezzo;
    }
    public void setPrezzoBase(double prezzo){
        this.prezzo = prezzo;
    }
    public double getIva(){
        return iva;
    }
    public void setIva(double iva){
        this.iva =iva;
    }
    public double getPrezzoIva(int i){
        return prezzo + (prezzo * iva / 100);
    }

    public int getCodice(){
        return codice;
    }

    public String getNomeEsteso(){
        return codice + "-" + nome;
    }
}
 