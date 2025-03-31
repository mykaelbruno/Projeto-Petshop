package projetoPetphop;

import java.util.Objects;

public class Hotel extends ServicosPetShop{
    private int qtdHoras;

    public Hotel(int codigo, Tamanho tamanhoAnimal, int qtdHoras) {
        super(codigo, tamanhoAnimal);
        this.qtdHoras = qtdHoras;
    }

    @Override
    public double calculaPreco() {
        return  switch (getTamanhoAnimal()) {
            case PEQUENO -> qtdHoras * 12;
            case MEDIO -> qtdHoras * 18;
            case GRANDE -> qtdHoras * 25;
        };
    }

    public String descricao() {
        return super.getData() + " | Serviço de Hotel - Código:  " + super.getCodigo() + " | Tamanho: " + super.getTamanhoAnimal() + " durante " + qtdHoras + " horas  - R$: " + calculaPreco();
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "qtdHoras=" + qtdHoras +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return qtdHoras == hotel.qtdHoras;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(qtdHoras);
    }
}
