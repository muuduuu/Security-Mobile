package s7;

import V6.C1284o;
import X8.AbstractC1297c;
import X8.C1301g;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: s7.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4492x5 {

    /* renamed from: k, reason: collision with root package name */
    private static N5 f41629k;

    /* renamed from: l, reason: collision with root package name */
    private static final P5 f41630l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f41631a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41632b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4444q5 f41633c;

    /* renamed from: d, reason: collision with root package name */
    private final X8.m f41634d;

    /* renamed from: e, reason: collision with root package name */
    private final Task f41635e;

    /* renamed from: f, reason: collision with root package name */
    private final Task f41636f;

    /* renamed from: g, reason: collision with root package name */
    private final String f41637g;

    /* renamed from: h, reason: collision with root package name */
    private final int f41638h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f41639i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f41640j = new HashMap();

    public C4492x5(Context context, final X8.m mVar, InterfaceC4444q5 interfaceC4444q5, String str) {
        this.f41631a = context.getPackageName();
        this.f41632b = AbstractC1297c.a(context);
        this.f41634d = mVar;
        this.f41633c = interfaceC4444q5;
        K5.a();
        this.f41637g = str;
        this.f41635e = C1301g.a().b(new Callable() { // from class: s7.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4492x5.this.a();
            }
        });
        C1301g a10 = C1301g.a();
        mVar.getClass();
        this.f41636f = a10.b(new Callable() { // from class: s7.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return X8.m.this.a();
            }
        });
        P5 p52 = f41630l;
        this.f41638h = p52.containsKey(str) ? DynamiteModule.b(context, (String) p52.get(str)) : -1;
    }

    private static synchronized N5 d() {
        synchronized (C4492x5.class) {
            try {
                N5 n52 = f41629k;
                if (n52 != null) {
                    return n52;
                }
                androidx.core.os.i a10 = androidx.core.os.e.a(Resources.getSystem().getConfiguration());
                C4423n5 c4423n5 = new C4423n5();
                for (int i10 = 0; i10 < a10.f(); i10++) {
                    c4423n5.c(AbstractC1297c.b(a10.c(i10)));
                }
                N5 d10 = c4423n5.d();
                f41629k = d10;
                return d10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ String a() {
        return C1284o.a().b(this.f41637g);
    }

    final /* synthetic */ void b(InterfaceC4437p5 interfaceC4437p5, F3 f32, String str) {
        interfaceC4437p5.c(f32);
        String a10 = interfaceC4437p5.a();
        K4 k42 = new K4();
        k42.b(this.f41631a);
        k42.c(this.f41632b);
        k42.h(d());
        k42.g(Boolean.TRUE);
        k42.l(a10);
        k42.j(str);
        k42.i(this.f41636f.isSuccessful() ? (String) this.f41636f.getResult() : this.f41634d.a());
        k42.d(10);
        k42.k(Integer.valueOf(this.f41638h));
        interfaceC4437p5.b(k42);
        this.f41633c.a(interfaceC4437p5);
    }

    public final void c(H5 h52, final F3 f32) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f41639i.get(f32) != null && elapsedRealtime - ((Long) this.f41639i.get(f32)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f41639i.put(f32, Long.valueOf(elapsedRealtime));
        int i10 = h52.f40894a;
        int i11 = h52.f40895b;
        int i12 = h52.f40896c;
        int i13 = h52.f40897d;
        int i14 = h52.f40898e;
        long j10 = h52.f40899f;
        int i15 = h52.f40900g;
        C4490x3 c4490x3 = new C4490x3();
        c4490x3.d(i10 != -1 ? i10 != 35 ? i10 != 842094169 ? i10 != 16 ? i10 != 17 ? EnumC4455s3.UNKNOWN_FORMAT : EnumC4455s3.NV21 : EnumC4455s3.NV16 : EnumC4455s3.YV12 : EnumC4455s3.YUV_420_888 : EnumC4455s3.BITMAP);
        c4490x3.f(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? EnumC4497y3.ANDROID_MEDIA_IMAGE : EnumC4497y3.FILEPATH : EnumC4497y3.BYTEBUFFER : EnumC4497y3.BYTEARRAY : EnumC4497y3.BITMAP);
        c4490x3.c(Integer.valueOf(i12));
        c4490x3.e(Integer.valueOf(i13));
        c4490x3.g(Integer.valueOf(i14));
        c4490x3.b(Long.valueOf(j10));
        c4490x3.h(Integer.valueOf(i15));
        A3 j11 = c4490x3.j();
        G3 g32 = new G3();
        g32.d(j11);
        final InterfaceC4437p5 e10 = y5.e(g32);
        final String b10 = this.f41635e.isSuccessful() ? (String) this.f41635e.getResult() : C1284o.a().b(this.f41637g);
        C1301g.d().execute(new Runnable() { // from class: s7.w5
            @Override // java.lang.Runnable
            public final void run() {
                C4492x5.this.b(e10, f32, b10);
            }
        });
    }
}
