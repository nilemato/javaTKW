import angajat.Angajat;
import automobil.Automobil;
import enumerare.Language;
import enumerare.Marca;


public class Main {
    public static void main(String[] args) {
        Angajat contabil = new Angajat();
        contabil.setName("Ion");
        contabil.setAge(28);
        contabil.setLanguage(Language.RU);

        Automobil automobil = new Automobil(Marca.AUDI, 1992);
        Automobil automobil1 = new Automobil(Marca.VW);
        System.out.println(automobil.getMarca());
    }
}