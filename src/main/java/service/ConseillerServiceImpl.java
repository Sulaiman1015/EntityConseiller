package service;

import java.util.List;
import java.util.Optional;

import dao.ConseillerDao;
import dao.MemoryDao;
import entity.Conseiller;



public class ConseillerServiceImpl implements ConseillerService {
	
	private ConseillerDao dao = new MemoryDao();

	@Override
	public Optional<Conseiller> modifierConseiller(Conseiller c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerConseiller(Conseiller c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Conseiller> afficherConseiller(int id) {
		Optional<Conseiller> optCoseiller = dao.findById(id);
		Conseiller conseller;
		
		optCoseiller.ifPresent(c ->c.setName(c.getName().toUpperCase()));
		
		
		
		return optCoseiller;
	}

	@Override
	public List<Conseiller> listConseiller() {
		// TODO Auto-generated method stub
		return null;
	}

}
