package org.example.model;

import java.util.Objects;

public class Numbers {
    private int id;
    private int num;

    public Numbers(int num) {
        this.num = num;
        id = getId();
    }

    public Numbers(int id, int num) {
        this.id = id;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return id == numbers.id && num == numbers.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num);
    }
}
