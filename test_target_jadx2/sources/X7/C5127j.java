package x7;

import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;
import p7.C3823k0;

/* renamed from: x7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5127j extends W6.a {
    public static final Parcelable.Creator<C5127j> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final List f44856a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44857b;

    /* renamed from: c, reason: collision with root package name */
    private final String f44858c;

    /* renamed from: d, reason: collision with root package name */
    private final String f44859d;

    /* renamed from: x7.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f44860a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private int f44861b = 5;

        /* renamed from: c, reason: collision with root package name */
        private String f44862c = BuildConfig.FLAVOR;

        public a a(InterfaceC5122e interfaceC5122e) {
            AbstractC1287s.n(interfaceC5122e, "geofence can't be null.");
            AbstractC1287s.b(interfaceC5122e instanceof C3823k0, "Geofence must be created using Geofence.Builder.");
            this.f44860a.add((C3823k0) interfaceC5122e);
            return this;
        }

        public C5127j b() {
            AbstractC1287s.b(!this.f44860a.isEmpty(), "No geofence has been added to this request.");
            return new C5127j(this.f44860a, this.f44861b, this.f44862c, null);
        }

        public a c(int i10) {
            this.f44861b = i10 & 7;
            return this;
        }
    }

    C5127j(List list, int i10, String str, String str2) {
        this.f44856a = list;
        this.f44857b = i10;
        this.f44858c = str;
        this.f44859d = str2;
    }

    public int j() {
        return this.f44857b;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.f44856a + ", initialTrigger=" + this.f44857b + ", tag=" + this.f44858c + ", attributionTag=" + this.f44859d + "]";
    }

    public final C5127j u(String str) {
        return new C5127j(this.f44856a, this.f44857b, this.f44858c, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.y(parcel, 1, this.f44856a, false);
        W6.c.m(parcel, 2, j());
        W6.c.u(parcel, 3, this.f44858c, false);
        W6.c.u(parcel, 4, this.f44859d, false);
        W6.c.b(parcel, a10);
    }
}
