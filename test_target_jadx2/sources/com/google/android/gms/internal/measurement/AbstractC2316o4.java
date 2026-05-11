package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2316o4 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f24591g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static volatile AbstractC2271j4 f24592h;

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f24593i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f24594j = 0;

    /* renamed from: a, reason: collision with root package name */
    final C2262i4 f24595a;

    /* renamed from: b, reason: collision with root package name */
    final String f24596b;

    /* renamed from: c, reason: collision with root package name */
    private Object f24597c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f24598d = -1;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f24599e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f24600f;

    static {
        new AtomicReference();
        g8.h.i(C2298m4.f24572a, "BuildInfo must be non-null");
        f24593i = new AtomicInteger();
    }

    /* synthetic */ AbstractC2316o4(C2262i4 c2262i4, String str, Object obj, boolean z10, byte[] bArr) {
        if (c2262i4.f24530a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f24595a = c2262i4;
        this.f24596b = str;
        this.f24597c = obj;
        this.f24600f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(final Context context) {
        if (f24592h != null || context == null) {
            return;
        }
        Object obj = f24591g;
        synchronized (obj) {
            try {
                if (f24592h == null) {
                    synchronized (obj) {
                        AbstractC2271j4 abstractC2271j4 = f24592h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (abstractC2271j4 != null) {
                            if (abstractC2271j4.a() != context) {
                            }
                        }
                        if (abstractC2271j4 != null) {
                            T3.f();
                            C2334q4.d();
                            Z3.e();
                        }
                        f24592h = new P3(context, g8.l.a(new g8.k() { // from class: com.google.android.gms.internal.measurement.n4
                            @Override // g8.k
                            public final /* synthetic */ Object get() {
                                int i10 = AbstractC2316o4.f24594j;
                                return AbstractC2190a4.a(context);
                            }
                        }));
                        f24593i.incrementAndGet();
                    }
                }
            } finally {
            }
        }
    }

    public static void c() {
        f24593i.incrementAndGet();
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        String str;
        Object a10;
        String a11;
        Object a12;
        int i10 = f24593i.get();
        if (this.f24598d < i10) {
            synchronized (this) {
                try {
                    if (this.f24598d < i10) {
                        AbstractC2271j4 abstractC2271j4 = f24592h;
                        g8.g a13 = g8.g.a();
                        Object obj = null;
                        if (abstractC2271j4 != null && abstractC2271j4.b() != null) {
                            a13 = (g8.g) ((g8.k) g8.h.h(abstractC2271j4.b())).get();
                            if (a13.c()) {
                                U3 u32 = (U3) a13.b();
                                C2262i4 c2262i4 = this.f24595a;
                                str = u32.a(c2262i4.f24530a, null, c2262i4.f24532c, this.f24596b);
                                g8.h.n(abstractC2271j4 == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                                C2262i4 c2262i42 = this.f24595a;
                                Uri uri = c2262i42.f24530a;
                                W3 c10 = uri == null ? AbstractC2208c4.a(abstractC2271j4.a(), uri) ? T3.c(abstractC2271j4.a().getContentResolver(), uri, RunnableC2289l4.f24561a) : null : C2334q4.c(abstractC2271j4.a(), (String) g8.h.h(null), RunnableC2280k4.f24548a);
                                a10 = (c10 != null || (a12 = c10.a(this.f24596b)) == null) ? null : a(a12);
                                if (a10 == null) {
                                    if (!c2262i42.f24533d && (a11 = Z3.c(abstractC2271j4.a()).a(this.f24596b)) != null) {
                                        obj = a(a11);
                                    }
                                    a10 = obj == null ? this.f24597c : obj;
                                }
                                if (a13.c()) {
                                    a10 = str == null ? this.f24597c : a(str);
                                }
                                this.f24599e = a10;
                                this.f24598d = i10;
                            }
                        }
                        str = null;
                        g8.h.n(abstractC2271j4 == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        C2262i4 c2262i422 = this.f24595a;
                        Uri uri2 = c2262i422.f24530a;
                        if (uri2 == null) {
                        }
                        if (c10 != null) {
                        }
                        if (a10 == null) {
                        }
                        if (a13.c()) {
                        }
                        this.f24599e = a10;
                        this.f24598d = i10;
                    }
                } finally {
                }
            }
        }
        return this.f24599e;
    }
}
