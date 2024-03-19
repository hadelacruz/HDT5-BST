
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
        if (node == null) return null;
        // Buscar en el subárbol izquierdo primero
        Association<String, String> leftResult = search(node.left, key);
        if (leftResult != null) {
            return leftResult;
        }
        if (key.compareTo(node.value.getKey()) == 0) {
            return node.value;
        }
        // Busca en el subárbol derecho
        return search(node.right, key);
    }
    
}
