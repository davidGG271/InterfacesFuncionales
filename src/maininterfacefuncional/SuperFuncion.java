package maininterfacefuncional;

import java.util.ArrayList;
import java.util.List;

import interfacesfuncionales.Consumidor;
import interfacesfuncionales.Funcion;
import interfacesfuncionales.FuncionBinaria;
import interfacesfuncionales.Predicado;
import interfacesfuncionales.Proveedor;
import interfacesfuncionales.clases.Impresor;

public class SuperFuncion {
    public static List<Integer> filter(List<Integer> numbers, Predicado predicado) {
        List<Integer> auxList = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            if (predicado.test(numbers.get(i))) {
                auxList.add(numbers.get(i));
            }
        }
        return auxList;
    }
    public static List<Integer> proveer(int size, Proveedor proveedor) {
        List<Integer> auxList = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            auxList.add(proveedor.obtener());
        }
        return auxList;
    }
    public static List<Integer> transform (List<Integer> squareNumbers,Funcion funcion ) {
        List<Integer> auxList = new ArrayList<>();
        for (Integer num : squareNumbers) {
            auxList.add(funcion.aplicar(num));
        }
        return auxList;
    }

    public static List<Integer> perform (List<Integer> squareNumbers, Consumidor consumidor) {
        List<Integer> auxList = new ArrayList<>();
        for (Integer num : squareNumbers) {
            int transformedNumber = consumidor.aceptar(num);
            auxList.add(transformedNumber);
        }
        return auxList;
    }

    public static void consume( List<Integer> squareNumbers, Consumidor consumidor){
        for (Integer num : squareNumbers) {
            consumidor.aceptar(num);
        }
    }

    public static Integer reduce (List<Integer> numbers, Integer n,FuncionBinaria funcion) {
        Integer resultado = n;
        for (Integer numero : numbers) {
            resultado = funcion.aplicar(resultado, numero);
        }
        return resultado;
    }
}
