package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.d;
import androidx.core.view.AbstractC1484a0;
import androidx.fragment.app.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: f, reason: collision with root package name */
    public static final a f16870f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f16871a;

    /* renamed from: b, reason: collision with root package name */
    private final List f16872b;

    /* renamed from: c, reason: collision with root package name */
    private final List f16873c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16874d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16875e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Z a(ViewGroup container, G fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            b0 B02 = fragmentManager.B0();
            Intrinsics.checkNotNullExpressionValue(B02, "fragmentManager.specialEffectsControllerFactory");
            return b(container, B02);
        }

        public final Z b(ViewGroup container, b0 factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object tag = container.getTag(T0.b.f9130b);
            if (tag instanceof Z) {
                return (Z) tag;
            }
            Z a10 = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(a10, "factory.createController(container)");
            container.setTag(T0.b.f9130b, a10);
            return a10;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends c {

        /* renamed from: h, reason: collision with root package name */
        private final M f16876h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(c.b finalState, c.a lifecycleImpact, M fragmentStateManager, androidx.core.os.d cancellationSignal) {
            super(finalState, lifecycleImpact, r0, cancellationSignal);
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            ComponentCallbacksC1573o k10 = fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
            this.f16876h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.Z.c
        public void e() {
            super.e();
            this.f16876h.m();
        }

        @Override // androidx.fragment.app.Z.c
        public void n() {
            if (i() != c.a.ADDING) {
                if (i() == c.a.REMOVING) {
                    ComponentCallbacksC1573o k10 = this.f16876h.k();
                    Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
                    View requireView = k10.requireView();
                    Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + k10);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            ComponentCallbacksC1573o k11 = this.f16876h.k();
            Intrinsics.checkNotNullExpressionValue(k11, "fragmentStateManager.fragment");
            View findFocus = k11.mView.findFocus();
            if (findFocus != null) {
                k11.setFocusedView(findFocus);
                if (G.J0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k11);
                }
            }
            View requireView2 = h().requireView();
            Intrinsics.checkNotNullExpressionValue(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                this.f16876h.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k11.getPostOnViewCreatedAlpha());
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private b f16877a;

        /* renamed from: b, reason: collision with root package name */
        private a f16878b;

        /* renamed from: c, reason: collision with root package name */
        private final ComponentCallbacksC1573o f16879c;

        /* renamed from: d, reason: collision with root package name */
        private final List f16880d;

        /* renamed from: e, reason: collision with root package name */
        private final Set f16881e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16882f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f16883g;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a Companion = new a(null);

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* renamed from: androidx.fragment.app.Z$c$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0287b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f16884a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f16884a = iArr;
                }
            }

            public static final b from(int i10) {
                return Companion.b(i10);
            }

            public final void applyState(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                int i10 = C0287b.f16884a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (G.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (G.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* renamed from: androidx.fragment.app.Z$c$c, reason: collision with other inner class name */
        public /* synthetic */ class C0288c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16885a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f16885a = iArr;
            }
        }

        public c(b finalState, a lifecycleImpact, ComponentCallbacksC1573o fragment, androidx.core.os.d cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.f16877a = finalState;
            this.f16878b = lifecycleImpact;
            this.f16879c = fragment;
            this.f16880d = new ArrayList();
            this.f16881e = new LinkedHashSet();
            cancellationSignal.c(new d.a() { // from class: androidx.fragment.app.a0
                @Override // androidx.core.os.d.a
                public final void onCancel() {
                    Z.c.b(Z.c.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.d();
        }

        public final void c(Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f16880d.add(listener);
        }

        public final void d() {
            if (this.f16882f) {
                return;
            }
            this.f16882f = true;
            if (this.f16881e.isEmpty()) {
                e();
                return;
            }
            Iterator it = CollectionsKt.R0(this.f16881e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.d) it.next()).a();
            }
        }

        public void e() {
            if (this.f16883g) {
                return;
            }
            if (G.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f16883g = true;
            Iterator it = this.f16880d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(androidx.core.os.d signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (this.f16881e.remove(signal) && this.f16881e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.f16877a;
        }

        public final ComponentCallbacksC1573o h() {
            return this.f16879c;
        }

        public final a i() {
            return this.f16878b;
        }

        public final boolean j() {
            return this.f16882f;
        }

        public final boolean k() {
            return this.f16883g;
        }

        public final void l(androidx.core.os.d signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            n();
            this.f16881e.add(signal);
        }

        public final void m(b finalState, a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = C0288c.f16885a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f16877a == b.REMOVED) {
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f16879c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f16878b + " to ADDING.");
                    }
                    this.f16877a = b.VISIBLE;
                    this.f16878b = a.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (G.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f16879c + " mFinalState = " + this.f16877a + " -> REMOVED. mLifecycleImpact  = " + this.f16878b + " to REMOVING.");
                }
                this.f16877a = b.REMOVED;
                this.f16878b = a.REMOVING;
                return;
            }
            if (i10 == 3 && this.f16877a != b.REMOVED) {
                if (G.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f16879c + " mFinalState = " + this.f16877a + " -> " + finalState + '.');
                }
                this.f16877a = finalState;
            }
        }

        public abstract void n();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f16877a + " lifecycleImpact = " + this.f16878b + " fragment = " + this.f16879c + '}';
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16886a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16886a = iArr;
        }
    }

    public Z(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f16871a = container;
        this.f16872b = new ArrayList();
        this.f16873c = new ArrayList();
    }

    private final void c(c.b bVar, c.a aVar, M m10) {
        synchronized (this.f16872b) {
            androidx.core.os.d dVar = new androidx.core.os.d();
            ComponentCallbacksC1573o k10 = m10.k();
            Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
            c l10 = l(k10);
            if (l10 != null) {
                l10.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, m10, dVar);
            this.f16872b.add(bVar2);
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.X
                @Override // java.lang.Runnable
                public final void run() {
                    Z.d(Z.this, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.Y
                @Override // java.lang.Runnable
                public final void run() {
                    Z.e(Z.this, bVar2);
                }
            });
            Unit unit = Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Z this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.f16872b.contains(operation)) {
            c.b g10 = operation.g();
            View view = operation.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            g10.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Z this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.f16872b.remove(operation);
        this$0.f16873c.remove(operation);
    }

    private final c l(ComponentCallbacksC1573o componentCallbacksC1573o) {
        Object obj;
        Iterator it = this.f16872b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (Intrinsics.b(cVar.h(), componentCallbacksC1573o) && !cVar.j()) {
                break;
            }
        }
        return (c) obj;
    }

    private final c m(ComponentCallbacksC1573o componentCallbacksC1573o) {
        Object obj;
        Iterator it = this.f16873c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (Intrinsics.b(cVar.h(), componentCallbacksC1573o) && !cVar.j()) {
                break;
            }
        }
        return (c) obj;
    }

    public static final Z r(ViewGroup viewGroup, G g10) {
        return f16870f.a(viewGroup, g10);
    }

    public static final Z s(ViewGroup viewGroup, b0 b0Var) {
        return f16870f.b(viewGroup, b0Var);
    }

    private final void u() {
        for (c cVar : this.f16872b) {
            if (cVar.i() == c.a.ADDING) {
                View requireView = cVar.h().requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                cVar.m(c.b.Companion.b(requireView.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void f(c.b finalState, M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        c(finalState, c.a.ADDING, fragmentStateManager);
    }

    public final void g(M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    public final void h(M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    public final void i(M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (G.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    public abstract void j(List list, boolean z10);

    public final void k() {
        if (this.f16875e) {
            return;
        }
        if (!AbstractC1484a0.T(this.f16871a)) {
            n();
            this.f16874d = false;
            return;
        }
        synchronized (this.f16872b) {
            try {
                if (!this.f16872b.isEmpty()) {
                    List<c> Q02 = CollectionsKt.Q0(this.f16873c);
                    this.f16873c.clear();
                    for (c cVar : Q02) {
                        if (G.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                        }
                        cVar.d();
                        if (!cVar.k()) {
                            this.f16873c.add(cVar);
                        }
                    }
                    u();
                    List Q03 = CollectionsKt.Q0(this.f16872b);
                    this.f16872b.clear();
                    this.f16873c.addAll(Q03);
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = Q03.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).n();
                    }
                    j(Q03, this.f16874d);
                    this.f16874d = false;
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (G.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean T10 = AbstractC1484a0.T(this.f16871a);
        synchronized (this.f16872b) {
            try {
                u();
                Iterator it = this.f16872b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).n();
                }
                for (c cVar : CollectionsKt.Q0(this.f16873c)) {
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (T10 ? BuildConfig.FLAVOR : "Container " + this.f16871a + " is not attached to window. ") + "Cancelling running operation " + cVar);
                    }
                    cVar.d();
                }
                for (c cVar2 : CollectionsKt.Q0(this.f16872b)) {
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (T10 ? BuildConfig.FLAVOR : "Container " + this.f16871a + " is not attached to window. ") + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.d();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f16875e) {
            if (G.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f16875e = false;
            k();
        }
    }

    public final c.a p(M fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        ComponentCallbacksC1573o k10 = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(k10, "fragmentStateManager.fragment");
        c l10 = l(k10);
        c.a i10 = l10 != null ? l10.i() : null;
        c m10 = m(k10);
        c.a i11 = m10 != null ? m10.i() : null;
        int i12 = i10 == null ? -1 : d.f16886a[i10.ordinal()];
        return (i12 == -1 || i12 == 1) ? i11 : i10;
    }

    public final ViewGroup q() {
        return this.f16871a;
    }

    public final void t() {
        Object obj;
        synchronized (this.f16872b) {
            try {
                u();
                List list = this.f16872b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    c cVar = (c) obj;
                    c.b.a aVar = c.b.Companion;
                    View view = cVar.h().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    c.b a10 = aVar.a(view);
                    c.b g10 = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (g10 == bVar && a10 != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) obj;
                ComponentCallbacksC1573o h10 = cVar2 != null ? cVar2.h() : null;
                this.f16875e = h10 != null ? h10.isPostponed() : false;
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(boolean z10) {
        this.f16874d = z10;
    }
}
