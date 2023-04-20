package com.example.bank.controller;

import com.example.bank.entity.Bank;
import com.example.bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bank")
public class BankController {

    @Autowired
    BankService bankService;

    @GetMapping("getAllBanks") ////           localhost:8080/bank/getAllBanks
    public List<Bank> getAllBanks(){
        return bankService.getAllBanks();
    }

    @GetMapping("getBankById/{id}") ////       localhost:8080/bank/getBankById/1
    public Bank getAllBanks(@PathVariable("id") Integer id){
        return bankService.getBankById(id);
    }

    @PutMapping("updateBank")    ////               localhost:8080/bank/updateBank
    public Bank updatebank(@RequestBody Bank bank){

      return bankService.createBank(bank);

    }

    @PostMapping ("createBank")   ////               localhost:8080/bank/createBank
    public Bank createBank(@RequestBody Bank bank){
        return bankService.createBank(bank);
    }

    @DeleteMapping("deleteById/{id}")  /////            localhost:8080/bank/deleteById/1
    public void deleteBankById(@PathVariable("id") Integer id){
        bankService.deleteBankById(id);
    }
}
