package yd;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class N extends M {

    /* renamed from: b, reason: collision with root package name */
    private final e0 f45453b;

    /* renamed from: c, reason: collision with root package name */
    private final List f45454c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f45455d;

    /* renamed from: e, reason: collision with root package name */
    private final rd.h f45456e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f45457f;

    public N(e0 constructor, List arguments, boolean z10, rd.h memberScope, Function1 refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        this.f45453b = constructor;
        this.f45454c = arguments;
        this.f45455d = z10;
        this.f45456e = memberScope;
        this.f45457f = refinedTypeFactory;
        if (!(w() instanceof kotlin.reflect.jvm.internal.impl.types.error.f) || (w() instanceof kotlin.reflect.jvm.internal.impl.types.error.l)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + w() + '\n' + W0());
    }

    @Override // yd.AbstractC5197E
    public List U0() {
        return this.f45454c;
    }

    @Override // yd.AbstractC5197E
    public a0 V0() {
        return a0.f45478b.i();
    }

    @Override // yd.AbstractC5197E
    public e0 W0() {
        return this.f45453b;
    }

    @Override // yd.AbstractC5197E
    public boolean X0() {
        return this.f45455d;
    }

    @Override // yd.t0
    /* renamed from: d1 */
    public M a1(boolean z10) {
        return z10 == X0() ? this : z10 ? new K(this) : new I(this);
    }

    @Override // yd.t0
    /* renamed from: e1 */
    public M c1(a0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new O(this, newAttributes);
    }

    @Override // yd.t0
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public M g1(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        M m10 = (M) this.f45457f.invoke(kotlinTypeRefiner);
        return m10 == null ? this : m10;
    }

    @Override // yd.AbstractC5197E
    public rd.h w() {
        return this.f45456e;
    }
}
