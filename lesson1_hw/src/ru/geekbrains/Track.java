package ru.geekbrains;

public class Track implements Obstructions {

    int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getLengthHeight() {
        return length;
    }
}
