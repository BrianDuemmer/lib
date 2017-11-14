/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.foobar2000.api;

class foobarJNI {
  public final static native boolean abort_callback_is_aborting(long jarg1, abort_callback jarg1_);
  public final static native void abort_callback_check(long jarg1, abort_callback jarg1_);
  public final static native void abort_callback_check_e(long jarg1, abort_callback jarg1_);
  public final static native void abort_callback_sleep(long jarg1, abort_callback jarg1_, double jarg2);
  public final static native boolean abort_callback_sleep_ex(long jarg1, abort_callback jarg1_, double jarg2);
  public final static native long new_abort_callback_impl();
  public final static native void abort_callback_impl_abort(long jarg1, abort_callback_impl jarg1_);
  public final static native void abort_callback_impl_reset(long jarg1, abort_callback_impl jarg1_);
  public final static native void abort_callback_impl_set_state(long jarg1, abort_callback_impl jarg1_, boolean jarg2);
  public final static native boolean abort_callback_impl_is_aborting(long jarg1, abort_callback_impl jarg1_);
  public final static native void delete_abort_callback_impl(long jarg1);
  public final static native String PfcString_toString(long jarg1, PfcString jarg1_);
  public final static native long new_PfcString();
  public final static native void delete_PfcString(long jarg1);
  public final static native void t_filestats_m_size_set(long jarg1, t_filestats jarg1_, java.math.BigInteger jarg2);
  public final static native java.math.BigInteger t_filestats_m_size_get(long jarg1, t_filestats jarg1_);
  public final static native void t_filestats_m_timestamp_set(long jarg1, t_filestats jarg1_, java.math.BigInteger jarg2);
  public final static native java.math.BigInteger t_filestats_m_timestamp_get(long jarg1, t_filestats jarg1_);
  public final static native long new_t_filestats();
  public final static native void delete_t_filestats(long jarg1);
  public final static native boolean bit_array_get(long jarg1, bit_array jarg1_, long jarg2);
  public final static native long bit_array_find(long jarg1, bit_array jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native long bit_array_calc_count__SWIG_0(long jarg1, bit_array jarg1_, boolean jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long bit_array_calc_count__SWIG_1(long jarg1, bit_array jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native long bit_array_find_first(long jarg1, bit_array jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native long bit_array_find_next(long jarg1, bit_array jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native void bit_array_var_set(long jarg1, bit_array_var jarg1_, long jarg2, boolean jarg3);
  public final static native long new_bit_array_range__SWIG_0(long jarg1, long jarg2, boolean jarg3);
  public final static native long new_bit_array_range__SWIG_1(long jarg1, long jarg2);
  public final static native boolean bit_array_range_get(long jarg1, bit_array_range jarg1_, long jarg2);
  public final static native void delete_bit_array_range(long jarg1);
  public final static native long new_bit_array_and(long jarg1, bit_array jarg1_, long jarg2, bit_array jarg2_);
  public final static native boolean bit_array_and_get(long jarg1, bit_array_and jarg1_, long jarg2);
  public final static native void delete_bit_array_and(long jarg1);
  public final static native long new_bit_array_or(long jarg1, bit_array jarg1_, long jarg2, bit_array jarg2_);
  public final static native boolean bit_array_or_get(long jarg1, bit_array_or jarg1_, long jarg2);
  public final static native void delete_bit_array_or(long jarg1);
  public final static native long new_bit_array_xor(long jarg1, bit_array jarg1_, long jarg2, bit_array jarg2_);
  public final static native boolean bit_array_xor_get(long jarg1, bit_array_xor jarg1_, long jarg2);
  public final static native void delete_bit_array_xor(long jarg1);
  public final static native long new_bit_array_not(long jarg1, bit_array jarg1_);
  public final static native boolean bit_array_not_get(long jarg1, bit_array_not jarg1_, long jarg2);
  public final static native long bit_array_not_find(long jarg1, bit_array_not jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native void delete_bit_array_not(long jarg1);
  public final static native boolean bit_array_true_get(long jarg1, bit_array_true jarg1_, long jarg2);
  public final static native long bit_array_true_find(long jarg1, bit_array_true jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native long new_bit_array_true();
  public final static native void delete_bit_array_true(long jarg1);
  public final static native boolean bit_array_false_get(long jarg1, bit_array_false jarg1_, long jarg2);
  public final static native long bit_array_false_find(long jarg1, bit_array_false jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native long new_bit_array_false();
  public final static native void delete_bit_array_false(long jarg1);
  public final static native long new_bit_array_val(boolean jarg1);
  public final static native boolean bit_array_val_get(long jarg1, bit_array_val jarg1_, long jarg2);
  public final static native long bit_array_val_find(long jarg1, bit_array_val jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native void delete_bit_array_val(long jarg1);
  public final static native long new_bit_array_one(long jarg1);
  public final static native boolean bit_array_one_get(long jarg1, bit_array_one jarg1_, long jarg2);
  public final static native long bit_array_one_find(long jarg1, bit_array_one jarg1_, boolean jarg2, long jarg3, long jarg4);
  public final static native void delete_bit_array_one(long jarg1);
  public final static native long bit_array_bittable_g_estimate_size(long jarg1);
  public final static native void bit_array_bittable_resize(long jarg1, bit_array_bittable jarg1_, long jarg2);
  public final static native long new_bit_array_bittable(long jarg1);
  public final static native void bit_array_bittable_set(long jarg1, bit_array_bittable jarg1_, long jarg2, boolean jarg3);
  public final static native boolean bit_array_bittable_get(long jarg1, bit_array_bittable jarg1_, long jarg2);
  public final static native void delete_bit_array_bittable(long jarg1);
  public final static native long new_bit_array_order_changed(long jarg1);
  public final static native boolean bit_array_order_changed_get(long jarg1, bit_array_order_changed jarg1_, long jarg2);
  public final static native void delete_bit_array_order_changed(long jarg1);
  public final static native void replaygain_info_m_album_gain_set(long jarg1, replaygain_info jarg1_, float jarg2);
  public final static native float replaygain_info_m_album_gain_get(long jarg1, replaygain_info jarg1_);
  public final static native void replaygain_info_m_track_gain_set(long jarg1, replaygain_info jarg1_, float jarg2);
  public final static native float replaygain_info_m_track_gain_get(long jarg1, replaygain_info jarg1_);
  public final static native void replaygain_info_m_album_peak_set(long jarg1, replaygain_info jarg1_, float jarg2);
  public final static native float replaygain_info_m_album_peak_get(long jarg1, replaygain_info jarg1_);
  public final static native void replaygain_info_m_track_peak_set(long jarg1, replaygain_info jarg1_, float jarg2);
  public final static native float replaygain_info_m_track_peak_get(long jarg1, replaygain_info jarg1_);
  public final static native int replaygain_info_text_buffer_size_get();
  public final static native int replaygain_info_peak_invalid_get();
  public final static native int replaygain_info_gain_invalid_get();
  public final static native boolean replaygain_info_g_format_gain(float jarg1, String jarg2);
  public final static native boolean replaygain_info_g_format_peak(float jarg1, String jarg2);
  public final static native boolean replaygain_info_format_album_gain(long jarg1, replaygain_info jarg1_, String jarg2);
  public final static native boolean replaygain_info_format_track_gain(long jarg1, replaygain_info jarg1_, String jarg2);
  public final static native boolean replaygain_info_format_album_peak(long jarg1, replaygain_info jarg1_, String jarg2);
  public final static native boolean replaygain_info_format_track_peak(long jarg1, replaygain_info jarg1_, String jarg2);
  public final static native void replaygain_info_set_album_gain_text__SWIG_0(long jarg1, replaygain_info jarg1_, String jarg2, long jarg3);
  public final static native void replaygain_info_set_album_gain_text__SWIG_1(long jarg1, replaygain_info jarg1_, String jarg2);
  public final static native void replaygain_info_set_track_gain_text__SWIG_0(long jarg1, replaygain_info jarg1_, String jarg2, long jarg3);
  public final static native void replaygain_info_set_track_gain_text__SWIG_1(long jarg1, replaygain_info jarg1_, String jarg2);
  public final static native void replaygain_info_set_album_peak_text__SWIG_0(long jarg1, replaygain_info jarg1_, String jarg2, long jarg3);
  public final static native void replaygain_info_set_album_peak_text__SWIG_1(long jarg1, replaygain_info jarg1_, String jarg2);
  public final static native void replaygain_info_set_track_peak_text__SWIG_0(long jarg1, replaygain_info jarg1_, String jarg2, long jarg3);
  public final static native void replaygain_info_set_track_peak_text__SWIG_1(long jarg1, replaygain_info jarg1_, String jarg2);
  public final static native boolean replaygain_info_g_is_meta_replaygain__SWIG_0(String jarg1, long jarg2);
  public final static native boolean replaygain_info_g_is_meta_replaygain__SWIG_1(String jarg1);
  public final static native boolean replaygain_info_set_from_meta_ex(long jarg1, replaygain_info jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native boolean replaygain_info_set_from_meta(long jarg1, replaygain_info jarg1_, String jarg2, String jarg3);
  public final static native boolean replaygain_info_is_album_gain_present(long jarg1, replaygain_info jarg1_);
  public final static native boolean replaygain_info_is_track_gain_present(long jarg1, replaygain_info jarg1_);
  public final static native boolean replaygain_info_is_album_peak_present(long jarg1, replaygain_info jarg1_);
  public final static native boolean replaygain_info_is_track_peak_present(long jarg1, replaygain_info jarg1_);
  public final static native void replaygain_info_remove_album_gain(long jarg1, replaygain_info jarg1_);
  public final static native void replaygain_info_remove_track_gain(long jarg1, replaygain_info jarg1_);
  public final static native void replaygain_info_remove_album_peak(long jarg1, replaygain_info jarg1_);
  public final static native void replaygain_info_remove_track_peak(long jarg1, replaygain_info jarg1_);
  public final static native long replaygain_info_get_value_count(long jarg1, replaygain_info jarg1_);
  public final static native long replaygain_info_g_merge(long jarg1, replaygain_info jarg1_, long jarg2, replaygain_info jarg2_);
  public final static native boolean replaygain_info_g_equal(long jarg1, replaygain_info jarg1_, long jarg2, replaygain_info jarg2_);
  public final static native void replaygain_info_reset(long jarg1, replaygain_info jarg1_);
  public final static native long new_replaygain_info();
  public final static native void delete_replaygain_info(long jarg1);
  public final static native long replaygain_info_invalid_get();
  public final static native double file_info_get_length(long jarg1, file_info jarg1_);
  public final static native void file_info_set_length(long jarg1, file_info jarg1_, double jarg2);
  public final static native void file_info_set_replaygain(long jarg1, file_info jarg1_, long jarg2, replaygain_info jarg2_);
  public final static native long file_info_get_replaygain(long jarg1, file_info jarg1_);
  public final static native long file_info_meta_get_count(long jarg1, file_info jarg1_);
  public final static native String file_info_meta_enum_name(long jarg1, file_info jarg1_, long jarg2);
  public final static native long file_info_meta_enum_value_count(long jarg1, file_info jarg1_, long jarg2);
  public final static native String file_info_meta_enum_value(long jarg1, file_info jarg1_, long jarg2, long jarg3);
  public final static native long file_info_meta_find_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native long file_info_meta_set_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void file_info_meta_insert_value_ex(long jarg1, file_info jarg1_, long jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void file_info_meta_remove_mask(long jarg1, file_info jarg1_, long jarg2, bit_array jarg2_);
  public final static native void file_info_meta_reorder(long jarg1, file_info jarg1_, long jarg2);
  public final static native void file_info_meta_remove_values(long jarg1, file_info jarg1_, long jarg2, long jarg3, bit_array jarg3_);
  public final static native void file_info_meta_modify_value_ex(long jarg1, file_info jarg1_, long jarg2, long jarg3, String jarg4, long jarg5);
  public final static native long file_info_info_get_count(long jarg1, file_info jarg1_);
  public final static native String file_info_info_enum_name(long jarg1, file_info jarg1_, long jarg2);
  public final static native String file_info_info_enum_value(long jarg1, file_info jarg1_, long jarg2);
  public final static native long file_info_info_set_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void file_info_info_remove_mask(long jarg1, file_info jarg1_, long jarg2, bit_array jarg2_);
  public final static native long file_info_info_find_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native void file_info_copy(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_);
  public final static native void file_info_copy_meta(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_);
  public final static native void file_info_copy_info(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_);
  public final static native boolean file_info_meta_exists_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native void file_info_meta_remove_field_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native void file_info_meta_remove_index(long jarg1, file_info jarg1_, long jarg2);
  public final static native void file_info_meta_remove_all(long jarg1, file_info jarg1_);
  public final static native void file_info_meta_remove_value(long jarg1, file_info jarg1_, long jarg2, long jarg3);
  public final static native String file_info_meta_get_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3, long jarg4);
  public final static native long file_info_meta_get_count_by_name_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native void file_info_meta_add_value_ex(long jarg1, file_info jarg1_, long jarg2, String jarg3, long jarg4);
  public final static native long file_info_meta_add_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native long file_info_meta_calc_total_value_count(long jarg1, file_info jarg1_);
  public final static native boolean file_info_meta_format(long jarg1, file_info jarg1_, String jarg2, PfcString jarg3);
  public final static native boolean file_info_info_exists_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native void file_info_info_remove_index(long jarg1, file_info jarg1_, long jarg2);
  public final static native void file_info_info_remove_all(long jarg1, file_info jarg1_);
  public final static native boolean file_info_info_remove_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native String file_info_info_get_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native long file_info_meta_find(long jarg1, file_info jarg1_, String jarg2);
  public final static native boolean file_info_meta_exists(long jarg1, file_info jarg1_, String jarg2);
  public final static native void file_info_meta_remove_field(long jarg1, file_info jarg1_, String jarg2);
  public final static native long file_info_meta_set(long jarg1, file_info jarg1_, String jarg2, String jarg3);
  public final static native void file_info_meta_insert_value(long jarg1, file_info jarg1_, long jarg2, long jarg3, String jarg4);
  public final static native void file_info_meta_add_value(long jarg1, file_info jarg1_, long jarg2, String jarg3);
  public final static native String file_info_meta_get(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native long file_info_meta_get_count_by_name(long jarg1, file_info jarg1_, String jarg2);
  public final static native long file_info_meta_add(long jarg1, file_info jarg1_, String jarg2, String jarg3);
  public final static native void file_info_meta_modify_value(long jarg1, file_info jarg1_, long jarg2, long jarg3, String jarg4);
  public final static native long file_info_info_set(long jarg1, file_info jarg1_, String jarg2, String jarg3);
  public final static native long file_info_info_find(long jarg1, file_info jarg1_, String jarg2);
  public final static native long file_info_info_exists(long jarg1, file_info jarg1_, String jarg2);
  public final static native boolean file_info_info_remove(long jarg1, file_info jarg1_, String jarg2);
  public final static native String file_info_info_get(long jarg1, file_info jarg1_, String jarg2);
  public final static native boolean file_info_info_set_replaygain_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native boolean file_info_info_set_replaygain(long jarg1, file_info jarg1_, String jarg2, String jarg3);
  public final static native void file_info_info_set_replaygain_auto_ex(long jarg1, file_info jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void file_info_info_set_replaygain_auto(long jarg1, file_info jarg1_, String jarg2, String jarg3);
  public final static native void file_info_copy_meta_single(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_, long jarg3);
  public final static native void file_info_copy_info_single(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_, long jarg3);
  public final static native void file_info_copy_meta_single_by_name_ex(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_, String jarg3, long jarg4);
  public final static native void file_info_copy_info_single_by_name_ex(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_, String jarg3, long jarg4);
  public final static native void file_info_copy_meta_single_by_name(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_, String jarg3);
  public final static native void file_info_copy_info_single_by_name(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_, String jarg3);
  public final static native void file_info_reset(long jarg1, file_info jarg1_);
  public final static native void file_info_reset_replaygain(long jarg1, file_info jarg1_);
  public final static native void file_info_copy_meta_single_rename_ex(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_, long jarg3, String jarg4, long jarg5);
  public final static native void file_info_copy_meta_single_rename(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_, long jarg3, String jarg4);
  public final static native void file_info_overwrite_info(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_);
  public final static native long file_info_info_get_int(long jarg1, file_info jarg1_, String jarg2);
  public final static native long file_info_info_get_length_samples(long jarg1, file_info jarg1_);
  public final static native double file_info_info_get_float(long jarg1, file_info jarg1_, String jarg2);
  public final static native void file_info_info_set_int(long jarg1, file_info jarg1_, String jarg2, long jarg3);
  public final static native void file_info_info_set_float__SWIG_0(long jarg1, file_info jarg1_, String jarg2, double jarg3, long jarg4, boolean jarg5, String jarg6);
  public final static native void file_info_info_set_float__SWIG_1(long jarg1, file_info jarg1_, String jarg2, double jarg3, long jarg4, boolean jarg5);
  public final static native void file_info_info_set_float__SWIG_2(long jarg1, file_info jarg1_, String jarg2, double jarg3, long jarg4);
  public final static native void file_info_info_set_replaygain_track_gain(long jarg1, file_info jarg1_, float jarg2);
  public final static native void file_info_info_set_replaygain_album_gain(long jarg1, file_info jarg1_, float jarg2);
  public final static native void file_info_info_set_replaygain_track_peak(long jarg1, file_info jarg1_, float jarg2);
  public final static native void file_info_info_set_replaygain_album_peak(long jarg1, file_info jarg1_, float jarg2);
  public final static native long file_info_info_get_bitrate_vbr(long jarg1, file_info jarg1_);
  public final static native void file_info_info_set_bitrate_vbr(long jarg1, file_info jarg1_, long jarg2);
  public final static native long file_info_info_get_bitrate(long jarg1, file_info jarg1_);
  public final static native void file_info_info_set_bitrate(long jarg1, file_info jarg1_, long jarg2);
  public final static native boolean file_info_is_encoding_lossy(long jarg1, file_info jarg1_);
  public final static native void file_info_info_calculate_bitrate(long jarg1, file_info jarg1_, java.math.BigInteger jarg2, double jarg3);
  public final static native long file_info_info_get_decoded_bps(long jarg1, file_info jarg1_);
  public final static native void file_info_merge(long jarg1, file_info jarg1_, java.util.Vector<file_info> jarg2);
  public final static native boolean file_info_are_meta_fields_identical(long jarg1, file_info jarg1_, long jarg2, long jarg3);
  public final static native boolean file_info_g_is_meta_equal(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_);
  public final static native boolean file_info_g_is_info_equal(long jarg1, file_info jarg1_, long jarg2, file_info jarg2_);
  public final static native long info_storage_add_item(long jarg1, info_storage jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void info_storage_remove_mask(long jarg1, info_storage jarg1_, long jarg2, bit_array jarg2_);
  public final static native long info_storage_get_count(long jarg1, info_storage jarg1_);
  public final static native String info_storage_get_name(long jarg1, info_storage jarg1_, long jarg2);
  public final static native String info_storage_get_value(long jarg1, info_storage jarg1_, long jarg2);
  public final static native void info_storage_copy_from(long jarg1, info_storage jarg1_, long jarg2, file_info jarg2_);
  public final static native void delete_info_storage(long jarg1);
  public final static native long new_info_storage();
  public final static native long new_meta_storage();
  public final static native void delete_meta_storage(long jarg1);
  public final static native long meta_storage_add_entry(long jarg1, meta_storage jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void meta_storage_insert_value(long jarg1, meta_storage jarg1_, long jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void meta_storage_modify_value(long jarg1, meta_storage jarg1_, long jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void meta_storage_remove_values(long jarg1, meta_storage jarg1_, long jarg2, long jarg3, bit_array jarg3_);
  public final static native void meta_storage_remove_mask(long jarg1, meta_storage jarg1_, long jarg2, bit_array jarg2_);
  public final static native void meta_storage_copy_from(long jarg1, meta_storage jarg1_, long jarg2, file_info jarg2_);
  public final static native void meta_storage_reorder(long jarg1, meta_storage jarg1_, long jarg2);
  public final static native long meta_storage_get_count(long jarg1, meta_storage jarg1_);
  public final static native String meta_storage_get_name(long jarg1, meta_storage jarg1_, long jarg2);
  public final static native String meta_storage_get_value(long jarg1, meta_storage jarg1_, long jarg2, long jarg3);
  public final static native long meta_storage_get_value_count(long jarg1, meta_storage jarg1_, long jarg2);
  public final static native long new_file_info_impl__SWIG_0(long jarg1, file_info_impl jarg1_);
  public final static native long new_file_info_impl__SWIG_1(long jarg1, file_info jarg1_);
  public final static native long new_file_info_impl__SWIG_2();
  public final static native void delete_file_info_impl(long jarg1);
  public final static native double file_info_impl_get_length(long jarg1, file_info_impl jarg1_);
  public final static native void file_info_impl_set_length(long jarg1, file_info_impl jarg1_, double jarg2);
  public final static native void file_info_impl_copy_meta(long jarg1, file_info_impl jarg1_, long jarg2, file_info jarg2_);
  public final static native void file_info_impl_copy_info(long jarg1, file_info_impl jarg1_, long jarg2, file_info jarg2_);
  public final static native long file_info_impl_meta_get_count(long jarg1, file_info_impl jarg1_);
  public final static native String file_info_impl_meta_enum_name(long jarg1, file_info_impl jarg1_, long jarg2);
  public final static native long file_info_impl_meta_enum_value_count(long jarg1, file_info_impl jarg1_, long jarg2);
  public final static native String file_info_impl_meta_enum_value(long jarg1, file_info_impl jarg1_, long jarg2, long jarg3);
  public final static native long file_info_impl_meta_set_ex(long jarg1, file_info_impl jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void file_info_impl_meta_insert_value_ex(long jarg1, file_info_impl jarg1_, long jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void file_info_impl_meta_remove_mask(long jarg1, file_info_impl jarg1_, long jarg2, bit_array jarg2_);
  public final static native void file_info_impl_meta_reorder(long jarg1, file_info_impl jarg1_, long jarg2);
  public final static native void file_info_impl_meta_remove_values(long jarg1, file_info_impl jarg1_, long jarg2, long jarg3, bit_array jarg3_);
  public final static native void file_info_impl_meta_modify_value_ex(long jarg1, file_info_impl jarg1_, long jarg2, long jarg3, String jarg4, long jarg5);
  public final static native long file_info_impl_info_get_count(long jarg1, file_info_impl jarg1_);
  public final static native String file_info_impl_info_enum_name(long jarg1, file_info_impl jarg1_, long jarg2);
  public final static native String file_info_impl_info_enum_value(long jarg1, file_info_impl jarg1_, long jarg2);
  public final static native long file_info_impl_info_set_ex(long jarg1, file_info_impl jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native void file_info_impl_info_remove_mask(long jarg1, file_info_impl jarg1_, long jarg2, bit_array jarg2_);
  public final static native long file_info_impl_get_replaygain(long jarg1, file_info_impl jarg1_);
  public final static native void file_info_impl_set_replaygain(long jarg1, file_info_impl jarg1_, long jarg2, replaygain_info jarg2_);
  public final static native void metadb_handle_metadb_lock(long jarg1, metadb_handle jarg1_);
  public final static native void metadb_handle_metadb_unlock(long jarg1, metadb_handle jarg1_);
  public final static native long metadb_handle_get_filestats(long jarg1, metadb_handle jarg1_);
  public final static native boolean metadb_handle_is_info_loaded(long jarg1, metadb_handle jarg1_);
  public final static native boolean metadb_handle_get_info(long jarg1, metadb_handle jarg1_, long jarg2, file_info jarg2_);
  public final static native boolean metadb_handle_get_info_locked(long jarg1, metadb_handle jarg1_, long jarg2);
  public final static native boolean metadb_handle_is_info_loaded_async(long jarg1, metadb_handle jarg1_);
  public final static native boolean metadb_handle_get_info_async(long jarg1, metadb_handle jarg1_, long jarg2, file_info jarg2_);
  public final static native boolean metadb_handle_get_info_async_locked(long jarg1, metadb_handle jarg1_, long jarg2);
  public final static native boolean metadb_handle_g_should_reload(long jarg1, t_filestats jarg1_, long jarg2, t_filestats jarg2_, boolean jarg3);
  public final static native boolean metadb_handle_should_reload(long jarg1, metadb_handle jarg1_, long jarg2, t_filestats jarg2_, boolean jarg3);
  public final static native String metadb_handle_get_path(long jarg1, metadb_handle jarg1_);
  public final static native long metadb_handle_get_subsong_index(long jarg1, metadb_handle jarg1_);
  public final static native double metadb_handle_get_length(long jarg1, metadb_handle jarg1_);
  public final static native java.math.BigInteger metadb_handle_get_filetimestamp(long jarg1, metadb_handle jarg1_);
  public final static native java.math.BigInteger metadb_handle_get_filesize(long jarg1, metadb_handle jarg1_);
  public final static native void metadb_io_test2(long jarg1, metadb_io jarg1_, PfcString jarg2);
  public final static native boolean metadb_io_is_busy(long jarg1, metadb_io jarg1_);
  public final static native boolean metadb_io_is_updating_disabled(long jarg1, metadb_io jarg1_);
  public final static native boolean metadb_io_is_file_updating_blocked(long jarg1, metadb_io jarg1_);
  public final static native void metadb_io_highlight_running_process(long jarg1, metadb_io jarg1_);
  public final static native int metadb_io_load_info_multi(long jarg1, metadb_io jarg1_, java.util.Vector<metadb_handle> jarg2, int jarg3, int jarg4, boolean jarg5);
  public final static native int metadb_io_update_info_multi(long jarg1, metadb_io jarg1_, java.util.Vector<metadb_handle> jarg2, java.util.Vector<file_info> jarg3, int jarg4, boolean jarg5);
  public final static native int metadb_io_rewrite_info_multi(long jarg1, metadb_io jarg1_, java.util.Vector<metadb_handle> jarg2, int jarg3, boolean jarg4);
  public final static native int metadb_io_remove_info_multi(long jarg1, metadb_io jarg1_, java.util.Vector<metadb_handle> jarg2, int jarg3, boolean jarg4);
  public final static native void metadb_io_hint_multi(long jarg1, metadb_io jarg1_, java.util.Vector<metadb_handle> jarg2, java.util.Vector<file_info> jarg3, java.util.Vector<t_filestats> jarg4, long jarg5, bit_array jarg5_);
  public final static native void metadb_io_hint_multi_async(long jarg1, metadb_io jarg1_, java.util.Vector<metadb_handle> jarg2, java.util.Vector<file_info> jarg3, java.util.Vector<t_filestats> jarg4, long jarg5, bit_array jarg5_);
  public final static native void metadb_io_dispatch_refresh(long jarg1, metadb_io jarg1_, java.util.Vector<metadb_handle> jarg2);
  public final static native void metadb_io_hint_async(long jarg1, metadb_io jarg1_, long jarg2, metadb_handle jarg2_, long jarg3, file_info jarg3_, long jarg4, t_filestats jarg4_, boolean jarg5);
  public final static native int metadb_io_load_info(long jarg1, metadb_io jarg1_, long jarg2, metadb_handle jarg2_, int jarg3, int jarg4, boolean jarg5);
  public final static native int metadb_io_update_info(long jarg1, metadb_io jarg1_, long jarg2, metadb_handle jarg2_, long jarg3, file_info jarg3_, int jarg4, boolean jarg5);
  public final static native int playback_control_stop_reason_user_get();
  public final static native int playback_control_track_command_default_get();
  public final static native boolean playback_control_get_now_playing(long jarg1, playback_control jarg1_, long jarg2);
  public final static native void playback_control_start__SWIG_0(long jarg1, playback_control jarg1_, int jarg2, boolean jarg3);
  public final static native void playback_control_start__SWIG_1(long jarg1, playback_control jarg1_, int jarg2);
  public final static native void playback_control_start__SWIG_2(long jarg1, playback_control jarg1_);
  public final static native void playback_control_stop(long jarg1, playback_control jarg1_);
  public final static native boolean playback_control_is_playing(long jarg1, playback_control jarg1_);
  public final static native boolean playback_control_is_paused(long jarg1, playback_control jarg1_);
  public final static native void playback_control_pause(long jarg1, playback_control jarg1_, boolean jarg2);
  public final static native boolean playback_control_get_stop_after_current(long jarg1, playback_control jarg1_);
  public final static native void playback_control_set_stop_after_current(long jarg1, playback_control jarg1_, boolean jarg2);
  public final static native void playback_control_set_volume(long jarg1, playback_control jarg1_, float jarg2);
  public final static native float playback_control_get_volume(long jarg1, playback_control jarg1_);
  public final static native void playback_control_volume_up(long jarg1, playback_control jarg1_);
  public final static native void playback_control_volume_down(long jarg1, playback_control jarg1_);
  public final static native void playback_control_volume_mute_toggle(long jarg1, playback_control jarg1_);
  public final static native void playback_control_playback_seek(long jarg1, playback_control jarg1_, double jarg2);
  public final static native void playback_control_playback_seek_delta(long jarg1, playback_control jarg1_, double jarg2);
  public final static native boolean playback_control_playback_can_seek(long jarg1, playback_control jarg1_);
  public final static native double playback_control_playback_get_position(long jarg1, playback_control jarg1_);
  public final static native double playback_control_playback_get_length(long jarg1, playback_control jarg1_);
  public final static native void playback_control_toggle_stop_after_current(long jarg1, playback_control jarg1_);
  public final static native void playback_control_toggle_pause(long jarg1, playback_control jarg1_);
  public final static native void playback_control_play_or_pause(long jarg1, playback_control jarg1_);
  public final static native void GUID_Data1_set(long jarg1, GUID jarg1_, long jarg2);
  public final static native long GUID_Data1_get(long jarg1, GUID jarg1_);
  public final static native void GUID_Data2_set(long jarg1, GUID jarg1_, int jarg2);
  public final static native int GUID_Data2_get(long jarg1, GUID jarg1_);
  public final static native void GUID_Data3_set(long jarg1, GUID jarg1_, int jarg2);
  public final static native int GUID_Data3_get(long jarg1, GUID jarg1_);
  public final static native void GUID_Data4_set(long jarg1, GUID jarg1_, long jarg2);
  public final static native long GUID_Data4_get(long jarg1, GUID jarg1_);
  public final static native long new_GUID();
  public final static native void delete_GUID(long jarg1);
  public final static native long new_GUID_from_text(String jarg1);
  public final static native void delete_GUID_from_text(long jarg1);
  public final static native long SWIGabort_callback_implUpcast(long jarg1);
  public final static native long SWIGbit_array_varUpcast(long jarg1);
  public final static native long SWIGbit_array_rangeUpcast(long jarg1);
  public final static native long SWIGbit_array_andUpcast(long jarg1);
  public final static native long SWIGbit_array_orUpcast(long jarg1);
  public final static native long SWIGbit_array_xorUpcast(long jarg1);
  public final static native long SWIGbit_array_notUpcast(long jarg1);
  public final static native long SWIGbit_array_trueUpcast(long jarg1);
  public final static native long SWIGbit_array_falseUpcast(long jarg1);
  public final static native long SWIGbit_array_valUpcast(long jarg1);
  public final static native long SWIGbit_array_oneUpcast(long jarg1);
  public final static native long SWIGbit_array_bittableUpcast(long jarg1);
  public final static native long SWIGbit_array_order_changedUpcast(long jarg1);
  public final static native long SWIGfile_info_implUpcast(long jarg1);
  public final static native long SWIGGUID_from_textUpcast(long jarg1);
}