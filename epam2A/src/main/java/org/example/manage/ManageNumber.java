package org.example.manage;

import org.example.model.Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ManageNumber {
    private final List<Numbers> numberList = new ArrayList<>();

    public List<Numbers> getNumberList() {
        return numberList;
    }

    public void addNewNum(Numbers numbers) {
        if (numbers != null) {
            numberList.add(numbers);
            numbers.setId(numberList.size() + 1);
        }
    }

    public void addListNum(int size, int from, int to) {
        while (size != 0) {
            if (to > from) {
                addNewNum(new Numbers(from + new Random().nextInt(to - from)));
                size--;
            }
        }
    }

    public void removeById(int id) {
        if (numberList.contains(numberList.get(id - 1))) {
            numberList.remove(id - 1);
        }
    }

    public void clear() {
        numberList.clear();
    }
}
