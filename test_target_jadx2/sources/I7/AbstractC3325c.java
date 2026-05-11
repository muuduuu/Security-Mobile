package i7;

import android.os.Parcel;

/* renamed from: i7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3325c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f34147a = AbstractC3325c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
