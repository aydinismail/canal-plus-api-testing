package fr.canalplus.apitesting.abonne.dto;

public class AbonneCreateDTO {

    private final String nom;
    private final String prenom;
    private final String adresse;
    private final String pays;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPays() {
        return pays;
    }

    public AbonneCreateDTO(String nom, String prenom, String adresse, String pays) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.pays = pays;
    }
}
