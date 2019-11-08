package com.techzjc;

import java.util.Scanner;

/**
 * @author  Jiacheng Zhao   <a href="mailto:admin@techzjc.com">admin@techzjc.com</a>
 * @version 1.0.0
 */

public class ReadInput {
    private Scanner scanner = new Scanner(System.in);

    public String ReadString() {
        String string;
        while (true) {
            try {
                System.out.print("Please input a string: ");
                string = this.scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
                this.scanner.nextLine();
            }
        }
        return string;
    }

    public int readInt() {
        int integer;
        while (true) {
            try {
                System.out.print("Please input a integer: ");
                integer = this.scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error: Please input a valid integer!");
                this.scanner.nextLine();
            }
        }
        return integer;
    }

    public int readIntBiggerThan(int number) {
        int inputtedInteger;
        while (true) {
            try {
                System.out.print("Please input a integer bigger than "+number+":");
                inputtedInteger = this.scanner.nextInt();
                if (inputtedInteger <= number) {
                    System.out.println("Error: please input a number bigger than " + number);
                    this.scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please input a valid integer!");
                this.scanner.nextLine();
            }
        }
        return inputtedInteger;
    }

    public int readIntSmallThan(int number) {
        int inputtedInteger;
        while (true) {
            try {
                System.out.print("Please input a integer smaller than "+number+":");
                inputtedInteger = this.scanner.nextInt();
                if (inputtedInteger >= number) {
                    System.out.println("Error: please input a number small than " + number);
                    this.scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please input a valid integer!");
                this.scanner.nextLine();
            }
        }
        return inputtedInteger;
    }

    public double readDouble() {
        double Double;
        while (true) {
            try {
                System.out.print("Please input a double:");
                Double = this.scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Error: Please input a valid double!");
                this.scanner.nextLine();
            }
        }
        return Double;
    }

    public double readDoubleBiggerThan(double number) {
        double inputtedDouble;
        while (true) {
            try {
                System.out.print("Please input a double bigger than "+number+":");
                inputtedDouble = this.scanner.nextDouble();
                if (inputtedDouble <= number) {
                    System.out.println("Error: please input a number bigger than " + number);
                    this.scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please input a valid double!");
                this.scanner.nextLine();
            }
        }
        return inputtedDouble;
    }

    public double readDoubleSmallThan(double number) {
        double inputtedDouble;
        while (true) {
            try {
                System.out.print("Please input a integer smaller than "+number+":");
                inputtedDouble = this.scanner.nextDouble();
                if (inputtedDouble >= number) {
                    System.out.println("Error: please input a number small than " + number);
                    this.scanner.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Please input a valid double!");
                this.scanner.nextLine();
            }
        }
        return inputtedDouble;
    }

    public boolean readBoolean() {
        boolean isTrue;
        while (true) {
            try {
                System.out.print("Please input a boolean value(true or false): ");
                isTrue = this.scanner.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("Error: Please input a valid boolean value(true or false only)!");
                this.scanner.nextLine();
            }
        }
        return isTrue;
    }

    @Override
    public String toString() {
        return "Copyright (c) 2019 Jiacheng Zhao\nIn order to legally use this source code, please carefully read the LICENSE file accompany with this source code!\nInstruction: \nInitialize this object and you can, directly, use method by using method selector.";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void close(){
        this.scanner.close();
    }

}
