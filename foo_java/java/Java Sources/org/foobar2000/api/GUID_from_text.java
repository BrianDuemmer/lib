/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.foobar2000.api;

public class GUID_from_text extends GUID {
  private long swigCPtr;

  public GUID_from_text(long cPtr, boolean cMemoryOwn) {
    super(foobarJNI.SWIGGUID_from_textUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GUID_from_text obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      foobarJNI.delete_GUID_from_text(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public GUID_from_text(String text) {
    this(foobarJNI.new_GUID_from_text(text), true);
  }

}
