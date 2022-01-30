package calculate;

import java.util.Arrays;

class GetObject {
    public static String firstString;
    public static String secondString;
    public static char operator;
    public static boolean strForSecondString;

    public static void splitSlice(String sc) {
        try {
            String[] operands = sc.split("[+-/*]");

            if (operands.length != 2){
                System.out.println("Выполнение выражения невозможно. \n(Формат ввода: Строка оператор Строка/число)");
                System.exit(1);
            }
            firstString = getFirstString(operands[0].trim());
            secondString = getSecondString(operands[1].trim());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выполнение выражения невозможно. \n(Используйте + - / *)");
            System.exit(1);
        }
    }

    public static String getFirstString(String sc){
        int lenght = sc.length();

        if ((sc.charAt(0) == '\"') && (sc.charAt(sc.length()-1) == '\"')) { //определение кавычек и их изьятие
            String operand = sc.replaceAll("[\"]", "");
            if (operand.length()>10) {
                System.out.println("Выполнение выражения невозможно. \n(Строка должна быть не длиннее 10-и символов)");
                System.exit(1);
            }
            return operand;
        } else {
            System.out.println("Выполнение выражения невозможно. \n(Первым значением обязательно должна быть строка) \n(Строка должна быть написана в кавычках)");
            System.exit(1);
            return "";
        }
    }

    public static String getSecondString(String sc) {
        int lenght = sc.length();

        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        if ((sc.charAt(0) == '\"') && (sc.charAt(sc.length() - 1) == '\"')) { //определение кавычек и их изьятие
            String operand = sc.replaceAll("[\"]", "");
            if (operand.length()>10) {
                System.out.println("Выполнение выражения невозможно. \n(Строка должна быть не длиннее 10-и символов)");
                System.exit(1);
            }
            strForSecondString = true;
            return operand;
        }
        if (!Arrays.asList(numbers).contains(sc)){
            System.out.println("Выполнение выражения невозможно. \n(Вторым значением дожна быть строка или число 1-10)");
            System.exit(1);
        } else {
            strForSecondString = false;
        }
        return sc;
    }

    public static void operation(String sc) {
        if (sc.indexOf(" + ") > 0) {
            operator = '+';
        } else if (sc.indexOf(" - ") > 0) {
            operator = '-';
        } else if (sc.indexOf(" * ") > 0) {
            operator = '*';
        } else if (sc.indexOf(" / ") > 0) {
            operator = '/';
        } else {
            System.out.println("Выполнение выражения невозможно. \n(Оператор должен быть выделен пробелами)");
            System.exit(1);
        }
    }
}

