package variables;

public class numberRiddle {
    public static void main(String[] args) {
    int x = 55; //test number chosen
    System.out.println("Test number: 55"); //lines 6-10: test results per step
    System.out.println("Step 1 expected answer: 110");
    System.out.println("Step 2 expected answer: 116");
    System.out.println("Step 3 expected answer: 58");
    System.out.println("Step 4 epected answer: 3");
    //test case 1: positive integer
    double temp = x / (double)1;
    System.out.print("This is your starting number: ");
    System.out.println(temp);
    temp *= 2;
    System.out.print("This is your number doubled: ");
    System.out.println(temp);
    temp += 6;
    System.out.print("This is your number plus six: ");
    System.out.println(temp);
    temp /= (double)2;
    System.out.print("This is your number halved: ");
    System.out.println(temp);
    temp -= x;
    System.out.print("This is your number minus the nnumber you started with: ");
    System.out.println(temp + "\n");
    //test case 2: negative integer
    int y = -5;
    temp = y;
    System.out.print("This is your starting number: ");
    System.out.println(temp);
    temp *= 2;
    System.out.print("This is your number doubled: ");
    System.out.println(temp);
    temp += 6;
    System.out.print("This is your number plus six: ");
    System.out.println(temp);
    temp /= (double)2;
    System.out.print("This is your number halved: ");
    System.out.println(temp);
    temp -= y;
    System.out.print("This is your number minus the number you started with: ");
    System.out.println(temp + "\n");
    //test case 3: zero
    int z = 0;
    temp = z;
    System.out.print("This is your starting number: ");
    System.out.println(temp);
    temp *= 2;
    System.out.print("This is your number doubled: ");
    System.out.println(temp);
    temp += 6;
    System.out.print("This is your number plus six: ");
    System.out.println(temp);
    temp /= (double)2;
    System.out.print("This is your number halved: ");
    System.out.println(temp);
    temp -= z;
    System.out.print("This is your number minus the number you started with: ");
    System.out.println(temp + "\n");
    //test case 4: one
    int a = 1;
    temp = a;
    System.out.print("This is your starting number: ");
    System.out.println(temp);
    temp *= 2;
    System.out.print("This is your number doubled: ");
    System.out.println(temp);
    temp += 6;
    System.out.print("This is your number plus six: ");
    System.out.println(temp);
    temp /= (double)2;
    System.out.print("This is your number halved: ");
    System.out.println(temp);
    temp -= a;
    System.out.print("This is your number minus the number you started with: ");
    System.out.println(temp + "\n");
    //test case 5: positive double
    double b = 9.85;
    temp = b;
    System.out.print("This is your starting number: ");
    System.out.println(temp);
    temp *= 2;
    System.out.print("This is your number doubled: ");
    System.out.println(temp);
    temp += 6;
    System.out.print("This is your number plus six: ");
    System.out.println(temp);
    temp /= (double)2;
    System.out.print("This is your number halved: ");
    System.out.println(temp);
    temp -= b;
    System.out.print("This is your number minus the number you started with: ");
    System.out.println(temp + "\n");
    //test case 6: negative integer
    double c = -4.4567;
    temp = c;
    System.out.print("This is your starting number: ");
    System.out.println(temp);
    temp *= 2;
    System.out.print("This is your number doubled: ");
    System.out.println(temp);
    temp += 6;
    System.out.print("This is your number plus six: ");
    System.out.println(temp);
    temp /= (double)2;
    System.out.print("This is your number halved: ");
    System.out.println(temp);
    temp -= c;
    System.out.print("This is your number minus the number you started with: ");
    System.out.println(temp + "\n");
    }
}
