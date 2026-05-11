package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3179j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class E {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f13740l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f13741m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f13742a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13743b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f13744c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f13745d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f13746e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f13747f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f13748g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f13749h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f13750i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f13751j;

    /* renamed from: k, reason: collision with root package name */
    private final d f13752k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) E.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.E.b, androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.E.d
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) E.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    E(TextView textView) {
        this.f13750i = textView;
        this.f13751j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13752k = new c();
        } else {
            this.f13752k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f13742a = 0;
        this.f13745d = -1.0f;
        this.f13746e = -1.0f;
        this.f13744c = -1.0f;
        this.f13747f = new int[0];
        this.f13743b = false;
    }

    private int e(RectF rectF) {
        int length = this.f13747f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f13747f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f13747f[i12];
    }

    private static Method k(String str) {
        try {
            Method method = (Method) f13741m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                f13741m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    private void s(float f10) {
        if (f10 != this.f13750i.getPaint().getTextSize()) {
            this.f13750i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f13750i.isInLayout();
            if (this.f13750i.getLayout() != null) {
                this.f13743b = false;
                try {
                    Method k10 = k("nullLayouts");
                    if (k10 != null) {
                        k10.invoke(this.f13750i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (isInLayout) {
                    this.f13750i.forceLayout();
                } else {
                    this.f13750i.requestLayout();
                }
                this.f13750i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f13742a == 1) {
            if (!this.f13748g || this.f13747f.length == 0) {
                int floor = ((int) Math.floor((this.f13746e - this.f13745d) / this.f13744c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f13745d + (i10 * this.f13744c));
                }
                this.f13747f = b(iArr);
            }
            this.f13743b = true;
        } else {
            this.f13743b = false;
        }
        return this.f13743b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f13747f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10 = this.f13747f.length > 0;
        this.f13748g = z10;
        if (z10) {
            this.f13742a = 1;
            this.f13745d = r0[0];
            this.f13746e = r0[r1 - 1];
            this.f13744c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f13750i.getText();
        TransformationMethod transformationMethod = this.f13750i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f13750i)) != null) {
            text = transformation;
        }
        int maxLines = this.f13750i.getMaxLines();
        l(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) m(this.f13750i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d10.getLineCount() <= maxLines && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f13750i instanceof C1410l);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f13742a = 1;
        this.f13745d = f10;
        this.f13746e = f11;
        this.f13744c = f12;
        this.f13748g = false;
    }

    void a() {
        if (n()) {
            if (this.f13743b) {
                if (this.f13750i.getMeasuredHeight() <= 0 || this.f13750i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f13752k.b(this.f13750i) ? 1048576 : (this.f13750i.getMeasuredWidth() - this.f13750i.getTotalPaddingLeft()) - this.f13750i.getTotalPaddingRight();
                int height = (this.f13750i.getHeight() - this.f13750i.getCompoundPaddingBottom()) - this.f13750i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f13740l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float e10 = e(rectF);
                        if (e10 != this.f13750i.getTextSize()) {
                            t(0, e10);
                        }
                    } finally {
                    }
                }
            }
            this.f13743b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f13750i, this.f13749h, this.f13752k);
    }

    int f() {
        return Math.round(this.f13746e);
    }

    int g() {
        return Math.round(this.f13745d);
    }

    int h() {
        return Math.round(this.f13744c);
    }

    int[] i() {
        return this.f13747f;
    }

    int j() {
        return this.f13742a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f13749h;
        if (textPaint == null) {
            this.f13749h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f13749h.set(this.f13750i.getPaint());
        this.f13749h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f13742a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f13751j.obtainStyledAttributes(attributeSet, AbstractC3179j.f33393g0, i10, 0);
        TextView textView = this.f13750i;
        AbstractC1484a0.o0(textView, textView.getContext(), AbstractC3179j.f33393g0, attributeSet, obtainStyledAttributes, i10, 0);
        if (obtainStyledAttributes.hasValue(AbstractC3179j.f33418l0)) {
            this.f13742a = obtainStyledAttributes.getInt(AbstractC3179j.f33418l0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(AbstractC3179j.f33413k0) ? obtainStyledAttributes.getDimension(AbstractC3179j.f33413k0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(AbstractC3179j.f33403i0) ? obtainStyledAttributes.getDimension(AbstractC3179j.f33403i0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(AbstractC3179j.f33398h0) ? obtainStyledAttributes.getDimension(AbstractC3179j.f33398h0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(AbstractC3179j.f33408j0) && (resourceId = obtainStyledAttributes.getResourceId(AbstractC3179j.f33408j0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f13742a = 0;
            return;
        }
        if (this.f13742a == 1) {
            if (!this.f13748g) {
                DisplayMetrics displayMetrics = this.f13751j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f13751j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f13751j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f13747f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f13748g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f13751j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f13751j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
