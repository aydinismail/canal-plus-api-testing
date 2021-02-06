package fr.canalplus.apitesting.contrat.dto;

public class ContratCreateDTO {

    private final Long id_abonne;
    private final String adresse_contrat;

    public Long getId_abonne() {
        return id_abonne;
    }

    public String getAdresse_contrat() {
        return adresse_contrat;
    }


    public ContratCreateDTO(Long id_abonne, String adresse_contrat) {
        this.id_abonne = id_abonne;
        this.adresse_contrat = adresse_contrat;
    }
}
