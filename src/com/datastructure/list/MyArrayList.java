package com.datastructure.list;

import java.util.Arrays;

public class MyArrayList<T> implements IList<T> {
    private static final int DEFAULT_SIZE = 50;

    private int size;
    private T[] elements;

    public MyArrayList() {
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void add(T t) {                              //현재 리스트의 가장 뒤에 데이터를 add함.
        if (this.size == this.elements.length) {        //배열이 꽉차있는 경우 ==> 이경우에는 배열을 늘려줘야함 (기존 저장되어 있던걸 옮겨야함)
            this.elements = Arrays.copyOf(this.elements, this.size * 2);  //(복사대상 엘리먼트, 사이즈를 어느정도까지 늘려줄지 설정함)
        }

        this.elements[this.size] = t;               //index 위치값을 this.size로 접근하면 항상 현재 size 크기 인덱스위치에 할당하게 됨
        this.size += 1;
    }

    @Override
    public void insert(int index, T t) {
        if (this.size == this.elements.length) {        //배열이 꽉차있는 경우 ==> 이경우에는 배열을 늘려줘야함 (기존 저장되어 있던걸 옮겨야함)
            this.elements = Arrays.copyOf(this.elements, this.size * 2);  //(복사대상 엘리먼트, 사이즈를 어느정도까지 늘려줄지 설정함)
        }

        for (int i = index; i < this.size; i++) {       //index 뒤에 있는 데이터들은 한칸씩 뒤로 밀어줘야함
            this.elements[i+1] = this.elements[i];
        }

        this.elements[index] = t;
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
    }

    @Override
    public boolean delete(T t) {
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        if (this.size <= index) {
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
