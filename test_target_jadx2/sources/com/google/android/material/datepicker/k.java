package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
final class k implements Comparable, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f26991a;

    /* renamed from: b, reason: collision with root package name */
    final int f26992b;

    /* renamed from: c, reason: collision with root package name */
    final int f26993c;

    /* renamed from: d, reason: collision with root package name */
    final int f26994d;

    /* renamed from: e, reason: collision with root package name */
    final int f26995e;

    /* renamed from: f, reason: collision with root package name */
    final long f26996f;

    /* renamed from: g, reason: collision with root package name */
    private String f26997g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return k.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    private k(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d10 = r.d(calendar);
        this.f26991a = d10;
        this.f26992b = d10.get(2);
        this.f26993c = d10.get(1);
        this.f26994d = d10.getMaximum(7);
        this.f26995e = d10.getActualMaximum(5);
        this.f26996f = d10.getTimeInMillis();
    }

    static k c(int i10, int i11) {
        Calendar i12 = r.i();
        i12.set(1, i10);
        i12.set(2, i11);
        return new k(i12);
    }

    static k d(long j10) {
        Calendar i10 = r.i();
        i10.setTimeInMillis(j10);
        return new k(i10);
    }

    static k e() {
        return new k(r.g());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return this.f26991a.compareTo(kVar.f26991a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f26992b == kVar.f26992b && this.f26993c == kVar.f26993c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26992b), Integer.valueOf(this.f26993c)});
    }

    int n() {
        int firstDayOfWeek = this.f26991a.get(7) - this.f26991a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f26994d : firstDayOfWeek;
    }

    long o(int i10) {
        Calendar d10 = r.d(this.f26991a);
        d10.set(5, i10);
        return d10.getTimeInMillis();
    }

    int p(long j10) {
        Calendar d10 = r.d(this.f26991a);
        d10.setTimeInMillis(j10);
        return d10.get(5);
    }

    String q() {
        if (this.f26997g == null) {
            this.f26997g = e.c(this.f26991a.getTimeInMillis());
        }
        return this.f26997g;
    }

    long s() {
        return this.f26991a.getTimeInMillis();
    }

    k u(int i10) {
        Calendar d10 = r.d(this.f26991a);
        d10.add(2, i10);
        return new k(d10);
    }

    int v(k kVar) {
        if (this.f26991a instanceof GregorianCalendar) {
            return ((kVar.f26993c - this.f26993c) * 12) + (kVar.f26992b - this.f26992b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f26993c);
        parcel.writeInt(this.f26992b);
    }
}
