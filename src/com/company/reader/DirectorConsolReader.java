package com.company.reader;

import com.company.model.Director;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by garkaviy on 29.11.2016.
 */
public class DirectorConsolReader {
    private final PrintStream suggestionOut;
    private final Scanner scanner;

    public DirectorConsolReader() {
        suggestionOut = System.out;
        scanner =  new Scanner(System.in);
    }

    public Director read() {
        suggestionOut.println("Enter Name: ");
        Director director = new Director(scanner.nextLine());
        director.setName(scanner.nextLine());

        suggestionOut.println("Enter Phone: ");
        director.setPhone(scanner.nextLine());

        suggestionOut.println("Enter Email: ");
        director.setEmail(scanner.nextLine());

        return director;

    }

}
