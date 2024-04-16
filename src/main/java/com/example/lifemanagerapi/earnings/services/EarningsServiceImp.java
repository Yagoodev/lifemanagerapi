package com.example.lifemanagerapi.earnings.services;

import com.example.lifemanagerapi.domains.EarningsDomain;
import com.example.lifemanagerapi.domains.UserDomain;
import com.example.lifemanagerapi.earnings.dto.IncomingSalaryDTO;
import com.example.lifemanagerapi.repositories.EarningsRepository;
import com.example.lifemanagerapi.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EarningsServiceImp implements EarningsService {

  @Autowired
  private EarningsRepository earningsRepository;

  @Autowired
  private UsersRepository usersRepository;

  @Override
  public void setUserSalary(IncomingSalaryDTO data) {

    Optional<UserDomain> user = this.usersRepository.findById(data.userId());

    if(user.isEmpty()) return;

    EarningsDomain incomeEntry = new EarningsDomain(data.type(), user.get(), data.value());

    this.earningsRepository.save(incomeEntry);
  }
}
