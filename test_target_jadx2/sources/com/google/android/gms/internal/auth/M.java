package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class M {

    /* renamed from: g, reason: collision with root package name */
    private static volatile K f23621g;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f23625k = 0;

    /* renamed from: a, reason: collision with root package name */
    final I f23626a;

    /* renamed from: b, reason: collision with root package name */
    final String f23627b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f23628c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f23629d = -1;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f23630e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f23620f = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicReference f23622h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    private static final O f23623i = new O(new Object() { // from class: com.google.android.gms.internal.auth.D
    });

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f23624j = new AtomicInteger();

    /* synthetic */ M(I i10, String str, Object obj, boolean z10, L l10) {
        if (i10.f23604a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f23626a = i10;
        this.f23627b = str;
        this.f23628c = obj;
    }

    public static void c() {
        f23624j.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(final Context context) {
        if (f23621g != null || context == null) {
            return;
        }
        Object obj = f23620f;
        synchronized (obj) {
            try {
                if (f23621g == null) {
                    synchronized (obj) {
                        K k10 = f23621g;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (k10 != null) {
                            if (k10.a() != context) {
                            }
                        }
                        C2080q.d();
                        N.c();
                        C2100x.e();
                        f23621g = new C2071n(context, Z.a(new U() { // from class: com.google.android.gms.internal.auth.C
                            @Override // com.google.android.gms.internal.auth.U
                            public final Object zza() {
                                Context context2 = context;
                                int i10 = M.f23625k;
                                return AbstractC2103y.a(context2);
                            }
                        }));
                        f23624j.incrementAndGet();
                    }
                }
            } finally {
            }
        }
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        String str;
        C2080q c2080q;
        Object a10;
        Object a11;
        int i10 = f23624j.get();
        if (this.f23629d < i10) {
            synchronized (this) {
                try {
                    if (this.f23629d < i10) {
                        K k10 = f23621g;
                        S c10 = S.c();
                        Object obj = null;
                        if (k10 != null) {
                            c10 = (S) k10.b().zza();
                            if (c10.b()) {
                                r rVar = (r) c10.a();
                                I i11 = this.f23626a;
                                str = rVar.a(i11.f23604a, null, i11.f23606c, this.f23627b);
                                if (k10 != null) {
                                    throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                                }
                                Uri uri = this.f23626a.f23604a;
                                if (uri == null) {
                                    N.b(k10.a(), null, new Runnable() { // from class: com.google.android.gms.internal.auth.B
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            M.c();
                                        }
                                    });
                                } else if (AbstractC2106z.a(k10.a(), uri)) {
                                    c2080q = C2080q.b(k10.a().getContentResolver(), this.f23626a.f23604a, new Runnable() { // from class: com.google.android.gms.internal.auth.B
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            M.c();
                                        }
                                    });
                                    a10 = (c2080q != null || (a11 = c2080q.a(this.f23627b)) == null) ? null : a(a11);
                                    if (a10 == null) {
                                        if (!this.f23626a.f23607d) {
                                            String a12 = C2100x.b(k10.a()).a(this.f23626a.f23607d ? null : this.f23627b);
                                            if (a12 != null) {
                                                obj = a(a12);
                                            }
                                        }
                                        a10 = obj == null ? this.f23628c : obj;
                                    }
                                    if (c10.b()) {
                                        a10 = str == null ? this.f23628c : a(str);
                                    }
                                    this.f23630e = a10;
                                    this.f23629d = i10;
                                }
                                c2080q = null;
                                if (c2080q != null) {
                                }
                                if (a10 == null) {
                                }
                                if (c10.b()) {
                                }
                                this.f23630e = a10;
                                this.f23629d = i10;
                            }
                        }
                        str = null;
                        if (k10 != null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.f23630e;
    }
}
