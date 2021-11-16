package com.webservices;

import com.demo1.project.member;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class postexamplewebservices {
    @RequestMapping(value="/saveOneMember", method= RequestMethod.POST)
    public ResponseEntity<member> saveOneMember(@RequestBody member mb){
        System.out.println(mb);
        return  new ResponseEntity<member>(mb, HttpStatus.OK);
    }



//    @RestController
//    @RequestMapping(value = "/payment-reports")
//    @RequiredArgsConstructor
//    public class PaymentReportController {
//        private final PaymentReportService service;
//
//
//        @GetMapping
//        public PaymentReportResponse getReports(@Valid PaymentReportRequest request) {
//            return service.getReports(request);
//        }
//    }






















    @RequestMapping(value="/saveBulkMember", method= RequestMethod.POST)
    public ResponseEntity<List<member>> saveBulkMember(@RequestBody List<member> listmember){
        for(member m : listmember){
            System.out.println(m);
        }
        return new ResponseEntity<List<member>>(listmember, HttpStatus.OK);
    }
}
