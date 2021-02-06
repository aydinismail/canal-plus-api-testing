package fr.canalplus.apitesting.service;

import fr.canalplus.apitesting.dto.AbonneCreateDTO;
import fr.canalplus.apitesting.model.Abonne;
import fr.canalplus.apitesting.repository.AbonneRepository;
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
