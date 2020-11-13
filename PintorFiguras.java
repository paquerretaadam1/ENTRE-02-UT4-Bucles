
/**
 *  Clase que dibuja una figura 
 * 
 * @author - Pedro J. Aquerreta
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';

    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public void dibujarFigura(int altura) {
        int valorInicial = 1;
        for(int contador = valorInicial; contador <= altura; contador++){               //nº de filas
            escribirEspacios(ESPACIO, altura - contador);
            for(int contador2 = valorInicial; contador2 <= contador; contador2++){      
                for(int ancho = valorInicial;ancho <= ANCHO_BLOQUE; ancho++  ){
                    System.out.print(CAR1);
                }
                ++contador2;
                if(contador2 <= contador){
                    for(int ancho = valorInicial;ancho <= ANCHO_BLOQUE; ancho++  ){
                        System.out.print(CAR2);
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private void escribirEspacios(char caracter, int n) {
        for (int fila = 1; fila <= n; fila++){
            for(int ancho = 1;ancho <= ANCHO_BLOQUE / 2; ancho++  ){
                System.out.print(caracter);
            }
        }
    }
}
