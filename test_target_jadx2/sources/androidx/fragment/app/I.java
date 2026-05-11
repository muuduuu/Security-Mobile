package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.G;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f16754a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList f16755b;

    /* renamed from: c, reason: collision with root package name */
    C1560b[] f16756c;

    /* renamed from: d, reason: collision with root package name */
    int f16757d;

    /* renamed from: e, reason: collision with root package name */
    String f16758e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f16759f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f16760g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f16761h;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public I createFromParcel(Parcel parcel) {
            return new I(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public I[] newArray(int i10) {
            return new I[i10];
        }
    }

    public I() {
        this.f16758e = null;
        this.f16759f = new ArrayList();
        this.f16760g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f16754a);
        parcel.writeStringList(this.f16755b);
        parcel.writeTypedArray(this.f16756c, i10);
        parcel.writeInt(this.f16757d);
        parcel.writeString(this.f16758e);
        parcel.writeStringList(this.f16759f);
        parcel.writeTypedList(this.f16760g);
        parcel.writeTypedList(this.f16761h);
    }

    public I(Parcel parcel) {
        this.f16758e = null;
        this.f16759f = new ArrayList();
        this.f16760g = new ArrayList();
        this.f16754a = parcel.createStringArrayList();
        this.f16755b = parcel.createStringArrayList();
        this.f16756c = (C1560b[]) parcel.createTypedArray(C1560b.CREATOR);
        this.f16757d = parcel.readInt();
        this.f16758e = parcel.readString();
        this.f16759f = parcel.createStringArrayList();
        this.f16760g = parcel.createTypedArrayList(C1561c.CREATOR);
        this.f16761h = parcel.createTypedArrayList(G.l.CREATOR);
    }
}
