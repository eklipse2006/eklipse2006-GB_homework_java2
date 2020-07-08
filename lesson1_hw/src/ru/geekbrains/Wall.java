package ru.geekbrains;

public class Wall implements Obstructions {

    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getLengthHeight() {
        return height;
    }
}
