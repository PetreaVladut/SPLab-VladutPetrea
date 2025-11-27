package org.example.splabvladutpetrea.Library;

public interface Element {
    default void add(Element e) {
    }
    default void remove(Element e) {
    }
    default void get(Element e) {
    }
    default void print() {
        System.out.println(this);
    }
}
