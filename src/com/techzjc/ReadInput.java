package com.techzjc;

import java.util.Scanner;

/**
 * @author  Jiacheng Zhao   <a href="mailto:admin@techzjc.com">admin@techzjc.com</a>
 * @version 1.1.0
 */

public class ReadInput {

    public static String ReadString(String question) {
        Scanner scanner = new Scanner(System.in);
        String string;
        while (true) {
            try {
                System.out.print(question);
                string = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
                scanner.nextLine();
            }
        }
        scanner.close();
        return string;
    }

    public static String ReadString() {
        Scanner scanner = new Scanner(System.in);
        String string;
        while (true) {
            try {
                System.out.print("Please input a string: ");
                string = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
                scanner.nextLine();
            }
        }
        scanner.close();
        return string;
    }

    public static String[] readStringArrOfNumber(int num) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 0) {
            scanner.close();
            return new String[]{"No number has been input!"};
        } else {
            String string[] = new String[num];
            while (true) {
                while(true) {
                    try {
                        System.out.print("Please input the first string: ");
                        string[0] = scanner.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.toString());
                        scanner.nextLine();
                    }
                }
                for (int i = 1; i < string.length; i++) {
                    while (true) {
                        try {
                            System.out.print("Please input the next string: ");
                            string[i] = scanner.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error: " + e.toString());
                            scanner.nextLine();
                        }
                    }
                }
                break;
            }
            scanner.close();
            return string;
        }
    }

    public static String[] readStringArrOfNumber(int num, String question) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 0) {
            scanner.close();
            return new String[]{"No number has been input!"};
        } else {
            String string[] = new String[num];
            while (true) {
                while(true) {
                    try {
                        System.out.print(question);
                        string[0] = scanner.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.toString());
                        scanner.nextLine();
                    }
                }
                for (int i = 1; i < string.length; i++) {
                    while (true) {
                        try {
                            System.out.print(question);
                            string[i] = scanner.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error: " + e.toString());
                            scanner.nextLine();
                        }
                    }
                }
                break;
            }
            scanner.close();
            return string;
        }
    }

    public static String[][] readStringArrOfNumber(int row, int column) {
        Scanner scanner = new Scanner(System.in);
        if (row <= 0 || column <=0) {
            scanner.close();
            return new String[1][1];
        } else {
            String string[][] = new String[row][column];
            while (true) {
                for (int i = 0; i < string.length; i++) {
                    for (int j = 0; j < string[i].length ; j++) {
                        while (true) {
                            try {
                                if (j==0){
                                    System.out.print("Please input the first string: ");
                                } else{
                                    System.out.print("Please input the next string: ");
                                }
                                string[i][j] = scanner.nextLine();
                                break;
                            } catch (Exception e) {
                                System.out.println("Error: " + e.toString());
                                scanner.nextLine();
                            }
                        }
                    }
                    System.out.println("Start a new line!");
                }
                break;
            }
            scanner.close();
            return string;
        }
    }

    public static String[][] readStringArrOfNumber(int row, int column, String question) {
        Scanner scanner = new Scanner(System.in);
        if (row <= 0 || column <=0) {
            scanner.close();
            return new String[1][1];
        } else {
            String string[][] = new String[row][column];
            while (true) {
                for (int i = 0; i < string.length; i++) {
                    for (int j = 0; j < string[i].length ; j++) {
                        while (true) {
                            try {
                                if (j==0){
                                    System.out.print(question);
                                } else{
                                    System.out.print(question);
                                }
                                string[i][j] = scanner.nextLine();
                                break;
                            } catch (Exception e) {
                                System.out.println("Error: " + e.toString());
                                scanner.nextLine();
                            }
                        }
                    }
                    System.out.println("Start a new line!");
                }
                break;
            }
            scanner.close();
            return string;
        }
    }

    public static int[] readIntArrOfNumber(int num) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 0) {
            scanner.close();
            return new int[]{0};
        } else {
            int integer[] = new int[num];
            while (true) {
                while(true) {
                    try {
                        System.out.print("Please input the first integer: ");
                        integer[0] = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error: Please input a valid integer!");
                        scanner.nextLine();
                    }
                }
                for (int i = 1; i < integer.length; i++) {
                    while (true) {
                        try {
                            System.out.print("Please input the next integer: ");
                            integer[i] = scanner.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error: Please input a valid integer!");
                            scanner.nextLine();
                        }
                    }
                }
                break;
            }
            scanner.close();
            return integer;
        }
    }

    public static int[] readIntArrOfNumber(int num, String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 0) {
            scanner.close();
            return new int[]{0};
        } else {
            int integer[] = new int[num];
            while (true) {
                while(true) {
                    try {
                        System.out.print(question);
                        integer[0] = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println(errMsg);
                        scanner.nextLine();
                    }
                }
                for (int i = 1; i < integer.length; i++) {
                    while (true) {
                        try {
                            System.out.print(question);
                            integer[i] = scanner.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println(errMsg);
                            scanner.nextLine();
                        }
                    }
                }
                break;
            }
            scanner.close();
            return integer;
        }
    }

    public static int[][] readIntArrOfNumber(int row, int column) {
        Scanner scanner = new Scanner(System.in);
        if (row <= 0 || column<=0) {
            scanner.close();
            return new int[1][1];
        } else {
            int integer[][] = new int[row][column];
            while (true) {
                for (int i = 0; i < integer.length; i++) {
                    for (int j = 0; j < integer[i].length; j++) {
                        while (true) {
                            try {
                                if (j == 0) {
                                    System.out.print("Please input the first integer: ");
                                } else {
                                    System.out.print("Please input the next integer: ");
                                }
                                integer[i][j] = scanner.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("Error: Please input a valid integer!");
                                scanner.nextLine();
                            }
                        }
                    }
                    if (i < integer.length - 1) {
                        System.out.println("Start a new line!");
                    }
                }
                break;
            }
            scanner.close();
            return integer;
        }
    }

    public static int[][] readIntArrOfNumber(int row, int column, String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        if (row <= 0 || column<=0) {
            scanner.close();
            return new int[1][1];
        } else {
            int integer[][] = new int[row][column];
            while (true) {
                for (int i = 0; i < integer.length; i++) {
                    for (int j = 0; j < integer[i].length; j++) {
                        while (true) {
                            try {
                                if (j == 0) {
                                    System.out.print(question);
                                } else {
                                    System.out.print(question);
                                }
                                integer[i][j] = scanner.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println(errMsg);
                                scanner.nextLine();
                            }
                        }
                    }
                    if (i < integer.length - 1) {
                        System.out.println("Start a new line!");
                    }
                }
                break;
            }
            scanner.close();
            return integer;
        }
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int integer;
        while (true) {
            try {
                System.out.print("Please input an integer: ");
                integer = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error: Please input a valid integer!");
                scanner.nextLine();
            }
        }
        scanner.close();
        return integer;
    }

    public static int readInt(String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        int integer;
        while (true) {
            try {
                System.out.print(question);
                integer = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println(errMsg);
                scanner.nextLine();
            }
        }
        scanner.close();
        return integer;
    }

    public static int readIntBiggerThan(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputtedInteger;
        while (true) {
            try {
                System.out.print("Please input an integer bigger than "+number+":");
                inputtedInteger = scanner.nextInt();
                if (inputtedInteger <= number) {
                    System.out.println("Error: please input a number bigger than " + number);
                    scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please input a valid integer!");
                scanner.nextLine();
            }
        }
        scanner.close();
        return inputtedInteger;
    }

    public static int readIntBiggerThan(int number, String question, String notFitRangeErrMsg, String typeErrMsg) {
        Scanner scanner = new Scanner(System.in);
        int inputtedInteger;
        while (true) {
            try {
                System.out.print(question);
                inputtedInteger = scanner.nextInt();
                if (inputtedInteger <= number) {
                    System.out.println(notFitRangeErrMsg);
                    scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(typeErrMsg);
                scanner.nextLine();
            }
        }
        scanner.close();
        return inputtedInteger;
    }

    public static int readIntSmallThan(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputtedInteger;
        while (true) {
            try {
                System.out.print("Please input an integer smaller than "+number+":");
                inputtedInteger = scanner.nextInt();
                if (inputtedInteger >= number) {
                    System.out.println("Error: please input a number small than " + number);
                    scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please input a valid integer!");
                scanner.nextLine();
            }
        }
        scanner.close();
        return inputtedInteger;
    }

    public static int readIntSmallThan(int number, String question, String notFitRangeErrMsg, String typeErrMsg) {
        Scanner scanner = new Scanner(System.in);
        int inputtedInteger;
        while (true) {
            try {
                System.out.print(question);
                inputtedInteger = scanner.nextInt();
                if (inputtedInteger >= number) {
                    System.out.println(notFitRangeErrMsg);
                    scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(typeErrMsg);
                scanner.nextLine();
            }
        }
        scanner.close();
        return inputtedInteger;
    }

    public static double[] readDoubleArrOfNumber(int num) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 0) {
            scanner.close();
            return new double[]{0};
        } else {
            double Double[] = new double[num];
            while (true) {
                while(true) {
                    try {
                        System.out.print("Please input the first double: ");
                        Double[0] = scanner.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error: Please input a valid double!");
                        scanner.nextLine();
                    }
                }
                for (int i = 1; i < Double.length; i++) {
                    while (true) {
                        try {
                            System.out.print("Please input the next double: ");
                            Double[i] = scanner.nextDouble();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error: Please input a valid double!");
                            scanner.nextLine();
                        }
                    }
                }
                break;
            }
            scanner.close();
            return Double;
        }
    }

    public static double[] readDoubleArrOfNumber(int num, String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 0) {
            scanner.close();
            return new double[]{0};
        } else {
            double Double[] = new double[num];
            while (true) {
                while(true) {
                    try {
                        System.out.print(question);
                        Double[0] = scanner.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.println(errMsg);
                        scanner.nextLine();
                    }
                }
                for (int i = 1; i < Double.length; i++) {
                    while (true) {
                        try {
                            System.out.print(question);
                            Double[i] = scanner.nextDouble();
                            break;
                        } catch (Exception e) {
                            System.out.println(errMsg);
                            scanner.nextLine();
                        }
                    }
                }
                break;
            }
            scanner.close();
            return Double;
        }
    }

    public static double[][] readDoubleArrOfNumber(int row, int column) {
        Scanner scanner = new Scanner(System.in);
        if (row <= 0 || column<=0) {
            scanner.close();
            return new double[1][1];
        } else {
            double Double[][] = new double[row][column];
            for (int i = 0; i < Double.length ; i++) {
                for (int j = 0; j < Double[i].length ; j++) {
                    while (true) {
                        try {
                            if (j == 0) {
                                System.out.print("Please input the first double: ");
                            } else {
                                System.out.print("Please input the next double: ");
                            }
                            Double[i][j] = scanner.nextDouble();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error: Please input a valid double!");
                            scanner.nextLine();
                        }
                    }
                }
                if (i < Double.length - 1) {
                    System.out.println("Start a new line!");
                }
            }
            scanner.close();
            return Double;
        }
    }

    public static double[][] readDoubleArrOfNumber(int row, int column, String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        if (row <= 0 || column<=0) {
            scanner.close();
            return new double[1][1];
        } else {
            double Double[][] = new double[row][column];
            for (int i = 0; i < Double.length ; i++) {
                for (int j = 0; j < Double[i].length ; j++) {
                    while (true) {
                        try {
                            if (j == 0) {
                                System.out.print(question);
                            } else {
                                System.out.print(question);
                            }
                            Double[i][j] = scanner.nextDouble();
                            break;
                        } catch (Exception e) {
                            System.out.println(errMsg);
                            scanner.nextLine();
                        }
                    }
                }
                if (i < Double.length - 1) {
                    System.out.println("Start a new line!");
                }
            }
            scanner.close();
            return Double;
        }
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        double Double;
        while (true) {
            try {
                System.out.print("Please input a double:");
                Double = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Error: Please input a valid double!");
                scanner.nextLine();
            }
        }
        scanner.close();
        return Double;
    }

    public static double readDouble(String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        double Double;
        while (true) {
            try {
                System.out.print(question);
                Double = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println(errMsg);
                scanner.nextLine();
            }
        }
        scanner.close();
        return Double;
    }

    public static double readDoubleBiggerThan(double number) {
        Scanner scanner = new Scanner(System.in);
        double inputtedDouble;
        while (true) {
            try {
                System.out.print("Please input a double bigger than "+number+":");
                inputtedDouble = scanner.nextDouble();
                if (inputtedDouble <= number) {
                    System.out.println("Error: please input a number bigger than " + number);
                    scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please input a valid double!");
                scanner.nextLine();
            }
        }
        scanner.close();
        return inputtedDouble;
    }

    public static double readDoubleBiggerThan(double number, String question, String notFitRangeErrMsg, String typeErrMsg) {
        Scanner scanner = new Scanner(System.in);
        double inputtedDouble;
        while (true) {
            try {
                System.out.print(question);
                inputtedDouble = scanner.nextDouble();
                if (inputtedDouble <= number) {
                    System.out.println(notFitRangeErrMsg);
                    scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(typeErrMsg);
                scanner.nextLine();
            }
        }
        scanner.close();
        return inputtedDouble;
    }

    public static double readDoubleSmallThan(double number) {
        Scanner scanner = new Scanner(System.in);
        double inputtedDouble;
        while (true) {
            try {
                System.out.print("Please input a integer smaller than "+number+":");
                inputtedDouble = scanner.nextDouble();
                if (inputtedDouble >= number) {
                    System.out.println("Error: please input a number small than " + number);
                    scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please input a valid double!");
                scanner.nextLine();
            }
        }
        scanner.close();
        return inputtedDouble;
    }

    public static double readDoubleSmallThan(double number, String question, String notFitRangeErrMsg, String typeErrMsg) {
        Scanner scanner = new Scanner(System.in);
        double inputtedDouble;
        while (true) {
            try {
                System.out.print(question);
                inputtedDouble = scanner.nextDouble();
                if (inputtedDouble >= number) {
                    System.out.println(notFitRangeErrMsg);
                    scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(typeErrMsg);
                scanner.nextLine();
            }
        }
        scanner.close();
        return inputtedDouble;
    }

    public static boolean[] readBooleanArrOfNumber(int num) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 0) {
            scanner.close();
            return new boolean[]{false};
        } else {
            boolean tOrFalse[] = new boolean[num];
            while (true) {
                while(true) {
                    try {
                        System.out.print("Please input the first boolean: ");
                        tOrFalse[0] = scanner.nextBoolean();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error: Please input a valid boolean!");
                        scanner.nextLine();
                    }
                }
                for (int i = 1; i < tOrFalse.length; i++) {
                    while (true) {
                        try {
                            System.out.print("Please input the next boolean: ");
                            tOrFalse[i] = scanner.nextBoolean();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error: Please input a valid boolean!");
                            scanner.nextLine();
                        }
                    }
                }
                break;
            }
            scanner.close();
            return tOrFalse;
        }
    }

    public static boolean[] readBooleanArrOfNumber(int num, String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        if (num <= 0) {
            scanner.close();
            return new boolean[]{false};
        } else {
            boolean tOrFalse[] = new boolean[num];
            while (true) {
                while(true) {
                    try {
                        System.out.print(question);
                        tOrFalse[0] = scanner.nextBoolean();
                        break;
                    } catch (Exception e) {
                        System.out.println(errMsg);
                        scanner.nextLine();
                    }
                }
                for (int i = 1; i < tOrFalse.length; i++) {
                    while (true) {
                        try {
                            System.out.print(question);
                            tOrFalse[i] = scanner.nextBoolean();
                            break;
                        } catch (Exception e) {
                            System.out.println(errMsg);
                            scanner.nextLine();
                        }
                    }
                }
                break;
            }
            scanner.close();
            return tOrFalse;
        }
    }

    public static boolean[][] readBooleanArrOfNumber(int row, int column) {
        Scanner scanner = new Scanner(System.in);
        if (row <= 0 || column<=0) {
            scanner.close();
            return new boolean[1][1];
        } else {
            boolean tOrFalse[][] = new boolean[row][column];
            while (true) {
                for (int i = 0; i < tOrFalse.length; i++) {
                    for (int j = 0; j < tOrFalse[i].length ; j++) {
                        while (true) {
                            try {
                                if (j==0){
                                    System.out.print("Please input the first boolean: ");
                                } else{
                                    System.out.print("Please input the next boolean: ");
                                }
                                tOrFalse[i][j] = scanner.nextBoolean();
                                break;
                            } catch (Exception e) {
                                System.out.println("Error: Please input a valid boolean!");
                                scanner.nextLine();
                            }
                        }
                    }
                    if (i<tOrFalse.length) {
                        System.out.println("Start a new line!");
                    }
                }
                break;
            }
            scanner.close();
            return tOrFalse;
        }
    }

    public static boolean[][] readBooleanArrOfNumber(int row, int column, String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        if (row <= 0 || column<=0) {
            scanner.close();
            return new boolean[1][1];
        } else {
            boolean tOrFalse[][] = new boolean[row][column];
            while (true) {
                for (int i = 0; i < tOrFalse.length; i++) {
                    for (int j = 0; j < tOrFalse[i].length ; j++) {
                        while (true) {
                            try {
                                if (j==0){
                                    System.out.print(question);
                                } else{
                                    System.out.print(question);
                                }
                                tOrFalse[i][j] = scanner.nextBoolean();
                                break;
                            } catch (Exception e) {
                                System.out.println(errMsg);
                                scanner.nextLine();
                            }
                        }
                    }
                    if (i<tOrFalse.length) {
                        System.out.println("Start a new line!");
                    }
                }
                break;
            }
            scanner.close();
            return tOrFalse;
        }
    }

    public static boolean readBoolean() {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue;
        while (true) {
            try {
                System.out.print("Please input a boolean value(true or false): ");
                isTrue = scanner.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("Error: Please input a valid boolean value(true or false only)!");
                scanner.nextLine();
            }
        }
        scanner.close();
        return isTrue;
    }

    public static boolean readBoolean(String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue;
        while (true) {
            try {
                System.out.print(question);
                isTrue = scanner.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println(errMsg);
                scanner.nextLine();
            }
        }
        scanner.close();
        return isTrue;
    }

    public static char readChar() {
        Scanner scanner = new Scanner(System.in);
        char character;
        while (true){
            try {
                System.out.print("Please input a character: ");
                String temp = scanner.nextLine();
                if (temp.length()>1){
                    System.out.println("Error: Please input a valid character(Only one)!");
                }else{
                    character = temp.charAt(0);
                    break;
                }

            } catch (Exception e){
                System.out.println("Error: Please input a valid character!");
            }
        }
        scanner.close();
        return character;
    }

    public static char readChar(String question, String errMsg) {
        Scanner scanner = new Scanner(System.in);
        char character;
        while (true){
            try {
                System.out.print(question);
                String temp = scanner.nextLine();
                if (temp.length()>1){
                    System.out.println(errMsg);
                }else{
                    character = temp.charAt(0);
                    break;
                }

            } catch (Exception e){
                System.out.println(errMsg);
            }
        }
        return character;
    }

    public static char[] readCharArrOfNumber(int x){
        Scanner scanner = new Scanner(System.in);
        char[] character = new char[x];
        for (int i = 0; i < character.length ; i++) {
            while (true){
                try {
                    if (i == 0) {
                        System.out.print("Please input the first character: ");
                    }else{
                        System.out.print("Please input the second character: ");
                    }
                    String temp = scanner.nextLine();
                    if (temp.length()>1){
                        System.out.println("Error: Please input a valid character(Only one)!");
                    }else{
                        character[i] = temp.charAt(0);
                        break;
                    }

                } catch (Exception e){
                    System.out.println("Error: Please input a valid character!");
                }
            }
        }
        scanner.close();
        return character;
    }

    public static char[] readCharArrOfNumber(int x, String question, String errMsg){
        Scanner scanner = new Scanner(System.in);
        char[] character = new char[x];
        for (int i = 0; i < character.length ; i++) {
            while (true){
                try {
                    if (i == 0) {
                        System.out.print(question);
                    }else{
                        System.out.print(question);
                    }
                    String temp = scanner.nextLine();
                    if (temp.length()>1){
                        System.out.println(errMsg);
                    }else{
                        character[i] = temp.charAt(0);
                        break;
                    }

                } catch (Exception e){
                    System.out.println(errMsg);
                }
            }
        }
        scanner.close();
        return character;
    }

    public static char[][] readCharArrOfNumber(int row, int column){
        Scanner scanner = new Scanner(System.in);
        char[][] character = new char[row][column];
        for (int i = 0; i < character.length ; i++) {
            for (int j = 0; j < character[i].length ; j++) {
                while (true){
                    try {
                        if (j == 0) {
                            System.out.print("Please input the first character: ");
                        }else{
                            System.out.print("Please input the second character: ");
                        }
                        String temp = scanner.nextLine();
                        if (temp.length()>1){
                            System.out.println("Error: Please input a valid character(Only one)!");
                        }else{
                            character[i][j] = temp.charAt(0);
                            break;
                        }

                    } catch (Exception e){
                        System.out.println("Error: Please input a valid character!");
                    }
                }
            }
            if (i<character.length){
                System.out.println("Start a new line!");
            }
        }
        scanner.close();
        return character;
    }

    public static char[][] readCharArrOfNumber(int row, int column, String question, String errMsg){
        Scanner scanner = new Scanner(System.in);
        char[][] character = new char[row][column];
        for (int i = 0; i < character.length ; i++) {
            for (int j = 0; j < character[i].length ; j++) {
                while (true){
                    try {
                        if (j == 0) {
                            System.out.print(question);
                        }else{
                            System.out.print(question);
                        }
                        String temp = scanner.nextLine();
                        if (temp.length()>1){
                            System.out.println(errMsg);
                        }else{
                            character[i][j] = temp.charAt(0);
                            break;
                        }

                    } catch (Exception e){
                        System.out.println(errMsg);
                    }
                }
            }
            if (i<character.length){
                System.out.println("Start a new line!");
            }
        }
        scanner.close();
        return character;
    }

    @Override
    public String toString(){
        return "ReadInput, designed by Jiacheng Zhao, is licensed under MIT and anti996 license";
    }
}
