package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        setPacote(pacote);
        setVeiculo(veiculo);
    }

    public void setPacote(Pacote pacote) {
        if (pacote == null) {
            throw new IllegalArgumentException("Pacote não pode ser nulo.");
        }
        this.pacote = pacote;
    }

    public void setVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo não pode ser nulo.");
        }
        this.veiculo = veiculo;
    }

    public void iniciarEntrega() {
        pacote.atualizarStatus("Em transporte"); // regra automática

        System.out.println("Levando pacote " + pacote.getCodigo()
                + " no veículo " + veiculo.getPlaca()
                + " (" + veiculo.getTipoVeiculo() + ")");
    }
}