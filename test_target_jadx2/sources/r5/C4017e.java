package r5;

import com.facebook.soloader.E;

/* renamed from: r5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4017e implements InterfaceC4020h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4020h[] f39247a;

    /* renamed from: b, reason: collision with root package name */
    private int f39248b = 0;

    public C4017e(InterfaceC4020h... interfaceC4020hArr) {
        this.f39247a = interfaceC4020hArr;
    }

    @Override // r5.InterfaceC4020h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        int i10;
        InterfaceC4020h[] interfaceC4020hArr;
        do {
            i10 = this.f39248b;
            interfaceC4020hArr = this.f39247a;
            if (i10 >= interfaceC4020hArr.length) {
                return false;
            }
            this.f39248b = i10 + 1;
        } while (!interfaceC4020hArr[i10].a(unsatisfiedLinkError, eArr));
        return true;
    }
}
