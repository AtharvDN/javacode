import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();
        long Ans;
        switch (operator){
            case "+": Ans = a+b;
                System.out.println(Ans);
                break;
            case "-": Ans = a-b;
                System.out.println(Ans);
                break;
            case "*": Ans = a*b;
                System.out.println(Ans);
                break;
            case "/": if(b==0){
                System.out.println("Invalid Division");
            }else {
                Ans = a/b ;
                System.out.println(Ans);}
                break;
            case "%":
                if (b == 0) {
                    System.out.println("Invalid Division");
                }else{
                Ans = a%b;
                System.out.println(Ans);}
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
    }

