package com.recursion;

public class Recursion {

    // Call Stack: Part of memory that tracks recursion calls

    /*
        Stack for factorial(5)
      ------------
        main()
      ------------
        fact(5)
        main()
      ------------
        fact(4)
        fact(5)
        main()
      ------------
        fact(3)
        fact(4)
        fact(5)
        main()
      ------------
        fact(2)
        fact(3)
        fact(4)
        fact(5)
        main()
      ------------
        fact(1)   ---> returns
        fact(2)
        fact(3)
        fact(4)
        fact(5)
        main()
      ------------
        fact(2)   ---> returns
        fact(3)
        fact(4)
        fact(5)
        main()
      ------------
        fact(3)   ---> returns
        fact(4)
        fact(5)
        main()
      ------------
        fact(4)   ---> returns
        fact(5)
        main()
      ------------
        fact(5)   ---> returns
        main()
      ------------
        main()
      ------------


     */
}
