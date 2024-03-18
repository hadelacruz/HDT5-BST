import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controlador {
    BinaryTree tree = new BinaryTree();

    //Método para leer archivo
    public void leerArchivo(){
        String nombreArchivo = "diccionario.txt";

        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            while (linea != null) {
                String[] partes = linea.split(", ");
                String palabraEnIngles = partes[0].trim();
                String palabraEnEspanol = partes[1].trim();

                //Insertar la información del archivo en el arbol-binario
                tree.insert(new Association<>(palabraEnIngles, palabraEnEspanol));
                linea = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

    }
    
}
