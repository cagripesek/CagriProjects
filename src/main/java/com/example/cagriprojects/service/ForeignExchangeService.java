package com.example.cagriprojects.service;

import com.example.cagriprojects.dto.ConversionDTO;
import com.example.cagriprojects.model.ConversionTransaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;

public interface ForeignExchangeService {
    Double getExchangeRate(String sourceCurrency, String targetCurrency) throws Exception;

    ConversionDTO doConversion(Integer sourceAmount, String sourceCurrency, String targetCurrency) throws Exception;

    Page<ConversionTransaction> getConversionList(Long transactionId, Date transactionDate, Pageable pageable) throws Exception;
}
