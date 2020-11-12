import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales(){
        char hacerSuma = 'S';
        while(hacerSuma == 'S' || hacerSuma == 's'){
            Pantalla.borrarPantalla();
            System.out.print("Dime un numero: ");
            int n1 = teclado.nextInt();        
            System.out.print("Dime otro numero: ");
            int n2 = teclado.nextInt();

            if( !Utilidades.estaEnOctal(n1) || !Utilidades.estaEnOctal(n2)){
                System.out.println("Alguno de los números no está en octal.");
            }
            else if( Utilidades.contarCifras(n1) != Utilidades.contarCifras(n2)){
                System.out.println("No tienen el mismo numero de cifras.");
            }
            else{
                int suma = calculadora.sumarEnOctal(n1 , n2);
                System.out.println("***********************************");
                System.out.println(String.format("%25d\n%25d\n%15s%10d",
                        n1, n2,"Suma octal:", suma ));
            }
            teclado.nextLine();
            System.out.println("Quiere hacer otra suma en octal? (S / s)");
            hacerSuma = teclado.nextLine().charAt(0);
        }
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras(){
        Pantalla.borrarPantalla();
        System.out.println("Dime la altura de la piramide: ");
        int altura = teclado.nextInt();
        while( altura <= 0 || altura > 10){
            System.out.println("Error, dime una altura válida (entre 1 y 10): ");
            altura = teclado.nextInt();
        }
        pintor.dibujarFigura(altura);
    }

}
