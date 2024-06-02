package pagamento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;
import tests.coletaDados;
import tests.coletaNum;

public class Pagamento {

    public static void Pagamento(double total){
    String[] dadosPessoais = coletaDados.billInformation();

    System.out.println("\nQual a forma de pagamento que deseja escolher?");
    System.out.println("Opções:\n1-Pix\n2-Cartão\n3-Boleto");
    System.out.printf("\nInforme sua opção de pagamento: ");
    short escolha = coletaNum.ColetaNumero();
    
    while(escolha != 1 & escolha != 2 & escolha != 3){
      System.out.println("Opção inválida, tente novamente");
      System.out.println("Opções: \n 1-Pix\n 2-Cartão\n 3-Boleto");
      escolha = coletaNum.ColetaNumero();
    }

    switch(escolha){
      case 1:
        Pix(total, dadosPessoais);
        break;
      case 2:
        Cartao(total, dadosPessoais);
        break;
      case 3:
        Boleto(total, dadosPessoais);
        break;
    }
  }

  public static void Pix(double total, String[] dadosPessoais){
    //qrcode
    System.out.println("\nQual das Opções: " + " 1-Qrcode" + " 2-Chave Pix" + " 3-Codigo");
    System.out.printf("Informe a opção: ");
    short escolha = coletaNum.ColetaNumero();
    
    while(escolha != 1 & escolha != 2 & escolha != 3){
      System.out.println("Opção inválida, tente novamente");
      System.out.println("Opções: \n 1-Pix\n 2-Cartão\n 3-Boleto");
      System.out.printf("Informe a opção: ");
      escolha = coletaNum.ColetaNumero();
    }
    
    switch(escolha){
      case 1:
        QRCodeGenerator.qrCode();
        break;
      case 2:
        System.out.println("A chave é pix: techchop@banco.com.br\n");
        break;
      case 3:
        System.out.println("Seu código pix é: 00020101021226860014BR.GOV.BCB.PIX0114123e4567-e89b-12d3-a456-4266141740005204000053039865406123.455802BR5909techchop6009SaoPaulo6207050312345678906304ABCD\r\n");
        break;
    }
  }

  public static void Cartao(double total, String[] dadosPessoais){
    System.out.println("\nPagar com débito ou crédito?");
    System.out.println("Opções: 1-Débito 2-Credito");
    System.out.printf("Informe a opção: ");
    short escolha = coletaNum.ColetaNumero();
    
    while(escolha != 1 & escolha != 2){
      System.out.println("Opção inválida, tente novamente");
      System.out.println("Opções: \n 1-Débito\n 2-Credito");
      System.out.printf("Informe a opção: ");
      escolha = coletaNum.ColetaNumero();
    }

    switch(escolha){
      case 1:
        System.err.println("Pagamento Sucessido! Obrigado por comprar na TecShop :) \n");
      break;
      case 2:
        boolean c = false;
        short vezes;
      
        do{
          System.err.println("\nEm quantas vezes?");
          System.out.printf("Informe as parcelas: ");
          vezes = coletaNum.ColetaNumero();
          if(vezes >= 0 & vezes <= 12){
            double valor = total/vezes;
            c = true;
            System.err.printf("Pagamento Sucessido! Sua compra parcelada em %dx de R$%.2f", vezes, valor); 
          }
        }while (c == false);
    }
  }

  public static void Boleto(double total, String[] dadosPessoais) {
    Random random = new Random();
    StringBuilder numeroBoleto = new StringBuilder();

    for(byte i = 0; i < 48; i++){
      int o = random.nextInt(10);  
      numeroBoleto.append(o);
    }

    LocalDateTime dataHoraG = LocalDateTime.now();
    //No dia de emissao
    int dia = dataHoraG.getDayOfMonth();
    int mes = dataHoraG.getMonthValue();
    int ano = dataHoraG.getYear();
    LocalDate data = LocalDate.of(ano, mes, dia);

    //Data maxima de pagamento
    int diaMax = dataHoraG.getDayOfMonth();
    
    LocalDate dayMax = LocalDate.of(ano, mes, diaMax).plusDays(5); //cinco dias para pagar
    if (dayMax.getMonthValue() != mes) { // Verifica se o mês mudou
        dayMax = dayMax.with(TemporalAdjusters.firstDayOfNextMonth()); // Ajusta para o início do próximo m
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String DataMaximaF = dayMax.format(formatter);
    String DataemisoraF = data.format(formatter);

    System.out.printf("\n=-=-=-BOLETO BANCÁRIO-=-=-=\n");
    System.out.printf("Informações do comprador | Dados Pessoais:\n");
    System.out.printf("Nome do comprador: %s | CPF: %s | Data de nascimento: %s\n", dadosPessoais[0], dadosPessoais[1], dadosPessoais[6]);
    System.out.printf("Endereço:\nLogradouro: %s | Bairro: %s | CEP: %s | Cidade: %s\n", dadosPessoais[2], dadosPessoais[3], dadosPessoais[4], dadosPessoais[5]);
    System.out.println("Numero do Boleto: " + numeroBoleto + "\nData de emissao: " + DataemisoraF + " | Data de vencimento: " + DataMaximaF + "\nTotal a pagar: " + total);  
}
}
