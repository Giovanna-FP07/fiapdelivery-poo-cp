package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao(String placa, double capacidadeCarga, int quantidadeEixos) {
        super(placa, capacidadeCarga);
        setQuantidadeEixos(quantidadeEixos);
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos <= 0) {
            throw new IllegalArgumentException("Eixos deve ser maior que zero.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public String getTipoVeiculo() {
        return "Caminhão";
    }
}