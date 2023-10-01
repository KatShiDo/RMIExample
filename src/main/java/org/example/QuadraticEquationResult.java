package org.example;

import java.io.Serializable;
import java.util.List;

public class QuadraticEquationResult implements Serializable {
    private List<Double> result;

    public List<Double> getResult() {
        return result;
    }

    public QuadraticEquationResult() {}

    public QuadraticEquationResult(List<Double> result) {
        this.result = result;
    }
}
