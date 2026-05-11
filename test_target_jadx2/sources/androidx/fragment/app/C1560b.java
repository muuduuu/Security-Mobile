package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.P;
import androidx.lifecycle.AbstractC1592i;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1560b implements Parcelable {
    public static final Parcelable.Creator<C1560b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f16892a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f16893b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f16894c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f16895d;

    /* renamed from: e, reason: collision with root package name */
    final int f16896e;

    /* renamed from: f, reason: collision with root package name */
    final String f16897f;

    /* renamed from: g, reason: collision with root package name */
    final int f16898g;

    /* renamed from: h, reason: collision with root package name */
    final int f16899h;

    /* renamed from: i, reason: collision with root package name */
    final CharSequence f16900i;

    /* renamed from: j, reason: collision with root package name */
    final int f16901j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f16902k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f16903l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList f16904m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f16905n;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1560b createFromParcel(Parcel parcel) {
            return new C1560b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1560b[] newArray(int i10) {
            return new C1560b[i10];
        }
    }

    C1560b(C1559a c1559a) {
        int size = c1559a.f16805c.size();
        this.f16892a = new int[size * 6];
        if (!c1559a.f16811i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f16893b = new ArrayList(size);
        this.f16894c = new int[size];
        this.f16895d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            P.a aVar = (P.a) c1559a.f16805c.get(i11);
            int i12 = i10 + 1;
            this.f16892a[i10] = aVar.f16822a;
            ArrayList arrayList = this.f16893b;
            ComponentCallbacksC1573o componentCallbacksC1573o = aVar.f16823b;
            arrayList.add(componentCallbacksC1573o != null ? componentCallbacksC1573o.mWho : null);
            int[] iArr = this.f16892a;
            iArr[i12] = aVar.f16824c ? 1 : 0;
            iArr[i10 + 2] = aVar.f16825d;
            iArr[i10 + 3] = aVar.f16826e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f16827f;
            i10 += 6;
            iArr[i13] = aVar.f16828g;
            this.f16894c[i11] = aVar.f16829h.ordinal();
            this.f16895d[i11] = aVar.f16830i.ordinal();
        }
        this.f16896e = c1559a.f16810h;
        this.f16897f = c1559a.f16813k;
        this.f16898g = c1559a.f16889v;
        this.f16899h = c1559a.f16814l;
        this.f16900i = c1559a.f16815m;
        this.f16901j = c1559a.f16816n;
        this.f16902k = c1559a.f16817o;
        this.f16903l = c1559a.f16818p;
        this.f16904m = c1559a.f16819q;
        this.f16905n = c1559a.f16820r;
    }

    private void a(C1559a c1559a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f16892a.length) {
                c1559a.f16810h = this.f16896e;
                c1559a.f16813k = this.f16897f;
                c1559a.f16811i = true;
                c1559a.f16814l = this.f16899h;
                c1559a.f16815m = this.f16900i;
                c1559a.f16816n = this.f16901j;
                c1559a.f16817o = this.f16902k;
                c1559a.f16818p = this.f16903l;
                c1559a.f16819q = this.f16904m;
                c1559a.f16820r = this.f16905n;
                return;
            }
            P.a aVar = new P.a();
            int i12 = i10 + 1;
            aVar.f16822a = this.f16892a[i10];
            if (G.J0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1559a + " op #" + i11 + " base fragment #" + this.f16892a[i12]);
            }
            aVar.f16829h = AbstractC1592i.b.values()[this.f16894c[i11]];
            aVar.f16830i = AbstractC1592i.b.values()[this.f16895d[i11]];
            int[] iArr = this.f16892a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f16824c = z10;
            int i14 = iArr[i13];
            aVar.f16825d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f16826e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f16827f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f16828g = i18;
            c1559a.f16806d = i14;
            c1559a.f16807e = i15;
            c1559a.f16808f = i17;
            c1559a.f16809g = i18;
            c1559a.f(aVar);
            i11++;
        }
    }

    public C1559a b(G g10) {
        C1559a c1559a = new C1559a(g10);
        a(c1559a);
        c1559a.f16889v = this.f16898g;
        for (int i10 = 0; i10 < this.f16893b.size(); i10++) {
            String str = (String) this.f16893b.get(i10);
            if (str != null) {
                ((P.a) c1559a.f16805c.get(i10)).f16823b = g10.e0(str);
            }
        }
        c1559a.u(1);
        return c1559a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f16892a);
        parcel.writeStringList(this.f16893b);
        parcel.writeIntArray(this.f16894c);
        parcel.writeIntArray(this.f16895d);
        parcel.writeInt(this.f16896e);
        parcel.writeString(this.f16897f);
        parcel.writeInt(this.f16898g);
        parcel.writeInt(this.f16899h);
        TextUtils.writeToParcel(this.f16900i, parcel, 0);
        parcel.writeInt(this.f16901j);
        TextUtils.writeToParcel(this.f16902k, parcel, 0);
        parcel.writeStringList(this.f16903l);
        parcel.writeStringList(this.f16904m);
        parcel.writeInt(this.f16905n ? 1 : 0);
    }

    C1560b(Parcel parcel) {
        this.f16892a = parcel.createIntArray();
        this.f16893b = parcel.createStringArrayList();
        this.f16894c = parcel.createIntArray();
        this.f16895d = parcel.createIntArray();
        this.f16896e = parcel.readInt();
        this.f16897f = parcel.readString();
        this.f16898g = parcel.readInt();
        this.f16899h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f16900i = (CharSequence) creator.createFromParcel(parcel);
        this.f16901j = parcel.readInt();
        this.f16902k = (CharSequence) creator.createFromParcel(parcel);
        this.f16903l = parcel.createStringArrayList();
        this.f16904m = parcel.createStringArrayList();
        this.f16905n = parcel.readInt() != 0;
    }
}
