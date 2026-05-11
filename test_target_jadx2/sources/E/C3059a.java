package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3059a implements Parcelable {
    public static final Parcelable.Creator<C3059a> CREATOR = new C0465a();

    /* renamed from: a, reason: collision with root package name */
    private final int f32083a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f32084b;

    /* renamed from: e.a$a, reason: collision with other inner class name */
    class C0465a implements Parcelable.Creator {
        C0465a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3059a createFromParcel(Parcel parcel) {
            return new C3059a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3059a[] newArray(int i10) {
            return new C3059a[i10];
        }
    }

    public C3059a(int i10, Intent intent) {
        this.f32083a = i10;
        this.f32084b = intent;
    }

    public static String c(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f32084b;
    }

    public int b() {
        return this.f32083a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f32083a) + ", data=" + this.f32084b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32083a);
        parcel.writeInt(this.f32084b == null ? 0 : 1);
        Intent intent = this.f32084b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    C3059a(Parcel parcel) {
        this.f32083a = parcel.readInt();
        this.f32084b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
