package stack;

import array.MyArray;

// 배열을 활용하여 Stack 구현하기
public class MyArrayStack {

    int top;
    MyArray arrayStack;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("stack is full");
        }

        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if (top == 0) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek() {
        if (top ==0) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top-1);
    }

    public int getSize() {
        return top;
    }

    public boolean isFull() {
        if(top == arrayStack.ARRAY_SIZE) {
            return true;
        }
        else return false;
    }
    public boolean isEmpty() {
        if (top == 0) {
            return true;
        }
        else  return false;
    }

    public void printAll(){
        arrayStack.printAll();
    }
}
