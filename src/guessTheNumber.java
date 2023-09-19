import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        int szam=8;
        Scanner n=new Scanner(System.in);
        int guess=0;
        do{
            System.out.println("Addj meg egy számot:");
            guess=n.nextInt();
            if(guess!=szam){
                System.out.println("nem nyert ekkora a különbség: "+(szam-guess));

            }else{
                System.out.println("gratulálok nyertél!");
            }
        }while(guess!=szam);
    }
}