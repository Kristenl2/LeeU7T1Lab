import java.util.ArrayList;
public class CatRunner {
    public static void main(String[]args){
//        ArrayList<Cat> cats = new ArrayList<Cat>();
//        cats.add(new Cat("Catsy"));
//        cats.add(new Cat("Mr.meow"));
//        cats.add(new Cat("Felix"));
//        System.out.println(cats);
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Joey");
        Cat cat2 = new Cat("Max");
        Cat cat3 = new Cat("Jenny");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
        // YOU WILL WRITE MORE CODE HERE
        Cat cat4 = new Cat("garfield");
    }
}
