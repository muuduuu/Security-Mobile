package t7;

/* renamed from: t7.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4765s0 implements InterfaceC4800x0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f43227a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC4793w0 f43228b;

    C4765s0(int i10, EnumC4793w0 enumC4793w0) {
        this.f43227a = i10;
        this.f43228b = enumC4793w0;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC4800x0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4800x0)) {
            return false;
        }
        InterfaceC4800x0 interfaceC4800x0 = (InterfaceC4800x0) obj;
        return this.f43227a == interfaceC4800x0.zza() && this.f43228b.equals(interfaceC4800x0.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f43227a ^ 14552422) + (this.f43228b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f43227a + "intEncoding=" + this.f43228b + ')';
    }

    @Override // t7.InterfaceC4800x0
    public final int zza() {
        return this.f43227a;
    }

    @Override // t7.InterfaceC4800x0
    public final EnumC4793w0 zzb() {
        return this.f43228b;
    }
}
