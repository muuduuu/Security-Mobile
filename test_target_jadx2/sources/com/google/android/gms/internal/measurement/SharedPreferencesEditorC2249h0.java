package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class SharedPreferencesEditorC2249h0 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    boolean f24516a;

    /* renamed from: b, reason: collision with root package name */
    final Set f24517b;

    /* renamed from: c, reason: collision with root package name */
    final Map f24518c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesC2258i0 f24519d;

    /* synthetic */ SharedPreferencesEditorC2249h0(SharedPreferencesC2258i0 sharedPreferencesC2258i0, byte[] bArr) {
        Objects.requireNonNull(sharedPreferencesC2258i0);
        this.f24519d = sharedPreferencesC2258i0;
        this.f24516a = false;
        this.f24517b = new HashSet();
        this.f24518c = new HashMap();
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f24518c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f24516a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f24516a) {
            this.f24519d.a().clear();
        }
        SharedPreferencesC2258i0 sharedPreferencesC2258i0 = this.f24519d;
        Set set = this.f24517b;
        sharedPreferencesC2258i0.a().keySet().removeAll(set);
        Map map = this.f24518c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC2258i0.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC2258i0.b()) {
            com.google.common.collect.z it = com.google.common.collect.w.c(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC2258i0, (String) it.next());
            }
        }
        return (!this.f24516a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f24517b.add(str);
        return this;
    }
}
