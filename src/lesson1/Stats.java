package lesson1;

public class Stats<T extends Number> {
    private T[] nums;

    public Stats(T...nums) {
        this.nums = nums;
    }

    public double avg(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i].doubleValue(); // error
        }
        return sum/nums.length;
    }
}
