package projetoPetphop;

import java.util.Objects;

public class Banho extends ServicosPetShop {
    private TamanhoPelo tamanhoPelo;

    public Banho(int codigo, Tamanho tamanhoAnimal, TamanhoPelo tamanhoPelo) {
        super(codigo, tamanhoAnimal);
        this.tamanhoPelo = tamanhoPelo;
    }

    @Override
    public double calculaPreco() {
        if (super.getTamanhoAnimal() == Tamanho.PEQUENO) {
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                return 50.00;
            } else if (tamanhoPelo == TamanhoPelo.MEDIO) {
                return 50.00 + 15.00;
            } else if (tamanhoPelo == TamanhoPelo.LONGO) {
                return 50.00 + 25.00;
            }
        } else if (super.getTamanhoAnimal() == Tamanho.MEDIO) {
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                return 60.00;
            } else if (tamanhoPelo == TamanhoPelo.MEDIO) {
                return 60.00 + 15.00;
            } else if (tamanhoPelo == TamanhoPelo.LONGO) {
                return 60.00 + 25.00;
            }
        } else if (super.getTamanhoAnimal() == Tamanho.GRANDE) {
            if (tamanhoPelo == TamanhoPelo.CURTO) {
                return 70.00;
            } else if (tamanhoPelo == TamanhoPelo.MEDIO) {
                return 70.00 + 15.00;
            } else if (tamanhoPelo == TamanhoPelo.LONGO) {
                return 70.00 + 25.00;
            }
        }
        return 0;
    }

    public String descricao() {
        return super.getData() + " | Serviço de banho - Código:  " + super.getCodigo() + " | Tamanho: " + super.getTamanhoAnimal() + " com pelos " + tamanhoPelo + " - R$: " + calculaPreco();
    }

    @Override
    public String toString() {
        return "Banho | \nTamanho do animal:" + super.getTamanhoAnimal() + " de pelos: " + tamanhoPelo+ "\n No dia: " + super.getData() + "\n" + "Código: " + super.getCodigo();
    }

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
