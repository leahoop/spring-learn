package com.leetcode.solution.hash_map;

import java.util.Map;
import java.util.Objects;


public class Test {

    public static void main(String[] args) {


//模拟HashMap.resize()运行场景，初始化扩容数据
        int oldCap = 16; // 原大小
        int newCap = 32; // 新大小
        Node[] newTab = new Node[newCap];

        int j = 0; // 假设当前循环跑到第一个下面

        // 并且假设当前第一个下面是 以下长度为7的链表
        Node e = new Node(0, "0", "0",
                new Node(0, "1", "1",
                        new Node(16, "2", "2",
                                new Node(0, "3", "3",
                                        new Node(0, "4", "4",
                                                new Node(16, "5", "5",
                                                        new Node(0, "6", "6", null)))))));

        Node loHead = null, loTail = null;
        Node hiHead = null, hiTail = null;
        Node next;
        do {
            next = e.next;
            if ((e.hash & oldCap) == 0) {
                if (loTail == null)
                    loHead = e;
                else
                    loTail.next = e;
                loTail = e;
            } else {
                if (hiTail == null)
                    hiHead = e;
                else
                    hiTail.next = e;
                hiTail = e;
            }
        } while ((e = next) != null);
        if (loTail != null) {
            loTail.next = null;
            newTab[j] = loHead;
        }
        if (hiTail != null) {
            hiTail.next = null;
            newTab[j + oldCap] = hiHead;
        }
    }


    static class Node<K, V> implements Map.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }

        public final String toString() {
            return key + "=" + value;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Map.Entry) {
                Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
                if (Objects.equals(key, e.getKey()) &&
                        Objects.equals(value, e.getValue()))
                    return true;
            }
            return false;
        }
    }

}