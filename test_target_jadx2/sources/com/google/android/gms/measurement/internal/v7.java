package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class v7 {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.S2 f26417a;

    /* renamed from: b, reason: collision with root package name */
    private Long f26418b;

    /* renamed from: c, reason: collision with root package name */
    private long f26419c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2660e f26420d;

    /* synthetic */ v7(C2660e c2660e, byte[] bArr) {
        Objects.requireNonNull(c2660e);
        this.f26420d = c2660e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d4  */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.gms.internal.measurement.S2 a(String str, com.google.android.gms.internal.measurement.S2 s22) {
        Cursor cursor;
        Pair pair;
        Object obj;
        String F10 = s22.F();
        List C10 = s22.C();
        C2660e c2660e = this.f26420d;
        b7 b7Var = c2660e.f25405b;
        b7Var.K0();
        Long l10 = (Long) g7.u(s22, "_eid");
        if (l10 != null) {
            if (F10.equals("_ep")) {
                AbstractC1287s.m(l10);
                b7Var.K0();
                String str2 = (String) g7.u(s22, "_en");
                ?? r72 = 0;
                if (TextUtils.isEmpty(str2)) {
                    c2660e.f25694a.a().p().b("Extra parameter without an event name. eventId", l10);
                    return null;
                }
                if (this.f26417a == null || this.f26418b == null || l10.longValue() != this.f26418b.longValue()) {
                    C2803w F02 = b7Var.F0();
                    F02.h();
                    F02.j();
                    try {
                        try {
                            cursor = F02.u0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                            } catch (SQLiteException e10) {
                                e = e10;
                                F02.f25694a.a().o().b("Error selecting main event", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            r72 = b7Var;
                            if (r72 != 0) {
                                r72.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        cursor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r72 != 0) {
                        }
                        throw th;
                    }
                    if (cursor.moveToFirst()) {
                        try {
                            pair = Pair.create((com.google.android.gms.internal.measurement.S2) ((com.google.android.gms.internal.measurement.R2) g7.W(com.google.android.gms.internal.measurement.S2.M(), cursor.getBlob(0))).v(), Long.valueOf(cursor.getLong(1)));
                            cursor.close();
                        } catch (IOException e12) {
                            F02.f25694a.a().o().d("Failed to merge main event. appId, eventId", C2.x(str), l10, e12);
                        }
                        if (pair != null || (obj = pair.first) == null) {
                            this.f26420d.f25694a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                            return null;
                        }
                        this.f26417a = (com.google.android.gms.internal.measurement.S2) obj;
                        this.f26419c = ((Long) pair.second).longValue();
                        this.f26420d.f25405b.K0();
                        this.f26418b = (Long) g7.u(this.f26417a, "_eid");
                    } else {
                        F02.f25694a.a().w().a("Main event not found");
                    }
                    cursor.close();
                    pair = null;
                    if (pair != null) {
                    }
                    this.f26420d.f25694a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                    return null;
                }
                long j10 = this.f26419c - 1;
                this.f26419c = j10;
                if (j10 <= 0) {
                    C2803w F03 = this.f26420d.f25405b.F0();
                    F03.h();
                    F03.f25694a.a().w().b("Clearing complex main event info. appId", str);
                    try {
                        F03.u0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        F03.f25694a.a().o().b("Error clearing complex main event", e13);
                    }
                } else {
                    this.f26420d.f25405b.F0().F(str, l10, this.f26419c, this.f26417a);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.W2 w22 : this.f26417a.C()) {
                    this.f26420d.f25405b.K0();
                    if (g7.r(s22, w22.D()) == null) {
                        arrayList.add(w22);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f26420d.f25694a.a().p().b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(C10);
                    C10 = arrayList;
                }
                F10 = str2;
            } else {
                this.f26418b = l10;
                this.f26417a = s22;
                b7Var.K0();
                long longValue = ((Long) g7.v(s22, "_epc", 0L)).longValue();
                this.f26419c = longValue;
                if (longValue <= 0) {
                    c2660e.f25694a.a().p().b("Complex event with zero extra param count. eventName", F10);
                } else {
                    b7Var.F0().F(str, (Long) AbstractC1287s.m(l10), this.f26419c, s22);
                }
            }
        }
        com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) s22.p();
        r22.L(F10);
        r22.H();
        r22.G(C10);
        return (com.google.android.gms.internal.measurement.S2) r22.v();
    }
}
