package G3;

import G3.a;
import I3.h;
import I3.i;
import I3.j;
import I3.k;
import f3.AbstractC3142a;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes.dex */
public final class e implements G3.a {

    /* renamed from: a, reason: collision with root package name */
    private final D3.d f2855a;

    /* renamed from: b, reason: collision with root package name */
    private final E3.c f2856b;

    /* renamed from: c, reason: collision with root package name */
    private final j f2857c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2858d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2859e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2860f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2861g;

    /* renamed from: h, reason: collision with root package name */
    private i f2862h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2863i;

    /* renamed from: j, reason: collision with root package name */
    private int f2864j;

    /* renamed from: k, reason: collision with root package name */
    private final a f2865k;

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        private final int f2866a;

        a() {
            this.f2866a = e.this.f2863i;
        }

        @Override // I3.h
        public int a() {
            return this.f2866a;
        }

        @Override // I3.h
        public int b() {
            return e.this.f2864j;
        }

        @Override // I3.h
        public void c(int i10) {
            if (i10 != e.this.f2864j) {
                e eVar = e.this;
                eVar.f2864j = kotlin.ranges.d.k(i10, 1, eVar.f2863i);
                i l10 = e.this.l();
                if (l10 != null) {
                    l10.d(e.this.f2864j);
                }
            }
        }
    }

    public e(String str, D3.d animationInformation, E3.c bitmapFrameRenderer, j frameLoaderFactory, boolean z10) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(frameLoaderFactory, "frameLoaderFactory");
        this.f2855a = animationInformation;
        this.f2856b = bitmapFrameRenderer;
        this.f2857c = frameLoaderFactory;
        this.f2858d = z10;
        this.f2859e = str == null ? String.valueOf(hashCode()) : str;
        this.f2860f = animationInformation.m();
        this.f2861g = animationInformation.h();
        int k10 = k(animationInformation);
        this.f2863i = k10;
        this.f2864j = k10;
        this.f2865k = new a();
    }

    private final f j(int i10, int i11) {
        if (!this.f2858d) {
            return new f(this.f2860f, this.f2861g);
        }
        int i12 = this.f2860f;
        int i13 = this.f2861g;
        if (i10 < i12 || i11 < i13) {
            double d10 = i12 / i13;
            if (i11 > i10) {
                i13 = kotlin.ranges.d.h(i11, i13);
                i12 = (int) (i13 * d10);
            } else {
                i12 = kotlin.ranges.d.h(i10, i12);
                i13 = (int) (i12 / d10);
            }
        }
        return new f(i12, i13);
    }

    private final int k(D3.d dVar) {
        return (int) kotlin.ranges.d.e(TimeUnit.SECONDS.toMillis(1L) / (dVar.i() / dVar.a()), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i l() {
        if (this.f2862h == null) {
            this.f2862h = this.f2857c.b(this.f2859e, this.f2856b, this.f2855a);
        }
        return this.f2862h;
    }

    @Override // G3.a
    public void a() {
        i l10 = l();
        if (l10 != null) {
            l10.a();
        }
        e();
    }

    @Override // G3.a
    public void b(int i10, int i11, Function0 function0) {
        if (i10 <= 0 || i11 <= 0 || this.f2860f <= 0 || this.f2861g <= 0) {
            return;
        }
        f j10 = j(i10, i11);
        i l10 = l();
        if (l10 != null) {
            int b10 = j10.b();
            int b11 = j10.b();
            if (function0 == null) {
                function0 = b.f2868a;
            }
            l10.b(b10, b11, function0);
        }
    }

    @Override // G3.a
    public AbstractC3142a c(int i10, int i11, int i12) {
        f j10 = j(i11, i12);
        i l10 = l();
        k c10 = l10 != null ? l10.c(i10, j10.b(), j10.a()) : null;
        if (c10 != null) {
            I3.d.f4265a.f(this.f2865k, c10);
        }
        if (c10 != null) {
            return c10.a();
        }
        return null;
    }

    @Override // G3.a
    public void d(G3.b bVar, E3.b bVar2, D3.a aVar, int i10, Function0 function0) {
        a.C0066a.e(this, bVar, bVar2, aVar, i10, function0);
    }

    @Override // G3.a
    public void e() {
        i l10 = l();
        if (l10 != null) {
            j.f4294c.b(this.f2859e, l10);
        }
        this.f2862h = null;
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2868a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }

        public final void a() {
        }
    }
}
