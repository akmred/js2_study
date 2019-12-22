package jc1;

/*
* Класс фрукты
* имеет перечисление фрукты Яблоко и апельсины
* */
class ClassFruits {
    private fruits fruit;
    private int weight;

    public ClassFruits(fruits fruit, int weight) {
        this.fruit = fruit;
        this.weight = weight;
    }

    public fruits getFruit() {
        return fruit;
    }

    public void setFruit(fruits fruit) {
        this.fruit = fruit;
    }

    public int getWeight() {
        return weight;
    }

}
