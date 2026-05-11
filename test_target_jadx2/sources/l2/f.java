package l2;

/* loaded from: classes.dex */
public final class f implements InterfaceC3599a {
    @Override // l2.InterfaceC3599a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // l2.InterfaceC3599a
    public int b() {
        return 1;
    }

    @Override // l2.InterfaceC3599a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // l2.InterfaceC3599a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
