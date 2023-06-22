package com.api.sportyShoes.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sportyShoes.model.PurchaseReport;

public interface PurchaseReportRepository extends JpaRepository<PurchaseReport, Integer>{
	public List<PurchaseReport> findByDop(Date dop);
	public List<PurchaseReport> findByCategory(String category);

}
