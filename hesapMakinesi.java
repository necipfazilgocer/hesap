package hesapMakinesi;
import java.util.Scanner;
public class hesapMakinesi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n1,n2,select;
		System.out.println("Birinci sayiyi giriniz.");
		n1=scanner.nextInt();
		System.out.println("İkinci sayiyi giriniz.");
		n2=scanner.nextInt();
		System.out.println("Yapmak istediğiniz işlemi seçiniz.");
		System.out.println("1-Toplama");
		System.out.println("2-çıkartma");
		System.out.println("3-çarpma");
		System.out.println("4-bölme");
		select=scanner.nextInt();
		switch(select) {
		
		case 1 :
			System.out.println(n1+n2);
			break;
		case 2 :
			System.out.println(n1-n2);
			break;
		case 3 :
			System.out.println(n1*n2);
			break;
		case  4 :
			System.out.println(n1/n2);
			break;
		}
		
		
		

	}

}
