package ru.mirea.lab19;

public class SortingStudentsByGPAController {
    private SortingStudentsByGPA model;
    private SortingStudentsByGPAView view;
    public SortingStudentsByGPAController(SortingStudentsByGPA model, SortingStudentsByGPAView view) {
        this.model = model;
        this.view = view;
    }
    public void updateView() {
        view.outArray(model.getiDNumber());
    }
}
