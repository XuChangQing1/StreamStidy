package com.xcq.StreamStudy;

// streams/Reduce.java
import java.util.*;
import java.util.stream.*;
class Frobnitz {
    int size;
    Frobnitz(int sz) { size = sz; }
    @Override
    public String toString() {
        return "Frobnitz(" + size + ")";
    }
    // Generator:
    static Random rand = new Random(47);
    static final int BOUND = 100;
    static Frobnitz supply() {
        return new Frobnitz(rand.nextInt(BOUND));
    }
}
public class Reduce {
    public static void main(String[] args) {
        Stream.generate(Frobnitz::supply)
                .limit(10)
                .peek(System.out::println)
                .reduce((fr0, fr1) -> fr0.size < 50 ? fr0 : fr1)
                .ifPresent(System.out::println);
    }
}