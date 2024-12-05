package com.iEngg.Streams.Kafka.processor;

import com.iEngg.Streams.Kafka.schemas.EmploymentEnrichedDetail;
import com.iEngg.Streams.Kafka.schemas.LoanDetail;
import org.apache.kafka.streams.processor.AbstractProcessor;
import org.springframework.stereotype.Service;

@Service
public class EmploymentEnrichedProcessor extends AbstractProcessor<Long, LoanDetail> {

    @Override
    public void process(Long key, LoanDetail loanDetail) {
        EmploymentEnrichedDetail employmentEnrichedDetail = new EmploymentEnrichedDetail();
        employmentEnrichedDetail.setEmploymentType(loanDetail.getApplicantDetail().getEmploymentDetail().getEmploymentType());
        employmentEnrichedDetail.setInHandSalary(loanDetail.getApplicantDetail().getEmploymentDetail().getInHandSalary());
        employmentEnrichedDetail.setLocation(loanDetail.getApplicantDetail().getEmploymentDetail().getLocation());
        employmentEnrichedDetail.setNetSalary(loanDetail.getApplicantDetail().getEmploymentDetail().getNetSalary());
        employmentEnrichedDetail.setOrganizationName(loanDetail.getApplicantDetail().getEmploymentDetail().getOrganizationName());
        employmentEnrichedDetail.setPosition(loanDetail.getApplicantDetail().getEmploymentDetail().getPosition());
        employmentEnrichedDetail.setFirstName(loanDetail.getApplicantDetail().getFirstName());
        employmentEnrichedDetail.setMiddleName(loanDetail.getApplicantDetail().getMiddleName());
        employmentEnrichedDetail.setLastName(loanDetail.getApplicantDetail().getLastName());

        this.context().forward(loanDetail.getLoanId(), employmentEnrichedDetail);
        this.context().commit();
    }
}
