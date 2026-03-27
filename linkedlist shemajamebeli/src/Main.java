import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
         IntLinkedList list = new IntLinkedList();

        System.out.println("Size: " + list.size());                    
        System.out.println("Empty: " + list.isEmpty());
        try {
            list.getFirst();
        } catch (NoSuchElementException e) {
            System.out.println("error");
        }
        System.out.println("After adding: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("get first: " + list.getFirst());
        System.out.println("get last: " + list.getLast());
        int removed = list.removeLast();
        System.out.println("removed las: " + removed);
        System.out.println("After removing Last: " + list + ",size=" + list.size());
        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list);
        list.add(0, 5);
        list.add(2, 7);
        System.out.println(list);
        System.out.println("remove: " + list.remove(0));
        System.out.println("remove Last: " + list.remove(list.size()-1));
        System.out.println("After removing: " + list);
        int[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }



    }
    }