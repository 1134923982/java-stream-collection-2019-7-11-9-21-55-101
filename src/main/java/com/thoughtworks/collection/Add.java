package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;


import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int min = Math.min(leftBorder, rightBorder);
        int max = Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(min,max)
                .filter(number -> number % 2==0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int min = Math.min(leftBorder, rightBorder);
        int max = Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max)
                .filter(number -> number % 2 !=0).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(number->number*3+2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(number -> number%2!=0?number*3+2:number).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(number->number%2==0).collect(Collectors.averagingDouble(number-> number));
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(number->number%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
