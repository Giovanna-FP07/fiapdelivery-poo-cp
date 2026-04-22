package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.*;

public class Principal {
    public static void main(String[] args) {

        Veiculo veiculo = new Caminhao("ABC1234", 500.0, 6);
        // Para testar: new Moto("XYZ9999", 20.0, true);

        Pacote pacote = new Pacote("BR999", 10.5);

        Rota rota = new Rota(pacote, veiculo);
        rota.iniciarEntrega();

        System.out.println("Status do pacote: " + pacote.getStatus());
    }
}