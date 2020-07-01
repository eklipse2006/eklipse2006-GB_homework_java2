package ru.geekbrains;

public interface Action {

    boolean run(Track track);

    boolean jump(Wall wall);

    String getName();

}
