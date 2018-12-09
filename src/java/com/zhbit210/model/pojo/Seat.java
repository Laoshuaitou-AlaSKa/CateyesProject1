package com.zhbit210.model.pojo;

import lombok.Data;

public class Seat {
    private String hallName;
    private int line;
    private int row;

    public Seat() {
    }

    public Seat(int line, int row) {
        this.line = line;
        this.row = row;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "hallName='" + hallName + '\'' +
                ", line=" + line +
                ", row=" + row +
                '}';
    }
}
