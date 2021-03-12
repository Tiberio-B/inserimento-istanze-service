package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.istanza.Istanza;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface IstanzaRepository<E extends Istanza> {

    Map<Long, E> getDatabase();

    default E get(Long id) { return getDatabase().get(id); }

    default List<E> getAll() { return new ArrayList<>((getDatabase().values())); }

    default E insert(E entity) { return getDatabase().put(entity.getId(), entity); }
    
    default boolean update(E entity) { return insert(entity) == null; }

    default E delete(Long id) { return getDatabase().remove(id); }

    default E delete(E entity) { return delete(entity.getId()); }

    default boolean deleteEffective(Long id) { return delete(id) != null; }
    
    default boolean deleteEffective(E entity) { return deleteEffective(entity.getId()); }

    default void drop() { getDatabase().clear(); }
}
