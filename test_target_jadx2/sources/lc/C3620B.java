package lc;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lc.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3620B implements Lazy, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Function0 f37117a;

    /* renamed from: b, reason: collision with root package name */
    private Object f37118b;

    public C3620B(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f37117a = initializer;
        this.f37118b = y.f37148a;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this.f37118b != y.f37148a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        if (this.f37118b == y.f37148a) {
            Function0 function0 = this.f37117a;
            Intrinsics.d(function0);
            this.f37118b = function0.invoke();
            this.f37117a = null;
        }
        return this.f37118b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
