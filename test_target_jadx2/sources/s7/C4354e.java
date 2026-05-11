package s7;

/* renamed from: s7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4354e implements InterfaceC4389j {

    /* renamed from: a, reason: collision with root package name */
    private final int f41188a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC4382i f41189b;

    C4354e(int i10, EnumC4382i enumC4382i) {
        this.f41188a = i10;
        this.f41189b = enumC4382i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC4389j.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4389j)) {
            return false;
        }
        InterfaceC4389j interfaceC4389j = (InterfaceC4389j) obj;
        return this.f41188a == interfaceC4389j.zza() && this.f41189b.equals(interfaceC4389j.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f41188a ^ 14552422) + (this.f41189b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f41188a + "intEncoding=" + this.f41189b + ')';
    }

    @Override // s7.InterfaceC4389j
    public final int zza() {
        return this.f41188a;
    }

    @Override // s7.InterfaceC4389j
    public final EnumC4382i zzb() {
        return this.f41189b;
    }
}
