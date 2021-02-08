package fr.canalplus.apitesting.abonne.service;

import fr.canalplus.apitesting.abonne.dto.AbonneCreateDTO;
import fr.canalplus.apitesting.abonne.dto.AbonneModifierDTO;
import fr.canalplus.apitesting.abonne.model.Abonne;
import fr.canalplus.apitesting.abonne.repository.AbonneRepository;
import javassist.NotFoundException;
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

    @Override
    public void modifierAbonne(AbonneModifierDTO abonneModifierDTO) throws NotFoundException {
        Abonne abonne = abonneRepository.findById(abonneModifierDTO.getId_abonne()).orElseThrow(() -> new NotFoundException("Abonné n'est pas trouvée !!!"));
        abonne.setAdresse(abonneModifierDTO.getAdresse_abonne());
        abonne.setPays(abonneModifierDTO.getPays());
        abonneRepository.save(abonne);
    }
}
