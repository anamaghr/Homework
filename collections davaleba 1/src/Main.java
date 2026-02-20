import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // N1
//        ArrayList<Integer> nums = new ArrayList<>();
//        Random random = new Random();
//        while(true){
//            int n = random.nextInt(51);
//            nums.add(n);
//            if(n == 40){
//                break;
//            }
//        }
//        System.out.println("list length: " + nums.size());
//        System.out.print("list numbers: ");
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.print(nums.get(i));
//             if(i < nums.size() - 1) {
//                System.out.print(",");
//            }
//        }
//        System.out.println();
//
//        Iterator<Integer> iterator = nums.iterator();
//        while(iterator.hasNext()){
//            if(iterator.next() % 2 == 0){
//                iterator.remove();
//            }
//        }
//        System.out.println("number list after removing even numbers: " + nums);

        // N2
//        ArrayList<Integer> nums = new ArrayList<>();
//        Random random = new Random();
//        while(true) {
//            int n = random.nextInt(51);
//            nums.add(n);
//            break;
//
//        }
//        System.out.print("List of {");
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.print(nums.get(i));
//            if(i < nums.size() - 1) {
//                System.out.print(",");
//            }
//        }
//        System.out.print("}");

        // N3
//        Random random = new Random();
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(51);
//        }
//
//        System.out.println("numbers in the array: ");
//        for(int num : arr){
//            System.out.println(num + " ");
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int num : arr){
//            list.add(num);
//        }
//
//        int max = list.get(0);
//        int maxNumIndex = 0;
//        for (int i = 1; i < list.size(); i++) {
//            if(list.get(i) > max)
//                max = list.get(i);
//               maxNumIndex = i;
//
//        }
//        System.out.println("max number in the array: " + max + "  index:" + maxNumIndex);

        // N4
        Library library = new Library();
//        library.populateList();
//
//        for (Book book : library.getBooks()){
//            System.out.println(book);
//        }
    }
    }