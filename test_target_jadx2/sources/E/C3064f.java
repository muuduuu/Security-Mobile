package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3064f implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final IntentSender f32108a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f32109b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32110c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32111d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f32107e = new c(null);
    public static final Parcelable.Creator<C3064f> CREATOR = new b();

    /* renamed from: e.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final IntentSender f32112a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f32113b;

        /* renamed from: c, reason: collision with root package name */
        private int f32114c;

        /* renamed from: d, reason: collision with root package name */
        private int f32115d;

        public a(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f32112a = intentSender;
        }

        public final C3064f a() {
            return new C3064f(this.f32112a, this.f32113b, this.f32114c, this.f32115d);
        }

        public final a b(Intent intent) {
            this.f32113b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f32115d = i10;
            this.f32114c = i11;
            return this;
        }
    }

    /* renamed from: e.f$b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3064f createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new C3064f(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3064f[] newArray(int i10) {
            return new C3064f[i10];
        }
    }

    /* renamed from: e.f$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public C3064f(IntentSender intentSender, Intent intent, int i10, int i11) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f32108a = intentSender;
        this.f32109b = intent;
        this.f32110c = i10;
        this.f32111d = i11;
    }

    public final Intent a() {
        return this.f32109b;
    }

    public final int b() {
        return this.f32110c;
    }

    public final int c() {
        return this.f32111d;
    }

    public final IntentSender d() {
        return this.f32108a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f32108a, i10);
        dest.writeParcelable(this.f32109b, i10);
        dest.writeInt(this.f32110c);
        dest.writeInt(this.f32111d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3064f(Parcel parcel) {
        this((IntentSender) r0, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.d(readParcelable);
    }
}
