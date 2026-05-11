package t7;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t7.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4654c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f42843a = AbstractC4654c0.class.getClassLoader();

    public static void a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
