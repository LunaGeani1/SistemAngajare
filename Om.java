import java.lang.reflect.Array;
import java.util.Arrays;

public class Om {

    private String nume;
    private String sex;
    private String nationalitate;
    private int varsta;
    private float inaltime;


    public Om(String nume, String sex, String nationalitate, int varsta, float inaltime) {
        this.nume = nume;
        this.sex = sex;
        this.nationalitate = nationalitate;
        this.varsta = varsta;
        this.inaltime = inaltime;

    }



    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationalitate() {
        return nationalitate;
    }

    public void setNationalitate(String nationalitate) {
        this.nationalitate = nationalitate;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public float getInaltime() {
        return inaltime;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        return "\nNumele : " + nume +
                "\nSex: " + getSex() +
                "\nVarsta: " + getVarsta() +
                "\nNationalitate: " + getNationalitate() +
                "\nInaltime: " + getInaltime();

    }

    public void angajat(boolean decizie) {
        if (decizie) {
            System.out.println("Felicitari " + getNume() + " ai fost angajat.");
        } else {
            System.out.println("Ne pare rau " + getNume() + " nu ai fost angajat");

        }


    }
}
