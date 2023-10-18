package ru.mirea.lab22;

class CalculatorController {
    public static void controllerFromView(String buttonText, String resText){
        CalculatorModel.modelFromController(buttonText, resText);
    }

    public static void controllerFromModel(String data){
        CalculatorView.viewFromController(data);
    }
}
