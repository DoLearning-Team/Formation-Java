public class CodeMain
{
    public static void main(String[] args)
    {
        // instance de la class Eleve : nous avons crée un eleve
        Eleve E1 = new Eleve();
        E1.setNom("Jean");
        E1.ajouterNote(5);
        E1.ajouterNote(18);
        E1.ajouterNote(6);
        E1.ajouterNote(-8);
        E1.ajouterNote(25);
        System.out.println(E1.toString());

        Eleve E2 = new Eleve();
        E2.setNom("Michel");
        E2.ajouterNote(9);
        E2.ajouterNote(15);
        E2.ajouterNote(8);
        E2.ajouterNote(11);
        E2.ajouterNote(18);

        System.out.println(E1.toString());

    }
}