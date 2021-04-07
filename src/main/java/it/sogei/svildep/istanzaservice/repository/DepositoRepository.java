package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.entity.gestionedepositi.Deposito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito, Long> {
}
