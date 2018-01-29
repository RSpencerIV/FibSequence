package com.example.fib;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.Arrays;
@RestController
public class mainController {

    @RequestMapping(value = "/goalnumber" , method = RequestMethod.GET)
    public String showIndex(
        @RequestParam("goalnumber") int number) {
        int i = 2;
        int sumNumbers = 0;
        ArrayList<Integer> fibSequence = new ArrayList();
        fibSequence.add(0);
        fibSequence.add(1);

        while (fibSequence.get(i-1) < number) {
            fibSequence.add(fibSequence.get(i-2) + fibSequence.get(i-1));
            i++;
        }
        for (int n = 0; n < 4; n++) {
            sumNumbers = sumNumbers + fibSequence.get((i-1)-n);
        }
        return (Arrays.toString(fibSequence.toArray()) + "<br/>" + sumNumbers);
    }

}
