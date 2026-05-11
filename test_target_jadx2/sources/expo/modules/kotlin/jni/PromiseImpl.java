package expo.modules.kotlin.jni;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.y;
import java.lang.ref.WeakReference;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pb.C3862a;
import pb.m;
import u5.C4870a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R$\u0010-\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b+\u0010,R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102¨\u00064"}, d2 = {"Lexpo/modules/kotlin/jni/PromiseImpl;", "Lpb/m;", "Lexpo/modules/kotlin/jni/JavaCallback;", "callback", "<init>", "(Lexpo/modules/kotlin/jni/JavaCallback;)V", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "resolve", "(Ljava/lang/Object;)V", "c", "()V", BuildConfig.FLAVOR, "result", "e", "(I)V", BuildConfig.FLAVOR, "b", "(Z)V", BuildConfig.FLAVOR, "f", "(D)V", BuildConfig.FLAVOR, "g", "(F)V", BuildConfig.FLAVOR, C4870a.f43493a, "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "d", "(Ljava/util/Collection;)V", AppConstants.RETAKE_ERROR_CODE, "message", BuildConfig.FLAVOR, "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lexpo/modules/kotlin/jni/JavaCallback;", "i", "()Lexpo/modules/kotlin/jni/JavaCallback;", "<set-?>", "Z", "j", "()Z", "wasSettled", "Ljava/lang/ref/WeakReference;", "Lpb/a;", "Ljava/lang/ref/WeakReference;", "appContextHolder", "Ljava/lang/String;", "fullFunctionName", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromiseImpl implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean wasSettled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private WeakReference appContextHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String fullFunctionName;
    private final JavaCallback callback;

    public PromiseImpl(JavaCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // pb.m
    public void a(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!this.wasSettled) {
            this.callback.g(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        y yVar = new y(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw yVar;
        }
        C3862a c3862a = (C3862a) weakReference.get();
        if (c3862a == null) {
            throw yVar;
        }
        c3862a.m();
        throw yVar;
    }

    @Override // pb.m
    public void b(boolean result) {
        if (!this.wasSettled) {
            this.callback.j(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        y yVar = new y(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw yVar;
        }
        C3862a c3862a = (C3862a) weakReference.get();
        if (c3862a == null) {
            throw yVar;
        }
        c3862a.m();
        throw yVar;
    }

    @Override // pb.m
    public void c() {
        if (!this.wasSettled) {
            this.callback.b();
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        y yVar = new y(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw yVar;
        }
        C3862a c3862a = (C3862a) weakReference.get();
        if (c3862a == null) {
            throw yVar;
        }
        c3862a.m();
        throw yVar;
    }

    @Override // pb.m
    public void d(Collection result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.callback.i(result);
    }

    @Override // pb.m
    public void e(int result) {
        if (!this.wasSettled) {
            this.callback.e(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        y yVar = new y(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw yVar;
        }
        C3862a c3862a = (C3862a) weakReference.get();
        if (c3862a == null) {
            throw yVar;
        }
        c3862a.m();
        throw yVar;
    }

    @Override // pb.m
    public void f(double result) {
        if (!this.wasSettled) {
            this.callback.c(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        y yVar = new y(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw yVar;
        }
        C3862a c3862a = (C3862a) weakReference.get();
        if (c3862a == null) {
            throw yVar;
        }
        c3862a.m();
        throw yVar;
    }

    @Override // pb.m
    public void g(float result) {
        if (!this.wasSettled) {
            this.callback.d(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        y yVar = new y(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw yVar;
        }
        C3862a c3862a = (C3862a) weakReference.get();
        if (c3862a == null) {
            throw yVar;
        }
        c3862a.m();
        throw yVar;
    }

    @Override // pb.m
    public void h(CodedException codedException) {
        m.a.a(this, codedException);
    }

    /* renamed from: i, reason: from getter */
    public final JavaCallback getCallback() {
        return this.callback;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getWasSettled() {
        return this.wasSettled;
    }

    @Override // pb.m
    public void reject(String code, String message, Throwable cause) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (!this.wasSettled) {
            JavaCallback javaCallback = this.callback;
            if (message == null) {
                message = cause != null ? cause.getMessage() : null;
                if (message == null) {
                    message = "unknown";
                }
            }
            javaCallback.h(code, message);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        y yVar = new y(str != null ? str : "unknown");
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw yVar;
        }
        C3862a c3862a = (C3862a) weakReference.get();
        if (c3862a == null) {
            throw yVar;
        }
        c3862a.m();
        throw yVar;
    }

    @Override // pb.m
    public void resolve(Object value) {
        if (!this.wasSettled) {
            this.callback.f(value);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        y yVar = new y(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null) {
            throw yVar;
        }
        C3862a c3862a = (C3862a) weakReference.get();
        if (c3862a == null) {
            throw yVar;
        }
        c3862a.m();
        throw yVar;
    }
}
