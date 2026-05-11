package T6;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class G0 extends Fragment implements InterfaceC1179j {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f9344b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final I0 f9345a = new I0();

    public static G0 a(Activity activity) {
        G0 g02;
        WeakHashMap weakHashMap = f9344b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (g02 = (G0) weakReference.get()) != null) {
            return g02;
        }
        try {
            G0 g03 = (G0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (g03 == null || g03.isRemoving()) {
                g03 = new G0();
                activity.getFragmentManager().beginTransaction().add(g03, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(g03));
            return g03;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f9345a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // T6.InterfaceC1179j
    public final AbstractC1177i h(String str, Class cls) {
        return this.f9345a.a(str, cls);
    }

    @Override // T6.InterfaceC1179j
    public final Activity j() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f9345a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9345a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9345a.i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f9345a.e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f9345a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9345a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9345a.h();
    }

    @Override // T6.InterfaceC1179j
    public final void t(String str, AbstractC1177i abstractC1177i) {
        this.f9345a.b(str, abstractC1177i);
    }
}
