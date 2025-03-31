package projetoPetshop;

import java.util.Objects;

public class Banho extends ServicosPetshop {
    private TamanhoPelo tamanhoPelo;

    public Banho(int codigo, Tamanho tamanhoAnimal, TamanhoPelo tamanhoPelo) {
        super(codigo, tamanhoAnimal);
        this.tamanhoPelo = tamanhoPelo;
    }

    @Override
    public double calculaPreco() {
        return switch (tamanhoPelo) {
            case CURTO -> precoPorTamanho();
            case MEDIO -> precoPorTamanho() + 15.00;
            case LONGO -> precoPorTamanho() + 25.00;
        };
    }

    private Double precoPorTamanho() {
        return switch (super.getTamanhoAnimal()) {
            case PEQUENO -> 50.00;
            case MEDIO -> 60.00;
            case GRANDE -> 70.00;
        };
    }

    public String descricao() {
        return super.getData() + " | Banho - Código:  " + super.getCodigo() + " | Tamanho: " + super.getTamanhoAnimal() + " com pelos " + tamanhoPelo + " - R$: " + calculaPreco();
    }

    @Override
    public String toString() {
        return "Banho{" +
                "tamanhoPelo=" + tamanhoPelo +
                '}';
    }

    /*@Override
    public String toString() {
        return "Banho | \nTamanho do animal:" + super.getTamanhoAnimal() + " Pelos: " + tamanhoPelo + "\n No dia: " + super.getData() + "\n" + "Código: " + super.getCodigo();
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Banho banho = (Banho) o;
        return tamanhoPelo == banho.tamanhoPelo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tamanhoPelo);
    }
}
