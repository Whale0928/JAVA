package etc;

import java.util.Arrays;

public class StreamMain {
    public static void main(String[] args) {
        int [] arr ={149, 180, 192, 170};
        int height = 167;
        int solution = solution(arr, height);
        System.out.println(solution);
    }
    public static int solution(int[] arr, int height){
        return (int) Arrays.stream(arr).filter(i-> height>i).count();
    }
}
