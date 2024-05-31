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
    public static String[] billInformation() {
        String[] data = new String[6];
        Scanner input = new Scanner(System.in);

        System.out.printf("Para prosseguirmos com a sua compra, necessitamos que informe alguns dados:\n");
        System.out.println("\nInsira seu nome sem caracteres especiais.");
        System.out.printf("Informe seu nome completo: ");
        data[0] = input.nextLine();

        while (data[0].matches("^[A-Z][a-zA-Z]{2,}( [a-zA-Z]+)*$") == false) {
            System.err.printf("=-=-=-NOME INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu nome completo novamente: ");
            data[0] = input.nextLine();
        }

        System.out.printf("\nInforme seu CPF(xxx.xxx.xxx-xx): ");
        data[1] = input.nextLine();

        while (data[1].matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$") == false) {
            System.err.printf("=-=-=-CPF INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu CPF novamente: ");
            data[1] = input.nextLine();
        }
        
        System.out.printf("\nInforme seu logradouro(Nome da rua e N°): ");
        data[2] = input.nextLine();
        
        while(data[2].matches("^[A-Z][a-zA-Z ]+ N°\\d{1,4}$") == false){
            System.err.printf("=-=-=-LOGRADOURO INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu Logradouro novamente: ");
            data[2] = input.nextLine();
        }
        
        System.out.printf("\nInforme o nome de seu bairro: ");
        data[3] = input.nextLine();
        
        while(data[3].matches("^[A-Z][a-zA-Z]{3,}( [a-zA-Z]+)*$") == false){
            System.err.printf("=-=-=-BAIRRO INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu bairro novamente: ");
            data[3] = input.nextLine();
        }
        
        System.out.printf("\nInforme seu CEP(xxxxx-xxx): ");
        data[4] = input.nextLine();
        
        while(data[4].matches("^\\d{5}-\\d{3}$") == false){
            System.err.printf("=-=-=-CEP INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu CEP novamente: ");
            data[4] = input.nextLine();
        }
        
        System.out.printf("\nInforme sua cidade(Sao Paulo-SP): ");
        data[5] = input.nextLine();
        
        while(data[5].matches("^[A-Z][a-zA-Z ]+-[A-Z]{2}") == false){
            System.err.printf("=-=-=-CIDADE INVÁLIDA-=-=-=\n");
            System.out.printf("Insira sua cidade novamente: ");
            data[5] = input.nextLine();
        }
        
        return data;
    }


    public static void cart(){
        
    }

    public static void main(String[] args) {
        String[] categorys = categorys();
        String menuOption = menuOption(categorys);
        System.out.println(menuOption);
    }
}
