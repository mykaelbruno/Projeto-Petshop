package projetoPetphop;

public class AppMain {
    public static void main(String[] args) {
        Banho banho = new Banho(123, Tamanho.MEDIO, TamanhoPelo.CURTO);
        System.out.println(banho.descricao());
    }
}
