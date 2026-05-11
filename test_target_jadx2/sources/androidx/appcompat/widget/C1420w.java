package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import g.AbstractC3170a;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1420w extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private final C1418u f14268a;

    public C1420w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33058F);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap b10 = this.f14268a.b();
        if (b10 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b10.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public C1420w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d0.a(this, getContext());
        C1418u c1418u = new C1418u(this);
        this.f14268a = c1418u;
        c1418u.c(attributeSet, i10);
    }
}
