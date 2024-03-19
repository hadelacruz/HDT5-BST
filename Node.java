public class Node {
    Association<String, String> value;
    Node left;
    Node right;

    /**
     * 
     * @param value Objeto de tipo Association
     */
    Node(Association<String, String> value) {
        this.value = value;
        right = null;
        left = null;
    }

    public Association<String,String> getValue() {
        return this.value;
    }

    public void setValue(Association<String,String> value) {
        this.value = value;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
