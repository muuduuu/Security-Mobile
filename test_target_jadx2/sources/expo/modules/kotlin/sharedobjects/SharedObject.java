package expo.modules.kotlin.sharedobjects;

import Bb.b;
import Db.J;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pb.AbstractC3864c;
import pb.C3862a;
import pb.r;
import pb.t;
import u5.C4870a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0011\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR(\u0010\"\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010!R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObject;", BuildConfig.FLAVOR, "Lpb/r;", "runtimeContext", "<init>", "(Lpb/r;)V", "Lpb/a;", "appContext", "(Lpb/a;)V", BuildConfig.FLAVOR, "getSharedObjectId", "()I", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "g", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", BuildConfig.FLAVOR, "eventName", BuildConfig.FLAVOR, "args", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;[Ljava/lang/Object;)V", "n", "(Ljava/lang/String;)V", "o", "r", "()V", C4870a.f43493a, "e", "LBb/b;", "I", "l", "q", "(I)V", "sharedObjectId", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "j", "()Ljava/lang/ref/WeakReference;", "p", "(Ljava/lang/ref/WeakReference;)V", "runtimeContextHolder", "i", "()Lpb/r;", "f", "()Lpb/a;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SharedObject {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int sharedObjectId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private WeakReference runtimeContextHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public SharedObject() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final JavaScriptWeakObject g() {
        int b10 = b.b(this.sharedObjectId);
        r i10 = i();
        if (i10 == null) {
            return null;
        }
        return b.i(b10, i10);
    }

    private final int getSharedObjectId() {
        return this.sharedObjectId;
    }

    private final r i() {
        return (r) this.runtimeContextHolder.get();
    }

    public void a() {
    }

    public final void b(String eventName, Object... args) {
        r i10;
        JSIContext f10;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(args, "args");
        JavaScriptWeakObject g10 = g();
        if (g10 == null || (i10 = i()) == null || (f10 = i10.f()) == null) {
            return;
        }
        try {
            JNIUtils.Companion companion = JNIUtils.INSTANCE;
            ArrayList arrayList = new ArrayList(args.length);
            for (Object obj : args) {
                arrayList.add(J.b(J.f1409a, obj, null, false, 6, null));
            }
            companion.b(g10, f10, eventName, arrayList.toArray(new Object[0]));
        } catch (Throwable th) {
            AbstractC3864c.a().a("Unable to send event '" + eventName + "' by shared object of type " + getClass().getSimpleName(), th);
        }
    }

    public int e() {
        return 0;
    }

    public final C3862a f() {
        r i10 = i();
        if (i10 != null) {
            return i10.b();
        }
        return null;
    }

    /* renamed from: j, reason: from getter */
    public final WeakReference getRuntimeContextHolder() {
        return this.runtimeContextHolder;
    }

    public final int l() {
        return this.sharedObjectId;
    }

    public void n(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public void o(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public final void p(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.runtimeContextHolder = weakReference;
    }

    public final void q(int i10) {
        this.sharedObjectId = i10;
    }

    public void r() {
        a();
    }

    public SharedObject(r rVar) {
        this.sharedObjectId = b.b(0);
        this.runtimeContextHolder = t.a(rVar);
    }

    public /* synthetic */ SharedObject(r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : rVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedObject(C3862a appContext) {
        this(appContext.p());
        Intrinsics.checkNotNullParameter(appContext, "appContext");
    }
}
