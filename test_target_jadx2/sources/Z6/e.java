package Z6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class e extends W6.a {
    public static final Parcelable.Creator<e> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f12458a;

    public e(PendingIntent pendingIntent) {
        this.f12458a = pendingIntent;
    }

    public PendingIntent j() {
        return this.f12458a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, j(), i10, false);
        W6.c.b(parcel, a10);
    }
}
