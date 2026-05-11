package q7;

import java.util.Arrays;

/* renamed from: q7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3941o {

    /* renamed from: a, reason: collision with root package name */
    Object[] f38812a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f38813b = 0;

    /* renamed from: c, reason: collision with root package name */
    C3940n f38814c;

    public final C3941o a(Object obj, Object obj2) {
        int i10 = this.f38813b + 1;
        Object[] objArr = this.f38812a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f38812a = Arrays.copyOf(objArr, AbstractC3935i.a(length, i11));
        }
        AbstractC3932f.a(obj, obj2);
        Object[] objArr2 = this.f38812a;
        int i12 = this.f38813b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f38813b = i12 + 1;
        return this;
    }

    public final AbstractC3942p b() {
        C3940n c3940n = this.f38814c;
        if (c3940n != null) {
            throw c3940n.a();
        }
        C3949x g10 = C3949x.g(this.f38813b, this.f38812a, this);
        C3940n c3940n2 = this.f38814c;
        if (c3940n2 == null) {
            return g10;
        }
        throw c3940n2.a();
    }
}
