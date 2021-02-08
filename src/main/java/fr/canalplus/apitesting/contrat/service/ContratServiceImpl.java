package fr.canalplus.apitesting.contrat.service;

import fr.canalplus.apitesting.contrat.dto.ContratCreateDTO;
import fr.canalplus.apitesting.contrat.dto.ContratModifierDTO;
import fr.canalplus.apitesting.contrat.model.Contrat;
import fr.canalplus.apitesting.abonne.repository.AbonneRepository;
import fr.canalplus.apitesting.contrat.repository.ContratRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;


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

    @Override
    public void modifierContrat(ContratModifierDTO contratModifierDTO) throws NotFoundException {
        abonneRepository.findById(contratModifierDTO.getId_abonne()).orElseThrow(() -> new NotFoundException("Abonnée n'est pas trouvée !!!"));
        contratRepository.existsContratByIdAbonneIdContrat(contratModifierDTO.getId_abonne(),contratModifierDTO.getId_contrat()).orElseThrow(()
                -> new NotFoundException("Contrat n'est pas trouvée !!!"));
        Contrat contrat = contratRepository.getContratModifier(contratModifierDTO.getId_abonne(), contratModifierDTO.getId_contrat());
        contrat.setAdresse_contrat(contratModifierDTO.getNouvelle_adresse());
        contratRepository.save(contrat);
    }
}
