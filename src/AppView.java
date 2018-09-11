import java.util.Scanner;

public class AppView {
    private static Scanner scanner = new Scanner(System.in);

    public static void outputLine(String aString){
        System.out.println(aString);
    }

    public static void output(String aString){
        System.out.print(aString);
    }

    public static int inputArrSize(){
        int numberOfArrSize;
        String scannedToken;
        while (true){
            AppView.output("원하는 배열의 크기를 입력해주세요.");
            scannedToken = AppView.scanner.next();
            try {
                numberOfArrSize = Integer.parseInt(scannedToken);
                return numberOfArrSize;
            }
            catch (NumberFormatException e){
                AppView.outputLine("숫자를 입력해주세요..");
            }
        }
    }

    public static int insertArr(){
        int numberOfInsertArr;
        String scannedToken;
        while (true){
            scannedToken = AppView.scanner.next();
            try {
                numberOfInsertArr = Integer.parseInt(scannedToken);
                return numberOfInsertArr;
            }
            catch (NumberFormatException e){
                AppView.outputLine("숫자를 입력해주세요..");
            }
        }
    }

    public static int inputSortMethod(){
        AppView.outputLine("1. InsertionSort    2. MergeSort");
        int numberOfInputMethod;
        String scannedToken;
        while (true){
            scannedToken = AppView.scanner.next();
            if (!scannedToken.equals("1")){
                AppView.outputLine("1과 2중의 숫자를 입력해주세요..");
                return inputSortMethod();
            }
            else {
                try {
                    numberOfInputMethod = Integer.parseInt(scannedToken);
                    return numberOfInputMethod;
                }
                catch (NumberFormatException e){
                    AppView.outputLine("정확한 숫자를 입력해주세요..");
                }
            }

        }
    }

}
