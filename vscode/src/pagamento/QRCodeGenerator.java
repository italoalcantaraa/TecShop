package pagamento;

public class QRCodeGenerator {
    public static void qrCode() {
        String url = "https://example.com";
        int size = 30; // Tamanho do QR code

        // Matriz representando o QR code
        boolean[][] qrCode = new boolean[size][size];
        qrCode = quadrado1A(qrCode);
        qrCode = quadrado1B(qrCode);
        qrCode = quadrado1C(qrCode);

        qrCode = quadrado2A(qrCode);
        qrCode = quadrado2B(qrCode);
        qrCode = quadrado2C(qrCode);
        
        qrCode = Retangulo1(qrCode);
        qrCode = Retanguluzao(qrCode);

        qrCode = quadrado3A(qrCode);
        qrCode = quadrado3B(qrCode);
        qrCode = quadrado3C(qrCode);

        qrCode = Retangulu(qrCode);

        System.out.println(qrCode);
        // Desenho do QR code no terminal
        for (boolean[] row : qrCode) {
            for (boolean pixel : row) {
                System.out.print(pixel ? "███" : "   "); // Usando caracteres ASCII para representar pixels
            }
            System.out.println();
        }
    }
    ///Primeiro Quadrado do QRcode
    public static boolean[][] quadrado1A(boolean[][] qrCode){
        for(byte i = 0; i < 8; i++){
            byte j = 0; //coluna 1
            qrCode[i][j] = true;
            j = 6; //coluna 7
            qrCode[i][j] = true;
        }
        for(byte j = 0; j < 7; j++){
            qrCode[8][j] = true;

            qrCode[0][j] = true;
        }
        return qrCode;
    }

    public static boolean[][] quadrado1B(boolean[][] qrCode){
        for(byte i = 1; i < 8; i++){
            qrCode[i][1] = false; 

            qrCode[i][5] = false; 
        }
        for(byte j = 1; j < 6; j++){
            qrCode[1][j] = false; 

            qrCode[7][j] = false; 
        }
        return qrCode;
    }

    public static boolean[][] quadrado1C(boolean[][] qrCode){
        for(byte i = 2; i < 7; i++){ 
            qrCode[i][2] = true; 

            qrCode[i][4] = true; 
        }
        for(byte j = 2; j < 5; j++){
            qrCode[2][j] = true; 

            qrCode[6][j] = true; 
        }
        return qrCode;
    }

    //O erro tá a pc e a cadeira
    ///Segundo Quadrado do QRcode
    public static boolean[][] quadrado2A(boolean[][] qrcode){
        for(byte i = 0; i < 9; i++){
            qrcode[i][23] = true;

            qrcode[i][29] = true;
        }
        for(byte j = 23; j < 29; j++){
            qrcode[0][j] = true;

            qrcode[8][j] = true;
        }
        return qrcode;
    }

    public static boolean[][] quadrado2B(boolean[][] qrcode){
        for(byte i = 1; i < 7; i++){
            qrcode[i][24] = false;

            qrcode[i][28] = false;
        }
        for(byte j = 24; j < 28; j++){
            qrcode[1][j] = false;

            qrcode[7][j] = false;
        }
        return qrcode;
    }

    public static boolean[][] quadrado2C(boolean[][] qrcode){
        for(byte i = 2; i < 7; i++){
            qrcode[i][25] = true;

            qrcode[i][27] = true;
        }
        for(byte j = 25; j < 27; j++){
            qrcode[2][j] = true;

            qrcode[6][j] = true ;
        }
        return qrcode;
    }

    public static boolean[][] Retangulo1(boolean[][] qrcode) {
        for (byte i = 0; i < 8; i++) {
            for (byte j = 7; j < 22; j++) {
                if ((i == 0 && j == 9) || (i == 0 && j == 11) || (i == 1 && j == 10) || (i == 2 && j == 11) || (i == 3 && j == 10) || (i == 0 && j == 11) || (i == 3 && j == 13) || (i == 4 && j == 11) || (i == 0 && j == 12) || (i == 5 && j == 11) || (i == 5 && j == 12) || (i == 6 && j == 10) || (i == 6 && j == 11) || (i == 6 && j == 12) || (i == 7 && j == 10) || (i == 7 && j == 11) || (i == 6 && j == 12) || (i == 7 && j == 9) || (i == 7 && j == 10) || (i == 7 && j == 11) || (i == 8 && j == 9) || (i == 8 && j == 10) || (i == 9 && j == 11) || (i == 3 && j == 13) || (i == 3 && j == 15) || (i == 4 && j == 15) || (i == 4 && j == 14) || (i == 3 && j == 16) || (i == 5 && j == 15) || (i == 5 && j == 14) || (i == 5 && j == 16) || (i == 6 && j == 15) || (i == 6 && j == 14) || (i == 6 && j == 16) || (i == 6 && j == 17) || (i == 7 && j == 15) || (i == 7 && j == 14) || (i == 5 && j == 16) || (i == 8 && j == 15) || (i == 6 && j == 18) || (i == 8 && j == 18) || (i == 1 && j == 18) || (i == 1 && j == 19) || (i == 2 && j == 18) || (i == 2 && j == 19) || (i == 3 && j == 18) || (i == 3 && j == 19) || (i == 4 && j == 18) || (i == 4 && j == 19) || (i == 4 && j == 20) || (i == 6 && j == 21) || (i == 6 && j == 22) || (i == 7 && j == 20) || (i == 7 && j == 21) || (i == 7 && j == 22) || (i == 8 && j == 22)) {
                    qrcode[i][j] = true;
                } else {
                    qrcode[i][j] = false;
                }
            }
        }
        return qrcode;
    }

    public static boolean[][] Retanguluzao(boolean[][] qrcode){
        for(byte i = 9; i < 21;i++){
            for(byte j = 0; j < 30; j++){
                if ((i == 12 && (j >= 8 && j <= 10)) ||
                    (i == 10 && j == 11) ||
                    (i == 11 && (j >= 11 && j <= 14)) ||
                    (i == 13 && (j >= 8 && j <= 11)) ||
                    (i == 11 && (j >= 20 && j <= 21)) ||
                    (i == 12 && (j >= 20 && j <= 23)) ||
                    (i == 13 && (j >= 19 && j <= 22)) ||
                    (i == 12 && (j >= 27 && j <= 28)) ||
                    (i == 10 && j == 30) ||
                    (i >= 17 && i < 20 && (j >= 1 && j <= 5)) ||
                    (i >= 14 && i <= 15 && (j >= 21 && j <= 28)) ||
                    (i == 14 && (j >= 7 && j <= 12)) ||
                    (i == 18 && (j >= 25 && j <= 27)) ||
                    (i == 16 && (j >= 17 && j <= 19)) ||
                    (i == 16 && (j >= 10 && j <= 13)) ||
                    (i == 16 && (j >= 25 && j <= 28))) {
                    qrcode[i][j] = true;
                } else {
                    qrcode[i][j] = false;
                }
            }
        }
        return qrcode;
    }

    public static boolean[][] quadrado3A(boolean[][] qrcode){
        for(byte i = 21; i < 30; i++){
            qrcode[i][0] = true;

            qrcode[i][6] = true;
        }
        for(byte j = 0; j < 7; j++){
            qrcode[21][j] = true;

            qrcode[29][j] = true;
        }
        return qrcode;
    }

    public static boolean[][] quadrado3B(boolean[][] qrcode){
        for(byte i = 1; i < 7; i++){
          qrcode[i][1] = false;
          qrcode[i][5] = false; 
        }
        for(byte j = 1; j < 6; j++){
           qrcode[22][j] = false;
           qrcode[28][j] = false;
        }
        return qrcode;
    }

    public static boolean[][] quadrado3C(boolean[][] qrcode){
        for(byte i = 23; i < 28; i++){
            qrcode[i][2] = true;

            qrcode[i][4] = true;
        }
        for(byte j = 2; j < 5; j++){
            qrcode[23][j] = true;

            qrcode[27][j] = true;
        }
        return qrcode;
    }

    public static boolean[][] Retangulu(boolean[][] qrcode){
        for(byte i = 21; i < 30;i++){
            for(byte j = 7; j < 30; j++){
                if ((i == 22 && (j >= 13 && j <= 19 || j == 24 || j == 25 || j >= 28 && j <= 29)) ||
                (i == 23 && (j >= 9 && j <= 13)) ||
                (i == 24 && (j >= 8 && j <= 13 || j >= 15 && j <= 20)) ||
                (i == 25 && (j >= 10 && j <= 13 || j >= 15 && j <= 27 || j == 29 || j == 30)) ||
                (i == 27 && (j >= 8 && j <= 10)) ||
                (i == 28 && (j >= 9 && j <= 23)) ||
                (i == 0 && j == 24) ||
                (i == 30 && (j >= 25 && j <= 27 || j >= 12 && j <= 13)) ||
                (i == 29 && (j >= 27 && j <= 28))) {
                    qrcode[i][j] = true;
                } else {
                    qrcode[i][j] = false;
                }
            }
        }
        return qrcode;
    }

    public static boolean[][] generateQRCode(String url, int size) {
        boolean[][] qrCode = new boolean[size][size];

        // Simulação de um QR code simples usando lógica básica
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                qrCode[i][j] = (i + j) % 2 == 0; // Alternando pixels para simular um QR code
            }
        }

        return qrCode;
    }
}