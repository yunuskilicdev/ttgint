# Project Description

## Problem

Reading input from text file line by line.

Print result sorted and repetition number.

## Approach

To solve this problem, treemap used.

### TreMap

[Definition](https://docs.oracle.com/javase/7/docs/api/java/util/TreeMap.html) 

A Red-Black tree based NavigableMap implementation. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations. Algorithms are adaptations of those in Cormen, Leiserson, and Rivest's Introduction to Algorithms.

### Example Input

t [the number of tests <= 5]

n [the number of accounts<= 100 000]

[list of accounts]

[empty line]

[next test cases]

```bash
2
6 
03 10103538 2222 1233 6160 0142
03 10103538 2222 1233 6160 0141
30 10103538 2222 1233 6160 0141
30 10103538 2222 1233 6160 0142
30 10103538 2222 1233 6160 0141
30 10103538 2222 1233 6160 0142

5 
30 10103538 2222 1233 6160 0144
30 10103538 2222 1233 6160 0142
30 10103538 2222 1233 6160 0145
30 10103538 2222 1233 6160 0146
30 10103538 2222 1233 6160 0143
```

### Result

[sorted list of accounts with the number of repeated accounts]

[empty line]

[other results]

```bash
03 10103538 2222 1233 6160 0141 1
03 10103538 2222 1233 6160 0142 1
30 10103538 2222 1233 6160 0141 2
30 10103538 2222 1233 6160 0142 2

30 10103538 2222 1233 6160 0142 1
30 10103538 2222 1233 6160 0143 1
30 10103538 2222 1233 6160 0144 1
30 10103538 2222 1233 6160 0145 1
30 10103538 2222 1233 6160 0146 1
```

Also output.JPG is the console output's screenshot.