package fr.canalplus.apitesting.abonne.service;

import fr.canalplus.apitesting.abonne.dto.AbonneCreateDTO;
import fr.canalplus.apitesting.abonne.model.Abonne;
import fr.canalplus.apitesting.abonne.repository.AbonneRepository;
import org.springframework.stereotype.Service;

@Service
public class AbonneSeviceImpl implements AbonneService {

    private final AbonneRepository abonneRepository;

    public AbonneSeviceImpl(AbonneRepository abonneRepository) {
        this.abonneRepository = abonneRepository;
    }

    @Override
    public Abonne createAbonne(AbonneCreateDTO abonneCreateDTO) {
        Abonne abonne = abonneRepository.save(new Abonne(abonneCreateDTO.getNom(),abonneCreateDTO.getPrenom(),abonneCreateDTO.getAdresse(),abonneCreateDTO.getPays()));
        return abonne;
    }
}
