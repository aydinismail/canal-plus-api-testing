package fr.canalplus.apitesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.canalplus.apitesting.model.Abonne;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonneRepository extends JpaRepository<Abonne, Long> {
}
