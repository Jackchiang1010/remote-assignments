package com.example.assignments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Assignment2 {
    //Assignment2

    //http://localhost:3000/data
    //http://localhost:3000/data?number=xyz
    //http://localhost:3000/data?number=5
    //http://localhost:3000/data?number=100000000

    //When number is vary large ,web site will no change.
    //I think sum is out of datatype's range.
    //because I tried change sum's datatype to long , it is work.

    @RequestMapping(value ="/data")
    @ResponseBody
    public String sum(@RequestParam(value = "number", required = false) String strNumber) {
        int sum = 0;

        if( strNumber == null  ) {

            return "Lack of Parameter";

        }

        try {
            int intNumber = Integer.parseInt(strNumber);
            System.out.println(intNumber);
            System.out.println(strNumber);

            if( intNumber > 0 ) {
                for (int i = 0; i <= intNumber; i++) {
                    sum += i;
                }

                System.out.printf("sum = %s", sum);
                return String.valueOf(sum);

            } else if( intNumber < 0 ) {
                for (int i = intNumber; i <= 0; i++) {
                    sum += i;
                }

                System.out.printf("sum = %s", sum);
                return String.valueOf(sum);

            } else {

                return "Lack of Parameter";

            }

        } catch(Exception e) {

            System.out.println(e.getMessage());
            return "Wrong Parameter";

        }
    }
}
