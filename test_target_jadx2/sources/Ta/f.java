package Ta;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f9521a = new f();

    private f() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Ua.b.f10392a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 15) {
            onLowMemory();
        }
    }
}
