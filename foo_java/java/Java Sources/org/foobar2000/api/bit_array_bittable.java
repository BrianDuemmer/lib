/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.foobar2000.api;

public class bit_array_bittable extends bit_array_var {
  private long swigCPtr;

  public bit_array_bittable(long cPtr, boolean cMemoryOwn) {
    super(foobarJNI.SWIGbit_array_bittableUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bit_array_bittable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      foobarJNI.delete_bit_array_bittable(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public static long g_estimate_size(long p_count) {
    return foobarJNI.bit_array_bittable_g_estimate_size(p_count);
  }

  public void resize(long p_count) {
    foobarJNI.bit_array_bittable_resize(swigCPtr, this, p_count);
  }

  public bit_array_bittable(long p_count) {
    this(foobarJNI.new_bit_array_bittable(p_count), true);
  }

  public void set(long n, boolean val) {
    foobarJNI.bit_array_bittable_set(swigCPtr, this, n, val);
  }

  public boolean get(long n) {
    return foobarJNI.bit_array_bittable_get(swigCPtr, this, n);
  }

}
