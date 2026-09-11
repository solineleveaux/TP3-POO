public class Client extends Utilisateur {

    protected String adresseLivraison ;
    protected String numeroTelephone ;
    protected String moyenPaiement ;

    public Client(String addresse, String numero, String paiement)
    {
        this.adresseLivraison = addresse ;
        this.numeroTelephone = numero ;
        this.moyenPaiement = paiement ;
    }

    private void passerCommande (Commande panier)
    {

    }

    public String getAdresseLivraison ()
    {

    }

    public String getnumeroTelephone ()
    {

    }

    public String getMoyenPaiement ()
    {

    }

    protected void setAdresseLivraison (String nouvelle_adresse)
    {

    }

    protected void setNumeroTelephone (String nouveau_numero)
    {

    }

    protected void setMoyenPaiement (String nouveau_paiement)
    {

    }

}
