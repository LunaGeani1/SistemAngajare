import java.util.Arrays;

public class Angajat extends Om {
    private String functie;
    private String[] atributii;


    public Angajat(String nume, String sex, String nationalitate, int varsta, float inaltime,String functie, String[] atributii) {
        super(nume,sex,nationalitate,varsta,inaltime);
        this.functie = functie;
        this.atributii = Arrays.copyOf(atributii, atributii.length);

    }

    public static void afisareSalariu(int salariu){
        System.out.println("Felicitari ai salariul de "+ salariu);
    }


}
