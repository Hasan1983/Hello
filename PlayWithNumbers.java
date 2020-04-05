package class4;

import java.util.Scanner;

public class PlayWithNumbers {
    int num1,num2,num3,num4,num5;
    public PlayWithNumbers() {

    }
    public PlayWithNumbers(int num1,int num2,int num3,int num4,int num5){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
        this.num5=num5;
    }
    public void scanner(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIVE NUMBER=");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        num4=sc.nextInt();
        num5=sc.nextInt();
    }
    public void findMaximum(){

        if(num1 >=num2 && num1 >=num3 && num1 >=num4 && num1 >=num5){
            System.out.println("num1= "+num1 +"  is the maximum number");
        }
        else if(num2 >=num1 && num2 >=num3 && num2 >=num4 && num2 >=num5) {
            System.out.println("num2= "+ num2 +"  is the maximum number");
        }
        else if(num3 >=num1 && num3 >=num2 && num3 >=num4 && num2 >=num5) {
            System.out.println("num3= "+num3 +"  is the maximum number");

        }
        else if(num4 >=num1 && num4 >=num2 && num4 >=num3 && num4 >=num5) {
            System.out.println("num4=  "+num4+"  is the maximum number");
        }
        else{
            System.out.println("num5= "+num5 +"  is the maximum number");
        }
    }

        public void count(){
        if(num1%2==0 && num2%2==0 &&num3%2==0 &&num4%2==0 &&num5%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}


