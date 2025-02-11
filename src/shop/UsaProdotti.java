package shop;

public class UsaProdotti {
    public static void main(String[] args) {
        
        //istanziare oggetti
        Smartphone c10 = new Smartphone("a145", "c10", "bello fes", 152, 20);

        Smartphone c12 = new Smartphone("a1456", "c12", "ancora più bello", 178.00, 15);

        Televisori p21 = new Televisori("pilip", "funziona bene", 21, true, 222.21, 20);

        Televisori p22 = new Televisori("soby", "si vede bene", 35, false, 400, 10);

        Cuffie ay55 = new Cuffie("AKJ", "sound pazzesco", 400, 22, "black", false);

        Cuffie ap765 = new Cuffie("Seniser", "effetto dolby", 555, 15, "red", true);

        System.out.println("Il nuovo telefono della simes è il modello" + c10.getNome() + " il suo imei è " + c10.getImei() + " il prezzo compresa IVA è € " + c10.getPrezzoIva(0));

        System.out.println("Il nuovo telefono della simes è il modello" + c12.getNome() + " il suo imei è " + c12.getImei() + " il prezzo compresa IVA è € " + c12.getPrezzoIva(0));

        System.out.println("Guarda i tuoi film preferiti con il televisore " 
            + p22.getNome() 
            + " da " 
            + p22.getPolliciTV() 
            + " pollici apprezzando il suono avvolgente delle cuffie " 
            + ap765.getNome()
            + " con il loro " 
            + ap765.getDescrizione());
    }

}
