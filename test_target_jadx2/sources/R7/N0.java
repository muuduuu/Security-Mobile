package r7;

/* loaded from: classes2.dex */
final class N0 implements S0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f39533a;

    /* renamed from: b, reason: collision with root package name */
    private final R0 f39534b;

    N0(int i10, R0 r02) {
        this.f39533a = i10;
        this.f39534b = r02;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return S0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s02 = (S0) obj;
        return this.f39533a == s02.zza() && this.f39534b.equals(s02.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f39533a ^ 14552422) + (this.f39534b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f39533a + "intEncoding=" + this.f39534b + ')';
    }

    @Override // r7.S0
    public final int zza() {
        return this.f39533a;
    }

    @Override // r7.S0
    public final R0 zzb() {
        return this.f39534b;
    }
}
