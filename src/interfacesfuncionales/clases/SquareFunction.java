package interfacesfuncionales.clases;

import interfacesfuncionales.Funcion;

public class SquareFunction implements Funcion {
    @Override
    public Integer aplicar(Integer valor) {
        return valor * valor;
    }
}
