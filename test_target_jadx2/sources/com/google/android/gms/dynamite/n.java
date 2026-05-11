package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;
import n7.AbstractC3711a;

/* loaded from: classes2.dex */
public final class n extends AbstractC3711a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final InterfaceC3089a m1(InterfaceC3089a interfaceC3089a, String str, int i10) {
        Parcel l12 = l1();
        n7.o.d(l12, interfaceC3089a);
        l12.writeString(str);
        l12.writeInt(i10);
        Parcel p10 = p(2, l12);
        InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(p10.readStrongBinder());
        p10.recycle();
        return k12;
    }

    public final int n1(InterfaceC3089a interfaceC3089a, String str, boolean z10) {
        Parcel l12 = l1();
        n7.o.d(l12, interfaceC3089a);
        l12.writeString(str);
        l12.writeInt(z10 ? 1 : 0);
        Parcel p10 = p(3, l12);
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    public final InterfaceC3089a o1(InterfaceC3089a interfaceC3089a, String str, int i10) {
        Parcel l12 = l1();
        n7.o.d(l12, interfaceC3089a);
        l12.writeString(str);
        l12.writeInt(i10);
        Parcel p10 = p(4, l12);
        InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(p10.readStrongBinder());
        p10.recycle();
        return k12;
    }

    public final int p1(InterfaceC3089a interfaceC3089a, String str, boolean z10) {
        Parcel l12 = l1();
        n7.o.d(l12, interfaceC3089a);
        l12.writeString(str);
        l12.writeInt(z10 ? 1 : 0);
        Parcel p10 = p(5, l12);
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    public final int q1() {
        Parcel p10 = p(6, l1());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    public final InterfaceC3089a r1(InterfaceC3089a interfaceC3089a, String str, boolean z10, long j10) {
        Parcel l12 = l1();
        n7.o.d(l12, interfaceC3089a);
        l12.writeString(str);
        l12.writeInt(z10 ? 1 : 0);
        l12.writeLong(j10);
        Parcel p10 = p(7, l12);
        InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(p10.readStrongBinder());
        p10.recycle();
        return k12;
    }

    public final InterfaceC3089a s1(InterfaceC3089a interfaceC3089a, String str, int i10, InterfaceC3089a interfaceC3089a2) {
        Parcel l12 = l1();
        n7.o.d(l12, interfaceC3089a);
        l12.writeString(str);
        l12.writeInt(i10);
        n7.o.d(l12, interfaceC3089a2);
        Parcel p10 = p(8, l12);
        InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(p10.readStrongBinder());
        p10.recycle();
        return k12;
    }
}
