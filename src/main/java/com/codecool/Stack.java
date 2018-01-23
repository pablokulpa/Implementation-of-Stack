package com.codecool;

import java.util.EmptyStackException;

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
        if(!checkStackIsFull()) {
            top += 1;
            data[top] = element;
        } else {
            throw new StackOverflowError("Stack is full");
        }
    }

    public Object pop(){
        if(!isEmpty()) {
            return data[top--];
        } else {
            throw new EmptyStackException();
        }
    }

    private boolean checkStackIsFull(){
        return top == maxSize - 1;
    }

    public Object peek(){
        if(!isEmpty()){
            return data[top];
        } else {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public Integer checkBusy(){
        return top+1;
    }

    public Integer checkFree(){
        return maxSize-top-1;
    }
}
