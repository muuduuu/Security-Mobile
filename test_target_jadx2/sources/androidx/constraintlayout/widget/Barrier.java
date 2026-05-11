package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o0.C3736a;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: j, reason: collision with root package name */
    private int f14958j;

    /* renamed from: k, reason: collision with root package name */
    private int f14959k;

    /* renamed from: l, reason: collision with root package name */
    private C3736a f14960l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(o0.e eVar, int i10, boolean z10) {
        this.f14959k = i10;
        if (z10) {
            int i11 = this.f14958j;
            if (i11 == 5) {
                this.f14959k = 1;
            } else if (i11 == 6) {
                this.f14959k = 0;
            }
        } else {
            int i12 = this.f14958j;
            if (i12 == 5) {
                this.f14959k = 0;
            } else if (i12 == 6) {
                this.f14959k = 1;
            }
        }
        if (eVar instanceof C3736a) {
            ((C3736a) eVar).w1(this.f14959k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f14960l.q1();
    }

    public int getMargin() {
        return this.f14960l.s1();
    }

    public int getType() {
        return this.f14958j;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f14960l = new C3736a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f15540n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f15596u1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.f15588t1) {
                    this.f14960l.v1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == g.f15604v1) {
                    this.f14960l.x1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f15058d = this.f14960l;
        o();
    }

    @Override // androidx.constraintlayout.widget.b
    public void j(o0.e eVar, boolean z10) {
        p(eVar, this.f14958j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f14960l.v1(z10);
    }

    public void setDpMargin(int i10) {
        this.f14960l.x1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f14960l.x1(i10);
    }

    public void setType(int i10) {
        this.f14958j = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
