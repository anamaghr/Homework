import java.util.NoSuchElementException;

public class IntLinkedList {
    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public IntLinkedList() {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public  int size(){
        return size;
    }

   public boolean isEmpty(){
       return size == 0;
 }

   public void clear(){
       head = tail = null;
       size = 0;
    }


    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

   public int get(int index){
      checkElementIndex(index);
       return (int) nodeAt(index);
   }

    private int nodeAt(int index) {
        return index;
    }


    public  int set(int index, int value) {
      checkElementIndex(index);
      Node node = nodeAt(index);
      int oldNode = node.value;
      return oldNode;
   }
   public int getFirst(){
      if(isEmpty()) throw new NoSuchElementException();
      return head.value;
   }
    public int getLast() {
        if (isEmpty()) throw new NoSuchElementException();
        return tail.value;
    }

    public void add(int value){
        add(value);
    }
    public  void addFirst(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            head = newNode.next;
        }
        size++;
    }
    public void addLast(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail = newNode.next;
        }
        size++;
    }
    public void add(int index, int value){
        checkElementIndex(index);

        if(index == 0){
            addFirst(value);
        }
        if (index == size){
            addLast(value);
        }
    }
    public int removeFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return 0;
    }
    public int removeLast() {
        if (size == 1) {
            return removeFirst();
        }
        return 0;
    }
    public int remove(int index) {
        checkElementIndex(index);

        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        return 0;
    }
    public boolean removeValue(int value) {
        if (isEmpty()) {
            return false;
        }

        if (head.value == value) {
            removeFirst();
            return true;
        }
        return 0;
    }
    public int indexOf(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }

    @Override
    public String toString() {
        return "IntLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    private Node nodeAts(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkNotEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
    }




}
