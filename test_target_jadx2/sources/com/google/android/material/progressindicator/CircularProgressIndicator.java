package com.google.android.material.progressindicator;

import H7.k;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public final class CircularProgressIndicator extends a {

    /* renamed from: p, reason: collision with root package name */
    public static final int f27298p = k.f3342r;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H7.b.f3137j);
    }

    private void s() {
        setIndeterminateDrawable(j.s(getContext(), (e) this.f27300a));
        setProgressDrawable(f.u(getContext(), (e) this.f27300a));
    }

    public int getIndicatorDirection() {
        return ((e) this.f27300a).f27345i;
    }

    public int getIndicatorInset() {
        return ((e) this.f27300a).f27344h;
    }

    public int getIndicatorSize() {
        return ((e) this.f27300a).f27343g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e i(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public void setIndicatorDirection(int i10) {
        ((e) this.f27300a).f27345i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        b bVar = this.f27300a;
        if (((e) bVar).f27344h != i10) {
            ((e) bVar).f27344h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        b bVar = this.f27300a;
        if (((e) bVar).f27343g != max) {
            ((e) bVar).f27343g = max;
            ((e) bVar).e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((e) this.f27300a).e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f27298p);
        s();
    }
}
