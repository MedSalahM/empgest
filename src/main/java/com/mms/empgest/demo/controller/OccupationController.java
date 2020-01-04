package com.mms.empgest.demo.controller;

import com.mms.empgest.demo.service.OccupationDao;
import com.mms.empgest.demo.domain.Occupation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(OccupationController.BU)
public class OccupationController  {
  public OccupationDao occupationdao;

    public OccupationController(OccupationDao occupationdao) {
        this.occupationdao = occupationdao;
    }

    public static final String BU="/api/empgest";

    @GetMapping("/Occupation")
    public String Occupation(Model model){

        Occupation occupation = new Occupation();
        model.addAttribute("occupation",occupation);
        return "newoccupation.html";
    }

    @PostMapping("/Occupation")
    public String addOccupation(Model model , @ModelAttribute Occupation occupation){

        occupationdao.addOccupation(occupation);
        return "addoccupation.html";
    }



}
