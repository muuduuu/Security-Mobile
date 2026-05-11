package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e7.InterfaceC3089a;
import n7.AbstractC3711a;

/* loaded from: classes2.dex */
public final class o extends AbstractC3711a implements IInterface {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final InterfaceC3089a m1(InterfaceC3089a interfaceC3089a, String str, int i10, InterfaceC3089a interfaceC3089a2) {
        Parcel l12 = l1();
        n7.o.d(l12, interfaceC3089a);
        l12.writeString(str);
        l12.writeInt(i10);
        n7.o.d(l12, interfaceC3089a2);
        Parcel p10 = p(2, l12);
        InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(p10.readStrongBinder());
        p10.recycle();
        return k12;
    }

    public final InterfaceC3089a n1(InterfaceC3089a interfaceC3089a, String str, int i10, InterfaceC3089a interfaceC3089a2) {
        Parcel l12 = l1();
        n7.o.d(l12, interfaceC3089a);
        l12.writeString(str);
        l12.writeInt(i10);
        n7.o.d(l12, interfaceC3089a2);
        Parcel p10 = p(3, l12);
        InterfaceC3089a k12 = InterfaceC3089a.AbstractBinderC0469a.k1(p10.readStrongBinder());
        p10.recycle();
        return k12;
    }
}
