package org.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    private Client() {}

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(null);
            QuadraticEquation stub = (QuadraticEquation) registry.lookup("QuadraticEquation");

            Scanner in = new Scanner(System.in);
            System.out.println("Enter a:");
            double a = in.nextDouble();
            System.out.println("Enter b:");
            double b = in.nextDouble();
            System.out.println("Enter c:");
            double c = in.nextDouble();

            QuadraticEquationResult result = stub.solve(a, b, c);
            System.out.println("Result:");
            for (double root : result.getResult()) {
                System.out.println(root);
            }
        }
        catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}