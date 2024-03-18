public class Node {
    Association<String, String> value;
    Node left;
    Node right;

    Node(Association<String, String> value) {
        this.value = value;
        right = null;
        left = null;
    }
}
