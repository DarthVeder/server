// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Reviews.proto

package PHT;

public final class ReviewsOuterClass {
  private ReviewsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReviewsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PHT.Reviews)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string grade_rank = 1;</code>
     */
    boolean hasGradeRank();
    /**
     * <code>optional string grade_rank = 1;</code>
     */
    java.lang.String getGradeRank();
    /**
     * <code>optional string grade_rank = 1;</code>
     */
    com.google.protobuf.ByteString
        getGradeRankBytes();

    /**
     * <code>optional int64 proposal_id = 2;</code>
     */
    boolean hasProposalId();
    /**
     * <code>optional int64 proposal_id = 2;</code>
     */
    long getProposalId();

    /**
     * <code>optional string review_comments = 3;</code>
     */
    boolean hasReviewComments();
    /**
     * <code>optional string review_comments = 3;</code>
     */
    java.lang.String getReviewComments();
    /**
     * <code>optional string review_comments = 3;</code>
     */
    com.google.protobuf.ByteString
        getReviewCommentsBytes();

    /**
     * <code>optional int64 reviewer_id = 4;</code>
     */
    boolean hasReviewerId();
    /**
     * <code>optional int64 reviewer_id = 4;</code>
     */
    long getReviewerId();
  }
  /**
   * Protobuf type {@code PHT.Reviews}
   */
  public static final class Reviews extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PHT.Reviews)
      ReviewsOrBuilder {
    // Use Reviews.newBuilder() to construct.
    private Reviews(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Reviews(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Reviews defaultInstance;
    public static Reviews getDefaultInstance() {
      return defaultInstance;
    }

    public Reviews getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Reviews(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              gradeRank_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              proposalId_ = input.readInt64();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              reviewComments_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              reviewerId_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PHT.ReviewsOuterClass.internal_static_PHT_Reviews_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PHT.ReviewsOuterClass.internal_static_PHT_Reviews_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PHT.ReviewsOuterClass.Reviews.class, PHT.ReviewsOuterClass.Reviews.Builder.class);
    }

    public static com.google.protobuf.Parser<Reviews> PARSER =
        new com.google.protobuf.AbstractParser<Reviews>() {
      public Reviews parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Reviews(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Reviews> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int GRADE_RANK_FIELD_NUMBER = 1;
    private java.lang.Object gradeRank_;
    /**
     * <code>optional string grade_rank = 1;</code>
     */
    public boolean hasGradeRank() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string grade_rank = 1;</code>
     */
    public java.lang.String getGradeRank() {
      java.lang.Object ref = gradeRank_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          gradeRank_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string grade_rank = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGradeRankBytes() {
      java.lang.Object ref = gradeRank_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gradeRank_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PROPOSAL_ID_FIELD_NUMBER = 2;
    private long proposalId_;
    /**
     * <code>optional int64 proposal_id = 2;</code>
     */
    public boolean hasProposalId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 proposal_id = 2;</code>
     */
    public long getProposalId() {
      return proposalId_;
    }

    public static final int REVIEW_COMMENTS_FIELD_NUMBER = 3;
    private java.lang.Object reviewComments_;
    /**
     * <code>optional string review_comments = 3;</code>
     */
    public boolean hasReviewComments() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string review_comments = 3;</code>
     */
    public java.lang.String getReviewComments() {
      java.lang.Object ref = reviewComments_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reviewComments_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string review_comments = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReviewCommentsBytes() {
      java.lang.Object ref = reviewComments_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reviewComments_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REVIEWER_ID_FIELD_NUMBER = 4;
    private long reviewerId_;
    /**
     * <code>optional int64 reviewer_id = 4;</code>
     */
    public boolean hasReviewerId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 reviewer_id = 4;</code>
     */
    public long getReviewerId() {
      return reviewerId_;
    }

    private void initFields() {
      gradeRank_ = "";
      proposalId_ = 0L;
      reviewComments_ = "";
      reviewerId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getGradeRankBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, proposalId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getReviewCommentsBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, reviewerId_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getGradeRankBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, proposalId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getReviewCommentsBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, reviewerId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static PHT.ReviewsOuterClass.Reviews parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PHT.ReviewsOuterClass.Reviews parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PHT.ReviewsOuterClass.Reviews parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PHT.ReviewsOuterClass.Reviews parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PHT.ReviewsOuterClass.Reviews parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static PHT.ReviewsOuterClass.Reviews parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static PHT.ReviewsOuterClass.Reviews parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static PHT.ReviewsOuterClass.Reviews parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static PHT.ReviewsOuterClass.Reviews parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static PHT.ReviewsOuterClass.Reviews parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(PHT.ReviewsOuterClass.Reviews prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PHT.Reviews}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PHT.Reviews)
        PHT.ReviewsOuterClass.ReviewsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PHT.ReviewsOuterClass.internal_static_PHT_Reviews_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PHT.ReviewsOuterClass.internal_static_PHT_Reviews_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PHT.ReviewsOuterClass.Reviews.class, PHT.ReviewsOuterClass.Reviews.Builder.class);
      }

      // Construct using PHT.ReviewsOuterClass.Reviews.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        gradeRank_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        proposalId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        reviewComments_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        reviewerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PHT.ReviewsOuterClass.internal_static_PHT_Reviews_descriptor;
      }

      public PHT.ReviewsOuterClass.Reviews getDefaultInstanceForType() {
        return PHT.ReviewsOuterClass.Reviews.getDefaultInstance();
      }

      public PHT.ReviewsOuterClass.Reviews build() {
        PHT.ReviewsOuterClass.Reviews result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public PHT.ReviewsOuterClass.Reviews buildPartial() {
        PHT.ReviewsOuterClass.Reviews result = new PHT.ReviewsOuterClass.Reviews(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.gradeRank_ = gradeRank_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.proposalId_ = proposalId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.reviewComments_ = reviewComments_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.reviewerId_ = reviewerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PHT.ReviewsOuterClass.Reviews) {
          return mergeFrom((PHT.ReviewsOuterClass.Reviews)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PHT.ReviewsOuterClass.Reviews other) {
        if (other == PHT.ReviewsOuterClass.Reviews.getDefaultInstance()) return this;
        if (other.hasGradeRank()) {
          bitField0_ |= 0x00000001;
          gradeRank_ = other.gradeRank_;
          onChanged();
        }
        if (other.hasProposalId()) {
          setProposalId(other.getProposalId());
        }
        if (other.hasReviewComments()) {
          bitField0_ |= 0x00000004;
          reviewComments_ = other.reviewComments_;
          onChanged();
        }
        if (other.hasReviewerId()) {
          setReviewerId(other.getReviewerId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        PHT.ReviewsOuterClass.Reviews parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PHT.ReviewsOuterClass.Reviews) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object gradeRank_ = "";
      /**
       * <code>optional string grade_rank = 1;</code>
       */
      public boolean hasGradeRank() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string grade_rank = 1;</code>
       */
      public java.lang.String getGradeRank() {
        java.lang.Object ref = gradeRank_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            gradeRank_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string grade_rank = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGradeRankBytes() {
        java.lang.Object ref = gradeRank_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gradeRank_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string grade_rank = 1;</code>
       */
      public Builder setGradeRank(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        gradeRank_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string grade_rank = 1;</code>
       */
      public Builder clearGradeRank() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gradeRank_ = getDefaultInstance().getGradeRank();
        onChanged();
        return this;
      }
      /**
       * <code>optional string grade_rank = 1;</code>
       */
      public Builder setGradeRankBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        gradeRank_ = value;
        onChanged();
        return this;
      }

      private long proposalId_ ;
      /**
       * <code>optional int64 proposal_id = 2;</code>
       */
      public boolean hasProposalId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 proposal_id = 2;</code>
       */
      public long getProposalId() {
        return proposalId_;
      }
      /**
       * <code>optional int64 proposal_id = 2;</code>
       */
      public Builder setProposalId(long value) {
        bitField0_ |= 0x00000002;
        proposalId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 proposal_id = 2;</code>
       */
      public Builder clearProposalId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        proposalId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object reviewComments_ = "";
      /**
       * <code>optional string review_comments = 3;</code>
       */
      public boolean hasReviewComments() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string review_comments = 3;</code>
       */
      public java.lang.String getReviewComments() {
        java.lang.Object ref = reviewComments_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reviewComments_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string review_comments = 3;</code>
       */
      public com.google.protobuf.ByteString
          getReviewCommentsBytes() {
        java.lang.Object ref = reviewComments_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reviewComments_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string review_comments = 3;</code>
       */
      public Builder setReviewComments(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        reviewComments_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string review_comments = 3;</code>
       */
      public Builder clearReviewComments() {
        bitField0_ = (bitField0_ & ~0x00000004);
        reviewComments_ = getDefaultInstance().getReviewComments();
        onChanged();
        return this;
      }
      /**
       * <code>optional string review_comments = 3;</code>
       */
      public Builder setReviewCommentsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        reviewComments_ = value;
        onChanged();
        return this;
      }

      private long reviewerId_ ;
      /**
       * <code>optional int64 reviewer_id = 4;</code>
       */
      public boolean hasReviewerId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int64 reviewer_id = 4;</code>
       */
      public long getReviewerId() {
        return reviewerId_;
      }
      /**
       * <code>optional int64 reviewer_id = 4;</code>
       */
      public Builder setReviewerId(long value) {
        bitField0_ |= 0x00000008;
        reviewerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 reviewer_id = 4;</code>
       */
      public Builder clearReviewerId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        reviewerId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PHT.Reviews)
    }

    static {
      defaultInstance = new Reviews(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PHT.Reviews)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PHT_Reviews_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PHT_Reviews_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rReviews.proto\022\003PHT\"`\n\007Reviews\022\022\n\ngrade" +
      "_rank\030\001 \001(\t\022\023\n\013proposal_id\030\002 \001(\003\022\027\n\017revi" +
      "ew_comments\030\003 \001(\t\022\023\n\013reviewer_id\030\004 \001(\003"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_PHT_Reviews_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PHT_Reviews_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PHT_Reviews_descriptor,
        new java.lang.String[] { "GradeRank", "ProposalId", "ReviewComments", "ReviewerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
