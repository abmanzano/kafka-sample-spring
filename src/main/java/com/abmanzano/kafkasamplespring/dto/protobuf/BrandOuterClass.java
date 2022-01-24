package com.abmanzano.kafkasamplespring.dto.protobuf;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Brand.proto

public final class BrandOuterClass {
  private BrandOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BrandOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Brand)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code Brand}
   */
  public static final class Brand extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Brand)
      BrandOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Brand.newBuilder() to construct.
    private Brand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Brand() {
      name_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Brand();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Brand(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              id_ = input.readInt64();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BrandOuterClass.internal_static_Brand_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BrandOuterClass.internal_static_Brand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Brand.class, Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @Override
    public long getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Brand)) {
        return super.equals(obj);
      }
      Brand other = (Brand) obj;

      if (getId()
          != other.getId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Brand parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Brand parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Brand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Brand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Brand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Brand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Brand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Brand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Brand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Brand parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Brand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Brand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Brand prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Brand}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Brand)
        BrandOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BrandOuterClass.internal_static_Brand_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BrandOuterClass.internal_static_Brand_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Brand.class, Builder.class);
      }

      // Construct using BrandOuterClass.Brand.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        id_ = 0L;

        name_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BrandOuterClass.internal_static_Brand_descriptor;
      }

      @Override
      public Brand getDefaultInstanceForType() {
        return Brand.getDefaultInstance();
      }

      @Override
      public Brand build() {
        Brand result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Brand buildPartial() {
        Brand result = new Brand(this);
        result.id_ = id_;
        result.name_ = name_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Brand) {
          return mergeFrom((Brand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Brand other) {
        if (other == Brand.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Brand parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Brand) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>int64 id = 1;</code>
       * @return The id.
       */
      @Override
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Brand)
    }

    // @@protoc_insertion_point(class_scope:Brand)
    private static final Brand DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Brand();
    }

    public static Brand getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Brand>
        PARSER = new com.google.protobuf.AbstractParser<Brand>() {
      @Override
      public Brand parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Brand(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Brand> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Brand> getParserForType() {
      return PARSER;
    }

    @Override
    public Brand getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Brand_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Brand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013Brand.proto\"!\n\005Brand\022\n\n\002id\030\001 \001(\003\022\014\n\004na" +
      "me\030\002 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Brand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Brand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Brand_descriptor,
        new String[] { "Id", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
