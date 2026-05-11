package o7;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f37960a = c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
