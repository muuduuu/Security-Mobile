package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1518s;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.K0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r0.AbstractC3964a;
import r0.AbstractC3965b;
import r0.AbstractC3966c;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements F, G {

    /* renamed from: t, reason: collision with root package name */
    static final String f15644t;

    /* renamed from: u, reason: collision with root package name */
    static final Class[] f15645u;

    /* renamed from: v, reason: collision with root package name */
    static final ThreadLocal f15646v;

    /* renamed from: w, reason: collision with root package name */
    static final Comparator f15647w;

    /* renamed from: x, reason: collision with root package name */
    private static final y0.d f15648x;

    /* renamed from: a, reason: collision with root package name */
    private final List f15649a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f15650b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15651c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f15652d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f15653e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f15654f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15655g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15656h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f15657i;

    /* renamed from: j, reason: collision with root package name */
    private View f15658j;

    /* renamed from: k, reason: collision with root package name */
    private View f15659k;

    /* renamed from: l, reason: collision with root package name */
    private g f15660l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15661m;

    /* renamed from: n, reason: collision with root package name */
    private K0 f15662n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15663o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f15664p;

    /* renamed from: q, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f15665q;

    /* renamed from: r, reason: collision with root package name */
    private I f15666r;

    /* renamed from: s, reason: collision with root package name */
    private final H f15667s;

    class a implements I {
        a() {
        }

        @Override // androidx.core.view.I
        public K0 p(View view, K0 k02) {
            return CoordinatorLayout.this.Z(k02);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public K0 f(CoordinatorLayout coordinatorLayout, View view, K0 k02) {
            return k02;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f15665q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.J(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f15665q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.J(0);
            return true;
        }
    }

    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float N10 = AbstractC1484a0.N(view);
            float N11 = AbstractC1484a0.N(view2);
            if (N10 > N11) {
                return -1;
            }
            return N10 < N11 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f15644t = r02 != null ? r02.getName() : null;
        f15647w = new i();
        f15645u = new Class[]{Context.class, AttributeSet.class};
        f15646v = new ThreadLocal();
        f15648x = new y0.e(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private void A(List list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f15647w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean B(View view) {
        return this.f15650b.k(view);
    }

    private void D(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f15662n != null && AbstractC1484a0.x(this) && !AbstractC1484a0.x(view)) {
            a10.left += this.f15662n.j();
            a10.top += this.f15662n.l();
            a10.right -= this.f15662n.k();
            a10.bottom -= this.f15662n.i();
        }
        Rect a11 = a();
        AbstractC1518s.a(V(fVar.f15672c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        R(a10);
        R(a11);
    }

    private void E(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            u(view2, a10);
            v(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            R(a10);
            R(a11);
        }
    }

    private void F(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = AbstractC1518s.b(W(fVar.f15672c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int x10 = x(i10) - measuredWidth;
        if (i12 == 1) {
            x10 += measuredWidth / 2;
        } else if (i12 == 5) {
            x10 += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(x10, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private MotionEvent G(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private void H(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (AbstractC1484a0.U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 == null || !f10.b(this, view, a10)) {
                a10.set(a11);
            } else if (!a11.contains(a10)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
            }
            R(a11);
            if (a10.isEmpty()) {
                R(a10);
                return;
            }
            int b10 = AbstractC1518s.b(fVar.f15677h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f15679j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                Y(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f15679j) < (i14 = rect.bottom)) {
                Y(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                Y(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f15678i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                X(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f15678i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                X(view, width - i11);
            }
            if (!z12) {
                X(view, 0);
            }
            R(a10);
        }
    }

    static c M(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f15644t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f15646v;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f15645u);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean N(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return cVar.k(this, view, motionEvent);
        }
        if (i10 == 1) {
            return cVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean O(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f15651c;
        A(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if (!(z10 || z11) || actionMasked == 0) {
                if (!z11 && !z10 && f10 != null && (z10 = N(f10, view, motionEvent, i10))) {
                    this.f15658j = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            View view2 = (View) list.get(i12);
                            c f11 = ((f) view2.getLayoutParams()).f();
                            if (f11 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = G(motionEvent);
                                }
                                N(f11, view2, motionEvent2, i10);
                            }
                        }
                    }
                }
                boolean c10 = fVar.c();
                boolean i13 = fVar.i(this, view);
                z11 = i13 && !c10;
                if (i13 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = G(motionEvent);
                }
                N(f10, view, motionEvent2, i10);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z10;
    }

    private void P() {
        this.f15649a.clear();
        this.f15650b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f z10 = z(childAt);
            z10.d(this, childAt);
            this.f15650b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (z10.b(this, childAt, childAt2)) {
                        if (!this.f15650b.d(childAt2)) {
                            this.f15650b.b(childAt2);
                        }
                        this.f15650b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f15649a.addAll(this.f15650b.j());
        Collections.reverse(this.f15649a);
    }

    private static void R(Rect rect) {
        rect.setEmpty();
        f15648x.a(rect);
    }

    private void T() {
        View view = this.f15658j;
        if (view != null) {
            c f10 = ((f) view.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                f10.D(this, this.f15658j, obtain);
                obtain.recycle();
            }
            this.f15658j = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).m();
        }
        this.f15655g = false;
    }

    private static int U(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int V(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int W(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void X(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f15678i;
        if (i11 != i10) {
            AbstractC1484a0.a0(view, i10 - i11);
            fVar.f15678i = i10;
        }
    }

    private void Y(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f15679j;
        if (i11 != i10) {
            AbstractC1484a0.b0(view, i10 - i11);
            fVar.f15679j = i10;
        }
    }

    private static Rect a() {
        Rect rect = (Rect) f15648x.b();
        return rect == null ? new Rect() : rect;
    }

    private void a0() {
        if (!AbstractC1484a0.x(this)) {
            AbstractC1484a0.F0(this, null);
            return;
        }
        if (this.f15666r == null) {
            this.f15666r = new a();
        }
        AbstractC1484a0.F0(this, this.f15666r);
        setSystemUiVisibility(1280);
    }

    private void c() {
        int childCount = getChildCount();
        MotionEvent motionEvent = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                if (motionEvent == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                f10.k(this, childAt, motionEvent);
            }
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    private static int d(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void e(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    private K0 f(K0 k02) {
        c f10;
        if (k02.o()) {
            return k02;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (AbstractC1484a0.x(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                k02 = f10.f(this, childAt, k02);
                if (k02.o()) {
                    break;
                }
            }
        }
        return k02;
    }

    private void w(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int b10 = AbstractC1518s.b(U(fVar.f15672c), i10);
        int b11 = AbstractC1518s.b(V(fVar.f15673d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        int width = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    private int x(int i10) {
        int[] iArr = this.f15657i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public boolean C(View view, int i10, int i11) {
        Rect a10 = a();
        u(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            R(a10);
        }
    }

    void I(View view, int i10) {
        c f10;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f15680k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            u(fVar.f15680k, a10);
            r(view, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(i10, a10, a12, fVar, measuredWidth, measuredHeight);
            boolean z10 = (a12.left == a11.left && a12.top == a11.top) ? false : true;
            e(fVar, a12, measuredWidth, measuredHeight);
            int i11 = a12.left - a11.left;
            int i12 = a12.top - a11.top;
            if (i11 != 0) {
                AbstractC1484a0.a0(view, i11);
            }
            if (i12 != 0) {
                AbstractC1484a0.b0(view, i12);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.h(this, view, fVar.f15680k);
            }
            R(a10);
            R(a11);
            R(a12);
        }
    }

    final void J(int i10) {
        boolean z10;
        int A10 = AbstractC1484a0.A(this);
        int size = this.f15649a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f15649a.get(i11);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (fVar.f15681l == ((View) this.f15649a.get(i12))) {
                        I(view, A10);
                    }
                }
                r(view, true, a11);
                if (fVar.f15676g != 0 && !a11.isEmpty()) {
                    int b10 = AbstractC1518s.b(fVar.f15676g, A10);
                    int i13 = b10 & 112;
                    if (i13 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i13 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i14 = b10 & 7;
                    if (i14 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i14 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f15677h != 0 && view.getVisibility() == 0) {
                    H(view, a10, A10);
                }
                if (i10 != 2) {
                    y(view, a12);
                    if (!a12.equals(a11)) {
                        Q(view, a11);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = (View) this.f15649a.get(i15);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.e(this, view2, view)) {
                        if (i10 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i10 != 2) {
                                z10 = f10.h(this, view2, view);
                            } else {
                                f10.i(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar2.p(z10);
                            }
                        }
                    }
                }
            }
        }
        R(a10);
        R(a11);
        R(a12);
    }

    public void K(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f15680k;
        if (view2 != null) {
            E(view, view2, i10);
            return;
        }
        int i11 = fVar.f15674e;
        if (i11 >= 0) {
            F(view, i11, i10);
        } else {
            D(view, i10);
        }
    }

    public void L(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void Q(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void S() {
        if (this.f15656h && this.f15660l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f15660l);
        }
        this.f15661m = false;
    }

    final K0 Z(K0 k02) {
        if (y0.b.a(this.f15662n, k02)) {
            return k02;
        }
        this.f15662n = k02;
        boolean z10 = false;
        boolean z11 = k02 != null && k02.l() > 0;
        this.f15663o = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        K0 f10 = f(k02);
        requestLayout();
        return f10;
    }

    void b() {
        if (this.f15656h) {
            if (this.f15660l == null) {
                this.f15660l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f15660l);
        }
        this.f15661m = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f15670a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.f15652d == null) {
                    this.f15652d = new Paint();
                }
                this.f15652d.setColor(fVar.f15670a.c(this, view));
                this.f15652d.setAlpha(d(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f15652d);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15664p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void g(View view) {
        ArrayList h10 = this.f15650b.h(view);
        if (h10 == null || h10.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < h10.size(); i10++) {
            View view2 = (View) h10.get(i10);
            c f10 = ((f) view2.getLayoutParams()).f();
            if (f10 != null) {
                f10.h(this, view2, view);
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        P();
        return Collections.unmodifiableList(this.f15649a);
    }

    public final K0 getLastWindowInsets() {
        return this.f15662n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f15667s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f15664p;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    void h() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (B(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f15661m) {
            if (z10) {
                b();
            } else {
                S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.G
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c f10;
        boolean z10;
        int min;
        int childCount = getChildCount();
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f15653e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    i15 = i12 > 0 ? Math.max(i15, this.f15653e[0]) : Math.min(i15, this.f15653e[0]);
                    if (i13 > 0) {
                        z10 = true;
                        min = Math.max(i16, this.f15653e[1]);
                    } else {
                        z10 = true;
                        min = Math.min(i16, this.f15653e[1]);
                    }
                    i16 = min;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z11) {
            J(1);
        }
    }

    @Override // androidx.core.view.F
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        j(view, i10, i11, i12, i13, 0, this.f15654f);
    }

    @Override // androidx.core.view.F
    public boolean l(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean A10 = f10.A(this, childAt, view, view2, i10, i11);
                    z10 |= A10;
                    fVar.r(i11, A10);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.F
    public void m(View view, View view2, int i10, int i11) {
        c f10;
        this.f15667s.c(view, view2, i10, i11);
        this.f15659k = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                f10.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.F
    public void n(View view, int i10) {
        this.f15667s.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.C(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f15659k = null;
    }

    @Override // androidx.core.view.F
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f15653e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.q(this, childAt, view, i10, i11, iArr2, i12);
                    i13 = i10 > 0 ? Math.max(i13, this.f15653e[0]) : Math.min(i13, this.f15653e[0]);
                    i14 = i11 > 0 ? Math.max(i14, this.f15653e[1]) : Math.min(i14, this.f15653e[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            J(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
        if (this.f15661m) {
            if (this.f15660l == null) {
                this.f15660l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f15660l);
        }
        if (this.f15662n == null && AbstractC1484a0.x(this)) {
            AbstractC1484a0.n0(this);
        }
        this.f15656h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T();
        if (this.f15661m && this.f15660l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f15660l);
        }
        View view = this.f15659k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f15656h = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f15663o || this.f15664p == null) {
            return;
        }
        K0 k02 = this.f15662n;
        int l10 = k02 != null ? k02.l() : 0;
        if (l10 > 0) {
            this.f15664p.setBounds(0, 0, getWidth(), l10);
            this.f15664p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
        }
        boolean O10 = O(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f15658j = null;
            T();
        }
        return O10;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int A10 = AbstractC1484a0.A(this);
        int size = this.f15649a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f15649a.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.l(this, view, A10))) {
                K(view, A10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        c f10;
        f fVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        P();
        h();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int A10 = AbstractC1484a0.A(this);
        boolean z10 = A10 == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i22 = paddingLeft + paddingRight;
        int i23 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z11 = this.f15662n != null && AbstractC1484a0.x(this);
        int size3 = this.f15649a.size();
        int i24 = suggestedMinimumWidth;
        int i25 = suggestedMinimumHeight;
        int i26 = 0;
        int i27 = 0;
        while (i27 < size3) {
            View view = (View) this.f15649a.get(i27);
            if (view.getVisibility() == 8) {
                i20 = i27;
                i17 = size3;
                i18 = paddingLeft;
            } else {
                f fVar2 = (f) view.getLayoutParams();
                int i28 = fVar2.f15674e;
                if (i28 < 0 || mode == 0) {
                    i12 = i26;
                } else {
                    int x10 = x(i28);
                    int b10 = AbstractC1518s.b(W(fVar2.f15672c), A10) & 7;
                    i12 = i26;
                    if ((b10 == 3 && !z10) || (b10 == 5 && z10)) {
                        i13 = Math.max(0, (size - paddingRight) - x10);
                    } else if ((b10 == 5 && !z10) || (b10 == 3 && z10)) {
                        i13 = Math.max(0, x10 - paddingLeft);
                    }
                    if (z11 || AbstractC1484a0.x(view)) {
                        i14 = i10;
                        i15 = i11;
                    } else {
                        int j10 = this.f15662n.j() + this.f15662n.k();
                        int l10 = this.f15662n.l() + this.f15662n.i();
                        i14 = View.MeasureSpec.makeMeasureSpec(size - j10, mode);
                        i15 = View.MeasureSpec.makeMeasureSpec(size2 - l10, mode2);
                    }
                    f10 = fVar2.f();
                    if (f10 == null) {
                        fVar = fVar2;
                        i19 = i12;
                        i20 = i27;
                        i16 = i25;
                        i18 = paddingLeft;
                        i21 = i24;
                        i17 = size3;
                    } else {
                        fVar = fVar2;
                        i16 = i25;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i12;
                        i20 = i27;
                        i21 = i24;
                    }
                    L(view, i14, i13, i15, 0);
                    f fVar3 = fVar;
                    int max = Math.max(i21, i22 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin + ((ViewGroup.MarginLayoutParams) fVar3).rightMargin);
                    int max2 = Math.max(i16, i23 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin + ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
                    i26 = View.combineMeasuredStates(i19, view.getMeasuredState());
                    i24 = max;
                    i25 = max2;
                }
                i13 = 0;
                if (z11) {
                }
                i14 = i10;
                i15 = i11;
                f10 = fVar2.f();
                if (f10 == null) {
                }
                L(view, i14, i13, i15, 0);
                f fVar32 = fVar;
                int max3 = Math.max(i21, i22 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar32).leftMargin + ((ViewGroup.MarginLayoutParams) fVar32).rightMargin);
                int max22 = Math.max(i16, i23 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar32).topMargin + ((ViewGroup.MarginLayoutParams) fVar32).bottomMargin);
                i26 = View.combineMeasuredStates(i19, view.getMeasuredState());
                i24 = max3;
                i25 = max22;
            }
            i27 = i20 + 1;
            paddingLeft = i18;
            size3 = i17;
        }
        int i29 = i26;
        setMeasuredDimension(View.resolveSizeAndState(i24, i10, (-16777216) & i29), View.resolveSizeAndState(i25, i11, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z11 |= f12.n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            J(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z10 |= f12.o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        k(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f15689c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = z(childAt).f();
            if (id2 != -1 && f10 != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                f10.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable y10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && f10 != null && (y10 = f10.y(this, childAt)) != null) {
                sparseArray.append(id2, y10);
            }
        }
        hVar.f15689c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean O10;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f15658j;
        boolean z10 = false;
        if (view != null) {
            c f10 = ((f) view.getLayoutParams()).f();
            O10 = f10 != null ? f10.D(this, this.f15658j, motionEvent) : false;
        } else {
            O10 = O(motionEvent, 1);
            if (actionMasked != 0 && O10) {
                z10 = true;
            }
        }
        if (this.f15658j == null || actionMasked == 3) {
            O10 |= super.onTouchEvent(motionEvent);
        } else if (z10) {
            MotionEvent G10 = G(motionEvent);
            super.onTouchEvent(G10);
            G10.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f15658j = null;
            T();
        }
        return O10;
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void r(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f15655g) {
            return;
        }
        if (this.f15658j == null) {
            c();
        }
        T();
        this.f15655g = true;
    }

    public List s(View view) {
        List i10 = this.f15650b.i(view);
        return i10 == null ? Collections.emptyList() : i10;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        a0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f15665q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f15664p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f15664p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f15664p.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.g(this.f15664p, AbstractC1484a0.A(this));
                this.f15664p.setVisible(getVisibility() == 0, false);
                this.f15664p.setCallback(this);
            }
            AbstractC1484a0.h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.a.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f15664p;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f15664p.setVisible(z10, false);
    }

    public List t(View view) {
        List g10 = this.f15650b.g(view);
        return g10 == null ? Collections.emptyList() : g10;
    }

    void u(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void v(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15664p;
    }

    void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f15671b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f15671b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f15671b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3964a.f38942a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        this.f15649a = new ArrayList();
        this.f15650b = new androidx.coordinatorlayout.widget.a();
        this.f15651c = new ArrayList();
        this.f15653e = new int[2];
        this.f15654f = new int[2];
        this.f15667s = new H(this);
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3966c.f38944a, 0, AbstractC3965b.f38943a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3966c.f38944a, i10, 0);
        }
        if (i10 == 0) {
            AbstractC1484a0.o0(this, context, AbstractC3966c.f38944a, attributeSet, obtainStyledAttributes, 0, AbstractC3965b.f38943a);
        } else {
            AbstractC1484a0.o0(this, context, AbstractC3966c.f38944a, attributeSet, obtainStyledAttributes, i10, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC3966c.f38945b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f15657i = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f15657i.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f15657i[i11] = (int) (r12[i11] * f10);
            }
        }
        this.f15664p = obtainStyledAttributes.getDrawable(AbstractC3966c.f38946c);
        obtainStyledAttributes.recycle();
        a0();
        super.setOnHierarchyChangeListener(new e());
        if (AbstractC1484a0.y(this) == 0) {
            AbstractC1484a0.B0(this, 1);
        }
    }

    protected static class h extends F0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        SparseArray f15689c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f15689c = new SparseArray(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f15689c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f15689c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f15689c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f15689c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f15670a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15671b;

        /* renamed from: c, reason: collision with root package name */
        public int f15672c;

        /* renamed from: d, reason: collision with root package name */
        public int f15673d;

        /* renamed from: e, reason: collision with root package name */
        public int f15674e;

        /* renamed from: f, reason: collision with root package name */
        int f15675f;

        /* renamed from: g, reason: collision with root package name */
        public int f15676g;

        /* renamed from: h, reason: collision with root package name */
        public int f15677h;

        /* renamed from: i, reason: collision with root package name */
        int f15678i;

        /* renamed from: j, reason: collision with root package name */
        int f15679j;

        /* renamed from: k, reason: collision with root package name */
        View f15680k;

        /* renamed from: l, reason: collision with root package name */
        View f15681l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f15682m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f15683n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f15684o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f15685p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f15686q;

        /* renamed from: r, reason: collision with root package name */
        Object f15687r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f15671b = false;
            this.f15672c = 0;
            this.f15673d = 0;
            this.f15674e = -1;
            this.f15675f = -1;
            this.f15676g = 0;
            this.f15677h = 0;
            this.f15686q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f15675f);
            this.f15680k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f15681l = null;
                    this.f15680k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f15675f) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f15681l = null;
                this.f15680k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f15681l = null;
                    this.f15680k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f15681l = findViewById;
        }

        private boolean s(View view, int i10) {
            int b10 = AbstractC1518s.b(((f) view.getLayoutParams()).f15676g, i10);
            return b10 != 0 && (AbstractC1518s.b(this.f15677h, i10) & b10) == b10;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f15680k.getId() != this.f15675f) {
                return false;
            }
            View view2 = this.f15680k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f15681l = null;
                    this.f15680k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f15681l = view2;
            return true;
        }

        boolean a() {
            return this.f15680k == null && this.f15675f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f15681l || s(view2, AbstractC1484a0.A(coordinatorLayout)) || ((cVar = this.f15670a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f15670a == null) {
                this.f15682m = false;
            }
            return this.f15682m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f15675f == -1) {
                this.f15681l = null;
                this.f15680k = null;
                return null;
            }
            if (this.f15680k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f15680k;
        }

        public int e() {
            return this.f15675f;
        }

        public c f() {
            return this.f15670a;
        }

        boolean g() {
            return this.f15685p;
        }

        Rect h() {
            return this.f15686q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f15682m;
            if (z10) {
                return true;
            }
            c cVar = this.f15670a;
            boolean a10 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f15682m = a10;
            return a10;
        }

        boolean j(int i10) {
            if (i10 == 0) {
                return this.f15683n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f15684o;
        }

        void k() {
            this.f15685p = false;
        }

        void l(int i10) {
            r(i10, false);
        }

        void m() {
            this.f15682m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f15670a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f15670a = cVar;
                this.f15687r = null;
                this.f15671b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z10) {
            this.f15685p = z10;
        }

        void q(Rect rect) {
            this.f15686q.set(rect);
        }

        void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f15683n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f15684o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15671b = false;
            this.f15672c = 0;
            this.f15673d = 0;
            this.f15674e = -1;
            this.f15675f = -1;
            this.f15676g = 0;
            this.f15677h = 0;
            this.f15686q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3966c.f38947d);
            this.f15672c = obtainStyledAttributes.getInteger(AbstractC3966c.f38948e, 0);
            this.f15675f = obtainStyledAttributes.getResourceId(AbstractC3966c.f38949f, -1);
            this.f15673d = obtainStyledAttributes.getInteger(AbstractC3966c.f38950g, 0);
            this.f15674e = obtainStyledAttributes.getInteger(AbstractC3966c.f38954k, -1);
            this.f15676g = obtainStyledAttributes.getInt(AbstractC3966c.f38953j, 0);
            this.f15677h = obtainStyledAttributes.getInt(AbstractC3966c.f38952i, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(AbstractC3966c.f38951h);
            this.f15671b = hasValue;
            if (hasValue) {
                this.f15670a = CoordinatorLayout.M(context, attributeSet, obtainStyledAttributes.getString(AbstractC3966c.f38951h));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f15670a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f15671b = false;
            this.f15672c = 0;
            this.f15673d = 0;
            this.f15674e = -1;
            this.f15675f = -1;
            this.f15676g = 0;
            this.f15677h = 0;
            this.f15686q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f15671b = false;
            this.f15672c = 0;
            this.f15673d = 0;
            this.f15674e = -1;
            this.f15675f = -1;
            this.f15676g = 0;
            this.f15677h = 0;
            this.f15686q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15671b = false;
            this.f15672c = 0;
            this.f15673d = 0;
            this.f15674e = -1;
            this.f15675f = -1;
            this.f15676g = 0;
            this.f15677h = 0;
            this.f15686q = new Rect();
        }
    }
}
