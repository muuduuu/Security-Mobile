package d9;

import V6.AbstractC1287s;
import X8.AbstractC1300f;
import X8.C1301g;
import X8.C1303i;
import android.os.SystemClock;
import b9.C1662a;
import e9.C3102a;
import f9.C3154a;
import f9.C3157d;
import java.util.Iterator;
import java.util.List;
import r7.C4071e1;
import r7.C4081f1;
import r7.C4096g6;
import r7.C4101h1;
import r7.C4110i0;
import r7.C4215s6;
import r7.C4217s8;
import r7.C4237u8;
import r7.C4257w8;
import r7.EnumC4066d6;
import r7.EnumC4076e6;
import r7.EnumC4086f6;
import r7.F5;
import r7.InterfaceC4108h8;
import r7.InterfaceC4207r8;
import r7.J5;
import r7.K5;
import r7.Q5;

/* loaded from: classes2.dex */
public final class k extends AbstractC1300f {

    /* renamed from: j, reason: collision with root package name */
    private static final C3157d f31309j = C3157d.b();

    /* renamed from: k, reason: collision with root package name */
    static boolean f31310k = true;

    /* renamed from: d, reason: collision with root package name */
    private final Z8.b f31311d;

    /* renamed from: e, reason: collision with root package name */
    private final l f31312e;

    /* renamed from: f, reason: collision with root package name */
    private final C4217s8 f31313f;

    /* renamed from: g, reason: collision with root package name */
    private final C4237u8 f31314g;

    /* renamed from: h, reason: collision with root package name */
    private final C3154a f31315h = new C3154a();

    /* renamed from: i, reason: collision with root package name */
    private boolean f31316i;

    public k(C1303i c1303i, Z8.b bVar, l lVar, C4217s8 c4217s8) {
        AbstractC1287s.n(c1303i, "MlKitContext can not be null");
        AbstractC1287s.n(bVar, "BarcodeScannerOptions can not be null");
        this.f31311d = bVar;
        this.f31312e = lVar;
        this.f31313f = c4217s8;
        this.f31314g = C4237u8.a(c1303i.b());
    }

    private final void m(final EnumC4076e6 enumC4076e6, long j10, final C3102a c3102a, List list) {
        final C4110i0 c4110i0 = new C4110i0();
        final C4110i0 c4110i02 = new C4110i0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1662a c1662a = (C1662a) it.next();
                c4110i0.e(c.a(c1662a.c()));
                c4110i02.e(c.b(c1662a.f()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f31313f.f(new InterfaceC4207r8() { // from class: d9.i
            @Override // r7.InterfaceC4207r8
            public final InterfaceC4108h8 zza() {
                return k.this.j(elapsedRealtime, enumC4076e6, c4110i0, c4110i02, c3102a);
            }
        }, EnumC4086f6.ON_DEVICE_BARCODE_DETECT);
        C4081f1 c4081f1 = new C4081f1();
        c4081f1.e(enumC4076e6);
        c4081f1.f(Boolean.valueOf(f31310k));
        c4081f1.g(c.c(this.f31311d));
        c4081f1.c(c4110i0.g());
        c4081f1.d(c4110i02.g());
        final C4101h1 h10 = c4081f1.h();
        final j jVar = new j(this);
        final C4217s8 c4217s8 = this.f31313f;
        final EnumC4086f6 enumC4086f6 = EnumC4086f6.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C1301g.d().execute(new Runnable() { // from class: r7.p8
            @Override // java.lang.Runnable
            public final void run() {
                C4217s8.this.h(enumC4086f6, h10, elapsedRealtime, jVar);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f31314g.c(true != this.f31316i ? 24301 : 24302, enumC4076e6.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // X8.k
    public final synchronized void b() {
        this.f31316i = this.f31312e.a();
    }

    @Override // X8.k
    public final synchronized void d() {
        try {
            this.f31312e.zzb();
            f31310k = true;
            C4217s8 c4217s8 = this.f31313f;
            C4096g6 c4096g6 = new C4096g6();
            c4096g6.e(this.f31316i ? EnumC4066d6.TYPE_THICK : EnumC4066d6.TYPE_THIN);
            C4215s6 c4215s6 = new C4215s6();
            c4215s6.i(c.c(this.f31311d));
            c4096g6.g(c4215s6.j());
            c4217s8.d(C4257w8.d(c4096g6), EnumC4086f6.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ InterfaceC4108h8 j(long j10, EnumC4076e6 enumC4076e6, C4110i0 c4110i0, C4110i0 c4110i02, C3102a c3102a) {
        C4215s6 c4215s6 = new C4215s6();
        Q5 q52 = new Q5();
        q52.c(Long.valueOf(j10));
        q52.d(enumC4076e6);
        q52.e(Boolean.valueOf(f31310k));
        Boolean bool = Boolean.TRUE;
        q52.a(bool);
        q52.b(bool);
        c4215s6.h(q52.f());
        c4215s6.i(c.c(this.f31311d));
        c4215s6.e(c4110i0.g());
        c4215s6.f(c4110i02.g());
        int h10 = c3102a.h();
        int d10 = f31309j.d(c3102a);
        J5 j52 = new J5();
        j52.a(h10 != -1 ? h10 != 35 ? h10 != 842094169 ? h10 != 16 ? h10 != 17 ? K5.UNKNOWN_FORMAT : K5.NV21 : K5.NV16 : K5.YV12 : K5.YUV_420_888 : K5.BITMAP);
        j52.b(Integer.valueOf(d10));
        c4215s6.g(j52.d());
        C4096g6 c4096g6 = new C4096g6();
        c4096g6.e(this.f31316i ? EnumC4066d6.TYPE_THICK : EnumC4066d6.TYPE_THIN);
        c4096g6.g(c4215s6.j());
        return C4257w8.d(c4096g6);
    }

    final /* synthetic */ InterfaceC4108h8 k(C4101h1 c4101h1, int i10, F5 f52) {
        C4096g6 c4096g6 = new C4096g6();
        c4096g6.e(this.f31316i ? EnumC4066d6.TYPE_THICK : EnumC4066d6.TYPE_THIN);
        C4071e1 c4071e1 = new C4071e1();
        c4071e1.a(Integer.valueOf(i10));
        c4071e1.c(c4101h1);
        c4071e1.b(f52);
        c4096g6.d(c4071e1.e());
        return C4257w8.d(c4096g6);
    }

    @Override // X8.AbstractC1300f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(C3102a c3102a) {
        List b10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f31315h.a(c3102a);
        try {
            b10 = this.f31312e.b(c3102a);
            m(EnumC4076e6.NO_ERROR, elapsedRealtime, c3102a, b10);
            f31310k = false;
        } catch (T8.a e10) {
            m(e10.a() == 14 ? EnumC4076e6.MODEL_NOT_DOWNLOADED : EnumC4076e6.UNKNOWN_ERROR, elapsedRealtime, c3102a, null);
            throw e10;
        }
        return b10;
    }
}
