package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.views.image.d;
import m4.c;
import o5.o;
import v3.AbstractC4922b;
import y3.p;
import z3.C5249a;
import z3.C5250b;

/* loaded from: classes2.dex */
class b extends o {

    /* renamed from: b, reason: collision with root package name */
    private Drawable f22795b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4922b f22796c;

    /* renamed from: d, reason: collision with root package name */
    private final C3.b f22797d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f22798e;

    /* renamed from: f, reason: collision with root package name */
    private int f22799f;

    /* renamed from: g, reason: collision with root package name */
    private int f22800g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f22801h;

    /* renamed from: i, reason: collision with root package name */
    private int f22802i;

    /* renamed from: j, reason: collision with root package name */
    private ReadableMap f22803j;

    /* renamed from: k, reason: collision with root package name */
    private String f22804k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f22805l;

    public b(Resources resources, int i10, int i11, int i12, Uri uri, ReadableMap readableMap, AbstractC4922b abstractC4922b, Object obj, String str) {
        this.f22797d = new C3.b(C5250b.t(resources).a());
        this.f22796c = abstractC4922b;
        this.f22798e = obj;
        this.f22800g = i12;
        this.f22801h = uri == null ? Uri.EMPTY : uri;
        this.f22803j = readableMap;
        this.f22802i = (int) C1944g0.g(i11);
        this.f22799f = (int) C1944g0.g(i10);
        this.f22804k = str;
    }

    private p.b i(String str) {
        return d.c(str);
    }

    @Override // o5.o
    public Drawable a() {
        return this.f22795b;
    }

    @Override // o5.o
    public int b() {
        return this.f22799f;
    }

    @Override // o5.o
    public void c() {
        this.f22797d.j();
    }

    @Override // o5.o
    public void d() {
        this.f22797d.k();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (this.f22795b == null) {
            R4.a z10 = R4.a.z(c.w(this.f22801h), this.f22803j);
            ((C5249a) this.f22797d.g()).t(i(this.f22804k));
            this.f22797d.o(this.f22796c.x().D(this.f22797d.f()).z(this.f22798e).B(z10).a());
            this.f22796c.x();
            Drawable h10 = this.f22797d.h();
            this.f22795b = h10;
            h10.setBounds(0, 0, this.f22802i, this.f22799f);
            int i15 = this.f22800g;
            if (i15 != 0) {
                this.f22795b.setColorFilter(i15, PorterDuff.Mode.SRC_IN);
            }
            this.f22795b.setCallback(this.f22805l);
        }
        canvas.save();
        canvas.translate(f10, ((i13 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f22795b.getBounds().bottom - this.f22795b.getBounds().top) / 2));
        this.f22795b.draw(canvas);
        canvas.restore();
    }

    @Override // o5.o
    public void e() {
        this.f22797d.j();
    }

    @Override // o5.o
    public void f() {
        this.f22797d.k();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = -this.f22799f;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f22802i;
    }

    @Override // o5.o
    public void h(TextView textView) {
        this.f22805l = textView;
    }
}
