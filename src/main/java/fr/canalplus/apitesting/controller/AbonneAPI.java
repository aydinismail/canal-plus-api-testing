package fr.canalplus.apitesting.controller;

import fr.canalplus.apitesting.dto.AbonneCreateDTO;
import fr.canalplus.apitesting.model.Abonne;
import fr.canalplus.apitesting.service.AbonneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/abonne")
public class AbonneAPI {

    private final AbonneService abonneService;

    public AbonneAPI(AbonneService abonneService) {
        this.abonneService = abonneService;
    }

    @PostMapping("creer")
    public ResponseEntity<?> creerAbonne(@RequestBody AbonneCreateDTO abonneCreateDTO) {
        Abonne abonne = abonneService.createAbonne(abonneCreateDTO);
        return ResponseEntity.ok(abonne);
    }

}
