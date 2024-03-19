import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    void testInsert() {
        BinaryTree binaryTree = new BinaryTree();
        assertNull(binaryTree.search("house")); // Verificar que el árbol esté vacío antes de insertar

        // Insertar un nodo y verificar si se puede encontrar
        binaryTree.insert(new Association<>("house", "casa"));
        assertNotNull(binaryTree.search("house"));
        assertEquals("casa", binaryTree.search("house").getValue());

    }
    
    @Test
    void testSearch() {
        BinaryTree binaryTree = new BinaryTree();

        // Insertar algunos nodos
        binaryTree.insert(new Association<>("house", "casa"));

        // Verificar la búsqueda de nodos existentes
        assertEquals("casa", binaryTree.search("house").getValue());

        // Verificar la búsqueda de un nodo inexistente
        assertNull(binaryTree.search("woman"));
    }
}
