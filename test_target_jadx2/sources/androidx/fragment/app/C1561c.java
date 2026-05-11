package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1561c implements Parcelable {
    public static final Parcelable.Creator<C1561c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final List f16906a;

    /* renamed from: b, reason: collision with root package name */
    final List f16907b;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1561c createFromParcel(Parcel parcel) {
            return new C1561c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1561c[] newArray(int i10) {
            return new C1561c[i10];
        }
    }

    C1561c(Parcel parcel) {
        this.f16906a = parcel.createStringArrayList();
        this.f16907b = parcel.createTypedArrayList(C1560b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f16906a);
        parcel.writeTypedList(this.f16907b);
    }
}
