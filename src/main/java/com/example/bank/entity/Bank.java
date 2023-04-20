package com.example.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
// @Table(name="bank")
public class Bank {

    //region Properties
    @Id
    private Integer id;

    private String bankName;

    private String bankBranchName;
    //endregion

    //region Constructors
    public Bank() {
    }


    public Bank(Integer id, String bankName, String bankBranchName) {
        this.id = id;
        this.bankName = bankName;
        this.bankBranchName = bankBranchName;
    }
//endregion

    //region Getter Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }
//endregion

    //region toString
    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", bankBranchName='" + bankBranchName + '\'' +
                '}';
    }
    //endregion
}
