package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.d;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1494f0;
import androidx.fragment.app.AbstractC1578u;
import androidx.fragment.app.C1569k;
import androidx.fragment.app.Z;
import j0.C3476a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569k extends Z {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.k$a */
    static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16927c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16928d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC1578u.a f16929e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z.c operation, androidx.core.os.d signal, boolean z10) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f16927c = z10;
        }

        public final AbstractC1578u.a e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f16928d) {
                return this.f16929e;
            }
            AbstractC1578u.a b10 = AbstractC1578u.b(context, b().h(), b().g() == Z.c.b.VISIBLE, this.f16927c);
            this.f16929e = b10;
            this.f16928d = true;
            return b10;
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Z.c f16930a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.os.d f16931b;

        public b(Z.c operation, androidx.core.os.d signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f16930a = operation;
            this.f16931b = signal;
        }

        public final void a() {
            this.f16930a.f(this.f16931b);
        }

        public final Z.c b() {
            return this.f16930a;
        }

        public final androidx.core.os.d c() {
            return this.f16931b;
        }

        public final boolean d() {
            Z.c.b bVar;
            Z.c.b.a aVar = Z.c.b.Companion;
            View view = this.f16930a.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            Z.c.b a10 = aVar.a(view);
            Z.c.b g10 = this.f16930a.g();
            return a10 == g10 || !(a10 == (bVar = Z.c.b.VISIBLE) || g10 == bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.k$c */
    static final class c extends b {

        /* renamed from: c, reason: collision with root package name */
        private final Object f16932c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f16933d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f16934e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Z.c operation, androidx.core.os.d signal, boolean z10, boolean z11) {
            super(operation, signal);
            Object returnTransition;
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            Z.c.b g10 = operation.g();
            Z.c.b bVar = Z.c.b.VISIBLE;
            if (g10 == bVar) {
                ComponentCallbacksC1573o h10 = operation.h();
                returnTransition = z10 ? h10.getReenterTransition() : h10.getEnterTransition();
            } else {
                ComponentCallbacksC1573o h11 = operation.h();
                returnTransition = z10 ? h11.getReturnTransition() : h11.getExitTransition();
            }
            this.f16932c = returnTransition;
            this.f16933d = operation.g() == bVar ? z10 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f16934e = z11 ? z10 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final T f(Object obj) {
            if (obj == null) {
                return null;
            }
            T t10 = Q.f16832b;
            if (t10 != null && t10.e(obj)) {
                return t10;
            }
            T t11 = Q.f16833c;
            if (t11 != null && t11.e(obj)) {
                return t11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final T e() {
            T f10 = f(this.f16932c);
            T f11 = f(this.f16934e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 == null ? f11 : f10;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.f16932c + " which uses a different Transition  type than its shared element transition " + this.f16934e).toString());
        }

        public final Object g() {
            return this.f16934e;
        }

        public final Object h() {
            return this.f16932c;
        }

        public final boolean i() {
            return this.f16934e != null;
        }

        public final boolean j() {
            return this.f16933d;
        }
    }

    /* renamed from: androidx.fragment.app.k$d */
    static final class d extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f16935a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Collection collection) {
            super(1);
            this.f16935a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(CollectionsKt.V(this.f16935a, AbstractC1484a0.J((View) entry.getValue())));
        }
    }

    /* renamed from: androidx.fragment.app.k$e */
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f16937b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f16938c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Z.c f16939d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f16940e;

        e(View view, boolean z10, Z.c cVar, a aVar) {
            this.f16937b = view;
            this.f16938c = z10;
            this.f16939d = cVar;
            this.f16940e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            C1569k.this.q().endViewTransition(this.f16937b);
            if (this.f16938c) {
                Z.c.b g10 = this.f16939d.g();
                View viewToAnimate = this.f16937b;
                Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                g10.applyState(viewToAnimate);
            }
            this.f16940e.a();
            if (G.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f16939d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$f */
    public static final class f implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z.c f16941a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1569k f16942b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f16943c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f16944d;

        f(Z.c cVar, C1569k c1569k, View view, a aVar) {
            this.f16941a = cVar;
            this.f16942b = c1569k;
            this.f16943c = view;
            this.f16944d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C1569k this$0, View view, a animationInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
            this$0.q().endViewTransition(view);
            animationInfo.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ViewGroup q10 = this.f16942b.q();
            final C1569k c1569k = this.f16942b;
            final View view = this.f16943c;
            final a aVar = this.f16944d;
            q10.post(new Runnable() { // from class: androidx.fragment.app.l
                @Override // java.lang.Runnable
                public final void run() {
                    C1569k.f.b(C1569k.this, view, aVar);
                }
            });
            if (G.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f16941a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (G.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f16941a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569k(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    private final void D(Z.c cVar) {
        View view = cVar.h().mView;
        Z.c.b g10 = cVar.g();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        g10.applyState(view);
    }

    private final void E(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC1494f0.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                E(arrayList, child);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List awaitingContainerChanges, Z.c operation, C1569k this$0) {
        Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.D(operation);
        }
    }

    private final void G(Map map, View view) {
        String J10 = AbstractC1484a0.J(view);
        if (J10 != null) {
            map.put(J10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    G(map, child);
                }
            }
        }
    }

    private final void H(C3476a c3476a, Collection collection) {
        Set entries = c3476a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.H(entries, new d(collection));
    }

    private final void I(List list, List list2, boolean z10, Map map) {
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.d()) {
                aVar.a();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                AbstractC1578u.a e10 = aVar.e(context);
                if (e10 == null) {
                    aVar.a();
                } else {
                    final Animator animator = e10.f17016b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final Z.c b10 = aVar.b();
                        ComponentCallbacksC1573o h10 = b10.h();
                        if (Intrinsics.b(map.get(b10), Boolean.TRUE)) {
                            if (G.J0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + h10 + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            boolean z12 = b10.g() == Z.c.b.GONE;
                            if (z12) {
                                list2.remove(b10);
                            }
                            View view = h10.mView;
                            q().startViewTransition(view);
                            animator.addListener(new e(view, z12, b10, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (G.J0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + b10 + " has started.");
                            }
                            aVar.c().c(new d.a() { // from class: androidx.fragment.app.e
                                @Override // androidx.core.os.d.a
                                public final void onCancel() {
                                    C1569k.J(animator, b10);
                                }
                            });
                            z11 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final Z.c b11 = aVar2.b();
            ComponentCallbacksC1573o h11 = b11.h();
            if (z10) {
                if (G.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h11 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z11) {
                if (G.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h11 + " as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                final View view2 = h11.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                AbstractC1578u.a e11 = aVar2.e(context);
                if (e11 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = e11.f17015a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (b11.g() != Z.c.b.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.a();
                } else {
                    q().startViewTransition(view2);
                    AbstractC1578u.b bVar = new AbstractC1578u.b(animation, q(), view2);
                    bVar.setAnimationListener(new f(b11, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b11 + " has started.");
                    }
                }
                aVar2.c().c(new d.a() { // from class: androidx.fragment.app.f
                    @Override // androidx.core.os.d.a
                    public final void onCancel() {
                        C1569k.K(view2, this, aVar2, b11);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Animator animator, Z.c operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (G.J0(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view, C1569k this$0, a animationInfo, Z.c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.q().endViewTransition(view);
        animationInfo.a();
        if (G.J0(2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map L(List list, List list2, boolean z10, final Z.c cVar, final Z.c cVar2) {
        String str;
        String str2;
        View view;
        Object obj;
        String str3;
        boolean z11;
        Object obj2;
        Object obj3;
        View view2;
        final ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        Object obj4;
        Z.c cVar3;
        View view3;
        Rect rect;
        Pair a10;
        View view4;
        final View view5;
        C1569k c1569k = this;
        final boolean z12 = z10;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : list) {
            if (!((c) obj5).d()) {
                arrayList2.add(obj5);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList();
        for (Object obj6 : arrayList2) {
            if (((c) obj6).e() != null) {
                arrayList3.add(obj6);
            }
        }
        final T t10 = null;
        for (c cVar4 : arrayList3) {
            T e10 = cVar4.e();
            if (t10 != null && e10 != t10) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar4.b().h() + " returned Transition " + cVar4.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            t10 = e10;
        }
        if (t10 == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar5 = (c) it.next();
                linkedHashMap2.put(cVar5.b(), Boolean.FALSE);
                cVar5.a();
            }
            return linkedHashMap2;
        }
        View view6 = new View(q().getContext());
        final Rect rect2 = new Rect();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C3476a c3476a = new C3476a();
        Iterator it2 = list.iterator();
        View view7 = null;
        Object obj7 = null;
        boolean z13 = false;
        while (true) {
            str = "FragmentManager";
            if (!it2.hasNext()) {
                break;
            }
            c cVar6 = (c) it2.next();
            if (!cVar6.i() || cVar == null || cVar2 == null) {
                rect = rect2;
                view6 = view6;
                arrayList4 = arrayList4;
                linkedHashMap2 = linkedHashMap2;
                c3476a = c3476a;
                view7 = view7;
                arrayList5 = arrayList5;
            } else {
                Object u10 = t10.u(t10.f(cVar6.g()));
                ArrayList<String> sharedElementSourceNames = cVar2.h().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = cVar.h().getSharedElementSourceNames();
                View view8 = view7;
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = cVar.h().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view9 = view6;
                int i10 = 0;
                while (i10 < size) {
                    int i11 = size;
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    ArrayList<String> arrayList6 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                    }
                    i10++;
                    size = i11;
                    sharedElementTargetNames = arrayList6;
                }
                ArrayList<String> sharedElementTargetNames2 = cVar2.h().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                if (z12) {
                    cVar.h().getEnterTransitionCallback();
                    cVar2.h().getExitTransitionCallback();
                    a10 = lc.t.a(null, null);
                } else {
                    cVar.h().getExitTransitionCallback();
                    cVar2.h().getEnterTransitionCallback();
                    a10 = lc.t.a(null, null);
                }
                android.support.v4.media.session.b.a(a10.getFirst());
                android.support.v4.media.session.b.a(a10.getSecond());
                int i12 = 0;
                for (int size2 = sharedElementSourceNames.size(); i12 < size2; size2 = size2) {
                    c3476a.put(sharedElementSourceNames.get(i12), sharedElementTargetNames2.get(i12));
                    i12++;
                }
                if (G.J0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator<String> it3 = sharedElementTargetNames2.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + it3.next());
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it4 = sharedElementSourceNames.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + it4.next());
                    }
                }
                C3476a c3476a2 = new C3476a();
                View view10 = cVar.h().mView;
                Intrinsics.checkNotNullExpressionValue(view10, "firstOut.fragment.mView");
                c1569k.G(c3476a2, view10);
                c3476a2.o(sharedElementSourceNames);
                c3476a.o(c3476a2.keySet());
                final C3476a c3476a3 = new C3476a();
                View view11 = cVar2.h().mView;
                Intrinsics.checkNotNullExpressionValue(view11, "lastIn.fragment.mView");
                c1569k.G(c3476a3, view11);
                c3476a3.o(sharedElementTargetNames2);
                c3476a3.o(c3476a.values());
                Q.c(c3476a, c3476a3);
                Set keySet = c3476a.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "sharedElementNameMapping.keys");
                c1569k.H(c3476a2, keySet);
                Collection values = c3476a.values();
                Intrinsics.checkNotNullExpressionValue(values, "sharedElementNameMapping.values");
                c1569k.H(c3476a3, values);
                if (c3476a.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view7 = view8;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    obj7 = null;
                } else {
                    C3476a c3476a4 = c3476a;
                    Q.a(cVar2.h(), cVar.h(), z12, c3476a2, true);
                    androidx.core.view.L.a(q(), new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1569k.P(Z.c.this, cVar, z12, c3476a3);
                        }
                    });
                    arrayList4.addAll(c3476a2.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view4 = view8;
                    } else {
                        view4 = (View) c3476a2.get(sharedElementSourceNames.get(0));
                        t10.p(u10, view4);
                    }
                    arrayList5.addAll(c3476a3.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view5 = (View) c3476a3.get(sharedElementTargetNames2.get(0))) != null) {
                        androidx.core.view.L.a(q(), new Runnable() { // from class: androidx.fragment.app.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1569k.M(T.this, view5, rect2);
                            }
                        });
                        z13 = true;
                    }
                    t10.s(u10, view9, arrayList4);
                    ArrayList arrayList7 = arrayList5;
                    rect = rect2;
                    t10.n(u10, null, null, null, null, u10, arrayList7);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(cVar, bool);
                    linkedHashMap3.put(cVar2, bool);
                    view7 = view4;
                    arrayList4 = arrayList4;
                    c3476a = c3476a4;
                    obj7 = u10;
                    arrayList5 = arrayList7;
                    view6 = view9;
                    linkedHashMap2 = linkedHashMap3;
                }
            }
            rect2 = rect;
            z12 = z10;
        }
        View view12 = view7;
        C3476a c3476a5 = c3476a;
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList4;
        Rect rect3 = rect2;
        boolean z14 = true;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view13 = view6;
        ArrayList arrayList10 = new ArrayList();
        Iterator it5 = list.iterator();
        Object obj8 = null;
        Object obj9 = null;
        while (it5.hasNext()) {
            c cVar7 = (c) it5.next();
            if (cVar7.d()) {
                linkedHashMap4.put(cVar7.b(), Boolean.FALSE);
                cVar7.a();
            } else {
                Object f10 = t10.f(cVar7.h());
                Z.c b10 = cVar7.b();
                boolean z15 = (obj7 == null || !(b10 == cVar || b10 == cVar2)) ? false : z14;
                if (f10 != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList arrayList11 = new ArrayList();
                    View view14 = b10.h().mView;
                    Object obj10 = obj7;
                    Intrinsics.checkNotNullExpressionValue(view14, "operation.fragment.mView");
                    c1569k.E(arrayList11, view14);
                    if (z15) {
                        if (b10 == cVar) {
                            arrayList11.removeAll(CollectionsKt.S0(arrayList9));
                        } else {
                            arrayList11.removeAll(CollectionsKt.S0(arrayList8));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        t10.a(f10, view13);
                        view2 = view13;
                        obj4 = f10;
                        str3 = str;
                        obj2 = obj8;
                        obj3 = obj9;
                        arrayList = arrayList11;
                        view = view12;
                        linkedHashMap = linkedHashMap5;
                        obj = obj10;
                        z11 = true;
                        cVar3 = b10;
                    } else {
                        t10.b(f10, arrayList11);
                        view = view12;
                        obj = obj10;
                        str3 = str;
                        z11 = true;
                        obj2 = obj8;
                        obj3 = obj9;
                        view2 = view13;
                        arrayList = arrayList11;
                        linkedHashMap = linkedHashMap5;
                        t10.n(f10, f10, arrayList11, null, null, null, null);
                        if (b10.g() == Z.c.b.GONE) {
                            cVar3 = b10;
                            list2.remove(cVar3);
                            ArrayList arrayList12 = new ArrayList(arrayList);
                            arrayList12.remove(cVar3.h().mView);
                            obj4 = f10;
                            t10.m(obj4, cVar3.h().mView, arrayList12);
                            androidx.core.view.L.a(q(), new Runnable() { // from class: androidx.fragment.app.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1569k.N(arrayList);
                                }
                            });
                        } else {
                            obj4 = f10;
                            cVar3 = b10;
                        }
                    }
                    if (cVar3.g() == Z.c.b.VISIBLE) {
                        arrayList10.addAll(arrayList);
                        if (z13) {
                            t10.o(obj4, rect3);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        t10.p(obj4, view3);
                    }
                    linkedHashMap.put(cVar3, Boolean.TRUE);
                    if (cVar7.j()) {
                        obj9 = t10.k(obj3, obj4, null);
                        linkedHashMap4 = linkedHashMap;
                        view12 = view3;
                        view13 = view2;
                        z14 = z11;
                        obj7 = obj;
                        str = str3;
                        obj8 = obj2;
                    } else {
                        obj9 = obj3;
                        obj8 = t10.k(obj2, obj4, null);
                        linkedHashMap4 = linkedHashMap;
                        view12 = view3;
                        view13 = view2;
                        z14 = z11;
                        obj7 = obj;
                        str = str3;
                    }
                    c1569k = this;
                } else if (!z15) {
                    linkedHashMap4.put(b10, Boolean.FALSE);
                    cVar7.a();
                }
            }
        }
        String str4 = str;
        boolean z16 = z14;
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object obj11 = obj7;
        Object j10 = t10.j(obj9, obj8, obj11);
        if (j10 == null) {
            return linkedHashMap6;
        }
        ArrayList<c> arrayList13 = new ArrayList();
        for (Object obj12 : list) {
            if (!((c) obj12).d()) {
                arrayList13.add(obj12);
            }
        }
        for (final c cVar8 : arrayList13) {
            Object h10 = cVar8.h();
            final Z.c b11 = cVar8.b();
            boolean z17 = (obj11 == null || !(b11 == cVar || b11 == cVar2)) ? false : z16;
            if (h10 == null && !z17) {
                str2 = str4;
            } else if (AbstractC1484a0.U(q())) {
                str2 = str4;
                t10.q(cVar8.b().h(), j10, cVar8.c(), new Runnable() { // from class: androidx.fragment.app.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1569k.O(C1569k.c.this, b11);
                    }
                });
            } else {
                if (G.J0(2)) {
                    str2 = str4;
                    Log.v(str2, "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + b11);
                } else {
                    str2 = str4;
                }
                cVar8.a();
            }
            str4 = str2;
        }
        String str5 = str4;
        if (!AbstractC1484a0.U(q())) {
            return linkedHashMap6;
        }
        Q.d(arrayList10, 4);
        ArrayList l10 = t10.l(arrayList8);
        if (G.J0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it6 = arrayList9.iterator();
            while (it6.hasNext()) {
                Object sharedElementFirstOutViews = it6.next();
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view15 = (View) sharedElementFirstOutViews;
                Log.v(str5, "View: " + view15 + " Name: " + AbstractC1484a0.J(view15));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                Object sharedElementLastInViews = it7.next();
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view16 = (View) sharedElementLastInViews;
                Log.v(str5, "View: " + view16 + " Name: " + AbstractC1484a0.J(view16));
            }
        }
        t10.c(q(), j10);
        t10.r(q(), arrayList9, arrayList8, l10, c3476a5);
        Q.d(arrayList10, 0);
        t10.t(obj11, arrayList9, arrayList8);
        return linkedHashMap6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(T impl, View view, Rect lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.h(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ArrayList transitioningViews) {
        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
        Q.d(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c transitionInfo, Z.c operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.a();
        if (G.J0(2)) {
            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Z.c cVar, Z.c cVar2, boolean z10, C3476a lastInViews) {
        Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
        Q.a(cVar.h(), cVar2.h(), z10, lastInViews, false);
    }

    private final void Q(List list) {
        ComponentCallbacksC1573o h10 = ((Z.c) CollectionsKt.n0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z.c cVar = (Z.c) it.next();
            cVar.h().mAnimationInfo.f16991c = h10.mAnimationInfo.f16991c;
            cVar.h().mAnimationInfo.f16992d = h10.mAnimationInfo.f16992d;
            cVar.h().mAnimationInfo.f16993e = h10.mAnimationInfo.f16993e;
            cVar.h().mAnimationInfo.f16994f = h10.mAnimationInfo.f16994f;
        }
    }

    @Override // androidx.fragment.app.Z
    public void j(List operations, boolean z10) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            Z.c cVar = (Z.c) obj2;
            Z.c.b.a aVar = Z.c.b.Companion;
            View view = cVar.h().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            Z.c.b a10 = aVar.a(view);
            Z.c.b bVar = Z.c.b.VISIBLE;
            if (a10 == bVar && cVar.g() != bVar) {
                break;
            }
        }
        Z.c cVar2 = (Z.c) obj2;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            Z.c cVar3 = (Z.c) previous;
            Z.c.b.a aVar2 = Z.c.b.Companion;
            View view2 = cVar3.h().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            Z.c.b a11 = aVar2.a(view2);
            Z.c.b bVar2 = Z.c.b.VISIBLE;
            if (a11 != bVar2 && cVar3.g() == bVar2) {
                obj = previous;
                break;
            }
        }
        Z.c cVar4 = (Z.c) obj;
        if (G.J0(2)) {
            Log.v("FragmentManager", "Executing operations from " + cVar2 + " to " + cVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List Q02 = CollectionsKt.Q0(operations);
        Q(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            final Z.c cVar5 = (Z.c) it2.next();
            androidx.core.os.d dVar = new androidx.core.os.d();
            cVar5.l(dVar);
            arrayList.add(new a(cVar5, dVar, z10));
            androidx.core.os.d dVar2 = new androidx.core.os.d();
            cVar5.l(dVar2);
            boolean z11 = false;
            if (z10) {
                if (cVar5 != cVar2) {
                    arrayList2.add(new c(cVar5, dVar2, z10, z11));
                    cVar5.c(new Runnable() { // from class: androidx.fragment.app.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1569k.F(Q02, cVar5, this);
                        }
                    });
                }
                z11 = true;
                arrayList2.add(new c(cVar5, dVar2, z10, z11));
                cVar5.c(new Runnable() { // from class: androidx.fragment.app.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1569k.F(Q02, cVar5, this);
                    }
                });
            } else {
                if (cVar5 != cVar4) {
                    arrayList2.add(new c(cVar5, dVar2, z10, z11));
                    cVar5.c(new Runnable() { // from class: androidx.fragment.app.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1569k.F(Q02, cVar5, this);
                        }
                    });
                }
                z11 = true;
                arrayList2.add(new c(cVar5, dVar2, z10, z11));
                cVar5.c(new Runnable() { // from class: androidx.fragment.app.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1569k.F(Q02, cVar5, this);
                    }
                });
            }
        }
        Map L10 = L(arrayList2, Q02, z10, cVar2, cVar4);
        I(arrayList, Q02, L10.containsValue(Boolean.TRUE), L10);
        Iterator it3 = Q02.iterator();
        while (it3.hasNext()) {
            D((Z.c) it3.next());
        }
        Q02.clear();
        if (G.J0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + cVar2 + " to " + cVar4);
        }
    }
}
