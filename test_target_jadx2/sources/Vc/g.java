package Vc;

import Kc.G;
import Sc.y;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import xd.n;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final b f11145a;

    /* renamed from: b, reason: collision with root package name */
    private final k f11146b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f11147c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f11148d;

    /* renamed from: e, reason: collision with root package name */
    private final Xc.d f11149e;

    public g(b components, k typeParameterResolver, Lazy delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f11145a = components;
        this.f11146b = typeParameterResolver;
        this.f11147c = delegateForDefaultTypeQualifiers;
        this.f11148d = delegateForDefaultTypeQualifiers;
        this.f11149e = new Xc.d(this, typeParameterResolver);
    }

    public final b a() {
        return this.f11145a;
    }

    public final y b() {
        return (y) this.f11148d.getValue();
    }

    public final Lazy c() {
        return this.f11147c;
    }

    public final G d() {
        return this.f11145a.m();
    }

    public final n e() {
        return this.f11145a.u();
    }

    public final k f() {
        return this.f11146b;
    }

    public final Xc.d g() {
        return this.f11149e;
    }
}
