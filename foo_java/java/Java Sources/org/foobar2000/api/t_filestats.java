/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.foobar2000.api;

public class t_filestats {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public t_filestats(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(t_filestats obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      foobarJNI.delete_t_filestats(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setM_size(java.math.BigInteger value) {
    foobarJNI.t_filestats_m_size_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getM_size() {
    return foobarJNI.t_filestats_m_size_get(swigCPtr, this);
  }

  public void setM_timestamp(java.math.BigInteger value) {
    foobarJNI.t_filestats_m_timestamp_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getM_timestamp() {
    return foobarJNI.t_filestats_m_timestamp_get(swigCPtr, this);
  }

  public t_filestats() {
    this(foobarJNI.new_t_filestats(), true);
  }

}