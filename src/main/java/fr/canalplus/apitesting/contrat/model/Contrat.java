package fr.canalplus.apitesting.contrat.model;

import javax.persistence.*;

@Entity(name = "contrats")
@Table(name = "contrats")
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "contrat_gen")
    @Column(name = "id_contrat")
    private Long id_contrat;

    @Column(name = "id_abonne", length = 50)
    private Long id_abonne;

    @Column(name = "adresse_contrat", length = 100)
    private String adresse_contrat;

    public Long getId_contrat() {
        return id_contrat;
    }

    public Long getId_abonne() {
        return id_abonne;
    }

    public String getAdresse() {
        return adresse_contrat;
    }

    public void setAdresse_contrat(String adresse_contrat) {
        this.adresse_contrat = adresse_contrat;
    }

    public Contrat() {

    }

    public Contrat(Long id_abonne, String adresse_contrat) {
        this.id_abonne = id_abonne;
        this.adresse_contrat = adresse_contrat;
    }

    public Contrat(Long id_abonne, Long id_contrat) {
        this.id_abonne = id_abonne;
        this.id_contrat = id_contrat;
    }
}
