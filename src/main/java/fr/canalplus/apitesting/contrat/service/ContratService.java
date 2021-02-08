package fr.canalplus.apitesting.contrat.service;

import fr.canalplus.apitesting.abonne.dto.AbonneModifierDTO;
import fr.canalplus.apitesting.contrat.dto.ContratCreateDTO;
import fr.canalplus.apitesting.contrat.dto.ContratModifierDTO;
import fr.canalplus.apitesting.contrat.model.Contrat;
import javassist.NotFoundException;

public interface ContratService {

    Object createContrat(ContratCreateDTO conratCreateDTO);
    void modifierContrat(ContratModifierDTO contratModifierDTO) throws NotFoundException;

}
