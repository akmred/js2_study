package lesson1;

public class BoxDemoApp {

    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(20);
        SimpleBox intBox2 = new SimpleBox(30);

        if(intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer){
            int sum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();
            System.out.println("sum = " + sum);
        }else {
            System.out.println("Содержимое коробок отличается по типу");
        }

        // Вызвали какой-нибудь метод, которому отдали intBox1
        // и этот метод кладет в коробку String
        intBox1.setObj("Java");

        // Продолжаем наш код, и при выполнении получим ClassCastExeption
        int secondSum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();

    }


}
