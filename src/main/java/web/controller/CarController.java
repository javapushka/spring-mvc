package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", required = false) String count,
                          Model model) {
        List<Car> carList;
        if (count != null) {
            int limit = Integer.parseInt(count);

            carList = Arrays.stream(Car.createAndGetFiveCars())
                    .limit(limit)
                    .collect(Collectors.toList());

        } else {
            carList = Arrays.asList(Car.createAndGetFiveCars());
        }
        model.addAttribute("result", carList);
        return "cars";
    }

}
