package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2787u {

    /* renamed from: a, reason: collision with root package name */
    private final String f26365a;

    /* renamed from: b, reason: collision with root package name */
    private long f26366b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2803w f26367c;

    public C2787u(C2803w c2803w, String str) {
        Objects.requireNonNull(c2803w);
        this.f26367c = c2803w;
        AbstractC1287s.g(str);
        this.f26365a = str;
        this.f26366b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f26367c.u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f26365a, String.valueOf(this.f26366b)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j10 = cursor.getLong(0);
                        long j11 = cursor.getLong(3);
                        boolean z10 = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j10 > this.f26366b) {
                            this.f26366b = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) g7.W(com.google.android.gms.internal.measurement.S2.M(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = BuildConfig.FLAVOR;
                            }
                            r22.L(string);
                            r22.O(cursor.getLong(2));
                            arrayList.add(new C2779t(j10, j11, z10, (com.google.android.gms.internal.measurement.S2) r22.v()));
                        } catch (IOException e10) {
                            this.f26367c.f25694a.a().o().c("Data loss. Failed to merge raw event. appId", C2.x(this.f26365a), e10);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.emptyList();
                }
            } catch (SQLiteException e11) {
                this.f26367c.f25694a.a().o().c("Data loss. Error querying raw events batch. appId", C2.x(this.f26365a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public C2787u(C2803w c2803w, String str, long j10) {
        Objects.requireNonNull(c2803w);
        this.f26367c = c2803w;
        AbstractC1287s.g(str);
        this.f26365a = str;
        this.f26366b = c2803w.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
