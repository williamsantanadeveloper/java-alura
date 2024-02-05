package exercises.exercise02;

public class ConvercaoTemperatura {
    public static void main(String[] args) {

        double temperaturaEmGrausCelsius = 25.3;
        double convertendoParaFahrenheit = (temperaturaEmGrausCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f em Celsius para Fahrenheit é %f", temperaturaEmGrausCelsius, convertendoParaFahrenheit);

        System.out.println(mensagem);
        //        casting
        int temperaturaEmFahrenheitInteira = (int) convertendoParaFahrenheit;
        System.out.println(temperaturaEmFahrenheitInteira);

    }

}
