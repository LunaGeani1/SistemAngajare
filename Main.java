
public class Main {

    public static void main(String[] args) {

        Angajat Geani = new Angajat("Luna Geani Marian","Masculin","Romana",21,180,"Intern",new String[]{"Invata"});

        Angajat Alex = new Angajat("Alex","Masculin","Roman",26,170,"Inginer",new String[]{"Rezolva probleme"});



        System.out.println(Alex);
        Alex.angajat(true);
        System.out.println(Geani);
        Geani.angajat(true);




    }
}
