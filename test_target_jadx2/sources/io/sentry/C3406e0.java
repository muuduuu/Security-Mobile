package io.sentry;

import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: io.sentry.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3406e0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f35104a = new ArrayList();

    /* renamed from: io.sentry.e0$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35105a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f35105a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35105a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.e0$b */
    interface b {
        Object a();
    }

    /* renamed from: io.sentry.e0$c */
    private interface c {
        Object getValue();
    }

    /* renamed from: io.sentry.e0$f */
    private static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        final String f35108a;

        f(String str) {
            this.f35108a = str;
        }

        @Override // io.sentry.C3406e0.c
        public Object getValue() {
            return this.f35108a;
        }
    }

    /* renamed from: io.sentry.e0$g */
    private static final class g implements c {

        /* renamed from: a, reason: collision with root package name */
        final Object f35109a;

        g(Object obj) {
            this.f35109a = obj;
        }

        @Override // io.sentry.C3406e0.c
        public Object getValue() {
            return this.f35109a;
        }
    }

    private c f() {
        if (this.f35104a.isEmpty()) {
            return null;
        }
        return (c) this.f35104a.get(r0.size() - 1);
    }

    private boolean g() {
        if (i()) {
            return true;
        }
        c f10 = f();
        p();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (f10 == null || dVar == null) {
                return false;
            }
            dVar.f35106a.add(f10.getValue());
            return false;
        }
        f fVar = (f) f();
        p();
        e eVar = (e) f();
        if (fVar == null || f10 == null || eVar == null) {
            return false;
        }
        eVar.f35107a.put(fVar.f35108a, f10.getValue());
        return false;
    }

    private boolean h(b bVar) {
        Object a10 = bVar.a();
        if (f() == null && a10 != null) {
            q(new g(a10));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            p();
            ((e) f()).f35107a.put(fVar.f35108a, a10);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f35106a.add(a10);
        return false;
    }

    private boolean i() {
        return this.f35104a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object l(C3409f0 c3409f0) {
        return Boolean.valueOf(c3409f0.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object m() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object k(C3409f0 c3409f0) {
        try {
            try {
                return Integer.valueOf(c3409f0.p());
            } catch (Exception unused) {
                return Double.valueOf(c3409f0.o());
            }
        } catch (Exception unused2) {
            return Long.valueOf(c3409f0.q());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void o(final C3409f0 c3409f0) {
        boolean z10;
        a aVar = null;
        switch (a.f35105a[c3409f0.z().ordinal()]) {
            case 1:
                c3409f0.a();
                q(new d(aVar));
                z10 = false;
                break;
            case 2:
                c3409f0.f();
                z10 = g();
                break;
            case 3:
                c3409f0.b();
                q(new e(aVar));
                z10 = false;
                break;
            case 4:
                c3409f0.g();
                z10 = g();
                break;
            case 5:
                q(new f(c3409f0.r()));
                z10 = false;
                break;
            case 6:
                z10 = h(new b() { // from class: io.sentry.a0
                    @Override // io.sentry.C3406e0.b
                    public final Object a() {
                        Object x10;
                        x10 = C3409f0.this.x();
                        return x10;
                    }
                });
                break;
            case 7:
                z10 = h(new b() { // from class: io.sentry.b0
                    @Override // io.sentry.C3406e0.b
                    public final Object a() {
                        Object k10;
                        k10 = C3406e0.this.k(c3409f0);
                        return k10;
                    }
                });
                break;
            case 8:
                z10 = h(new b() { // from class: io.sentry.c0
                    @Override // io.sentry.C3406e0.b
                    public final Object a() {
                        Object l10;
                        l10 = C3406e0.l(C3409f0.this);
                        return l10;
                    }
                });
                break;
            case 9:
                c3409f0.t();
                z10 = h(new b() { // from class: io.sentry.d0
                    @Override // io.sentry.C3406e0.b
                    public final Object a() {
                        Object m10;
                        m10 = C3406e0.m();
                        return m10;
                    }
                });
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        if (z10) {
            return;
        }
        o(c3409f0);
    }

    private void p() {
        if (this.f35104a.isEmpty()) {
            return;
        }
        this.f35104a.remove(r0.size() - 1);
    }

    private void q(c cVar) {
        this.f35104a.add(cVar);
    }

    public Object e(C3409f0 c3409f0) {
        o(c3409f0);
        c f10 = f();
        if (f10 != null) {
            return f10.getValue();
        }
        return null;
    }

    /* renamed from: io.sentry.e0$d */
    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f35106a;

        private d() {
            this.f35106a = new ArrayList();
        }

        @Override // io.sentry.C3406e0.c
        public Object getValue() {
            return this.f35106a;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: io.sentry.e0$e */
    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        final HashMap f35107a;

        private e() {
            this.f35107a = new HashMap();
        }

        @Override // io.sentry.C3406e0.c
        public Object getValue() {
            return this.f35107a;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
