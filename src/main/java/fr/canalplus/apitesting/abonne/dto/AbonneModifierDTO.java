package fr.canalplus.apitesting.abonne.dto;

public class AbonneModifierDTO {

    private Long id_abonne;
    private String nouvelle_adresse;
    private String nouvelle_pays;

    public String getPays() {
        return nouvelle_pays;
    }

    public Long getId_abonne() {
        return id_abonne;
    }

    public String getAdresse_abonne() {
        return nouvelle_adresse;
    }

    public AbonneModifierDTO(Long id_abonne, String nouvelle_adresse, String nouvelle_pays) {
        this.id_abonne = id_abonne;
        this.nouvelle_adresse = nouvelle_adresse;
        this.nouvelle_pays = nouvelle_pays;
    }
}
