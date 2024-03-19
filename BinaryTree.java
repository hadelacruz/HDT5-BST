
public class BinaryTree {
     Node root;

    // Método para insertar un nodo en el árbol
     public Node insert(Node node, Association<String, String> value) {
        // Si el árbol está vacío, crea un nuevo nodo y devuelve
        if (node == null) {
            return new Node(value);
        }

        // Compara la llave del nuevo nodo con la llave del nodo actual
        int comparison = value.getKey().compareTo(node.value.getKey());

        // Si la llave del nuevo nodo es menor, inserta en el subárbol izquierdo
        if (comparison < 0) {
            node.left = insert(node.left, value);
        }
        // Si la llave del nuevo nodo es mayor, inserta en el subárbol derecho
        else if (comparison > 0) {
            node.right = insert(node.right, value);
        }
        
        return node;
    }

    // Método público para insertar un nuevo nodo en el árbol
    public void insert(Association<String, String> value) {
        root = insert(root, value);
    }

  
        
    public Association<String, String> search(String key) {
        return search(root, key);
    }

    
    private Association<String, String> search(Node node, String key) {
        if (node == null) {
            return null;
        }
        // Compara la clave del nodo actual con la clave que estás buscando
        int comparison = key.compareTo(node.value.getKey());

        // Si las claves coinciden, se encontró el valor, devuelve el objeto Association
        if (comparison == 0) {
            return node.value;
        }
        // Si la clave buscada es menor, busca en el subárbol izquierdo
        else if (comparison < 0) {
            return search(node.left, key);
        }
        // Si la clave buscada es mayor, busca en el subárbol derecho
        else {
            return search(node.right, key);
        }
    }

   


    

    
}
