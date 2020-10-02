# Levenshtein Distance
Levenshtein distance between two strings is defined as the minimum number of characters needed to insert, delete or replace in a given string string1 to transform it to another string string2.

Write a function that takes in two strings and returns the minimum number of edit operations that need to be performed
to transform first string to second string.

### Sample input
```
str1 = "abc"
str2 = "yabd"
```

### Sample output
```
2 // insert "y" & replace "c" by "d"
```