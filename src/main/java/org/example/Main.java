package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }

    public static int convertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        for(int i = 0; i < binary.size();i++) {
            result+= (binary.get(binary.size() - 1 - i) * Math.pow(2, i));
        }
        return result;
    }
}