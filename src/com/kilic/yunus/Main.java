package com.kilic.yunus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final int DEFAULTVALUE = 0;

    public static void main(String[] args) {
        List<String> lines = readFile();
        List<Map<String, Integer>> sortResultMap = sortInputSets(lines);
        printResult(sortResultMap);
    }

    private static void printResult(List<Map<String, Integer>> sortResultMap) {
        for (int i = 0; i < sortResultMap.size(); i++) {
            Map<String, Integer> stringIntegerMap = sortResultMap.get(i);
            Set<Map.Entry<String, Integer>> entries = stringIntegerMap.entrySet();
            entries.forEach(x -> {
                System.out.print(x.getKey());
                System.out.print(" ");
                System.out.print(x.getValue());
                System.out.print("\n");
            });
            if (i != sortResultMap.size() - 1) {
                System.out.print("\n");
            }
        }
    }

    private static List<Map<String, Integer>> sortInputSets(List<String> lines) {
        String firstLine = lines.remove(0).trim();
        int testSetCount = Integer.parseInt(firstLine);
        List<Map<String, Integer>> sortResultMap = new ArrayList<>();
        for (int i = 0; i < testSetCount; i++) {
            Map<String, Integer> testSetMap = new TreeMap<>();
            int inputSize = Integer.parseInt(lines.remove(0).trim());
            for (int j = 0; j < inputSize; j++) {
                String key = lines.remove(0);
                Integer currentValue = testSetMap.getOrDefault(key, DEFAULTVALUE);
                testSetMap.put(key, currentValue + 1);
            }
            if (!lines.isEmpty() && lines.get(0).equals("")) {
                lines.remove(0);
            }
            sortResultMap.add(testSetMap);
        }
        return sortResultMap;
    }

    private static List<String> readFile() {
        String fileName = "sample.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            return stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
