import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma1;
        double soma2;
        double subtração1;
        double subtração2;
        double divisao1;
        double divisao2;
        double multiplicação1;
        double multiplicação2;
        
        

        // soma
        System.out.println("Qual o primeiro numero da soma?");
            soma1 = scanner.nextDouble();

        
        System.out.println("Qual o segundo numero da soma?");
            soma2 = scanner.nextDouble();
            double resultadoSoma = soma1+soma2;

        System.out.println("A soma de: " + soma1 + " e " + soma2 + " = "+ resultadoSoma);


        //subtração
        System.out.println("Qual o primeiro numero da subtração?");
             subtração1 = scanner.nextDouble();

        System.out.println("Qual o segundo numero da subtração?");
             subtração2 = scanner.nextDouble();

             double resultadoSubtracao = subtração1 - subtração2;
             
        System.out.println("A subtração de: " + subtração1 + " e " + subtração2 + " = "+ resultadoSubtracao);


        //divisão
        System.out.println("Qual o primeiro numero da divisão?");
            divisao1 = scanner.nextDouble();

        System.out.println("Qual o segundo numero da divisão?");
            divisao2 = scanner.nextDouble();

             
             double resultadoDiv = divisao1 / divisao2;
             
        System.out.println("A divisão de: " + divisao1 + " e " + divisao2 + " = "+ resultadoDiv);

        //multiplicação
        System.out.println("Qual o primeiro numero da multiplicação?");
            multiplicação1 = scanner.nextDouble();

        System.out.println("Qual o segundo numero da multiplicação?");
            multiplicação2 = scanner.nextDouble();

        double resultadoMult = multiplicação1 * multiplicação2;
        System.out.println("A multiplicação de: " + multiplicação1 + " e " + multiplicação2 + " = "+ resultadoMult);


             

       scanner.close();
    }
    
}
