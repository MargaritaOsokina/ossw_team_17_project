package com.cauossw.snake;

public class DefaultConst {
    static final int WIDTH = 40;
    static final int HEIGHT = 80;

    static final int SNAKE_LENGTH = 4;
    static final int SNAKE_SPEED = 300;

    static final int SNAKE_DUAL_APPLE_NUM = 2;
    static final int SNAKE_DUAL_1_X = 0;
    static final int SNAKE_DUAL_1_Y = 0;
    static final Direction SNAKE_DUAL_1_DIR = Direction.DOWN;

    static final int SNAKE_DUAL_2_X = WIDTH - 1;
    static final int SNAKE_DUAL_2_Y = HEIGHT - 1;
    static final Direction SNAKE_DUAL_2_DIR = Direction.UP;

    static final int SNAKE_SINGLE_APPLE_NUM = 2;
    static final int SNAKE_SINGLE_X = WIDTH / 2;
    static final int SNAKE_SINGLE_Y = HEIGHT / 2;
    static final Direction SNAKE_SINGLE_DIR = Direction.UP;
}
