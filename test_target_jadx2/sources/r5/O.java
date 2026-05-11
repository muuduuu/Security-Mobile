package R5;

import java.util.Objects;
import java.util.UUID;
import v5.InterfaceC4942i;

/* loaded from: classes2.dex */
public class O extends G implements P5.i {

    /* renamed from: d, reason: collision with root package name */
    static final char[] f8475d = "0123456789abcdef".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    protected final Boolean f8476c;

    public O() {
        this(null);
    }

    private static final void v(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    private static void w(int i10, char[] cArr, int i11) {
        x(i10 >> 16, cArr, i11);
        x(i10, cArr, i11 + 4);
    }

    private static void x(int i10, char[] cArr, int i11) {
        char[] cArr2 = f8475d;
        cArr[i11] = cArr2[(i10 >> 12) & 15];
        cArr[i11 + 1] = cArr2[(i10 >> 8) & 15];
        cArr[i11 + 2] = cArr2[(i10 >> 4) & 15];
        cArr[i11 + 3] = cArr2[i10 & 15];
    }

    private static final byte[] y(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        v((int) (mostSignificantBits >> 32), bArr, 0);
        v((int) mostSignificantBits, bArr, 4);
        v((int) (leastSignificantBits >> 32), bArr, 8);
        v((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    @Override // D5.o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean d(D5.B b10, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // R5.H, D5.o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void f(UUID uuid, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (z(fVar)) {
            fVar.F(y(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        w((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i10 = (int) mostSignificantBits;
        x(i10 >>> 16, cArr, 9);
        cArr[13] = '-';
        x(i10, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        x((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        x((int) (leastSignificantBits >>> 32), cArr, 24);
        w((int) leastSignificantBits, cArr, 28);
        fVar.i2(cArr, 0, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // P5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5.o a(D5.B b10, D5.d dVar) {
        Boolean bool;
        InterfaceC4942i.d p10 = p(b10, dVar, c());
        if (p10 != null) {
            InterfaceC4942i.c h10 = p10.h();
            if (h10 == InterfaceC4942i.c.BINARY) {
                bool = Boolean.TRUE;
            } else if (h10 == InterfaceC4942i.c.STRING) {
                bool = Boolean.FALSE;
            }
            return Objects.equals(bool, this.f8476c) ? new O(bool) : this;
        }
        bool = null;
        if (Objects.equals(bool, this.f8476c)) {
        }
    }

    protected boolean z(com.fasterxml.jackson.core.f fVar) {
        Boolean bool = this.f8476c;
        return bool != null ? bool.booleanValue() : fVar.e();
    }

    protected O(Boolean bool) {
        super(UUID.class);
        this.f8476c = bool;
    }
}
