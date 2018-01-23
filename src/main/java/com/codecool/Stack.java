package com.codecool;

public class Stack {
    private int maxSize;
    private Object data[];
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.data = new Object[maxSize];
        this.top = -1;
    }

    public void push(Object element){
        if(checkSize()) {
            top += 1;
            data[top] = element;
        }
    }

    public Object pop(){
        top-=1;
        return data[top];
    }

    private boolean checkSize(){
        if(top == maxSize){
            return false;
        } else {
            return true;
        }
    }

    public Object peek(){
        return data[top];
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
}
