package projetoPetphop;

import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {
    private List<ServicoPetshopIF> servicos = new ArrayList<>();

    public void adicionaServico (ServicosPetShop servico) {
        servicos.add(servico);
        //parei aqui
    }
}