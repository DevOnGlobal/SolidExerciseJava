# Intoduction

This exercise will be focussed on the Open Closed Principle:
- Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

# Exercise 3
Another problem is that Package is a concept belonging to University. The Student should only care about the monthly allowance. Lets assume we need another method called AddBonusAllowance (in Student.cs) that increases the allowance based on the Package purchased by the university. Just like the constructor, this method would also have to check the current Package in order to increase the allowance accordingly:

(Add this code to your Student class)

public void addBonusAllowance(Package package)
{
    if (package == Package.Standard)
    {
        this.MonthlyEbookAllowance += 5;
    }
    else if (package == Package.Premium)
    {
        this.MonthlyEbookAllowance += 10;
    }
}

- Examine Student (make sure it's up to date with the answer to exercise 2) and try to identify reasons this code might need (a lot of) modification due to external changes.
- Find a way to fix this.