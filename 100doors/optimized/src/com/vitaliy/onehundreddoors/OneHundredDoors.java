package com.vitaliy.onehundreddoors;

import java.util.LinkedList;
import java.util.List;

public class OneHundredDoors {
    private List<Boolean> doors = new LinkedList<Boolean>();

    public OneHundredDoors() {
        for (int i = 0; i < 100; i++) doors.add(i, Boolean.FALSE);
        openCloseWorks();
        prn();
    }

    private void openCloseWorks() {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0)
                    count++;
            }
            if (count % 2 != 0)
                doors.set(i - 1, Boolean.TRUE);
        }
    }

    private void prn() {
        int k = 1;
        for (Boolean d : doors) {
            if (d.equals(Boolean.TRUE)) System.out.println("door #" + k + " open");
            k += 1;
        }
    }


    public static void main(String[] args) {
        new OneHundredDoors();
    }
}
