package com.ib.striver191sheet.p00_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Program to generate Pascal's Triangle
 * Problem Statement: Write a program to generate Pascal's triangle.
 * In Pascal’s triangle, each number is the sum of the two numbers directly above it.
 * The first and last elements of each row are always 1.
 *
 */
public class S02_PascalTriangle {

        // Function to generate Pascal's Triangle up to numRows
        public List<List<Integer>> generate(int numRows) {
            // Result list to hold all rows
            List<List<Integer>> triangle = new ArrayList<>();

            // Loop for each row
            for (int i = 0; i < numRows; i++) {
                // Create a row with size (i+1)
                List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

                // Fill elements from index 1 to i-1 (middle values)
                for (int j = 1; j < i; j++) {
                    // Each element = sum of two elements above it
                    row.set(j, triangle.get(i - 1).get(j - 1) +
                            triangle.get(i - 1).get(j));
                }

                // Add current row to the triangle
                triangle.add(row);
            }
            return triangle;
        }

    public static void main(String[] args) {
        S02_PascalTriangle obj = new S02_PascalTriangle();
        int n = 5;

        // Generate and print Pascal's Triangle
        List<List<Integer>> result = obj.generate(n);
        for (List<Integer> row : result) {
            for (Integer val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}

