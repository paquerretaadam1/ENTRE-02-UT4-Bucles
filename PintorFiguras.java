
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
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
        int ancho = valorInicial;
        for(int contador = valorInicial; contador <= altura; contador++){
            escribirEspacios(ESPACIO, altura - contador);
            int contador2 = valorInicial;
            for(contador2 = valorInicial; contador2 <= contador; contador2++){
                while(ANCHO_BLOQUE >= ancho){
                    System.out.print(CAR1);

                    ancho++;
                }
                contador2++;
                ancho = valorInicial;
                if(contador2 <= contador){
                    while(ANCHO_BLOQUE >= ancho){
                        System.out.print(CAR2);
                        ancho++;
                    }
                }
                ancho = valorInicial;
            }
            System.out.println();
        }
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private void escribirEspacios(char caracter, int n) {
        int ancho = 1;
        for (int fila = 1; fila <= n; fila++){
            ancho = 1;
            while(ANCHO_BLOQUE / 2 >= ancho){
                System.out.print(caracter);
                ancho++;
            }
        }
    }
}
