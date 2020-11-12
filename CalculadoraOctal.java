
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Pedro J. Aquerreta
 * 
 */
public class CalculadoraOctal
{
    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int suma = n1 + n2;
        int n = suma;
        int potencia = 10;
        int potencia2 = 1;
        while(n > 0){
            if (n % 10 > 7){
                suma = suma - 8 * potencia2 + potencia; 
            }
            n = n / 10;
            potencia = potencia * 10;
            potencia2 = potencia2 * 10;
        }
        return suma;

    }

}
