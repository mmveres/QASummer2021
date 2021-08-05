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

class StackTrain implements Iterable<VagonEnum>{
    private VagonEnum[] train;
    private int top = -1;

    public StackTrain(VagonEnum[] train) {
        this.train = train;
        top = train.length-1;
    }
    public StackTrain() {
        train = new VagonEnum[8];
    }

    public StackTrain(int n) {
        train = new VagonEnum[n];
    }

    public void push(VagonEnum v) {
        if (isFull())
            throw new RuntimeException("Full stack");
        train[++top] = v;
    }

    public VagonEnum pop() {
        if (isEmpty())
            throw new RuntimeException("Empty stack");
        return train[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == train.length-1;
    }

    public VagonEnum peek() {
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
    public Iterator<VagonEnum> iterator() {
        return new Iterator<VagonEnum>() {
            private int i;
            @Override
            public boolean hasNext() {
                if (!isEmpty())
            return i<=top;
            else return false;
            }

            @Override
            public VagonEnum next() {
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
        StackTrain train = new StackTrain();
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Pass);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Pass);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Pass);
        train.push(VagonEnum.Pass);
        train.print();

        StackTrain passTrain = new StackTrain();
        StackTrain cargoTrain = new StackTrain();

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
