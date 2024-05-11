## Problem

Controller class tightly-coupled to the MatchaViewEngine. What if we want to allow users to use their own view engine? Due to the tight-couple issue, it is not possible.

## Solution

As a solution, we can introduce an interface. But it leads to another problem. 
<br/>
Here is that problem, <br/>
When we extends the Controller class, we must define which view engine we will use as the last argument