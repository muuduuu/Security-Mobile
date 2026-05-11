package a7;

import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2012d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1361a extends W6.a {
    public static final Parcelable.Creator<C1361a> CREATOR = new C1364d();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f12630e = new Comparator() { // from class: a7.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C2012d c2012d = (C2012d) obj;
            C2012d c2012d2 = (C2012d) obj2;
            Parcelable.Creator<C1361a> creator = C1361a.CREATOR;
            return !c2012d.u().equals(c2012d2.u()) ? c2012d.u().compareTo(c2012d2.u()) : (c2012d.F() > c2012d2.F() ? 1 : (c2012d.F() == c2012d2.F() ? 0 : -1));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List f12631a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12632b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12633c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12634d;

    public C1361a(List list, boolean z10, String str, String str2) {
        AbstractC1287s.m(list);
        this.f12631a = list;
        this.f12632b = z10;
        this.f12633c = str;
        this.f12634d = str2;
    }

    static C1361a F(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f12630e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((S6.i) it.next()).a());
        }
        return new C1361a(new ArrayList(treeSet), z10, null, null);
    }

    public static C1361a j(Z6.f fVar) {
        return F(fVar.a(), true);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1361a)) {
            return false;
        }
        C1361a c1361a = (C1361a) obj;
        return this.f12632b == c1361a.f12632b && AbstractC1286q.a(this.f12631a, c1361a.f12631a) && AbstractC1286q.a(this.f12633c, c1361a.f12633c) && AbstractC1286q.a(this.f12634d, c1361a.f12634d);
    }

    public final int hashCode() {
        return AbstractC1286q.b(Boolean.valueOf(this.f12632b), this.f12631a, this.f12633c, this.f12634d);
    }

    public List u() {
        return this.f12631a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = W6.c.a(parcel);
        W6.c.y(parcel, 1, u(), false);
        W6.c.c(parcel, 2, this.f12632b);
        W6.c.u(parcel, 3, this.f12633c, false);
        W6.c.u(parcel, 4, this.f12634d, false);
        W6.c.b(parcel, a10);
    }
}
