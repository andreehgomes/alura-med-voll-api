package med.voll.api.paciente;

public record DadosListagePaciente(String nome, String email, String telefone, String cpf) {

    public DadosListagePaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf());
    }

}
