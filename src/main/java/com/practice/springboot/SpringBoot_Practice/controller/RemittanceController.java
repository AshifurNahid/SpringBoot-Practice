package com.practice.springboot.SpringBoot_Practice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/apiservice/remittance")
public class RemittanceController {

    @GetMapping
    public ResponseEntity<Map<String, Object>> getRemittanceData(
            @RequestParam("bruserid") String brUserId,
            @RequestParam("brcode") String brCode,
            @RequestParam("exchcode") String exchCode,
            @RequestParam("pinno") String pinno) {

        Map<String, Object> response = new HashMap<>();

        // Simulate an error condition if pinno is "error"
        if ("error".equals(pinno)) {
            response.put("ErrorMessage", "Invalid PIN");
        } else {
            // Success response with dummy data
            response.put("ExchCode", exchCode);
            response.put("OrignCountryName", "TestCountry");
            response.put("Pinno", pinno);
            response.put("Reference", "REF001");
            response.put("TranDate", "2023-01-01");
            response.put("FxAmount", "1000");
            response.put("BenfFirstName", "John");
            response.put("RemitterName", "Jane");
            response.put("OriginalCurrency", "USD");
            response.put("OriginalAmount", "1000");
            response.put("PayoutStatusDetails", "Paid");
            response.put("TranNo", "TXN001");
            response.put("ErrorMessage", "");
        }

        return ResponseEntity.ok(response);
    }
}