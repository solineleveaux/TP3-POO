
import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int idCommande;
    private String dateCommande;
    private String Statut;
    private List<Plats> listePlats;

    public Commande(int id, String date, String etat) {
        this.idCommande = id;
        this.dateCommande = date;
        this.Statut = etat;
        this.listePlats = new ArrayList<>();
    }

    public Commande ()
    {
        this.idCommande = 0 ;
        this.dateCommande = null ;
        this.Statut = null ;
        this.listePlats = new ArrayList<>();
    }

    protected void setID(int nv_ID) {
        this.idCommande = nv_ID;
    }

    protected void setDate(String Date) {
        this.dateCommande = Date;
    }

    protected void setStatut(String nv_Statut) {
        this.Statut = nv_Statut;
    }

    public int get_id_commande() {
        return this.idCommande;
    }

    public String get_date() {
        return this.dateCommande;
    }

    public String getStatut() {
        return this.Statut;
    }

    public List<Plats> getListePlats() {
        return this.listePlats;
    }

    protected void ajouter_Plat(Plats plats) {
        if (plats != null) {
            this.listePlats.add(plats);
        }
    }

    protected void supprimer_Plat(Plats plats) {
        this.listePlats.remove(plats);
    }

    protected int calculer_total() {
        int total = 0;
        for (int i = 0; i < listePlats.size(); i++) {
            total += this.listePlats.get(i).get_Prix();
        }
        return total;
    }

    protected boolean validerCommande() 
    {
        if (this.listePlats != null && this.listePlats.size() > 0) 
        {
            this.Statut = "Validée";
            return true;
        }
        return false;

    }

    protected boolean validerPaiement() 
    {
        if (calculer_total() > 0 && "Validée".equals(this.Statut)) 
        {
            this.Statut = "Payée";
            return true;
        }
        return false;
    }

}
