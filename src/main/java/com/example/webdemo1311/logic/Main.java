package com.example.webdemo1311.logic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Main {

    private double start;
    private double end;
    private double step;

    public int calcSteps(double start, double end, double step) {
        return (int) (Math.round((end - start)/step) + 1);
    }

    public double f(double x) {
        return Math.sin(x) + Math.cos(x);
    }

    public List<Point> tabulate(double start, double end, double step) {
        int n = calcSteps(start, end, step);
        return IntStream.range(0, n).mapToDouble(i -> start + i * step).mapToObj(x -> new Point(x, f(x))).toList();
    }

    public List<Point> getPoints() {
        return tabulate(start, end, step);
    }
}
