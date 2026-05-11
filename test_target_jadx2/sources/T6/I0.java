package T6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j0.C3476a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9351a = Collections.synchronizedMap(new C3476a());

    /* renamed from: b, reason: collision with root package name */
    private int f9352b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f9353c;

    I0() {
    }

    final AbstractC1177i a(String str, Class cls) {
        return (AbstractC1177i) cls.cast(this.f9351a.get(str));
    }

    final void b(String str, AbstractC1177i abstractC1177i) {
        Map map = this.f9351a;
        if (map.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(str, abstractC1177i);
        if (this.f9352b > 0) {
            new n7.p(Looper.getMainLooper()).post(new H0(this, abstractC1177i, str));
        }
    }

    final void c(Bundle bundle) {
        this.f9352b = 1;
        this.f9353c = bundle;
        for (Map.Entry entry : this.f9351a.entrySet()) {
            ((AbstractC1177i) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void d() {
        this.f9352b = 2;
        Iterator it = this.f9351a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1177i) it.next()).j();
        }
    }

    final void e() {
        this.f9352b = 3;
        Iterator it = this.f9351a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1177i) it.next()).h();
        }
    }

    final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f9351a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1177i) it.next()).e(i10, i11, intent);
        }
    }

    final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f9351a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC1177i) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void h() {
        this.f9352b = 4;
        Iterator it = this.f9351a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1177i) it.next()).k();
        }
    }

    final void i() {
        this.f9352b = 5;
        Iterator it = this.f9351a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1177i) it.next()).g();
        }
    }

    final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f9351a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC1177i) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final /* synthetic */ int k() {
        return this.f9352b;
    }

    final /* synthetic */ Bundle l() {
        return this.f9353c;
    }
}
