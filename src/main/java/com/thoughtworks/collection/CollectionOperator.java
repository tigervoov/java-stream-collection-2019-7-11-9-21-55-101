package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (right > left) {
            result = IntStream.range(left, right + 1).boxed().collect(Collectors.toList());
        }
        if (left > right) {
            result = IntStream.range(right, left + 1).boxed().collect(Collectors.toList());
            Collections.reverse(result);
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (right > left) {
            result = IntStream.range(left, right + 1).boxed().collect(Collectors.toList());

        }
        if (left > right) {
            result = IntStream.range(right, left + 1).boxed().collect(Collectors.toList());
            Collections.reverse(result);
        }
        return result.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());

    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> arrayList=new ArrayList<>();
        for(int item:array){
            arrayList.add(Integer.valueOf(item));
        }

       return arrayList.stream().filter(item->item%2==0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
       return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
