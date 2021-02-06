package fr.canalplus.apitesting.service;

import fr.canalplus.apitesting.dto.AbonneCreateDTO;
import fr.canalplus.apitesting.model.Abonne;

public interface AbonneService {
     Abonne createAbonne(AbonneCreateDTO abonneCreateDTO);
}
