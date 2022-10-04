package exemplo01;

public class Exemplo01 {

    public static void main(String[] ags) {
        //[TIPO] NOME;
        int numeroInteiro;
        double numeroDouble;

        numeroDouble = 12;
        numeroDouble = 4.99999;

//       numeroDouble = numeroInteiro;
        numeroInteiro = (int) numeroDouble; // casting

        System.out.println("resposta = "+ numeroInteiro);
        System.out.println(numeroDouble);

        numeroDouble = (3 + 5) * 2;

        System.out.println(numeroDouble);
    }
}
