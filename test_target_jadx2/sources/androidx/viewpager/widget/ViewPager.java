package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import androidx.core.view.I;
import androidx.core.view.K0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import z0.C5228A;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    private int f17942A;

    /* renamed from: B, reason: collision with root package name */
    private int f17943B;

    /* renamed from: C, reason: collision with root package name */
    private int f17944C;

    /* renamed from: D, reason: collision with root package name */
    private float f17945D;

    /* renamed from: E, reason: collision with root package name */
    private float f17946E;

    /* renamed from: F, reason: collision with root package name */
    private float f17947F;

    /* renamed from: G, reason: collision with root package name */
    private float f17948G;

    /* renamed from: H, reason: collision with root package name */
    private int f17949H;

    /* renamed from: I, reason: collision with root package name */
    private VelocityTracker f17950I;

    /* renamed from: J, reason: collision with root package name */
    private int f17951J;

    /* renamed from: K, reason: collision with root package name */
    private int f17952K;

    /* renamed from: a, reason: collision with root package name */
    private int f17953a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f17954b;

    /* renamed from: c, reason: collision with root package name */
    private final f f17955c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f17956d;

    /* renamed from: e, reason: collision with root package name */
    androidx.viewpager.widget.a f17957e;

    /* renamed from: f, reason: collision with root package name */
    int f17958f;

    /* renamed from: g, reason: collision with root package name */
    private int f17959g;

    /* renamed from: h, reason: collision with root package name */
    private Parcelable f17960h;

    /* renamed from: h0, reason: collision with root package name */
    private int f17961h0;

    /* renamed from: i, reason: collision with root package name */
    private ClassLoader f17962i;

    /* renamed from: i0, reason: collision with root package name */
    private int f17963i0;

    /* renamed from: j, reason: collision with root package name */
    private Scroller f17964j;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f17965j0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17966k;

    /* renamed from: k0, reason: collision with root package name */
    private EdgeEffect f17967k0;

    /* renamed from: l, reason: collision with root package name */
    private k f17968l;

    /* renamed from: l0, reason: collision with root package name */
    private EdgeEffect f17969l0;

    /* renamed from: m, reason: collision with root package name */
    private int f17970m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f17971m0;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f17972n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f17973n0;

    /* renamed from: o, reason: collision with root package name */
    private int f17974o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f17975o0;

    /* renamed from: p, reason: collision with root package name */
    private int f17976p;

    /* renamed from: p0, reason: collision with root package name */
    private int f17977p0;

    /* renamed from: q, reason: collision with root package name */
    private float f17978q;

    /* renamed from: q0, reason: collision with root package name */
    private List f17979q0;

    /* renamed from: r, reason: collision with root package name */
    private float f17980r;

    /* renamed from: r0, reason: collision with root package name */
    private j f17981r0;

    /* renamed from: s, reason: collision with root package name */
    private int f17982s;

    /* renamed from: s0, reason: collision with root package name */
    private j f17983s0;

    /* renamed from: t, reason: collision with root package name */
    private int f17984t;

    /* renamed from: t0, reason: collision with root package name */
    private List f17985t0;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17986u;

    /* renamed from: u0, reason: collision with root package name */
    private int f17987u0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17988v;

    /* renamed from: v0, reason: collision with root package name */
    private ArrayList f17989v0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f17990w;

    /* renamed from: w0, reason: collision with root package name */
    private final Runnable f17991w0;

    /* renamed from: x, reason: collision with root package name */
    private int f17992x;

    /* renamed from: x0, reason: collision with root package name */
    private int f17993x0;

    /* renamed from: y, reason: collision with root package name */
    private boolean f17994y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f17995z;

    /* renamed from: y0, reason: collision with root package name */
    static final int[] f17940y0 = {R.attr.layout_gravity};

    /* renamed from: z0, reason: collision with root package name */
    private static final Comparator f17941z0 = new a();

    /* renamed from: A0, reason: collision with root package name */
    private static final Interpolator f17938A0 = new b();

    /* renamed from: B0, reason: collision with root package name */
    private static final n f17939B0 = new n();

    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f18000b - fVar2.f18000b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.D();
        }
    }

    class d implements I {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f17997a = new Rect();

        d() {
        }

        @Override // androidx.core.view.I
        public K0 p(View view, K0 k02) {
            K0 c02 = AbstractC1484a0.c0(view, k02);
            if (c02.o()) {
                return c02;
            }
            Rect rect = this.f17997a;
            rect.left = c02.j();
            rect.top = c02.l();
            rect.right = c02.k();
            rect.bottom = c02.i();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                K0 g10 = AbstractC1484a0.g(ViewPager.this.getChildAt(i10), c02);
                rect.left = Math.min(g10.j(), rect.left);
                rect.top = Math.min(g10.l(), rect.top);
                rect.right = Math.min(g10.k(), rect.right);
                rect.bottom = Math.min(g10.i(), rect.bottom);
            }
            return c02.q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f17999a;

        /* renamed from: b, reason: collision with root package name */
        int f18000b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18001c;

        /* renamed from: d, reason: collision with root package name */
        float f18002d;

        /* renamed from: e, reason: collision with root package name */
        float f18003e;

        f() {
        }
    }

    class h extends C1483a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f17957e;
            return aVar != null && aVar.c() > 1;
        }

        @Override // androidx.core.view.C1483a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f17957e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.f17958f);
            accessibilityEvent.setToIndex(ViewPager.this.f17958f);
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            super.g(view, c5228a);
            c5228a.q0(ViewPager.class.getName());
            c5228a.M0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c5228a.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c5228a.a(8192);
            }
        }

        @Override // androidx.core.view.C1483a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f17958f + 1);
                return true;
            }
            if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f17958f - 1);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    private class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.h();
        }
    }

    public static class l extends F0.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f18012c;

        /* renamed from: d, reason: collision with root package name */
        Parcelable f18013d;

        /* renamed from: e, reason: collision with root package name */
        ClassLoader f18014e;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f18012c + "}";
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f18012c);
            parcel.writeParcelable(this.f18013d, i10);
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f18012c = parcel.readInt();
            this.f18013d = parcel.readParcelable(classLoader);
            this.f18014e = classLoader;
        }
    }

    public static class m implements j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
        }
    }

    static class n implements Comparator {
        n() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f18004a;
            return z10 != gVar2.f18004a ? z10 ? 1 : -1 : gVar.f18008e - gVar2.f18008e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17954b = new ArrayList();
        this.f17955c = new f();
        this.f17956d = new Rect();
        this.f17959g = -1;
        this.f17960h = null;
        this.f17962i = null;
        this.f17978q = -3.4028235E38f;
        this.f17980r = Float.MAX_VALUE;
        this.f17992x = 1;
        this.f17949H = -1;
        this.f17971m0 = true;
        this.f17973n0 = false;
        this.f17991w0 = new c();
        this.f17993x0 = 0;
        u();
    }

    private boolean B(int i10) {
        if (this.f17954b.size() == 0) {
            if (this.f17971m0) {
                return false;
            }
            this.f17975o0 = false;
            x(0, 0.0f, 0);
            if (this.f17975o0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f s10 = s();
        int clientWidth = getClientWidth();
        int i11 = this.f17970m;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = s10.f18000b;
        float f11 = ((i10 / f10) - s10.f18003e) / (s10.f18002d + (i11 / f10));
        this.f17975o0 = false;
        x(i13, f11, (int) (i12 * f11));
        if (this.f17975o0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean C(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f17945D - f10;
        this.f17945D = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f17978q * clientWidth;
        float f13 = this.f17980r * clientWidth;
        boolean z12 = false;
        f fVar = (f) this.f17954b.get(0);
        ArrayList arrayList = this.f17954b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f18000b != 0) {
            f12 = fVar.f18003e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f18000b != this.f17957e.c() - 1) {
            f13 = fVar2.f18003e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f17967k0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f17969l0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f17945D += scrollX - i10;
        scrollTo(i10, getScrollY());
        B(i10);
        return z12;
    }

    private void F(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f17954b.isEmpty()) {
            if (!this.f17964j.isFinished()) {
                this.f17964j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f t10 = t(this.f17958f);
        int min = (int) ((t10 != null ? Math.min(t10.f18003e, this.f17980r) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            g(false);
            scrollTo(min, getScrollY());
        }
    }

    private void G() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f18004a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void J(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean K() {
        this.f17949H = -1;
        n();
        this.f17967k0.onRelease();
        this.f17969l0.onRelease();
        return this.f17967k0.isFinished() || this.f17969l0.isFinished();
    }

    private void L(int i10, boolean z10, int i11, boolean z11) {
        f t10 = t(i10);
        int clientWidth = t10 != null ? (int) (getClientWidth() * Math.max(this.f17978q, Math.min(t10.f18003e, this.f17980r))) : 0;
        if (z10) {
            P(clientWidth, 0, i11);
            if (z11) {
                k(i10);
                return;
            }
            return;
        }
        if (z11) {
            k(i10);
        }
        g(false);
        scrollTo(clientWidth, 0);
        B(clientWidth);
    }

    private void Q() {
        if (this.f17987u0 != 0) {
            ArrayList arrayList = this.f17989v0;
            if (arrayList == null) {
                this.f17989v0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f17989v0.add(getChildAt(i10));
            }
            Collections.sort(this.f17989v0, f17939B0);
        }
    }

    private void e(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int c10 = this.f17957e.c();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f17970m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f18000b;
            int i14 = fVar.f18000b;
            if (i13 < i14) {
                float f11 = fVar2.f18003e + fVar2.f18002d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f18000b && i16 < this.f17954b.size()) {
                    Object obj = this.f17954b.get(i16);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i15 <= fVar4.f18000b || i16 >= this.f17954b.size() - 1) {
                            break;
                        }
                        i16++;
                        obj = this.f17954b.get(i16);
                    }
                    while (i15 < fVar4.f18000b) {
                        f11 += this.f17957e.f(i15) + f10;
                        i15++;
                    }
                    fVar4.f18003e = f11;
                    f11 += fVar4.f18002d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f17954b.size() - 1;
                float f12 = fVar2.f18003e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f18000b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f17954b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i13 >= fVar3.f18000b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f17954b.get(size);
                    }
                    while (i13 > fVar3.f18000b) {
                        f12 -= this.f17957e.f(i13) + f10;
                        i13--;
                    }
                    f12 -= fVar3.f18002d + f10;
                    fVar3.f18003e = f12;
                }
            }
        }
        int size2 = this.f17954b.size();
        float f13 = fVar.f18003e;
        int i17 = fVar.f18000b;
        int i18 = i17 - 1;
        this.f17978q = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = c10 - 1;
        this.f17980r = i17 == i19 ? (fVar.f18002d + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar5 = (f) this.f17954b.get(i20);
            while (true) {
                i12 = fVar5.f18000b;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.f17957e.f(i18) + f10;
                i18--;
            }
            f13 -= fVar5.f18002d + f10;
            fVar5.f18003e = f13;
            if (i12 == 0) {
                this.f17978q = f13;
            }
            i20--;
            i18--;
        }
        float f14 = fVar.f18003e + fVar.f18002d + f10;
        int i21 = fVar.f18000b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar6 = (f) this.f17954b.get(i22);
            while (true) {
                i11 = fVar6.f18000b;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.f17957e.f(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f17980r = (fVar6.f18002d + f14) - 1.0f;
            }
            fVar6.f18003e = f14;
            f14 += fVar6.f18002d + f10;
            i22++;
            i21++;
        }
        this.f17973n0 = false;
    }

    private void g(boolean z10) {
        boolean z11 = this.f17993x0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f17964j.isFinished()) {
                this.f17964j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f17964j.getCurrX();
                int currY = this.f17964j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.f17990w = false;
        for (int i10 = 0; i10 < this.f17954b.size(); i10++) {
            f fVar = (f) this.f17954b.get(i10);
            if (fVar.f18001c) {
                fVar.f18001c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                AbstractC1484a0.i0(this, this.f17991w0);
            } else {
                this.f17991w0.run();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int i(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f17961h0 || Math.abs(i11) <= this.f17951J) {
            i10 += (int) (f10 + (i10 >= this.f17958f ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f17954b.size() <= 0) {
            return i10;
        }
        return Math.max(((f) this.f17954b.get(0)).f18000b, Math.min(i10, ((f) this.f17954b.get(r4.size() - 1)).f18000b));
    }

    private void j(int i10, float f10, int i11) {
        j jVar = this.f17981r0;
        if (jVar != null) {
            jVar.a(i10, f10, i11);
        }
        List list = this.f17979q0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = (j) this.f17979q0.get(i12);
                if (jVar2 != null) {
                    jVar2.a(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.f17983s0;
        if (jVar3 != null) {
            jVar3.a(i10, f10, i11);
        }
    }

    private void k(int i10) {
        j jVar = this.f17981r0;
        if (jVar != null) {
            jVar.c(i10);
        }
        List list = this.f17979q0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f17979q0.get(i11);
                if (jVar2 != null) {
                    jVar2.c(i10);
                }
            }
        }
        j jVar3 = this.f17983s0;
        if (jVar3 != null) {
            jVar3.c(i10);
        }
    }

    private void l(int i10) {
        j jVar = this.f17981r0;
        if (jVar != null) {
            jVar.b(i10);
        }
        List list = this.f17979q0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f17979q0.get(i11);
                if (jVar2 != null) {
                    jVar2.b(i10);
                }
            }
        }
        j jVar3 = this.f17983s0;
        if (jVar3 != null) {
            jVar3.b(i10);
        }
    }

    private void n() {
        this.f17994y = false;
        this.f17995z = false;
        VelocityTracker velocityTracker = this.f17950I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17950I = null;
        }
    }

    private Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f s() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f17970m / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        f fVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f17954b.size()) {
            f fVar2 = (f) this.f17954b.get(i11);
            if (!z10 && fVar2.f18000b != (i10 = i12 + 1)) {
                fVar2 = this.f17955c;
                fVar2.f18003e = f10 + f12 + f11;
                fVar2.f18000b = i10;
                fVar2.f18002d = this.f17957e.f(i10);
                i11--;
            }
            f fVar3 = fVar2;
            f10 = fVar3.f18003e;
            float f13 = fVar3.f18002d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return fVar;
            }
            if (scrollX < f13 || i11 == this.f17954b.size() - 1) {
                return fVar3;
            }
            int i13 = fVar3.f18000b;
            float f14 = fVar3.f18002d;
            i11++;
            z10 = false;
            i12 = i13;
            f12 = f14;
            fVar = fVar3;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f17988v != z10) {
            this.f17988v = z10;
        }
    }

    private static boolean v(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean w(float f10, float f11) {
        return (f10 < ((float) this.f17943B) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.f17943B)) && f11 < 0.0f);
    }

    private void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17949H) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f17945D = motionEvent.getX(i10);
            this.f17949H = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f17950I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    boolean A() {
        androidx.viewpager.widget.a aVar = this.f17957e;
        if (aVar == null || this.f17958f >= aVar.c() - 1) {
            return false;
        }
        M(this.f17958f + 1, true);
        return true;
    }

    void D() {
        E(this.f17958f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void E(int i10) {
        f fVar;
        String hexString;
        f fVar2;
        f r10;
        f fVar3;
        int i11 = this.f17958f;
        if (i11 != i10) {
            fVar = t(i11);
            this.f17958f = i10;
        } else {
            fVar = null;
        }
        if (this.f17957e == null) {
            Q();
            return;
        }
        if (this.f17990w) {
            Q();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f17957e.n(this);
        int i12 = this.f17992x;
        int max = Math.max(0, this.f17958f - i12);
        int c10 = this.f17957e.c();
        int min = Math.min(c10 - 1, this.f17958f + i12);
        if (c10 != this.f17953a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f17953a + ", found: " + c10 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f17957e.getClass());
        }
        int i13 = 0;
        while (true) {
            if (i13 >= this.f17954b.size()) {
                break;
            }
            fVar2 = (f) this.f17954b.get(i13);
            int i14 = fVar2.f18000b;
            int i15 = this.f17958f;
            if (i14 < i15) {
                i13++;
            }
        }
        if (fVar2 == null && c10 > 0) {
            fVar2 = a(this.f17958f, i13);
        }
        if (fVar2 != null) {
            int i16 = i13 - 1;
            f fVar4 = i16 >= 0 ? (f) this.f17954b.get(i16) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVar2.f18002d) + (getPaddingLeft() / clientWidth);
            float f10 = 0.0f;
            for (int i17 = this.f17958f - 1; i17 >= 0; i17--) {
                if (f10 >= paddingLeft && i17 < max) {
                    if (fVar4 == null) {
                        break;
                    }
                    if (i17 == fVar4.f18000b && !fVar4.f18001c) {
                        this.f17954b.remove(i16);
                        this.f17957e.a(this, i17, fVar4.f17999a);
                        i16--;
                        i13--;
                        if (i16 >= 0) {
                            fVar3 = (f) this.f17954b.get(i16);
                            fVar4 = fVar3;
                        }
                        fVar3 = null;
                        fVar4 = fVar3;
                    }
                } else if (fVar4 == null || i17 != fVar4.f18000b) {
                    f10 += a(i17, i16 + 1).f18002d;
                    i13++;
                    if (i16 >= 0) {
                        fVar3 = (f) this.f17954b.get(i16);
                        fVar4 = fVar3;
                    }
                    fVar3 = null;
                    fVar4 = fVar3;
                } else {
                    f10 += fVar4.f18002d;
                    i16--;
                    if (i16 >= 0) {
                        fVar3 = (f) this.f17954b.get(i16);
                        fVar4 = fVar3;
                    }
                    fVar3 = null;
                    fVar4 = fVar3;
                }
            }
            float f11 = fVar2.f18002d;
            int i18 = i13 + 1;
            if (f11 < 2.0f) {
                f fVar5 = i18 < this.f17954b.size() ? (f) this.f17954b.get(i18) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i19 = this.f17958f;
                while (true) {
                    i19++;
                    if (i19 >= c10) {
                        break;
                    }
                    if (f11 >= paddingRight && i19 > min) {
                        if (fVar5 == null) {
                            break;
                        }
                        if (i19 == fVar5.f18000b && !fVar5.f18001c) {
                            this.f17954b.remove(i18);
                            this.f17957e.a(this, i19, fVar5.f17999a);
                            if (i18 < this.f17954b.size()) {
                                fVar5 = (f) this.f17954b.get(i18);
                            }
                        }
                    } else if (fVar5 == null || i19 != fVar5.f18000b) {
                        f a10 = a(i19, i18);
                        i18++;
                        f11 += a10.f18002d;
                        fVar5 = i18 < this.f17954b.size() ? (f) this.f17954b.get(i18) : null;
                    } else {
                        f11 += fVar5.f18002d;
                        i18++;
                        if (i18 < this.f17954b.size()) {
                            fVar5 = (f) this.f17954b.get(i18);
                        }
                    }
                }
            }
            e(fVar2, i13, fVar);
            this.f17957e.l(this, this.f17958f, fVar2.f17999a);
        }
        this.f17957e.b(this);
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f18009f = i20;
            if (!gVar.f18004a && gVar.f18006c == 0.0f && (r10 = r(childAt)) != null) {
                gVar.f18006c = r10.f18002d;
                gVar.f18008e = r10.f18000b;
            }
        }
        Q();
        if (hasFocus()) {
            View findFocus = findFocus();
            f q10 = findFocus != null ? q(findFocus) : null;
            if (q10 == null || q10.f18000b != this.f17958f) {
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    f r11 = r(childAt2);
                    if (r11 != null && r11.f18000b == this.f17958f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void H(i iVar) {
        List list = this.f17985t0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void I(j jVar) {
        List list = this.f17979q0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void M(int i10, boolean z10) {
        this.f17990w = false;
        N(i10, z10, false);
    }

    void N(int i10, boolean z10, boolean z11) {
        O(i10, z10, z11, 0);
    }

    void O(int i10, boolean z10, boolean z11, int i11) {
        androidx.viewpager.widget.a aVar = this.f17957e;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f17958f == i10 && this.f17954b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f17957e.c()) {
            i10 = this.f17957e.c() - 1;
        }
        int i12 = this.f17992x;
        int i13 = this.f17958f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f17954b.size(); i14++) {
                ((f) this.f17954b.get(i14)).f18001c = true;
            }
        }
        boolean z12 = this.f17958f != i10;
        if (!this.f17971m0) {
            E(i10);
            L(i10, z10, i11, z12);
        } else {
            this.f17958f = i10;
            if (z12) {
                k(i10);
            }
            requestLayout();
        }
    }

    void P(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f17964j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f17966k ? this.f17964j.getCurrX() : this.f17964j.getStartX();
            this.f17964j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            g(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float m10 = f11 + (m(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int abs = Math.abs(i12);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m10 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i14) / ((f10 * this.f17957e.f(this.f17958f)) + this.f17970m)) + 1.0f) * 100.0f), 600);
        this.f17966k = false;
        this.f17964j.startScroll(i13, scrollY, i14, i15, min);
        AbstractC1484a0.h0(this);
    }

    f a(int i10, int i11) {
        f fVar = new f();
        fVar.f18000b = i10;
        fVar.f17999a = this.f17957e.g(this, i10);
        fVar.f18002d = this.f17957e.f(i10);
        if (i11 < 0 || i11 >= this.f17954b.size()) {
            this.f17954b.add(fVar);
        } else {
            this.f17954b.add(i11, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        f r10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (r10 = r(childAt)) != null && r10.f18000b == this.f17958f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f r10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (r10 = r(childAt)) != null && r10.f18000b == this.f17958f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean v10 = gVar.f18004a | v(view);
        gVar.f18004a = v10;
        if (!this.f17986u) {
            super.addView(view, i10, layoutParams);
        } else {
            if (v10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f18007d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(i iVar) {
        if (this.f17985t0 == null) {
            this.f17985t0 = new ArrayList();
        }
        this.f17985t0.add(iVar);
    }

    public void c(j jVar) {
        if (this.f17979q0 == null) {
            this.f17979q0 = new ArrayList();
        }
        this.f17979q0.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f17957e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f17978q)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f17980r));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f17966k = true;
        if (this.f17964j.isFinished() || !this.f17964j.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f17964j.getCurrX();
        int currY = this.f17964j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.f17964j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AbstractC1484a0.h0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i10) {
        View findNextFocus;
        boolean z10;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i10 != 17 || i10 == 1) {
                    z10 = z();
                } else {
                    if (i10 == 66 || i10 == 2) {
                        z10 = A();
                    }
                    z10 = false;
                }
            } else if (i10 == 17) {
                z10 = (findFocus == null || p(this.f17956d, findNextFocus).left < p(this.f17956d, findFocus).left) ? findNextFocus.requestFocus() : z();
            } else {
                if (i10 == 66) {
                    z10 = (findFocus == null || p(this.f17956d, findNextFocus).left > p(this.f17956d, findFocus).left) ? findNextFocus.requestFocus() : A();
                }
                z10 = false;
            }
            if (z10) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
            }
            return z10;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        if (findNextFocus != null) {
        }
        if (i10 != 17) {
        }
        z10 = z();
        if (z10) {
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f r10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (r10 = r(childAt)) != null && r10.f18000b == this.f17958f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f17957e) != null && aVar.c() > 1)) {
            if (!this.f17967k0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f17978q * width);
                this.f17967k0.setSize(height, width);
                z10 = this.f17967k0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f17969l0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f17980r + 1.0f)) * width2);
                this.f17969l0.setSize(height2, width2);
                z10 |= this.f17969l0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f17967k0.finish();
            this.f17969l0.finish();
        }
        if (z10) {
            AbstractC1484a0.h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17972n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    protected boolean f(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && f(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f17957e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f17987u0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) ((View) this.f17989v0.get(i11)).getLayoutParams()).f18009f;
    }

    public int getCurrentItem() {
        return this.f17958f;
    }

    public int getOffscreenPageLimit() {
        return this.f17992x;
    }

    public int getPageMargin() {
        return this.f17970m;
    }

    void h() {
        int c10 = this.f17957e.c();
        this.f17953a = c10;
        boolean z10 = this.f17954b.size() < (this.f17992x * 2) + 1 && this.f17954b.size() < c10;
        int i10 = this.f17958f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f17954b.size()) {
            f fVar = (f) this.f17954b.get(i11);
            int d10 = this.f17957e.d(fVar.f17999a);
            if (d10 != -1) {
                if (d10 == -2) {
                    this.f17954b.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f17957e.n(this);
                        z11 = true;
                    }
                    this.f17957e.a(this, fVar.f18000b, fVar.f17999a);
                    int i12 = this.f17958f;
                    if (i12 == fVar.f18000b) {
                        i10 = Math.max(0, Math.min(i12, c10 - 1));
                    }
                } else {
                    int i13 = fVar.f18000b;
                    if (i13 != d10) {
                        if (i13 == this.f17958f) {
                            i10 = d10;
                        }
                        fVar.f18000b = d10;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f17957e.b(this);
        }
        Collections.sort(this.f17954b, f17941z0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f18004a) {
                    gVar.f18006c = 0.0f;
                }
            }
            N(i10, false, true);
            requestLayout();
        }
    }

    float m(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? z() : d(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? A() : d(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17971m0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f17991w0);
        Scroller scroller = this.f17964j;
        if (scroller != null && !scroller.isFinished()) {
            this.f17964j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.f17970m <= 0 || this.f17972n == null || this.f17954b.size() <= 0 || this.f17957e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f12 = this.f17970m / width;
        int i11 = 0;
        f fVar = (f) this.f17954b.get(0);
        float f13 = fVar.f18003e;
        int size = this.f17954b.size();
        int i12 = fVar.f18000b;
        int i13 = ((f) this.f17954b.get(size - 1)).f18000b;
        while (i12 < i13) {
            while (true) {
                i10 = fVar.f18000b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                fVar = (f) this.f17954b.get(i11);
            }
            if (i12 == i10) {
                float f14 = fVar.f18003e;
                float f15 = fVar.f18002d;
                f10 = (f14 + f15) * width;
                f13 = f14 + f15 + f12;
            } else {
                float f16 = this.f17957e.f(i12);
                f10 = (f13 + f16) * width;
                f13 += f16 + f12;
            }
            if (this.f17970m + f10 > scrollX) {
                f11 = f12;
                this.f17972n.setBounds(Math.round(f10), this.f17974o, Math.round(this.f17970m + f10), this.f17976p);
                this.f17972n.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollX + r2) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            K();
            return false;
        }
        if (action != 0) {
            if (this.f17994y) {
                return true;
            }
            if (this.f17995z) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f17947F = x10;
            this.f17945D = x10;
            float y10 = motionEvent.getY();
            this.f17948G = y10;
            this.f17946E = y10;
            this.f17949H = motionEvent.getPointerId(0);
            this.f17995z = false;
            this.f17966k = true;
            this.f17964j.computeScrollOffset();
            if (this.f17993x0 != 2 || Math.abs(this.f17964j.getFinalX() - this.f17964j.getCurrX()) <= this.f17963i0) {
                g(false);
                this.f17994y = false;
            } else {
                this.f17964j.abortAnimation();
                this.f17990w = false;
                D();
                this.f17994y = true;
                J(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f17949H;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.f17945D;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f17948G);
                if (f10 != 0.0f && !w(this.f17945D, f10) && f(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f17945D = x11;
                    this.f17946E = y11;
                    this.f17995z = true;
                    return false;
                }
                int i11 = this.f17944C;
                if (abs > i11 && abs * 0.5f > abs2) {
                    this.f17994y = true;
                    J(true);
                    setScrollState(1);
                    float f11 = this.f17947F;
                    float f12 = this.f17944C;
                    this.f17945D = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.f17946E = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i11) {
                    this.f17995z = true;
                }
                if (this.f17994y && C(x11)) {
                    AbstractC1484a0.h0(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.f17950I == null) {
            this.f17950I = VelocityTracker.obtain();
        }
        this.f17950I.addMovement(motionEvent);
        return this.f17994y;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        f r10;
        int max;
        int i14;
        int max2;
        int i15;
        int childCount = getChildCount();
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f18004a) {
                    int i20 = gVar.f18005b;
                    int i21 = i20 & 7;
                    int i22 = i20 & 112;
                    if (i21 != 1) {
                        if (i21 == 3) {
                            i14 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i21 != 5) {
                            i14 = paddingLeft;
                        } else {
                            max = (i16 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i22 == 16) {
                            if (i22 == 48) {
                                i15 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i22 != 80) {
                                i15 = paddingTop;
                            } else {
                                max2 = (i17 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                            i18++;
                            paddingTop = i15;
                            paddingLeft = i14;
                        } else {
                            max2 = Math.max((i17 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = max2;
                        i15 = paddingTop;
                        paddingTop = i24;
                        int i232 = paddingLeft + scrollX;
                        childAt.layout(i232, paddingTop, childAt.getMeasuredWidth() + i232, paddingTop + childAt.getMeasuredHeight());
                        i18++;
                        paddingTop = i15;
                        paddingLeft = i14;
                    } else {
                        max = Math.max((i16 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i25 = max;
                    i14 = paddingLeft;
                    paddingLeft = i25;
                    if (i22 == 16) {
                    }
                    int i242 = max2;
                    i15 = paddingTop;
                    paddingTop = i242;
                    int i2322 = paddingLeft + scrollX;
                    childAt.layout(i2322, paddingTop, childAt.getMeasuredWidth() + i2322, paddingTop + childAt.getMeasuredHeight());
                    i18++;
                    paddingTop = i15;
                    paddingLeft = i14;
                }
            }
        }
        int i26 = (i16 - paddingLeft) - paddingRight;
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt2 = getChildAt(i27);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f18004a && (r10 = r(childAt2)) != null) {
                    float f10 = i26;
                    int i28 = ((int) (r10.f18003e * f10)) + paddingLeft;
                    if (gVar2.f18007d) {
                        gVar2.f18007d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * gVar2.f18006c), 1073741824), View.MeasureSpec.makeMeasureSpec((i17 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i28, paddingTop, childAt2.getMeasuredWidth() + i28, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f17974o = paddingTop;
        this.f17976p = i17 - paddingBottom;
        this.f17977p0 = i18;
        if (this.f17971m0) {
            z11 = false;
            L(this.f17958f, false, 0, false);
        } else {
            z11 = false;
        }
        this.f17971m0 = z11;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f17943B = Math.min(measuredWidth / 10, this.f17942A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f18004a) {
                int i15 = gVar2.f18005b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f17982s = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f17984t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f17986u = true;
        D();
        this.f17986u = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f18004a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f18006c), 1073741824), this.f17984t);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f r10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (r10 = r(childAt)) != null && r10.f18000b == this.f17958f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.a());
        androidx.viewpager.widget.a aVar = this.f17957e;
        if (aVar != null) {
            aVar.j(lVar.f18013d, lVar.f18014e);
            N(lVar.f18012c, false, true);
        } else {
            this.f17959g = lVar.f18012c;
            this.f17960h = lVar.f18013d;
            this.f17962i = lVar.f18014e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f18012c = this.f17958f;
        androidx.viewpager.widget.a aVar = this.f17957e;
        if (aVar != null) {
            lVar.f18013d = aVar.k();
        }
        return lVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f17970m;
            F(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.f17965j0) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f17957e) == null || aVar.c() == 0) {
            return false;
        }
        if (this.f17950I == null) {
            this.f17950I = VelocityTracker.obtain();
        }
        this.f17950I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f17964j.abortAnimation();
            this.f17990w = false;
            D();
            float x10 = motionEvent.getX();
            this.f17947F = x10;
            this.f17945D = x10;
            float y10 = motionEvent.getY();
            this.f17948G = y10;
            this.f17946E = y10;
            this.f17949H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f17994y) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f17949H);
                    if (findPointerIndex == -1) {
                        z10 = K();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.f17945D);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.f17946E);
                        if (abs > this.f17944C && abs > abs2) {
                            this.f17994y = true;
                            J(true);
                            float f10 = this.f17947F;
                            this.f17945D = x11 - f10 > 0.0f ? f10 + this.f17944C : f10 - this.f17944C;
                            this.f17946E = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f17994y) {
                    z10 = C(motionEvent.getX(motionEvent.findPointerIndex(this.f17949H)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f17945D = motionEvent.getX(actionIndex);
                    this.f17949H = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    y(motionEvent);
                    this.f17945D = motionEvent.getX(motionEvent.findPointerIndex(this.f17949H));
                }
            } else if (this.f17994y) {
                L(this.f17958f, true, 0, false);
                z10 = K();
            }
        } else if (this.f17994y) {
            VelocityTracker velocityTracker = this.f17950I;
            velocityTracker.computeCurrentVelocity(1000, this.f17952K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f17949H);
            this.f17990w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f s10 = s();
            float f11 = clientWidth;
            O(i(s10.f18000b, ((scrollX / f11) - s10.f18003e) / (s10.f18002d + (this.f17970m / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f17949H)) - this.f17947F)), true, true, xVelocity);
            z10 = K();
        }
        if (z10) {
            AbstractC1484a0.h0(this);
        }
        return true;
    }

    f q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f r(View view) {
        for (int i10 = 0; i10 < this.f17954b.size(); i10++) {
            f fVar = (f) this.f17954b.get(i10);
            if (this.f17957e.h(view, fVar.f17999a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f17986u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f17957e;
        if (aVar2 != null) {
            aVar2.m(null);
            this.f17957e.n(this);
            for (int i10 = 0; i10 < this.f17954b.size(); i10++) {
                f fVar = (f) this.f17954b.get(i10);
                this.f17957e.a(this, fVar.f18000b, fVar.f17999a);
            }
            this.f17957e.b(this);
            this.f17954b.clear();
            G();
            this.f17958f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f17957e;
        this.f17957e = aVar;
        this.f17953a = 0;
        if (aVar != null) {
            if (this.f17968l == null) {
                this.f17968l = new k();
            }
            this.f17957e.m(this.f17968l);
            this.f17990w = false;
            boolean z10 = this.f17971m0;
            this.f17971m0 = true;
            this.f17953a = this.f17957e.c();
            if (this.f17959g >= 0) {
                this.f17957e.j(this.f17960h, this.f17962i);
                N(this.f17959g, false, true);
                this.f17959g = -1;
                this.f17960h = null;
                this.f17962i = null;
            } else if (z10) {
                requestLayout();
            } else {
                D();
            }
        }
        List list = this.f17985t0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f17985t0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((i) this.f17985t0.get(i11)).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f17990w = false;
        N(i10, !this.f17971m0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f17992x) {
            this.f17992x = i10;
            D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f17981r0 = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f17970m;
        this.f17970m = i10;
        int width = getWidth();
        F(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f17972n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.f17993x0 == i10) {
            return;
        }
        this.f17993x0 = i10;
        l(i10);
    }

    f t(int i10) {
        for (int i11 = 0; i11 < this.f17954b.size(); i11++) {
            f fVar = (f) this.f17954b.get(i11);
            if (fVar.f18000b == i10) {
                return fVar;
            }
        }
        return null;
    }

    void u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f17964j = new Scroller(context, f17938A0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f17944C = viewConfiguration.getScaledPagingTouchSlop();
        this.f17951J = (int) (400.0f * f10);
        this.f17952K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17967k0 = new EdgeEffect(context);
        this.f17969l0 = new EdgeEffect(context);
        this.f17961h0 = (int) (25.0f * f10);
        this.f17963i0 = (int) (2.0f * f10);
        this.f17942A = (int) (f10 * 16.0f);
        AbstractC1484a0.q0(this, new h());
        if (AbstractC1484a0.y(this) == 0) {
            AbstractC1484a0.B0(this, 1);
        }
        AbstractC1484a0.F0(this, new d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17972n;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void x(int i10, float f10, int i11) {
        int max;
        int i12;
        int left;
        if (this.f17977p0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f18004a) {
                    int i14 = gVar.f18005b & 7;
                    if (i14 != 1) {
                        if (i14 == 3) {
                            i12 = childAt.getWidth() + paddingLeft;
                        } else if (i14 != 5) {
                            i12 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i12;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = max;
                    i12 = paddingLeft;
                    paddingLeft = i15;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i12;
                }
            }
        }
        j(i10, f10, i11);
        this.f17975o0 = true;
    }

    boolean z() {
        int i10 = this.f17958f;
        if (i10 <= 0) {
            return false;
        }
        M(i10 - 1, true);
        return true;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18004a;

        /* renamed from: b, reason: collision with root package name */
        public int f18005b;

        /* renamed from: c, reason: collision with root package name */
        float f18006c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18007d;

        /* renamed from: e, reason: collision with root package name */
        int f18008e;

        /* renamed from: f, reason: collision with root package name */
        int f18009f;

        public g() {
            super(-1, -1);
            this.f18006c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f18006c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f17940y0);
            this.f18005b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(androidx.core.content.a.e(getContext(), i10));
    }
}
