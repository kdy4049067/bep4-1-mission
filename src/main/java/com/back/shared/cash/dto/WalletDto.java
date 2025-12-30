package com.back.shared.cash.dto;

import com.back.boundedContext.cash.domain.Wallet;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class WalletDto {
    private int id;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private int holderId;
    private String holderName;
    private long balance;

}
