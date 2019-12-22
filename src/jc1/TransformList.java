package jc1;

import java.util.ArrayList;
import java.util.Arrays;

public class TransformList<T> {
    private T[] ls;
    private T element1;
    private ArrayList<T> array_ls = new ArrayList<T>();

    public TransformList(T...ls) {
        this.ls = ls;
    }

    public T[] getLs() {
        return ls;
    }

    public int getLengthArrayList() {
        return array_ls.size();
    }

    public ArrayList getArrayList() {

        array_ls.addAll(Arrays.asList(ls));

        return array_ls;
    }

    public void setLs(T[] ls) {
        this.ls = ls;
    }

    public boolean moveTwoElement(){

        if (ls.length > 0) {
            element1 = ls[0];
            ls[0] = ls[1];
            ls[1] = element1;

            return true;
        }

         return false;
    }

}
