package Site.metacoding.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZero {

    public static void main(String[] args) {

        // try catch 보다 중요한건 유효성 검사. 애초에 에러가 일어나지 않도록 설계해야한다.

        Scanner sc = new Scanner(System.in);

        // Exception in thread "main" java.util.InputMismatchException
        // 통신, 사용자 입력 예외처리!! - 사용자는 바보이기 때문

        try {
            int x = sc.nextInt();
            int result = x / 0;

            System.out.println("받은 값" + x);

        } catch (InputMismatchException e) {

            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("=============");
            System.out.println("0좀 넣지마!!");
            System.out.println("=============");
            e.printStackTrace();

        }

    }
}
