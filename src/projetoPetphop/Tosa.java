package projetoPetphop;

public class Tosa extends ServicosPetShop{
    private final double PRECO_PEQUENO = 30.00;
    private final double PRECO_MEDIO = 40.00;
    private final double PRECO_GRANDE = 50.00;

    public Tosa(int codigo, Tamanho tamanhoAnimal) {
        super(codigo, tamanhoAnimal);
    }

    @Override
    public double calculaPreco() {
        return switch (getTamanhoAnimal()){
            case PEQUENO -> PRECO_PEQUENO;
            case MEDIO -> PRECO_MEDIO;
            case GRANDE -> PRECO_GRANDE;};
    }

    public String descricao() {
        return super.getData() + " | Serviço de Tosa - Código:  " + super.getCodigo() + " | Tamanho: " + super.getTamanhoAnimal() + "  - R$: " + calculaPreco();
    }

    //o que deveria ter no toString dele, já que não tem nada (nenhum atributo) dentro dele ? e como funcionariam o equals e hashcade ?

    @Override
    public String toString() {
        return "Tosa{}";
    }
}