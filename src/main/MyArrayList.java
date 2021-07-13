package main;

public class MyArrayList {

    private String[] array = new String[10];
    public int size = 0;

    public void add(String s) {
        array[size] = s;
    }
}
