package ex_5;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Subject> bestItems = null;

    private double maxW;
    private double bestPrice;


    private double calcWeigth(List<Subject> subjects) {//общий вес предметов
        double result = 0;
        for (Subject subject : subjects) {
            result += subject.getWeigth();
        }
        return result;
    }


    private double calcPrice(List<Subject> subjects) {//общая стоимость предметов
        double result1 = 0;
        for (Subject subject : subjects) {
            result1 += subject.getPrice();
        }
        return result1;
    }


    private void checkSet(List<Subject> subjects) { //проверка, является ли данный набор лучшим решением задачи
        if (this.bestItems == null) {
            if (this.calcWeigth(subjects) <= this.maxW) {
                this.bestItems = subjects;
                this.bestPrice = this.calcPrice(subjects);
            }
        } else {
            if (this.calcWeigth(subjects) <= this.maxW && this.calcPrice(subjects) > this.bestPrice) {
                this.bestItems = subjects;
                this.bestPrice = this.calcPrice(subjects);
            }
        }
    }


    public void makeAllSets(List<Subject> subjects) {//перебор всех наборов
        if (subjects.size() > 0) {
            this.checkSet(subjects);
        }
        for (int i = 0; i < subjects.size(); i++) {
            List<Subject> newSet = new ArrayList<>(subjects);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public Box(double maxW) {
        this.maxW = maxW;
    }

    public List<Subject> getBestItems() {
        return this.bestItems;
    }

}
