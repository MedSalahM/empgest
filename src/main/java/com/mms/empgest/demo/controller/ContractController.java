package com.mms.empgest.demo.controller;

import com.mms.empgest.demo.domain.Contract;
import com.mms.empgest.demo.service.ContractDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(ContractController.BU)
public class ContractController {
    public ContractDao contractDao;

    public ContractController(ContractDao contractDao) {
        this.contractDao = contractDao;
    }

    public static final String BU="/api/empgest";

    @GetMapping("/Contract")
    public String Contract(Model model)
    {
        Contract contract = new Contract();
        model.addAttribute("contract",contract);
        return "newcontract.html";

    }

    @GetMapping("/Contract/new")
    public String ContractNewPage(Model model)
    {

        return "findemployee.html";

    }





    @GetMapping("/Contracts")
    public String Contracts(Model model)
    {
        List<Contract> contracts = new ArrayList<>();
        contracts=contractDao.getContracts();
        model.addAttribute("contracts",contracts);
        return "contracts.html";

    }

    @GetMapping("/Contract/{id}")
    public String ContractId(Model model ,@PathVariable int id)
    {
        Contract c;
        c=contractDao.getContractId(id);
        model.addAttribute("contracts",c);
        return "contract.html";

    }

    @PostMapping("/Contract")
    public String addContract(@ModelAttribute Contract contract){

        contractDao.addContract(contract);

        return "addcontract.html";
    }

    @GetMapping("/Contract/E/{empid}")
    public String ContractByEmpId(Model model, @PathVariable int empid)
    {
        List<Contract> contract ;
        contract=contractDao.ContractByEmpId(empid);
        model.addAttribute("contracts",contract);
        return "contractbyemployee.html";

    }
}
