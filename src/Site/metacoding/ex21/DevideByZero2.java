package Site.metacoding.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZero2 {

    public static void main(String[] args) {

        // try catch 보다 중요한건 유효성 검사. 애초에 에러가 일어나지 않도록 설계해야한다.

        Scanner sc = new Scanner(System.in);

        // Exception in thread "main" java.util.InputMismatchException
        // 통신, 사용자 입력 예외처리!! - 사용자는 바보이기 때문
        boolean check = true;
        while (check) {

            try {
                int x = sc.nextInt();
                System.out.println("받은 값" + x);

                check = false;
            } catch (Exception e) {
                System.out.println("=============");
                System.out.println(e.getMessage());
                System.out.println("=============");
                e.printStackTrace();
                sc.nextLine();

            }
        }
    }
}