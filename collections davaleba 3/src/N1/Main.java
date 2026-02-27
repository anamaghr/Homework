//package N1;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//
//public classMain {
//    public static void main(String[] args) {
//        ArrayList<Basketball> players = new ArrayList<>();
//        players.add(new Basketball("hdhb","dhu",15,4,11,9,4));
//        players.add(new Basketball("hdhsdb","dhsu",10,3,21,6,7));
//        players.add(new Basketball("hfgb","dhudchs",20,7,15,4,1));
//
//        Collections.sort(players, Comparator.comparing(Basketball::getRating));
//        System.out.println("rating by scores: ");
//        for(Basketball b : players){
//            System.out.println(b);
//        }
//        Collections.sort(players, Comparator.comparing(Basketball::getRating).reversed());
//        System.out.println("rating by scores: ");
//        for(Basketball b : players){
//            System.out.println(b);
//        }
//    }
//    }