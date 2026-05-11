package g4;

import a4.C1349a;
import android.graphics.ColorSpace;
import b3.o;
import f3.AbstractC3142a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import org.conscrypt.BuildConfig;
import q4.C3919a;

/* loaded from: classes.dex */
public class i implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    private static boolean f33533n;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3142a f33534a;

    /* renamed from: b, reason: collision with root package name */
    private final o f33535b;

    /* renamed from: c, reason: collision with root package name */
    private S3.c f33536c;

    /* renamed from: d, reason: collision with root package name */
    private int f33537d;

    /* renamed from: e, reason: collision with root package name */
    private int f33538e;

    /* renamed from: f, reason: collision with root package name */
    private int f33539f;

    /* renamed from: g, reason: collision with root package name */
    private int f33540g;

    /* renamed from: h, reason: collision with root package name */
    private int f33541h;

    /* renamed from: i, reason: collision with root package name */
    private int f33542i;

    /* renamed from: j, reason: collision with root package name */
    private C1349a f33543j;

    /* renamed from: k, reason: collision with root package name */
    private ColorSpace f33544k;

    /* renamed from: l, reason: collision with root package name */
    private String f33545l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f33546m;

    public i(AbstractC3142a abstractC3142a) {
        this.f33536c = S3.c.f8736d;
        this.f33537d = -1;
        this.f33538e = 0;
        this.f33539f = -1;
        this.f33540g = -1;
        this.f33541h = 1;
        this.f33542i = -1;
        b3.l.b(Boolean.valueOf(AbstractC3142a.x(abstractC3142a)));
        this.f33534a = abstractC3142a.clone();
        this.f33535b = null;
    }

    private void C() {
        if (this.f33539f < 0 || this.f33540g < 0) {
            z();
        }
    }

    private q4.d F() {
        InputStream inputStream;
        try {
            inputStream = l();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            q4.d c10 = C3919a.c(inputStream);
            this.f33544k = c10.a();
            Pair b10 = c10.b();
            if (b10 != null) {
                this.f33539f = ((Integer) b10.getFirst()).intValue();
                this.f33540g = ((Integer) b10.getSecond()).intValue();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return c10;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private Pair H() {
        InputStream l10 = l();
        if (l10 == null) {
            return null;
        }
        Pair f10 = q4.h.f(l10);
        if (f10 != null) {
            this.f33539f = ((Integer) f10.getFirst()).intValue();
            this.f33540g = ((Integer) f10.getSecond()).intValue();
        }
        return f10;
    }

    public static i b(i iVar) {
        if (iVar != null) {
            return iVar.a();
        }
        return null;
    }

    public static void c(i iVar) {
        if (iVar != null) {
            iVar.close();
        }
    }

    private void s() {
        S3.c c10 = S3.d.c(l());
        this.f33536c = c10;
        Pair H10 = S3.b.b(c10) ? H() : F().b();
        if (c10 == S3.b.f8722b && this.f33537d == -1) {
            if (H10 != null) {
                int b10 = q4.e.b(l());
                this.f33538e = b10;
                this.f33537d = q4.e.a(b10);
                return;
            }
            return;
        }
        if (c10 == S3.b.f8732l && this.f33537d == -1) {
            int a10 = q4.c.a(l());
            this.f33538e = a10;
            this.f33537d = q4.e.a(a10);
        } else if (this.f33537d == -1) {
            this.f33537d = 0;
        }
    }

    public static boolean u(i iVar) {
        return iVar.f33537d >= 0 && iVar.f33539f >= 0 && iVar.f33540g >= 0;
    }

    public static boolean y(i iVar) {
        return iVar != null && iVar.x();
    }

    public void I(C1349a c1349a) {
        this.f33543j = c1349a;
    }

    public void K(int i10) {
        this.f33538e = i10;
    }

    public void N(int i10) {
        this.f33540g = i10;
    }

    public void Q(S3.c cVar) {
        this.f33536c = cVar;
    }

    public i a() {
        i iVar;
        o oVar = this.f33535b;
        if (oVar != null) {
            iVar = new i(oVar, this.f33542i);
        } else {
            AbstractC3142a i10 = AbstractC3142a.i(this.f33534a);
            if (i10 == null) {
                iVar = null;
            } else {
                try {
                    iVar = new i(i10);
                } finally {
                    AbstractC3142a.n(i10);
                }
            }
        }
        if (iVar != null) {
            iVar.d(this);
        }
        return iVar;
    }

    public int c2() {
        C();
        return this.f33538e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC3142a.n(this.f33534a);
    }

    public void d(i iVar) {
        this.f33536c = iVar.j();
        this.f33539f = iVar.getWidth();
        this.f33540g = iVar.getHeight();
        this.f33537d = iVar.t0();
        this.f33538e = iVar.c2();
        this.f33541h = iVar.o();
        this.f33542i = iVar.p();
        this.f33543j = iVar.f();
        this.f33544k = iVar.g();
        this.f33546m = iVar.r();
    }

    public AbstractC3142a e() {
        return AbstractC3142a.i(this.f33534a);
    }

    public C1349a f() {
        return this.f33543j;
    }

    public ColorSpace g() {
        C();
        return this.f33544k;
    }

    public int getHeight() {
        C();
        return this.f33540g;
    }

    public int getWidth() {
        C();
        return this.f33539f;
    }

    public String i(int i10) {
        AbstractC3142a e10 = e();
        if (e10 == null) {
            return BuildConfig.FLAVOR;
        }
        int min = Math.min(p(), i10);
        byte[] bArr = new byte[min];
        try {
            e3.h hVar = (e3.h) e10.p();
            if (hVar == null) {
                return BuildConfig.FLAVOR;
            }
            hVar.E(0, bArr, 0, min);
            e10.close();
            StringBuilder sb2 = new StringBuilder(min * 2);
            for (int i11 = 0; i11 < min; i11++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i11])));
            }
            return sb2.toString();
        } finally {
            e10.close();
        }
    }

    public void i0(int i10) {
        this.f33537d = i10;
    }

    public S3.c j() {
        C();
        return this.f33536c;
    }

    public InputStream l() {
        o oVar = this.f33535b;
        if (oVar != null) {
            return (InputStream) oVar.get();
        }
        AbstractC3142a i10 = AbstractC3142a.i(this.f33534a);
        if (i10 == null) {
            return null;
        }
        try {
            return new e3.j((e3.h) i10.p());
        } finally {
            AbstractC3142a.n(i10);
        }
    }

    public InputStream n() {
        return (InputStream) b3.l.g(l());
    }

    public int o() {
        return this.f33541h;
    }

    public void o0(int i10) {
        this.f33541h = i10;
    }

    public int p() {
        AbstractC3142a abstractC3142a = this.f33534a;
        return (abstractC3142a == null || abstractC3142a.p() == null) ? this.f33542i : ((e3.h) this.f33534a.p()).size();
    }

    public String q() {
        return this.f33545l;
    }

    protected boolean r() {
        return this.f33546m;
    }

    public boolean t(int i10) {
        S3.c cVar = this.f33536c;
        if ((cVar != S3.b.f8722b && cVar != S3.b.f8733m) || this.f33535b != null) {
            return true;
        }
        b3.l.g(this.f33534a);
        e3.h hVar = (e3.h) this.f33534a.p();
        return hVar.B(i10 + (-2)) == -1 && hVar.B(i10 - 1) == -39;
    }

    public int t0() {
        C();
        return this.f33537d;
    }

    public synchronized boolean x() {
        boolean z10;
        if (!AbstractC3142a.x(this.f33534a)) {
            z10 = this.f33535b != null;
        }
        return z10;
    }

    public void y0(String str) {
        this.f33545l = str;
    }

    public void z() {
        if (!f33533n) {
            s();
        } else {
            if (this.f33546m) {
                return;
            }
            s();
            this.f33546m = true;
        }
    }

    public void z0(int i10) {
        this.f33539f = i10;
    }

    public i(o oVar) {
        this.f33536c = S3.c.f8736d;
        this.f33537d = -1;
        this.f33538e = 0;
        this.f33539f = -1;
        this.f33540g = -1;
        this.f33541h = 1;
        this.f33542i = -1;
        b3.l.g(oVar);
        this.f33534a = null;
        this.f33535b = oVar;
    }

    public i(o oVar, int i10) {
        this(oVar);
        this.f33542i = i10;
    }
}
