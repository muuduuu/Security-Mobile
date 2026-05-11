package lc;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
final class r implements Lazy, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f37136a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f37137b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f37138c;

    public r(Function0 initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f37136a = initializer;
        this.f37137b = y.f37148a;
        this.f37138c = obj == null ? this : obj;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this.f37137b != y.f37148a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj;
        Object obj2 = this.f37137b;
        y yVar = y.f37148a;
        if (obj2 != yVar) {
            return obj2;
        }
        synchronized (this.f37138c) {
            obj = this.f37137b;
            if (obj == yVar) {
                Function0 function0 = this.f37136a;
                Intrinsics.d(function0);
                obj = function0.invoke();
                this.f37137b = obj;
                this.f37136a = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ r(Function0 function0, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i10 & 2) != 0 ? null : obj);
    }
}
