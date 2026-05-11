package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1592i;

/* loaded from: classes.dex */
final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final String f16770a;

    /* renamed from: b, reason: collision with root package name */
    final String f16771b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f16772c;

    /* renamed from: d, reason: collision with root package name */
    final int f16773d;

    /* renamed from: e, reason: collision with root package name */
    final int f16774e;

    /* renamed from: f, reason: collision with root package name */
    final String f16775f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f16776g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f16777h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f16778i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f16779j;

    /* renamed from: k, reason: collision with root package name */
    final int f16780k;

    /* renamed from: l, reason: collision with root package name */
    final String f16781l;

    /* renamed from: m, reason: collision with root package name */
    final int f16782m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f16783n;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L createFromParcel(Parcel parcel) {
            return new L(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public L[] newArray(int i10) {
            return new L[i10];
        }
    }

    L(ComponentCallbacksC1573o componentCallbacksC1573o) {
        this.f16770a = componentCallbacksC1573o.getClass().getName();
        this.f16771b = componentCallbacksC1573o.mWho;
        this.f16772c = componentCallbacksC1573o.mFromLayout;
        this.f16773d = componentCallbacksC1573o.mFragmentId;
        this.f16774e = componentCallbacksC1573o.mContainerId;
        this.f16775f = componentCallbacksC1573o.mTag;
        this.f16776g = componentCallbacksC1573o.mRetainInstance;
        this.f16777h = componentCallbacksC1573o.mRemoving;
        this.f16778i = componentCallbacksC1573o.mDetached;
        this.f16779j = componentCallbacksC1573o.mHidden;
        this.f16780k = componentCallbacksC1573o.mMaxState.ordinal();
        this.f16781l = componentCallbacksC1573o.mTargetWho;
        this.f16782m = componentCallbacksC1573o.mTargetRequestCode;
        this.f16783n = componentCallbacksC1573o.mUserVisibleHint;
    }

    ComponentCallbacksC1573o a(AbstractC1581x abstractC1581x, ClassLoader classLoader) {
        ComponentCallbacksC1573o a10 = abstractC1581x.a(classLoader, this.f16770a);
        a10.mWho = this.f16771b;
        a10.mFromLayout = this.f16772c;
        a10.mRestored = true;
        a10.mFragmentId = this.f16773d;
        a10.mContainerId = this.f16774e;
        a10.mTag = this.f16775f;
        a10.mRetainInstance = this.f16776g;
        a10.mRemoving = this.f16777h;
        a10.mDetached = this.f16778i;
        a10.mHidden = this.f16779j;
        a10.mMaxState = AbstractC1592i.b.values()[this.f16780k];
        a10.mTargetWho = this.f16781l;
        a10.mTargetRequestCode = this.f16782m;
        a10.mUserVisibleHint = this.f16783n;
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f16770a);
        sb2.append(" (");
        sb2.append(this.f16771b);
        sb2.append(")}:");
        if (this.f16772c) {
            sb2.append(" fromLayout");
        }
        if (this.f16774e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f16774e));
        }
        String str = this.f16775f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f16775f);
        }
        if (this.f16776g) {
            sb2.append(" retainInstance");
        }
        if (this.f16777h) {
            sb2.append(" removing");
        }
        if (this.f16778i) {
            sb2.append(" detached");
        }
        if (this.f16779j) {
            sb2.append(" hidden");
        }
        if (this.f16781l != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f16781l);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f16782m);
        }
        if (this.f16783n) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16770a);
        parcel.writeString(this.f16771b);
        parcel.writeInt(this.f16772c ? 1 : 0);
        parcel.writeInt(this.f16773d);
        parcel.writeInt(this.f16774e);
        parcel.writeString(this.f16775f);
        parcel.writeInt(this.f16776g ? 1 : 0);
        parcel.writeInt(this.f16777h ? 1 : 0);
        parcel.writeInt(this.f16778i ? 1 : 0);
        parcel.writeInt(this.f16779j ? 1 : 0);
        parcel.writeInt(this.f16780k);
        parcel.writeString(this.f16781l);
        parcel.writeInt(this.f16782m);
        parcel.writeInt(this.f16783n ? 1 : 0);
    }

    L(Parcel parcel) {
        this.f16770a = parcel.readString();
        this.f16771b = parcel.readString();
        this.f16772c = parcel.readInt() != 0;
        this.f16773d = parcel.readInt();
        this.f16774e = parcel.readInt();
        this.f16775f = parcel.readString();
        this.f16776g = parcel.readInt() != 0;
        this.f16777h = parcel.readInt() != 0;
        this.f16778i = parcel.readInt() != 0;
        this.f16779j = parcel.readInt() != 0;
        this.f16780k = parcel.readInt();
        this.f16781l = parcel.readString();
        this.f16782m = parcel.readInt();
        this.f16783n = parcel.readInt() != 0;
    }
}
