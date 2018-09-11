import java.util.*;

public class AppController {
    private int[] arr;



    public void run(){
        this.chooseSortMethod();
    }

    private int[] makeArr() {
        int numberOfArrSize = AppView.inputArrSize();
        arr = new int [numberOfArrSize];
        for (int i = 0; i < arr.length; i++){
            AppView.output("원하는 배열의 " + i + "번째 배열을 입력해주세요 : ");
            arr[i] = AppView.insertArr();
        }
        return arr;
    }

    private void chooseSortMethod(){
        int numberOfChooseSortMethod;
        numberOfChooseSortMethod = AppView.inputSortMethod();
        if (numberOfChooseSortMethod == 1){
            InsertionSort InsertionSortArr = this.insertionSort();
        }
        else {

        }
    }

    private InsertionSort insertionSort(){
        do {
            makeArr();
            AppView.outputLine("입력하신 배열을 InsertionSort 중입니다...");
            return (new InsertionSort(arr));
        }
        while (true);
    }
}
