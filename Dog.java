import java.util.Scanner;

public class Dog {
    String breed;
    float age;
    int price;

    void eating(){
        System.out.println("dog is eating");
    }

    void sleeping(){
        System.out.println("dog is sleeping");
    }

    void barking(){
        System.out.println("dog is barking");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog d =new Dog();
        System.out.println(d.breed);
        System.out.println(d.age);
        System.out.println(d.price);



        scan.close();
    }
}

