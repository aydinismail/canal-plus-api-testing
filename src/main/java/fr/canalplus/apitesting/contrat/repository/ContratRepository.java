package fr.canalplus.apitesting.contrat.repository;

import fr.canalplus.apitesting.contrat.model.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {

    @Query(value = "SELECT adresse_contrat FROM contrats id_abonne WHERE id_abonne.id_abonne=?1", nativeQuery = true)
    List<String> getAllContratsAdresseByAbonneId(Long id_abonne);

    @Query(value = "SELECT * FROM contrats  WHERE id_abonne = ?1 and id_contrat = ?2", nativeQuery = true)
    Contrat getContratModifier(Long id_abonne, Long id_contrat);

    @Query(value = "SELECT * FROM contrats  WHERE id_abonne = ?1 and id_contrat = ?2", nativeQuery = true)
    Optional<Contrat> existsContratByIdAbonneIdContrat(Long id_abonne, Long id_contrat);

    @Query(value = "SELECT * FROM contrats  WHERE id_abonne = ?1", nativeQuery = true)
    Optional<Contrat> getAllContratByAbonneId(Long id_abonne);

}
