package fr.canalplus.apitesting.abonne.model;

import javax.persistence.*;

@Entity
@Table(name = "abonnes")
public class Abonne {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "abonnes_gen")
    @Column(name = "id_abonne")
    private Long id;

    @Column(name = "nom_abonne", length = 50)
    private String nom;

    @Column(name = "prenom_abonne", length = 50)
    private String prenom;

    @Column(name = "adresse_abonne", length = 100)
    private String adresse;

    @Column(name = "pays")
    private String pays;


    public Long getId() {
        return id;
    }

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

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Abonne() {

    }

    public Abonne(String nom, String prenom, String adresse, String pays) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.pays = pays;
    }
}
