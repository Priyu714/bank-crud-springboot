package com.example.bank.service;

import antlr.collections.impl.LList;
import com.example.bank.dao.BankRepository;
import com.example.bank.entity.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;

    public Bank createBank(Bank bank){
        return bankRepository.save(bank);
    }

    public Bank getBankById(Integer id){
        return bankRepository.findById(id).get();
    }

    public List<Bank> getAllBanks(){
        return bankRepository.findAll();
    }

    public void deleteBankById(Integer id){
        bankRepository.deleteById(id);
    }

//    public Bank updateBankById(Bank bank){
//        return  bankRepository.save(bank);
//    }
}
