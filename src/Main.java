
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("O ano de lançamento é " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        float notaDoFilme = 8.1f;

        // Média calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com com galã dos anos 80
                 """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);


    }
}