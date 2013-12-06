package com.vitaliy.onehundreddoors;

import java.util.LinkedList;
import java.util.List;

public class OneHundredDoors {

    private List<Boolean> doors;
    private int n = 1;

    public OneHundredDoors() {
        // Set initial values
        doors = new LinkedList<Boolean>();
        for (int i = 0; i < 100; i++) {
            doors.add(Boolean.FALSE);
        }
    }

    private void openClosePrint() {
        // Open and close doors
        while (n <= 100) {
            int k = n - 1;
            while (k < 100) {
                doors.set(k, (doors.get(k) == Boolean.TRUE ? Boolean.FALSE : Boolean.TRUE));
                k = k + n;
            }
            n += 1;
        }
        // Print result
        int i = 1;
        for (Boolean b : doors) {
            if (b == Boolean.TRUE) System.out.println("#" + i + " - open");
            i += 1;
        }
    }

    public static void main(String[] args) {
        new OneHundredDoors().openClosePrint();
    }
}
