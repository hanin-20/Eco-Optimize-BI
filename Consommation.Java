public class Consommation {
    // Attributs (tes données)
    private String date;
    private String typeEnergie; // Electricité, Eau, Gaz
    private double valeur;
    private double seuilAlerte;

    // Constructeur (pour créer un objet consommation)
    public Consommation(String date, String typeEnergie, double valeur, double seuilAlerte) {
        this.date = date;
        this.typeEnergie = typeEnergie;
        this.valeur = valeur;
        this.seuilAlerte = seuilAlerte;
    }

    // Méthode simple pour afficher les détails (Sprint 1)
    public void afficherInfos() {
        System.out.println("Date: " + date + " | Type: " + typeEnergie + " | Valeur: " + valeur + " kWh/m3");
        if (valeur > seuilAlerte) {
            System.out.println("⚠️ ALERTE : Consommation dépasse le seuil !");
        }
    }
}

