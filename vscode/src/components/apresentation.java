package vscode.src.pages; 

import java.util.Scanner;

public class apresentation {
    public void exibirMensagem(){
        String nome;

        Scanner ler = new Scanner(System.in);
                
        System.out.println("Informe o nome: ");
        nome = ler.next();

        System.out.println("Olá, "+ nome +"! seja bem vindo(a) a TecShop!");
        
        
    }    
}
