package com.techzjc;

import java.util.Scanner;

/**
 * @author  Jiacheng Zhao   <a href="mailto:admin@techzjc.com">admin@techzjc.com</a>
 * @version 1.1.0
 */

public class ReadInput {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readString(String question) {
        String string;
        while (true) {
            try {
                System.out.print(question);
                string = SCANNER.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
                SCANNER.nextLine();
            }
        }
        return string;
    }

    public static String readString() {
        return readString("Please input a string: ");
    }

    public static String[] readStringArrOfNumber(int num) {
        if (num <= 0) {
            return null;
        } else {
            String[] string = new String[num];
            string[0] = readString("Please input the first string: ");
            for (int i = 1; i < string.length; i++) {
                string[i] = readString("Please input the next string: ");
            }
            return string;
        }
    }

    public static String[] readStringArrOfNumber(int num, String question) {
        if (num <= 0) {
            return null;
        } else {
            String[] string = new String[num];
            for (int i = 0; i < string.length; i++) {
                string[i] = readString(question);
            }
            return string;
        }
    }

    public static String[][] readStringArrOfNumber(int row, int column) {
        if (row <= 0 || column <=0) {
            return null;
        } else {
            String[][] string = new String[row][column];
            for (int i = 0; i < string.length; i++) {
                for (int j = 0; j < string[i].length ; j++) {
                    if (j==0){
                        string[i][j] = readString("Please input the first string: ");
                    } else{
                        string[i][j] = readString("Please input the next string: ");
                    }
                }
                System.out.println("Start a new line!");
            }
            return string;
        }
    }

    public static String[][] readStringArrOfNumber(int row, int column, String question) {
        if (row <= 0 || column <=0) {
            return null;
        } else {
            String[][] string = new String[row][column];
            for (int i = 0; i < string.length; i++) {
                for (int j = 0; j < string[i].length ; j++) {
                    string[i][j] = readString(question);
                }
                System.out.println("Start a new line!");
            }
            return string;
        }
    }

    public static int readInt(String question, String errMsg) {
        int integer;
        while (true) {
            try {
                System.out.print(question);
                integer = SCANNER.nextInt();
                break;
            } catch (Exception e) {
                System.out.println(errMsg);
                SCANNER.nextLine();
            }
        }
        return integer;
    }

    public static int readInt() {
        return readInt("Please input an integer: ", "Error: Please input a valid integer!");
    }

    public static int[] readIntArrOfNumber(int num) {
        if (num <= 0) {
            return null;
        } else {
            int[] integer = new int[num];
            integer[0] = readInt("Please input the first integer: ", "Error: Please input a valid integer!");
            for (int i = 1; i < integer.length; i++) {
                integer[i] = readInt("Please input the next integer: ", "Error: Please input a valid integer!");
            }
            return integer;
        }
    }

    public static int[] readIntArrOfNumber(int num, String question, String errMsg) {
        if (num <= 0) {
            return null;
        } else {
            int[] integer = new int[num];
            for (int i = 0; i < integer.length; i++) {
                integer[i] = readInt(question, errMsg);
            }
            return integer;
        }
    }

    public static int[][] readIntArrOfNumber(int row, int column) {
        if (row <= 0 || column<=0) {
            return null;
        } else {
            int[][] integer = new int[row][column];
            for (int i = 0; i < integer.length; i++) {
                for (int j = 0; j < integer[i].length; j++) {
                    if (j == 0) {
                        integer[i][j] = readInt("Please input the first integer: ", "Error: Please input a valid integer!");
                    } else {
                        integer[i][j] = readInt("Please input the next integer: ", "Error: Please input a valid integer!");
                    }

                }
                if (i < integer.length - 1) {
                    System.out.println("Start a new line!");
                }
            }
            return integer;
        }
    }

    public static int[][] readIntArrOfNumber(int row, int column, String question, String errMsg) {
        if (row <= 0 || column<=0) {
            return null;
        } else {
            int[][] integer = new int[row][column];
            for (int i = 0; i < integer.length; i++) {
                for (int j = 0; j < integer[i].length; j++) {
                    integer[i][j] = readInt(question, errMsg);
                }
                if (i < integer.length - 1) {
                    System.out.println("Start a new line!");
                }
            }
            return integer;
        }
    }

    public static int readIntBiggerThan(int number) {
        int inputtedInteger;
        while (true) {
            inputtedInteger = readInt("Please input an integer bigger than "+number+":", "Error: Please input a valid integer!");
            if (inputtedInteger <= number) {
                System.out.println("Error: please input a number bigger than " + number);
            } else {
                break;
            }
        }
        return inputtedInteger;
    }

    /**
     * @param givenNumber:  Number to indicate the range
     * @param indicator:    1 for checking bigger, -1 for checking smaller
     * @param question:     Question that will be prompt in the terminal
     * @param notFitRangeErrMsg:    Error Message For Showing This is not fit the Range
     * @param typeErrMsg:   Error Message For Showing the Type Error
     * @return number in range
     */
    private static int intChecker(int givenNumber, int indicator, String question, String notFitRangeErrMsg, String typeErrMsg) {
        int inputtedInteger;
        while (true) {
            inputtedInteger = readInt(question, typeErrMsg);
            if (indicator == 1) {
                if (inputtedInteger <= givenNumber) {
                    System.out.println(notFitRangeErrMsg);
                    SCANNER.nextLine();
                } else {
                    break;
                }
            } else if (indicator == -1) {
                if (inputtedInteger <= givenNumber) {
                    System.out.println(notFitRangeErrMsg);
                    SCANNER.nextLine();
                } else {
                    break;
                }
            }
        }
        return inputtedInteger;
    }

    public static int readIntBiggerThan(int number, String question, String notFitRangeErrMsg, String typeErrMsg) {
        return intChecker(number, 1, question, notFitRangeErrMsg, typeErrMsg);
    }

    public static int readIntSmallThan(int number) {
        return readIntSmallThan(number, "Please input an integer smaller than "+number+":", "Error: please input a number small than " + number, "Error: Please input a valid integer!");
    }

    public static int readIntSmallThan(int number, String question, String notFitRangeErrMsg, String typeErrMsg) {
        return intChecker(number, -1, question, notFitRangeErrMsg, typeErrMsg);
    }

    public static double readDouble(String question, String errMsg) {
        double d;
        while (true) {
            try {
                System.out.print(question);
                d = SCANNER.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println(errMsg);
                SCANNER.nextLine();
            }
        }

        return d;
    }

    public static double readDouble() {
        return readDouble("Please input a double:", "Error: Please input a valid double!");
    }

    public static double[] readDoubleArrOfNumber(int num) {
        if (num <= 0) {
            return null;
        } else {
            double[] doubles = new double[num];
            doubles[0] = readDouble("Please input the first double: ", "Error: Please input a valid double!");
            for (int i = 1; i < doubles.length; i++) {
                doubles[i] = readDouble("Please input the next double: ", "Error: Please input a valid double!");
            }
            return doubles;
        }
    }

    public static double[] readDoubleArrOfNumber(int num, String question, String errMsg) {
        if (num <= 0) {
            return null;
        } else {
            double[] doubles = new double[num];
            for (int i = 0; i < doubles.length; i++) {
                doubles[i] = readDouble(question, errMsg);
            }
            return doubles;
        }
    }

    public static double[][] readDoubleArrOfNumber(int row, int column) {
        if (row <= 0 || column<=0) {
            return null;
        } else {
            double[][] doubles = new double[row][column];
            for (int i = 0; i < doubles.length ; i++) {
                for (int j = 0; j < doubles[i].length ; j++) {
                    if (j == 0) {
                        doubles[i][j] = readDouble("Please input the first double: ", "Error: Please input a valid double!");
                    } else {
                        doubles[i][j] = readDouble("Please input the next double: ", "Error: Please input a valid double!");
                    }
                }
                if (i < doubles.length - 1) {
                    System.out.println("Start a new line!");
                }
            }
            return doubles;
        }
    }

    public static double[][] readDoubleArrOfNumber(int row, int column, String question, String errMsg) {
        if (row <= 0 || column<=0) {
            return null;
        } else {
            double[][] doubles = new double[row][column];
            for (int i = 0; i < doubles.length ; i++) {
                for (int j = 0; j < doubles[i].length ; j++) {
                    doubles[i][j] = readDouble(question, errMsg);
                }
                if (i < doubles.length - 1) {
                    System.out.println("Start a new line!");
                }
            }
            
            return doubles;
        }
    }

    /**
     * @param givenNumber:  Number to indicate the range
     * @param indicator:    1 for checking bigger, -1 for checking smaller
     * @param question:     Question that will be prompt in the terminal
     * @param notFitRangeErrMsg:    Error Message For Showing This is not fit the Range
     * @param typeErrMsg:   Error Message For Showing the Type Error
     * @return number in range
     */
    private static double doubleChecker(double givenNumber, int indicator, String question, String notFitRangeErrMsg, String typeErrMsg) {
        double inputtedDouble;
        while (true) {
            inputtedDouble = readDouble(question, typeErrMsg);
            if (indicator == 1) {
                if (inputtedDouble <= givenNumber) {
                    System.out.println(notFitRangeErrMsg);
                    SCANNER.nextLine();
                } else {
                    break;
                }
            } else if (indicator == -1) {
                if (inputtedDouble <= givenNumber) {
                    System.out.println(notFitRangeErrMsg);
                    SCANNER.nextLine();
                } else {
                    break;
                }
            }
        }
        return inputtedDouble;
    }

    public static double readDoubleBiggerThan(double number) {
        return readDoubleBiggerThan(number, "Please input a double bigger than "+number+":", "Error: please input a number bigger than " + number, "Error: Please input a valid double!");
    }

    public static double readDoubleBiggerThan(double number, String question, String notFitRangeErrMsg, String typeErrMsg) {
        return doubleChecker(number, 1, question,notFitRangeErrMsg, typeErrMsg);
    }

    public static double readDoubleSmallThan(double number) {
        return readDoubleSmallThan(number, "Please input a integer smaller than "+number+":", "Error: please input a number small than " + number, "Error: Please input a valid double!");
    }

    public static double readDoubleSmallThan(double number, String question, String notFitRangeErrMsg, String typeErrMsg) {
        return doubleChecker(number, -1, question, notFitRangeErrMsg, typeErrMsg);
    }

    public static boolean readBoolean() {
        return readBoolean("Please input a boolean value(true or false): ", "Error: Please input a valid boolean value(true or false only)!");
    }

    public static boolean readBoolean(String question, String errMsg) {
        boolean tOrFalse;
        while (true) {
            try {
                System.out.print(question);
                tOrFalse = SCANNER.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println(errMsg);
                SCANNER.nextLine();
            }
        }
        return tOrFalse;
    }

    public static boolean[] readBooleanArrOfNumber(int num) {
        if (num <= 0) {
            return null;
        } else {
            boolean[] tOrFalse = new boolean[num];
            tOrFalse[0] = readBoolean("Please input the first boolean: ", "Error: Please input a valid boolean!");
            for (int i = 1; i < tOrFalse.length; i++) {
                tOrFalse[i] = readBoolean("Please input the next boolean: ", "Error: Please input a valid boolean!");
            }
            return tOrFalse;
        }
    }

    public static boolean[] readBooleanArrOfNumber(int num, String question, String errMsg) {
        if (num <= 0) {
            return null;
        } else {
            boolean[] tOrFalse = new boolean[num];
            for (int i = 0; i < tOrFalse.length; i++) {
                tOrFalse[i] = readBoolean(question, errMsg);
            }
            return tOrFalse;
        }
    }

    public static boolean[][] readBooleanArrOfNumber(int row, int column) {
        if (row <= 0 || column<=0) {
            return null;
        } else {
            boolean[][] tOrFalse = new boolean[row][column];
                for (int i = 0; i < tOrFalse.length; i++) {
                    for (int j = 0; j < tOrFalse[i].length ; j++) {
                        if (j==0){
                            tOrFalse[i][j] = readBoolean("Please input the first boolean: ", "Error: Please input a valid boolean!");
                        } else{
                            tOrFalse[i][j] = readBoolean("Please input the next boolean: ", "Error: Please input a valid boolean!");
                        }
                    }
                    if (i < tOrFalse.length - 1) {
                        System.out.println("Start a new line!");
                    }
                }
            
            return tOrFalse;
        }
    }

    public static boolean[][] readBooleanArrOfNumber(int row, int column, String question, String errMsg) {
        if (row <= 0 || column<=0) {
            return null;
        } else {
            boolean[][] tOrFalse = new boolean[row][column];
            for (int i = 0; i < tOrFalse.length; i++) {
                for (int j = 0; j < tOrFalse[i].length ; j++) {
                    tOrFalse[i][j] = readBoolean(question, errMsg);
                }
                if (i < tOrFalse.length - 1) {
                    System.out.println("Start a new line!");
                }
            }
            return tOrFalse;
        }
    }

    public static char readChar() {
        return readChar("Please input a character: ", "Error: Please input a valid character(Only one)!");
    }

    public static char readChar(String question, String errorMsg) {
        char character;
        while (true) {
            System.out.print(question);
            String temp = SCANNER.nextLine();
            if (temp.length() > 1) {
                System.out.println(errorMsg);
            } else {
                character = temp.charAt(0);
                break;
            }
        }
        return character;
    }

    public static char[] readCharArrOfNumber(int num){
        char[] character = new char[num];
        for (int i = 0; i < character.length ; i++) {
            if (i == 0) {
                character[i] = readChar("Please input the first character: ", "Error: Please input a valid character(Only one)!");
            } else {
                character[i] = readChar("Please input the second character: ", "Error: Please input a valid character(Only one)!");
            }
        }
        return character;
    }

    public static char[] readCharArrOfNumber(int num, String question, String errorMsg){
        if (num <= 0) {
            return null;
        } else {
            char[] character = new char[num];
            for (int i = 0; i < character.length; i++) {
                character[i] = readChar(question, errorMsg);
            }
            return character;
        }
    }

    public static char[][] readCharArrOfNumber(int row, int column){
        if (row <= 0 || column<=0) {
            return null;
        } else {
            char[][] character = new char[row][column];
            for (int i = 0; i < character.length; i++) {
                for (int j = 0; j < character[i].length; j++) {
                    if (j == 0) {
                        character[i][j] = readChar("Please input the first character: ", "Error: Please input a valid character(Only one)!");
                    } else {
                        character[i][j] = readChar("Please input the second character: ", "Error: Please input a valid character(Only one)!");
                    }
                }
                if (i < character.length - 1) {
                    System.out.println("Start a new line!");
                }
            }
            return character;
        }
    }

    public static char[][] readCharArrOfNumber(int row, int column, String question, String errMsg){
        if (row <= 0 || column<=0) {
            return null;
        } else {
            char[][] character = new char[row][column];
            for (int i = 0; i < character.length; i++) {
                for (int j = 0; j < character[i].length; j++) {
                    character[i][j] = readChar(question, errMsg);
                }
                if (i < character.length - 1) {
                    System.out.println("Start a new line!");
                }
            }

            return character;
        }
    }
}
