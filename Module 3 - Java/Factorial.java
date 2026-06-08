import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        int num = sc.nextInt();
        long fact = 1;
        
        if(num>=1){
            for(int i=1; i<=num; i++){
                fact *= i;
            }
            System.out.println(num + " Factorial is : "+fact);
        }
        else{
            System.out.println("Invalid Input");
        }
        
        sc.close();
    }
}