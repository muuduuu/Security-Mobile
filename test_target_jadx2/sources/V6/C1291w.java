package V6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: V6.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1291w extends W6.a {
    public static final Parcelable.Creator<C1291w> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    private final int f11026a;

    /* renamed from: b, reason: collision with root package name */
    private List f11027b;

    public C1291w(int i10, List list) {
        this.f11026a = i10;
        this.f11027b = list;
    }

    public final void F(C1285p c1285p) {
        if (this.f11027b == null) {
            this.f11027b = new ArrayList();
        }
        this.f11027b.add(c1285p);
    }

    public final int j() {
        return this.f11026a;
    }

    public final List u() {
        return this.f11027b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.m(parcel, 1, this.f11026a);
        W6.c.y(parcel, 2, this.f11027b, false);
        W6.c.b(parcel, a10);
    }
}
