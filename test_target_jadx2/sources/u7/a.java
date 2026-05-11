package U7;

import H7.b;
import H7.k;
import H7.l;
import a8.AbstractC1367a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1419v;
import androidx.core.widget.c;
import com.google.android.material.internal.m;

/* loaded from: classes2.dex */
public class a extends C1419v {

    /* renamed from: g, reason: collision with root package name */
    private static final int f10345g = k.f3344t;

    /* renamed from: h, reason: collision with root package name */
    private static final int[][] f10346h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f10347e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10348f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f3115G);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10347e == null) {
            int d10 = M7.a.d(this, b.f3138k);
            int d11 = M7.a.d(this, b.f3140m);
            int d12 = M7.a.d(this, b.f3143p);
            int[][] iArr = f10346h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = M7.a.h(d12, d10, 1.0f);
            iArr2[1] = M7.a.h(d12, d11, 0.54f);
            iArr2[2] = M7.a.h(d12, d11, 0.38f);
            iArr2[3] = M7.a.h(d12, d11, 0.38f);
            this.f10347e = new ColorStateList(iArr, iArr2);
        }
        return this.f10347e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10348f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f10348f = z10;
        if (z10) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC1367a.c(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f10345g;
        Context context2 = getContext();
        TypedArray h10 = m.h(context2, attributeSet, l.f3562X3, i10, i11, new int[0]);
        if (h10.hasValue(l.f3571Y3)) {
            c.c(this, V7.c.a(context2, h10, l.f3571Y3));
        }
        this.f10348f = h10.getBoolean(l.f3580Z3, false);
        h10.recycle();
    }
}
