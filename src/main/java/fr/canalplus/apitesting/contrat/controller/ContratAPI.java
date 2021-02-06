package fr.canalplus.apitesting.contrat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
