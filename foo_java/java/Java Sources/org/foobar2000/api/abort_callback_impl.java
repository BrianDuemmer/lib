/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.foobar2000.api;

public class abort_callback_impl extends abort_callback {
  private long swigCPtr;

  public abort_callback_impl(long cPtr, boolean cMemoryOwn) {
    super(foobarJNI.SWIGabort_callback_implUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(abort_callback_impl obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      foobarJNI.delete_abort_callback_impl(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public abort_callback_impl() {
    this(foobarJNI.new_abort_callback_impl(), true);
  }

  public void abort() {
    foobarJNI.abort_callback_impl_abort(swigCPtr, this);
  }

  public void reset() {
    foobarJNI.abort_callback_impl_reset(swigCPtr, this);
  }

  public void set_state(boolean p_state) {
    foobarJNI.abort_callback_impl_set_state(swigCPtr, this, p_state);
  }

  public boolean is_aborting() {
    return foobarJNI.abort_callback_impl_is_aborting(swigCPtr, this);
  }

}