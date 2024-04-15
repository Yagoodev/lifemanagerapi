package com.example.lifemanagerapi.earnings;

import com.example.lifemanagerapi.earnings.dto.RequestSalaryDTO;
import com.example.lifemanagerapi.earnings.services.EarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/earnings")
public class EarningsController {

  @Autowired
  private EarningsService earningsService;

  @PostMapping("/salary")
  public void setSalary(@RequestBody RequestSalaryDTO data) {
    this.earningsService.setSalary(data.value());
  }
}
