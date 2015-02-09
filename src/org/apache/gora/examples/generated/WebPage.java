/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.gora.examples.generated;  
@SuppressWarnings("all")
public class WebPage extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WebPage\",\"namespace\":\"org.apache.gora.examples.generated\",\"fields\":[{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"content\",\"type\":[\"null\",\"bytes\"],\"default\":null},{\"name\":\"parsedContent\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"default\":null},{\"name\":\"outlinks\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":{}},{\"name\":\"headers\",\"type\":[\"null\",{\"type\":\"map\",\"values\":[\"null\",\"string\"]}],\"default\":null},{\"name\":\"metadata\",\"type\":{\"type\":\"record\",\"name\":\"Metadata\",\"fields\":[{\"name\":\"version\",\"type\":\"int\",\"default\":0},{\"name\":\"data\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":null}]},\"default\":null}],\"default\":null}");

  /** Enum containing all data bean's fields. */
  public static enum Field {
    URL(0, "url"),
    CONTENT(1, "content"),
    PARSED_CONTENT(2, "parsedContent"),
    OUTLINKS(3, "outlinks"),
    HEADERS(4, "headers"),
    METADATA(5, "metadata"),
    ;
    /**
     * Field's index.
     */
    private int index;

    /**
     * Field's name.
     */
    private String name;

    /**
     * Field's constructor
     * @param index field's index.
     * @param name field's name.
     */
    Field(int index, String name) {this.index=index;this.name=name;}

    /**
     * Gets field's index.
     * @return int field's index.
     */
    public int getIndex() {return index;}

    /**
     * Gets field's name.
     * @return String field's name.
     */
    public String getName() {return name;}

    /**
     * Gets field's attributes to string.
     * @return String field's attributes to string.
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
  "url",
  "content",
  "parsedContent",
  "outlinks",
  "headers",
  "metadata",
  };

  /**
   * Gets the total field count.
   * @return int field count
   */
  public int getFieldsCount() {
    return WebPage._ALL_FIELDS.length;
  }

  private java.lang.CharSequence url;
  private java.nio.ByteBuffer content;
  private java.util.List<java.lang.CharSequence> parsedContent;
  private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> outlinks;
  private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> headers;
  private org.apache.gora.examples.generated.Metadata metadata;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return url;
    case 1: return content;
    case 2: return parsedContent;
    case 3: return outlinks;
    case 4: return headers;
    case 5: return metadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: url = (java.lang.CharSequence)(value); break;
    case 1: content = (java.nio.ByteBuffer)(value); break;
    case 2: parsedContent = (java.util.List<java.lang.CharSequence>)((value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyListWrapper((java.util.List)value)); break;
    case 3: outlinks = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)((value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyMapWrapper((java.util.Map)value)); break;
    case 4: headers = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)(value); break;
    case 5: metadata = (org.apache.gora.examples.generated.Metadata)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
    setDirty(0);
  }
  
  /**
   * Checks the dirty status of the 'url' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isUrlDirty(java.lang.CharSequence value) {
    return isDirty(0);
  }

  /**
   * Gets the value of the 'content' field.
   */
  public java.nio.ByteBuffer getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(java.nio.ByteBuffer value) {
    this.content = value;
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'content' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isContentDirty(java.nio.ByteBuffer value) {
    return isDirty(1);
  }

  /**
   * Gets the value of the 'parsedContent' field.
   */
  public java.util.List<java.lang.CharSequence> getParsedContent() {
    return parsedContent;
  }

  /**
   * Sets the value of the 'parsedContent' field.
   * @param value the value to set.
   */
  public void setParsedContent(java.util.List<java.lang.CharSequence> value) {
    this.parsedContent = (value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyListWrapper(value);
    setDirty(2);
  }
  
  /**
   * Checks the dirty status of the 'parsedContent' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isParsedContentDirty(java.util.List<java.lang.CharSequence> value) {
    return isDirty(2);
  }

  /**
   * Gets the value of the 'outlinks' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getOutlinks() {
    return outlinks;
  }

  /**
   * Sets the value of the 'outlinks' field.
   * @param value the value to set.
   */
  public void setOutlinks(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.outlinks = (value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyMapWrapper(value);
    setDirty(3);
  }
  
  /**
   * Checks the dirty status of the 'outlinks' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isOutlinksDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    return isDirty(3);
  }

  /**
   * Gets the value of the 'headers' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getHeaders() {
    return headers;
  }

  /**
   * Sets the value of the 'headers' field.
   * @param value the value to set.
   */
  public void setHeaders(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.headers = value;
    setDirty(4);
  }
  
  /**
   * Checks the dirty status of the 'headers' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isHeadersDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    return isDirty(4);
  }

  /**
   * Gets the value of the 'metadata' field.
   */
  public org.apache.gora.examples.generated.Metadata getMetadata() {
    return metadata;
  }

  /**
   * Sets the value of the 'metadata' field.
   * @param value the value to set.
   */
  public void setMetadata(org.apache.gora.examples.generated.Metadata value) {
    this.metadata = value;
    setDirty(5);
  }
  
  /**
   * Checks the dirty status of the 'metadata' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isMetadataDirty(org.apache.gora.examples.generated.Metadata value) {
    return isDirty(5);
  }

  /** Creates a new WebPage RecordBuilder */
  public static org.apache.gora.examples.generated.WebPage.Builder newBuilder() {
    return new org.apache.gora.examples.generated.WebPage.Builder();
  }
  
  /** Creates a new WebPage RecordBuilder by copying an existing Builder */
  public static org.apache.gora.examples.generated.WebPage.Builder newBuilder(org.apache.gora.examples.generated.WebPage.Builder other) {
    return new org.apache.gora.examples.generated.WebPage.Builder(other);
  }
  
  /** Creates a new WebPage RecordBuilder by copying an existing WebPage instance */
  public static org.apache.gora.examples.generated.WebPage.Builder newBuilder(org.apache.gora.examples.generated.WebPage other) {
    return new org.apache.gora.examples.generated.WebPage.Builder(other);
  }
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
    int mark = input.position();
    int limit = input.limit();
    input.rewind();
    input.limit(input.capacity());
    copy.put(input);
    input.rewind();
    copy.rewind();
    input.position(mark);
    input.mark();
    copy.position(mark);
    copy.mark();
    input.position(position);
    copy.position(position);
    input.limit(limit);
    copy.limit(limit);
    return copy.asReadOnlyBuffer();
  }
  
  /**
   * RecordBuilder for WebPage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WebPage>
    implements org.apache.avro.data.RecordBuilder<WebPage> {

    private java.lang.CharSequence url;
    private java.nio.ByteBuffer content;
    private java.util.List<java.lang.CharSequence> parsedContent;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> outlinks;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> headers;
    private org.apache.gora.examples.generated.Metadata metadata;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.gora.examples.generated.WebPage.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.gora.examples.generated.WebPage.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing WebPage instance */
    private Builder(org.apache.gora.examples.generated.WebPage other) {
            super(org.apache.gora.examples.generated.WebPage.SCHEMA$);
      if (isValidValue(fields()[0], other.url)) {
        this.url = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = (java.nio.ByteBuffer) data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.parsedContent)) {
        this.parsedContent = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[2].schema(), other.parsedContent);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.outlinks)) {
        this.outlinks = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[3].schema(), other.outlinks);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.headers)) {
        this.headers = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[4].schema(), other.headers);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.metadata)) {
        this.metadata = (org.apache.gora.examples.generated.Metadata) data().deepCopy(fields()[5].schema(), other.metadata);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'url' field */
    public java.lang.CharSequence getUrl() {
      return url;
    }
    
    /** Sets the value of the 'url' field */
    public org.apache.gora.examples.generated.WebPage.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.url = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'url' field has been set */
    public boolean hasUrl() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'url' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearUrl() {
      url = null;
      fieldSetFlags()[0] = false;
      return this;
    }
    
    /** Gets the value of the 'content' field */
    public java.nio.ByteBuffer getContent() {
      return content;
    }
    
    /** Sets the value of the 'content' field */
    public org.apache.gora.examples.generated.WebPage.Builder setContent(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.content = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'content' field has been set */
    public boolean hasContent() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'content' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearContent() {
      content = null;
      fieldSetFlags()[1] = false;
      return this;
    }
    
    /** Gets the value of the 'parsedContent' field */
    public java.util.List<java.lang.CharSequence> getParsedContent() {
      return parsedContent;
    }
    
    /** Sets the value of the 'parsedContent' field */
    public org.apache.gora.examples.generated.WebPage.Builder setParsedContent(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.parsedContent = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'parsedContent' field has been set */
    public boolean hasParsedContent() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'parsedContent' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearParsedContent() {
      parsedContent = null;
      fieldSetFlags()[2] = false;
      return this;
    }
    
    /** Gets the value of the 'outlinks' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getOutlinks() {
      return outlinks;
    }
    
    /** Sets the value of the 'outlinks' field */
    public org.apache.gora.examples.generated.WebPage.Builder setOutlinks(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.outlinks = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'outlinks' field has been set */
    public boolean hasOutlinks() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'outlinks' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearOutlinks() {
      outlinks = null;
      fieldSetFlags()[3] = false;
      return this;
    }
    
    /** Gets the value of the 'headers' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getHeaders() {
      return headers;
    }
    
    /** Sets the value of the 'headers' field */
    public org.apache.gora.examples.generated.WebPage.Builder setHeaders(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.headers = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'headers' field has been set */
    public boolean hasHeaders() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'headers' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearHeaders() {
      headers = null;
      fieldSetFlags()[4] = false;
      return this;
    }
    
    /** Gets the value of the 'metadata' field */
    public org.apache.gora.examples.generated.Metadata getMetadata() {
      return metadata;
    }
    
    /** Sets the value of the 'metadata' field */
    public org.apache.gora.examples.generated.WebPage.Builder setMetadata(org.apache.gora.examples.generated.Metadata value) {
      validate(fields()[5], value);
      this.metadata = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'metadata' field has been set */
    public boolean hasMetadata() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'metadata' field */
    public org.apache.gora.examples.generated.WebPage.Builder clearMetadata() {
      metadata = null;
      fieldSetFlags()[5] = false;
      return this;
    }
    
    @Override
    public WebPage build() {
      try {
        WebPage record = new WebPage();
        record.url = fieldSetFlags()[0] ? this.url : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.content = fieldSetFlags()[1] ? this.content : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        record.parsedContent = fieldSetFlags()[2] ? this.parsedContent : (java.util.List<java.lang.CharSequence>) new org.apache.gora.persistency.impl.DirtyListWrapper((java.util.List)defaultValue(fields()[2]));
        record.outlinks = fieldSetFlags()[3] ? this.outlinks : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) new org.apache.gora.persistency.impl.DirtyMapWrapper((java.util.Map)defaultValue(fields()[3]));
        record.headers = fieldSetFlags()[4] ? this.headers : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[4]);
        record.metadata = fieldSetFlags()[5] ? this.metadata : (org.apache.gora.examples.generated.Metadata) Metadata.newBuilder().build();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
  
  public WebPage.Tombstone getTombstone(){
  	return TOMBSTONE;
  }

  public WebPage newInstance(){
    return newBuilder().build();
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends WebPage implements org.apache.gora.persistency.Tombstone {
  
      private Tombstone() { }
  
	  		  /**
	   * Gets the value of the 'url' field.
		   */
	  public java.lang.CharSequence getUrl() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'url' field.
		   * @param value the value to set.
	   */
	  public void setUrl(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'url' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isUrlDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'content' field.
		   */
	  public java.nio.ByteBuffer getContent() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'content' field.
		   * @param value the value to set.
	   */
	  public void setContent(java.nio.ByteBuffer value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'content' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isContentDirty(java.nio.ByteBuffer value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'parsedContent' field.
		   */
	  public java.util.List<java.lang.CharSequence> getParsedContent() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'parsedContent' field.
		   * @param value the value to set.
	   */
	  public void setParsedContent(java.util.List<java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'parsedContent' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isParsedContentDirty(java.util.List<java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'outlinks' field.
		   */
	  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getOutlinks() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'outlinks' field.
		   * @param value the value to set.
	   */
	  public void setOutlinks(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'outlinks' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isOutlinksDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'headers' field.
		   */
	  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getHeaders() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'headers' field.
		   * @param value the value to set.
	   */
	  public void setHeaders(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'headers' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isHeadersDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'metadata' field.
		   */
	  public org.apache.gora.examples.generated.Metadata getMetadata() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'metadata' field.
		   * @param value the value to set.
	   */
	  public void setMetadata(org.apache.gora.examples.generated.Metadata value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'metadata' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isMetadataDirty(org.apache.gora.examples.generated.Metadata value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
		  
  }
  
}
