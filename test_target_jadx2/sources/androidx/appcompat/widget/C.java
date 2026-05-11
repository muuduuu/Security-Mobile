package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.f;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3179j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f13701a;

    /* renamed from: b, reason: collision with root package name */
    private f0 f13702b;

    /* renamed from: c, reason: collision with root package name */
    private f0 f13703c;

    /* renamed from: d, reason: collision with root package name */
    private f0 f13704d;

    /* renamed from: e, reason: collision with root package name */
    private f0 f13705e;

    /* renamed from: f, reason: collision with root package name */
    private f0 f13706f;

    /* renamed from: g, reason: collision with root package name */
    private f0 f13707g;

    /* renamed from: h, reason: collision with root package name */
    private f0 f13708h;

    /* renamed from: i, reason: collision with root package name */
    private final E f13709i;

    /* renamed from: j, reason: collision with root package name */
    private int f13710j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f13711k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f13712l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13713m;

    class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13714a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13715b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f13716c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f13714a = i10;
            this.f13715b = i11;
            this.f13716c = weakReference;
        }

        @Override // androidx.core.content.res.f.e
        /* renamed from: h */
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.f.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f13714a) != -1) {
                typeface = e.a(typeface, i10, (this.f13715b & 2) != 0);
            }
            C.this.n(this.f13716c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f13718a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f13719b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13720c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f13718a = textView;
            this.f13719b = typeface;
            this.f13720c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13718a.setTypeface(this.f13719b, this.f13720c);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    C(TextView textView) {
        this.f13701a = textView;
        this.f13709i = new E(textView);
    }

    private void B(int i10, float f10) {
        this.f13709i.t(i10, f10);
    }

    private void C(Context context, h0 h0Var) {
        String o10;
        this.f13710j = h0Var.k(AbstractC3179j.f33345V2, this.f13710j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int k10 = h0Var.k(AbstractC3179j.f33357Y2, -1);
            this.f13711k = k10;
            if (k10 != -1) {
                this.f13710j &= 2;
            }
        }
        if (!h0Var.s(AbstractC3179j.f33353X2) && !h0Var.s(AbstractC3179j.f33361Z2)) {
            if (h0Var.s(AbstractC3179j.f33341U2)) {
                this.f13713m = false;
                int k11 = h0Var.k(AbstractC3179j.f33341U2, 1);
                if (k11 == 1) {
                    this.f13712l = Typeface.SANS_SERIF;
                    return;
                } else if (k11 == 2) {
                    this.f13712l = Typeface.SERIF;
                    return;
                } else {
                    if (k11 != 3) {
                        return;
                    }
                    this.f13712l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f13712l = null;
        int i11 = h0Var.s(AbstractC3179j.f33361Z2) ? AbstractC3179j.f33361Z2 : AbstractC3179j.f33353X2;
        int i12 = this.f13711k;
        int i13 = this.f13710j;
        if (!context.isRestricted()) {
            try {
                Typeface j10 = h0Var.j(i11, this.f13710j, new a(i12, i13, new WeakReference(this.f13701a)));
                if (j10 != null) {
                    if (i10 < 28 || this.f13711k == -1) {
                        this.f13712l = j10;
                    } else {
                        this.f13712l = e.a(Typeface.create(j10, 0), this.f13711k, (this.f13710j & 2) != 0);
                    }
                }
                this.f13713m = this.f13712l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f13712l != null || (o10 = h0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f13711k == -1) {
            this.f13712l = Typeface.create(o10, this.f13710j);
        } else {
            this.f13712l = e.a(Typeface.create(o10, 0), this.f13711k, (this.f13710j & 2) != 0);
        }
    }

    private void a(Drawable drawable, f0 f0Var) {
        if (drawable == null || f0Var == null) {
            return;
        }
        C1409k.i(drawable, f0Var, this.f13701a.getDrawableState());
    }

    private static f0 d(Context context, C1409k c1409k, int i10) {
        ColorStateList f10 = c1409k.f(context, i10);
        if (f10 == null) {
            return null;
        }
        f0 f0Var = new f0();
        f0Var.f14151d = true;
        f0Var.f14148a = f10;
        return f0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f13701a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f13701a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f13701a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f13701a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f13701a.getCompoundDrawables();
        TextView textView2 = this.f13701a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        f0 f0Var = this.f13708h;
        this.f13702b = f0Var;
        this.f13703c = f0Var;
        this.f13704d = f0Var;
        this.f13705e = f0Var;
        this.f13706f = f0Var;
        this.f13707g = f0Var;
    }

    void A(int i10, float f10) {
        if (s0.f14258c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f13702b != null || this.f13703c != null || this.f13704d != null || this.f13705e != null) {
            Drawable[] compoundDrawables = this.f13701a.getCompoundDrawables();
            a(compoundDrawables[0], this.f13702b);
            a(compoundDrawables[1], this.f13703c);
            a(compoundDrawables[2], this.f13704d);
            a(compoundDrawables[3], this.f13705e);
        }
        if (this.f13706f == null && this.f13707g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f13701a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f13706f);
        a(compoundDrawablesRelative[2], this.f13707g);
    }

    void c() {
        this.f13709i.a();
    }

    int e() {
        return this.f13709i.f();
    }

    int f() {
        return this.f13709i.g();
    }

    int g() {
        return this.f13709i.h();
    }

    int[] h() {
        return this.f13709i.i();
    }

    int i() {
        return this.f13709i.j();
    }

    ColorStateList j() {
        f0 f0Var = this.f13708h;
        if (f0Var != null) {
            return f0Var.f14148a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        f0 f0Var = this.f13708h;
        if (f0Var != null) {
            return f0Var.f14149b;
        }
        return null;
    }

    boolean l() {
        return this.f13709i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        boolean z12;
        float f10;
        int i11;
        Context context = this.f13701a.getContext();
        C1409k b10 = C1409k.b();
        h0 v10 = h0.v(context, attributeSet, AbstractC3179j.f33354Y, i10, 0);
        TextView textView = this.f13701a;
        AbstractC1484a0.o0(textView, textView.getContext(), AbstractC3179j.f33354Y, attributeSet, v10.r(), i10, 0);
        int n10 = v10.n(AbstractC3179j.f33358Z, -1);
        if (v10.s(AbstractC3179j.f33373c0)) {
            this.f13702b = d(context, b10, v10.n(AbstractC3179j.f33373c0, 0));
        }
        if (v10.s(AbstractC3179j.f33363a0)) {
            this.f13703c = d(context, b10, v10.n(AbstractC3179j.f33363a0, 0));
        }
        if (v10.s(AbstractC3179j.f33378d0)) {
            this.f13704d = d(context, b10, v10.n(AbstractC3179j.f33378d0, 0));
        }
        if (v10.s(AbstractC3179j.f33368b0)) {
            this.f13705e = d(context, b10, v10.n(AbstractC3179j.f33368b0, 0));
        }
        if (v10.s(AbstractC3179j.f33383e0)) {
            this.f13706f = d(context, b10, v10.n(AbstractC3179j.f33383e0, 0));
        }
        if (v10.s(AbstractC3179j.f33388f0)) {
            this.f13707g = d(context, b10, v10.n(AbstractC3179j.f33388f0, 0));
        }
        v10.x();
        boolean z13 = this.f13701a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n10 != -1) {
            h0 t10 = h0.t(context, n10, AbstractC3179j.f33333S2);
            if (z13 || !t10.s(AbstractC3179j.f33371b3)) {
                z10 = false;
                z11 = false;
            } else {
                z10 = t10.a(AbstractC3179j.f33371b3, false);
                z11 = true;
            }
            C(context, t10);
            int i12 = Build.VERSION.SDK_INT;
            str2 = t10.s(AbstractC3179j.f33376c3) ? t10.o(AbstractC3179j.f33376c3) : null;
            str = (i12 < 26 || !t10.s(AbstractC3179j.f33366a3)) ? null : t10.o(AbstractC3179j.f33366a3);
            t10.x();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        h0 v11 = h0.v(context, attributeSet, AbstractC3179j.f33333S2, i10, 0);
        if (z13 || !v11.s(AbstractC3179j.f33371b3)) {
            z12 = z11;
        } else {
            z10 = v11.a(AbstractC3179j.f33371b3, false);
            z12 = true;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (v11.s(AbstractC3179j.f33376c3)) {
            str2 = v11.o(AbstractC3179j.f33376c3);
        }
        if (i13 >= 26 && v11.s(AbstractC3179j.f33366a3)) {
            str = v11.o(AbstractC3179j.f33366a3);
        }
        if (i13 >= 28 && v11.s(AbstractC3179j.f33337T2) && v11.f(AbstractC3179j.f33337T2, -1) == 0) {
            this.f13701a.setTextSize(0, 0.0f);
        }
        C(context, v11);
        v11.x();
        if (!z13 && z12) {
            s(z10);
        }
        Typeface typeface = this.f13712l;
        if (typeface != null) {
            if (this.f13711k == -1) {
                this.f13701a.setTypeface(typeface, this.f13710j);
            } else {
                this.f13701a.setTypeface(typeface);
            }
        }
        if (str != null) {
            d.d(this.f13701a, str);
        }
        if (str2 != null) {
            c.b(this.f13701a, c.a(str2));
        }
        this.f13709i.o(attributeSet, i10);
        if (s0.f14258c && this.f13709i.j() != 0) {
            int[] i14 = this.f13709i.i();
            if (i14.length > 0) {
                if (d.a(this.f13701a) != -1.0f) {
                    d.b(this.f13701a, this.f13709i.g(), this.f13709i.f(), this.f13709i.h(), 0);
                } else {
                    d.c(this.f13701a, i14, 0);
                }
            }
        }
        h0 u10 = h0.u(context, attributeSet, AbstractC3179j.f33393g0);
        int n11 = u10.n(AbstractC3179j.f33433o0, -1);
        Drawable c10 = n11 != -1 ? b10.c(context, n11) : null;
        int n12 = u10.n(AbstractC3179j.f33458t0, -1);
        Drawable c11 = n12 != -1 ? b10.c(context, n12) : null;
        int n13 = u10.n(AbstractC3179j.f33438p0, -1);
        Drawable c12 = n13 != -1 ? b10.c(context, n13) : null;
        int n14 = u10.n(AbstractC3179j.f33423m0, -1);
        Drawable c13 = n14 != -1 ? b10.c(context, n14) : null;
        int n15 = u10.n(AbstractC3179j.f33443q0, -1);
        Drawable c14 = n15 != -1 ? b10.c(context, n15) : null;
        int n16 = u10.n(AbstractC3179j.f33428n0, -1);
        y(c10, c11, c12, c13, c14, n16 != -1 ? b10.c(context, n16) : null);
        if (u10.s(AbstractC3179j.f33448r0)) {
            androidx.core.widget.k.h(this.f13701a, u10.c(AbstractC3179j.f33448r0));
        }
        if (u10.s(AbstractC3179j.f33453s0)) {
            androidx.core.widget.k.i(this.f13701a, O.e(u10.k(AbstractC3179j.f33453s0, -1), null));
        }
        int f11 = u10.f(AbstractC3179j.f33468v0, -1);
        int f12 = u10.f(AbstractC3179j.f33473w0, -1);
        if (u10.s(AbstractC3179j.f33478x0)) {
            TypedValue w10 = u10.w(AbstractC3179j.f33478x0);
            if (w10 != null && w10.type == 5) {
                i11 = y0.i.a(w10.data);
                f10 = TypedValue.complexToFloat(w10.data);
                u10.x();
                if (f11 != -1) {
                    androidx.core.widget.k.k(this.f13701a, f11);
                }
                if (f12 != -1) {
                    androidx.core.widget.k.l(this.f13701a, f12);
                }
                if (f10 == -1.0f) {
                    if (i11 == -1) {
                        androidx.core.widget.k.m(this.f13701a, (int) f10);
                        return;
                    } else {
                        androidx.core.widget.k.n(this.f13701a, i11, f10);
                        return;
                    }
                }
                return;
            }
            f10 = u10.f(AbstractC3179j.f33478x0, -1);
        } else {
            f10 = -1.0f;
        }
        i11 = -1;
        u10.x();
        if (f11 != -1) {
        }
        if (f12 != -1) {
        }
        if (f10 == -1.0f) {
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f13713m) {
            this.f13712l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f13710j));
                } else {
                    textView.setTypeface(typeface, this.f13710j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (s0.f14258c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String o10;
        h0 t10 = h0.t(context, i10, AbstractC3179j.f33333S2);
        if (t10.s(AbstractC3179j.f33371b3)) {
            s(t10.a(AbstractC3179j.f33371b3, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (t10.s(AbstractC3179j.f33337T2) && t10.f(AbstractC3179j.f33337T2, -1) == 0) {
            this.f13701a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i11 >= 26 && t10.s(AbstractC3179j.f33366a3) && (o10 = t10.o(AbstractC3179j.f33366a3)) != null) {
            d.d(this.f13701a, o10);
        }
        t10.x();
        Typeface typeface = this.f13712l;
        if (typeface != null) {
            this.f13701a.setTypeface(typeface, this.f13710j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C0.c.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f13701a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f13709i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f13709i.q(iArr, i10);
    }

    void v(int i10) {
        this.f13709i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f13708h == null) {
            this.f13708h = new f0();
        }
        f0 f0Var = this.f13708h;
        f0Var.f14148a = colorStateList;
        f0Var.f14151d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f13708h == null) {
            this.f13708h = new f0();
        }
        f0 f0Var = this.f13708h;
        f0Var.f14149b = mode;
        f0Var.f14150c = mode != null;
        z();
    }
}
