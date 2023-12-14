package Leetcode.LinkedList;

public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }

    public Node(int val) {
        this.val = val;
        next = null;
        random = null;
    }

    @Override
    public String toString() {
        Node temp = this;
        StringBuilder stringBuilder = new StringBuilder("This: ");
        while(temp != null){
            stringBuilder.append(temp.val).append(" ");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}
