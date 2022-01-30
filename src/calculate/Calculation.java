package calculate;

class Calculation {

    public static void answer(String firstString, String secondString, char operator, boolean strForSecondString) {
        if (operator == '+') {
            System.out.println(Calculation.addition(firstString, secondString, strForSecondString));
        }
        if (operator == '-') {
            System.out.println(Calculation.subtraction(firstString, secondString, strForSecondString));
        }
        if (operator == '*') {
            System.out.println(Calculation.multiplication(firstString, secondString, strForSecondString));
        }
        if (operator == '/') {
            System.out.println(Calculation.division(firstString, secondString, strForSecondString));
        }
    }

    public static String addition(String firstString, String secondString, boolean strForSecondString) {
        String result;
        if (strForSecondString == true) {
            result = firstString + secondString;
            return "\"" + result + "\"";
        }
        return "Выполнение выражения невозможно. \n(Складывать можно только две строки)";
    }

    public static String subtraction(String firstString, String secondString, boolean strForSecondString) {
        String result;
        if (strForSecondString == true) {
            result = firstString.replace(secondString, "");
            return "\"" + result + "\"";
        }
        return "Выполнение выражения невозможно. \n(Вычитать можно только строку из строки)";
    }

    public static String multiplication(String firstString, String secondString, boolean strForSecondString) {
        String result = "";

        if (strForSecondString == false) {
            int num2 = Integer.parseInt(secondString);
            for (int i = 0; i < num2; i++) {
                result = result + firstString;
            }
            if (result.length() > 40) {
                result = result.substring(0, 40) + "...";
            }
            return "\"" + result + "\"";
        }
        return "Выполнение выражения невозможно. \n(Умножить можно только строку на число)";
    }

    public static String division(String firstString, String secondString, boolean strForSecondString) {
        String result = "";
        if (strForSecondString == false) {
            int num2 = Integer.parseInt(secondString);
            int quantity = firstString.length() / num2;
            for (int i = 0; i < quantity; i++) {
                result = result + firstString.charAt(i);
            }
            return "\"" + result + "\"";
        }
        return "Выполнение выражения невозможно. \n(Делить можно только строку на число)";
    }
}
