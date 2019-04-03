package com.example.devfesttalks.entity;

public final class Label implements Comparable<Label> {

    private final String name;

    public Label(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Label other) {
        return name.compareTo(other.name);
    }
}
