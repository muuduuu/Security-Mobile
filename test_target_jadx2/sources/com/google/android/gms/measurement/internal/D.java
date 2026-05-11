package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    final String f25346a;

    /* renamed from: b, reason: collision with root package name */
    final String f25347b;

    /* renamed from: c, reason: collision with root package name */
    final String f25348c;

    /* renamed from: d, reason: collision with root package name */
    final long f25349d;

    /* renamed from: e, reason: collision with root package name */
    final long f25350e;

    /* renamed from: f, reason: collision with root package name */
    final G f25351f;

    D(C2760q3 c2760q3, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        G g10;
        AbstractC1287s.g(str2);
        AbstractC1287s.g(str3);
        this.f25346a = str2;
        this.f25347b = str3;
        this.f25348c = true == TextUtils.isEmpty(str) ? null : str;
        this.f25349d = j10;
        this.f25350e = j11;
        if (j11 != 0 && j11 > j10) {
            c2760q3.a().r().b("Event created with reverse previous/current timestamps. appId", C2.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            g10 = new G(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c2760q3.a().o().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s10 = c2760q3.C().s(next, bundle2.get(next));
                    if (s10 == null) {
                        c2760q3.a().r().b("Param value can't be null", c2760q3.D().b(next));
                        it.remove();
                    } else {
                        c2760q3.C().A(bundle2, next, s10);
                    }
                }
            }
            g10 = new G(bundle2);
        }
        this.f25351f = g10;
    }

    final D a(C2760q3 c2760q3, long j10) {
        return new D(c2760q3, this.f25348c, this.f25346a, this.f25347b, this.f25349d, j10, this.f25351f);
    }

    public final String toString() {
        String obj = this.f25351f.toString();
        String str = this.f25346a;
        int length = String.valueOf(str).length();
        String str2 = this.f25347b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + obj.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }

    private D(C2760q3 c2760q3, String str, String str2, String str3, long j10, long j11, G g10) {
        AbstractC1287s.g(str2);
        AbstractC1287s.g(str3);
        AbstractC1287s.m(g10);
        this.f25346a = str2;
        this.f25347b = str3;
        this.f25348c = true == TextUtils.isEmpty(str) ? null : str;
        this.f25349d = j10;
        this.f25350e = j11;
        if (j11 != 0 && j11 > j10) {
            c2760q3.a().r().c("Event created with reverse previous/current timestamps. appId, name", C2.x(str2), C2.x(str3));
        }
        this.f25351f = g10;
    }
}
