package projetoPetphop;

import java.time.LocalDate;

public abstract class ServicosPetShop {
    private LocalDate data;
    private int codigo;
    private Tamanho tamanhoAnimal;

    public ServicosPetShop(int codigo, Tamanho tamanhoAnimal) {
        this.codigo = codigo;
        this.tamanhoAnimal = tamanhoAnimal;
    }

    public abstract double calculaPreco();
}