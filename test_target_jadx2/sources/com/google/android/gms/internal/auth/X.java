package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
final class X implements U {

    /* renamed from: c, reason: collision with root package name */
    private static final U f23669c = new U() { // from class: com.google.android.gms.internal.auth.W
        @Override // com.google.android.gms.internal.auth.U
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private volatile U f23670a;

    /* renamed from: b, reason: collision with root package name */
    private Object f23671b;

    X(U u10) {
        this.f23670a = u10;
    }

    public final String toString() {
        Object obj = this.f23670a;
        if (obj == f23669c) {
            obj = "<supplier that returned " + String.valueOf(this.f23671b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        U u10 = this.f23670a;
        U u11 = f23669c;
        if (u10 != u11) {
            synchronized (this) {
                try {
                    if (this.f23670a != u11) {
                        Object zza = this.f23670a.zza();
                        this.f23671b = zza;
                        this.f23670a = u11;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f23671b;
    }
}
