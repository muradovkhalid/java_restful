package com.webservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.ArrayList;

import com.demo1.project.member;
@RestController
public class getexamplewebservices {
@RequestMapping(value="/memberlist", method= RequestMethod.GET)
public List<member> getMemberList(){

    List<member> memberlist = new ArrayList<>();
    member mb = new member();
    mb.setName("xalid");
    mb.setSurname("muradov");
    mb.setCity("quba");
    memberlist.add(mb);

    mb = new member();
    mb.setName("kerim");
    mb.setSurname("memmedzade");
    mb.setCity("sumqayit");
    memberlist.add(mb);

    mb = new member();
    mb.setName("necmeddin");
    mb.setSurname("eliyev");
    mb.setCity("lacin");
    memberlist.add(mb);

//    for (member m : memberlist){
//        if(mbName.equals(m.getName()))
//            returnedmember=m;
//    }
    return  memberlist;
}

}
