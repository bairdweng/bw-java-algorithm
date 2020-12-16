package com.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
    private List<E> list = new ArrayList<>();

    // 删除
    public void clear() {
        list.clear();
    }

    // 栈的大小
    public int size() {
        return list.size();
    }

    // 是否是空
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // 入栈
    public void push(E element) {
        list.add(element);
    }

    // 出栈
    public E pop() {
        return list.remove(list.size() - 1);
    }

    public E top() {
        return list.get(list.size() - 1);
    }
}