package T6;

import V6.AbstractC1287s;
import android.app.Activity;
import androidx.fragment.app.AbstractActivityC1577t;

/* renamed from: T6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1175h {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9435a;

    public C1175h(Activity activity) {
        AbstractC1287s.n(activity, "Activity must not be null");
        this.f9435a = activity;
    }

    public final boolean a() {
        return this.f9435a instanceof AbstractActivityC1577t;
    }

    public final boolean b() {
        return this.f9435a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.f9435a;
    }

    public final AbstractActivityC1577t d() {
        return (AbstractActivityC1577t) this.f9435a;
    }
}
