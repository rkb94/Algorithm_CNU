import java.util.Arrays;

public class InsertionSort {
    private int[] insertionSortArr;

    public InsertionSort (int arr[]){
        int mainArr[] = arr;
        for (int i = 1; i < mainArr.length; i++) {

            int standard = mainArr[i];  // 기준

            int compare = i - 1;   // 비교할 대상


            while (compare >= 0 && standard < arr[compare]) {

                mainArr[compare + 1] = mainArr[compare];   // 비교대상이 큰 경우 오른쪽으로 밀어냄

                compare--;

            }

            arr[compare + 1] = standard;  // 기준값 저장

        }
        AppView.outputLine(Arrays.toString(mainArr));
    }
}
