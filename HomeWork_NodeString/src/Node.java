public class Node {
    Node next;
    String data;

    public Node(Node next, String data) {
        this.next = null;
        this.data = null;
    }

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}
