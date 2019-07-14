package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        return this.array.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {

        return this.array.stream().filter(item -> item % 3 == 0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList= new ArrayList<>();
        for (Integer firstItem : firstList) {
            resultList.addAll(secondList.stream().filter(secondItem -> firstItem == secondItem).collect(Collectors.toList()));
        }
        return resultList;
    }

    public List<Integer> getDifferentElements() {

        return this.array.stream().distinct().collect(Collectors.toList());
    }
}