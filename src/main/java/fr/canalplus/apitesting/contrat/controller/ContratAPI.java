package fr.canalplus.apitesting.contrat.controller;

import fr.canalplus.apitesting.contrat.dto.ContratModifierDTO;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import fr.canalplus.apitesting.contrat.service.ContratService;
import fr.canalplus.apitesting.contrat.dto.ContratCreateDTO;

@RestController
@RequestMapping("/contrat")
public class ContratAPI {

    private final ContratService contratService;

    public ContratAPI(ContratService contratService) {
        this.contratService = contratService;
    }

    @PostMapping("creer")
    public ResponseEntity<?> creerContrat(@RequestBody ContratCreateDTO contratCreateDTO) {
        return ResponseEntity.ok(contratService.createContrat(contratCreateDTO));
    }

    @PutMapping("modifier")
    public String modifierContrat(@RequestBody ContratModifierDTO contratModifierDTO) throws NotFoundException {
        contratService.modifierContrat(contratModifierDTO);
        return "Changée l'adresse !";
    }

}
