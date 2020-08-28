package nunes.luciano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nunes.luciano.domain.Estado;
import nunes.luciano.repositories.EstadoRepository;

@Service
public class EstadoService {
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> findAll(){
		return estadoRepository.findAllByOrderByNome();
	}

}
