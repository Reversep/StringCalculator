package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение [\"a\" + \"b\", \"a\" - \"b\", \"a\" * x, \"a\" / x] где a и b - строки, длиной не более 10 символов, а x - число  от 1 до 10 включительно  + Enter");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        GetObject.splitSlice(line);
        GetObject.operation(line);

        Calculation.answer(GetObject.firstString, GetObject.secondString, GetObject.operator, GetObject.strForSecondString);
    }
}
