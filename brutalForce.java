import java.util.Scanner;

public class brutalForce {
//    Escreva um programa que implemente uma quebra de senha utilizando o método de força bruta. O programa deve:
//
//    Solicitar que o usuário digite uma senha de 4 dígitos positivos.
//    Testar todas as combinações possíveis de números entre 0000 e 9999 até descobrir qual é a senha.
//    Ao encontrar a senha:
//    Exibir o número de tentativas realizadas.
//    Mostrar o tempo total gasto para quebrar a senha.
//            Notas
//    Para capturar o tempo atual em milissegundos, utilize o seguinte trecho de código:
//            System.currentTimeMillis();
//    Para calcular o tempo gasto, subtraia o tempo final do tempo inicial.

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        long inicio = System.currentTimeMillis ();

        // Validar a senha digitada pelo usuario, se tem 4 digitos e é positiva
        int senha = 0;
        while (true){
            System.out.println("Informe uma senha com quatro digitos positivos: ");
             senha = entrada.nextInt ();
            if (senha >= 1000  && senha <= 9999) {
                break;
            }
        }


        int tentativas = 0;

        for (int i = 0; i < 10000; i++) {
            if (i == senha) {
                System.out.println ( "Senha Localizada: " + i );
                break;
            }
            tentativas++;
        }
        long fim = System.currentTimeMillis ();
        long tempoGasto = ( fim - inicio );

        System.out.println ( "Tentativas: " + tentativas );
        System.out.println ( "Tempo gasto: " + tempoGasto + " Ms " );

        entrada.close ();
    }

}
