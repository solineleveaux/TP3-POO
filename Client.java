public class Client extends Utilisateur {

    private String adresseLivraison ;
    private String numeroTelephone ;
    private String moyenPaiement ;

    public Client ()
    {
        super() ;
        this.adresseLivraison = "Adresse Inconnue" ;
        this.numeroTelephone = "0000000000" ;
        this.moyenPaiement = "Aucun" ;
    }

    public Client(int id, String name, String mail, String addresse, String numero, String paiement)
    {
        super(id, name, mail) ;
        this.adresseLivraison = addresse ;
        this.numeroTelephone = numero ;
        this.moyenPaiement = paiement ;
    }

    public void passerCommande (Commande panier)
    {
        System.out.println("\n--- Début du traitement de la commande ---");
        System.out.println("Client : " + this.nom + " passe une commande.");
        System.out.println("Adresse de livraison : " + this.adresseLivraison);
        System.out.println("Moyen de paiement sélectionné : " + this.moyenPaiement);
        
        if (this.suisJeConnecte()) 
        {
            boolean validation = panier.validerCommande();
            if (validation) 
            {
                boolean paiementReussi = panier.validerPaiement();
                if (paiementReussi) 
                {
                    System.out.println("Succès : La commande a été transmise au restaurant !");
                } 
                else 
                {
                    System.out.println("Échec : Le paiement a été refusé.");
                }
            } 
            else 
            {
                System.out.println("Échec : Impossible de valider la commande (panier vide).");
            }
        } 
        else 
        {
            System.out.println("Échec : Vous devez être connecté pour passer une commande.");
        }
    }

    public String getAdresseLivraison ()
    {
        return this.adresseLivraison ;
    }

    public String getnumeroTelephone ()
    {
        return this.numeroTelephone ;
    }

    public String getMoyenPaiement ()
    {
        return this.moyenPaiement ;
    }

    protected void setAdresseLivraison (String nouvelle_adresse)
    {
        this.adresseLivraison = nouvelle_adresse ;
    }

    protected void setNumeroTelephone (String nouveau_numero)
    {
        this.numeroTelephone = nouveau_numero ;
    }

    protected void setMoyenPaiement (String nouveau_paiement)
    {
        this.moyenPaiement = nouveau_paiement ;
    }

}
