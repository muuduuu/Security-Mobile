package R5;

/* renamed from: R5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1133f extends H {
    public C1133f() {
        super(byte[].class);
    }

    @Override // D5.o
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean d(D5.B b10, byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // R5.H, D5.o
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void f(byte[] bArr, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        fVar.C(b10.f().h(), bArr, 0, bArr.length);
    }

    @Override // D5.o
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void g(byte[] bArr, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.d(bArr, com.fasterxml.jackson.core.k.VALUE_EMBEDDED_OBJECT));
        fVar.C(b10.f().h(), bArr, 0, bArr.length);
        gVar.h(fVar, g10);
    }
}
