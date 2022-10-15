public class CalculadoraIcm {

    double peso;
    double altura;
    double icm;

    public double icm() {
        double calcAltura = altura * altura;

        icm = peso / calcAltura;
        
        return icm;
    }

    
    
}
