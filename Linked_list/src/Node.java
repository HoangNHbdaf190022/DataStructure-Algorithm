public class Node {
    Node next;
    int data;

    //create a constructor
    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }
    //and then create more a constructor only contains "data" & return next = null if the link = null

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
