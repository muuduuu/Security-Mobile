package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0397a();

    /* renamed from: a, reason: collision with root package name */
    private final k f26896a;

    /* renamed from: b, reason: collision with root package name */
    private final k f26897b;

    /* renamed from: c, reason: collision with root package name */
    private final c f26898c;

    /* renamed from: d, reason: collision with root package name */
    private k f26899d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26900e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26901f;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0397a implements Parcelable.Creator {
        C0397a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((k) parcel.readParcelable(k.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final long f26902e = r.a(k.c(1900, 0).f26996f);

        /* renamed from: f, reason: collision with root package name */
        static final long f26903f = r.a(k.c(2100, 11).f26996f);

        /* renamed from: a, reason: collision with root package name */
        private long f26904a;

        /* renamed from: b, reason: collision with root package name */
        private long f26905b;

        /* renamed from: c, reason: collision with root package name */
        private Long f26906c;

        /* renamed from: d, reason: collision with root package name */
        private c f26907d;

        b(a aVar) {
            this.f26904a = f26902e;
            this.f26905b = f26903f;
            this.f26907d = f.a(Long.MIN_VALUE);
            this.f26904a = aVar.f26896a.f26996f;
            this.f26905b = aVar.f26897b.f26996f;
            this.f26906c = Long.valueOf(aVar.f26899d.f26996f);
            this.f26907d = aVar.f26898c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f26907d);
            k d10 = k.d(this.f26904a);
            k d11 = k.d(this.f26905b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f26906c;
            return new a(d10, d11, cVar, l10 == null ? null : k.d(l10.longValue()), null);
        }

        public b b(long j10) {
            this.f26906c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean r(long j10);
    }

    /* synthetic */ a(k kVar, k kVar2, c cVar, k kVar3, C0397a c0397a) {
        this(kVar, kVar2, cVar, kVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f26898c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26896a.equals(aVar.f26896a) && this.f26897b.equals(aVar.f26897b) && y0.b.a(this.f26899d, aVar.f26899d) && this.f26898c.equals(aVar.f26898c);
    }

    k f() {
        return this.f26897b;
    }

    int g() {
        return this.f26901f;
    }

    k h() {
        return this.f26899d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26896a, this.f26897b, this.f26899d, this.f26898c});
    }

    k i() {
        return this.f26896a;
    }

    int j() {
        return this.f26900e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26896a, 0);
        parcel.writeParcelable(this.f26897b, 0);
        parcel.writeParcelable(this.f26899d, 0);
        parcel.writeParcelable(this.f26898c, 0);
    }

    private a(k kVar, k kVar2, c cVar, k kVar3) {
        this.f26896a = kVar;
        this.f26897b = kVar2;
        this.f26899d = kVar3;
        this.f26898c = cVar;
        if (kVar3 != null && kVar.compareTo(kVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (kVar3 != null && kVar3.compareTo(kVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f26901f = kVar.v(kVar2) + 1;
        this.f26900e = (kVar2.f26993c - kVar.f26993c) + 1;
    }
}
