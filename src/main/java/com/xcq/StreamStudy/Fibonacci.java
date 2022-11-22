package com.xcq.StreamStudy;

/**
 * Stream.iterate() 产生的流的第一个元素是种子（iterate方法的第一个参数），然后将种子传递给方法（iterate方法的第二个参数）。
 * 方法运行的结果被添加到流（作为流的下一个元素），并被存储起来，作为下次调用 iterate()方法时的第一个参数，
 * 以此类推。我们可以利用 iterate() 生成一个斐波那契数列（上一章已经遇到过Fibonacci）。
 */
// streams/Fibonacci.java
import java.util.stream.*;
public class Fibonacci {
        int x =1;
        Stream<Integer> numbers(){
            return Stream.iterate(0,i->{
                int result = x + i;
                x = i;
                return result;
            });
        }

    public static void main(String[] args) {
        new Fibonacci().numbers().skip(20)
                .limit(10).forEach(System.out::println);
    }
}