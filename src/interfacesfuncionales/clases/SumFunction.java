package interfacesfuncionales.clases;

import interfacesfuncionales.FuncionBinaria;

public class SumFunction implements FuncionBinaria {
    @Override
    public Integer aplicar(Integer valor1, Integer valor2) {
        return valor1 + valor2;
    }
}
