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


        // Validar a senha digitada pelo usuario, se tem 4 digitos e é positiva
        String senha = "";

        while (true){
            System.out.println("Informe uma senha com quatro digitos positivos: ");
             senha = entrada.nextLine ();
            if (senha.length () == 4 ) {
                break;
            }
            for (int i = 0; i < senha.length (); i++) {
                if ( senha.charAt ( i ) < '0' || senha.charAt ( i ) > '9' ) {
                    System.out.println ( "Senha invalida, digite novamente" );
                }
            }
        }

        int tentativas = 0;

        long inicio = System.currentTimeMillis ();
        String senhaLocalizada = "";
//        for ( int i = 0; i < senha.length (); i++ ) {
//            // Validar se a senha é igual a senha digitada pelo usuario
//            for ( int j = 0; j < 10; j++ ) {
//                if (j == senha.charAt(i)) {
//                    senhaLocalizada = senhaLocalizada + j;
//                    System.out.println ( "Senha Localizada: " + senhaLocalizada );
//                    break;
//                }
//            }
//
//            }
        for (int i = 0; i < senha.length(); i++) {
            for (int j = 0; j < 10; j++) {
                tentativas++;
                if (Character.forDigit(j, 10) == senha.charAt(i)) {
                    senhaLocalizada = senhaLocalizada + j;
                    break;
                }
            }
        }

        long fim = System.currentTimeMillis ();
        long tempoGasto = ( fim - inicio );

        System.out.println ( "Tentativas: " + tentativas );
        System.out.println ( "Tempo gasto: " + tempoGasto + " Ms " );
        System.out.println ( "Senha Localizada: " + senhaLocalizada );

        entrada.close ();
    }

}
