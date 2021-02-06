package fr.canalplus.apitesting.abonne.controller;

import fr.canalplus.apitesting.abonne.dto.AbonneCreateDTO;
import fr.canalplus.apitesting.abonne.dto.AbonneModifierDTO;
import fr.canalplus.apitesting.abonne.service.AbonneService;
import javassist.NotFoundException;
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
        return ResponseEntity.ok(abonneService.createAbonne(abonneCreateDTO));
    }

    @PutMapping("modifier")
    public String modifierAbonne(@RequestBody AbonneModifierDTO abonneModifierDTO) throws NotFoundException {
        abonneService.modifierAbonne(abonneModifierDTO);
        return "Changée l'adresse !";
    }

}
