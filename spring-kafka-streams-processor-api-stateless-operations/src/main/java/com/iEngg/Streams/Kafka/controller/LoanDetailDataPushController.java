package com.iEngg.Streams.Kafka.controller;

import com.iEngg.Streams.Kafka.pojo.LoanDetailPojo;
import com.iEngg.Streams.Kafka.schemas.ApplicantDetail;
import com.iEngg.Streams.Kafka.schemas.CollateralDetail;
import com.iEngg.Streams.Kafka.schemas.EmploymentDetail;
import com.iEngg.Streams.Kafka.schemas.LoanDetail;
import com.iEngg.Streams.Kafka.producer.LoanDetailKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanDetailDataPushController {

    @Autowired
    LoanDetailKafkaProducer producer;

    @PostMapping(value = "/push")
    public String push(@RequestBody LoanDetailPojo loanDetailPojo) {
        LoanDetail loanDetail = new LoanDetail();
        loanDetail.setLoanId(loanDetailPojo.getLoanId());
        loanDetail.setBranch(loanDetailPojo.getBranch());
        loanDetail.setBranchAddress(loanDetailPojo.getBranchAddress());
        loanDetail.setApprovedLoanAmount(loanDetailPojo.getApprovedLoanAmount());
        loanDetail.setLoanApprovalDate(loanDetailPojo.getLoanApprovalDate());
        loanDetail.setLoanAccountNum(loanDetailPojo.getLoanAccountNum());
        loanDetail.setBankName(loanDetailPojo.getBankName());
        loanDetail.setMicrCode(loanDetailPojo.getMicrCode());
        loanDetail.setRequestedLoanAmount(loanDetailPojo.getRequestedLoanAmount());
        CollateralDetail collateralDetail = new CollateralDetail(loanDetailPojo.getCollateralDetail().getCollateralDesc(), loanDetailPojo.getCollateralDetail().getCollateralId(), loanDetailPojo.getCollateralDetail().getCollateralType(), loanDetailPojo.getCollateralDetail().getCollateralValue());
        EmploymentDetail employmentDetail = new EmploymentDetail(loanDetailPojo.getApplicantDetail().getEmploymentDetail().getAddress(), loanDetailPojo.getApplicantDetail().getEmploymentDetail().getEmploymentType(), loanDetailPojo.getApplicantDetail().getEmploymentDetail().getInHandSalary(), loanDetailPojo.getApplicantDetail().getEmploymentDetail().getLocation(), loanDetailPojo.getApplicantDetail().getEmploymentDetail().getNetSalary(), loanDetailPojo.getApplicantDetail().getEmploymentDetail().getOrganizationName(), loanDetailPojo.getApplicantDetail().getEmploymentDetail().getPosition());
        ApplicantDetail applicantDetail = new ApplicantDetail(loanDetailPojo.getApplicantDetail().getAge(), loanDetailPojo.getApplicantDetail().getCurrentAddress(), loanDetailPojo.getApplicantDetail().getDateOfBirth(), employmentDetail, loanDetailPojo.getApplicantDetail().getFirstName(), loanDetailPojo.getApplicantDetail().getLastName(), loanDetailPojo.getApplicantDetail().getMiddleName(), loanDetailPojo.getApplicantDetail().getPermanentAddress());
        loanDetail.setApplicantDetail(applicantDetail);
        loanDetail.setCollateralDetail(collateralDetail);
        producer.send(loanDetail);

        return "Success";
    }

}
