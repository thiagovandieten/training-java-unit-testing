package io.testsmith.coffeemachine.domain;

public enum Portion {
    SMALL(1), MEDIUM(2), LARGE(3);

    private final int size;

    Portion(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }
}