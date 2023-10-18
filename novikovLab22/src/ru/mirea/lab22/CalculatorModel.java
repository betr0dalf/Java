package ru.mirea.lab22;

import java.util.Stack;

class CalculatorModel {
    public static Stack<String> stack;
    public static String operation;
    public static String a;
    public static String b;
    public static String res;
    public static boolean flag;
    public static boolean add_fir;
    public static boolean add_sec;

    static {
        stack = new Stack<>();
        a = "";
        b = "";
        operation = "";
        res = "";
        flag = false;
        add_fir = true;
        add_sec = true;
    }

    public static void modelFromController(String buttonText, String resText) {
        if (!isOperation(buttonText)) {
            if (!flag){
                if (add_fir){
                    if (buttonText.equals(".")) CalculatorController.controllerFromModel("0.");
                    else CalculatorController.controllerFromModel(buttonText);
                    add_fir = false;
                }
                else{
                    if (buttonText.equals(".")){
                        if (!resText.contains(".")) CalculatorController.controllerFromModel(resText + ".");
                    } else CalculatorController.controllerFromModel(resText + buttonText);
                }
            } else{
                if (add_sec){
                    if (buttonText.equals(".")) CalculatorController.controllerFromModel("0.");
                    else CalculatorController.controllerFromModel(buttonText);
                    add_sec = false;
                } else {
                    if (buttonText.equals(".")) {
                        if (!resText.contains(".")) CalculatorController.controllerFromModel("0.");
                    }
                    else CalculatorController.controllerFromModel(resText + buttonText);
                }
            }
        } else {
            if (buttonText.equals("=")) {
                // есть уже два числа и операция
                if (stack.size() == 2) {
                    b = resText;
                    operation = stack.pop();
                    a = stack.pop();
                    try {
                        res = calc();
                        CalculatorController.controllerFromModel(res);
                    } catch (ArithmeticException e) {
                        CalculatorController.controllerFromModel("/ by zero");
                    } finally {
                        flag = false;
                        add_fir = true;
                        add_sec = true;
                    }
                }
            } else {
                // Пришла первая операция
                if (stack.empty()) {
                    stack.add(resText);
                    stack.add(buttonText);
                    flag = true;
                } else if (stack.size() == 2) {
                    operation = stack.pop();
                    a = stack.pop();
                    // Если пришла операция, но она уже есть, то заменяем старую на новую
                    if (a.equals(resText) && !flag) {
                        stack.add(a);
                        stack.add(buttonText);
                    } else {
                        b = resText;
                        try {
                            res = calc();
                            stack.add(res);
                            stack.add(buttonText);
                            CalculatorController.controllerFromModel(res);
                        } catch (ArithmeticException e) {
                            CalculatorController.controllerFromModel("/ by zero");
                        } finally {
                            flag = true;
                            add_fir = true;
                            add_sec = true;
                        }
                    }
                }
            }
        }
    }

    public static boolean isOperation(String data) {
        return data.equals("-") || data.equals("*") || data.equals("/") || data.equals("+") || data.equals("=");
    }

    public static String calc(){
        return switch (operation) {
            case "+" -> Double.toString(Double.parseDouble(a) + Double.parseDouble(b));
            case "-" -> Double.toString(Double.parseDouble(a) - Double.parseDouble(b));
            case "/" -> Double.toString(Double.parseDouble(a) / Double.parseDouble(b));
            case "*" -> Double.toString(Double.parseDouble(a) * Double.parseDouble(b));
            default -> "";
        };
    }
}
