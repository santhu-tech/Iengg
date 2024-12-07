package com.iEngg.kafka.joiner;

import com.iEngg.kafka.avro.schema.MergedAccountDetail;
import com.iEngg.kafka.util.BankUtils;
import lombok.Getter;
import org.apache.kafka.streams.kstream.ValueJoiner;

@Getter
public class AccountValueJoiner implements ValueJoiner<AccountDetail,AccountDetail, MergedAccountDetail> {

    @Override
    public MergedAccountDetail apply(AccountDetail xyzAccount, AccountDetail abcAccount) {
        return MergedAccountDetail.newBuilder().
                setAccountHolderName(abcAccount.getAccountHolderName()).
                setAddress(abcAccount.getAddress()).
                setCurrentBalance(abcAccount.getCurrentBalance() + xyzAccount.getCurrentBalance()).
                setCustomerUniqueIdentification(abcAccount.getCustomerUniqueIdentification()).
                setNewAccountNumber(BankUtils.generateBankAccountNumber()).
                setNewBankName("ABC-XYZ Bank Pvt Ltd").
                setNewBranchCode(BankUtils.generateBranchCode()).
                setNewMicrCode(BankUtils.generateMicrCode()).
                build();
    }
}
