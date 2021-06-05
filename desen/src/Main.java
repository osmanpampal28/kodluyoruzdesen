import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("N sayısı : ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        while(number<0){
            System.out.print("hatalı! tekrardan numara giriniz : ");
            number=scanner.nextInt();
        }
        Desen(number);
    }
    public static void Desen(int number){
        int temp=number,sayac=0;
        System.out.print("Çıktısı : "+temp+" ");
        while(temp>0){
            temp-=5;
            System.out.print(temp+" ");
            sayac++;
        }
        while(sayac>0){
            temp+=5;
            System.out.print(temp+" ");
            sayac--;
        }
    }
}
