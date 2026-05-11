package B7;

import S6.o;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends W6.a implements o {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f524a;

    /* renamed from: b, reason: collision with root package name */
    private final String f525b;

    public h(List list, String str) {
        this.f524a = list;
        this.f525b = str;
    }

    @Override // S6.o
    public final Status c() {
        return this.f525b != null ? Status.f23339f : Status.f23343j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f524a;
        int a10 = W6.c.a(parcel);
        W6.c.w(parcel, 1, list, false);
        W6.c.u(parcel, 2, this.f525b, false);
        W6.c.b(parcel, a10);
    }
}
