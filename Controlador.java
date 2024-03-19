import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Controlador {
    BinaryTree tree = new BinaryTree();

    // Método para leer el diccionario desde un archivo y insertarlo en el árbol binario
    public void leerArchivo() {
        String nombreArchivo = "diccionario.txt";

        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea != null) {
                // Eliminar caracteres no deseados y dividir por el espacio
                String[] partes = linea.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]", "").split("\\s+");
                if (partes.length == 2) {
                    String palabraEnIngles = partes[0].trim(); // Eliminar espacios alrededor de la palabra en inglés
                    String palabraEnEspanol = partes[1].trim(); // Eliminar espacios alrededor de la palabra en español
                  
                    // Insertar la información del archivo en el árbol binario
                    tree.insert(new Association<>(palabraEnIngles, palabraEnEspanol));

                } else {
                    System.err.println("Formato incorrecto en la línea: " + linea);
                }

                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
  

    //Método para leer el texto en inglés
    public void leerTexto(){
        String archivo = "texto.txt";

        try {
            File file = new File(archivo);
            Scanner scanner = new Scanner(file);

            // Iterar sobre cada línea del archivo
            while (scanner.hasNextLine()) {
                // Leer la línea actual
                String line = scanner.nextLine();
                String[] words = line.split(" ");

                for (String word : words) {
                    //Buscar cada palabra en el arbol
                    Association palabra = tree.search(word.toLowerCase());
                    if(palabra != null){
                        System.out.print(palabra.getValue() +" ");
                    }else{
                        System.out.print("*"+word+"* ");
                    }
                    
                }
            }
            scanner.close();
            
        } catch (FileNotFoundException e) {
            // Manejar la excepción si el archivo no se encuentra
            e.printStackTrace();
        }

    }
    
}
