package fr.canalplus.apitesting.contrat.dto;

public class ContratModifierDTO {

    private Long id_abonne;
    private Long id_contrat;
    private String nouvelle_adresse;

    public Long getId_abonne() {
        return id_abonne;
    }

    public Long getId_contrat() {
        return id_contrat;
    }

    public String getNouvelle_adresse() {
        return nouvelle_adresse;
    }

    public ContratModifierDTO(Long id_abonne,Long id_contrat, String nouvelle_adresse) {
        this.id_abonne = id_abonne;
        this.id_contrat = id_contrat;
        this.nouvelle_adresse = nouvelle_adresse;
    }
}
