import java.util.Scanner;
public class Kamata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int depozit;
int kamata;
int depozitposlek;
int depozitednagod;
System.out.print("Vnesi depozit");
Scanner tastatura=new Scanner(System.in);
depozit=tastatura.newint();
System.out.println("Vnesi kamata");
kamata=tastatura.newint();
depozitposlek=((depozit/100)kamata+depozit);
System.out.println("Za 1 mesec");
System.out.print(depozitposlek);
System.out.println("Za 1 godina");
depozitednagod=depozitposlek+((depozit/100)*kamata)*12;
System.out.print(depozitednagod);


	}

}
