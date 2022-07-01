package service;

import java.util.List;
import java.util.Optional;

import entity.Conseiller;



public interface ConseillerService {
	
	Optional<Conseiller> modifierConseiller(Conseiller c);
	void supprimerConseiller(Conseiller c);
	Optional<Conseiller> afficherConseiller(int id);
	List<Conseiller> listConseiller();

}
