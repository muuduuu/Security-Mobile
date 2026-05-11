package h9;

import V6.AbstractC1287s;
import X8.AbstractC1300f;
import X8.C1301g;
import X8.C1303i;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import e9.C3102a;
import f9.C3154a;
import f9.C3157d;
import g9.C3201a;
import g9.C3205e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.B4;
import t7.C4651b4;
import t7.C4735n4;
import t7.C4818z4;
import t7.EnumC4707j4;
import t7.EnumC4721l4;
import t7.EnumC4728m4;
import t7.K5;
import t7.M0;
import t7.M5;
import t7.N0;
import t7.N3;
import t7.P0;
import t7.P5;
import t7.Q5;
import t7.W3;
import t7.X3;

/* loaded from: classes2.dex */
public final class i extends AbstractC1300f {

    /* renamed from: j, reason: collision with root package name */
    static final AtomicBoolean f34004j = new AtomicBoolean(true);

    /* renamed from: k, reason: collision with root package name */
    private static final C3157d f34005k = C3157d.b();

    /* renamed from: d, reason: collision with root package name */
    private final C3205e f34006d;

    /* renamed from: e, reason: collision with root package name */
    private final M5 f34007e;

    /* renamed from: f, reason: collision with root package name */
    private final P5 f34008f;

    /* renamed from: g, reason: collision with root package name */
    private final c f34009g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f34010h;

    /* renamed from: i, reason: collision with root package name */
    private final C3154a f34011i = new C3154a();

    public i(M5 m52, C3205e c3205e, c cVar) {
        AbstractC1287s.n(c3205e, "FaceDetectorOptions can not be null");
        this.f34006d = c3205e;
        this.f34007e = m52;
        this.f34009g = cVar;
        this.f34008f = P5.a(C1303i.c().b());
    }

    static void k(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C3201a) it.next()).i(-1);
        }
    }

    private final synchronized void n(final EnumC4721l4 enumC4721l4, long j10, final C3102a c3102a, final int i10, final int i11) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f34007e.c(new K5() { // from class: h9.h
            @Override // t7.K5
            public final Q5 zza() {
                return i.this.l(elapsedRealtime, enumC4721l4, i10, i11, c3102a);
            }
        }, EnumC4728m4.ON_DEVICE_FACE_DETECT);
        N0 n02 = new N0();
        n02.c(enumC4721l4);
        n02.d(Boolean.valueOf(f34004j.get()));
        n02.a(Integer.valueOf(i10));
        n02.e(Integer.valueOf(i11));
        n02.b(k.a(this.f34006d));
        final P0 f10 = n02.f();
        final g gVar = new g(this);
        final M5 m52 = this.f34007e;
        final EnumC4728m4 enumC4728m4 = EnumC4728m4.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        C1301g.d().execute(new Runnable(enumC4728m4, f10, elapsedRealtime, gVar, bArr) { // from class: t7.G5

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnumC4728m4 f42527b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f42528c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f42529d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h9.g f42530e;

            @Override // java.lang.Runnable
            public final void run() {
                M5.this.f(this.f42527b, this.f42528c, this.f42529d, this.f42530e);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f34008f.c(true != this.f34010h ? 24303 : 24304, enumC4721l4.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // X8.k
    public final synchronized void b() {
        this.f34010h = this.f34009g.f();
    }

    @Override // X8.k
    public final synchronized void d() {
        this.f34009g.zzb();
        f34004j.set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r2 = (java.util.List) V6.AbstractC1287s.m(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d A[Catch: all -> 0x002b, a -> 0x00e0, TryCatch #1 {a -> 0x00e0, blocks: (B:16:0x010e, B:21:0x0122, B:34:0x011d, B:35:0x0114, B:53:0x00b3, B:55:0x00d7, B:57:0x00e8, B:64:0x00fb, B:69:0x0106), top: B:52:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114 A[Catch: all -> 0x002b, a -> 0x00e0, TryCatch #1 {a -> 0x00e0, blocks: (B:16:0x010e, B:21:0x0122, B:34:0x011d, B:35:0x0114, B:53:0x00b3, B:55:0x00d7, B:57:0x00e8, B:64:0x00fb, B:69:0x0106), top: B:52:0x00b3 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    @Override // X8.AbstractC1300f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List i(C3102a c3102a) {
        long j10;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f34011i.a(c3102a);
            try {
                Pair b10 = this.f34009g.b(c3102a);
                List list = (List) b10.first;
                List list2 = (List) b10.second;
                if (list == null && list2 == null) {
                    throw new T8.a("No detector is enabled", 13);
                }
                if (list2 == null) {
                    ArrayList arrayList2 = (List) AbstractC1287s.m(list);
                    arrayList = arrayList2;
                    j10 = elapsedRealtime;
                    n(EnumC4721l4.NO_ERROR, j10, c3102a, list2 != null ? 0 : list2.size(), list != null ? 0 : list.size());
                    f34004j.set(false);
                } else {
                    HashSet hashSet = new HashSet();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        C3201a c3201a = (C3201a) it3.next();
                        Iterator it4 = list.iterator();
                        boolean z10 = false;
                        while (it4.hasNext()) {
                            C3201a c3201a2 = (C3201a) it4.next();
                            if (c3201a.a() != null && c3201a2.a() != null) {
                                Rect a10 = c3201a.a();
                                Rect a11 = c3201a2.a();
                                if (a10.intersect(a11)) {
                                    it = it3;
                                    it2 = it4;
                                    j10 = elapsedRealtime;
                                    double min = (Math.min(a10.right, a11.right) - Math.max(a10.left, a11.left)) * (Math.min(a10.bottom, a11.bottom) - Math.max(a10.top, a11.top));
                                    try {
                                        if (min / ((((a10.right - a10.left) * (a10.bottom - a10.top)) + ((a11.right - a11.left) * (a11.bottom - a11.top))) - min) > 0.6d) {
                                            c3201a2.h(c3201a.g());
                                            z10 = true;
                                        }
                                        hashSet.add(c3201a2);
                                        it3 = it;
                                        it4 = it2;
                                        elapsedRealtime = j10;
                                    } catch (T8.a e10) {
                                        e = e10;
                                        n(e.a() == 14 ? EnumC4721l4.MODEL_NOT_DOWNLOADED : EnumC4721l4.UNKNOWN_ERROR, j10, c3102a, 0, 0);
                                        throw e;
                                    }
                                }
                            }
                            it = it3;
                            it2 = it4;
                            j10 = elapsedRealtime;
                            hashSet.add(c3201a2);
                            it3 = it;
                            it4 = it2;
                            elapsedRealtime = j10;
                        }
                        Iterator it5 = it3;
                        long j11 = elapsedRealtime;
                        if (!z10) {
                            hashSet.add(c3201a);
                        }
                        it3 = it5;
                        elapsedRealtime = j11;
                    }
                    j10 = elapsedRealtime;
                    arrayList = new ArrayList(hashSet);
                    n(EnumC4721l4.NO_ERROR, j10, c3102a, list2 != null ? 0 : list2.size(), list != null ? 0 : list.size());
                    f34004j.set(false);
                }
            } catch (T8.a e11) {
                e = e11;
                j10 = elapsedRealtime;
            }
        } finally {
        }
        return arrayList;
    }

    final /* synthetic */ Q5 l(long j10, EnumC4721l4 enumC4721l4, int i10, int i11, C3102a c3102a) {
        C4818z4 c4818z4 = new C4818z4();
        C4651b4 c4651b4 = new C4651b4();
        c4651b4.c(Long.valueOf(j10));
        c4651b4.d(enumC4721l4);
        c4651b4.e(Boolean.valueOf(f34004j.get()));
        Boolean bool = Boolean.TRUE;
        c4651b4.a(bool);
        c4651b4.b(bool);
        c4818z4.g(c4651b4.f());
        c4818z4.e(k.a(this.f34006d));
        c4818z4.d(Integer.valueOf(i10));
        c4818z4.h(Integer.valueOf(i11));
        C3157d c3157d = f34005k;
        int c10 = c3157d.c(c3102a);
        int d10 = c3157d.d(c3102a);
        W3 w32 = new W3();
        w32.a(c10 != -1 ? c10 != 35 ? c10 != 842094169 ? c10 != 16 ? c10 != 17 ? X3.UNKNOWN_FORMAT : X3.NV21 : X3.NV16 : X3.YV12 : X3.YUV_420_888 : X3.BITMAP);
        w32.b(Integer.valueOf(d10));
        c4818z4.f(w32.d());
        B4 i12 = c4818z4.i();
        C4735n4 c4735n4 = new C4735n4();
        c4735n4.e(this.f34010h ? EnumC4707j4.TYPE_THICK : EnumC4707j4.TYPE_THIN);
        c4735n4.g(i12);
        return Q5.d(c4735n4);
    }

    final /* synthetic */ Q5 m(P0 p02, int i10, N3 n32) {
        C4735n4 c4735n4 = new C4735n4();
        c4735n4.e(this.f34010h ? EnumC4707j4.TYPE_THICK : EnumC4707j4.TYPE_THIN);
        M0 m02 = new M0();
        m02.a(Integer.valueOf(i10));
        m02.c(p02);
        m02.b(n32);
        c4735n4.d(m02.e());
        return Q5.d(c4735n4);
    }
}
