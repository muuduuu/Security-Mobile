package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: x7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5132o extends W6.a {
    public static final Parcelable.Creator<C5132o> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    private final List f44877a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44878b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44879c;

    /* renamed from: x7.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f44880a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f44881b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f44882c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f44880a.add(locationRequest);
            }
            return this;
        }

        public C5132o b() {
            return new C5132o(this.f44880a, this.f44881b, this.f44882c);
        }

        public a c(boolean z10) {
            this.f44881b = z10;
            return this;
        }
    }

    C5132o(List list, boolean z10, boolean z11) {
        this.f44877a = list;
        this.f44878b = z10;
        this.f44879c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.y(parcel, 1, Collections.unmodifiableList(this.f44877a), false);
        W6.c.c(parcel, 2, this.f44878b);
        W6.c.c(parcel, 3, this.f44879c);
        W6.c.b(parcel, a10);
    }
}
