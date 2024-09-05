import java.util.Scanner;

public class calculatorswitchvariant {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        add add = new add();
        subtract subtract = new subtract();
        multiply multiply = new multiply();
        quo quo = new quo();
        
        while (true) {
            System.out.println("Choose a number from 1-5");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction ");
            System.out.println("3. Multiplication");
            System.out.println("4. Division ");
            System.out.println("5. Exit");
            
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    add.add(args);
                    
                case 2:
                    subtract.subtract(args);
                
                case 3:
                    multiply.multiply(args);

                case 4:
                    quo.quo(args);
                
                case 5:
                    return;

                default:
                    System.out.println("BOBO MO, 1-5 NGA LANG EH");
            }
        }
    }
}


class add {
    public void add (String[]args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double sum;

        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " + sum + ".");
    }
}

class subtract {
    public void subtract (String[]args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double diff;

        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        diff = x - y;
        System.out.println("The difference of " + x + " and " + y + " is " + diff + ".");
    }
}

class multiply {
    public void multiply (String[]args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double product;

        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        product = x * y;
        System.out.println("The product of " + x + " and " + y + " is " + product + ".");
    }
}

class quo {
    public void quo (String[]args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double quo;

        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();

        quo = x / y;
        System.out.println("The quotient of " + x + " and " + y + " is " + quo + ".");
    }
}