package l2;

/* loaded from: classes.dex */
public final class h implements InterfaceC3599a {
    @Override // l2.InterfaceC3599a
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // l2.InterfaceC3599a
    public int b() {
        return 4;
    }

    @Override // l2.InterfaceC3599a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // l2.InterfaceC3599a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
