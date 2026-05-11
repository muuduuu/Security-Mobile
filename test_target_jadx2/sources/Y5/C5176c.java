package y5;

/* renamed from: y5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5176c {

    /* renamed from: a, reason: collision with root package name */
    protected final C5175b f45326a;

    /* renamed from: b, reason: collision with root package name */
    protected final Object f45327b;

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f45328c;

    /* renamed from: d, reason: collision with root package name */
    protected final C5.a f45329d;

    /* renamed from: e, reason: collision with root package name */
    protected byte[] f45330e;

    /* renamed from: f, reason: collision with root package name */
    protected char[] f45331f;

    /* renamed from: g, reason: collision with root package name */
    protected char[] f45332g;

    public C5176c(C5.a aVar, C5175b c5175b, boolean z10) {
        this.f45329d = aVar;
        this.f45326a = c5175b;
        this.f45327b = c5175b.b();
        this.f45328c = z10;
    }

    private IllegalArgumentException j() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    protected final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw j();
        }
    }

    protected final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw j();
        }
    }

    public byte[] d() {
        a(this.f45330e);
        byte[] a10 = this.f45329d.a(3);
        this.f45330e = a10;
        return a10;
    }

    public char[] e() {
        a(this.f45331f);
        char[] c10 = this.f45329d.c(1);
        this.f45331f = c10;
        return c10;
    }

    public boolean f() {
        return this.f45328c;
    }

    public void g(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f45330e);
            this.f45330e = null;
            this.f45329d.i(3, bArr);
        }
    }

    public void h(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f45331f);
            this.f45331f = null;
            this.f45329d.j(1, cArr);
        }
    }

    public void i(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f45332g);
            this.f45332g = null;
            this.f45329d.j(3, cArr);
        }
    }
}
