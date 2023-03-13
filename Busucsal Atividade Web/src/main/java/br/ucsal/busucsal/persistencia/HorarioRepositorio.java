package br.ucsal.busucsal.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ucsal.busucsal.model.Horario;

public interface HorarioRepositorio extends JpaRepository<Horario, Long> {

}
