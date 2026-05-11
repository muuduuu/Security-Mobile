package d5;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: d5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2991m extends Animation implements InterfaceC2988j {

    /* renamed from: a, reason: collision with root package name */
    private final View f31223a;

    /* renamed from: b, reason: collision with root package name */
    private float f31224b;

    /* renamed from: c, reason: collision with root package name */
    private float f31225c;

    /* renamed from: d, reason: collision with root package name */
    private float f31226d;

    /* renamed from: e, reason: collision with root package name */
    private float f31227e;

    /* renamed from: f, reason: collision with root package name */
    private int f31228f;

    /* renamed from: g, reason: collision with root package name */
    private int f31229g;

    /* renamed from: h, reason: collision with root package name */
    private int f31230h;

    /* renamed from: i, reason: collision with root package name */
    private int f31231i;

    public C2991m(View view, int i10, int i11, int i12, int i13) {
        this.f31223a = view;
        b(i10, i11, i12, i13);
    }

    private void b(int i10, int i11, int i12, int i13) {
        this.f31224b = this.f31223a.getX() - this.f31223a.getTranslationX();
        this.f31225c = this.f31223a.getY() - this.f31223a.getTranslationY();
        this.f31228f = this.f31223a.getWidth();
        int height = this.f31223a.getHeight();
        this.f31229g = height;
        this.f31226d = i10 - this.f31224b;
        this.f31227e = i11 - this.f31225c;
        this.f31230h = i12 - this.f31228f;
        this.f31231i = i13 - height;
    }

    @Override // d5.InterfaceC2988j
    public void a(int i10, int i11, int i12, int i13) {
        b(i10, i11, i12, i13);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation transformation) {
        float f11 = this.f31224b + (this.f31226d * f10);
        float f12 = this.f31225c + (this.f31227e * f10);
        this.f31223a.layout(Math.round(f11), Math.round(f12), Math.round(f11 + this.f31228f + (this.f31230h * f10)), Math.round(f12 + this.f31229g + (this.f31231i * f10)));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
