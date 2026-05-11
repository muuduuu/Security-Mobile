package androidx.appcompat.widget;

/* loaded from: classes.dex */
class Z {

    /* renamed from: a, reason: collision with root package name */
    private int f14006a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f14007b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f14008c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f14009d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f14010e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f14011f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14012g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14013h = false;

    Z() {
    }

    public int a() {
        return this.f14012g ? this.f14006a : this.f14007b;
    }

    public int b() {
        return this.f14006a;
    }

    public int c() {
        return this.f14007b;
    }

    public int d() {
        return this.f14012g ? this.f14007b : this.f14006a;
    }

    public void e(int i10, int i11) {
        this.f14013h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f14010e = i10;
            this.f14006a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14011f = i11;
            this.f14007b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f14012g) {
            return;
        }
        this.f14012g = z10;
        if (!this.f14013h) {
            this.f14006a = this.f14010e;
            this.f14007b = this.f14011f;
            return;
        }
        if (z10) {
            int i10 = this.f14009d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f14010e;
            }
            this.f14006a = i10;
            int i11 = this.f14008c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f14011f;
            }
            this.f14007b = i11;
            return;
        }
        int i12 = this.f14008c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f14010e;
        }
        this.f14006a = i12;
        int i13 = this.f14009d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f14011f;
        }
        this.f14007b = i13;
    }

    public void g(int i10, int i11) {
        this.f14008c = i10;
        this.f14009d = i11;
        this.f14013h = true;
        if (this.f14012g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14006a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14007b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14006a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14007b = i11;
        }
    }
}
