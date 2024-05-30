package components;

import java.util.Scanner;

public class apresentation {
    public void displayMessage() {

        Scanner ler = new Scanner(System.in);

        String name;

        System.out.println("Informe o nome: ");
        name = ler.next();

        //Nesta você irá validar apenas letras minúsculas(a-z), maiúsculas(A-Z) e espaços em branco.
        while ((name.matches("[a-zA-Z\\s]+") == false)) {
            System.out.println("Somente letras são permitidas.");
            name = ler.next();
        }

        System.out.println("Olá, " + name + "! seja bem vindo(a) a TecShop!");

    }
}
