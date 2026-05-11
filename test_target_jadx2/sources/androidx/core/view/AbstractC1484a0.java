package androidx.core.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.C1483a;
import androidx.core.view.C1514p0;
import androidx.core.view.K0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import s0.AbstractC4304c;
import z0.C5228A;
import z0.InterfaceC5231D;

/* renamed from: androidx.core.view.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1484a0 {

    /* renamed from: a, reason: collision with root package name */
    private static WeakHashMap f16088a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Field f16089b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f16090c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f16091d = {AbstractC4304c.f40707b, AbstractC4304c.f40708c, AbstractC4304c.f40719n, AbstractC4304c.f40730y, AbstractC4304c.f40688B, AbstractC4304c.f40689C, AbstractC4304c.f40690D, AbstractC4304c.f40691E, AbstractC4304c.f40692F, AbstractC4304c.f40693G, AbstractC4304c.f40709d, AbstractC4304c.f40710e, AbstractC4304c.f40711f, AbstractC4304c.f40712g, AbstractC4304c.f40713h, AbstractC4304c.f40714i, AbstractC4304c.f40715j, AbstractC4304c.f40716k, AbstractC4304c.f40717l, AbstractC4304c.f40718m, AbstractC4304c.f40720o, AbstractC4304c.f40721p, AbstractC4304c.f40722q, AbstractC4304c.f40723r, AbstractC4304c.f40724s, AbstractC4304c.f40725t, AbstractC4304c.f40726u, AbstractC4304c.f40727v, AbstractC4304c.f40728w, AbstractC4304c.f40729x, AbstractC4304c.f40731z, AbstractC4304c.f40687A};

    /* renamed from: e, reason: collision with root package name */
    private static final K f16092e = new K() { // from class: androidx.core.view.Z
        @Override // androidx.core.view.K
        public final C1489d a(C1489d c1489d) {
            C1489d Y10;
            Y10 = AbstractC1484a0.Y(c1489d);
            return Y10;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final e f16093f = new e();

    /* renamed from: androidx.core.view.a0$a */
    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.a0$b */
    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.a0$c */
    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.f(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.a0$d */
    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.AbstractC1484a0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.a0$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakHashMap f16094a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (booleanValue != z10) {
                AbstractC1484a0.Z(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f16094a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f16094a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f16094a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.a0$f */
    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f16095a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f16096b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16097c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16098d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f16097c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f16095a);
            if (this.f16096b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                AbstractC1484a0.j(view);
                view.setTag(this.f16095a, obj);
                AbstractC1484a0.Z(view, this.f16098d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f16095a = i10;
            this.f16096b = cls;
            this.f16098d = i11;
            this.f16097c = i12;
        }
    }

    /* renamed from: androidx.core.view.a0$g */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.a0$h */
    private static class h {

        /* renamed from: androidx.core.view.a0$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            K0 f16099a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f16100b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ I f16101c;

            a(View view, I i10) {
                this.f16100b = view;
                this.f16101c = i10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                K0 x10 = K0.x(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f16100b);
                    if (x10.equals(this.f16099a)) {
                        return this.f16101c.p(view, x10).v();
                    }
                }
                this.f16099a = x10;
                K0 p10 = this.f16101c.p(view, x10);
                if (i10 >= 30) {
                    return p10.v();
                }
                AbstractC1484a0.n0(view);
                return p10.v();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC4304c.f40705S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static K0 b(View view, K0 k02, Rect rect) {
            WindowInsets v10 = k02.v();
            if (v10 != null) {
                return K0.x(view.computeSystemWindowInsets(v10, rect), view);
            }
            rect.setEmpty();
            return k02;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static K0 j(View view) {
            return K0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, I i10) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC4304c.f40698L, i10);
            }
            if (i10 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC4304c.f40705S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, i10));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.a0$i */
    private static class i {
        public static K0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            K0 w10 = K0.w(rootWindowInsets);
            w10.t(w10);
            w10.d(view.getRootView());
            return w10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* renamed from: androidx.core.view.a0$j */
    static class j {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: androidx.core.view.a0$k */
    static class k {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.a0$l */
    static class l {
        static void a(View view, final q qVar) {
            j0.i iVar = (j0.i) view.getTag(AbstractC4304c.f40704R);
            if (iVar == null) {
                iVar = new j0.i();
                view.setTag(AbstractC4304c.f40704R, iVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(qVar) { // from class: androidx.core.view.b0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            iVar.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            j0.i iVar = (j0.i) view.getTag(AbstractC4304c.f40704R);
            if (iVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, A0.a aVar) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* renamed from: androidx.core.view.a0$m */
    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void e(View view, B0.a aVar) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.a0$n */
    private static class n {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static i1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return i1.i(windowInsetsController);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.a0$o */
    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1489d b(View view, C1489d c1489d) {
            ContentInfo f10 = c1489d.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? c1489d : C1489d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, J j10) {
            if (j10 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(j10));
            }
        }
    }

    /* renamed from: androidx.core.view.a0$p */
    private static final class p implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        private final J f16102a;

        p(J j10) {
            this.f16102a = j10;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1489d g10 = C1489d.g(contentInfo);
            C1489d a10 = this.f16102a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            return a10 == g10 ? contentInfo : a10.f();
        }
    }

    /* renamed from: androidx.core.view.a0$q */
    public interface q {
    }

    /* renamed from: androidx.core.view.a0$r */
    static class r {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList f16103d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap f16104a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f16105b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference f16106c = null;

        r() {
        }

        static r a(View view) {
            r rVar = (r) view.getTag(AbstractC4304c.f40703Q);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(AbstractC4304c.f40703Q, rVar2);
            return rVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f16104a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f16105b == null) {
                this.f16105b = new SparseArray();
            }
            return this.f16105b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC4304c.f40704R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f16104a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f16103d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f16104a == null) {
                        this.f16104a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f16103d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f16104a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f16104a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            return c10 != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f16106c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f16106c = new WeakReference(keyEvent);
            SparseArray d10 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) d10.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getLayoutDirection();
    }

    public static void A0(View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    public static int B(View view) {
        return view.getMinimumHeight();
    }

    public static void B0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static int C(View view) {
        return view.getMinimumWidth();
    }

    private static void C0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static String[] D(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(AbstractC4304c.f40700N);
    }

    public static void D0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, i10);
        }
    }

    public static int E(View view) {
        return view.getPaddingEnd();
    }

    public static void E0(View view, boolean z10) {
        h.t(view, z10);
    }

    public static int F(View view) {
        return view.getPaddingStart();
    }

    public static void F0(View view, I i10) {
        h.u(view, i10);
    }

    public static ViewParent G(View view) {
        return view.getParentForAccessibility();
    }

    public static void G0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static K0 H(View view) {
        return i.a(view);
    }

    public static void H0(View view, M m10) {
        j.d(view, (PointerIcon) (m10 != null ? m10.a() : null));
    }

    public static CharSequence I(View view) {
        return (CharSequence) P0().e(view);
    }

    public static void I0(View view, boolean z10) {
        p0().f(view, Boolean.valueOf(z10));
    }

    public static String J(View view) {
        return h.k(view);
    }

    public static void J0(View view, int i10, int i11) {
        i.d(view, i10, i11);
    }

    public static float K(View view) {
        return h.l(view);
    }

    public static void K0(View view, CharSequence charSequence) {
        P0().f(view, charSequence);
    }

    public static i1 L(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC1512o0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void L0(View view, String str) {
        h.v(view, str);
    }

    public static int M(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void M0(View view, float f10) {
        h.w(view, f10);
    }

    public static float N(View view) {
        return h.m(view);
    }

    public static void N0(View view, C1514p0.b bVar) {
        C1514p0.d(view, bVar);
    }

    public static boolean O(View view) {
        return m(view) != null;
    }

    public static void O0(View view, float f10) {
        h.x(view, f10);
    }

    public static boolean P(View view) {
        return view.hasOnClickListeners();
    }

    private static f P0() {
        return new c(AbstractC4304c.f40702P, CharSequence.class, 64, 30);
    }

    public static boolean Q(View view) {
        return view.hasOverlappingRendering();
    }

    public static void Q0(View view) {
        h.z(view);
    }

    public static boolean R(View view) {
        return view.hasTransientState();
    }

    public static boolean S(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean T(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean U(View view) {
        return view.isLaidOut();
    }

    public static boolean V(View view) {
        return h.p(view);
    }

    public static boolean W(View view) {
        return view.isPaddingRelative();
    }

    public static boolean X(View view) {
        Boolean bool = (Boolean) p0().e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1489d Y(C1489d c1489d) {
        return c1489d;
    }

    static void Z(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                obtain.setContentChangeTypes(i10);
                if (z10) {
                    obtain.getText().add(o(view));
                    C0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void a0(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    private static f b() {
        return new d(AbstractC4304c.f40696J, Boolean.class, 28);
    }

    public static void b0(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static int c(View view, CharSequence charSequence, InterfaceC5231D interfaceC5231D) {
        int q10 = q(view, charSequence);
        if (q10 != -1) {
            d(view, new C5228A.a(q10, charSequence, interfaceC5231D));
        }
        return q10;
    }

    public static K0 c0(View view, K0 k02) {
        WindowInsets v10 = k02.v();
        if (v10 != null) {
            WindowInsets b10 = g.b(view, v10);
            if (!b10.equals(v10)) {
                return K0.x(b10, view);
            }
        }
        return k02;
    }

    private static void d(View view, C5228A.a aVar) {
        j(view);
        l0(aVar.b(), view);
        p(view).add(aVar);
        Z(view, 0);
    }

    public static void d0(View view, C5228A c5228a) {
        view.onInitializeAccessibilityNodeInfo(c5228a.X0());
    }

    public static C1504k0 e(View view) {
        if (f16088a == null) {
            f16088a = new WeakHashMap();
        }
        C1504k0 c1504k0 = (C1504k0) f16088a.get(view);
        if (c1504k0 != null) {
            return c1504k0;
        }
        C1504k0 c1504k02 = new C1504k0(view);
        f16088a.put(view, c1504k02);
        return c1504k02;
    }

    private static f e0() {
        return new b(AbstractC4304c.f40697K, CharSequence.class, 8, 28);
    }

    public static K0 f(View view, K0 k02, Rect rect) {
        return h.b(view, k02, rect);
    }

    public static boolean f0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static K0 g(View view, K0 k02) {
        WindowInsets v10 = k02.v();
        if (v10 != null) {
            WindowInsets a10 = g.a(view, v10);
            if (!a10.equals(v10)) {
                return K0.x(a10, view);
            }
        }
        return k02;
    }

    public static C1489d g0(View view, C1489d c1489d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1489d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c1489d);
        }
        J j10 = (J) view.getTag(AbstractC4304c.f40699M);
        if (j10 == null) {
            return w(view).a(c1489d);
        }
        C1489d a10 = j10.a(view, c1489d);
        if (a10 == null) {
            return null;
        }
        return w(view).a(a10);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    public static void h0(View view) {
        view.postInvalidateOnAnimation();
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    public static void i0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    static void j(View view) {
        C1483a l10 = l(view);
        if (l10 == null) {
            l10 = new C1483a();
        }
        q0(view, l10);
    }

    public static void j0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view, int i10) {
        l0(i10, view);
        Z(view, 0);
    }

    public static C1483a l(View view) {
        View.AccessibilityDelegate m10 = m(view);
        if (m10 == null) {
            return null;
        }
        return m10 instanceof C1483a.C0272a ? ((C1483a.C0272a) m10).f16087a : new C1483a(m10);
    }

    private static void l0(int i10, View view) {
        List p10 = p(view);
        for (int i11 = 0; i11 < p10.size(); i11++) {
            if (((C5228A.a) p10.get(i11)).b() == i10) {
                p10.remove(i11);
                return;
            }
        }
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    public static void m0(View view, C5228A.a aVar, CharSequence charSequence, InterfaceC5231D interfaceC5231D) {
        if (interfaceC5231D == null && charSequence == null) {
            k0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, interfaceC5231D));
        }
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f16090c) {
            return null;
        }
        if (f16089b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f16089b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16090c = true;
                return null;
            }
        }
        try {
            Object obj = f16089b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16090c = true;
            return null;
        }
    }

    public static void n0(View view) {
        g.c(view);
    }

    public static CharSequence o(View view) {
        return (CharSequence) e0().e(view);
    }

    public static void o0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static List p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC4304c.f40694H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(AbstractC4304c.f40694H, arrayList2);
        return arrayList2;
    }

    private static f p0() {
        return new a(AbstractC4304c.f40701O, Boolean.class, 28);
    }

    private static int q(View view, CharSequence charSequence) {
        List p10 = p(view);
        for (int i10 = 0; i10 < p10.size(); i10++) {
            if (TextUtils.equals(charSequence, ((C5228A.a) p10.get(i10)).c())) {
                return ((C5228A.a) p10.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f16091d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < p10.size(); i14++) {
                z10 &= ((C5228A.a) p10.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void q0(View view, C1483a c1483a) {
        if (c1483a == null && (m(view) instanceof C1483a.C0272a)) {
            c1483a = new C1483a();
        }
        C0(view);
        view.setAccessibilityDelegate(c1483a == null ? null : c1483a.d());
    }

    public static ColorStateList r(View view) {
        return h.g(view);
    }

    public static void r0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static PorterDuff.Mode s(View view) {
        return h.h(view);
    }

    public static void s0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static Rect t(View view) {
        return view.getClipBounds();
    }

    public static void t0(View view, CharSequence charSequence) {
        e0().f(view, charSequence);
        if (charSequence != null) {
            f16093f.a(view);
        } else {
            f16093f.d(view);
        }
    }

    public static Display u(View view) {
        return view.getDisplay();
    }

    public static void u0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static float v(View view) {
        return h.i(view);
    }

    public static void v0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static K w(View view) {
        return view instanceof K ? (K) view : f16092e;
    }

    public static void w0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static boolean x(View view) {
        return view.getFitsSystemWindows();
    }

    public static void x0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static int y(View view) {
        return view.getImportantForAccessibility();
    }

    public static void y0(View view, float f10) {
        h.s(view, f10);
    }

    public static int z(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return 0;
    }

    public static void z0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }
}
