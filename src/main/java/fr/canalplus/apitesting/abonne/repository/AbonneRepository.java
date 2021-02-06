package fr.canalplus.apitesting.abonne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.canalplus.apitesting.abonne.model.Abonne;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonneRepository extends JpaRepository<Abonne, Long> {
}
