package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import entity.Conseiller;

public class MemoryDao implements ConseillerDao {
	
	private static final Map<Integer, Conseiller> DB = new HashMap<>();
	private static int id = 1;

	@Override
	public void save(Conseiller c) {
		c.setId(id);
		DB.put(c.getId(), c);
		id++;
	}

	@Override
	public Optional<Conseiller> findById(Integer id) {
		return Optional.ofNullable(DB.get(id));
	}

	@Override
	public void delete(Integer id) {
		DB.remove(id);
	}

	@Override
	public List<Conseiller> finAll() {
		return new ArrayList<Conseiller>(DB.values());
	}


	@Override
	public Optional<Conseiller> update(Integer id) {
		
		return null;
	}

}
