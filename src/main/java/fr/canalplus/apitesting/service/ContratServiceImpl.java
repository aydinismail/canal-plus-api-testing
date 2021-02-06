package fr.canalplus.apitesting.service;

import fr.canalplus.apitesting.dto.ContratCreateDTO;
import fr.canalplus.apitesting.model.Contrat;
import fr.canalplus.apitesting.repository.AbonneRepository;
import fr.canalplus.apitesting.repository.ContratRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {

    private final ContratRepository contratRepository;
    private final AbonneRepository abonneRepository;

    public ContratServiceImpl(ContratRepository contratRepository, AbonneRepository abonneRepository) {
        this.contratRepository = contratRepository;
        this.abonneRepository = abonneRepository;
    }

    @Override
    public Object createContrat(ContratCreateDTO contratCreateDTO) {
        if (abonneRepository.existsById(contratCreateDTO.getId_abonne())) {
            if (!contratRepository.getAllContratsAdresseByAbonneId(contratCreateDTO.getId_abonne()).contains(contratCreateDTO.getAdresse_contrat())) {
                Contrat contrat = contratRepository.save(new Contrat(contratCreateDTO.getId_abonne(),contratCreateDTO.getAdresse_contrat()));
                return contrat;
            }
            return "Contrat déjà crée !!!";
        }
        return "Abonnée n'est pas trouvée !!!";
    }
}
