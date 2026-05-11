package t7;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class g6 extends W6.a {
    public static final Parcelable.Creator<g6> CREATOR = new h6();

    /* renamed from: a, reason: collision with root package name */
    private final int f42961a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f42962b;

    /* renamed from: c, reason: collision with root package name */
    private final float f42963c;

    /* renamed from: d, reason: collision with root package name */
    private final float f42964d;

    /* renamed from: e, reason: collision with root package name */
    private final float f42965e;

    /* renamed from: f, reason: collision with root package name */
    private final float f42966f;

    /* renamed from: g, reason: collision with root package name */
    private final float f42967g;

    /* renamed from: h, reason: collision with root package name */
    private final float f42968h;

    /* renamed from: i, reason: collision with root package name */
    private final float f42969i;

    /* renamed from: j, reason: collision with root package name */
    private final List f42970j;

    /* renamed from: k, reason: collision with root package name */
    private final List f42971k;

    public g6(int i10, Rect rect, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        this.f42961a = i10;
        this.f42962b = rect;
        this.f42963c = f10;
        this.f42964d = f11;
        this.f42965e = f12;
        this.f42966f = f13;
        this.f42967g = f14;
        this.f42968h = f15;
        this.f42969i = f16;
        this.f42970j = list;
        this.f42971k = list2;
    }

    public final float F() {
        return this.f42967g;
    }

    public final float I() {
        return this.f42963c;
    }

    public final float Z0() {
        return this.f42965e;
    }

    public final int a1() {
        return this.f42961a;
    }

    public final Rect g1() {
        return this.f42962b;
    }

    public final List i1() {
        return this.f42971k;
    }

    public final float j() {
        return this.f42966f;
    }

    public final List m1() {
        return this.f42970j;
    }

    public final float u() {
        return this.f42964d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f42961a);
        W6.c.s(parcel, 2, this.f42962b, i10, false);
        W6.c.j(parcel, 3, this.f42963c);
        W6.c.j(parcel, 4, this.f42964d);
        W6.c.j(parcel, 5, this.f42965e);
        W6.c.j(parcel, 6, this.f42966f);
        W6.c.j(parcel, 7, this.f42967g);
        W6.c.j(parcel, 8, this.f42968h);
        W6.c.j(parcel, 9, this.f42969i);
        W6.c.y(parcel, 10, this.f42970j, false);
        W6.c.y(parcel, 11, this.f42971k, false);
        W6.c.b(parcel, a10);
    }

    public final float y0() {
        return this.f42968h;
    }
}
