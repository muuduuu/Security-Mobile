package Z7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j0.i;

/* loaded from: classes2.dex */
public class a extends F0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0231a();

    /* renamed from: c, reason: collision with root package name */
    public final i f12465c;

    /* renamed from: Z7.a$a, reason: collision with other inner class name */
    class C0231a implements Parcelable.ClassLoaderCreator {
        C0231a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0231a c0231a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f12465c + "}";
    }

    @Override // F0.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f12465c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = (String) this.f12465c.f(i11);
            bundleArr[i11] = (Bundle) this.f12465c.j(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f12465c = new i();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f12465c = new i(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f12465c.put(strArr[i10], bundleArr[i10]);
        }
    }
}
