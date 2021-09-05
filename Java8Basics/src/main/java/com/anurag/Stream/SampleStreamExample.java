package com.anurag.Stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SampleStreamExample {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(4);


        //foreach
        list.stream().forEach(s-> System.out.print(" "+s));
        System.out.println();

        //parallel stream with for eachordered
        list.parallelStream().forEachOrdered(s-> System.out.print(" "+s));
        System.out.println();

        //map
        list.stream().map(s->s*s).forEach(s-> System.out.print(" "+s));

        //collect method :termination operation
        List<Integer> newlist = list.stream().map(s -> s * s).distinct().collect(Collectors.toList());
        newlist.forEach(s-> System.out.print(" "+s));
        System.out.println();

        //filter
        System.out.println(" even count="+list.stream().filter(s->s%2==0).count());

        //limit
        Random random=new Random();
        random.ints().limit(10).forEach(s-> System.out.print(" "+s));
        System.out.println();
        //sort
        random.ints(100,230).limit(10).sorted().forEach(s-> System.out.print(" "+s));
        System.out.println();

        //stats
        IntSummaryStatistics stats = list.stream().mapToInt(x -> x*x).summaryStatistics();
        System.out.println("max="+stats.getMax());




    }
}
