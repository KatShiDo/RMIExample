package org.example;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationImpl implements QuadraticEquation {

    @Override
    public QuadraticEquationResult solve(double a, double b, double c) throws RemoteException{
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            return new QuadraticEquationResult(new ArrayList<>());
        }
        else if (d == 0) {
            double x = -b / (2 * a);
            return new QuadraticEquationResult(List.of(x));
        }
        else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            return new QuadraticEquationResult(List.of(x1, x2));
        }
    }
}
