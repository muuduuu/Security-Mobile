package na;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: na.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3720c extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    private static final String f37590c = "c";

    /* renamed from: a, reason: collision with root package name */
    InterfaceC3719b f37591a;

    /* renamed from: b, reason: collision with root package name */
    private int f37592b;

    public C3720c(Context context) {
        super(context);
        this.f37591a = new C3723f();
        a(null, 0);
    }

    private void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC3725h.f37607a, i10, 0);
        this.f37592b = obtainStyledAttributes.getColor(AbstractC3725h.f37608b, 0);
        obtainStyledAttributes.recycle();
    }

    private InterfaceC3718a getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new p() : new q(getContext());
    }

    public InterfaceC3722e b(boolean z10) {
        return this.f37591a.f(z10);
    }

    public InterfaceC3722e c(float f10) {
        return this.f37591a.g(f10);
    }

    public InterfaceC3722e d(int i10) {
        this.f37592b = i10;
        return this.f37591a.b(i10);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f37591a.e(canvas)) {
            super.draw(canvas);
        }
    }

    public InterfaceC3722e e(ViewGroup viewGroup, InterfaceC3718a interfaceC3718a) {
        this.f37591a.destroy();
        C3724g c3724g = new C3724g(this, viewGroup, this.f37592b, interfaceC3718a);
        this.f37591a = c3724g;
        return c3724g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f37591a.a(true);
        } else {
            Log.e(f37590c, "BlurView can't be used in not hardware-accelerated window!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37591a.a(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f37591a.d();
    }
}
