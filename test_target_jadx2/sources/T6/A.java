package T6;

import D7.C0787k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9329a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f9330b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f9329a) {
            hashMap = new HashMap(this.f9329a);
        }
        synchronized (this.f9330b) {
            hashMap2 = new HashMap(this.f9330b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).h(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0787k) entry2.getKey()).d(new S6.b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f9329a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.c(new C1194y(this, basePendingResult));
    }

    final void d(C0787k c0787k, boolean z10) {
        this.f9330b.put(c0787k, Boolean.valueOf(z10));
        c0787k.a().addOnCompleteListener(new C1195z(this, c0787k));
    }

    final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, C1171f.f9414p);
    }

    final boolean g() {
        return (this.f9329a.isEmpty() && this.f9330b.isEmpty()) ? false : true;
    }
}
