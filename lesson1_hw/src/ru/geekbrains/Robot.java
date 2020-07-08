package ru.geekbrains;

public class Robot implements Action {

    String name;
    int maxRunLength ;
    int maxJumpHeight;

    public Robot(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(Track track) {
        return maxRunLength > track.getLengthHeight();
    }

    @Override
    public boolean jump(Wall wall) {
        return maxJumpHeight > wall.getLengthHeight();
    }

    @Override
    public String getName() {
        return name;
    }
}
