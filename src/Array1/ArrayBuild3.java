package Array1;

import java.util.Arrays;

public class ArrayBuild3 {
    private int length;
    private Object[] data;
    private int capacity;

    public ArrayBuild3(){
        this.length = 0;
        this.data = new Object[1];
        this.capacity = 1;
    }

    public Object get(int index){
        return data[index];

    }

    public void push(Object obj){
        if(capacity == length){
            data = Arrays.copyOf(data, capacity * 2);
            capacity *= 2;
        }
        data[length] = obj;
        length++;
    }

    public Object delete(int index){
        Object deleted = data[index];

        shiftItems(index);

        return deleted;

    }

    public void shiftItems(int index){
        for (int i = index; i < length - 1; i++){
            data[i] = data[i+1];
        }
        data[length - 1] = null;
        length--;

    }

    public Object pop(){
        Object lastItem = data[length - 1];
        data[length - 1] = null;
        length--;
        return lastItem;
    }



    public static void main(String[] args) {
        ArrayBuild3 m = new ArrayBuild3();
        m.push("Hello");
        m.push("World");
        m.push("!");

        System.out.println(m.get(0));
        System.out.println(m.length);
        System.out.println(m.capacity);

        System.out.println( m.delete(1));
        System.out.println(m.get(1));
        System.out.println(m.length);
        System.out.println(m.capacity);



    }


}
