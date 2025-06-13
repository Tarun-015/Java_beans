import java.util.Scanner;

public class Calculator{
    int num1;
    int num2;
    int res;
    String opr;

    void add() {
        res = num1 + num2;
        System.out.println("Result: " + res);
    }

    void sub() {
        res = num1 - num2;
        System.out.println("Result: " + res);
    }

    void multi() {
        res = num1 * num2;
        System.out.println("Result: " + res);
    }

    void div() {
        res = num1 / num2;
        System.out.println("Result: " + res);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int input1 = scan.nextInt();

        System.out.println("Enter 2nd number:");
        int input2 = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter operation:");
        String opr = scan.nextLine();

        Calculator calc = new Calculator();
        calc.num1 = input1;  
        calc.num2 = input2;
        calc.opr = opr;

        if(opr.equalsIgnoreCase("add")){
            calc.add();
        }
        else if(opr.equalsIgnoreCase("sub")){
            calc.sub();
        }
        else if(opr.equalsIgnoreCase("multi")){
            calc.multi();
        }
        else if(opr.equalsIgnoreCase("div")){
            calc.div();
        }
        else{
            System.out.println("invalid opr");
        }

    scan.close();
    }
}
