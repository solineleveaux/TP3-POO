public class Utilisateur 
{
    protected int identifiant;
    protected String nom;
    protected String email;

    public Utilisateur(int id, String name, String mail)
    {
        this.identifiant = id;
        this.nom = name ; 
        this.email = mail ;
    }

    private boolean seConnecter () 
    {

    }

    private void seDeconnecter ()
    {

    }

    protected void mettre_a_jour (String nouveau_nom, String nouvel_email)
    {

    }

    public int get_id ()
    {

    }

    public String get_nom ()
    {

    }

    public String get_email ()
    {

    }

}
