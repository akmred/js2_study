package jc1;

     /*
     * • Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
        • Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        • Для хранения фруктов внутри коробки можно использовать ArrayList;
        • Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов
     * и вес одного фрукта (вес яблока – 1.0f, апельсина – 1.5f. Не важно, в каких это единицах);
        • Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
        *  которую подадут в compare в качестве параметра, true – если она равны по весу,
     * false – в противном случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        • Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую
     * (помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами).
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
     * которые были в этой коробке;
        Не забываем про метод добавления фрукта в коробку.
     * */

public class ClassMainFruits {
    public static void main(String[] args) {

        ClassApple apple = new ClassApple(1);
        ClassOrange orange = new ClassOrange(2);

        ClassBox<ClassFruits> box1 = new ClassBox<>(20, fruits.APPLE);
        ClassBox<ClassFruits> box2 = new ClassBox<>(20, fruits.ORANGE);

        box1.addFruit(new ClassApple(1));
        box1.addFruit(new ClassApple(2));
        box1.addFruit(new ClassOrange(10));
        box1.addFruit(new ClassApple(15));

        box2.addFruit(new ClassOrange(2));
        box2.addFruit(new ClassOrange(3));
        box2.addFruit(new ClassOrange(35));
        box2.addFruit(new ClassApple(1));

        System.out.println("В 1 ящике: " + box1.getSizeFruit() + " Вес: " + box1.getWeightBox());
        System.out.println("В 2 ящике: " + box2.getSizeFruit() + " Вес: " + box2.getWeightBox());

        if (box1.compareTo(box2) == 1){
            System.out.println("В ящиках бокс1 и бокс2 одинаковые фрукты");
        } else
            System.out.println("В ящиках бокс1 и бокс2 разные фрукты");

        ClassBox<ClassFruits> box3 = new ClassBox<ClassFruits>(30, fruits.ORANGE);
        box3.putFruits(box1);
        box3.putFruits(box2);
        System.out.println("box2 put weight: " + box3.getSizeFruit());

    }
}
