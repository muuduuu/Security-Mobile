package S6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
final class w implements Parcelable.Creator {

    /* renamed from: b, reason: collision with root package name */
    private static final w f8874b = new w(new x());

    /* renamed from: a, reason: collision with root package name */
    private final Parcelable.Creator f8875a;

    private w(Parcelable.Creator creator) {
        this.f8875a = creator;
    }

    public static w a() {
        return f8874b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return x.a(parcel);
        }
        parcel.setDataPosition(dataPosition - 4);
        return c.u();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
