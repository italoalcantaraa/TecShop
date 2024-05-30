import java.util.Scanner;
import java.awt.event.KeyEvent;

public class main {

    static Scanner input = new Scanner(System.in);

    public static String[] categorys() {
        String[] categorys = new String[5];

        categorys[0] = "Processamento(CPU e Memoria RAM)";
        categorys[1] = "Armazenamento(HDD e SSD)";
        categorys[2] = "Alimentação(Fontes)";
        categorys[3] = "Placas de Vídeo";
        categorys[4] = "Periféricos(Mouse, Teclado, Caixa de som, Monitor Pendrive)";

        return categorys;
    }

    public static int menuOption(String[] categorys) {
        System.out.println("Olá, seja bem-vindo(a) a TecShop!\n");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - " + categorys[i]);
        }

        System.out.println("Selecione uma opção: ");
        String menuOption = input.next();

        while (((menuOption.matches("^\\d+$")) == false) || menuOption.intern() != "1" && menuOption.intern() != "2" && menuOption.intern() != "3" && menuOption.intern() != "4" && menuOption.intern() != "5") {
            System.err.println("Valor inválido!");
            System.err.println("Informe uma opção novamente: ");
            menuOption = input.next();
        }

        int menuOptionToInt = Integer.parseInt(menuOption); // Converte o menuOpion para int

        return menuOptionToInt;
    }

    public static void main(String[] args) {
        String[] categorys = categorys();
        int menuOption = menuOption(categorys);
    }
}
