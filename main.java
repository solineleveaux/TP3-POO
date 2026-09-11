public static void main (String args[]) 
{
    Plats nouveau_plat = new Plats("Maki", 12, "California Avocat Saumon");
    nouveau_plat.afficherDetail();
    nouveau_plat.modifierPrix(10);
    nouveau_plat.setNom("Maki California");
    nouveau_plat.setDescription("California Avocat Saumon Concombre");
    System.out.println();
    System.out.println(nouveau_plat.get_Nom());
    System.out.println(nouveau_plat.get_Prix());
    System.out.println(nouveau_plat.get_Description());
}  
