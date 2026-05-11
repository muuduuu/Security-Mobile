package ea;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ea.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3112g {

    /* renamed from: m, reason: collision with root package name */
    public static final a f32374m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private static final PointF f32375n = new PointF();

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f32376o = new float[2];

    /* renamed from: p, reason: collision with root package name */
    private static final Matrix f32377p = new Matrix();

    /* renamed from: q, reason: collision with root package name */
    private static final float[] f32378q = new float[2];

    /* renamed from: r, reason: collision with root package name */
    private static final Comparator f32379r = new Comparator() { // from class: ea.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int p10;
            p10 = C3112g.p((AbstractC3109d) obj, (AbstractC3109d) obj2);
            return p10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f32380a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3113h f32381b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3105B f32382c;

    /* renamed from: d, reason: collision with root package name */
    private float f32383d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f32384e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f32385f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f32386g;

    /* renamed from: h, reason: collision with root package name */
    private final HashSet f32387h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f32388i;

    /* renamed from: j, reason: collision with root package name */
    private int f32389j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f32390k;

    /* renamed from: l, reason: collision with root package name */
    private int f32391l;

    /* renamed from: ea.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean g(AbstractC3109d abstractC3109d, AbstractC3109d abstractC3109d2) {
            return abstractC3109d == abstractC3109d2 || abstractC3109d.I0(abstractC3109d2) || abstractC3109d2.I0(abstractC3109d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean h(int i10) {
            return i10 == 3 || i10 == 1 || i10 == 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i(float f10, float f11, View view) {
            return 0.0f <= f10 && f10 <= ((float) view.getWidth()) && 0.0f <= f11 && f11 <= ((float) view.getHeight());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(AbstractC3109d abstractC3109d, AbstractC3109d abstractC3109d2) {
            if (!abstractC3109d.W(abstractC3109d2) || g(abstractC3109d, abstractC3109d2)) {
                return false;
            }
            if (abstractC3109d == abstractC3109d2 || !(abstractC3109d.Y() || abstractC3109d.Q() == 4)) {
                return true;
            }
            return abstractC3109d.H0(abstractC3109d2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(AbstractC3109d abstractC3109d, AbstractC3109d abstractC3109d2) {
            return abstractC3109d != abstractC3109d2 && (abstractC3109d.K0(abstractC3109d2) || abstractC3109d2.J0(abstractC3109d));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(View view, float[] fArr) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && i(fArr[0], fArr[1], view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = C3112g.f32376o;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(C3112g.f32377p);
                C3112g.f32377p.mapPoints(fArr);
                float f12 = fArr[0];
                scrollY = fArr[1];
                scrollX = f12;
            }
            pointF.set(scrollX, scrollY);
        }

        private a() {
        }
    }

    /* renamed from: ea.g$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32392a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32392a = iArr;
        }
    }

    /* renamed from: ea.g$c */
    static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3109d f32393a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC3109d abstractC3109d) {
            super(0);
            this.f32393a = abstractC3109d;
        }

        public final void a() {
            this.f32393a.n();
            this.f32393a.i();
            this.f32393a.z();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: ea.g$d */
    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f32394a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC3109d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C3112g.f32374m.h(it.Q()) && !it.Y());
        }
    }

    public C3112g(ViewGroup wrapperView, InterfaceC3113h handlerRegistry, InterfaceC3105B viewConfigHelper) {
        Intrinsics.checkNotNullParameter(wrapperView, "wrapperView");
        Intrinsics.checkNotNullParameter(handlerRegistry, "handlerRegistry");
        Intrinsics.checkNotNullParameter(viewConfigHelper, "viewConfigHelper");
        this.f32380a = wrapperView;
        this.f32381b = handlerRegistry;
        this.f32382c = viewConfigHelper;
        this.f32384e = new ArrayList();
        this.f32385f = new ArrayList();
        this.f32386g = new ArrayList();
        this.f32387h = new HashSet();
    }

    private final void A() {
        if (this.f32388i || this.f32389j != 0) {
            this.f32390k = true;
        } else {
            i();
        }
    }

    private final boolean C(AbstractC3109d abstractC3109d) {
        ArrayList<AbstractC3109d> arrayList = this.f32384e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC3109d abstractC3109d2 : arrayList) {
            if (f32374m.k(abstractC3109d, abstractC3109d2) && abstractC3109d2.Q() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean F(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        int i11 = b.f32392a[this.f32382c.a(view).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new lc.m();
                    }
                    boolean n10 = view instanceof ViewGroup ? n((ViewGroup) view, fArr, i10, motionEvent) : false;
                    if (z(view, fArr, i10, motionEvent) || n10 || f32374m.l(view, fArr)) {
                        return true;
                    }
                } else {
                    if (view instanceof ViewGroup) {
                        boolean n11 = n((ViewGroup) view, fArr, i10, motionEvent);
                        if (!n11) {
                            return n11;
                        }
                        z(view, fArr, i10, motionEvent);
                        return n11;
                    }
                    if (view instanceof EditText) {
                        return z(view, fArr, i10, motionEvent);
                    }
                }
            } else if (z(view, fArr, i10, motionEvent) || f32374m.l(view, fArr)) {
                return true;
            }
        }
        return false;
    }

    private final void G(AbstractC3109d abstractC3109d) {
        if (C(abstractC3109d)) {
            abstractC3109d.o();
        } else if (q(abstractC3109d)) {
            e(abstractC3109d);
        } else {
            v(abstractC3109d);
            abstractC3109d.t0(false);
        }
    }

    private final void e(AbstractC3109d abstractC3109d) {
        if (this.f32385f.contains(abstractC3109d)) {
            return;
        }
        this.f32385f.add(abstractC3109d);
        this.f32387h.add(Integer.valueOf(abstractC3109d.R()));
        abstractC3109d.t0(true);
        int i10 = this.f32391l;
        this.f32391l = i10 + 1;
        abstractC3109d.r0(i10);
    }

    private final boolean f(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f32383d;
    }

    private final void g() {
        Iterator it = CollectionsKt.y0(this.f32385f).iterator();
        while (it.hasNext()) {
            ((AbstractC3109d) it.next()).o();
        }
        this.f32386g.clear();
        this.f32386g.addAll(this.f32384e);
        Iterator it2 = CollectionsKt.y0(this.f32384e).iterator();
        while (it2.hasNext()) {
            ((AbstractC3109d) it2.next()).o();
        }
    }

    private final void h() {
        for (AbstractC3109d abstractC3109d : CollectionsKt.O0(this.f32385f)) {
            if (!abstractC3109d.Y()) {
                this.f32385f.remove(abstractC3109d);
                this.f32387h.remove(Integer.valueOf(abstractC3109d.R()));
            }
        }
    }

    private final void i() {
        for (AbstractC3109d abstractC3109d : CollectionsKt.N(this.f32384e)) {
            if (f32374m.h(abstractC3109d.Q()) && !abstractC3109d.Y()) {
                abstractC3109d.m0();
                abstractC3109d.s0(false);
                abstractC3109d.t0(false);
                abstractC3109d.r0(Integer.MAX_VALUE);
            }
        }
        CollectionsKt.E(this.f32384e, d.f32394a);
        this.f32390k = false;
    }

    private final void j(AbstractC3109d abstractC3109d, MotionEvent motionEvent) {
        if (!t(abstractC3109d.U())) {
            abstractC3109d.o();
            return;
        }
        if (abstractC3109d.P0()) {
            int actionMasked = motionEvent.getActionMasked();
            View U10 = abstractC3109d.U();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
            MotionEvent D10 = D(U10, obtain);
            if (abstractC3109d.L() && abstractC3109d.Q() != 0) {
                abstractC3109d.O0(D10, motionEvent);
            }
            if (!abstractC3109d.Y() || actionMasked != 2) {
                boolean z10 = abstractC3109d.Q() == 0;
                abstractC3109d.V(D10, motionEvent);
                if (abstractC3109d.X()) {
                    if (abstractC3109d.P()) {
                        abstractC3109d.E0(false);
                        abstractC3109d.o0();
                    }
                    abstractC3109d.t(D10);
                }
                if (abstractC3109d.L() && z10) {
                    abstractC3109d.O0(D10, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    abstractC3109d.M0(D10.getPointerId(D10.getActionIndex()));
                }
            }
            D10.recycle();
        }
    }

    private final void k(MotionEvent motionEvent) {
        this.f32386g.clear();
        this.f32386g.addAll(this.f32384e);
        CollectionsKt.y(this.f32386g, f32379r);
        Iterator it = this.f32386g.iterator();
        while (it.hasNext()) {
            AbstractC3109d abstractC3109d = (AbstractC3109d) it.next();
            Intrinsics.d(abstractC3109d);
            j(abstractC3109d, motionEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final boolean l(View view, float[] fArr, int i10) {
        boolean z10 = false;
        for (ViewGroup viewGroup = view.getParent(); viewGroup != 0; viewGroup = viewGroup.getParent()) {
            if (viewGroup instanceof ViewGroup) {
                ViewGroup viewGroup2 = viewGroup;
                ArrayList a10 = this.f32381b.a(viewGroup);
                if (a10 != null) {
                    synchronized (a10) {
                        try {
                            Iterator it = a10.iterator();
                            while (it.hasNext()) {
                                AbstractC3109d abstractC3109d = (AbstractC3109d) it.next();
                                if (abstractC3109d.a0() && abstractC3109d.c0(view, fArr[0], fArr[1])) {
                                    Intrinsics.d(abstractC3109d);
                                    y(abstractC3109d, viewGroup2);
                                    abstractC3109d.L0(i10);
                                    z10 = true;
                                }
                            }
                            Unit unit = Unit.f36324a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z10;
    }

    private final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f32378q;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        F(this.f32380a, fArr, pointerId, motionEvent);
        n(this.f32380a, fArr, pointerId, motionEvent);
    }

    private final boolean n(ViewGroup viewGroup, float[] fArr, int i10, MotionEvent motionEvent) {
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View c10 = this.f32382c.c(viewGroup, childCount);
            if (f(c10)) {
                PointF pointF = f32375n;
                a aVar = f32374m;
                aVar.m(fArr[0], fArr[1], viewGroup, c10, pointF);
                float f10 = fArr[0];
                float f11 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean F10 = (!s(c10) || aVar.i(fArr[0], fArr[1], c10)) ? F(c10, fArr, i10, motionEvent) : false;
                fArr[0] = f10;
                fArr[1] = f11;
                if (F10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(AbstractC3109d abstractC3109d, AbstractC3109d abstractC3109d2) {
        if ((abstractC3109d.X() && abstractC3109d2.X()) || (abstractC3109d.Y() && abstractC3109d2.Y())) {
            return Integer.signum(abstractC3109d2.E() - abstractC3109d.E());
        }
        if (!abstractC3109d.X()) {
            if (!abstractC3109d2.X()) {
                if (!abstractC3109d.Y()) {
                    if (!abstractC3109d2.Y()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    private final boolean q(AbstractC3109d abstractC3109d) {
        ArrayList<AbstractC3109d> arrayList = this.f32384e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC3109d abstractC3109d2 : arrayList) {
            a aVar = f32374m;
            if (!aVar.h(abstractC3109d2.Q()) && aVar.k(abstractC3109d, abstractC3109d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean s(View view) {
        return !(view instanceof ViewGroup) || this.f32382c.b((ViewGroup) view);
    }

    private final boolean t(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f32380a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f32380a) {
            parent = parent.getParent();
        }
        return parent == this.f32380a;
    }

    private final boolean u(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f32376o;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    private final void v(AbstractC3109d abstractC3109d) {
        int Q10 = abstractC3109d.Q();
        abstractC3109d.t0(false);
        abstractC3109d.s0(true);
        abstractC3109d.E0(true);
        int i10 = this.f32391l;
        this.f32391l = i10 + 1;
        abstractC3109d.r0(i10);
        for (AbstractC3109d abstractC3109d2 : CollectionsKt.N(this.f32384e)) {
            if (f32374m.j(abstractC3109d2, abstractC3109d)) {
                abstractC3109d2.o();
            }
        }
        for (AbstractC3109d abstractC3109d3 : CollectionsKt.y0(this.f32385f)) {
            if (f32374m.j(abstractC3109d3, abstractC3109d)) {
                abstractC3109d3.t0(false);
            }
        }
        h();
        if (Q10 == 1 || Q10 == 3) {
            return;
        }
        abstractC3109d.u(4, 2);
        if (Q10 != 4) {
            abstractC3109d.u(5, 4);
            if (Q10 != 5) {
                abstractC3109d.u(0, 5);
            }
        }
    }

    private final void y(AbstractC3109d abstractC3109d, View view) {
        if (this.f32384e.contains(abstractC3109d)) {
            return;
        }
        this.f32384e.add(abstractC3109d);
        abstractC3109d.s0(false);
        abstractC3109d.t0(false);
        abstractC3109d.r0(Integer.MAX_VALUE);
        abstractC3109d.l0(view, this);
    }

    private final boolean z(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        boolean z10;
        ArrayList a10 = this.f32381b.a(view);
        if (a10 != null) {
            synchronized (a10) {
                try {
                    Iterator it = a10.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        AbstractC3109d abstractC3109d = (AbstractC3109d) it.next();
                        if (abstractC3109d.a0() && abstractC3109d.c0(view, fArr[0], fArr[1]) && (!CollectionsKt.m(10, 9, 7).contains(Integer.valueOf(motionEvent.getAction())) || (abstractC3109d instanceof C3116k))) {
                            Intrinsics.d(abstractC3109d);
                            y(abstractC3109d, view);
                            abstractC3109d.L0(i10);
                            z10 = true;
                        }
                    }
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            z10 = false;
        }
        float width = view.getWidth();
        float f10 = fArr[0];
        if (0.0f <= f10 && f10 <= width) {
            float height = view.getHeight();
            float f11 = fArr[1];
            if (0.0f <= f11 && f11 <= height && u(view) && l(view, fArr, i10)) {
                return true;
            }
        }
        return z10;
    }

    public final void B(float f10) {
        this.f32383d = f10;
    }

    public final MotionEvent D(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (view == null) {
            return event;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!Intrinsics.b(viewGroup, this.f32380a)) {
            D(viewGroup, event);
        }
        if (viewGroup != null) {
            event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f32377p;
            matrix.invert(matrix2);
            event.transform(matrix2);
        }
        return event;
    }

    public final PointF E(View view, PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        if (view == null) {
            return point;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (!Intrinsics.b(viewGroup, this.f32380a)) {
            E(viewGroup, point);
        }
        if (viewGroup != null) {
            point.x += viewGroup.getScrollX() - view.getLeft();
            point.y += viewGroup.getScrollY() - view.getTop();
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f32377p;
            matrix.invert(matrix2);
            float[] fArr = f32378q;
            fArr[0] = point.x;
            fArr[1] = point.y;
            matrix2.mapPoints(fArr);
            point.x = fArr[0];
            point.y = fArr[1];
        }
        return point;
    }

    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList<AbstractC3109d> a10 = this.f32381b.a(view);
        if (a10 != null) {
            for (AbstractC3109d abstractC3109d : a10) {
                if (abstractC3109d instanceof o) {
                    y(abstractC3109d, view);
                    abstractC3109d.Q0(new c(abstractC3109d));
                }
            }
        }
    }

    public final ArrayList o(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f32381b.a(view);
    }

    public final boolean r() {
        ArrayList arrayList = this.f32384e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((AbstractC3109d) it.next()).Q() == 4) {
                return true;
            }
        }
        return false;
    }

    public final void w(AbstractC3109d handler, int i10, int i11) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f32389j++;
        if (f32374m.h(i10)) {
            for (AbstractC3109d abstractC3109d : CollectionsKt.O0(this.f32385f)) {
                if (f32374m.k(abstractC3109d, handler) && this.f32387h.contains(Integer.valueOf(abstractC3109d.R()))) {
                    if (i10 == 5) {
                        abstractC3109d.o();
                        if (abstractC3109d.Q() == 5) {
                            abstractC3109d.u(3, 2);
                        }
                        abstractC3109d.t0(false);
                    } else {
                        G(abstractC3109d);
                    }
                }
            }
            h();
        }
        if (i10 == 4) {
            G(handler);
        } else if (i11 == 4 || i11 == 5) {
            if (handler.X()) {
                handler.u(i10, i11);
            } else if (i11 == 4 && (i10 == 3 || i10 == 1)) {
                handler.u(i10, 2);
            }
        } else if (i11 != 0 || i10 != 3) {
            handler.u(i10, i11);
        }
        this.f32389j--;
        A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r1 != 7) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f32388i = true;
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 3) {
                g();
            } else if (actionMasked != 5) {
            }
            k(event);
            this.f32388i = false;
            if (this.f32390k && this.f32389j == 0) {
                i();
            }
            return true;
        }
        m(event);
        k(event);
        this.f32388i = false;
        if (this.f32390k) {
            i();
        }
        return true;
    }
}
