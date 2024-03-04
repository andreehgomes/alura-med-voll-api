package med.voll.api.paciente;

public record DadosListagePaciente(Long id,String nome, String email, String telefone, String cpf) {

    public DadosListagePaciente(Paciente paciente) {
        this(paciente.getId() ,paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf());
    }

}
