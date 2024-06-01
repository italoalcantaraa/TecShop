import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import tests.coletaNum;

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

        // Verifa se contém somente números e também se a opção existe
        while (((menuOption.matches("^\\d+$")) == false) || menuOption.intern() != "1" && menuOption.intern() != "2"
                && menuOption.intern() != "3" && menuOption.intern() != "4" && menuOption.intern() != "5") {
            System.err.println("Valor inválido!");
            System.err.println("Informe uma opção novamente: ");
            menuOption = input.next();
        }
        // Converte o menuOpion para int
        int menuOptionToInt = Integer.parseInt(menuOption);

        return menuOptionToInt;
    }

    public static String[] billInformation() {
        String[] data = new String[7];
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

        System.out.printf(
                "Data de nascimento. Lembrando que não é permitido compras para menores de 18 anos.\nInforme mm/dd/yyyy\n");
        System.out.printf("Mês: ");
        short mesNascimento = coletaNum.ColetaNumero();

        while (mesNascimento < 1 || mesNascimento > 12) {
            System.err.printf("Mês informado é inválido!");
            System.out.printf("Informe o mês novamente: ");
            mesNascimento = coletaNum.ColetaNumero();
        }

        System.out.printf("Informe o dia: ");
        short diaNascimento = coletaNum.ColetaNumero();

        while (diaNascimento < 1 || diaNascimento > 31) {

            System.err.printf("Dia inválido!");
            System.out.printf("Informe o dia novamente: ");
            diaNascimento = coletaNum.ColetaNumero();

            if (mesNascimento == 1 && diaNascimento > 31) {
                System.out.printf("Dia inválido. Janeiro só possui 31 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 2 && diaNascimento > 29) {
                System.out.printf("Dia inválido. Fevereiro só possui 28 dias. Ou 29 quando o ano é bissexto");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 3 && diaNascimento > 31) {
                System.out.printf("Dia inválido. Março só possui 31 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 4 && diaNascimento > 30) {
                System.out.printf("Dia inválido. Abril só possui 30 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 5 && diaNascimento > 31) {
                System.out.printf("Dia inválido. Maio só possui 31 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 6 && diaNascimento > 30) {
                System.out.printf("Dia inválido. Junho só possui 30 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 7 && diaNascimento > 31) {
                System.out.printf("Dia inválido. Julho só possui 31 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 8 && diaNascimento > 31) {
                System.out.printf("Dia inválido. Agosto só possui 31 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 9 && diaNascimento > 30) {
                System.out.printf("Dia inválido. Setembro só possui 30 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 10 && diaNascimento > 31) {
                System.out.printf("Dia inválido. Outubro só possui 31 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 11 && diaNascimento > 30) {
                System.out.printf("Dia inválido. Novembro só possui 30 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            } else if (mesNascimento == 12 && diaNascimento > 31) {
                System.out.printf("Dia inválido. Dezembro só possui 31 dias!");
                System.out.printf("Informe o dia novamente: ");
                diaNascimento = coletaNum.ColetaNumero();
            }
        }

        System.out.printf("Informe o ano: ");
        short anoNascimento = coletaNum.ColetaNumero();

        while (anoNascimento > 2006 || anoNascimento < 1914) {

            if (anoNascimento > 2006) {
                System.err.printf("Ano inválido. Você é menor de idade!");
                System.out.printf("Informe o ano novamente: ");
                anoNascimento = coletaNum.ColetaNumero();
            } else if (anoNascimento < 1914) {
                System.err.printf("Ano inválido. Você possui mais de 110 anos de idade.");
                System.out.printf("Informe o ano novamente: ");
                anoNascimento = coletaNum.ColetaNumero();
            }
        }

        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String teste = dataNascimento.format(formatter);
        System.out.println(teste);

        data[6] = teste;
        System.out.println(data[6]);

        System.out.printf("\nInforme seu CPF(xxx.xxx.xxx-xx): ");
        data[1] = input.nextLine();

        while (data[1].matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$") == false) {
            System.err.printf("=-=-=-CPF INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu CPF novamente: ");
            data[1] = input.nextLine();
        }

        System.out.printf("\nInforme seu logradouro(Nome da rua e N°): ");
        data[2] = input.nextLine();

        while (data[2].matches("^[A-Z][a-zA-Z ]+ N°\\d{1,4}$") == false) {
            System.err.printf("=-=-=-LOGRADOURO INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu Logradouro novamente: ");
            data[2] = input.nextLine();
        }

        System.out.printf("\nInforme o nome de seu bairro: ");
        data[3] = input.nextLine();

        while (data[3].matches("^[A-Z][a-zA-Z]{3,}( [a-zA-Z]+)*$") == false) {
            System.err.printf("=-=-=-BAIRRO INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu bairro novamente: ");
            data[3] = input.nextLine();
        }

        System.out.printf("\nInforme seu CEP(xxxxx-xxx): ");
        data[4] = input.nextLine();

        while (data[4].matches("^\\d{5}-\\d{3}$") == false) {
            System.err.printf("=-=-=-CEP INVÁLIDO-=-=-=\n");
            System.out.printf("Insira seu CEP novamente: ");
            data[4] = input.nextLine();
        }

        System.out.printf("\nInforme sua cidade(Sao Paulo-SP): ");
        data[5] = input.nextLine();

        while (data[5].matches("^[A-Z][a-zA-Z ]+-[A-Z]{2}") == false) {
            System.err.printf("=-=-=-CIDADE INVÁLIDA-=-=-=\n");
            System.out.printf("Insira sua cidade novamente: ");
            data[5] = input.nextLine();
        }

        return data;
    }

    public static void cart() {

    }

    public static double[] productsPrice(int menuOption) {
        double[] peripheralsPrice = new double[] { 129.99, 899.99, 429.99, 94.99, 299.99, 154.99, 129.99, 134.99,
                129.99, 79.99 };
        double[] videoCardPrice = new double[] { 690.00, 399.60, 749.99, 1949.99, 849.99, 1350.00, 2779.00, 2499.99,
                1449.99, 3199.99 };
        double[] alimentationPrice = new double[] { 269.99, 279.99, 299.99, 239.99, 269.99, 249.99, 239.99, 489.99,
                399.99, 659.99 };
        double[] storagePrice = new double[] { 156.90, 395.99, 319.99, 99.00, 174.99, 178.42, 239.99, 199.99, 224.10,
                179.99 };
        double[] processingPrice = new double[] { 159.99, 159.99, 159.99, 159.99, 159.99, 159.99, 159.99, 159.99,
                129.99, 300.00, 569.99, 229.99, 529.99, 594.99, 1798.99, 1149.99, 2348.99 };

        double[] productsPrice = new double[] {};

        switch (menuOption) {
            case 1:
                productsPrice = new double[processingPrice.length];
                productsPrice = processingPrice;
                break;

            case 2:
                productsPrice = new double[storagePrice.length];
                productsPrice = storagePrice;
                break;
            case 3:
                productsPrice = new double[alimentationPrice.length];
                productsPrice = alimentationPrice;
                break;
            case 4:
                productsPrice = new double[videoCardPrice.length];
                productsPrice = videoCardPrice;
                break;
            case 5:
                productsPrice = new double[peripheralsPrice.length];
                productsPrice = peripheralsPrice;
                break;
            default:
                System.err.println("Error");
                break;
        }

        return productsPrice;
    }

    public static String[] products(int menuOption) {
        String[] peripherals = new String[] {
                "MOUSE GAMER AOC GM510, RGB, 16000 DPI, 6 BOTOES ",
                "MOUSE GAMER RAZER BASILISK V3, RGB, 26000DPI, 11 BOTOES, PRETO",
                "MOUSE GAMER HYPERX PULSEFIRE HASTE, WIRELESS, RGB, 16000DPI, 6 BOTOES, PRETO ",
                "TECLADO PHILIPS SPK6308, ABNT2, WIRELESS, PRETO ",
                "TECLADO MECANICO REDRAGON VILI ",
                "TECLADO MECANICO MARVO KG901C ",
                "CAIXA DE SOM LOGITECH S150 ",
                "HEADSET MARVO HG9086, 7.1 SURROUND, DRIVERS 40MM ",
                "WEBCAM LOGITECH C270 HD 720P ",
                "MOUSEPAD RAZER GOLIATHUS COSMIC SPEED MEDIO" };
        String[] videoCard = new String[] {
                "Placa De Vídeo BRX, AMD RX 580, 8GB, GDDR 5, 256Bit",
                "Placa de Vídeo Afox AMD Radeon RX 550, 4GB GDDR5, 128 Bits",
                "Placa de Vídeo GTX 1650 D6 Ventus XS OCV3 MSI NVIDIA GeForce, 4GB GDDR6",
                "Placa de Vídeo RTX4060 1-Click OC 2X TecLab Lite GALAX NVIDIA GeForce, 8GB GDDR6",
                "Placa de Vídeo Galax NVIDIA GeForce GTX 1650 EX Plus (1-Click OC), 4GB, GDDR6 ",
                "Placa de Vídeo Gigabyte Radeon RX 6600 EAGLE AMD, 8GB GDDR6",
                "Placa de Vídeo RTX 4060 Ti Eagle OC Gigabyte NVIDIA GeForce, 8 GB GDDR6, DLSS, Ray Tracing",
                "Placa de Vídeo RTX 4060 TI XLR8 Gaming Verto Epic-x PNY NVIDIA GeForce, 8GB GDDR6, ARGB, DLSS, Ray Tracing, G-Sync ",
                "Placa de Vídeo RTX 3050 ASUS O6G Dual NVIDIA GeForce, 6GB GDDR6, DLSS, Ray Tracing, G-Sync",
                "Placa de Vídeo RTX 4060 TI Rog-Strix O8G Gaming NVIDIA GeForce, 8GB GDDR6, ARGB, DLSS, Ray Tracing, G-Sync - ROG-STRIX-RTX4060TI-O8G-GAMING" };
        String[] alimentation = new String[] {
                "Fonte MSI MAG A650BN, 650W",
                "Fonte Cooler Master MWE Bronze V2 Full Range, 550W",
                "Fonte Corsair CV550, 550W",
                "Fonte Gigabyte GP-P450B, 450W",
                "Fonte MSI MAG A550BN, 550W",
                "Fonte Gamemax GS600, 600W",
                "Fonte MSI MAG A500DN, 500W",
                "Fonte XPG Kyber, 850W",
                "Fonte Corsair CV650, 650W",
                "Fonte MSI MAG A850GL, 850W" };
        String[] storage = new String[] {
                "Disco Rígido HD Western Digital, 500GB",
                "HD Seagate 2TB BarraCuda, 3.5', SATA",
                "HD WD Blue 1TB, 3.5', SATA",
                "Hd Sata Seagate 250gb",
                "SSD 240 GB Kingston A400, SATA",
                "SSD Kingston A400 240GB, SATA",
                "SSD 480 GB Kingston A400, SATA",
                "SSD Kingston NV2 250 GB, M.2 2280 PCIe",
                "SSD Kingston A400 240GB 2.5 polegadas, Sata Iii",
                "SSD 256 GB XPG S41 TUF, M.2 PCIe NVME, HEATSINK" };
        String[] processing = new String[] {
                "Memória Kingston Fury Beast, 8GB, 3200MHz, DDR4",
                "Memória XPG Gammix D35, 8GB, 3200MHz, DDR4",
                "Memória Kingston Fury Beast, RGB, 16GB, 3200MHz, DDR4",
                "Memória Kingston Fury Beast, 32GB (2x16GB), 2666MHz, DDR4",
                "Memória Rise Mode Z, 16GB, 3200MHz, DDR4",
                "Processador Intel Core i3-10105, 3.7GHz (4.4GHz Max Turbo), Cache 6MB, Quad Core, 8 Threads",
                "Processador Intel Core i5-10400F, 2.9GHz (4.3GHz Max Turbo), Cache 12MB, 6 Núcleos, 12 Threads",
                "Processador Intel Core i7-12700, Cache 25MB, 2.1GHz (4.9GHz Max Turbo)",
                "PROCESSADOR Intel Core i7-10700F, 2.9GHZ (4.8GHZ Turbo), Cache 16MB, 8-CORE, 16-Threads,",
                "Processador Intel Core i9-12900KF, 3.2GHz (5.2GHz Max Turbo), Cache 30MB, 16 Núcleos, 24 Threads" };

        String[] products = new String[] {};

        switch (menuOption) {
            case 1:
                products = new String[processing.length];
                products = processing;
                break;
            case 2:
                products = new String[storage.length];
                products = storage;
                break;
            case 3:
                products = new String[alimentation.length];
                products = alimentation;
            case 4:
                products = new String[videoCard.length];
                products = videoCard;
                break;
            case 5:
                products = new String[peripherals.length];
                products = peripherals;
                break;
            default:
                System.out.println("Erro");
        }

        return products;
    }

    public static void showProducts(String[] products, double[] productsPrice) {
        System.out.println("\n-PRODUTOS-\n");
        for (int i = 0; i < products.length; i++) {
            System.out.println("\n" + products[i]);
            System.out.println("Preço: " + productsPrice[i]);
        }
    }

    public static int selectOption(String[] products, double[] productsPrice) {

        Scanner input = new Scanner(System.in);

        System.out.println("Selecione um produto: ");
        String selectProduct = input.next();

        // Verifica se há somente números e se a posição existe
        while (((selectProduct.matches("^\\d+$")) == false) || selectProduct.intern() != "1"
                && selectProduct.intern() != "2" && selectProduct.intern() != "3"
                && selectProduct.intern() != "4" && selectProduct.intern() != "5" && selectProduct.intern() != "6"
                && selectProduct.intern() != "7" && selectProduct.intern() != "8" && selectProduct.intern() != "9"
                && selectProduct.intern() != "10") {

            System.err.println("Valor inválido!");
            System.err.println("Informe uma opção novamente: ");
            selectProduct = input.next();
        }
        int selectProductToInt = Integer.parseInt(selectProduct);

        return selectProductToInt - 1;
    }

    public static void showProductsSelected(String[] products, double[] productsPrice, int selectOptionSelected) {
        System.out.println("\nProduto selecionado: " + products[selectOptionSelected]);
        System.out.println("Preço: " + productsPrice[selectOptionSelected]);
    }

    public static void main(String[] args) {
        String[] categorys = categorys();
        int menuOption = menuOption(categorys);
        String[] products = products(menuOption);
        double[] productsPrice = productsPrice(menuOption);
        showProducts(products, productsPrice);
        int selectOptionSelected = selectOption(products, productsPrice);
        showProductsSelected(products, productsPrice, selectOptionSelected);
    }
}
