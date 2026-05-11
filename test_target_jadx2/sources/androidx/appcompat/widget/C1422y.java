package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import g.AbstractC3170a;

/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1422y extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    private final C1423z f14269a;

    public C1422y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33060H);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f14269a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f14269a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14269a.g(canvas);
    }

    public C1422y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d0.a(this, getContext());
        C1423z c1423z = new C1423z(this);
        this.f14269a = c1423z;
        c1423z.c(attributeSet, i10);
    }
}
