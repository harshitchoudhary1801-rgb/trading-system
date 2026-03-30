package com.example.tradingsystem.controller;

import com.example.tradingsystem.model.Trade;
import com.example.tradingsystem.repository.TradeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TradeController {

    private final TradeRepository tradeRepository;

    public TradeController(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    @GetMapping("/trade")
    public String createTrade(@RequestParam String user, @RequestParam Double amount) {
        Trade trade = new Trade();
        trade.setUsername(user);
        trade.setAmount(amount);
        tradeRepository.save(trade);
        return "Trade saved successfully";
    }

    @GetMapping("/trades")
    public List<Trade> getTrades(@RequestParam String user) {
        return tradeRepository.findByUsername(user);
    }

    @GetMapping("/balance")
    public Double getBalance(@RequestParam String user) {
        return tradeRepository.findByUsername(user)
                .stream()
                .mapToDouble(Trade::getAmount)
                .sum();
    }
}