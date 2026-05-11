package J7;

import H7.d;
import H7.i;
import H7.j;
import H7.k;
import H7.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.m;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f4823a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4824b;

    /* renamed from: c, reason: collision with root package name */
    final float f4825c;

    /* renamed from: d, reason: collision with root package name */
    final float f4826d;

    /* renamed from: e, reason: collision with root package name */
    final float f4827e;

    b(Context context, int i10, int i11, int i12, a aVar) {
        a aVar2 = new a();
        this.f4824b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f4828a = i10;
        }
        TypedArray a10 = a(context, aVar.f4828a, i11, i12);
        Resources resources = context.getResources();
        this.f4825c = a10.getDimensionPixelSize(l.f3405G, resources.getDimensionPixelSize(d.f3170G));
        this.f4827e = a10.getDimensionPixelSize(l.f3423I, resources.getDimensionPixelSize(d.f3169F));
        this.f4826d = a10.getDimensionPixelSize(l.f3432J, resources.getDimensionPixelSize(d.f3172I));
        aVar2.f4831d = aVar.f4831d == -2 ? 255 : aVar.f4831d;
        aVar2.f4835h = aVar.f4835h == null ? context.getString(j.f3312i) : aVar.f4835h;
        aVar2.f4836i = aVar.f4836i == 0 ? i.f3303a : aVar.f4836i;
        aVar2.f4837j = aVar.f4837j == 0 ? j.f3314k : aVar.f4837j;
        aVar2.f4839l = Boolean.valueOf(aVar.f4839l == null || aVar.f4839l.booleanValue());
        aVar2.f4833f = aVar.f4833f == -2 ? a10.getInt(l.f3459M, 4) : aVar.f4833f;
        if (aVar.f4832e != -2) {
            aVar2.f4832e = aVar.f4832e;
        } else if (a10.hasValue(l.f3468N)) {
            aVar2.f4832e = a10.getInt(l.f3468N, 0);
        } else {
            aVar2.f4832e = -1;
        }
        aVar2.f4829b = Integer.valueOf(aVar.f4829b == null ? t(context, a10, l.f3387E) : aVar.f4829b.intValue());
        if (aVar.f4830c != null) {
            aVar2.f4830c = aVar.f4830c;
        } else if (a10.hasValue(l.f3414H)) {
            aVar2.f4830c = Integer.valueOf(t(context, a10, l.f3414H));
        } else {
            aVar2.f4830c = Integer.valueOf(new V7.d(context, k.f3328d).i().getDefaultColor());
        }
        aVar2.f4838k = Integer.valueOf(aVar.f4838k == null ? a10.getInt(l.f3396F, 8388661) : aVar.f4838k.intValue());
        aVar2.f4840m = Integer.valueOf(aVar.f4840m == null ? a10.getDimensionPixelOffset(l.f3441K, 0) : aVar.f4840m.intValue());
        aVar2.f4841n = Integer.valueOf(aVar.f4840m == null ? a10.getDimensionPixelOffset(l.f3477O, 0) : aVar.f4841n.intValue());
        aVar2.f4842o = Integer.valueOf(aVar.f4842o == null ? a10.getDimensionPixelOffset(l.f3450L, aVar2.f4840m.intValue()) : aVar.f4842o.intValue());
        aVar2.f4843p = Integer.valueOf(aVar.f4843p == null ? a10.getDimensionPixelOffset(l.f3486P, aVar2.f4841n.intValue()) : aVar.f4843p.intValue());
        aVar2.f4844q = Integer.valueOf(aVar.f4844q == null ? 0 : aVar.f4844q.intValue());
        aVar2.f4845r = Integer.valueOf(aVar.f4845r != null ? aVar.f4845r.intValue() : 0);
        a10.recycle();
        if (aVar.f4834g == null) {
            aVar2.f4834g = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f4834g = aVar.f4834g;
        }
        this.f4823a = aVar;
    }

    private TypedArray a(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSet;
        int i13;
        if (i10 != 0) {
            AttributeSet a10 = O7.a.a(context, i10, "badge");
            i13 = a10.getStyleAttribute();
            attributeSet = a10;
        } else {
            attributeSet = null;
            i13 = 0;
        }
        return m.h(context, attributeSet, l.f3378D, i11, i13 == 0 ? i12 : i13, new int[0]);
    }

    private static int t(Context context, TypedArray typedArray, int i10) {
        return V7.c.a(context, typedArray, i10).getDefaultColor();
    }

    int b() {
        return this.f4824b.f4844q.intValue();
    }

    int c() {
        return this.f4824b.f4845r.intValue();
    }

    int d() {
        return this.f4824b.f4831d;
    }

    int e() {
        return this.f4824b.f4829b.intValue();
    }

    int f() {
        return this.f4824b.f4838k.intValue();
    }

    int g() {
        return this.f4824b.f4830c.intValue();
    }

    int h() {
        return this.f4824b.f4837j;
    }

    CharSequence i() {
        return this.f4824b.f4835h;
    }

    int j() {
        return this.f4824b.f4836i;
    }

    int k() {
        return this.f4824b.f4842o.intValue();
    }

    int l() {
        return this.f4824b.f4840m.intValue();
    }

    int m() {
        return this.f4824b.f4833f;
    }

    int n() {
        return this.f4824b.f4832e;
    }

    Locale o() {
        return this.f4824b.f4834g;
    }

    int p() {
        return this.f4824b.f4843p.intValue();
    }

    int q() {
        return this.f4824b.f4841n.intValue();
    }

    boolean r() {
        return this.f4824b.f4832e != -1;
    }

    boolean s() {
        return this.f4824b.f4839l.booleanValue();
    }

    void u(int i10) {
        this.f4823a.f4831d = i10;
        this.f4824b.f4831d = i10;
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0096a();

        /* renamed from: a, reason: collision with root package name */
        private int f4828a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f4829b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4830c;

        /* renamed from: d, reason: collision with root package name */
        private int f4831d;

        /* renamed from: e, reason: collision with root package name */
        private int f4832e;

        /* renamed from: f, reason: collision with root package name */
        private int f4833f;

        /* renamed from: g, reason: collision with root package name */
        private Locale f4834g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f4835h;

        /* renamed from: i, reason: collision with root package name */
        private int f4836i;

        /* renamed from: j, reason: collision with root package name */
        private int f4837j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f4838k;

        /* renamed from: l, reason: collision with root package name */
        private Boolean f4839l;

        /* renamed from: m, reason: collision with root package name */
        private Integer f4840m;

        /* renamed from: n, reason: collision with root package name */
        private Integer f4841n;

        /* renamed from: o, reason: collision with root package name */
        private Integer f4842o;

        /* renamed from: p, reason: collision with root package name */
        private Integer f4843p;

        /* renamed from: q, reason: collision with root package name */
        private Integer f4844q;

        /* renamed from: r, reason: collision with root package name */
        private Integer f4845r;

        /* renamed from: J7.b$a$a, reason: collision with other inner class name */
        class C0096a implements Parcelable.Creator {
            C0096a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f4831d = 255;
            this.f4832e = -2;
            this.f4833f = -2;
            this.f4839l = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4828a);
            parcel.writeSerializable(this.f4829b);
            parcel.writeSerializable(this.f4830c);
            parcel.writeInt(this.f4831d);
            parcel.writeInt(this.f4832e);
            parcel.writeInt(this.f4833f);
            CharSequence charSequence = this.f4835h;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f4836i);
            parcel.writeSerializable(this.f4838k);
            parcel.writeSerializable(this.f4840m);
            parcel.writeSerializable(this.f4841n);
            parcel.writeSerializable(this.f4842o);
            parcel.writeSerializable(this.f4843p);
            parcel.writeSerializable(this.f4844q);
            parcel.writeSerializable(this.f4845r);
            parcel.writeSerializable(this.f4839l);
            parcel.writeSerializable(this.f4834g);
        }

        a(Parcel parcel) {
            this.f4831d = 255;
            this.f4832e = -2;
            this.f4833f = -2;
            this.f4839l = Boolean.TRUE;
            this.f4828a = parcel.readInt();
            this.f4829b = (Integer) parcel.readSerializable();
            this.f4830c = (Integer) parcel.readSerializable();
            this.f4831d = parcel.readInt();
            this.f4832e = parcel.readInt();
            this.f4833f = parcel.readInt();
            this.f4835h = parcel.readString();
            this.f4836i = parcel.readInt();
            this.f4838k = (Integer) parcel.readSerializable();
            this.f4840m = (Integer) parcel.readSerializable();
            this.f4841n = (Integer) parcel.readSerializable();
            this.f4842o = (Integer) parcel.readSerializable();
            this.f4843p = (Integer) parcel.readSerializable();
            this.f4844q = (Integer) parcel.readSerializable();
            this.f4845r = (Integer) parcel.readSerializable();
            this.f4839l = (Boolean) parcel.readSerializable();
            this.f4834g = (Locale) parcel.readSerializable();
        }
    }
}
