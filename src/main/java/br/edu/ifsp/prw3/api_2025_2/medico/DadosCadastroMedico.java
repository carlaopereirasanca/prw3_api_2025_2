package br.edu.ifsp.prw3.api_2025_2.medico;

import br.edu.ifsp.prw3.api_2025_2.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm,
                                  Especialidade especialidade,
                                  DadosEndereco endereco) {

}
