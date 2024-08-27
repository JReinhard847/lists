package org.example;

public class Beutel<E> {
    private int size = 0;
    private BeutelNode<E> first;

    public Beutel() {
        first = null;
    }

    public void add(E toAdd) {
        size++;
        BeutelNode<E> node = new BeutelNode<>(toAdd);
        if (first == null) {
            first = node;
            return;
        }
        BeutelNode<E> current = first;
        while (current.hasNext()) {
            current = current.getNext();
        }
        current.setNext(node);
        node.setPrevious(current);
    }

    public E get(int index) {
        if (first == null) {
            return null;
        }
        BeutelNode<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public void removeLast() {
        size--;
        BeutelNode<E> current = first;
        if (first.getNext() == null) {
            first = null;
            return;
        }
        while (current.getNext().hasNext()) {
            current = current.getNext();
        }
        current.setNext(null);
    }

    public int size() {
        return this.size;
    }

    public void removeByIndex(int index) {
        if (first == null) {
            return;
        }
        if (index == 0) {
            first = first.getNext();
            size--;
            return;
        }
        BeutelNode<E> current = first;
        for (int i = 0; i < index; i++) {
            if (!current.hasNext()) {
                return;
            }
            current = current.getNext();
        }
        size--;
        current.getPrevious().setNext(current.getNext());
        if (current.hasNext()) {
            current.getNext().setPrevious(current.getPrevious());
        }

    }

}
