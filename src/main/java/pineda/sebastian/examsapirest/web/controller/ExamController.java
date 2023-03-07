package pineda.sebastian.examsapirest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pineda.sebastian.examsapirest.domain.dto.ExamDTO;
import pineda.sebastian.examsapirest.domain.service.ExamService;

@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    ExamService examService;

    @PostMapping("/create")
    public ResponseEntity<Object> createExam(@RequestBody ExamDTO examDTO) {
        return new ResponseEntity<>(examService.createExam(examDTO), HttpStatus.OK);
    }
}
