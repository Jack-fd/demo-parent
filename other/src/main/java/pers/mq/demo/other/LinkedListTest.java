package pers.mq.demo.other;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-08-01
 * Time: 下午2:17
 */
public class LinkedListTest {

    public static void main(String[] args) {
        Node nodea = new Node("A");
        Node nodeb = new Node("B");
        Node nodec = new Node("C");
        Node noded = new Node("D");
        Node nodee = new Node("E");
        Node nodef = new Node("F");
        nodea.setNext(nodeb);
        nodeb.setNext(nodec);
        nodec.setNext(noded);
        noded.setNext(nodee);
        nodee.setNext(nodef);
        print(nodea);

        LinkedListReversor linkedListReversor = LinkedListReversor.RECURSION;
        Node tmp = linkedListReversor.execute(nodea);
        print(tmp);

        linkedListReversor = LinkedListReversor.NO_RECURSION;
        tmp = linkedListReversor.execute(tmp);
        print(tmp);
    }

    private static void print(Node node) {
        while (node != null) {
            System.out.print(node.getName());
            if (node.getNext() != null) {
                System.out.print(" --> ");
            } else {
                System.out.println();
            }
            node = node.getNext();
        }
    }
}

class Node {

    private String name;
    private Node next;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

enum LinkedListReversor {

    RECURSION("递归") {
        @Override
        public Node execute(Node node) {
            Node prev = null;
            if(node.getNext() == null) {
                prev = node;
            } else {
                Node tmp = execute(node.getNext());
                node.getNext().setNext(node);
                node.setNext(null);
                prev = tmp;
            }
            return prev;
        }
    },  NO_RECURSION("非递归") {
        @Override
        public Node execute(Node node) {
            Node prev = null;
            while (node != null) {
                Node tmp = node;
                node = node.getNext();
                tmp.setNext(prev);
                prev = tmp;
            }
            return prev;
        }
    };

    private String strategy;

    private LinkedListReversor(String strategy) {
        this.strategy = strategy;
    }

    public abstract Node execute(Node node);

    public String getStrategy() {
        return strategy;
    }
}

