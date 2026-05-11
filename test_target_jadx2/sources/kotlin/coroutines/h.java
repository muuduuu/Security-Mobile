package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import pc.AbstractC3868b;
import pc.EnumC3867a;

/* loaded from: classes.dex */
public final class h implements d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f36373b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36374c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    private final d f36375a;
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(d delegate, Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f36375a = delegate;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        EnumC3867a enumC3867a = EnumC3867a.UNDECIDED;
        if (obj == enumC3867a) {
            if (androidx.concurrent.futures.b.a(f36374c, this, enumC3867a, AbstractC3868b.e())) {
                return AbstractC3868b.e();
            }
            obj = this.result;
        }
        if (obj == EnumC3867a.RESUMED) {
            return AbstractC3868b.e();
        }
        if (obj instanceof o.b) {
            throw ((o.b) obj).f37130a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d dVar = this.f36375a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return this.f36375a.getContext();
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC3867a enumC3867a = EnumC3867a.UNDECIDED;
            if (obj2 == enumC3867a) {
                if (androidx.concurrent.futures.b.a(f36374c, this, enumC3867a, obj)) {
                    return;
                }
            } else {
                if (obj2 != AbstractC3868b.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f36374c, this, AbstractC3868b.e(), EnumC3867a.RESUMED)) {
                    this.f36375a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f36375a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(d delegate) {
        this(delegate, EnumC3867a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
