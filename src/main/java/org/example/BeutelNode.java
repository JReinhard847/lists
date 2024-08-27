package org.example;

class BeutelNode<E> {
    private E data;
    private BeutelNode<E> previous;
    private BeutelNode<E> next;

    public boolean hasNext() {
        return next != null;
    }

    public E getData() {
        return data;
    }

    public BeutelNode<E> getNext() {
        return next;
    }

    public void setNext(BeutelNode<E> next) {
        this.next = next;
    }

    public BeutelNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(BeutelNode<E> previous) {
        this.previous = previous;
    }

    public BeutelNode(E e) {
        data = e;
    }
}
