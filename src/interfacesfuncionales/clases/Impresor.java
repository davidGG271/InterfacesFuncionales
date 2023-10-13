package interfacesfuncionales.clases;

import interfacesfuncionales.Consumidor;

public class Impresor implements Consumidor {
    @Override
    public int aceptar(Integer valor) {
        System.out.println("Números pares elevados al cuadrado -->" + valor);
        return 0;
    }
}
