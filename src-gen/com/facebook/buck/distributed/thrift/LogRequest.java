/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-10-26")
public class LogRequest implements org.apache.thrift.TBase<LogRequest, LogRequest._Fields>, java.io.Serializable, Cloneable, Comparable<LogRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LogRequest");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SCRIBE_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("scribeData", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LogRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LogRequestTupleSchemeFactory();

  /**
   * 
   * @see LogRequestType
   */
  public LogRequestType type; // optional
  public ScribeData scribeData; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see LogRequestType
     */
    TYPE((short)1, "type"),
    SCRIBE_DATA((short)2, "scribeData");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // SCRIBE_DATA
          return SCRIBE_DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.SCRIBE_DATA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, LogRequestType.class)));
    tmpMap.put(_Fields.SCRIBE_DATA, new org.apache.thrift.meta_data.FieldMetaData("scribeData", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ScribeData.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LogRequest.class, metaDataMap);
  }

  public LogRequest() {
    this.type = com.facebook.buck.distributed.thrift.LogRequestType.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LogRequest(LogRequest other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetScribeData()) {
      this.scribeData = new ScribeData(other.scribeData);
    }
  }

  public LogRequest deepCopy() {
    return new LogRequest(this);
  }

  @Override
  public void clear() {
    this.type = com.facebook.buck.distributed.thrift.LogRequestType.UNKNOWN;

    this.scribeData = null;
  }

  /**
   * 
   * @see LogRequestType
   */
  public LogRequestType getType() {
    return this.type;
  }

  /**
   * 
   * @see LogRequestType
   */
  public LogRequest setType(LogRequestType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public ScribeData getScribeData() {
    return this.scribeData;
  }

  public LogRequest setScribeData(ScribeData scribeData) {
    this.scribeData = scribeData;
    return this;
  }

  public void unsetScribeData() {
    this.scribeData = null;
  }

  /** Returns true if field scribeData is set (has been assigned a value) and false otherwise */
  public boolean isSetScribeData() {
    return this.scribeData != null;
  }

  public void setScribeDataIsSet(boolean value) {
    if (!value) {
      this.scribeData = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((LogRequestType)value);
      }
      break;

    case SCRIBE_DATA:
      if (value == null) {
        unsetScribeData();
      } else {
        setScribeData((ScribeData)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case SCRIBE_DATA:
      return getScribeData();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case SCRIBE_DATA:
      return isSetScribeData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof LogRequest)
      return this.equals((LogRequest)that);
    return false;
  }

  public boolean equals(LogRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_scribeData = true && this.isSetScribeData();
    boolean that_present_scribeData = true && that.isSetScribeData();
    if (this_present_scribeData || that_present_scribeData) {
      if (!(this_present_scribeData && that_present_scribeData))
        return false;
      if (!this.scribeData.equals(that.scribeData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetScribeData()) ? 131071 : 524287);
    if (isSetScribeData())
      hashCode = hashCode * 8191 + scribeData.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(LogRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetScribeData()).compareTo(other.isSetScribeData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScribeData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scribeData, other.scribeData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("LogRequest(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetScribeData()) {
      if (!first) sb.append(", ");
      sb.append("scribeData:");
      if (this.scribeData == null) {
        sb.append("null");
      } else {
        sb.append(this.scribeData);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (scribeData != null) {
      scribeData.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LogRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LogRequestStandardScheme getScheme() {
      return new LogRequestStandardScheme();
    }
  }

  private static class LogRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<LogRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.facebook.buck.distributed.thrift.LogRequestType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCRIBE_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.scribeData = new ScribeData();
              struct.scribeData.read(iprot);
              struct.setScribeDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LogRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.scribeData != null) {
        if (struct.isSetScribeData()) {
          oprot.writeFieldBegin(SCRIBE_DATA_FIELD_DESC);
          struct.scribeData.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LogRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LogRequestTupleScheme getScheme() {
      return new LogRequestTupleScheme();
    }
  }

  private static class LogRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<LogRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetScribeData()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetScribeData()) {
        struct.scribeData.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LogRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.type = com.facebook.buck.distributed.thrift.LogRequestType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.scribeData = new ScribeData();
        struct.scribeData.read(iprot);
        struct.setScribeDataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

