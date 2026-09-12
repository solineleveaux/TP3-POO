public class Plats {

    protected String nom ;
    protected int prix ;
    protected String description ;

    public Plats(String name, int price, String texte)
    {
        this.nom = name ;
        this.prix = price ;
        this.description = texte ;
    }

    protected void modifierPrix(int nouveau_prix)
    {
        this.prix = nouveau_prix ;
    }

    public void afficherDetail ()
    {
        System.out.println("--- Information concernant le plat ---");
        System.out.println("Nom du plat : " + this.nom);
        System.out.println("Prix du plat : " + this.prix);
        System.out.println("Description du plant : " + this.description);
    }

    protected void setNom (String name)
    {
        this.nom = name ;
    }

    protected void setDescription (String texte)
    {
        this.description = texte ;
    }

    public String get_Nom ()
    {
        return this.nom ;
    }

    public int get_Prix ()
    {
        return this.prix ;
    }

    public String get_Description ()
    {
        return this.description ;
    }

}
