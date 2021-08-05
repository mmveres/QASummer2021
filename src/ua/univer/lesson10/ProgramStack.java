package ua.univer.lesson10;

import java.util.Arrays;
import java.util.Iterator;

enum VagonEnum {
    Pass("Passenger"), Cargo("Cargo");

    private String name;

    VagonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "name='" + name + '\'' +
                '}';
    }
}

enum CarEnum{
    Cargo, Pass;
}

class StackTrain<T> implements Iterable<T>{
    private T[] train;
    private int top = -1;

    public StackTrain(T[] train) {
        this.train = train;
        top = train.length-1;
    }
    public StackTrain() {
        train =(T[]) new Object[8];
    }

    public StackTrain(int n) {
        train = (T[]) new Object[8];
    }

    public void push(T v) {
        if (isFull())
            throw new RuntimeException("Full stack");
        train[++top] = v;
    }

    public T pop() {
        if (isEmpty())
            throw new RuntimeException("Empty stack");

        T v = train[top];
        train[top]=null;
        top--;
        return v;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == train.length-1;
    }

    public T peek() {
        return train[top];
    }

    public void print(){
        for (var v: train) {
            if (v == null) return;
            System.out.println(v);
        }
    }

//    @Override
//    public Iterator<VagonEnum> iterator() {
//        return Arrays.stream(train).
//                filter(v-> v!=null).
//                iterator();
//    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i;
            @Override
            public boolean hasNext() {
                if (!isEmpty())
            return i<=top;
            else return false;
            }

            @Override
            public T next() {
                return train[i++];
            }
        };
    }
//    @Override
//    public Iterator<VagonEnum> iterator() {
//        return new StackTrainIterator<VagonEnum>();
//    }

//    class StackTrainIterator implements Iterator<VagonEnum>{
//        private int i;
//        StackTrainIterator(){
//            this.i = 0;
//        }
//        @Override
//        public boolean hasNext() {
//            if (!isEmpty())
//            return i<=top;
//            else return false;
//        }
//
//        @Override
//        public VagonEnum next() {
//            return train[i++];
//        }
//    }
}

public class ProgramStack {
    public static void main(String[] args) {
      //  StackTrain train = getStackTrain7();
        StackTrain<VagonEnum> train = new StackTrain();
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Pass);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Pass);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Pass);
        train.push(VagonEnum.Pass);
        train.print();

        StackTrain<VagonEnum> passTrain = new StackTrain();
        StackTrain<VagonEnum> cargoTrain = new StackTrain();

        while (!train.isEmpty()){
           if( train.peek() == VagonEnum.Cargo)
              cargoTrain.push(train.pop());
           else
               passTrain.push(train.pop());
        }
        System.out.println("************************");
        cargoTrain.print();
        passTrain.print();

        System.out.println("________________________");
        for (var v: cargoTrain) {
            System.out.println(v);
        }

        Iterator<VagonEnum> iter = passTrain.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        System.out.println("--------------------------------");

        train.print();
    }

    private static StackTrain getStackTrain7() {
        VagonEnum[] vagons = {
                VagonEnum.Pass,
                VagonEnum.Cargo,
                VagonEnum.Pass,
                VagonEnum.Cargo,
                VagonEnum.Pass,
                VagonEnum.Cargo,
                VagonEnum.Cargo
        };
        return new StackTrain(vagons);
    }
}
