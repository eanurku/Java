package com.anurag.mapmethods;

public enum TimePeriod {
    START(0),
    Q1(1),
    Q1_BREAK(2),
    Q2(3),
    Q2_BREAK(4),
    Q3(5),
    Q3_BREAK(6),
    Q4(7),
    REGULAR_TIME_OVER(8),
    OVERTIME(9),
    END(10);

    private int id;

    TimePeriod(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
