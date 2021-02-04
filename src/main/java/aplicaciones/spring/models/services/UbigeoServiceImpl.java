package aplicaciones.spring.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aplicaciones.spring.models.dao.UbigeoDao;
import aplicaciones.spring.models.entity.Ubigeo;

@Service
public class UbigeoServiceImpl implements UbigeoService{

	@Autowired
	UbigeoDao ubigeoDao;
	
	@Override
	@Transactional
	public Ubigeo save(Ubigeo ubigeo) {
		return ubigeoDao.save(ubigeo);
	}

}
