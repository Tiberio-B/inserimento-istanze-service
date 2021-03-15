package it.sogei.svildep.istanzaservice.repository;

import it.sogei.svildep.istanzaservice.model.Istanza;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class IstanzaRepository {

    public Map<Long, Istanza> getDatabase() { return new HashMap<>(); }

    public Istanza get(Long id) { return getDatabase().get(id); }

    public List<Istanza> getAll() { return new ArrayList<>((getDatabase().values())); }

    public Istanza insert(Istanza entity) { return getDatabase().put(entity.getId(), entity); }
    
    public boolean update(Istanza entity) { return insert(entity) == null; }

    public Istanza delete(Long id) { return getDatabase().remove(id); }

    public boolean deleteEffective(Long id) { return delete(id) != null; }

    public void drop() { getDatabase().clear(); }
}
