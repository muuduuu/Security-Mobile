package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesC2258i0 implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    private final Map f24527a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f24528b = new HashSet();

    private final Object c(String str, Object obj) {
        Object obj2 = this.f24527a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    final /* synthetic */ Map a() {
        return this.f24527a;
    }

    final /* synthetic */ Set b() {
        return this.f24528b;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f24527a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC2249h0(this, null);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.f24527a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        return ((Boolean) c(str, Boolean.valueOf(z10))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        return ((Float) c(str, Float.valueOf(f10))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        return ((Integer) c(str, Integer.valueOf(i10))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        return ((Long) c(str, Long.valueOf(j10))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) c(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) c(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f24528b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f24528b.remove(onSharedPreferenceChangeListener);
    }
}
