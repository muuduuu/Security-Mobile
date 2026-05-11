package androidx.fragment.app;

import U0.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.InterfaceC1526w;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.P;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1599p;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import e.AbstractC3061c;
import e.AbstractC3062d;
import e.C3059a;
import e.C3064f;
import e.InterfaceC3060b;
import e.InterfaceC3063e;
import f.AbstractC3126a;
import f.C3134i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k1.d;
import org.conscrypt.BuildConfig;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: S, reason: collision with root package name */
    private static boolean f16693S = false;

    /* renamed from: D, reason: collision with root package name */
    private AbstractC3061c f16697D;

    /* renamed from: E, reason: collision with root package name */
    private AbstractC3061c f16698E;

    /* renamed from: F, reason: collision with root package name */
    private AbstractC3061c f16699F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f16701H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f16702I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f16703J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f16704K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f16705L;

    /* renamed from: M, reason: collision with root package name */
    private ArrayList f16706M;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList f16707N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f16708O;

    /* renamed from: P, reason: collision with root package name */
    private J f16709P;

    /* renamed from: Q, reason: collision with root package name */
    private c.C0196c f16710Q;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16713b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f16715d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f16716e;

    /* renamed from: g, reason: collision with root package name */
    private androidx.activity.o f16718g;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f16724m;

    /* renamed from: v, reason: collision with root package name */
    private AbstractC1582y f16733v;

    /* renamed from: w, reason: collision with root package name */
    private AbstractC1579v f16734w;

    /* renamed from: x, reason: collision with root package name */
    private ComponentCallbacksC1573o f16735x;

    /* renamed from: y, reason: collision with root package name */
    ComponentCallbacksC1573o f16736y;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f16712a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final O f16714c = new O();

    /* renamed from: f, reason: collision with root package name */
    private final LayoutInflaterFactory2C1583z f16717f = new LayoutInflaterFactory2C1583z(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.activity.n f16719h = new b(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f16720i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map f16721j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map f16722k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    private final Map f16723l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final A f16725n = new A(this);

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f16726o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC5159a f16727p = new InterfaceC5159a() { // from class: androidx.fragment.app.B
        @Override // y0.InterfaceC5159a
        public final void accept(Object obj) {
            G.this.S0((Configuration) obj);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC5159a f16728q = new InterfaceC5159a() { // from class: androidx.fragment.app.C
        @Override // y0.InterfaceC5159a
        public final void accept(Object obj) {
            G.this.T0((Integer) obj);
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC5159a f16729r = new InterfaceC5159a() { // from class: androidx.fragment.app.D
        @Override // y0.InterfaceC5159a
        public final void accept(Object obj) {
            G.this.U0((androidx.core.app.p) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC5159a f16730s = new InterfaceC5159a() { // from class: androidx.fragment.app.E
        @Override // y0.InterfaceC5159a
        public final void accept(Object obj) {
            G.this.V0((androidx.core.app.z) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final androidx.core.view.B f16731t = new c();

    /* renamed from: u, reason: collision with root package name */
    int f16732u = -1;

    /* renamed from: z, reason: collision with root package name */
    private AbstractC1581x f16737z = null;

    /* renamed from: A, reason: collision with root package name */
    private AbstractC1581x f16694A = new d();

    /* renamed from: B, reason: collision with root package name */
    private b0 f16695B = null;

    /* renamed from: C, reason: collision with root package name */
    private b0 f16696C = new e();

    /* renamed from: G, reason: collision with root package name */
    ArrayDeque f16700G = new ArrayDeque();

    /* renamed from: R, reason: collision with root package name */
    private Runnable f16711R = new f();

    class a implements InterfaceC3060b {
        a() {
        }

        @Override // e.InterfaceC3060b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l lVar = (l) G.this.f16700G.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVar.f16748a;
            int i11 = lVar.f16749b;
            ComponentCallbacksC1573o i12 = G.this.f16714c.i(str);
            if (i12 != null) {
                i12.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends androidx.activity.n {
        b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.n
        public void b() {
            G.this.F0();
        }
    }

    class c implements androidx.core.view.B {
        c() {
        }

        @Override // androidx.core.view.B
        public boolean a(MenuItem menuItem) {
            return G.this.I(menuItem);
        }

        @Override // androidx.core.view.B
        public void b(Menu menu) {
            G.this.J(menu);
        }

        @Override // androidx.core.view.B
        public void c(Menu menu, MenuInflater menuInflater) {
            G.this.B(menu, menuInflater);
        }

        @Override // androidx.core.view.B
        public void d(Menu menu) {
            G.this.N(menu);
        }
    }

    class d extends AbstractC1581x {
        d() {
        }

        @Override // androidx.fragment.app.AbstractC1581x
        public ComponentCallbacksC1573o a(ClassLoader classLoader, String str) {
            return G.this.w0().b(G.this.w0().f(), str, null);
        }
    }

    class e implements b0 {
        e() {
        }

        @Override // androidx.fragment.app.b0
        public Z a(ViewGroup viewGroup) {
            return new C1569k(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.Z(true);
        }
    }

    class g implements K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f16744a;

        g(ComponentCallbacksC1573o componentCallbacksC1573o) {
            this.f16744a = componentCallbacksC1573o;
        }

        @Override // androidx.fragment.app.K
        public void a(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
            this.f16744a.onAttachFragment(componentCallbacksC1573o);
        }
    }

    class h implements InterfaceC3060b {
        h() {
        }

        @Override // e.InterfaceC3060b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3059a c3059a) {
            l lVar = (l) G.this.f16700G.pollLast();
            if (lVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVar.f16748a;
            int i10 = lVar.f16749b;
            ComponentCallbacksC1573o i11 = G.this.f16714c.i(str);
            if (i11 != null) {
                i11.onActivityResult(i10, c3059a.b(), c3059a.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements InterfaceC3060b {
        i() {
        }

        @Override // e.InterfaceC3060b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C3059a c3059a) {
            l lVar = (l) G.this.f16700G.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVar.f16748a;
            int i10 = lVar.f16749b;
            ComponentCallbacksC1573o i11 = G.this.f16714c.i(str);
            if (i11 != null) {
                i11.onActivityResult(i10, c3059a.b(), c3059a.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends AbstractC3126a {
        j() {
        }

        @Override // f.AbstractC3126a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, C3064f c3064f) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = c3064f.a();
            if (a10 != null && (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c3064f = new C3064f.a(c3064f.d()).b(null).c(c3064f.c(), c3064f.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c3064f);
            if (G.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // f.AbstractC3126a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C3059a c(int i10, Intent intent) {
            return new C3059a(i10, intent);
        }
    }

    public static abstract class k {
        @Deprecated
        public void onFragmentActivityCreated(G g10, ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle) {
        }

        public abstract void onFragmentAttached(G g10, ComponentCallbacksC1573o componentCallbacksC1573o, Context context);

        public void onFragmentCreated(G g10, ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle) {
        }

        public void onFragmentDestroyed(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        }

        public abstract void onFragmentDetached(G g10, ComponentCallbacksC1573o componentCallbacksC1573o);

        public void onFragmentPaused(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        }

        public void onFragmentPreAttached(G g10, ComponentCallbacksC1573o componentCallbacksC1573o, Context context) {
        }

        public void onFragmentPreCreated(G g10, ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle) {
        }

        public void onFragmentResumed(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        }

        public void onFragmentSaveInstanceState(G g10, ComponentCallbacksC1573o componentCallbacksC1573o, Bundle bundle) {
        }

        public void onFragmentStarted(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        }

        public void onFragmentStopped(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        }

        public void onFragmentViewCreated(G g10, ComponentCallbacksC1573o componentCallbacksC1573o, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(G g10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        }
    }

    interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class n implements m {

        /* renamed from: a, reason: collision with root package name */
        final String f16750a;

        /* renamed from: b, reason: collision with root package name */
        final int f16751b;

        /* renamed from: c, reason: collision with root package name */
        final int f16752c;

        n(String str, int i10, int i11) {
            this.f16750a = str;
            this.f16751b = i10;
            this.f16752c = i11;
        }

        @Override // androidx.fragment.app.G.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            ComponentCallbacksC1573o componentCallbacksC1573o = G.this.f16736y;
            if (componentCallbacksC1573o == null || this.f16751b >= 0 || this.f16750a != null || !componentCallbacksC1573o.getChildFragmentManager().e1()) {
                return G.this.h1(arrayList, arrayList2, this.f16750a, this.f16751b, this.f16752c);
            }
            return false;
        }
    }

    private void A1() {
        synchronized (this.f16712a) {
            try {
                if (this.f16712a.isEmpty()) {
                    this.f16719h.f(p0() > 0 && O0(this.f16735x));
                } else {
                    this.f16719h.f(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static ComponentCallbacksC1573o D0(View view) {
        Object tag = view.getTag(T0.b.f9129a);
        if (tag instanceof ComponentCallbacksC1573o) {
            return (ComponentCallbacksC1573o) tag;
        }
        return null;
    }

    public static boolean J0(int i10) {
        return f16693S || Log.isLoggable("FragmentManager", i10);
    }

    private void K(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (componentCallbacksC1573o == null || !componentCallbacksC1573o.equals(e0(componentCallbacksC1573o.mWho))) {
            return;
        }
        componentCallbacksC1573o.performPrimaryNavigationFragmentChanged();
    }

    private boolean K0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        return (componentCallbacksC1573o.mHasMenu && componentCallbacksC1573o.mMenuVisible) || componentCallbacksC1573o.mChildFragmentManager.o();
    }

    private boolean L0() {
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16735x;
        if (componentCallbacksC1573o == null) {
            return true;
        }
        return componentCallbacksC1573o.isAdded() && this.f16735x.getParentFragmentManager().L0();
    }

    private void R(int i10) {
        try {
            this.f16713b = true;
            this.f16714c.d(i10);
            Z0(i10, false);
            Iterator it = s().iterator();
            while (it.hasNext()) {
                ((Z) it.next()).n();
            }
            this.f16713b = false;
            Z(true);
        } catch (Throwable th) {
            this.f16713b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(Configuration configuration) {
        if (L0()) {
            y(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(Integer num) {
        if (L0() && num.intValue() == 80) {
            E(false);
        }
    }

    private void U() {
        if (this.f16705L) {
            this.f16705L = false;
            y1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(androidx.core.app.p pVar) {
        if (L0()) {
            F(pVar.a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(androidx.core.app.z zVar) {
        if (L0()) {
            M(zVar.a(), false);
        }
    }

    private void W() {
        Iterator it = s().iterator();
        while (it.hasNext()) {
            ((Z) it.next()).n();
        }
    }

    private void Y(boolean z10) {
        if (this.f16713b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f16733v == null) {
            if (!this.f16704K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f16733v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            p();
        }
        if (this.f16706M == null) {
            this.f16706M = new ArrayList();
            this.f16707N = new ArrayList();
        }
    }

    private static void b0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C1559a c1559a = (C1559a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c1559a.u(-1);
                c1559a.z();
            } else {
                c1559a.u(1);
                c1559a.y();
            }
            i10++;
        }
    }

    private void c0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ArrayList arrayList3;
        boolean z10 = ((C1559a) arrayList.get(i10)).f16820r;
        ArrayList arrayList4 = this.f16708O;
        if (arrayList4 == null) {
            this.f16708O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f16708O.addAll(this.f16714c.o());
        ComponentCallbacksC1573o A02 = A0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C1559a c1559a = (C1559a) arrayList.get(i12);
            A02 = !((Boolean) arrayList2.get(i12)).booleanValue() ? c1559a.A(this.f16708O, A02) : c1559a.D(this.f16708O, A02);
            z11 = z11 || c1559a.f16811i;
        }
        this.f16708O.clear();
        if (!z10 && this.f16732u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((C1559a) arrayList.get(i13)).f16805c.iterator();
                while (it.hasNext()) {
                    ComponentCallbacksC1573o componentCallbacksC1573o = ((P.a) it.next()).f16823b;
                    if (componentCallbacksC1573o != null && componentCallbacksC1573o.mFragmentManager != null) {
                        this.f16714c.r(u(componentCallbacksC1573o));
                    }
                }
            }
        }
        b0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && (arrayList3 = this.f16724m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(n0((C1559a) it2.next()));
            }
            Iterator it3 = this.f16724m.iterator();
            while (it3.hasNext()) {
                android.support.v4.media.session.b.a(it3.next());
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
            Iterator it5 = this.f16724m.iterator();
            while (it5.hasNext()) {
                android.support.v4.media.session.b.a(it5.next());
                Iterator it6 = linkedHashSet.iterator();
                if (it6.hasNext()) {
                    throw null;
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C1559a c1559a2 = (C1559a) arrayList.get(i14);
            if (booleanValue) {
                for (int size = c1559a2.f16805c.size() - 1; size >= 0; size--) {
                    ComponentCallbacksC1573o componentCallbacksC1573o2 = ((P.a) c1559a2.f16805c.get(size)).f16823b;
                    if (componentCallbacksC1573o2 != null) {
                        u(componentCallbacksC1573o2).m();
                    }
                }
            } else {
                Iterator it7 = c1559a2.f16805c.iterator();
                while (it7.hasNext()) {
                    ComponentCallbacksC1573o componentCallbacksC1573o3 = ((P.a) it7.next()).f16823b;
                    if (componentCallbacksC1573o3 != null) {
                        u(componentCallbacksC1573o3).m();
                    }
                }
            }
        }
        Z0(this.f16732u, true);
        for (Z z12 : t(arrayList, i10, i11)) {
            z12.v(booleanValue);
            z12.t();
            z12.k();
        }
        while (i10 < i11) {
            C1559a c1559a3 = (C1559a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && c1559a3.f16889v >= 0) {
                c1559a3.f16889v = -1;
            }
            c1559a3.C();
            i10++;
        }
        if (z11) {
            n1();
        }
    }

    private int f0(String str, int i10, boolean z10) {
        ArrayList arrayList = this.f16715d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f16715d.size() - 1;
        }
        int size = this.f16715d.size() - 1;
        while (size >= 0) {
            C1559a c1559a = (C1559a) this.f16715d.get(size);
            if ((str != null && str.equals(c1559a.B())) || (i10 >= 0 && i10 == c1559a.f16889v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f16715d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1559a c1559a2 = (C1559a) this.f16715d.get(size - 1);
            if ((str == null || !str.equals(c1559a2.B())) && (i10 < 0 || i10 != c1559a2.f16889v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public static ComponentCallbacksC1573o g0(View view) {
        ComponentCallbacksC1573o l02 = l0(view);
        if (l02 != null) {
            return l02;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private boolean g1(String str, int i10, int i11) {
        Z(false);
        Y(true);
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16736y;
        if (componentCallbacksC1573o != null && i10 < 0 && str == null && componentCallbacksC1573o.getChildFragmentManager().e1()) {
            return true;
        }
        boolean h12 = h1(this.f16706M, this.f16707N, str, i10, i11);
        if (h12) {
            this.f16713b = true;
            try {
                l1(this.f16706M, this.f16707N);
            } finally {
                q();
            }
        }
        A1();
        U();
        this.f16714c.b();
        return h12;
    }

    static G k0(View view) {
        AbstractActivityC1577t abstractActivityC1577t;
        ComponentCallbacksC1573o l02 = l0(view);
        if (l02 != null) {
            if (l02.isAdded()) {
                return l02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + l02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC1577t = null;
                break;
            }
            if (context instanceof AbstractActivityC1577t) {
                abstractActivityC1577t = (AbstractActivityC1577t) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC1577t != null) {
            return abstractActivityC1577t.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static ComponentCallbacksC1573o l0(View view) {
        while (view != null) {
            ComponentCallbacksC1573o D02 = D0(view);
            if (D02 != null) {
                return D02;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void l1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C1559a) arrayList.get(i10)).f16820r) {
                if (i11 != i10) {
                    c0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C1559a) arrayList.get(i11)).f16820r) {
                        i11++;
                    }
                }
                c0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            c0(arrayList, arrayList2, i11, size);
        }
    }

    private void m0() {
        Iterator it = s().iterator();
        while (it.hasNext()) {
            ((Z) it.next()).o();
        }
    }

    private Set n0(C1559a c1559a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c1559a.f16805c.size(); i10++) {
            ComponentCallbacksC1573o componentCallbacksC1573o = ((P.a) c1559a.f16805c.get(i10)).f16823b;
            if (componentCallbacksC1573o != null && c1559a.f16811i) {
                hashSet.add(componentCallbacksC1573o);
            }
        }
        return hashSet;
    }

    private void n1() {
        ArrayList arrayList = this.f16724m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f16724m.get(0));
        throw null;
    }

    private boolean o0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f16712a) {
            if (this.f16712a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f16712a.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= ((m) this.f16712a.get(i10)).a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.f16712a.clear();
                this.f16733v.g().removeCallbacks(this.f16711R);
            }
        }
    }

    private void p() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    static int p1(int i10) {
        int i11 = 4097;
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 8194) {
            i11 = 8197;
            if (i10 == 8197) {
                return 4100;
            }
            if (i10 == 4099) {
                return 4099;
            }
            if (i10 != 4100) {
                return 0;
            }
        }
        return i11;
    }

    private void q() {
        this.f16713b = false;
        this.f16707N.clear();
        this.f16706M.clear();
    }

    private J q0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        return this.f16709P.j(componentCallbacksC1573o);
    }

    private void r() {
        AbstractC1582y abstractC1582y = this.f16733v;
        if (abstractC1582y instanceof androidx.lifecycle.X ? this.f16714c.p().n() : abstractC1582y.f() instanceof Activity ? !((Activity) this.f16733v.f()).isChangingConfigurations() : true) {
            Iterator it = this.f16721j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C1561c) it.next()).f16906a.iterator();
                while (it2.hasNext()) {
                    this.f16714c.p().g((String) it2.next());
                }
            }
        }
    }

    private Set s() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f16714c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((M) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(Z.s(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    private Set t(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C1559a) arrayList.get(i10)).f16805c.iterator();
            while (it.hasNext()) {
                ComponentCallbacksC1573o componentCallbacksC1573o = ((P.a) it.next()).f16823b;
                if (componentCallbacksC1573o != null && (viewGroup = componentCallbacksC1573o.mContainer) != null) {
                    hashSet.add(Z.r(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private ViewGroup t0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        ViewGroup viewGroup = componentCallbacksC1573o.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC1573o.mContainerId > 0 && this.f16734w.d()) {
            View c10 = this.f16734w.c(componentCallbacksC1573o.mContainerId);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private void w1(ComponentCallbacksC1573o componentCallbacksC1573o) {
        ViewGroup t02 = t0(componentCallbacksC1573o);
        if (t02 == null || componentCallbacksC1573o.getEnterAnim() + componentCallbacksC1573o.getExitAnim() + componentCallbacksC1573o.getPopEnterAnim() + componentCallbacksC1573o.getPopExitAnim() <= 0) {
            return;
        }
        if (t02.getTag(T0.b.f9131c) == null) {
            t02.setTag(T0.b.f9131c, componentCallbacksC1573o);
        }
        ((ComponentCallbacksC1573o) t02.getTag(T0.b.f9131c)).setPopDirection(componentCallbacksC1573o.getPopDirection());
    }

    private void y1() {
        Iterator it = this.f16714c.k().iterator();
        while (it.hasNext()) {
            c1((M) it.next());
        }
    }

    private void z1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new W("FragmentManager"));
        AbstractC1582y abstractC1582y = this.f16733v;
        if (abstractC1582y != null) {
            try {
                abstractC1582y.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            V("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    void A() {
        this.f16702I = false;
        this.f16703J = false;
        this.f16709P.p(false);
        R(1);
    }

    public ComponentCallbacksC1573o A0() {
        return this.f16736y;
    }

    boolean B(Menu menu, MenuInflater menuInflater) {
        if (this.f16732u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null && N0(componentCallbacksC1573o) && componentCallbacksC1573o.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(componentCallbacksC1573o);
                z10 = true;
            }
        }
        if (this.f16716e != null) {
            for (int i10 = 0; i10 < this.f16716e.size(); i10++) {
                ComponentCallbacksC1573o componentCallbacksC1573o2 = (ComponentCallbacksC1573o) this.f16716e.get(i10);
                if (arrayList == null || !arrayList.contains(componentCallbacksC1573o2)) {
                    componentCallbacksC1573o2.onDestroyOptionsMenu();
                }
            }
        }
        this.f16716e = arrayList;
        return z10;
    }

    b0 B0() {
        b0 b0Var = this.f16695B;
        if (b0Var != null) {
            return b0Var;
        }
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16735x;
        return componentCallbacksC1573o != null ? componentCallbacksC1573o.mFragmentManager.B0() : this.f16696C;
    }

    void C() {
        this.f16704K = true;
        Z(true);
        W();
        r();
        R(-1);
        Object obj = this.f16733v;
        if (obj instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj).removeOnTrimMemoryListener(this.f16728q);
        }
        Object obj2 = this.f16733v;
        if (obj2 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj2).removeOnConfigurationChangedListener(this.f16727p);
        }
        Object obj3 = this.f16733v;
        if (obj3 instanceof androidx.core.app.w) {
            ((androidx.core.app.w) obj3).removeOnMultiWindowModeChangedListener(this.f16729r);
        }
        Object obj4 = this.f16733v;
        if (obj4 instanceof androidx.core.app.x) {
            ((androidx.core.app.x) obj4).removeOnPictureInPictureModeChangedListener(this.f16730s);
        }
        Object obj5 = this.f16733v;
        if ((obj5 instanceof InterfaceC1526w) && this.f16735x == null) {
            ((InterfaceC1526w) obj5).removeMenuProvider(this.f16731t);
        }
        this.f16733v = null;
        this.f16734w = null;
        this.f16735x = null;
        if (this.f16718g != null) {
            this.f16719h.d();
            this.f16718g = null;
        }
        AbstractC3061c abstractC3061c = this.f16697D;
        if (abstractC3061c != null) {
            abstractC3061c.c();
            this.f16698E.c();
            this.f16699F.c();
        }
    }

    public c.C0196c C0() {
        return this.f16710Q;
    }

    void D() {
        R(1);
    }

    void E(boolean z10) {
        if (z10 && (this.f16733v instanceof androidx.core.content.d)) {
            z1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.performLowMemory();
                if (z10) {
                    componentCallbacksC1573o.mChildFragmentManager.E(true);
                }
            }
        }
    }

    androidx.lifecycle.W E0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        return this.f16709P.m(componentCallbacksC1573o);
    }

    void F(boolean z10, boolean z11) {
        if (z11 && (this.f16733v instanceof androidx.core.app.w)) {
            z1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.performMultiWindowModeChanged(z10);
                if (z11) {
                    componentCallbacksC1573o.mChildFragmentManager.F(z10, true);
                }
            }
        }
    }

    void F0() {
        Z(true);
        if (this.f16719h.c()) {
            e1();
        } else {
            this.f16718g.e();
        }
    }

    void G(ComponentCallbacksC1573o componentCallbacksC1573o) {
        Iterator it = this.f16726o.iterator();
        while (it.hasNext()) {
            ((K) it.next()).a(this, componentCallbacksC1573o);
        }
    }

    void G0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC1573o);
        }
        if (componentCallbacksC1573o.mHidden) {
            return;
        }
        componentCallbacksC1573o.mHidden = true;
        componentCallbacksC1573o.mHiddenChanged = true ^ componentCallbacksC1573o.mHiddenChanged;
        w1(componentCallbacksC1573o);
    }

    void H() {
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.l()) {
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.onHiddenChanged(componentCallbacksC1573o.isHidden());
                componentCallbacksC1573o.mChildFragmentManager.H();
            }
        }
    }

    void H0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (componentCallbacksC1573o.mAdded && K0(componentCallbacksC1573o)) {
            this.f16701H = true;
        }
    }

    boolean I(MenuItem menuItem) {
        if (this.f16732u < 1) {
            return false;
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null && componentCallbacksC1573o.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean I0() {
        return this.f16704K;
    }

    void J(Menu menu) {
        if (this.f16732u < 1) {
            return;
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.performOptionsMenuClosed(menu);
            }
        }
    }

    void L() {
        R(5);
    }

    void M(boolean z10, boolean z11) {
        if (z11 && (this.f16733v instanceof androidx.core.app.x)) {
            z1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.performPictureInPictureModeChanged(z10);
                if (z11) {
                    componentCallbacksC1573o.mChildFragmentManager.M(z10, true);
                }
            }
        }
    }

    boolean M0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (componentCallbacksC1573o == null) {
            return false;
        }
        return componentCallbacksC1573o.isHidden();
    }

    boolean N(Menu menu) {
        boolean z10 = false;
        if (this.f16732u < 1) {
            return false;
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null && N0(componentCallbacksC1573o) && componentCallbacksC1573o.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    boolean N0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (componentCallbacksC1573o == null) {
            return true;
        }
        return componentCallbacksC1573o.isMenuVisible();
    }

    void O() {
        A1();
        K(this.f16736y);
    }

    boolean O0(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (componentCallbacksC1573o == null) {
            return true;
        }
        G g10 = componentCallbacksC1573o.mFragmentManager;
        return componentCallbacksC1573o.equals(g10.A0()) && O0(g10.f16735x);
    }

    void P() {
        this.f16702I = false;
        this.f16703J = false;
        this.f16709P.p(false);
        R(7);
    }

    boolean P0(int i10) {
        return this.f16732u >= i10;
    }

    void Q() {
        this.f16702I = false;
        this.f16703J = false;
        this.f16709P.p(false);
        R(5);
    }

    public boolean Q0() {
        return this.f16702I || this.f16703J;
    }

    void S() {
        this.f16703J = true;
        this.f16709P.p(true);
        R(4);
    }

    void T() {
        R(2);
    }

    public void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f16714c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f16716e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) this.f16716e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1573o.toString());
            }
        }
        ArrayList arrayList2 = this.f16715d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C1559a c1559a = (C1559a) this.f16715d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c1559a.toString());
                c1559a.w(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f16720i.get());
        synchronized (this.f16712a) {
            try {
                int size3 = this.f16712a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        m mVar = (m) this.f16712a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f16733v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f16734w);
        if (this.f16735x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f16735x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f16732u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f16702I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f16703J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f16704K);
        if (this.f16701H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f16701H);
        }
    }

    void W0(ComponentCallbacksC1573o componentCallbacksC1573o, String[] strArr, int i10) {
        if (this.f16699F == null) {
            this.f16733v.k(componentCallbacksC1573o, strArr, i10);
            return;
        }
        this.f16700G.addLast(new l(componentCallbacksC1573o.mWho, i10));
        this.f16699F.a(strArr);
    }

    void X(m mVar, boolean z10) {
        if (!z10) {
            if (this.f16733v == null) {
                if (!this.f16704K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.f16712a) {
            try {
                if (this.f16733v == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f16712a.add(mVar);
                    s1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void X0(ComponentCallbacksC1573o componentCallbacksC1573o, Intent intent, int i10, Bundle bundle) {
        if (this.f16697D == null) {
            this.f16733v.m(componentCallbacksC1573o, intent, i10, bundle);
            return;
        }
        this.f16700G.addLast(new l(componentCallbacksC1573o.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f16697D.a(intent);
    }

    void Y0(ComponentCallbacksC1573o componentCallbacksC1573o, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        if (this.f16698E == null) {
            this.f16733v.n(componentCallbacksC1573o, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (J0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + componentCallbacksC1573o);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        C3064f a10 = new C3064f.a(intentSender).b(intent2).c(i12, i11).a();
        this.f16700G.addLast(new l(componentCallbacksC1573o.mWho, i10));
        if (J0(2)) {
            Log.v("FragmentManager", "Fragment " + componentCallbacksC1573o + "is launching an IntentSender for result ");
        }
        this.f16698E.a(a10);
    }

    boolean Z(boolean z10) {
        Y(z10);
        boolean z11 = false;
        while (o0(this.f16706M, this.f16707N)) {
            z11 = true;
            this.f16713b = true;
            try {
                l1(this.f16706M, this.f16707N);
            } finally {
                q();
            }
        }
        A1();
        U();
        this.f16714c.b();
        return z11;
    }

    void Z0(int i10, boolean z10) {
        AbstractC1582y abstractC1582y;
        if (this.f16733v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f16732u) {
            this.f16732u = i10;
            this.f16714c.t();
            y1();
            if (this.f16701H && (abstractC1582y = this.f16733v) != null && this.f16732u == 7) {
                abstractC1582y.o();
                this.f16701H = false;
            }
        }
    }

    void a0(m mVar, boolean z10) {
        if (z10 && (this.f16733v == null || this.f16704K)) {
            return;
        }
        Y(z10);
        if (mVar.a(this.f16706M, this.f16707N)) {
            this.f16713b = true;
            try {
                l1(this.f16706M, this.f16707N);
            } finally {
                q();
            }
        }
        A1();
        U();
        this.f16714c.b();
    }

    void a1() {
        if (this.f16733v == null) {
            return;
        }
        this.f16702I = false;
        this.f16703J = false;
        this.f16709P.p(false);
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.noteStateNotSaved();
            }
        }
    }

    void b1(FragmentContainerView fragmentContainerView) {
        View view;
        for (M m10 : this.f16714c.k()) {
            ComponentCallbacksC1573o k10 = m10.k();
            if (k10.mContainerId == fragmentContainerView.getId() && (view = k10.mView) != null && view.getParent() == null) {
                k10.mContainer = fragmentContainerView;
                m10.b();
            }
        }
    }

    void c1(M m10) {
        ComponentCallbacksC1573o k10 = m10.k();
        if (k10.mDeferStart) {
            if (this.f16713b) {
                this.f16705L = true;
            } else {
                k10.mDeferStart = false;
                m10.m();
            }
        }
    }

    public boolean d0() {
        boolean Z10 = Z(true);
        m0();
        return Z10;
    }

    void d1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            X(new n(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    ComponentCallbacksC1573o e0(String str) {
        return this.f16714c.f(str);
    }

    public boolean e1() {
        return g1(null, -1, 0);
    }

    public boolean f1(int i10, int i11) {
        if (i10 >= 0) {
            return g1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    void g(C1559a c1559a) {
        if (this.f16715d == null) {
            this.f16715d = new ArrayList();
        }
        this.f16715d.add(c1559a);
    }

    M h(ComponentCallbacksC1573o componentCallbacksC1573o) {
        String str = componentCallbacksC1573o.mPreviousWho;
        if (str != null) {
            U0.c.f(componentCallbacksC1573o, str);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + componentCallbacksC1573o);
        }
        M u10 = u(componentCallbacksC1573o);
        componentCallbacksC1573o.mFragmentManager = this;
        this.f16714c.r(u10);
        if (!componentCallbacksC1573o.mDetached) {
            this.f16714c.a(componentCallbacksC1573o);
            componentCallbacksC1573o.mRemoving = false;
            if (componentCallbacksC1573o.mView == null) {
                componentCallbacksC1573o.mHiddenChanged = false;
            }
            if (K0(componentCallbacksC1573o)) {
                this.f16701H = true;
            }
        }
        return u10;
    }

    public ComponentCallbacksC1573o h0(int i10) {
        return this.f16714c.g(i10);
    }

    boolean h1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int f02 = f0(str, i10, (i11 & 1) != 0);
        if (f02 < 0) {
            return false;
        }
        for (int size = this.f16715d.size() - 1; size >= f02; size--) {
            arrayList.add((C1559a) this.f16715d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void i(K k10) {
        this.f16726o.add(k10);
    }

    public ComponentCallbacksC1573o i0(String str) {
        return this.f16714c.h(str);
    }

    public void i1(Bundle bundle, String str, ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (componentCallbacksC1573o.mFragmentManager != this) {
            z1(new IllegalStateException("Fragment " + componentCallbacksC1573o + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, componentCallbacksC1573o.mWho);
    }

    void j(ComponentCallbacksC1573o componentCallbacksC1573o) {
        this.f16709P.e(componentCallbacksC1573o);
    }

    ComponentCallbacksC1573o j0(String str) {
        return this.f16714c.i(str);
    }

    public void j1(k kVar, boolean z10) {
        this.f16725n.o(kVar, z10);
    }

    int k() {
        return this.f16720i.getAndIncrement();
    }

    void k1(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (J0(2)) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC1573o + " nesting=" + componentCallbacksC1573o.mBackStackNesting);
        }
        boolean isInBackStack = componentCallbacksC1573o.isInBackStack();
        if (componentCallbacksC1573o.mDetached && isInBackStack) {
            return;
        }
        this.f16714c.u(componentCallbacksC1573o);
        if (K0(componentCallbacksC1573o)) {
            this.f16701H = true;
        }
        componentCallbacksC1573o.mRemoving = true;
        w1(componentCallbacksC1573o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void l(AbstractC1582y abstractC1582y, AbstractC1579v abstractC1579v, ComponentCallbacksC1573o componentCallbacksC1573o) {
        String str;
        if (this.f16733v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f16733v = abstractC1582y;
        this.f16734w = abstractC1579v;
        this.f16735x = componentCallbacksC1573o;
        if (componentCallbacksC1573o != null) {
            i(new g(componentCallbacksC1573o));
        } else if (abstractC1582y instanceof K) {
            i((K) abstractC1582y);
        }
        if (this.f16735x != null) {
            A1();
        }
        if (abstractC1582y instanceof androidx.activity.q) {
            androidx.activity.q qVar = (androidx.activity.q) abstractC1582y;
            androidx.activity.o onBackPressedDispatcher = qVar.getOnBackPressedDispatcher();
            this.f16718g = onBackPressedDispatcher;
            InterfaceC1599p interfaceC1599p = qVar;
            if (componentCallbacksC1573o != null) {
                interfaceC1599p = componentCallbacksC1573o;
            }
            onBackPressedDispatcher.b(interfaceC1599p, this.f16719h);
        }
        if (componentCallbacksC1573o != null) {
            this.f16709P = componentCallbacksC1573o.mFragmentManager.q0(componentCallbacksC1573o);
        } else if (abstractC1582y instanceof androidx.lifecycle.X) {
            this.f16709P = J.k(((androidx.lifecycle.X) abstractC1582y).getViewModelStore());
        } else {
            this.f16709P = new J(false);
        }
        this.f16709P.p(Q0());
        this.f16714c.A(this.f16709P);
        Object obj = this.f16733v;
        if ((obj instanceof k1.f) && componentCallbacksC1573o == null) {
            k1.d savedStateRegistry = ((k1.f) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new d.c() { // from class: androidx.fragment.app.F
                @Override // k1.d.c
                public final Bundle a() {
                    Bundle R02;
                    R02 = G.this.R0();
                    return R02;
                }
            });
            Bundle b10 = savedStateRegistry.b("android:support:fragments");
            if (b10 != null) {
                o1(b10);
            }
        }
        Object obj2 = this.f16733v;
        if (obj2 instanceof InterfaceC3063e) {
            AbstractC3062d activityResultRegistry = ((InterfaceC3063e) obj2).getActivityResultRegistry();
            if (componentCallbacksC1573o != null) {
                str = componentCallbacksC1573o.mWho + ":";
            } else {
                str = BuildConfig.FLAVOR;
            }
            String str2 = "FragmentManager:" + str;
            this.f16697D = activityResultRegistry.j(str2 + "StartActivityForResult", new f.j(), new h());
            this.f16698E = activityResultRegistry.j(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f16699F = activityResultRegistry.j(str2 + "RequestPermissions", new C3134i(), new a());
        }
        Object obj3 = this.f16733v;
        if (obj3 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj3).addOnConfigurationChangedListener(this.f16727p);
        }
        Object obj4 = this.f16733v;
        if (obj4 instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj4).addOnTrimMemoryListener(this.f16728q);
        }
        Object obj5 = this.f16733v;
        if (obj5 instanceof androidx.core.app.w) {
            ((androidx.core.app.w) obj5).addOnMultiWindowModeChangedListener(this.f16729r);
        }
        Object obj6 = this.f16733v;
        if (obj6 instanceof androidx.core.app.x) {
            ((androidx.core.app.x) obj6).addOnPictureInPictureModeChangedListener(this.f16730s);
        }
        Object obj7 = this.f16733v;
        if ((obj7 instanceof InterfaceC1526w) && componentCallbacksC1573o == null) {
            ((InterfaceC1526w) obj7).addMenuProvider(this.f16731t);
        }
    }

    void m(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (J0(2)) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC1573o);
        }
        if (componentCallbacksC1573o.mDetached) {
            componentCallbacksC1573o.mDetached = false;
            if (componentCallbacksC1573o.mAdded) {
                return;
            }
            this.f16714c.a(componentCallbacksC1573o);
            if (J0(2)) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC1573o);
            }
            if (K0(componentCallbacksC1573o)) {
                this.f16701H = true;
            }
        }
    }

    void m1(ComponentCallbacksC1573o componentCallbacksC1573o) {
        this.f16709P.o(componentCallbacksC1573o);
    }

    public P n() {
        return new C1559a(this);
    }

    boolean o() {
        boolean z10 = false;
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.l()) {
            if (componentCallbacksC1573o != null) {
                z10 = K0(componentCallbacksC1573o);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    void o1(Parcelable parcelable) {
        M m10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f16733v.f().getClassLoader());
                this.f16722k.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f16733v.f().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.f16714c.x(hashMap);
        I i10 = (I) bundle3.getParcelable(Keys.STATE);
        if (i10 == null) {
            return;
        }
        this.f16714c.v();
        Iterator it = i10.f16754a.iterator();
        while (it.hasNext()) {
            Bundle B10 = this.f16714c.B((String) it.next(), null);
            if (B10 != null) {
                ComponentCallbacksC1573o i11 = this.f16709P.i(((L) B10.getParcelable(Keys.STATE)).f16771b);
                if (i11 != null) {
                    if (J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + i11);
                    }
                    m10 = new M(this.f16725n, this.f16714c, i11, B10);
                } else {
                    m10 = new M(this.f16725n, this.f16714c, this.f16733v.f().getClassLoader(), u0(), B10);
                }
                ComponentCallbacksC1573o k10 = m10.k();
                k10.mSavedFragmentState = B10;
                k10.mFragmentManager = this;
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.mWho + "): " + k10);
                }
                m10.o(this.f16733v.f().getClassLoader());
                this.f16714c.r(m10);
                m10.t(this.f16732u);
            }
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16709P.l()) {
            if (!this.f16714c.c(componentCallbacksC1573o.mWho)) {
                if (J0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + componentCallbacksC1573o + " that was not found in the set of active Fragments " + i10.f16754a);
                }
                this.f16709P.o(componentCallbacksC1573o);
                componentCallbacksC1573o.mFragmentManager = this;
                M m11 = new M(this.f16725n, this.f16714c, componentCallbacksC1573o);
                m11.t(1);
                m11.m();
                componentCallbacksC1573o.mRemoving = true;
                m11.m();
            }
        }
        this.f16714c.w(i10.f16755b);
        if (i10.f16756c != null) {
            this.f16715d = new ArrayList(i10.f16756c.length);
            int i12 = 0;
            while (true) {
                C1560b[] c1560bArr = i10.f16756c;
                if (i12 >= c1560bArr.length) {
                    break;
                }
                C1559a b10 = c1560bArr[i12].b(this);
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i12 + " (index " + b10.f16889v + "): " + b10);
                    PrintWriter printWriter = new PrintWriter(new W("FragmentManager"));
                    b10.x("  ", printWriter, false);
                    printWriter.close();
                }
                this.f16715d.add(b10);
                i12++;
            }
        } else {
            this.f16715d = null;
        }
        this.f16720i.set(i10.f16757d);
        String str3 = i10.f16758e;
        if (str3 != null) {
            ComponentCallbacksC1573o e02 = e0(str3);
            this.f16736y = e02;
            K(e02);
        }
        ArrayList arrayList = i10.f16759f;
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                this.f16721j.put((String) arrayList.get(i13), (C1561c) i10.f16760g.get(i13));
            }
        }
        this.f16700G = new ArrayDeque(i10.f16761h);
    }

    public int p0() {
        ArrayList arrayList = this.f16715d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public Bundle R0() {
        C1560b[] c1560bArr;
        int size;
        Bundle bundle = new Bundle();
        m0();
        W();
        Z(true);
        this.f16702I = true;
        this.f16709P.p(true);
        ArrayList y10 = this.f16714c.y();
        HashMap m10 = this.f16714c.m();
        if (!m10.isEmpty()) {
            ArrayList z10 = this.f16714c.z();
            ArrayList arrayList = this.f16715d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c1560bArr = null;
            } else {
                c1560bArr = new C1560b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c1560bArr[i10] = new C1560b((C1559a) this.f16715d.get(i10));
                    if (J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f16715d.get(i10));
                    }
                }
            }
            I i11 = new I();
            i11.f16754a = y10;
            i11.f16755b = z10;
            i11.f16756c = c1560bArr;
            i11.f16757d = this.f16720i.get();
            ComponentCallbacksC1573o componentCallbacksC1573o = this.f16736y;
            if (componentCallbacksC1573o != null) {
                i11.f16758e = componentCallbacksC1573o.mWho;
            }
            i11.f16759f.addAll(this.f16721j.keySet());
            i11.f16760g.addAll(this.f16721j.values());
            i11.f16761h = new ArrayList(this.f16700G);
            bundle.putParcelable(Keys.STATE, i11);
            for (String str : this.f16722k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f16722k.get(str));
            }
            for (String str2 : m10.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) m10.get(str2));
            }
        } else if (J0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    AbstractC1579v r0() {
        return this.f16734w;
    }

    public ComponentCallbacksC1573o.C0289o r1(ComponentCallbacksC1573o componentCallbacksC1573o) {
        M n10 = this.f16714c.n(componentCallbacksC1573o.mWho);
        if (n10 == null || !n10.k().equals(componentCallbacksC1573o)) {
            z1(new IllegalStateException("Fragment " + componentCallbacksC1573o + " is not currently in the FragmentManager"));
        }
        return n10.q();
    }

    public ComponentCallbacksC1573o s0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        ComponentCallbacksC1573o e02 = e0(string);
        if (e02 == null) {
            z1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return e02;
    }

    void s1() {
        synchronized (this.f16712a) {
            try {
                if (this.f16712a.size() == 1) {
                    this.f16733v.g().removeCallbacks(this.f16711R);
                    this.f16733v.g().post(this.f16711R);
                    A1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void t1(ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
        ViewGroup t02 = t0(componentCallbacksC1573o);
        if (t02 == null || !(t02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) t02).setDrawDisappearingViewsLast(!z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16735x;
        if (componentCallbacksC1573o != null) {
            sb2.append(componentCallbacksC1573o.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f16735x)));
            sb2.append("}");
        } else {
            AbstractC1582y abstractC1582y = this.f16733v;
            if (abstractC1582y != null) {
                sb2.append(abstractC1582y.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f16733v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    M u(ComponentCallbacksC1573o componentCallbacksC1573o) {
        M n10 = this.f16714c.n(componentCallbacksC1573o.mWho);
        if (n10 != null) {
            return n10;
        }
        M m10 = new M(this.f16725n, this.f16714c, componentCallbacksC1573o);
        m10.o(this.f16733v.f().getClassLoader());
        m10.t(this.f16732u);
        return m10;
    }

    public AbstractC1581x u0() {
        AbstractC1581x abstractC1581x = this.f16737z;
        if (abstractC1581x != null) {
            return abstractC1581x;
        }
        ComponentCallbacksC1573o componentCallbacksC1573o = this.f16735x;
        return componentCallbacksC1573o != null ? componentCallbacksC1573o.mFragmentManager.u0() : this.f16694A;
    }

    void u1(ComponentCallbacksC1573o componentCallbacksC1573o, AbstractC1592i.b bVar) {
        if (componentCallbacksC1573o.equals(e0(componentCallbacksC1573o.mWho)) && (componentCallbacksC1573o.mHost == null || componentCallbacksC1573o.mFragmentManager == this)) {
            componentCallbacksC1573o.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC1573o + " is not an active fragment of FragmentManager " + this);
    }

    void v(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC1573o);
        }
        if (componentCallbacksC1573o.mDetached) {
            return;
        }
        componentCallbacksC1573o.mDetached = true;
        if (componentCallbacksC1573o.mAdded) {
            if (J0(2)) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC1573o);
            }
            this.f16714c.u(componentCallbacksC1573o);
            if (K0(componentCallbacksC1573o)) {
                this.f16701H = true;
            }
            w1(componentCallbacksC1573o);
        }
    }

    public List v0() {
        return this.f16714c.o();
    }

    void v1(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (componentCallbacksC1573o == null || (componentCallbacksC1573o.equals(e0(componentCallbacksC1573o.mWho)) && (componentCallbacksC1573o.mHost == null || componentCallbacksC1573o.mFragmentManager == this))) {
            ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16736y;
            this.f16736y = componentCallbacksC1573o;
            K(componentCallbacksC1573o2);
            K(this.f16736y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC1573o + " is not an active fragment of FragmentManager " + this);
    }

    void w() {
        this.f16702I = false;
        this.f16703J = false;
        this.f16709P.p(false);
        R(4);
    }

    public AbstractC1582y w0() {
        return this.f16733v;
    }

    void x() {
        this.f16702I = false;
        this.f16703J = false;
        this.f16709P.p(false);
        R(0);
    }

    LayoutInflater.Factory2 x0() {
        return this.f16717f;
    }

    void x1(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + componentCallbacksC1573o);
        }
        if (componentCallbacksC1573o.mHidden) {
            componentCallbacksC1573o.mHidden = false;
            componentCallbacksC1573o.mHiddenChanged = !componentCallbacksC1573o.mHiddenChanged;
        }
    }

    void y(Configuration configuration, boolean z10) {
        if (z10 && (this.f16733v instanceof androidx.core.content.c)) {
            z1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.performConfigurationChanged(configuration);
                if (z10) {
                    componentCallbacksC1573o.mChildFragmentManager.y(configuration, true);
                }
            }
        }
    }

    A y0() {
        return this.f16725n;
    }

    boolean z(MenuItem menuItem) {
        if (this.f16732u < 1) {
            return false;
        }
        for (ComponentCallbacksC1573o componentCallbacksC1573o : this.f16714c.o()) {
            if (componentCallbacksC1573o != null && componentCallbacksC1573o.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    ComponentCallbacksC1573o z0() {
        return this.f16735x;
    }

    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f16748a;

        /* renamed from: b, reason: collision with root package name */
        int f16749b;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(String str, int i10) {
            this.f16748a = str;
            this.f16749b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f16748a);
            parcel.writeInt(this.f16749b);
        }

        l(Parcel parcel) {
            this.f16748a = parcel.readString();
            this.f16749b = parcel.readInt();
        }
    }
}
