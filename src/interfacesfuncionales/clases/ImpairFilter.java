package interfacesfuncionales.clases;

import interfacesfuncionales.Predicado;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class ImpairFilter implements Predicado {
    @Override
    public boolean test(Integer num) {
        return num % 2 != 0;
    }
}
