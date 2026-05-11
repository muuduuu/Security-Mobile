package R6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1143a extends W6.a {
    public static final Parcelable.Creator<C1143a> CREATOR = new C1146d();

    /* renamed from: a, reason: collision with root package name */
    final Intent f8577a;

    public C1143a(Intent intent) {
        this.f8577a = intent;
    }

    final Integer F() {
        if (this.f8577a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f8577a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public Intent j() {
        return this.f8577a;
    }

    public String u() {
        String stringExtra = this.f8577a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f8577a.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.s(parcel, 1, this.f8577a, i10, false);
        W6.c.b(parcel, a10);
    }
}
