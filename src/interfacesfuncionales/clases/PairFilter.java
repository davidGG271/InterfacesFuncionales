package interfacesfuncionales.clases;

import interfacesfuncionales.Predicado;

public class PairFilter implements Predicado {

    @Override
    public boolean test(Integer num) {
        return num % 2 == 0;
    }
}
