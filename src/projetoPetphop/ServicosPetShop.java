package projetoPetphop;

import java.time.LocalDate;

public abstract class ServicosPetShop implements ServicoPetshopIF{
    private LocalDate data;
    private int codigo;
    private Tamanho tamanhoAnimal;

    public ServicosPetShop(int codigo, Tamanho tamanhoAnimal) {
        this.codigo = codigo;
        this.tamanhoAnimal = tamanhoAnimal;
        data = LocalDate.now();
    }

    public abstract double calculaPreco();

    public Tamanho getTamanhoAnimal() {
        return tamanhoAnimal;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }
}