package testfuncional;

import java.util.List;
import interfacesfuncionales.clases.AleatorioPositivo;
import interfacesfuncionales.clases.ImpairFilter;
import interfacesfuncionales.clases.Impresor;
import interfacesfuncionales.clases.PairFilter;
import interfacesfuncionales.clases.SquareFunction;
import interfacesfuncionales.clases.SumFunction;
import maininterfacefuncional.SuperFuncion;

public class TestFuncionales {
    public static void main(String[] args) {
        new TestFuncionales();
    }
    // Declarativo
    public TestFuncionales() {
        // a. Crear una lista de enteros.
        List<Integer> numbers = SuperFuncion.proveer(20, new AleatorioPositivo());
        System.out.println("Nueva Lista -->" + numbers);
        // b. Filtrar solo los números pares.
        List<Integer> pairs = SuperFuncion.filter(numbers, new PairFilter());
        System.out.println("Números pares -->" + pairs);
        // c. Filtrar solo los números impares.
        List<Integer> impairs = SuperFuncion.filter(numbers, new ImpairFilter());
        System.out.println("Números impares -->" + impairs);
        // d. Obtener el cuadrado de cada número.
        List<Integer> squareNumbers = SuperFuncion.transform(pairs, new SquareFunction());
        // e.1 Mostrar cada cuadrado por pantalla retornando lista.
        List<Integer> realNumbers = SuperFuncion.perform(squareNumbers, new Impresor());
        //Escribo esto pa diferenciar
        System.out.println("----------------------------------------");
        // e.2 Mostrar cada cuadrado por pantalla no retornando nada.
        SuperFuncion.consume(squareNumbers, new Impresor());
        // f. Obtener la suma de los cuadrados.
        int result = SuperFuncion.reduce(squareNumbers, 0, new SumFunction() );
        System.out.println("La suma de los cuadrados -->" + result);

    }
}
