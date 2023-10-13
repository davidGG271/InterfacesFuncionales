package anonymousclass.main;

import java.util.List;
import java.util.Random;

import anonymousclass.interfaces.Consumidor;
import anonymousclass.interfaces.Funcion;
import anonymousclass.interfaces.FuncionBinaria;
import anonymousclass.interfaces.Predicado;
import anonymousclass.interfaces.Proveedor;
import anonymousclass.superfuncionanonima.SuperFuncionAnonymousClass;

public class Main {
    public static void main(String[] args) {
        new Main();
    }
    // Declarativo
    public Main() {

        // a. Crear una lista de enteros.
        List<Integer> numbers = SuperFuncionAnonymousClass.proveer(20, new
                Proveedor() {
                    Random random = new Random();
                    @Override
                    public Integer obtener() {
                        return random.nextInt(100);
                    }
                });
        System.out.println("Nueva Lista -->" + numbers);
        // b. Filtrar solo los números pares.
        List<Integer> pairs = SuperFuncionAnonymousClass.filter(numbers, new
                Predicado() {
                    @Override
                    public boolean test(Integer num) {
                        return num % 2 == 0;
                    }
                });
        System.out.println("Números pares XD-->" + pairs);

        // c. Filtrar solo los números impares.
        List<Integer> impairs = SuperFuncionAnonymousClass.filter(numbers, new
                Predicado() {
            @Override
            public boolean test(Integer num) {
                return num % 2 != 0;
            }
        });
        System.out.println("Números impares -->" + impairs);

        // d. Obtener el cuadrado de cada número.
        List<Integer> squareNumbers = SuperFuncionAnonymousClass.transform(numbers, new
                Funcion() {
            @Override
            public Integer aplicar(Integer num) {
                return num * num;
            }
        });

        // e.1 Mostrar cada cuadrado por pantalla y retornar una lista.
        List<Integer> realNumbers = SuperFuncionAnonymousClass.perform(squareNumbers, new
                Consumidor() {
            @Override
            public int aceptar(Integer valor) {
                System.out.println("Números pares elevados al cuadrado -->" + valor);
                return 0;
            }
        });

        //Otr vez pa separar
        System.out.println("------------------------------------------------------");

        // e.2 Mostrar cada cuadrado por pantalla sin retornar nada.
        SuperFuncionAnonymousClass.consume(squareNumbers, new Consumidor() {
            @Override
            public int aceptar(Integer valor) {
                System.out.println("Números pares elevados al cuadrado -->" + valor);
                return 0;
            }
        });

        // f. Obtener la suma de los cuadrados.
        int result = SuperFuncionAnonymousClass.reduce(squareNumbers, 0, new FuncionBinaria() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("La suma de los cuadrados --> " + result);

    }
}
