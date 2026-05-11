package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import j8.C3511e;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Set f28385a;

    /* renamed from: b, reason: collision with root package name */
    private final s f28386b;

    /* renamed from: c, reason: collision with root package name */
    private final m f28387c;

    /* renamed from: d, reason: collision with root package name */
    private final C3511e f28388d;

    /* renamed from: e, reason: collision with root package name */
    private final B8.f f28389e;

    /* renamed from: f, reason: collision with root package name */
    private final f f28390f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f28391g;

    /* renamed from: h, reason: collision with root package name */
    private final String f28392h;

    /* renamed from: i, reason: collision with root package name */
    private final t f28393i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f28394j;

    public class a implements J8.d {

        /* renamed from: a, reason: collision with root package name */
        private final J8.c f28395a;

        public a(J8.c cVar) {
            this.f28395a = cVar;
        }

        @Override // J8.d
        public void remove() {
            p.this.d(this.f28395a);
        }
    }

    public p(C3511e c3511e, B8.f fVar, m mVar, f fVar2, Context context, String str, t tVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f28385a = linkedHashSet;
        this.f28386b = new s(c3511e, fVar, mVar, fVar2, context, str, linkedHashSet, tVar, scheduledExecutorService);
        this.f28388d = c3511e;
        this.f28387c = mVar;
        this.f28389e = fVar;
        this.f28390f = fVar2;
        this.f28391g = context;
        this.f28392h = str;
        this.f28393i = tVar;
        this.f28394j = scheduledExecutorService;
    }

    private synchronized void c() {
        if (!this.f28385a.isEmpty()) {
            this.f28386b.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(J8.c cVar) {
        this.f28385a.remove(cVar);
    }

    public synchronized J8.d b(J8.c cVar) {
        this.f28385a.add(cVar);
        c();
        return new a(cVar);
    }

    public synchronized void e(boolean z10) {
        this.f28386b.B(z10);
        if (!z10) {
            c();
        }
    }
}
