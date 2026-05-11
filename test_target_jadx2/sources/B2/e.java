package b2;

import O1.AbstractC1034e;
import O1.z;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements z {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f18512a = new HashSet();

    @Override // O1.z
    public void a(String str, Throwable th) {
        if (AbstractC1034e.f6932a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // O1.z
    public void b(String str) {
        e(str, null);
    }

    @Override // O1.z
    public void c(String str, Throwable th) {
        Set set = f18512a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    @Override // O1.z
    public void d(String str) {
        c(str, null);
    }

    public void e(String str, Throwable th) {
        if (AbstractC1034e.f6932a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
