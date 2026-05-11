package com.facebook.react.views.text;

import android.text.Spannable;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Spannable f22813a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22814b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22815c;

    /* renamed from: d, reason: collision with root package name */
    private final float f22816d;

    /* renamed from: e, reason: collision with root package name */
    private final float f22817e;

    /* renamed from: f, reason: collision with root package name */
    private final float f22818f;

    /* renamed from: g, reason: collision with root package name */
    private final float f22819g;

    /* renamed from: h, reason: collision with root package name */
    private final int f22820h;

    /* renamed from: i, reason: collision with root package name */
    private final int f22821i;

    /* renamed from: j, reason: collision with root package name */
    private final int f22822j;

    public i(Spannable spannable, int i10, boolean z10, int i11, int i12, int i13) {
        this(spannable, i10, z10, -1.0f, -1.0f, -1.0f, -1.0f, i11, i12, i13);
    }

    public static i a(Spannable spannable, int i10, int i11, int i12, int i13) {
        return new i(spannable, i10, false, i11, i12, i13);
    }

    public boolean b() {
        return this.f22815c;
    }

    public int c() {
        return this.f22814b;
    }

    public int d() {
        return this.f22822j;
    }

    public float e() {
        return this.f22819g;
    }

    public float f() {
        return this.f22816d;
    }

    public float g() {
        return this.f22818f;
    }

    public float h() {
        return this.f22817e;
    }

    public Spannable i() {
        return this.f22813a;
    }

    public int j() {
        return this.f22820h;
    }

    public int k() {
        return this.f22821i;
    }

    public i(Spannable spannable, int i10, boolean z10, float f10, float f11, float f12, float f13, int i11, int i12, int i13) {
        this.f22813a = spannable;
        this.f22814b = i10;
        this.f22815c = z10;
        this.f22816d = f10;
        this.f22817e = f11;
        this.f22818f = f12;
        this.f22819g = f13;
        this.f22820h = i11;
        this.f22821i = i12;
        this.f22822j = i13;
    }
}
