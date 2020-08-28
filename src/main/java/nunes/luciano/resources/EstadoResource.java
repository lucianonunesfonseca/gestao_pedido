package nunes.luciano.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nunes.luciano.domain.Cidade;
import nunes.luciano.domain.Estado;
import nunes.luciano.dto.CidadesDTO;
import nunes.luciano.dto.EstadoDTO;
import nunes.luciano.services.CidadeService;
import nunes.luciano.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
	
	@Autowired
	private EstadoService estadoService;
	
	@Autowired
	private CidadeService cidadeService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EstadoDTO>>findAll(){
		List<Estado> list  = estadoService.findAll();
		List<EstadoDTO> listDTO = list.stream().map(obj -> new EstadoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@RequestMapping(value = "/{estadoId}/cidades",method=RequestMethod.GET)
	public ResponseEntity<List<CidadesDTO>>findCidades(@PathVariable Integer estadoId){
		List<Cidade> list  = cidadeService.findByEstado(estadoId);
		List<CidadesDTO> listDTO = list.stream().map(obj -> new CidadesDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}

}
