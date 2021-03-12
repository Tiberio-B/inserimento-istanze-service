package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.Istanza;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface IstanzaRepository<E extends Istanza> {

    default Map<Long, E> getDatabase() { return new HashMap<>(); }

    default E get(Long id) { return getDatabase().get(id); }

    default List<E> getAll() { return new ArrayList<>((getDatabase().values())); }

    default E insert(E entity) { return getDatabase().put(entity.getId(), entity); }
    
    default boolean update(E entity) { return insert(entity) == null; }

    default E delete(Long id) { return getDatabase().remove(id); }

    default boolean deleteEffective(Long id) { return delete(id) != null; }

    default void drop() { getDatabase().clear(); }
}
