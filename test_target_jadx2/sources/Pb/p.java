package pb;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p implements LifecycleEventListener, ActivityEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f38580a;

    public p(C3862a appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f38580a = new WeakReference(appContext);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3862a c3862a = (C3862a) this.f38580a.get();
        if (c3862a != null) {
            c3862a.z(activity, i10, i11, intent);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        C3862a c3862a = (C3862a) this.f38580a.get();
        if (c3862a != null) {
            c3862a.C();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        C3862a c3862a = (C3862a) this.f38580a.get();
        if (c3862a != null) {
            c3862a.D();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        C3862a c3862a = (C3862a) this.f38580a.get();
        if (c3862a != null) {
            c3862a.E();
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        C3862a c3862a = (C3862a) this.f38580a.get();
        if (c3862a != null) {
            c3862a.F(intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onUserLeaveHint(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3862a c3862a = (C3862a) this.f38580a.get();
        if (c3862a != null) {
            c3862a.G();
        }
    }
}
