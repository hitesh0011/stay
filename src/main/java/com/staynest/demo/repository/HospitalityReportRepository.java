package com.staynest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staynest.demo.entities.HospitalityReport;
import com.staynest.demo.enums.ReportScope;

public interface HospitalityReportRepository extends JpaRepository<HospitalityReport, Integer> {

	List<HospitalityReport> findByScope(ReportScope scope);
}
