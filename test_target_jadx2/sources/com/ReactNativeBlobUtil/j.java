package com.ReactNativeBlobUtil;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private long f19915a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f19916b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f19917c;

    /* renamed from: d, reason: collision with root package name */
    private int f19918d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19919e;

    /* renamed from: f, reason: collision with root package name */
    private a f19920f;

    enum a {
        Upload,
        Download
    }

    j(boolean z10, int i10, int i11, a aVar) {
        this.f19917c = -1;
        this.f19918d = -1;
        this.f19919e = false;
        a aVar2 = a.Upload;
        this.f19919e = z10;
        this.f19918d = i10;
        this.f19920f = aVar;
        this.f19917c = i11;
    }

    public boolean a(float f10) {
        int i10 = this.f19917c;
        boolean z10 = false;
        boolean z11 = i10 <= 0 || f10 <= 0.0f || Math.floor((double) (f10 * ((float) i10))) > ((double) this.f19916b);
        if (System.currentTimeMillis() - this.f19915a > this.f19918d && this.f19919e && z11) {
            z10 = true;
        }
        if (z10) {
            this.f19916b++;
            this.f19915a = System.currentTimeMillis();
        }
        return z10;
    }
}
