import java.util.Locale;
import java.util.Scanner;

public class ScannerEntradas {
    public static void main(String[] args) {

        String icm = "";

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        CalculadoraIcm icmCalc = new CalculadoraIcm();

        System.out.println("Como podemos te chamar?");
        String name = scanner.next();
        
        System.out.println("Qual sua altura?");
        double altura  = scanner.nextDouble();
        
        System.out.println("Quantos kg você tem?");
        double peso = scanner.nextDouble();

       icmCalc.altura = altura;
       icmCalc.peso = peso;

       icmCalc.icm();

       System.out.println(icmCalc.icm);

       if(icmCalc.icm < 18.5){
        icm = "Abaixo do peso";
       }
       else if(icmCalc.icm >= 18.5 && icmCalc.icm <= 24.9){
        icm = "Peso normal";
       }
       else if(icmCalc.icm >= 25 && icmCalc.icm <= 29.9){
        icm = "Sobrepeso";
       }
       else if(icmCalc.icm >= 30 && icmCalc.icm <= 34.9){
        icm = "Obesidade grau 1";
       }
       else if(icmCalc.icm >= 35.5 && icmCalc.icm <= 39.9){
        icm = "Obesidade grau 2";
       }
       else if(icmCalc.icm >= 40){
        icm = "Obesidade grau 3";
       }

        System.out.println("Oi " + name);
        System.out.println("Calculamos seu ICM e você está: " + icm);
    }
}
