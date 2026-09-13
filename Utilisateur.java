

public class Utilisateur 
{
    protected int identifiant;
    protected String nom;
    protected String email;
    protected boolean connecte;

    public Utilisateur ()
    {
        this.identifiant = 0;
        this.nom = "Inconnu" ;
        this.email = "Inconnu" ;
        this.connecte = false ;
    }
    public Utilisateur(int id, String name, String mail)
    {
        this.identifiant = id;
        this.nom = name ; 
        this.email = mail ;
        this.connecte = false;
    }

    protected boolean suisJeConnecte ()
    {
        // recupérer la valeur de this.connecte => return
        return this.connecte ;
    }

    protected  void seConnecter () 
    {
        //mettre à true this.connecte
        connecte = true ;
    }

    protected void seDeconnecter ()
    {
        //mettre à false this.connecte
        connecte = false ;
    } 

    protected void mettre_a_jour (String nouveau_nom, String nouvel_email)
    {
        this.nom = nouveau_nom ;
        this.email = nouvel_email ;
    }

    public int get_id ()
    {
        return this.identifiant ;
    }

    public String get_nom ()
    {
        return this.nom ;
    }

    public String get_email ()
    {
        return this.email ;
    }

}
