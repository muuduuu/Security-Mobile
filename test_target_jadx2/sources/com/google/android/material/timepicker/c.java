package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f27792a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f27793b;

    /* renamed from: c, reason: collision with root package name */
    final int f27794c;

    /* renamed from: d, reason: collision with root package name */
    int f27795d;

    /* renamed from: e, reason: collision with root package name */
    int f27796e;

    /* renamed from: f, reason: collision with root package name */
    int f27797f;

    /* renamed from: g, reason: collision with root package name */
    int f27798g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f27795d = i10;
        this.f27796e = i11;
        this.f27797f = i12;
        this.f27794c = i13;
        this.f27798g = c(i10);
        this.f27792a = new com.google.android.material.timepicker.a(59);
        this.f27793b = new com.google.android.material.timepicker.a(i13 == 1 ? 24 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f27795d == cVar.f27795d && this.f27796e == cVar.f27796e && this.f27794c == cVar.f27794c && this.f27797f == cVar.f27797f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27794c), Integer.valueOf(this.f27795d), Integer.valueOf(this.f27796e), Integer.valueOf(this.f27797f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27795d);
        parcel.writeInt(this.f27796e);
        parcel.writeInt(this.f27797f);
        parcel.writeInt(this.f27794c);
    }

    protected c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
