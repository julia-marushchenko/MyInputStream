/**
 *  Java program to use IO with byte streams to figure out file size.
 */

package com.myinputoutput;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an InputStream.
        try {

            // Variable to store size of file.
            int sizeOfFile = 0;

            // Openning input stream.
            InputStream in = new FileInputStream("src/File.txt");

            while (in.read() != -1) {
                sizeOfFile++;
            }

            // Closing input stream.
            in.close();

            // Printing size of file to console.
            System.out.println("The size of file is: " + sizeOfFile + " bytes");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}