package Bb;

import expo.modules.kotlin.exception.C;
import expo.modules.kotlin.exception.s;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pb.r;
import pb.t;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f560a;

    /* renamed from: b, reason: collision with root package name */
    private int f561b;

    /* renamed from: c, reason: collision with root package name */
    private Map f562c;

    public c(r runtimeContext) {
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        this.f560a = t.a(runtimeContext);
        this.f561b = b.b(1);
        this.f562c = new LinkedHashMap();
    }

    private final int c(int i10) {
        if (this.f562c.containsKey(b.a(i10)) || i10 == 0 || i10 >= this.f561b) {
            return i10;
        }
        throw new C();
    }

    private final int d() {
        int i10;
        synchronized (this) {
            i10 = this.f561b;
            this.f561b = b.b(i10 + 1);
        }
        return i10;
    }

    public final int a(SharedObject sharedObject, JavaScriptObject js) {
        Intrinsics.checkNotNullParameter(sharedObject, "native");
        Intrinsics.checkNotNullParameter(js, "js");
        int d10 = d();
        sharedObject.q(d10);
        JavaScriptObject.i(js, "__expo_shared_object_id__", d10, null, 4, null);
        r rVar = (r) this.f560a.get();
        if (rVar == null) {
            throw new expo.modules.kotlin.exception.e();
        }
        rVar.f().setNativeStateForSharedObject(d10, js);
        int e10 = sharedObject.e();
        if (e10 > 0) {
            js.setExternalMemoryPressure(e10);
        }
        if (sharedObject instanceof SharedRef) {
            JavaScriptObject.j(js, "nativeRefType", ((SharedRef) sharedObject).getNativeRefType(), null, 4, null);
        }
        JavaScriptWeakObject createWeak = js.createWeak();
        synchronized (this) {
            this.f562c.put(b.a(d10), lc.t.a(sharedObject, createWeak));
            Unit unit = Unit.f36324a;
        }
        if (sharedObject.getRuntimeContextHolder().get() == null) {
            sharedObject.p(t.a(rVar));
        }
        return d10;
    }

    public final void b(int i10) {
        Pair pair;
        synchronized (this) {
            pair = (Pair) this.f562c.remove(b.a(i10));
        }
        if (pair != null) {
            SharedObject sharedObject = (SharedObject) pair.getFirst();
            sharedObject.q(b.b(0));
            sharedObject.r();
        }
    }

    public final JavaScriptObject e(SharedObject sharedObject) {
        JavaScriptObject lock;
        JavaScriptWeakObject javaScriptWeakObject;
        Intrinsics.checkNotNullParameter(sharedObject, "native");
        synchronized (this) {
            Pair pair = (Pair) this.f562c.get(b.a(sharedObject.l()));
            lock = (pair == null || (javaScriptWeakObject = (JavaScriptWeakObject) pair.d()) == null) ? null : javaScriptWeakObject.lock();
        }
        return lock;
    }

    public final SharedObject f(int i10) {
        Pair pair = (Pair) this.f562c.get(b.a(c(i10)));
        SharedObject sharedObject = pair != null ? (SharedObject) pair.c() : null;
        if (sharedObject != null) {
            return sharedObject;
        }
        throw new s();
    }

    public final SharedObject g(int i10) {
        SharedObject sharedObject;
        synchronized (this) {
            Pair pair = (Pair) this.f562c.get(b.a(i10));
            sharedObject = pair != null ? (SharedObject) pair.c() : null;
        }
        return sharedObject;
    }

    public final JavaScriptWeakObject h(SharedObject nativeObject) {
        JavaScriptWeakObject javaScriptWeakObject;
        Intrinsics.checkNotNullParameter(nativeObject, "nativeObject");
        synchronized (this) {
            Pair pair = (Pair) this.f562c.get(b.a(nativeObject.l()));
            javaScriptWeakObject = pair != null ? (JavaScriptWeakObject) pair.d() : null;
        }
        return javaScriptWeakObject;
    }
}
