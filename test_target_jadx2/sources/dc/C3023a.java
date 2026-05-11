package dc;

import android.location.Address;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3023a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0454a();

    /* renamed from: a, reason: collision with root package name */
    private Location f31434a;

    /* renamed from: b, reason: collision with root package name */
    private Address f31435b;

    /* renamed from: dc.a$a, reason: collision with other inner class name */
    static class C0454a implements Parcelable.Creator {
        C0454a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3023a createFromParcel(Parcel parcel) {
            return new C3023a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3023a[] newArray(int i10) {
            return new C3023a[i10];
        }
    }

    public C3023a(Address address) {
        this.f31435b = address;
        Location location = new Location(C3023a.class.getCanonicalName());
        this.f31434a = location;
        location.setLatitude(address.getLatitude());
        this.f31434a.setLongitude(address.getLongitude());
    }

    public Location a() {
        return this.f31434a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f31434a, i10);
        parcel.writeParcelable(this.f31435b, i10);
    }

    public C3023a(Parcel parcel) {
        this.f31434a = (Location) parcel.readParcelable(Location.class.getClassLoader());
        this.f31435b = (Address) parcel.readParcelable(Address.class.getClassLoader());
    }
}
