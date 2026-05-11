package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import j0.C3476a;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f17930d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f17931e;

    /* renamed from: f, reason: collision with root package name */
    private final int f17932f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17933g;

    /* renamed from: h, reason: collision with root package name */
    private final String f17934h;

    /* renamed from: i, reason: collision with root package name */
    private int f17935i;

    /* renamed from: j, reason: collision with root package name */
    private int f17936j;

    /* renamed from: k, reason: collision with root package name */
    private int f17937k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C3476a(), new C3476a(), new C3476a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f17931e.writeInt(-1);
        } else {
            this.f17931e.writeInt(bArr.length);
            this.f17931e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f17931e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f17931e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f17931e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f17931e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f17935i;
        if (i10 >= 0) {
            int i11 = this.f17930d.get(i10);
            int dataPosition = this.f17931e.dataPosition();
            this.f17931e.setDataPosition(i11);
            this.f17931e.writeInt(dataPosition - i11);
            this.f17931e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f17931e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f17936j;
        if (i10 == this.f17932f) {
            i10 = this.f17933g;
        }
        return new b(parcel, dataPosition, i10, this.f17934h + "  ", this.f17927a, this.f17928b, this.f17929c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f17931e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f17931e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f17931e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f17931e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f17936j < this.f17933g) {
            int i11 = this.f17937k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f17931e.setDataPosition(this.f17936j);
            int readInt = this.f17931e.readInt();
            this.f17937k = this.f17931e.readInt();
            this.f17936j += readInt;
        }
        return this.f17937k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f17931e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f17931e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f17931e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f17935i = i10;
        this.f17930d.put(i10, this.f17931e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f17931e.writeInt(z10 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, C3476a c3476a, C3476a c3476a2, C3476a c3476a3) {
        super(c3476a, c3476a2, c3476a3);
        this.f17930d = new SparseIntArray();
        this.f17935i = -1;
        this.f17937k = -1;
        this.f17931e = parcel;
        this.f17932f = i10;
        this.f17933g = i11;
        this.f17936j = i10;
        this.f17934h = str;
    }
}
