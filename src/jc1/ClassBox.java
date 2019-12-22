package jc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassBox<T> implements Comparable<ClassBox> {

    // Коробка с фруктами
    private List<T> box;

    // Вес коробки
    private int weightBox;
    // Вес коробки мах
    private int weightBoxМах;
    // Что в коробке
    private fruits typeBox;

    // Передаем макс вес коробки, тип фруктов
    public ClassBox(int weightBoxМах, fruits typeBox) {
        this.weightBoxМах = weightBoxМах;
        this.typeBox = typeBox;
        box = new ArrayList<T>();
    }

    // Текущий вес коробки
    public int getWeightBox() {
        return weightBox;
    }

    // Количество фруктов
    public int getSizeFruit() {
        return box.size();
    }

    @Override
    public int compareTo(ClassBox o) {
        if (this.typeBox == o.typeBox)
            return 1;
        else
            return 0;
    }

    // Максимальный вес коробки
    public int getWeightBoxМах() {
        return weightBoxМах;
    }

    // Что лежит в коробке
    public fruits getTypeBox() {
        return typeBox;
    }

    // Вернуть фрукты
    public List<T> getFruits() {
        return box;
    }

    // Положить фрукты
    public void setFruits(List<T> box) {
        this.box = box;
    }

    // Добавляем фрукт
    public boolean addFruit(ClassFruits fruit){

        if(fruit.getFruit() != typeBox){
            System.out.println("В этой коробке: " + typeBox);
            return false;
        }
        else if(weightBoxМах < weightBox + fruit.getWeight()) {
            System.out.println("Макс вес коробки: " + weightBoxМах
                    + " с этим фруктом будет: " + (weightBox + fruit.getWeight())
                    + " ,ваш фрукт не влезает");
            return false;
        }

        box.add((T) fruit);
        weightBox += fruit.getWeight();

        return true;
    }

    public void setWeightBox(int weightBox) {
        this.weightBox = weightBox;
    }

    // Пересыпаем фрукты из одной коробки в другую
    public boolean putFruits(ClassBox box2){

        if (compareTo(box2) == 1){
            // Что то у меня этот метод вызвал исключение !!!!!!!!
           // Collections.copy(this.box, box2.getFruits());
            this.box.addAll(box2.getFruits());
            this.setWeightBox(box2.getWeightBox());
            return true;
        }
        else {
            System.out.println("В коробках лежат разные фрукты");
        }

        return false;
    }

}
