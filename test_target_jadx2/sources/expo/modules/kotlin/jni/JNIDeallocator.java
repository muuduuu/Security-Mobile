package expo.modules.kotlin.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0019\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0018\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator;", "Ljava/lang/AutoCloseable;", BuildConfig.FLAVOR, "shouldCreateDestructorThread", "<init>", "(Z)V", "Lexpo/modules/kotlin/jni/Destructible;", "destructible", BuildConfig.FLAVOR, "addReference", "(Lexpo/modules/kotlin/jni/Destructible;)V", "c", "()Lkotlin/Unit;", "close", "()V", "Ljava/lang/ref/ReferenceQueue;", C4870a.f43493a, "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", BuildConfig.FLAVOR, "Ljava/lang/ref/PhantomReference;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/util/Map;", "destructorMap", "expo/modules/kotlin/jni/JNIDeallocator$a", "Lexpo/modules/kotlin/jni/JNIDeallocator$a;", "destructorThread", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JNIDeallocator implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReferenceQueue referenceQueue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map destructorMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a destructorThread;

    public static final class a extends Thread {
        a() {
            super("Expo JNI deallocator");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!isInterrupted()) {
                try {
                    Reference remove = JNIDeallocator.this.referenceQueue.remove();
                    JNIDeallocator jNIDeallocator = JNIDeallocator.this;
                    synchronized (this) {
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public JNIDeallocator() {
        this(false, 1, null);
    }

    public final void addReference(Destructible destructible) {
        Intrinsics.checkNotNullParameter(destructible, "destructible");
        synchronized (this) {
            WeakReference weakReference = new WeakReference(destructible);
            this.destructorMap.put(new PhantomReference(destructible, this.referenceQueue), weakReference);
            Unit unit = Unit.f36324a;
        }
    }

    public final Unit c() {
        Unit unit;
        synchronized (this) {
            try {
                Iterator it = this.destructorMap.values().iterator();
                while (it.hasNext()) {
                    Destructible destructible = (Destructible) ((WeakReference) it.next()).get();
                    if (destructible != null) {
                        destructible.a();
                    }
                }
                this.destructorMap.clear();
                a aVar = this.destructorThread;
                if (aVar != null) {
                    aVar.interrupt();
                    unit = Unit.f36324a;
                } else {
                    unit = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return unit;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        c();
    }

    public JNIDeallocator(boolean z10) {
        a aVar;
        this.referenceQueue = new ReferenceQueue();
        this.destructorMap = new LinkedHashMap();
        if (z10) {
            aVar = new a();
            aVar.start();
        } else {
            aVar = null;
        }
        this.destructorThread = aVar;
    }

    public /* synthetic */ JNIDeallocator(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
