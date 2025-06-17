

// import java.util.Arrays;
// import java.util.Random;
// import java.util.stream.Collectors;
// import java.util.stream.DoubleStream;
// import java.util.stream.IntStream;

// public class PrimitiveStreams {
//     public static void main(String[] args) {

//         // This code demonstrates how to use primitive streams in Java (IntStream, DoubleStream, etc.), which are part of the java.util.stream package and optimized for performance with primitives (to avoid boxing/unboxing overhead).

//         // In Java Streams, .boxed() is used to convert a primitive stream (like IntStream, DoubleStream, LongStream) into a stream of their corresponding wrapper objects (Stream<Integer>, Stream<Double>, etc.).


//         int[] numbers = {1, 2, 3, 4, 5};
//         IntStream stream = Arrays.stream(numbers);

//         System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
//         System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));

//         IntStream.of(1, 2, 3);

//         DoubleStream doubles = new Random().doubles(5);
// //        System.out.println(doubles.sum());
// //        System.out.println(doubles.min());
// //        System.out.println(doubles.max());
// //        System.out.println(doubles.average());
// //        doubles.summaryStatistics()
// //        doubles.mapToInt(x -> (int) (x + 1));
//         System.out.println(doubles.boxed().toList());

//         IntStream intStream = new Random().ints(5);
//         System.out.println(intStream.boxed().toList());
//     }
// }