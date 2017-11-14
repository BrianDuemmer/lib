/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.foobar2000.api;

public class bit_array {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public bit_array(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bit_array obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
  }

  public boolean get(long n) {
    return foobarJNI.bit_array_get(swigCPtr, this, n);
  }

  public long find(boolean val, long start, SWIGTYPE_p_t_ssize count) {
    return foobarJNI.bit_array_find(swigCPtr, this, val, start, SWIGTYPE_p_t_ssize.getCPtr(count));
  }

  public long calc_count(boolean val, long start, long count, long count_max) {
    return foobarJNI.bit_array_calc_count__SWIG_0(swigCPtr, this, val, start, count, count_max);
  }

  public long calc_count(boolean val, long start, long count) {
    return foobarJNI.bit_array_calc_count__SWIG_1(swigCPtr, this, val, start, count);
  }

  public long find_first(boolean val, long start, long max) {
    return foobarJNI.bit_array_find_first(swigCPtr, this, val, start, max);
  }

  public long find_next(boolean val, long previous, long max) {
    return foobarJNI.bit_array_find_next(swigCPtr, this, val, previous, max);
  }

}