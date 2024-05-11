## Problem

Controller class tightly-coupled to the MatchaViewEngine. What if we want to allow users to use their own view engine? Due to the tight-couple issue, it is not possible.

## Solution

Factory method pattern rely on inheritance & polymorphism