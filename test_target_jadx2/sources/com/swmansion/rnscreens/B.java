package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.r;
import ga.AnimationAnimationListenerC3211d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class B extends C2949t {

    /* renamed from: r, reason: collision with root package name */
    public static final a f29828r = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f29829h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f29830i;

    /* renamed from: j, reason: collision with root package name */
    private final List f29831j;

    /* renamed from: k, reason: collision with root package name */
    private List f29832k;

    /* renamed from: l, reason: collision with root package name */
    private D f29833l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29834m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f29835n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f29836o;

    /* renamed from: p, reason: collision with root package name */
    private int f29837p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f29838q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(z zVar) {
            return Build.VERSION.SDK_INT >= 33 || zVar.m().getStackAnimation() == r.d.SLIDE_FROM_BOTTOM || zVar.m().getStackAnimation() == r.d.FADE_FROM_BOTTOM || zVar.m().getStackAnimation() == r.d.IOS_FROM_RIGHT || zVar.m().getStackAnimation() == r.d.IOS_FROM_LEFT;
        }

        private a() {
        }
    }

    private final class b {

        /* renamed from: a, reason: collision with root package name */
        private Canvas f29839a;

        /* renamed from: b, reason: collision with root package name */
        private View f29840b;

        /* renamed from: c, reason: collision with root package name */
        private long f29841c;

        public b() {
        }

        public final void a() {
            B.this.J(this);
            this.f29839a = null;
            this.f29840b = null;
            this.f29841c = 0L;
        }

        public final Canvas b() {
            return this.f29839a;
        }

        public final View c() {
            return this.f29840b;
        }

        public final long d() {
            return this.f29841c;
        }

        public final void e(Canvas canvas) {
            this.f29839a = canvas;
        }

        public final void f(View view) {
            this.f29840b = view;
        }

        public final void g(long j10) {
            this.f29841c = j10;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29843a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f29844b;

        static {
            int[] iArr = new int[r.e.values().length];
            try {
                iArr[r.e.FORM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f29843a = iArr;
            int[] iArr2 = new int[r.d.values().length];
            try {
                iArr2[r.d.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[r.d.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[r.d.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r.d.SLIDE_FROM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[r.d.SLIDE_FROM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[r.d.SLIDE_FROM_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[r.d.FADE_FROM_BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[r.d.IOS_FROM_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[r.d.IOS_FROM_LEFT.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            f29844b = iArr2;
        }
    }

    public B(Context context) {
        super(context);
        this.f29829h = new ArrayList();
        this.f29830i = new HashSet();
        this.f29831j = new ArrayList();
        this.f29832k = new ArrayList();
    }

    private final void E() {
        int f10 = L0.f(this);
        Context context = getContext();
        Intrinsics.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher c10 = L0.c((ReactContext) context, getId());
        if (c10 != null) {
            c10.c(new ha.r(f10, getId()));
        }
    }

    private final void F() {
        List<b> list = this.f29832k;
        this.f29832k = new ArrayList();
        for (b bVar : list) {
            bVar.a();
            this.f29831j.add(bVar);
        }
    }

    private final b G() {
        if (this.f29831j.isEmpty()) {
            return new b();
        }
        List list = this.f29831j;
        return (b) list.remove(CollectionsKt.l(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(z zVar) {
        r m10;
        if (zVar == null || (m10 = zVar.m()) == null) {
            return;
        }
        m10.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(b bVar) {
        Canvas b10 = bVar.b();
        Intrinsics.d(b10);
        super.drawChild(b10, bVar.c(), bVar.d());
    }

    private final void K(z zVar) {
        D d10;
        if (this.f30031a.size() > 1 && zVar != null && (d10 = this.f29833l) != null && d10.m().l()) {
            ArrayList arrayList = this.f30031a;
            for (z zVar2 : CollectionsKt.M(CollectionsKt.D0(arrayList, kotlin.ranges.d.p(0, arrayList.size() - 1)))) {
                zVar2.m().d(4);
                if (Intrinsics.b(zVar2, zVar)) {
                    break;
                }
            }
        }
        r topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.d(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.C2949t
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public D c(r screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return c.f29843a[screen.getStackPresentation().ordinal()] == 1 ? new AnimationAnimationListenerC3211d(new C(screen)) : new C(screen);
    }

    public final void D(D screenFragment) {
        Intrinsics.checkNotNullParameter(screenFragment, "screenFragment");
        this.f29830i.add(screenFragment);
        v();
    }

    public final void I() {
        if (this.f29834m) {
            return;
        }
        E();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f29832k.size() < this.f29837p) {
            this.f29836o = false;
        }
        this.f29837p = this.f29832k.size();
        if (this.f29836o && this.f29832k.size() >= 2) {
            Collections.swap(this.f29832k, r4.size() - 1, this.f29832k.size() - 2);
        }
        F();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        List list = this.f29832k;
        b G10 = G();
        G10.e(canvas);
        G10.f(child);
        G10.g(j10);
        list.add(G10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        if (this.f29834m) {
            this.f29834m = false;
            E();
        }
    }

    public final ArrayList<D> getFragments() {
        return this.f29829h;
    }

    public final boolean getGoingForward() {
        return this.f29838q;
    }

    public final r getRootScreen() {
        Object obj;
        r m10;
        Iterator it = this.f30031a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!CollectionsKt.V(this.f29830i, (z) obj)) {
                break;
            }
        }
        z zVar = (z) obj;
        if (zVar == null || (m10 = zVar.m()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return m10;
    }

    @Override // com.swmansion.rnscreens.C2949t
    public r getTopScreen() {
        D d10 = this.f29833l;
        if (d10 != null) {
            return d10.m();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.C2949t
    public boolean n(z zVar) {
        return super.n(zVar) && !CollectionsKt.V(this.f29830i, zVar);
    }

    @Override // com.swmansion.rnscreens.C2949t
    protected void p() {
        Iterator it = this.f29829h.iterator();
        while (it.hasNext()) {
            ((D) it.next()).s();
        }
    }

    @Override // com.swmansion.rnscreens.C2949t, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f29835n) {
            this.f29835n = false;
            this.f29836o = true;
        }
        super.removeView(view);
    }

    public final void setGoingForward(boolean z10) {
        this.f29838q = z10;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.startViewTransition(view);
        this.f29834m = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024a A[LOOP:4: B:118:0x0244->B:120:0x024a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d6  */
    @Override // com.swmansion.rnscreens.C2949t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t() {
        r.d stackAnimation;
        boolean z10;
        r m10;
        androidx.fragment.app.P g10;
        Iterator it;
        Iterator it2;
        z zVar;
        r m11;
        this.f29835n = false;
        int size = this.f30031a.size() - 1;
        final z zVar2 = null;
        z zVar3 = null;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                z m12 = m(size);
                if (!CollectionsKt.V(this.f29830i, m12) && m12.m().getActivityState() != r.a.INACTIVE) {
                    if (zVar2 == null) {
                        zVar2 = m12;
                    } else {
                        zVar3 = m12;
                    }
                    if (!m12.m().l()) {
                        break;
                    }
                }
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        boolean z11 = true;
        if (CollectionsKt.V(this.f29829h, zVar2)) {
            D d10 = this.f29833l;
            if (d10 != null && !Intrinsics.b(d10, zVar2)) {
                D d11 = this.f29833l;
                stackAnimation = (d11 == null || (m10 = d11.m()) == null) ? null : m10.getStackAnimation();
                z10 = false;
                g10 = g();
                if (stackAnimation != null) {
                }
                this.f29838q = z10;
                if (z10) {
                }
                it = this.f29829h.iterator();
                while (it.hasNext()) {
                }
                it2 = this.f30031a.iterator();
                while (it2.hasNext()) {
                }
                if (zVar3 == null) {
                }
                if (zVar2 != null) {
                }
                this.f29833l = zVar2 instanceof D ? (D) zVar2 : null;
                this.f29829h.clear();
                ArrayList arrayList = this.f29829h;
                ArrayList<z> arrayList2 = this.f30031a;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.u(arrayList2, 10));
                while (r1.hasNext()) {
                }
                arrayList.addAll(arrayList3);
                K(zVar3);
                g10.j();
            }
            stackAnimation = null;
        } else {
            D d12 = this.f29833l;
            if (d12 != null && zVar2 != null) {
                z10 = (d12 != null && this.f30031a.contains(d12)) || (zVar2.m().getReplaceAnimation() == r.c.PUSH);
                if (z10) {
                    m11 = zVar2.m();
                } else {
                    D d13 = this.f29833l;
                    if (d13 == null || (m11 = d13.m()) == null) {
                        stackAnimation = null;
                        g10 = g();
                        if (stackAnimation != null) {
                            if (z10) {
                                switch (c.f29844b[stackAnimation.ordinal()]) {
                                    case 1:
                                        g10.q(AbstractC2945o.f29969a, AbstractC2945o.f29970b);
                                        break;
                                    case 2:
                                        int i11 = AbstractC2945o.f29985q;
                                        g10.q(i11, i11);
                                        break;
                                    case 3:
                                        g10.q(AbstractC2945o.f29974f, AbstractC2945o.f29975g);
                                        break;
                                    case 4:
                                        g10.q(AbstractC2945o.f29991w, AbstractC2945o.f29993y);
                                        break;
                                    case 5:
                                        g10.q(AbstractC2945o.f29990v, AbstractC2945o.f29994z);
                                        break;
                                    case 6:
                                        g10.q(AbstractC2945o.f29989u, AbstractC2945o.f29988t);
                                        break;
                                    case 7:
                                        g10.q(AbstractC2945o.f29973e, AbstractC2945o.f29987s);
                                        break;
                                    case 8:
                                        g10.q(AbstractC2945o.f29984p, AbstractC2945o.f29982n);
                                        break;
                                    case 9:
                                        g10.q(AbstractC2945o.f29980l, AbstractC2945o.f29978j);
                                        break;
                                }
                            } else {
                                switch (c.f29844b[stackAnimation.ordinal()]) {
                                    case 1:
                                        g10.q(AbstractC2945o.f29971c, AbstractC2945o.f29972d);
                                        break;
                                    case 2:
                                        int i12 = AbstractC2945o.f29985q;
                                        g10.q(i12, i12);
                                        break;
                                    case 3:
                                        g10.q(AbstractC2945o.f29974f, AbstractC2945o.f29975g);
                                        break;
                                    case 4:
                                        g10.q(AbstractC2945o.f29990v, AbstractC2945o.f29994z);
                                        break;
                                    case 5:
                                        g10.q(AbstractC2945o.f29991w, AbstractC2945o.f29993y);
                                        break;
                                    case 6:
                                        g10.q(AbstractC2945o.f29988t, AbstractC2945o.f29992x);
                                        break;
                                    case 7:
                                        g10.q(AbstractC2945o.f29986r, AbstractC2945o.f29976h);
                                        break;
                                    case 8:
                                        g10.q(AbstractC2945o.f29981m, AbstractC2945o.f29983o);
                                        break;
                                    case 9:
                                        g10.q(AbstractC2945o.f29977i, AbstractC2945o.f29979k);
                                        break;
                                }
                            }
                        }
                        this.f29838q = z10;
                        if (z10 && zVar2 != null && f29828r.b(zVar2) && zVar3 == null) {
                            this.f29835n = true;
                        }
                        it = this.f29829h.iterator();
                        while (it.hasNext()) {
                            D d14 = (D) it.next();
                            if (!this.f30031a.contains(d14) || this.f29830i.contains(d14)) {
                                g10.m(d14.f());
                            }
                        }
                        it2 = this.f30031a.iterator();
                        while (it2.hasNext() && (zVar = (z) it2.next()) != zVar3) {
                            if ((zVar == zVar2 && !CollectionsKt.V(this.f29830i, zVar)) || zVar.m().getActivityState() == r.a.INACTIVE) {
                                g10.m(zVar.f());
                            }
                        }
                        if (zVar3 == null && !zVar3.f().isAdded()) {
                            Iterator it3 = this.f30031a.iterator();
                            while (it3.hasNext()) {
                                z zVar4 = (z) it3.next();
                                if (z11) {
                                    if (zVar4 == zVar3) {
                                        z11 = false;
                                    }
                                }
                                g10.b(getId(), zVar4.f()).p(new Runnable() { // from class: com.swmansion.rnscreens.A
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        B.H(z.this);
                                    }
                                });
                            }
                        } else if (zVar2 != null && !zVar2.f().isAdded()) {
                            g10.b(getId(), zVar2.f());
                        }
                        this.f29833l = zVar2 instanceof D ? (D) zVar2 : null;
                        this.f29829h.clear();
                        ArrayList arrayList4 = this.f29829h;
                        ArrayList<z> arrayList22 = this.f30031a;
                        ArrayList arrayList32 = new ArrayList(CollectionsKt.u(arrayList22, 10));
                        for (z zVar5 : arrayList22) {
                            Intrinsics.e(zVar5, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragmentWrapper");
                            arrayList32.add((D) zVar5);
                        }
                        arrayList4.addAll(arrayList32);
                        K(zVar3);
                        g10.j();
                    }
                }
                stackAnimation = m11.getStackAnimation();
                g10 = g();
                if (stackAnimation != null) {
                }
                this.f29838q = z10;
                if (z10) {
                    this.f29835n = true;
                }
                it = this.f29829h.iterator();
                while (it.hasNext()) {
                }
                it2 = this.f30031a.iterator();
                while (it2.hasNext()) {
                    if (zVar == zVar2) {
                    }
                }
                if (zVar3 == null) {
                }
                if (zVar2 != null) {
                    g10.b(getId(), zVar2.f());
                }
                this.f29833l = zVar2 instanceof D ? (D) zVar2 : null;
                this.f29829h.clear();
                ArrayList arrayList42 = this.f29829h;
                ArrayList<z> arrayList222 = this.f30031a;
                ArrayList arrayList322 = new ArrayList(CollectionsKt.u(arrayList222, 10));
                while (r1.hasNext()) {
                }
                arrayList42.addAll(arrayList322);
                K(zVar3);
                g10.j();
            }
            if (d12 == null && zVar2 != null) {
                stackAnimation = r.d.NONE;
                this.f29838q = true;
            }
            stackAnimation = null;
        }
        z10 = true;
        g10 = g();
        if (stackAnimation != null) {
        }
        this.f29838q = z10;
        if (z10) {
        }
        it = this.f29829h.iterator();
        while (it.hasNext()) {
        }
        it2 = this.f30031a.iterator();
        while (it2.hasNext()) {
        }
        if (zVar3 == null) {
        }
        if (zVar2 != null) {
        }
        this.f29833l = zVar2 instanceof D ? (D) zVar2 : null;
        this.f29829h.clear();
        ArrayList arrayList422 = this.f29829h;
        ArrayList<z> arrayList2222 = this.f30031a;
        ArrayList arrayList3222 = new ArrayList(CollectionsKt.u(arrayList2222, 10));
        while (r1.hasNext()) {
        }
        arrayList422.addAll(arrayList3222);
        K(zVar3);
        g10.j();
    }

    @Override // com.swmansion.rnscreens.C2949t
    public void w() {
        this.f29830i.clear();
        super.w();
    }

    @Override // com.swmansion.rnscreens.C2949t
    public void y(int i10) {
        Set set = this.f29830i;
        kotlin.jvm.internal.a.a(set).remove(m(i10));
        super.y(i10);
    }
}
