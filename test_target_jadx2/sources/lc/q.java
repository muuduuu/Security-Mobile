package lc;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
final class q implements Lazy, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f37131d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37132e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    private volatile Function0 f37133a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f37134b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f37135c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f37133a = initializer;
        y yVar = y.f37148a;
        this.f37134b = yVar;
        this.f37135c = yVar;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this.f37134b != y.f37148a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this.f37134b;
        y yVar = y.f37148a;
        if (obj != yVar) {
            return obj;
        }
        Function0 function0 = this.f37133a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            if (androidx.concurrent.futures.b.a(f37132e, this, yVar, invoke)) {
                this.f37133a = null;
                return invoke;
            }
        }
        return this.f37134b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
