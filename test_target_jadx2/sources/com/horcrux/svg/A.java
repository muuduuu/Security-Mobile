package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import c3.AbstractC1721a;
import c4.AbstractC1725b;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.horcrux.svg.events.SvgLoadEvent;
import f3.AbstractC3142a;
import g4.InterfaceC3189d;
import g4.InterfaceC3190e;
import java.util.concurrent.atomic.AtomicBoolean;
import l3.InterfaceC3606c;
import l5.C3609a;

/* loaded from: classes2.dex */
class A extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    private SVGLength f28831a;

    /* renamed from: b, reason: collision with root package name */
    private SVGLength f28832b;

    /* renamed from: c, reason: collision with root package name */
    private SVGLength f28833c;

    /* renamed from: d, reason: collision with root package name */
    private SVGLength f28834d;

    /* renamed from: e, reason: collision with root package name */
    private String f28835e;

    /* renamed from: f, reason: collision with root package name */
    private int f28836f;

    /* renamed from: g, reason: collision with root package name */
    private int f28837g;

    /* renamed from: h, reason: collision with root package name */
    private String f28838h;

    /* renamed from: i, reason: collision with root package name */
    private int f28839i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f28840j;

    class a extends AbstractC1725b {
        a() {
        }

        @Override // l3.AbstractC3605b
        public void e(InterfaceC3606c interfaceC3606c) {
            A.this.f28840j.set(false);
            AbstractC1721a.M("ReactNative", interfaceC3606c.e(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }

        @Override // c4.AbstractC1725b
        public void g(Bitmap bitmap) {
            A a10 = A.this;
            EventDispatcher c10 = L0.c(a10.mContext, a10.getId());
            int f10 = L0.f(A.this);
            int id2 = A.this.getId();
            A a11 = A.this;
            c10.c(new SvgLoadEvent(f10, id2, a11.mContext, a11.f28835e, bitmap.getWidth(), bitmap.getHeight()));
            A.this.f28840j.set(false);
            SvgView svgView = A.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public A(ReactContext reactContext) {
        super(reactContext);
        this.f28840j = new AtomicBoolean(false);
    }

    private void B(b4.k kVar, m4.b bVar, Canvas canvas, Paint paint, float f10) {
        InterfaceC3606c k10 = kVar.k(bVar, this.mContext);
        try {
            try {
                AbstractC3142a abstractC3142a = (AbstractC3142a) k10.b();
                try {
                    if (abstractC3142a == null) {
                        return;
                    }
                    try {
                        InterfaceC3190e interfaceC3190e = (InterfaceC3190e) abstractC3142a.p();
                        if (interfaceC3190e instanceof InterfaceC3189d) {
                            Bitmap p12 = ((InterfaceC3189d) interfaceC3190e).p1();
                            if (p12 == null) {
                                return;
                            }
                            t(canvas, paint, p12, f10);
                        }
                    } catch (Exception e10) {
                        throw new IllegalStateException(e10);
                    }
                } finally {
                    AbstractC3142a.n(abstractC3142a);
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        } finally {
            k10.close();
        }
    }

    private void t(Canvas canvas, Paint paint, Bitmap bitmap, float f10) {
        if (this.f28836f == 0 || this.f28837g == 0) {
            this.f28836f = bitmap.getWidth();
            this.f28837g = bitmap.getHeight();
        }
        RectF u10 = u();
        RectF rectF = new RectF(0.0f, 0.0f, this.f28836f, this.f28837g);
        o0.a(rectF, u10, this.f28838h, this.f28839i).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f10 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF u() {
        double relativeOnWidth = relativeOnWidth(this.f28831a);
        double relativeOnHeight = relativeOnHeight(this.f28832b);
        double relativeOnWidth2 = relativeOnWidth(this.f28833c);
        double relativeOnHeight2 = relativeOnHeight(this.f28834d);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = this.f28836f * this.mScale;
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = this.f28837g * this.mScale;
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    private void v(b4.k kVar, m4.b bVar) {
        this.f28840j.set(true);
        kVar.g(bVar, this.mContext).c(new a(), Z2.i.h());
    }

    public void A(Dynamic dynamic) {
        this.f28832b = SVGLength.b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f28840j.get()) {
            return;
        }
        b4.k a10 = r3.c.a();
        m4.b a11 = m4.b.a(new C3609a(this.mContext, this.f28835e).e());
        if (a10.q(a11)) {
            B(a10, a11, canvas, paint, f10 * this.mOpacity);
        } else {
            v(a10, a11);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        ((VirtualView) this).mPath = path;
        path.addRect(u(), Path.Direction.CW);
        return ((VirtualView) this).mPath;
    }

    public void setAlign(String str) {
        this.f28838h = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f28839i = i10;
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f28834d = SVGLength.b(dynamic);
        invalidate();
    }

    public void x(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f28835e = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                this.f28836f = readableMap.getInt("width");
                this.f28837g = readableMap.getInt("height");
            } else {
                this.f28836f = 0;
                this.f28837g = 0;
            }
            if (Uri.parse(this.f28835e).getScheme() == null) {
                l5.c.d().h(this.mContext, this.f28835e);
            }
        }
    }

    public void y(Dynamic dynamic) {
        this.f28833c = SVGLength.b(dynamic);
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f28831a = SVGLength.b(dynamic);
        invalidate();
    }
}
