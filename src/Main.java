import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sccanner = new Scanner(System.in);
        double weight, heiht, bmi;
        System.out.println("Nhập vào cân nặng: ");
        weight = sccanner.nextDouble();
        System.out.println("Nhập vào chiều cao: ");
        heiht = sccanner.nextDouble();
        bmi = weight / Math.pow(heiht, 2);

        if (bmi < 18.5) {
            System.out.println("Chỉ số bmi là: " + bmi + " Bạn bị thiếu cân");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Chỉ số bmi là: " + bmi + " Bạn có một cơ thể tốt");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Chỉ số bmi là: " + bmi + " Bạn được coi là thừa cân");
        } else if (bmi>=30) {
            System.out.println("Chỉ số bmi là: " + bmi + " Bạn bị béo phì");
        }
    }
}