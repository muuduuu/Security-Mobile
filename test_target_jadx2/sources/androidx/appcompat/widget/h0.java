package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.f;
import h.AbstractC3220a;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14161a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f14162b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f14163c;

    private h0(Context context, TypedArray typedArray) {
        this.f14161a = context;
        this.f14162b = typedArray;
    }

    public static h0 t(Context context, int i10, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static h0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static h0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f14162b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f14162b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f14162b.hasValue(i10) || (resourceId = this.f14162b.getResourceId(i10, 0)) == 0 || (a10 = AbstractC3220a.a(this.f14161a, resourceId)) == null) ? this.f14162b.getColorStateList(i10) : a10;
    }

    public float d(int i10, float f10) {
        return this.f14162b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f14162b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f14162b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f14162b.hasValue(i10) || (resourceId = this.f14162b.getResourceId(i10, 0)) == 0) ? this.f14162b.getDrawable(i10) : AbstractC3220a.b(this.f14161a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f14162b.hasValue(i10) || (resourceId = this.f14162b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C1409k.b().d(this.f14161a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f14162b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, f.e eVar) {
        int resourceId = this.f14162b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f14163c == null) {
            this.f14163c = new TypedValue();
        }
        return androidx.core.content.res.f.i(this.f14161a, resourceId, this.f14163c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f14162b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f14162b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f14162b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f14162b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f14162b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f14162b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f14162b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f14162b;
    }

    public boolean s(int i10) {
        return this.f14162b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f14162b.peekValue(i10);
    }

    public void x() {
        this.f14162b.recycle();
    }
}
