package com.au.expense.tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("expenses")
public class ExpenseTrackerController {

    @GetMapping("getAllExpenses")
    public String getAllExpenses(){
        return "Expenses are loading please wait";
    }
}
