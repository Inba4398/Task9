package Task9;
import java.util.Scanner;
public class hotel_tariff_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int month, n;
        float rent, t = 0, r = 0;
        month = scanner.nextInt();
        rent = scanner.nextFloat();
        n = scanner.nextInt();
        t = rent * n;
        r = ((rent + (rent * 0.2f)) * n);
        switch (month) {
            case 1:
            case 2:
            case 3:
                p(t);
                break;
            case 4:
            case 5:
            case 6:
                p(r);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                p(t);
                break;
            case 11:
            case 12:
                p(r);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void p(float t) {
        System.out.printf("Hotel Tariff: Rs.%.2f", t);
    }


	}


