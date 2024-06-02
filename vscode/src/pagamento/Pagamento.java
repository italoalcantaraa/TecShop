package pagamento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;
import tests.coletaNum;
import tests.coletaDados;

public class Pagamento {

    public static void Pagamento(double total){
    String[] dadosPessoais = coletaDados.billInformation();

    System.out.println("Qual a forma de pagamento que deseja escolher?\n");
    System.out.println("Opções: \n 1-Pix\n 2-Cartão\n 3-Boleto\n");
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
    System.out.println("Qual das Opções: " + " 1-Qrcode" + " 2-Chave Pix" + " 3-Codigo\n");
    short escolha = coletaNum.ColetaNumero();
    
    while(escolha != 1 & escolha != 2 & escolha != 3){
      System.out.println("Opção inválida, tente novamente");
      System.out.println("Opções: \n 1-Pix\n 2-Cartão\n 3-Boleto");
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
        System.out.println("A codigo é pix: 00020101021226860014BR.GOV.BCB.PIX0114123e4567-e89b-12d3-a456-4266141740005204000053039865406123.455802BR5909techchop6009SaoPaulo6207050312345678906304ABCD\r\n");
        break;
    }
  }

  public static void Cartao(double total, String[] dadosPessoais){
    System.out.println("Pagar com débito ou crédito?\n");
    System.out.println("Opções: 1-Débito 2-Credito\n");
    short escolha = coletaNum.ColetaNumero();
    
    while(escolha != 1 & escolha != 2){
      System.out.println("Opção inválida, tente novamente");
      System.out.println("Opções: \n 1-Débito\n 2-Credito\n");
      escolha = coletaNum.ColetaNumero();
    }

    switch(escolha){
      case 1:
        System.err.println("Pagamento Sucessido :)!\n");
      break;
      case 2:
        boolean c = false;
        short vezes;
      
        do{
          System.err.println("Em quantas vezes?\n");
          vezes = coletaNum.ColetaNumero();
          if(vezes >= 0 & vezes <= 12){
            double valor = total/vezes;
            c = true;
            System.err.println("Pagamento Sucessido, no valor de " + valor + " por mês: " + vezes);  
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

    String [] dados = coletaDados.billInformation();


    System.out.println("Numero do Boleto: " + numeroBoleto + "\nData de emissao: " + DataemisoraF + " Data de vencimento: " + DataMaximaF + " Total a pagar: " + total);
    System.out.println(dados[0]);
}
}
