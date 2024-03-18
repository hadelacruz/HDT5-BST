
public class BinaryTree {
    Node root;

    // Método para insertar un nodo en el árbol
     private Node insert(Node node, Association<String, String> value) {
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
        // Si las llaves son iguales, puedes manejarlo como desees. En este ejemplo, no se permite duplicados.
        // Aquí podrías decidir si quieres reemplazar el valor existente, ignorar el nuevo valor, etc.

        return node;
    }

    // Método público para insertar un nuevo nodo en el árbol
    public void insert(Association<String, String> value) {
        root = insert(root, value);
    }

    
    // Método para recorrer el árbol en orden (in-order traversal)
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.value.getKey() + ": " + node.value.getValue());
            inOrderTraversal(node.right);
        }
    }

    // Método público para realizar un recorrido en orden del árbol
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }
    
}
