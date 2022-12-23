package com.app.milestone.domain;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
@Data
public class WithdrawalResp {
    private Long total;
    private Page<WithdrawalDTO> arWithdrawalDTO;
}
