package L7;

import H7.b;
import H7.k;
import H7.l;
import a8.AbstractC1367a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1405g;
import androidx.core.widget.c;
import com.google.android.material.internal.m;
import com.google.android.material.internal.o;

/* loaded from: classes2.dex */
public class a extends C1405g {

    /* renamed from: h, reason: collision with root package name */
    private static final int f5702h = k.f3343s;

    /* renamed from: i, reason: collision with root package name */
    private static final int[][] f5703i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f5704e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5705f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5706g;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f3134g);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5704e == null) {
            int[][] iArr = f5703i;
            int[] iArr2 = new int[iArr.length];
            int d10 = M7.a.d(this, b.f3138k);
            int d11 = M7.a.d(this, b.f3143p);
            int d12 = M7.a.d(this, b.f3140m);
            iArr2[0] = M7.a.h(d11, d10, 1.0f);
            iArr2[1] = M7.a.h(d11, d12, 0.54f);
            iArr2[2] = M7.a.h(d11, d12, 0.38f);
            iArr2[3] = M7.a.h(d11, d12, 0.38f);
            this.f5704e = new ColorStateList(iArr, iArr2);
        }
        return this.f5704e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5705f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a10;
        if (!this.f5706g || !TextUtils.isEmpty(getText()) || (a10 = c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (o.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            androidx.core.graphics.drawable.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f5706g = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f5705f = z10;
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
        int i11 = f5702h;
        Context context2 = getContext();
        TypedArray h10 = m.h(context2, attributeSet, l.f3517S3, i10, i11, new int[0]);
        if (h10.hasValue(l.f3526T3)) {
            c.c(this, V7.c.a(context2, h10, l.f3526T3));
        }
        this.f5705f = h10.getBoolean(l.f3544V3, false);
        this.f5706g = h10.getBoolean(l.f3535U3, true);
        h10.recycle();
    }
}
