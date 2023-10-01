package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QuadraticEquation extends Remote {
    QuadraticEquationResult solve(double a, double b, double c) throws RemoteException;
}
