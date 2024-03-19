/**
 * @author Humberto Alexander de la Cruz Chanchavac
 * @version 1.0 18/03/2024
 * @Description El programa es un diccionario de Inglés a español, donde todas las traducciones
 *              se almacenan en arbol binario. El programa puede traducir oraciones del archivo
 *              texto.txt y si no ecuntra la palabra en el arbol, entonces duvuelve la palabra entre **
 *              Referencia: https://www.javatpoint.com/binary-tree-java
 */
public class Main {

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.leerArchivo();
        controlador.leerTexto();
    }
}