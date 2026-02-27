package tn.esprit.arctic.championat.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.championat.Services.ICourseService;

@RestController
@AllArgsConstructor
public class CourseController {

    private ICourseService courseService;

}