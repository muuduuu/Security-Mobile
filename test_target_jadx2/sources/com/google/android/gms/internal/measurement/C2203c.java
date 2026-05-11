package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2203c {

    /* renamed from: a, reason: collision with root package name */
    private C2194b f24463a;

    /* renamed from: b, reason: collision with root package name */
    private C2194b f24464b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24465c;

    public C2203c() {
        this.f24463a = new C2194b(BuildConfig.FLAVOR, 0L, null);
        this.f24464b = new C2194b(BuildConfig.FLAVOR, 0L, null);
        this.f24465c = new ArrayList();
    }

    public final C2194b a() {
        return this.f24463a;
    }

    public final void b(C2194b c2194b) {
        this.f24463a = c2194b;
        this.f24464b = c2194b.clone();
        this.f24465c.clear();
    }

    public final C2194b c() {
        return this.f24464b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C2203c c2203c = new C2203c(this.f24463a.clone());
        Iterator it = this.f24465c.iterator();
        while (it.hasNext()) {
            c2203c.f24465c.add(((C2194b) it.next()).clone());
        }
        return c2203c;
    }

    public final void d(C2194b c2194b) {
        this.f24464b = c2194b;
    }

    public final void e(String str, long j10, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, C2194b.h(str2, this.f24463a.e(str2), map.get(str2)));
        }
        this.f24465c.add(new C2194b(str, j10, hashMap));
    }

    public final List f() {
        return this.f24465c;
    }

    public C2203c(C2194b c2194b) {
        this.f24463a = c2194b;
        this.f24464b = c2194b.clone();
        this.f24465c = new ArrayList();
    }
}
