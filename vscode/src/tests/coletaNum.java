package tests;

import java.util.Scanner;

public class coletaNum {
    public static byte ColetaNumero() {
        Scanner read = new Scanner(System.in);
        byte numero;
        while(true){
            if(read.hasNextByte()){ //verifica se byte
                numero = read.nextByte();
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
