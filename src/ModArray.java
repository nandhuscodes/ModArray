import java.util.Scanner;

public class ModArray {
    static int findModArray(int[] A, int B){
        int power = 1, result = 0, N = A.length;
        for(int i = N - 1; i >= 0; i--){
            result = (result+((A[i]%B)*power))%B;
            power = (power*10)%B;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        int B = scanner.nextInt();
        System.out.println(findModArray(A, B));
    }
}
