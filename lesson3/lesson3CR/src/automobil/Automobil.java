package automobil;
import enumerare.Marca;

public class Automobil {

    private Marca marca ;
    private int anulProducerii;
    private int parcurs;
    public Automobil (Marca marca, int anulProducerii) {
        this.marca = marca;
        this.anulProducerii = anulProducerii;
    }

    public Automobil (Marca marca){
        this.parcurs = parcurs;
        this.marca = marca;
    }

    public int getParcurs() {
        return parcurs;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getAnulProducerii() {
        return anulProducerii;
    }
}
