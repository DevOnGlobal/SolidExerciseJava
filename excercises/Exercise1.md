# Introduction

The refactoring exercise will be based around the StudentService and Student classes.

Although there might be a temptation to apply these principles in the order suggested by the acronym, don’t forget that it’s just an acronym and the order of the letters is not a natural order of the how the principles should be applied.
We will start this exercise with the last letter, the Dependency Inversion Principle:

1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
2. Abstractions should not depend upon details. Details should depend upon abstractions.

# Exercise 1
- Examine StudentService and try to identify where the class depends on low-level modules and/or details.
- Find a way to fix these dependencies.