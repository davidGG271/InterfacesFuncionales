package interfacesfuncionales.clases;

import interfacesfuncionales.Proveedor;

import java.util.List;
import java.util.Random;

public class AleatorioPositivo implements Proveedor {
    @Override
    public Integer obtener() {
        //Coloqué que sean menores a 100 xd
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        return numeroAleatorio;
    }
}
