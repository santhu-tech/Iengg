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
public class ApplicantDetail extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8549412585978887757L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ApplicantDetail\",\"namespace\":\"com.vishaluplanch.org.schemas\",\"fields\":[{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"currentAddress\",\"type\":\"string\"},{\"name\":\"dateOfBirth\",\"type\":\"string\"},{\"name\":\"employmentDetail\",\"type\":{\"type\":\"record\",\"name\":\"EmploymentDetail\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"employmentType\",\"type\":\"string\"},{\"name\":\"inHandSalary\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"location\",\"type\":\"string\"},{\"name\":\"netSalary\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"organizationName\",\"type\":\"string\"},{\"name\":\"position\",\"type\":\"string\"}]}},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"middleName\",\"type\":\"string\"},{\"name\":\"permanentAddress\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ApplicantDetail> ENCODER =
      new BinaryMessageEncoder<ApplicantDetail>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ApplicantDetail> DECODER =
      new BinaryMessageDecoder<ApplicantDetail>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ApplicantDetail> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ApplicantDetail> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ApplicantDetail>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ApplicantDetail to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ApplicantDetail from a ByteBuffer. */
  public static ApplicantDetail fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int age;
  @Deprecated public java.lang.CharSequence currentAddress;
  @Deprecated public java.lang.CharSequence dateOfBirth;
  @Deprecated public EmploymentDetail employmentDetail;
  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence lastName;
  @Deprecated public java.lang.CharSequence middleName;
  @Deprecated public java.lang.CharSequence permanentAddress;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ApplicantDetail() {}

  /**
   * All-args constructor.
   * @param age The new value for age
   * @param currentAddress The new value for currentAddress
   * @param dateOfBirth The new value for dateOfBirth
   * @param employmentDetail The new value for employmentDetail
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   * @param middleName The new value for middleName
   * @param permanentAddress The new value for permanentAddress
   */
  public ApplicantDetail(java.lang.Integer age, java.lang.CharSequence currentAddress, java.lang.CharSequence dateOfBirth, EmploymentDetail employmentDetail, java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.CharSequence middleName, java.lang.CharSequence permanentAddress) {
    this.age = age;
    this.currentAddress = currentAddress;
    this.dateOfBirth = dateOfBirth;
    this.employmentDetail = employmentDetail;
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.permanentAddress = permanentAddress;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return age;
    case 1: return currentAddress;
    case 2: return dateOfBirth;
    case 3: return employmentDetail;
    case 4: return firstName;
    case 5: return lastName;
    case 6: return middleName;
    case 7: return permanentAddress;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: age = (java.lang.Integer)value$; break;
    case 1: currentAddress = (java.lang.CharSequence)value$; break;
    case 2: dateOfBirth = (java.lang.CharSequence)value$; break;
    case 3: employmentDetail = (EmploymentDetail)value$; break;
    case 4: firstName = (java.lang.CharSequence)value$; break;
    case 5: lastName = (java.lang.CharSequence)value$; break;
    case 6: middleName = (java.lang.CharSequence)value$; break;
    case 7: permanentAddress = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'currentAddress' field.
   * @return The value of the 'currentAddress' field.
   */
  public java.lang.CharSequence getCurrentAddress() {
    return currentAddress;
  }

  /**
   * Sets the value of the 'currentAddress' field.
   * @param value the value to set.
   */
  public void setCurrentAddress(java.lang.CharSequence value) {
    this.currentAddress = value;
  }

  /**
   * Gets the value of the 'dateOfBirth' field.
   * @return The value of the 'dateOfBirth' field.
   */
  public java.lang.CharSequence getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * Sets the value of the 'dateOfBirth' field.
   * @param value the value to set.
   */
  public void setDateOfBirth(java.lang.CharSequence value) {
    this.dateOfBirth = value;
  }

  /**
   * Gets the value of the 'employmentDetail' field.
   * @return The value of the 'employmentDetail' field.
   */
  public EmploymentDetail getEmploymentDetail() {
    return employmentDetail;
  }

  /**
   * Sets the value of the 'employmentDetail' field.
   * @param value the value to set.
   */
  public void setEmploymentDetail(EmploymentDetail value) {
    this.employmentDetail = value;
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
   * Gets the value of the 'permanentAddress' field.
   * @return The value of the 'permanentAddress' field.
   */
  public java.lang.CharSequence getPermanentAddress() {
    return permanentAddress;
  }

  /**
   * Sets the value of the 'permanentAddress' field.
   * @param value the value to set.
   */
  public void setPermanentAddress(java.lang.CharSequence value) {
    this.permanentAddress = value;
  }

  /**
   * Creates a new ApplicantDetail RecordBuilder.
   * @return A new ApplicantDetail RecordBuilder
   */
  public static ApplicantDetail.Builder newBuilder() {
    return new ApplicantDetail.Builder();
  }

  /**
   * Creates a new ApplicantDetail RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ApplicantDetail RecordBuilder
   */
  public static ApplicantDetail.Builder newBuilder(ApplicantDetail.Builder other) {
    return new ApplicantDetail.Builder(other);
  }

  /**
   * Creates a new ApplicantDetail RecordBuilder by copying an existing ApplicantDetail instance.
   * @param other The existing instance to copy.
   * @return A new ApplicantDetail RecordBuilder
   */
  public static ApplicantDetail.Builder newBuilder(ApplicantDetail other) {
    return new ApplicantDetail.Builder(other);
  }

  /**
   * RecordBuilder for ApplicantDetail instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ApplicantDetail>
    implements org.apache.avro.data.RecordBuilder<ApplicantDetail> {

    private int age;
    private java.lang.CharSequence currentAddress;
    private java.lang.CharSequence dateOfBirth;
    private EmploymentDetail employmentDetail;
    private EmploymentDetail.Builder employmentDetailBuilder;
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private java.lang.CharSequence middleName;
    private java.lang.CharSequence permanentAddress;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ApplicantDetail.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.age)) {
        this.age = data().deepCopy(fields()[0].schema(), other.age);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.currentAddress)) {
        this.currentAddress = data().deepCopy(fields()[1].schema(), other.currentAddress);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dateOfBirth)) {
        this.dateOfBirth = data().deepCopy(fields()[2].schema(), other.dateOfBirth);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.employmentDetail)) {
        this.employmentDetail = data().deepCopy(fields()[3].schema(), other.employmentDetail);
        fieldSetFlags()[3] = true;
      }
      if (other.hasEmploymentDetailBuilder()) {
        this.employmentDetailBuilder = EmploymentDetail.newBuilder(other.getEmploymentDetailBuilder());
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
      if (isValidValue(fields()[7], other.permanentAddress)) {
        this.permanentAddress = data().deepCopy(fields()[7].schema(), other.permanentAddress);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ApplicantDetail instance
     * @param other The existing instance to copy.
     */
    private Builder(ApplicantDetail other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.age)) {
        this.age = data().deepCopy(fields()[0].schema(), other.age);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.currentAddress)) {
        this.currentAddress = data().deepCopy(fields()[1].schema(), other.currentAddress);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dateOfBirth)) {
        this.dateOfBirth = data().deepCopy(fields()[2].schema(), other.dateOfBirth);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.employmentDetail)) {
        this.employmentDetail = data().deepCopy(fields()[3].schema(), other.employmentDetail);
        fieldSetFlags()[3] = true;
      }
      this.employmentDetailBuilder = null;
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
      if (isValidValue(fields()[7], other.permanentAddress)) {
        this.permanentAddress = data().deepCopy(fields()[7].schema(), other.permanentAddress);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public ApplicantDetail.Builder setAge(int value) {
      validate(fields()[0], value);
      this.age = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public ApplicantDetail.Builder clearAge() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'currentAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getCurrentAddress() {
      return currentAddress;
    }

    /**
      * Sets the value of the 'currentAddress' field.
      * @param value The value of 'currentAddress'.
      * @return This builder.
      */
    public ApplicantDetail.Builder setCurrentAddress(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.currentAddress = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'currentAddress' field has been set.
      * @return True if the 'currentAddress' field has been set, false otherwise.
      */
    public boolean hasCurrentAddress() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'currentAddress' field.
      * @return This builder.
      */
    public ApplicantDetail.Builder clearCurrentAddress() {
      currentAddress = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'dateOfBirth' field.
      * @return The value.
      */
    public java.lang.CharSequence getDateOfBirth() {
      return dateOfBirth;
    }

    /**
      * Sets the value of the 'dateOfBirth' field.
      * @param value The value of 'dateOfBirth'.
      * @return This builder.
      */
    public ApplicantDetail.Builder setDateOfBirth(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.dateOfBirth = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'dateOfBirth' field has been set.
      * @return True if the 'dateOfBirth' field has been set, false otherwise.
      */
    public boolean hasDateOfBirth() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'dateOfBirth' field.
      * @return This builder.
      */
    public ApplicantDetail.Builder clearDateOfBirth() {
      dateOfBirth = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'employmentDetail' field.
      * @return The value.
      */
    public EmploymentDetail getEmploymentDetail() {
      return employmentDetail;
    }

    /**
      * Sets the value of the 'employmentDetail' field.
      * @param value The value of 'employmentDetail'.
      * @return This builder.
      */
    public ApplicantDetail.Builder setEmploymentDetail(EmploymentDetail value) {
      validate(fields()[3], value);
      this.employmentDetailBuilder = null;
      this.employmentDetail = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'employmentDetail' field has been set.
      * @return True if the 'employmentDetail' field has been set, false otherwise.
      */
    public boolean hasEmploymentDetail() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'employmentDetail' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public EmploymentDetail.Builder getEmploymentDetailBuilder() {
      if (employmentDetailBuilder == null) {
        if (hasEmploymentDetail()) {
          setEmploymentDetailBuilder(EmploymentDetail.newBuilder(employmentDetail));
        } else {
          setEmploymentDetailBuilder(EmploymentDetail.newBuilder());
        }
      }
      return employmentDetailBuilder;
    }

    /**
     * Sets the Builder instance for the 'employmentDetail' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public ApplicantDetail.Builder setEmploymentDetailBuilder(EmploymentDetail.Builder value) {
      clearEmploymentDetail();
      employmentDetailBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'employmentDetail' field has an active Builder instance
     * @return True if the 'employmentDetail' field has an active Builder instance
     */
    public boolean hasEmploymentDetailBuilder() {
      return employmentDetailBuilder != null;
    }

    /**
      * Clears the value of the 'employmentDetail' field.
      * @return This builder.
      */
    public ApplicantDetail.Builder clearEmploymentDetail() {
      employmentDetail = null;
      employmentDetailBuilder = null;
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
    public ApplicantDetail.Builder setFirstName(java.lang.CharSequence value) {
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
    public ApplicantDetail.Builder clearFirstName() {
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
    public ApplicantDetail.Builder setLastName(java.lang.CharSequence value) {
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
    public ApplicantDetail.Builder clearLastName() {
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
    public ApplicantDetail.Builder setMiddleName(java.lang.CharSequence value) {
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
    public ApplicantDetail.Builder clearMiddleName() {
      middleName = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'permanentAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getPermanentAddress() {
      return permanentAddress;
    }

    /**
      * Sets the value of the 'permanentAddress' field.
      * @param value The value of 'permanentAddress'.
      * @return This builder.
      */
    public ApplicantDetail.Builder setPermanentAddress(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.permanentAddress = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'permanentAddress' field has been set.
      * @return True if the 'permanentAddress' field has been set, false otherwise.
      */
    public boolean hasPermanentAddress() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'permanentAddress' field.
      * @return This builder.
      */
    public ApplicantDetail.Builder clearPermanentAddress() {
      permanentAddress = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ApplicantDetail build() {
      try {
        ApplicantDetail record = new ApplicantDetail();
        record.age = fieldSetFlags()[0] ? this.age : (java.lang.Integer) defaultValue(fields()[0]);
        record.currentAddress = fieldSetFlags()[1] ? this.currentAddress : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.dateOfBirth = fieldSetFlags()[2] ? this.dateOfBirth : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (employmentDetailBuilder != null) {
          record.employmentDetail = this.employmentDetailBuilder.build();
        } else {
          record.employmentDetail = fieldSetFlags()[3] ? this.employmentDetail : (EmploymentDetail) defaultValue(fields()[3]);
        }
        record.firstName = fieldSetFlags()[4] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.lastName = fieldSetFlags()[5] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.middleName = fieldSetFlags()[6] ? this.middleName : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.permanentAddress = fieldSetFlags()[7] ? this.permanentAddress : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ApplicantDetail>
    WRITER$ = (org.apache.avro.io.DatumWriter<ApplicantDetail>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ApplicantDetail>
    READER$ = (org.apache.avro.io.DatumReader<ApplicantDetail>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
