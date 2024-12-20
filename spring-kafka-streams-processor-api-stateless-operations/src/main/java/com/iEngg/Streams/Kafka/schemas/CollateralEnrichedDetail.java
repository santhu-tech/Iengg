/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.iEngg.Streams.Kafka.schemas;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CollateralEnrichedDetail extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7523401192943492827L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CollateralEnrichedDetail\",\"namespace\":\"com.vishaluplanch.org.schemas\",\"fields\":[{\"name\":\"collateralDesc\",\"type\":\"string\"},{\"name\":\"collateralId\",\"type\":\"long\"},{\"name\":\"collateralType\",\"type\":\"string\"},{\"name\":\"collateralValue\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"middleName\",\"type\":\"string\"},{\"name\":\"approvedLoanAmount\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"loanId\",\"type\":\"long\"},{\"name\":\"loanAccountNum\",\"type\":\"long\"},{\"name\":\"loanApprovalDate\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CollateralEnrichedDetail> ENCODER =
      new BinaryMessageEncoder<CollateralEnrichedDetail>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CollateralEnrichedDetail> DECODER =
      new BinaryMessageDecoder<CollateralEnrichedDetail>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<CollateralEnrichedDetail> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<CollateralEnrichedDetail> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CollateralEnrichedDetail>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this CollateralEnrichedDetail to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a CollateralEnrichedDetail from a ByteBuffer. */
  public static CollateralEnrichedDetail fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence collateralDesc;
  @Deprecated public long collateralId;
  @Deprecated public java.lang.CharSequence collateralType;
  @Deprecated public java.math.BigDecimal collateralValue;
  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence lastName;
  @Deprecated public java.lang.CharSequence middleName;
  @Deprecated public java.math.BigDecimal approvedLoanAmount;
  @Deprecated public long loanId;
  @Deprecated public long loanAccountNum;
  @Deprecated public java.lang.CharSequence loanApprovalDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CollateralEnrichedDetail() {}

  /**
   * All-args constructor.
   * @param collateralDesc The new value for collateralDesc
   * @param collateralId The new value for collateralId
   * @param collateralType The new value for collateralType
   * @param collateralValue The new value for collateralValue
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   * @param middleName The new value for middleName
   * @param approvedLoanAmount The new value for approvedLoanAmount
   * @param loanId The new value for loanId
   * @param loanAccountNum The new value for loanAccountNum
   * @param loanApprovalDate The new value for loanApprovalDate
   */
  public CollateralEnrichedDetail(java.lang.CharSequence collateralDesc, java.lang.Long collateralId, java.lang.CharSequence collateralType, java.math.BigDecimal collateralValue, java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.CharSequence middleName, java.math.BigDecimal approvedLoanAmount, java.lang.Long loanId, java.lang.Long loanAccountNum, java.lang.CharSequence loanApprovalDate) {
    this.collateralDesc = collateralDesc;
    this.collateralId = collateralId;
    this.collateralType = collateralType;
    this.collateralValue = collateralValue;
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.approvedLoanAmount = approvedLoanAmount;
    this.loanId = loanId;
    this.loanAccountNum = loanAccountNum;
    this.loanApprovalDate = loanApprovalDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return collateralDesc;
    case 1: return collateralId;
    case 2: return collateralType;
    case 3: return collateralValue;
    case 4: return firstName;
    case 5: return lastName;
    case 6: return middleName;
    case 7: return approvedLoanAmount;
    case 8: return loanId;
    case 9: return loanAccountNum;
    case 10: return loanApprovalDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: collateralDesc = (java.lang.CharSequence)value$; break;
    case 1: collateralId = (java.lang.Long)value$; break;
    case 2: collateralType = (java.lang.CharSequence)value$; break;
    case 3: collateralValue = (java.math.BigDecimal)value$; break;
    case 4: firstName = (java.lang.CharSequence)value$; break;
    case 5: lastName = (java.lang.CharSequence)value$; break;
    case 6: middleName = (java.lang.CharSequence)value$; break;
    case 7: approvedLoanAmount = (java.math.BigDecimal)value$; break;
    case 8: loanId = (java.lang.Long)value$; break;
    case 9: loanAccountNum = (java.lang.Long)value$; break;
    case 10: loanApprovalDate = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'collateralDesc' field.
   * @return The value of the 'collateralDesc' field.
   */
  public java.lang.CharSequence getCollateralDesc() {
    return collateralDesc;
  }

  /**
   * Sets the value of the 'collateralDesc' field.
   * @param value the value to set.
   */
  public void setCollateralDesc(java.lang.CharSequence value) {
    this.collateralDesc = value;
  }

  /**
   * Gets the value of the 'collateralId' field.
   * @return The value of the 'collateralId' field.
   */
  public java.lang.Long getCollateralId() {
    return collateralId;
  }

  /**
   * Sets the value of the 'collateralId' field.
   * @param value the value to set.
   */
  public void setCollateralId(java.lang.Long value) {
    this.collateralId = value;
  }

  /**
   * Gets the value of the 'collateralType' field.
   * @return The value of the 'collateralType' field.
   */
  public java.lang.CharSequence getCollateralType() {
    return collateralType;
  }

  /**
   * Sets the value of the 'collateralType' field.
   * @param value the value to set.
   */
  public void setCollateralType(java.lang.CharSequence value) {
    this.collateralType = value;
  }

  /**
   * Gets the value of the 'collateralValue' field.
   * @return The value of the 'collateralValue' field.
   */
  public java.math.BigDecimal getCollateralValue() {
    return collateralValue;
  }

  /**
   * Sets the value of the 'collateralValue' field.
   * @param value the value to set.
   */
  public void setCollateralValue(java.math.BigDecimal value) {
    this.collateralValue = value;
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return The value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return The value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'middleName' field.
   * @return The value of the 'middleName' field.
   */
  public java.lang.CharSequence getMiddleName() {
    return middleName;
  }

  /**
   * Sets the value of the 'middleName' field.
   * @param value the value to set.
   */
  public void setMiddleName(java.lang.CharSequence value) {
    this.middleName = value;
  }

  /**
   * Gets the value of the 'approvedLoanAmount' field.
   * @return The value of the 'approvedLoanAmount' field.
   */
  public java.math.BigDecimal getApprovedLoanAmount() {
    return approvedLoanAmount;
  }

  /**
   * Sets the value of the 'approvedLoanAmount' field.
   * @param value the value to set.
   */
  public void setApprovedLoanAmount(java.math.BigDecimal value) {
    this.approvedLoanAmount = value;
  }

  /**
   * Gets the value of the 'loanId' field.
   * @return The value of the 'loanId' field.
   */
  public java.lang.Long getLoanId() {
    return loanId;
  }

  /**
   * Sets the value of the 'loanId' field.
   * @param value the value to set.
   */
  public void setLoanId(java.lang.Long value) {
    this.loanId = value;
  }

  /**
   * Gets the value of the 'loanAccountNum' field.
   * @return The value of the 'loanAccountNum' field.
   */
  public java.lang.Long getLoanAccountNum() {
    return loanAccountNum;
  }

  /**
   * Sets the value of the 'loanAccountNum' field.
   * @param value the value to set.
   */
  public void setLoanAccountNum(java.lang.Long value) {
    this.loanAccountNum = value;
  }

  /**
   * Gets the value of the 'loanApprovalDate' field.
   * @return The value of the 'loanApprovalDate' field.
   */
  public java.lang.CharSequence getLoanApprovalDate() {
    return loanApprovalDate;
  }

  /**
   * Sets the value of the 'loanApprovalDate' field.
   * @param value the value to set.
   */
  public void setLoanApprovalDate(java.lang.CharSequence value) {
    this.loanApprovalDate = value;
  }

  /**
   * Creates a new CollateralEnrichedDetail RecordBuilder.
   * @return A new CollateralEnrichedDetail RecordBuilder
   */
  public static CollateralEnrichedDetail.Builder newBuilder() {
    return new CollateralEnrichedDetail.Builder();
  }

  /**
   * Creates a new CollateralEnrichedDetail RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CollateralEnrichedDetail RecordBuilder
   */
  public static CollateralEnrichedDetail.Builder newBuilder(CollateralEnrichedDetail.Builder other) {
    return new CollateralEnrichedDetail.Builder(other);
  }

  /**
   * Creates a new CollateralEnrichedDetail RecordBuilder by copying an existing CollateralEnrichedDetail instance.
   * @param other The existing instance to copy.
   * @return A new CollateralEnrichedDetail RecordBuilder
   */
  public static CollateralEnrichedDetail.Builder newBuilder(CollateralEnrichedDetail other) {
    return new CollateralEnrichedDetail.Builder(other);
  }

  /**
   * RecordBuilder for CollateralEnrichedDetail instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CollateralEnrichedDetail>
    implements org.apache.avro.data.RecordBuilder<CollateralEnrichedDetail> {

    private java.lang.CharSequence collateralDesc;
    private long collateralId;
    private java.lang.CharSequence collateralType;
    private java.math.BigDecimal collateralValue;
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private java.lang.CharSequence middleName;
    private java.math.BigDecimal approvedLoanAmount;
    private long loanId;
    private long loanAccountNum;
    private java.lang.CharSequence loanApprovalDate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(CollateralEnrichedDetail.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.collateralDesc)) {
        this.collateralDesc = data().deepCopy(fields()[0].schema(), other.collateralDesc);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.collateralId)) {
        this.collateralId = data().deepCopy(fields()[1].schema(), other.collateralId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.collateralType)) {
        this.collateralType = data().deepCopy(fields()[2].schema(), other.collateralType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.collateralValue)) {
        this.collateralValue = data().deepCopy(fields()[3].schema(), other.collateralValue);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.firstName)) {
        this.firstName = data().deepCopy(fields()[4].schema(), other.firstName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.lastName)) {
        this.lastName = data().deepCopy(fields()[5].schema(), other.lastName);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.middleName)) {
        this.middleName = data().deepCopy(fields()[6].schema(), other.middleName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.approvedLoanAmount)) {
        this.approvedLoanAmount = data().deepCopy(fields()[7].schema(), other.approvedLoanAmount);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.loanId)) {
        this.loanId = data().deepCopy(fields()[8].schema(), other.loanId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.loanAccountNum)) {
        this.loanAccountNum = data().deepCopy(fields()[9].schema(), other.loanAccountNum);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.loanApprovalDate)) {
        this.loanApprovalDate = data().deepCopy(fields()[10].schema(), other.loanApprovalDate);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CollateralEnrichedDetail instance
     * @param other The existing instance to copy.
     */
    private Builder(CollateralEnrichedDetail other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.collateralDesc)) {
        this.collateralDesc = data().deepCopy(fields()[0].schema(), other.collateralDesc);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.collateralId)) {
        this.collateralId = data().deepCopy(fields()[1].schema(), other.collateralId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.collateralType)) {
        this.collateralType = data().deepCopy(fields()[2].schema(), other.collateralType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.collateralValue)) {
        this.collateralValue = data().deepCopy(fields()[3].schema(), other.collateralValue);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.firstName)) {
        this.firstName = data().deepCopy(fields()[4].schema(), other.firstName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.lastName)) {
        this.lastName = data().deepCopy(fields()[5].schema(), other.lastName);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.middleName)) {
        this.middleName = data().deepCopy(fields()[6].schema(), other.middleName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.approvedLoanAmount)) {
        this.approvedLoanAmount = data().deepCopy(fields()[7].schema(), other.approvedLoanAmount);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.loanId)) {
        this.loanId = data().deepCopy(fields()[8].schema(), other.loanId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.loanAccountNum)) {
        this.loanAccountNum = data().deepCopy(fields()[9].schema(), other.loanAccountNum);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.loanApprovalDate)) {
        this.loanApprovalDate = data().deepCopy(fields()[10].schema(), other.loanApprovalDate);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'collateralDesc' field.
      * @return The value.
      */
    public java.lang.CharSequence getCollateralDesc() {
      return collateralDesc;
    }

    /**
      * Sets the value of the 'collateralDesc' field.
      * @param value The value of 'collateralDesc'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setCollateralDesc(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.collateralDesc = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'collateralDesc' field has been set.
      * @return True if the 'collateralDesc' field has been set, false otherwise.
      */
    public boolean hasCollateralDesc() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'collateralDesc' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearCollateralDesc() {
      collateralDesc = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'collateralId' field.
      * @return The value.
      */
    public java.lang.Long getCollateralId() {
      return collateralId;
    }

    /**
      * Sets the value of the 'collateralId' field.
      * @param value The value of 'collateralId'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setCollateralId(long value) {
      validate(fields()[1], value);
      this.collateralId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'collateralId' field has been set.
      * @return True if the 'collateralId' field has been set, false otherwise.
      */
    public boolean hasCollateralId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'collateralId' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearCollateralId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'collateralType' field.
      * @return The value.
      */
    public java.lang.CharSequence getCollateralType() {
      return collateralType;
    }

    /**
      * Sets the value of the 'collateralType' field.
      * @param value The value of 'collateralType'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setCollateralType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.collateralType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'collateralType' field has been set.
      * @return True if the 'collateralType' field has been set, false otherwise.
      */
    public boolean hasCollateralType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'collateralType' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearCollateralType() {
      collateralType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'collateralValue' field.
      * @return The value.
      */
    public java.math.BigDecimal getCollateralValue() {
      return collateralValue;
    }

    /**
      * Sets the value of the 'collateralValue' field.
      * @param value The value of 'collateralValue'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setCollateralValue(java.math.BigDecimal value) {
      validate(fields()[3], value);
      this.collateralValue = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'collateralValue' field has been set.
      * @return True if the 'collateralValue' field has been set, false otherwise.
      */
    public boolean hasCollateralValue() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'collateralValue' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearCollateralValue() {
      collateralValue = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'firstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.firstName = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'firstName' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.lastName = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'lastName' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'middleName' field.
      * @return The value.
      */
    public java.lang.CharSequence getMiddleName() {
      return middleName;
    }

    /**
      * Sets the value of the 'middleName' field.
      * @param value The value of 'middleName'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setMiddleName(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.middleName = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'middleName' field has been set.
      * @return True if the 'middleName' field has been set, false otherwise.
      */
    public boolean hasMiddleName() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'middleName' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearMiddleName() {
      middleName = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'approvedLoanAmount' field.
      * @return The value.
      */
    public java.math.BigDecimal getApprovedLoanAmount() {
      return approvedLoanAmount;
    }

    /**
      * Sets the value of the 'approvedLoanAmount' field.
      * @param value The value of 'approvedLoanAmount'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setApprovedLoanAmount(java.math.BigDecimal value) {
      validate(fields()[7], value);
      this.approvedLoanAmount = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'approvedLoanAmount' field has been set.
      * @return True if the 'approvedLoanAmount' field has been set, false otherwise.
      */
    public boolean hasApprovedLoanAmount() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'approvedLoanAmount' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearApprovedLoanAmount() {
      approvedLoanAmount = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'loanId' field.
      * @return The value.
      */
    public java.lang.Long getLoanId() {
      return loanId;
    }

    /**
      * Sets the value of the 'loanId' field.
      * @param value The value of 'loanId'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setLoanId(long value) {
      validate(fields()[8], value);
      this.loanId = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'loanId' field has been set.
      * @return True if the 'loanId' field has been set, false otherwise.
      */
    public boolean hasLoanId() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'loanId' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearLoanId() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'loanAccountNum' field.
      * @return The value.
      */
    public java.lang.Long getLoanAccountNum() {
      return loanAccountNum;
    }

    /**
      * Sets the value of the 'loanAccountNum' field.
      * @param value The value of 'loanAccountNum'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setLoanAccountNum(long value) {
      validate(fields()[9], value);
      this.loanAccountNum = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'loanAccountNum' field has been set.
      * @return True if the 'loanAccountNum' field has been set, false otherwise.
      */
    public boolean hasLoanAccountNum() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'loanAccountNum' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearLoanAccountNum() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'loanApprovalDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getLoanApprovalDate() {
      return loanApprovalDate;
    }

    /**
      * Sets the value of the 'loanApprovalDate' field.
      * @param value The value of 'loanApprovalDate'.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder setLoanApprovalDate(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.loanApprovalDate = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'loanApprovalDate' field has been set.
      * @return True if the 'loanApprovalDate' field has been set, false otherwise.
      */
    public boolean hasLoanApprovalDate() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'loanApprovalDate' field.
      * @return This builder.
      */
    public CollateralEnrichedDetail.Builder clearLoanApprovalDate() {
      loanApprovalDate = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CollateralEnrichedDetail build() {
      try {
        CollateralEnrichedDetail record = new CollateralEnrichedDetail();
        record.collateralDesc = fieldSetFlags()[0] ? this.collateralDesc : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.collateralId = fieldSetFlags()[1] ? this.collateralId : (java.lang.Long) defaultValue(fields()[1]);
        record.collateralType = fieldSetFlags()[2] ? this.collateralType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.collateralValue = fieldSetFlags()[3] ? this.collateralValue : (java.math.BigDecimal) defaultValue(fields()[3]);
        record.firstName = fieldSetFlags()[4] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.lastName = fieldSetFlags()[5] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.middleName = fieldSetFlags()[6] ? this.middleName : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.approvedLoanAmount = fieldSetFlags()[7] ? this.approvedLoanAmount : (java.math.BigDecimal) defaultValue(fields()[7]);
        record.loanId = fieldSetFlags()[8] ? this.loanId : (java.lang.Long) defaultValue(fields()[8]);
        record.loanAccountNum = fieldSetFlags()[9] ? this.loanAccountNum : (java.lang.Long) defaultValue(fields()[9]);
        record.loanApprovalDate = fieldSetFlags()[10] ? this.loanApprovalDate : (java.lang.CharSequence) defaultValue(fields()[10]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CollateralEnrichedDetail>
    WRITER$ = (org.apache.avro.io.DatumWriter<CollateralEnrichedDetail>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CollateralEnrichedDetail>
    READER$ = (org.apache.avro.io.DatumReader<CollateralEnrichedDetail>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
