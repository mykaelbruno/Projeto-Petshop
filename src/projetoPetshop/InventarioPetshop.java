package projetoPetshop;

import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {
    private List<ServicosPetshopIF> servicos = new ArrayList<>();

    public void adicionaServico (ServicosPetshop servico) {
        servicos.add(servico);
    }

    public double calculaValorArrecadado() {
        double vTotal = 0;
        for (ServicosPetshopIF servico : servicos) {
            vTotal += servico.calculaPreco();
        }
        return vTotal;
    }

    public int getCodigo() {
        return servicos.size()+1;
    }

    public String ListaServicos() {
        String listaServicos = "Lista de serviços prestados: \n";
        for (ServicosPetshopIF servico : servicos) {
            listaServicos += servico.descricao() + "\n";
        }
        return listaServicos;
    }
}