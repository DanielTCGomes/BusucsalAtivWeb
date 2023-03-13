package br.ucsal.busucsal.controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.busucsal.model.Horario;
import br.ucsal.busucsal.persistencia.HorarioRepositorio;

@RestController()
@RequestMapping("/api")
public class HorarioController {

	@Autowired
	private HorarioRepositorio horarioRepositorio;

// /api/horarios
	@GetMapping("/horarios")
	public List<Horario> horarios() {
		return horarioRepositorio.findAll();
	}

	@GetMapping("/horarios/inserir")
	public String inserir() {

		Horario horario = new Horario();
		horario.setDia("Sabado");
		horario.setHora(LocalTime.of(6, 30));
		horario.setRoteiro("SAI DA UCSAL E VAI PARA O METRO");

		horarioRepositorio.save(horario);

		return "ok";
	}

}
