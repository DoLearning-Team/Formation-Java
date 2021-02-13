import java.util.ArrayList;

public class Eleve
{
    //Attributs : nom (String) ,moyenne (double), listeNotes (ArrayList<Integer>)

    private String nom;
    private double moyenne;
    private ArrayList<Integer> listNotes = new ArrayList<Integer>();

    //Un constructeur vide

    public Eleve()
    {

    }

    //un constructeur permettant d’initialiser le nom de l’eleve

    public Eleve(String nom)
    {
        this.nom = nom;
    }

    //une methode ajouterNote(int note) et actualise automatiquement la moyenne

    public void ajouterNote(int note)
    {
        double somme = 0;
        int nbr = 0;
        if (note < 0)
        {
            listNotes.add(0);
        }
        else if (note > 20)
        {
            listNotes.add(20);
        }
        else{
            listNotes.add(note);
        }

        for (Integer valeur : listNotes)
        {
            somme += valeur;
            nbr++;
        }
        this.moyenne = somme/nbr;
    }

    //les accesseurs (getter et setter)

    public String getNom()
    {
        return this.nom;
    }

    public double getmoyenne()
    {
        return this.moyenne;
    }

    public ArrayList<Integer> getlistNotes()
    {
        return this.listNotes;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    //la methode toString() qui affiche le nom et la moyenne de l’eleve

    public String toString()
    {
        return "Eleve : "+ this.nom + " moyenne : "+ this.moyenne +"";
    }





}