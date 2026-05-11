package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class J extends androidx.lifecycle.S {

    /* renamed from: i, reason: collision with root package name */
    private static final V.c f16762i = new a();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16766e;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f16763b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f16764c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f16765d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private boolean f16767f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16768g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16769h = false;

    class a implements V.c {
        a() {
        }

        @Override // androidx.lifecycle.V.c
        public androidx.lifecycle.S a(Class cls) {
            return new J(true);
        }
    }

    J(boolean z10) {
        this.f16766e = z10;
    }

    private void h(String str) {
        J j10 = (J) this.f16764c.get(str);
        if (j10 != null) {
            j10.d();
            this.f16764c.remove(str);
        }
        androidx.lifecycle.W w10 = (androidx.lifecycle.W) this.f16765d.get(str);
        if (w10 != null) {
            w10.a();
            this.f16765d.remove(str);
        }
    }

    static J k(androidx.lifecycle.W w10) {
        return (J) new androidx.lifecycle.V(w10, f16762i).a(J.class);
    }

    @Override // androidx.lifecycle.S
    protected void d() {
        if (G.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f16767f = true;
    }

    void e(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (this.f16769h) {
            if (G.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f16763b.containsKey(componentCallbacksC1573o.mWho)) {
                return;
            }
            this.f16763b.put(componentCallbacksC1573o.mWho, componentCallbacksC1573o);
            if (G.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + componentCallbacksC1573o);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j10 = (J) obj;
        return this.f16763b.equals(j10.f16763b) && this.f16764c.equals(j10.f16764c) && this.f16765d.equals(j10.f16765d);
    }

    void f(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (G.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC1573o);
        }
        h(componentCallbacksC1573o.mWho);
    }

    void g(String str) {
        if (G.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str);
    }

    public int hashCode() {
        return (((this.f16763b.hashCode() * 31) + this.f16764c.hashCode()) * 31) + this.f16765d.hashCode();
    }

    ComponentCallbacksC1573o i(String str) {
        return (ComponentCallbacksC1573o) this.f16763b.get(str);
    }

    J j(ComponentCallbacksC1573o componentCallbacksC1573o) {
        J j10 = (J) this.f16764c.get(componentCallbacksC1573o.mWho);
        if (j10 != null) {
            return j10;
        }
        J j11 = new J(this.f16766e);
        this.f16764c.put(componentCallbacksC1573o.mWho, j11);
        return j11;
    }

    Collection l() {
        return new ArrayList(this.f16763b.values());
    }

    androidx.lifecycle.W m(ComponentCallbacksC1573o componentCallbacksC1573o) {
        androidx.lifecycle.W w10 = (androidx.lifecycle.W) this.f16765d.get(componentCallbacksC1573o.mWho);
        if (w10 != null) {
            return w10;
        }
        androidx.lifecycle.W w11 = new androidx.lifecycle.W();
        this.f16765d.put(componentCallbacksC1573o.mWho, w11);
        return w11;
    }

    boolean n() {
        return this.f16767f;
    }

    void o(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (this.f16769h) {
            if (G.J0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f16763b.remove(componentCallbacksC1573o.mWho) == null || !G.J0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC1573o);
        }
    }

    void p(boolean z10) {
        this.f16769h = z10;
    }

    boolean q(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (this.f16763b.containsKey(componentCallbacksC1573o.mWho)) {
            return this.f16766e ? this.f16767f : !this.f16768g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f16763b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f16764c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f16765d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
