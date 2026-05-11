package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.G;
import androidx.fragment.app.P;
import androidx.lifecycle.AbstractC1592i;
import com.appsflyer.attribution.RequestError;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1559a extends P implements G.m {

    /* renamed from: t, reason: collision with root package name */
    final G f16887t;

    /* renamed from: u, reason: collision with root package name */
    boolean f16888u;

    /* renamed from: v, reason: collision with root package name */
    int f16889v;

    /* renamed from: w, reason: collision with root package name */
    boolean f16890w;

    C1559a(G g10) {
        super(g10.u0(), g10.w0() != null ? g10.w0().f().getClassLoader() : null);
        this.f16889v = -1;
        this.f16890w = false;
        this.f16887t = g10;
    }

    ComponentCallbacksC1573o A(ArrayList arrayList, ComponentCallbacksC1573o componentCallbacksC1573o) {
        ComponentCallbacksC1573o componentCallbacksC1573o2 = componentCallbacksC1573o;
        int i10 = 0;
        while (i10 < this.f16805c.size()) {
            P.a aVar = (P.a) this.f16805c.get(i10);
            int i11 = aVar.f16822a;
            if (i11 != 1) {
                if (i11 == 2) {
                    ComponentCallbacksC1573o componentCallbacksC1573o3 = aVar.f16823b;
                    int i12 = componentCallbacksC1573o3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ComponentCallbacksC1573o componentCallbacksC1573o4 = (ComponentCallbacksC1573o) arrayList.get(size);
                        if (componentCallbacksC1573o4.mContainerId == i12) {
                            if (componentCallbacksC1573o4 == componentCallbacksC1573o3) {
                                z10 = true;
                            } else {
                                if (componentCallbacksC1573o4 == componentCallbacksC1573o2) {
                                    this.f16805c.add(i10, new P.a(9, componentCallbacksC1573o4, true));
                                    i10++;
                                    componentCallbacksC1573o2 = null;
                                }
                                P.a aVar2 = new P.a(3, componentCallbacksC1573o4, true);
                                aVar2.f16825d = aVar.f16825d;
                                aVar2.f16827f = aVar.f16827f;
                                aVar2.f16826e = aVar.f16826e;
                                aVar2.f16828g = aVar.f16828g;
                                this.f16805c.add(i10, aVar2);
                                arrayList.remove(componentCallbacksC1573o4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f16805c.remove(i10);
                        i10--;
                    } else {
                        aVar.f16822a = 1;
                        aVar.f16824c = true;
                        arrayList.add(componentCallbacksC1573o3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f16823b);
                    ComponentCallbacksC1573o componentCallbacksC1573o5 = aVar.f16823b;
                    if (componentCallbacksC1573o5 == componentCallbacksC1573o2) {
                        this.f16805c.add(i10, new P.a(9, componentCallbacksC1573o5));
                        i10++;
                        componentCallbacksC1573o2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f16805c.add(i10, new P.a(9, componentCallbacksC1573o2, true));
                        aVar.f16824c = true;
                        i10++;
                        componentCallbacksC1573o2 = aVar.f16823b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f16823b);
            i10++;
        }
        return componentCallbacksC1573o2;
    }

    public String B() {
        return this.f16813k;
    }

    public void C() {
        if (this.f16821s != null) {
            for (int i10 = 0; i10 < this.f16821s.size(); i10++) {
                ((Runnable) this.f16821s.get(i10)).run();
            }
            this.f16821s = null;
        }
    }

    ComponentCallbacksC1573o D(ArrayList arrayList, ComponentCallbacksC1573o componentCallbacksC1573o) {
        for (int size = this.f16805c.size() - 1; size >= 0; size--) {
            P.a aVar = (P.a) this.f16805c.get(size);
            int i10 = aVar.f16822a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            componentCallbacksC1573o = null;
                            break;
                        case 9:
                            componentCallbacksC1573o = aVar.f16823b;
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            aVar.f16830i = aVar.f16829h;
                            break;
                    }
                }
                arrayList.add(aVar.f16823b);
            }
            arrayList.remove(aVar.f16823b);
        }
        return componentCallbacksC1573o;
    }

    @Override // androidx.fragment.app.G.m
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (G.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f16811i) {
            return true;
        }
        this.f16887t.g(this);
        return true;
    }

    @Override // androidx.fragment.app.P
    public int g() {
        return v(false);
    }

    @Override // androidx.fragment.app.P
    public int h() {
        return v(true);
    }

    @Override // androidx.fragment.app.P
    public void i() {
        k();
        this.f16887t.a0(this, false);
    }

    @Override // androidx.fragment.app.P
    public void j() {
        k();
        this.f16887t.a0(this, true);
    }

    @Override // androidx.fragment.app.P
    void l(int i10, ComponentCallbacksC1573o componentCallbacksC1573o, String str, int i11) {
        super.l(i10, componentCallbacksC1573o, str, i11);
        componentCallbacksC1573o.mFragmentManager = this.f16887t;
    }

    @Override // androidx.fragment.app.P
    public P m(ComponentCallbacksC1573o componentCallbacksC1573o) {
        G g10 = componentCallbacksC1573o.mFragmentManager;
        if (g10 == null || g10 == this.f16887t) {
            return super.m(componentCallbacksC1573o);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC1573o.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.P
    public P s(ComponentCallbacksC1573o componentCallbacksC1573o, AbstractC1592i.b bVar) {
        if (componentCallbacksC1573o.mFragmentManager != this.f16887t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f16887t);
        }
        if (bVar == AbstractC1592i.b.INITIALIZED && componentCallbacksC1573o.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC1592i.b.DESTROYED) {
            return super.s(componentCallbacksC1573o, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f16889v >= 0) {
            sb2.append(" #");
            sb2.append(this.f16889v);
        }
        if (this.f16813k != null) {
            sb2.append(" ");
            sb2.append(this.f16813k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    void u(int i10) {
        if (this.f16811i) {
            if (G.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f16805c.size();
            for (int i11 = 0; i11 < size; i11++) {
                P.a aVar = (P.a) this.f16805c.get(i11);
                ComponentCallbacksC1573o componentCallbacksC1573o = aVar.f16823b;
                if (componentCallbacksC1573o != null) {
                    componentCallbacksC1573o.mBackStackNesting += i10;
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f16823b + " to " + aVar.f16823b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int v(boolean z10) {
        if (this.f16888u) {
            throw new IllegalStateException("commit already called");
        }
        if (G.J0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new W("FragmentManager"));
            w("  ", printWriter);
            printWriter.close();
        }
        this.f16888u = true;
        if (this.f16811i) {
            this.f16889v = this.f16887t.k();
        } else {
            this.f16889v = -1;
        }
        this.f16887t.X(this, z10);
        return this.f16889v;
    }

    public void w(String str, PrintWriter printWriter) {
        x(str, printWriter, true);
    }

    public void x(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f16813k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f16889v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f16888u);
            if (this.f16810h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f16810h));
            }
            if (this.f16806d != 0 || this.f16807e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16806d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16807e));
            }
            if (this.f16808f != 0 || this.f16809g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f16808f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f16809g));
            }
            if (this.f16814l != 0 || this.f16815m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16814l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f16815m);
            }
            if (this.f16816n != 0 || this.f16817o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f16816n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f16817o);
            }
        }
        if (this.f16805c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f16805c.size();
        for (int i10 = 0; i10 < size; i10++) {
            P.a aVar = (P.a) this.f16805c.get(i10);
            switch (aVar.f16822a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f16822a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f16823b);
            if (z10) {
                if (aVar.f16825d != 0 || aVar.f16826e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f16825d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f16826e));
                }
                if (aVar.f16827f != 0 || aVar.f16828g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f16827f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f16828g));
                }
            }
        }
    }

    void y() {
        int size = this.f16805c.size();
        for (int i10 = 0; i10 < size; i10++) {
            P.a aVar = (P.a) this.f16805c.get(i10);
            ComponentCallbacksC1573o componentCallbacksC1573o = aVar.f16823b;
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.mBeingSaved = this.f16890w;
                componentCallbacksC1573o.setPopDirection(false);
                componentCallbacksC1573o.setNextTransition(this.f16810h);
                componentCallbacksC1573o.setSharedElementNames(this.f16818p, this.f16819q);
            }
            switch (aVar.f16822a) {
                case 1:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.t1(componentCallbacksC1573o, false);
                    this.f16887t.h(componentCallbacksC1573o);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f16822a);
                case 3:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.k1(componentCallbacksC1573o);
                    break;
                case 4:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.G0(componentCallbacksC1573o);
                    break;
                case 5:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.t1(componentCallbacksC1573o, false);
                    this.f16887t.x1(componentCallbacksC1573o);
                    break;
                case 6:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.v(componentCallbacksC1573o);
                    break;
                case 7:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.t1(componentCallbacksC1573o, false);
                    this.f16887t.m(componentCallbacksC1573o);
                    break;
                case 8:
                    this.f16887t.v1(componentCallbacksC1573o);
                    break;
                case 9:
                    this.f16887t.v1(null);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    this.f16887t.u1(componentCallbacksC1573o, aVar.f16830i);
                    break;
            }
        }
    }

    void z() {
        for (int size = this.f16805c.size() - 1; size >= 0; size--) {
            P.a aVar = (P.a) this.f16805c.get(size);
            ComponentCallbacksC1573o componentCallbacksC1573o = aVar.f16823b;
            if (componentCallbacksC1573o != null) {
                componentCallbacksC1573o.mBeingSaved = this.f16890w;
                componentCallbacksC1573o.setPopDirection(true);
                componentCallbacksC1573o.setNextTransition(G.p1(this.f16810h));
                componentCallbacksC1573o.setSharedElementNames(this.f16819q, this.f16818p);
            }
            switch (aVar.f16822a) {
                case 1:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.t1(componentCallbacksC1573o, true);
                    this.f16887t.k1(componentCallbacksC1573o);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f16822a);
                case 3:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.h(componentCallbacksC1573o);
                    break;
                case 4:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.x1(componentCallbacksC1573o);
                    break;
                case 5:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.t1(componentCallbacksC1573o, true);
                    this.f16887t.G0(componentCallbacksC1573o);
                    break;
                case 6:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.m(componentCallbacksC1573o);
                    break;
                case 7:
                    componentCallbacksC1573o.setAnimations(aVar.f16825d, aVar.f16826e, aVar.f16827f, aVar.f16828g);
                    this.f16887t.t1(componentCallbacksC1573o, true);
                    this.f16887t.v(componentCallbacksC1573o);
                    break;
                case 8:
                    this.f16887t.v1(null);
                    break;
                case 9:
                    this.f16887t.v1(componentCallbacksC1573o);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    this.f16887t.u1(componentCallbacksC1573o, aVar.f16829h);
                    break;
            }
        }
    }
}
