package com.example.lifemanagerapi.repositories;

import com.example.lifemanagerapi.domains.EarningsDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EarningsRepository extends JpaRepository<EarningsDomain, UUID> {

}
