package tests;

import java.util.Scanner;

public class coletaNum {
    public static short ColetaNumero() {
        Scanner read = new Scanner(System.in);
        short numero;
        while(true){
            if(read.hasNextShort()){ //verifica se byte
                numero = read.nextShort();
                break;
            }
            else{
                System.out.println("Entrada inválida. Tente novamente.");
                read.next(); // Lê e descarta a entrada inválida
            }
        }
        return numero;
    }
}
