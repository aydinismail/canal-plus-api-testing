package fr.canalplus.apitesting.abonne.service;

import fr.canalplus.apitesting.abonne.dto.AbonneCreateDTO;
import fr.canalplus.apitesting.abonne.dto.AbonneModifierDTO;
import fr.canalplus.apitesting.abonne.model.Abonne;
import javassist.NotFoundException;

public interface AbonneService {
     Abonne createAbonne(AbonneCreateDTO abonneCreateDTO);

     void modifierAbonne(AbonneModifierDTO abonneModifierDTO) throws NotFoundException;
}
