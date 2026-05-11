package com.google.firebase.installations;

import D7.AbstractC0789m;
import D7.C0787k;
import D8.d;
import D8.f;
import V6.AbstractC1287s;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.d;
import j8.C3511e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o8.w;

/* loaded from: classes2.dex */
public class c implements B8.f {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f28018m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f28019n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final C3511e f28020a;

    /* renamed from: b, reason: collision with root package name */
    private final D8.c f28021b;

    /* renamed from: c, reason: collision with root package name */
    private final C8.c f28022c;

    /* renamed from: d, reason: collision with root package name */
    private final i f28023d;

    /* renamed from: e, reason: collision with root package name */
    private final w f28024e;

    /* renamed from: f, reason: collision with root package name */
    private final B8.h f28025f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f28026g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f28027h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f28028i;

    /* renamed from: j, reason: collision with root package name */
    private String f28029j;

    /* renamed from: k, reason: collision with root package name */
    private Set f28030k;

    /* renamed from: l, reason: collision with root package name */
    private final List f28031l;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f28032a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f28032a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28033a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28034b;

        static {
            int[] iArr = new int[f.b.values().length];
            f28034b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28034b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28034b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f28033a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28033a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final C3511e c3511e, A8.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c3511e, new D8.c(c3511e.l(), bVar), new C8.c(c3511e), i.c(), new w(new A8.b() { // from class: B8.a
            @Override // A8.b
            public final Object get() {
                C8.b B10;
                B10 = com.google.firebase.installations.c.B(C3511e.this);
                return B10;
            }
        }), new B8.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C8.b B(C3511e c3511e) {
        return new C8.b(c3511e);
    }

    private void C() {
        AbstractC1287s.h(p(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1287s.h(w(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1287s.h(o(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1287s.b(i.h(p()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC1287s.b(i.g(o()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String D(C8.d dVar) {
        if ((!this.f28020a.p().equals("CHIME_ANDROID_SDK") && !this.f28020a.x()) || !dVar.m()) {
            return this.f28025f.a();
        }
        String f10 = r().f();
        return TextUtils.isEmpty(f10) ? this.f28025f.a() : f10;
    }

    private C8.d E(C8.d dVar) {
        D8.d d10 = this.f28021b.d(o(), dVar.d(), w(), p(), (dVar.d() == null || dVar.d().length() != 11) ? null : r().i());
        int i10 = b.f28033a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f28023d.b(), d10.b().c(), d10.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void F(Exception exc) {
        synchronized (this.f28026g) {
            try {
                Iterator it = this.f28031l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void G(C8.d dVar) {
        synchronized (this.f28026g) {
            try {
                Iterator it = this.f28031l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void H(String str) {
        this.f28029j = str;
    }

    private synchronized void I(C8.d dVar, C8.d dVar2) {
        if (this.f28030k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f28030k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    private Task g() {
        C0787k c0787k = new C0787k();
        i(new e(this.f28023d, c0787k));
        return c0787k.a();
    }

    private Task h() {
        C0787k c0787k = new C0787k();
        i(new f(c0787k));
        return c0787k.a();
    }

    private void i(h hVar) {
        synchronized (this.f28026g) {
            this.f28031l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void k() {
        H(null);
        C8.d u10 = u();
        if (u10.k()) {
            this.f28021b.e(o(), u10.d(), w(), u10.f());
        }
        x(u10.r());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(boolean z10) {
        C8.d E10;
        C8.d u10 = u();
        try {
            if (!u10.i() && !u10.l()) {
                if (!z10 && !this.f28023d.f(u10)) {
                    return;
                }
                E10 = n(u10);
                x(E10);
                I(u10, E10);
                if (E10.k()) {
                    H(E10.d());
                }
                if (!E10.i()) {
                    F(new d(d.a.BAD_CONFIG));
                    return;
                } else if (E10.j()) {
                    F(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    return;
                } else {
                    G(E10);
                    return;
                }
            }
            E10 = E(u10);
            x(E10);
            I(u10, E10);
            if (E10.k()) {
            }
            if (!E10.i()) {
            }
        } catch (d e10) {
            F(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void A(final boolean z10) {
        C8.d v10 = v();
        if (z10) {
            v10 = v10.p();
        }
        G(v10);
        this.f28028i.execute(new Runnable() { // from class: B8.e
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.y(z10);
            }
        });
    }

    private C8.d n(C8.d dVar) {
        D8.f f10 = this.f28021b.f(o(), dVar.d(), w(), dVar.f());
        int i10 = b.f28034b[f10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(f10.c(), f10.d(), this.f28023d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        H(null);
        return dVar.r();
    }

    private synchronized String q() {
        return this.f28029j;
    }

    private C8.b r() {
        return (C8.b) this.f28024e.get();
    }

    public static c s() {
        return t(C3511e.n());
    }

    public static c t(C3511e c3511e) {
        AbstractC1287s.b(c3511e != null, "Null is not a valid value of FirebaseApp.");
        return (c) c3511e.j(B8.f.class);
    }

    /* JADX WARN: Finally extract failed */
    private C8.d u() {
        C8.d d10;
        synchronized (f28018m) {
            try {
                com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f28020a.l(), "generatefid.lock");
                try {
                    d10 = this.f28022c.d();
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    /* JADX WARN: Finally extract failed */
    private C8.d v() {
        C8.d d10;
        synchronized (f28018m) {
            try {
                com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f28020a.l(), "generatefid.lock");
                try {
                    d10 = this.f28022c.d();
                    if (d10.j()) {
                        d10 = this.f28022c.b(d10.t(D(d10)));
                    }
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    /* JADX WARN: Finally extract failed */
    private void x(C8.d dVar) {
        synchronized (f28018m) {
            try {
                com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f28020a.l(), "generatefid.lock");
                try {
                    this.f28022c.b(dVar);
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        A(false);
    }

    @Override // B8.f
    public Task a(final boolean z10) {
        C();
        Task g10 = g();
        this.f28027h.execute(new Runnable() { // from class: B8.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.A(z10);
            }
        });
        return g10;
    }

    @Override // B8.f
    public Task getId() {
        C();
        String q10 = q();
        if (q10 != null) {
            return AbstractC0789m.g(q10);
        }
        Task h10 = h();
        this.f28027h.execute(new Runnable() { // from class: B8.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.z();
            }
        });
        return h10;
    }

    public Task j() {
        return AbstractC0789m.d(this.f28027h, new Callable() { // from class: B8.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k10;
                k10 = com.google.firebase.installations.c.this.k();
                return k10;
            }
        });
    }

    String o() {
        return this.f28020a.q().b();
    }

    String p() {
        return this.f28020a.q().c();
    }

    String w() {
        return this.f28020a.q().g();
    }

    c(ExecutorService executorService, Executor executor, C3511e c3511e, D8.c cVar, C8.c cVar2, i iVar, w wVar, B8.h hVar) {
        this.f28026g = new Object();
        this.f28030k = new HashSet();
        this.f28031l = new ArrayList();
        this.f28020a = c3511e;
        this.f28021b = cVar;
        this.f28022c = cVar2;
        this.f28023d = iVar;
        this.f28024e = wVar;
        this.f28025f = hVar;
        this.f28027h = executorService;
        this.f28028i = executor;
    }
}
