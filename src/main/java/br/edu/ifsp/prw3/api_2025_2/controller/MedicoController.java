package br.edu.ifsp.prw3.api_2025_2.controller;

import br.edu.ifsp.prw3.api_2025_2.medico.DadosCadastroMedico;
import br.edu.ifsp.prw3.api_2025_2.medico.DadosListagemMedico;
import br.edu.ifsp.prw3.api_2025_2.medico.Medico;
import br.edu.ifsp.prw3.api_2025_2.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){

        repository.save( new Medico(dados) );

    }

    @GetMapping
    public List<Medico> listar() {

        return repository.findAll();

    }

    @GetMapping("algunsdados")
    public Page<DadosListagemMedico> listarAlgunsDados(
            @PageableDefault( size=2,
                    page=0,
                    sort={"nome","crm"},
                    direction = Sort.Direction.DESC ) Pageable paginacao )
    {
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

}
