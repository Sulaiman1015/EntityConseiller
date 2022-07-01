package dao;

import java.util.List;
import java.util.Optional;

import entity.Conseiller;


public interface ConseillerDao{
	
	void save(Conseiller c);
	Optional<Conseiller> update(Integer id);
	Optional<Conseiller> findById(Integer id);
	void delete(Integer id);
	List<Conseiller> finAll();

}
