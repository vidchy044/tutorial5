import java.io.*;
import java.util.*;

class Node{
    CovidVaccine data;
    Node next;

    public Node(CovidVaccine data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insert(CovidVaccine data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void delete(int SID) {
        if (head == null) return;
        if (head.data.getSID() == SID) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        
        while (current.next != null&&current.next.data.getSID() != SID) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    public void deleteAll() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void traversal() {
        if (head == null) {
            System.out.println("It is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
