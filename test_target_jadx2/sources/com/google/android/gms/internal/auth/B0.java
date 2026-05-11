package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
public abstract class B0 extends AbstractC2033a0 {

    /* renamed from: a, reason: collision with root package name */
    private final C0 f23583a;

    /* renamed from: b, reason: collision with root package name */
    protected C0 f23584b;

    protected B0(C0 c02) {
        this.f23583a = c02;
        if (c02.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f23584b = c02.c();
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B0 clone() {
        B0 b02 = (B0) this.f23583a.o(5, null, null);
        b02.f23584b = f();
        return b02;
    }

    @Override // com.google.android.gms.internal.auth.Y0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0 f() {
        if (!this.f23584b.n()) {
            return this.f23584b;
        }
        this.f23584b.j();
        return this.f23584b;
    }
}
