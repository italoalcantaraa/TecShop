import java.util.Scanner;

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

    public static String menuOption(String[] categorys) {

        System.out.println("Olá, seja bem-vindo(a) a TecShop!\n");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - " + categorys[i]);
        }

        System.out.println("Selecione uma opção: ");
        String menuOption = input.next();

        // Verifa se contém somente números e também se a opção existe
        while (((menuOption.matches("^\\d+$")) == false) || menuOption.intern() != "1" && menuOption.intern() != "2"
                && menuOption.intern() != "3" && menuOption.intern() != "4" && menuOption.intern() != "5") {
            System.err.println("Valor inválido!");
            System.err.println("Informe uma opção novamente: ");
            menuOption = input.next();
        }
        // Converte o menuOpion para int
        int menuOptionToInt = Integer.parseInt(menuOption);

        String returnOption = " ";
        for (int i = 0; i < 5; i++) {
            if (i == (menuOptionToInt - 1)) {
                returnOption = categorys[i];
            }
        }
        return returnOption;
    }

    public static void cart(){
        
    }

    public static void main(String[] args) {
        String[] categorys = categorys();
        String menuOption = menuOption(categorys);
        System.out.println(menuOption);
    }
}
