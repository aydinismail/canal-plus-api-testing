package fr.canalplus.apitesting.abonne.service;

import fr.canalplus.apitesting.abonne.dto.AbonneCreateDTO;
import fr.canalplus.apitesting.abonne.model.Abonne;

public interface AbonneService {
     Abonne createAbonne(AbonneCreateDTO abonneCreateDTO);
}
