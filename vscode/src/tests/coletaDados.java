package tests;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class coletaDados {
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

        while (data[2].matches("^[A-Z][a-zA-Z ]+\\s+\\d{1,4}$") == false) {
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
}
