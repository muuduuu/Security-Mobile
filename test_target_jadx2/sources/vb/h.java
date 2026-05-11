package vb;

import Db.K;
import android.os.Bundle;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import pb.r;

/* loaded from: classes2.dex */
public final class h extends g {

    /* renamed from: c, reason: collision with root package name */
    private final pb.j f44216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pb.j moduleHolder, Fa.a legacyEventEmitter, WeakReference reactContextHolder) {
        super(legacyEventEmitter, reactContextHolder);
        Intrinsics.checkNotNullParameter(moduleHolder, "moduleHolder");
        Intrinsics.checkNotNullParameter(legacyEventEmitter, "legacyEventEmitter");
        Intrinsics.checkNotNullParameter(reactContextHolder, "reactContextHolder");
        this.f44216c = moduleHolder;
    }

    private final void c(String str) {
        String[] a10;
        f d10 = this.f44216c.e().d();
        if (d10 == null || (a10 = d10.a()) == null || !AbstractC3574i.v(a10, str)) {
            throw new IllegalArgumentException(("Unsupported event: " + str + ".").toString());
        }
    }

    private final void d(String str, Map map) {
        r d10 = this.f44216c.g().d();
        JavaScriptModuleObject_ i10 = this.f44216c.i();
        if (i10 == null) {
            return;
        }
        try {
            JNIUtils.INSTANCE.a(i10, d10.f(), str, map);
        } catch (Exception e10) {
            if (i10.b()) {
                throw e10;
            }
        }
    }

    @Override // vb.g, Fa.a
    public void b(String eventName, Bundle bundle) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        c(eventName);
        d(eventName, bundle != null ? K.s(bundle) : null);
    }
}
