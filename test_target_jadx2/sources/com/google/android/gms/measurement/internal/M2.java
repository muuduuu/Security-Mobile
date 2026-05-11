package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2301m7;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class M2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25546a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f25547b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f25548c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q2 f25549d;

    public M2(Q2 q22, String str, Bundle bundle) {
        Objects.requireNonNull(q22);
        this.f25549d = q22;
        AbstractC1287s.g(str);
        this.f25546a = str;
        this.f25547b = new Bundle();
    }

    public final Bundle a() {
        char c10;
        if (this.f25548c == null) {
            Q2 q22 = this.f25549d;
            String string = q22.p().getString(this.f25546a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            } else if (hashCode == 108) {
                                if (string3.equals("l")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            } else if (hashCode == 115) {
                                if (string3.equals("s")) {
                                    c10 = 0;
                                }
                                c10 = 65535;
                            } else if (hashCode != 3352) {
                                if (hashCode == 3445 && string3.equals("la")) {
                                    c10 = 4;
                                }
                                c10 = 65535;
                            } else {
                                if (string3.equals("ia")) {
                                    c10 = 3;
                                }
                                c10 = 65535;
                            }
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c10 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (c10 == 3) {
                                C2301m7.a();
                                if (q22.f25694a.w().H(null, AbstractC2671f2.f25970R0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i11 = 0; i11 < length; i11++) {
                                        iArr[i11] = jSONArray2.optInt(i11);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (c10 != 4) {
                                q22.f25694a.a().o().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                C2301m7.a();
                                if (q22.f25694a.w().H(null, AbstractC2671f2.f25970R0)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i12 = 0; i12 < length2; i12++) {
                                        jArr[i12] = jSONArray3.optLong(i12);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f25549d.f25694a.a().o().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f25548c = bundle;
                } catch (JSONException unused2) {
                    this.f25549d.f25694a.a().o().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f25548c == null) {
                this.f25548c = this.f25547b;
            }
        }
        return new Bundle((Bundle) AbstractC1287s.m(this.f25548c));
    }

    public final void b(Bundle bundle) {
        Q2 q22;
        JSONObject jSONObject;
        C2760q3 c2760q3;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Q2 q23 = this.f25549d;
        SharedPreferences.Editor edit = q23.p().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.f25546a);
        } else {
            String str = this.f25546a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        C2301m7.a();
                        c2760q3 = q23.f25694a;
                        q22 = q23;
                    } catch (JSONException e10) {
                        e = e10;
                        q22 = q23;
                    }
                    if (c2760q3.w().H(null, AbstractC2671f2.f25970R0)) {
                        try {
                        } catch (JSONException e11) {
                            e = e11;
                            this.f25549d.f25694a.a().o().b("Cannot serialize bundle value to SharedPreferences", e);
                            q23 = q22;
                        }
                        if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            c2760q3.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            q23 = q22;
                        }
                        jSONArray.put(jSONObject);
                        q23 = q22;
                    } else {
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            c2760q3.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            q23 = q22;
                        }
                        jSONArray.put(jSONObject);
                        q23 = q22;
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f25548c = bundle2;
    }
}
