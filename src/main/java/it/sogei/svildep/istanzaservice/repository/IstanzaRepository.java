package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.Istanza;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface IstanzaRepository {

    default Map<Long, Istanza> getDatabase() { return new HashMap<>(); }

    default Istanza get(Long id) { return getDatabase().get(id); }

    default List<Istanza> getAll() { return new ArrayList<>((getDatabase().values())); }

    default Istanza insert(Istanza entity) { return getDatabase().put(entity.getId(), entity); }
    
    default boolean update(Istanza entity) { return insert(entity) == null; }

    default Istanza delete(Long id) { return getDatabase().remove(id); }

    default boolean deleteEffective(Long id) { return delete(id) != null; }

    default void drop() { getDatabase().clear(); }
}
