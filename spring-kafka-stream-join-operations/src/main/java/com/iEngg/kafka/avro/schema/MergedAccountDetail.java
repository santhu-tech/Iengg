/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.iEngg.kafka.avro.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MergedAccountDetail extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2351263777716060731L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MergedAccountDetail\",\"namespace\":\"com.iEngg.kafka.avro.schema\",\"fields\":[{\"name\":\"customerUniqueIdentification\",\"type\":\"long\",\"default\":-1},{\"name\":\"newAccountNumber\",\"type\":\"int\",\"default\":-1},{\"name\":\"currentBalance\",\"type\":\"double\",\"default\":0.0},{\"name\":\"accountHolderName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"newBankName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"newBranchCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"newMicrCode\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MergedAccountDetail> ENCODER =
      new BinaryMessageEncoder<MergedAccountDetail>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MergedAccountDetail> DECODER =
      new BinaryMessageDecoder<MergedAccountDetail>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MergedAccountDetail> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MergedAccountDetail> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MergedAccountDetail>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MergedAccountDetail to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MergedAccountDetail from a ByteBuffer. */
  public static MergedAccountDetail fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long customerUniqueIdentification;
  @Deprecated public int newAccountNumber;
  @Deprecated public double currentBalance;
  @Deprecated public java.lang.CharSequence accountHolderName;
  @Deprecated public java.lang.CharSequence newBankName;
  @Deprecated public java.lang.CharSequence address;
  @Deprecated public java.lang.CharSequence newBranchCode;
  @Deprecated public java.lang.CharSequence newMicrCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MergedAccountDetail() {}

  /**
   * All-args constructor.
   * @param customerUniqueIdentification The new value for customerUniqueIdentification
   * @param newAccountNumber The new value for newAccountNumber
   * @param currentBalance The new value for currentBalance
   * @param accountHolderName The new value for accountHolderName
   * @param newBankName The new value for newBankName
   * @param address The new value for address
   * @param newBranchCode The new value for newBranchCode
   * @param newMicrCode The new value for newMicrCode
   */
  public MergedAccountDetail(java.lang.Long customerUniqueIdentification, java.lang.Integer newAccountNumber, java.lang.Double currentBalance, java.lang.CharSequence accountHolderName, java.lang.CharSequence newBankName, java.lang.CharSequence address, java.lang.CharSequence newBranchCode, java.lang.CharSequence newMicrCode) {
    this.customerUniqueIdentification = customerUniqueIdentification;
    this.newAccountNumber = newAccountNumber;
    this.currentBalance = currentBalance;
    this.accountHolderName = accountHolderName;
    this.newBankName = newBankName;
    this.address = address;
    this.newBranchCode = newBranchCode;
    this.newMicrCode = newMicrCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customerUniqueIdentification;
    case 1: return newAccountNumber;
    case 2: return currentBalance;
    case 3: return accountHolderName;
    case 4: return newBankName;
    case 5: return address;
    case 6: return newBranchCode;
    case 7: return newMicrCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customerUniqueIdentification = (java.lang.Long)value$; break;
    case 1: newAccountNumber = (java.lang.Integer)value$; break;
    case 2: currentBalance = (java.lang.Double)value$; break;
    case 3: accountHolderName = (java.lang.CharSequence)value$; break;
    case 4: newBankName = (java.lang.CharSequence)value$; break;
    case 5: address = (java.lang.CharSequence)value$; break;
    case 6: newBranchCode = (java.lang.CharSequence)value$; break;
    case 7: newMicrCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'customerUniqueIdentification' field.
   * @return The value of the 'customerUniqueIdentification' field.
   */
  public java.lang.Long getCustomerUniqueIdentification() {
    return customerUniqueIdentification;
  }

  /**
   * Sets the value of the 'customerUniqueIdentification' field.
   * @param value the value to set.
   */
  public void setCustomerUniqueIdentification(java.lang.Long value) {
    this.customerUniqueIdentification = value;
  }

  /**
   * Gets the value of the 'newAccountNumber' field.
   * @return The value of the 'newAccountNumber' field.
   */
  public java.lang.Integer getNewAccountNumber() {
    return newAccountNumber;
  }

  /**
   * Sets the value of the 'newAccountNumber' field.
   * @param value the value to set.
   */
  public void setNewAccountNumber(java.lang.Integer value) {
    this.newAccountNumber = value;
  }

  /**
   * Gets the value of the 'currentBalance' field.
   * @return The value of the 'currentBalance' field.
   */
  public java.lang.Double getCurrentBalance() {
    return currentBalance;
  }

  /**
   * Sets the value of the 'currentBalance' field.
   * @param value the value to set.
   */
  public void setCurrentBalance(java.lang.Double value) {
    this.currentBalance = value;
  }

  /**
   * Gets the value of the 'accountHolderName' field.
   * @return The value of the 'accountHolderName' field.
   */
  public java.lang.CharSequence getAccountHolderName() {
    return accountHolderName;
  }

  /**
   * Sets the value of the 'accountHolderName' field.
   * @param value the value to set.
   */
  public void setAccountHolderName(java.lang.CharSequence value) {
    this.accountHolderName = value;
  }

  /**
   * Gets the value of the 'newBankName' field.
   * @return The value of the 'newBankName' field.
   */
  public java.lang.CharSequence getNewBankName() {
    return newBankName;
  }

  /**
   * Sets the value of the 'newBankName' field.
   * @param value the value to set.
   */
  public void setNewBankName(java.lang.CharSequence value) {
    this.newBankName = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'newBranchCode' field.
   * @return The value of the 'newBranchCode' field.
   */
  public java.lang.CharSequence getNewBranchCode() {
    return newBranchCode;
  }

  /**
   * Sets the value of the 'newBranchCode' field.
   * @param value the value to set.
   */
  public void setNewBranchCode(java.lang.CharSequence value) {
    this.newBranchCode = value;
  }

  /**
   * Gets the value of the 'newMicrCode' field.
   * @return The value of the 'newMicrCode' field.
   */
  public java.lang.CharSequence getNewMicrCode() {
    return newMicrCode;
  }

  /**
   * Sets the value of the 'newMicrCode' field.
   * @param value the value to set.
   */
  public void setNewMicrCode(java.lang.CharSequence value) {
    this.newMicrCode = value;
  }

  /**
   * Creates a new MergedAccountDetail RecordBuilder.
   * @return A new MergedAccountDetail RecordBuilder
   */
  public static com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder newBuilder() {
    return new com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder();
  }

  /**
   * Creates a new MergedAccountDetail RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MergedAccountDetail RecordBuilder
   */
  public static com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder newBuilder(com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder other) {
    return new com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder(other);
  }

  /**
   * Creates a new MergedAccountDetail RecordBuilder by copying an existing MergedAccountDetail instance.
   * @param other The existing instance to copy.
   * @return A new MergedAccountDetail RecordBuilder
   */
  public static com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder newBuilder(com.iEngg.kafka.avro.schema.MergedAccountDetail other) {
    return new com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder(other);
  }

  /**
   * RecordBuilder for MergedAccountDetail instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MergedAccountDetail>
    implements org.apache.avro.data.RecordBuilder<MergedAccountDetail> {

    private long customerUniqueIdentification;
    private int newAccountNumber;
    private double currentBalance;
    private java.lang.CharSequence accountHolderName;
    private java.lang.CharSequence newBankName;
    private java.lang.CharSequence address;
    private java.lang.CharSequence newBranchCode;
    private java.lang.CharSequence newMicrCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customerUniqueIdentification)) {
        this.customerUniqueIdentification = data().deepCopy(fields()[0].schema(), other.customerUniqueIdentification);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.newAccountNumber)) {
        this.newAccountNumber = data().deepCopy(fields()[1].schema(), other.newAccountNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.currentBalance)) {
        this.currentBalance = data().deepCopy(fields()[2].schema(), other.currentBalance);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accountHolderName)) {
        this.accountHolderName = data().deepCopy(fields()[3].schema(), other.accountHolderName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.newBankName)) {
        this.newBankName = data().deepCopy(fields()[4].schema(), other.newBankName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.address)) {
        this.address = data().deepCopy(fields()[5].schema(), other.address);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.newBranchCode)) {
        this.newBranchCode = data().deepCopy(fields()[6].schema(), other.newBranchCode);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.newMicrCode)) {
        this.newMicrCode = data().deepCopy(fields()[7].schema(), other.newMicrCode);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MergedAccountDetail instance
     * @param other The existing instance to copy.
     */
    private Builder(com.iEngg.kafka.avro.schema.MergedAccountDetail other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.customerUniqueIdentification)) {
        this.customerUniqueIdentification = data().deepCopy(fields()[0].schema(), other.customerUniqueIdentification);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.newAccountNumber)) {
        this.newAccountNumber = data().deepCopy(fields()[1].schema(), other.newAccountNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.currentBalance)) {
        this.currentBalance = data().deepCopy(fields()[2].schema(), other.currentBalance);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accountHolderName)) {
        this.accountHolderName = data().deepCopy(fields()[3].schema(), other.accountHolderName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.newBankName)) {
        this.newBankName = data().deepCopy(fields()[4].schema(), other.newBankName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.address)) {
        this.address = data().deepCopy(fields()[5].schema(), other.address);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.newBranchCode)) {
        this.newBranchCode = data().deepCopy(fields()[6].schema(), other.newBranchCode);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.newMicrCode)) {
        this.newMicrCode = data().deepCopy(fields()[7].schema(), other.newMicrCode);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'customerUniqueIdentification' field.
      * @return The value.
      */
    public java.lang.Long getCustomerUniqueIdentification() {
      return customerUniqueIdentification;
    }

    /**
      * Sets the value of the 'customerUniqueIdentification' field.
      * @param value The value of 'customerUniqueIdentification'.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder setCustomerUniqueIdentification(long value) {
      validate(fields()[0], value);
      this.customerUniqueIdentification = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customerUniqueIdentification' field has been set.
      * @return True if the 'customerUniqueIdentification' field has been set, false otherwise.
      */
    public boolean hasCustomerUniqueIdentification() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customerUniqueIdentification' field.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder clearCustomerUniqueIdentification() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'newAccountNumber' field.
      * @return The value.
      */
    public java.lang.Integer getNewAccountNumber() {
      return newAccountNumber;
    }

    /**
      * Sets the value of the 'newAccountNumber' field.
      * @param value The value of 'newAccountNumber'.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder setNewAccountNumber(int value) {
      validate(fields()[1], value);
      this.newAccountNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'newAccountNumber' field has been set.
      * @return True if the 'newAccountNumber' field has been set, false otherwise.
      */
    public boolean hasNewAccountNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'newAccountNumber' field.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder clearNewAccountNumber() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'currentBalance' field.
      * @return The value.
      */
    public java.lang.Double getCurrentBalance() {
      return currentBalance;
    }

    /**
      * Sets the value of the 'currentBalance' field.
      * @param value The value of 'currentBalance'.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder setCurrentBalance(double value) {
      validate(fields()[2], value);
      this.currentBalance = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'currentBalance' field has been set.
      * @return True if the 'currentBalance' field has been set, false otherwise.
      */
    public boolean hasCurrentBalance() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'currentBalance' field.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder clearCurrentBalance() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'accountHolderName' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountHolderName() {
      return accountHolderName;
    }

    /**
      * Sets the value of the 'accountHolderName' field.
      * @param value The value of 'accountHolderName'.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder setAccountHolderName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.accountHolderName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'accountHolderName' field has been set.
      * @return True if the 'accountHolderName' field has been set, false otherwise.
      */
    public boolean hasAccountHolderName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'accountHolderName' field.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder clearAccountHolderName() {
      accountHolderName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'newBankName' field.
      * @return The value.
      */
    public java.lang.CharSequence getNewBankName() {
      return newBankName;
    }

    /**
      * Sets the value of the 'newBankName' field.
      * @param value The value of 'newBankName'.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder setNewBankName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.newBankName = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'newBankName' field has been set.
      * @return True if the 'newBankName' field has been set, false otherwise.
      */
    public boolean hasNewBankName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'newBankName' field.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder clearNewBankName() {
      newBankName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.address = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder clearAddress() {
      address = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'newBranchCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getNewBranchCode() {
      return newBranchCode;
    }

    /**
      * Sets the value of the 'newBranchCode' field.
      * @param value The value of 'newBranchCode'.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder setNewBranchCode(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.newBranchCode = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'newBranchCode' field has been set.
      * @return True if the 'newBranchCode' field has been set, false otherwise.
      */
    public boolean hasNewBranchCode() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'newBranchCode' field.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder clearNewBranchCode() {
      newBranchCode = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'newMicrCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getNewMicrCode() {
      return newMicrCode;
    }

    /**
      * Sets the value of the 'newMicrCode' field.
      * @param value The value of 'newMicrCode'.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder setNewMicrCode(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.newMicrCode = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'newMicrCode' field has been set.
      * @return True if the 'newMicrCode' field has been set, false otherwise.
      */
    public boolean hasNewMicrCode() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'newMicrCode' field.
      * @return This builder.
      */
    public com.iEngg.kafka.avro.schema.MergedAccountDetail.Builder clearNewMicrCode() {
      newMicrCode = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MergedAccountDetail build() {
      try {
        MergedAccountDetail record = new MergedAccountDetail();
        record.customerUniqueIdentification = fieldSetFlags()[0] ? this.customerUniqueIdentification : (java.lang.Long) defaultValue(fields()[0]);
        record.newAccountNumber = fieldSetFlags()[1] ? this.newAccountNumber : (java.lang.Integer) defaultValue(fields()[1]);
        record.currentBalance = fieldSetFlags()[2] ? this.currentBalance : (java.lang.Double) defaultValue(fields()[2]);
        record.accountHolderName = fieldSetFlags()[3] ? this.accountHolderName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.newBankName = fieldSetFlags()[4] ? this.newBankName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.address = fieldSetFlags()[5] ? this.address : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.newBranchCode = fieldSetFlags()[6] ? this.newBranchCode : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.newMicrCode = fieldSetFlags()[7] ? this.newMicrCode : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MergedAccountDetail>
    WRITER$ = (org.apache.avro.io.DatumWriter<MergedAccountDetail>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MergedAccountDetail>
    READER$ = (org.apache.avro.io.DatumReader<MergedAccountDetail>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
