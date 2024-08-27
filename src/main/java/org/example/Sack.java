package org.example;

public class Sack<E> {
    private Object[] data;

    public Sack() {
        this.data = new Object[]{};
    }

    public void add(E e) {
        Object[] newData = new Object[data.length + 1];
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[data.length] = e;
        data = newData;
    }

    public E get(int index) {
        return (E) data[index];
    }

    public void removeLast() {
        if (data.length == 0) {
            return;
        }
        Object[] newData = new Object[data.length - 1];
        System.arraycopy(data, 0, newData, 0, data.length - 1);
        data = newData;
    }

    public int size() {
        return data.length;
    }

    public void removeByIndex(int index) {
        Object[] newData = new Object[data.length - 1];
        for (int i = 0; i < data.length-1; i++) {
            newData[i] = data[i + (i < index ? 0 : 1)];
        }
        data = newData;
    }
}
