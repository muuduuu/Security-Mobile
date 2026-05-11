package yd;

import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;

/* renamed from: yd.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5207i extends Y {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f45539a;

    public C5207i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f45539a = annotations;
    }

    @Override // yd.Y
    public kotlin.reflect.d b() {
        return C5142C.b(C5207i.class);
    }

    @Override // yd.Y
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5207i a(C5207i c5207i) {
        return c5207i == null ? this : new C5207i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.i.a(this.f45539a, c5207i.f45539a));
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g e() {
        return this.f45539a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5207i) {
            return Intrinsics.b(((C5207i) obj).f45539a, this.f45539a);
        }
        return false;
    }

    @Override // yd.Y
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C5207i c(C5207i c5207i) {
        if (Intrinsics.b(c5207i, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f45539a.hashCode();
    }
}
