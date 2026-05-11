package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f12925a;

    /* renamed from: b, reason: collision with root package name */
    public int f12926b;

    /* renamed from: c, reason: collision with root package name */
    public int f12927c;

    /* renamed from: d, reason: collision with root package name */
    public int f12928d;

    /* renamed from: e, reason: collision with root package name */
    public int f12929e;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f12925a = parcel.readInt();
        this.f12927c = parcel.readInt();
        this.f12928d = parcel.readInt();
        this.f12929e = parcel.readInt();
        this.f12926b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12925a);
        parcel.writeInt(this.f12927c);
        parcel.writeInt(this.f12928d);
        parcel.writeInt(this.f12929e);
        parcel.writeInt(this.f12926b);
    }
}
