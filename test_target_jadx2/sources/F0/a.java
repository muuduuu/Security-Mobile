package F0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Parcelable f2197a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f2196b = new C0050a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: F0.a$a, reason: collision with other inner class name */
    class C0050a extends a {
        C0050a() {
            super((C0050a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2196b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(C0050a c0050a) {
        this();
    }

    public final Parcelable a() {
        return this.f2197a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f2197a, i10);
    }

    private a() {
        this.f2197a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2197a = parcelable == f2196b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2197a = readParcelable == null ? f2196b : readParcelable;
    }
}
