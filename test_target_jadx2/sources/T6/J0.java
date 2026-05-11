package T6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.fragment.app.ComponentCallbacksC1573o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class J0 extends ComponentCallbacksC1573o implements InterfaceC1179j {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f9355b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final I0 f9356a = new I0();

    public static J0 E(AbstractActivityC1577t abstractActivityC1577t) {
        J0 j02;
        androidx.fragment.app.G supportFragmentManager = abstractActivityC1577t.getSupportFragmentManager();
        WeakHashMap weakHashMap = f9355b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC1577t);
        if (weakReference == null || (j02 = (J0) weakReference.get()) == null) {
            try {
                j02 = (J0) supportFragmentManager.i0("SLifecycleFragmentImpl");
                if (j02 == null || j02.isRemoving()) {
                    j02 = new J0();
                    supportFragmentManager.n().e(j02, "SLifecycleFragmentImpl").h();
                }
                weakHashMap.put(abstractActivityC1577t, new WeakReference(j02));
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
            }
        }
        return j02;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f9356a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // T6.InterfaceC1179j
    public final AbstractC1177i h(String str, Class cls) {
        return this.f9356a.a(str, cls);
    }

    @Override // T6.InterfaceC1179j
    public final Activity j() {
        return getActivity();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f9356a.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9356a.c(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final void onDestroy() {
        super.onDestroy();
        this.f9356a.i();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final void onResume() {
        super.onResume();
        this.f9356a.e();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9356a.g(bundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final void onStart() {
        super.onStart();
        this.f9356a.d();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public final void onStop() {
        super.onStop();
        this.f9356a.h();
    }

    @Override // T6.InterfaceC1179j
    public final void t(String str, AbstractC1177i abstractC1177i) {
        this.f9356a.b(str, abstractC1177i);
    }
}
