package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class O {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f16799a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f16800b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f16801c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private J f16802d;

    O() {
    }

    void A(J j10) {
        this.f16802d = j10;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f16801c.put(str, bundle) : (Bundle) this.f16801c.remove(str);
    }

    void a(ComponentCallbacksC1573o componentCallbacksC1573o) {
        if (this.f16799a.contains(componentCallbacksC1573o)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC1573o);
        }
        synchronized (this.f16799a) {
            this.f16799a.add(componentCallbacksC1573o);
        }
        componentCallbacksC1573o.mAdded = true;
    }

    void b() {
        this.f16800b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f16800b.get(str) != null;
    }

    void d(int i10) {
        for (M m10 : this.f16800b.values()) {
            if (m10 != null) {
                m10.t(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f16800b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (M m10 : this.f16800b.values()) {
                printWriter.print(str);
                if (m10 != null) {
                    ComponentCallbacksC1573o k10 = m10.k();
                    printWriter.println(k10);
                    k10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f16799a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) this.f16799a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC1573o.toString());
            }
        }
    }

    ComponentCallbacksC1573o f(String str) {
        M m10 = (M) this.f16800b.get(str);
        if (m10 != null) {
            return m10.k();
        }
        return null;
    }

    ComponentCallbacksC1573o g(int i10) {
        for (int size = this.f16799a.size() - 1; size >= 0; size--) {
            ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) this.f16799a.get(size);
            if (componentCallbacksC1573o != null && componentCallbacksC1573o.mFragmentId == i10) {
                return componentCallbacksC1573o;
            }
        }
        for (M m10 : this.f16800b.values()) {
            if (m10 != null) {
                ComponentCallbacksC1573o k10 = m10.k();
                if (k10.mFragmentId == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    ComponentCallbacksC1573o h(String str) {
        if (str != null) {
            for (int size = this.f16799a.size() - 1; size >= 0; size--) {
                ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) this.f16799a.get(size);
                if (componentCallbacksC1573o != null && str.equals(componentCallbacksC1573o.mTag)) {
                    return componentCallbacksC1573o;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (M m10 : this.f16800b.values()) {
            if (m10 != null) {
                ComponentCallbacksC1573o k10 = m10.k();
                if (str.equals(k10.mTag)) {
                    return k10;
                }
            }
        }
        return null;
    }

    ComponentCallbacksC1573o i(String str) {
        ComponentCallbacksC1573o findFragmentByWho;
        for (M m10 : this.f16800b.values()) {
            if (m10 != null && (findFragmentByWho = m10.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    int j(ComponentCallbacksC1573o componentCallbacksC1573o) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC1573o.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f16799a.indexOf(componentCallbacksC1573o);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            ComponentCallbacksC1573o componentCallbacksC1573o2 = (ComponentCallbacksC1573o) this.f16799a.get(i10);
            if (componentCallbacksC1573o2.mContainer == viewGroup && (view2 = componentCallbacksC1573o2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f16799a.size()) {
                return -1;
            }
            ComponentCallbacksC1573o componentCallbacksC1573o3 = (ComponentCallbacksC1573o) this.f16799a.get(indexOf);
            if (componentCallbacksC1573o3.mContainer == viewGroup && (view = componentCallbacksC1573o3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (M m10 : this.f16800b.values()) {
            if (m10 != null) {
                arrayList.add(m10);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (M m10 : this.f16800b.values()) {
            if (m10 != null) {
                arrayList.add(m10.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap m() {
        return this.f16801c;
    }

    M n(String str) {
        return (M) this.f16800b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f16799a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f16799a) {
            arrayList = new ArrayList(this.f16799a);
        }
        return arrayList;
    }

    J p() {
        return this.f16802d;
    }

    Bundle q(String str) {
        return (Bundle) this.f16801c.get(str);
    }

    void r(M m10) {
        ComponentCallbacksC1573o k10 = m10.k();
        if (c(k10.mWho)) {
            return;
        }
        this.f16800b.put(k10.mWho, m10);
        if (k10.mRetainInstanceChangedWhileDetached) {
            if (k10.mRetainInstance) {
                this.f16802d.e(k10);
            } else {
                this.f16802d.o(k10);
            }
            k10.mRetainInstanceChangedWhileDetached = false;
        }
        if (G.J0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k10);
        }
    }

    void s(M m10) {
        ComponentCallbacksC1573o k10 = m10.k();
        if (k10.mRetainInstance) {
            this.f16802d.o(k10);
        }
        if (this.f16800b.get(k10.mWho) == m10 && ((M) this.f16800b.put(k10.mWho, null)) != null && G.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    void t() {
        Iterator it = this.f16799a.iterator();
        while (it.hasNext()) {
            M m10 = (M) this.f16800b.get(((ComponentCallbacksC1573o) it.next()).mWho);
            if (m10 != null) {
                m10.m();
            }
        }
        for (M m11 : this.f16800b.values()) {
            if (m11 != null) {
                m11.m();
                ComponentCallbacksC1573o k10 = m11.k();
                if (k10.mRemoving && !k10.isInBackStack()) {
                    if (k10.mBeingSaved && !this.f16801c.containsKey(k10.mWho)) {
                        B(k10.mWho, m11.r());
                    }
                    s(m11);
                }
            }
        }
    }

    void u(ComponentCallbacksC1573o componentCallbacksC1573o) {
        synchronized (this.f16799a) {
            this.f16799a.remove(componentCallbacksC1573o);
        }
        componentCallbacksC1573o.mAdded = false;
    }

    void v() {
        this.f16800b.clear();
    }

    void w(List list) {
        this.f16799a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                ComponentCallbacksC1573o f10 = f(str);
                if (f10 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (G.J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                }
                a(f10);
            }
        }
    }

    void x(HashMap hashMap) {
        this.f16801c.clear();
        this.f16801c.putAll(hashMap);
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f16800b.size());
        for (M m10 : this.f16800b.values()) {
            if (m10 != null) {
                ComponentCallbacksC1573o k10 = m10.k();
                B(k10.mWho, m10.r());
                arrayList.add(k10.mWho);
                if (G.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + k10.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f16799a) {
            try {
                if (this.f16799a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f16799a.size());
                Iterator it = this.f16799a.iterator();
                while (it.hasNext()) {
                    ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) it.next();
                    arrayList.add(componentCallbacksC1573o.mWho);
                    if (G.J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + componentCallbacksC1573o.mWho + "): " + componentCallbacksC1573o);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
