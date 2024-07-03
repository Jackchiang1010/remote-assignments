package com.example.assignments;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    //Assignment1

    //http://localhost:3000/

    @RequestMapping("/")
    public String test() {
        System.out.println("Hi!");
        return "Hello, My Server!";
    }

    //Assignment2

    //http://localhost:3000/data
    //http://localhost:3000/data?number=5.5
    //http://localhost:3000/data?number=5
    //http://localhost:3000/data?number=100000000

    //When number is vary large ,web site will no change.
    //I think sum is out of datatype's range.
    //because I tried change sum's datatype to long , it is work.

    @RequestMapping(value ="/data", method = RequestMethod.GET)
    public String sum(@RequestParam(required = false) Float number) {
        int sum = 0;

        if( number == null ) {

            return "Lack of Parameter";

        } else if( number - Math.floor(number) > 0 ) {

            return "Wrong Parameter";

        } else {

            for (int i = 0; i <= number; i++) {
                sum += i;
            }

            System.out.printf("sum = %s", sum);
            return String.valueOf(sum);

        }
    }


}
