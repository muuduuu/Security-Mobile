package F2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.canhub.cropper.CropImageView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class l implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    public int f2298A;

    /* renamed from: A0, reason: collision with root package name */
    public List f2299A0;

    /* renamed from: B, reason: collision with root package name */
    public int f2300B;

    /* renamed from: B0, reason: collision with root package name */
    public float f2301B0;

    /* renamed from: C, reason: collision with root package name */
    public float f2302C;

    /* renamed from: C0, reason: collision with root package name */
    public int f2303C0;

    /* renamed from: D, reason: collision with root package name */
    public int f2304D;

    /* renamed from: D0, reason: collision with root package name */
    public String f2305D0;

    /* renamed from: E, reason: collision with root package name */
    public int f2306E;

    /* renamed from: F, reason: collision with root package name */
    public int f2307F;

    /* renamed from: G, reason: collision with root package name */
    public int f2308G;

    /* renamed from: H, reason: collision with root package name */
    public int f2309H;

    /* renamed from: I, reason: collision with root package name */
    public int f2310I;

    /* renamed from: J, reason: collision with root package name */
    public int f2311J;

    /* renamed from: K, reason: collision with root package name */
    public int f2312K;

    /* renamed from: X, reason: collision with root package name */
    public CharSequence f2313X;

    /* renamed from: Y, reason: collision with root package name */
    public int f2314Y;

    /* renamed from: Z, reason: collision with root package name */
    public Uri f2315Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2316a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2317b;

    /* renamed from: c, reason: collision with root package name */
    public CropImageView.d f2318c;

    /* renamed from: d, reason: collision with root package name */
    public CropImageView.b f2319d;

    /* renamed from: e, reason: collision with root package name */
    public float f2320e;

    /* renamed from: f, reason: collision with root package name */
    public float f2321f;

    /* renamed from: g, reason: collision with root package name */
    public float f2322g;

    /* renamed from: h, reason: collision with root package name */
    public CropImageView.e f2323h;

    /* renamed from: h0, reason: collision with root package name */
    public Bitmap.CompressFormat f2324h0;

    /* renamed from: i, reason: collision with root package name */
    public CropImageView.l f2325i;

    /* renamed from: i0, reason: collision with root package name */
    public int f2326i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2327j;

    /* renamed from: j0, reason: collision with root package name */
    public int f2328j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2329k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2330k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2331l;

    /* renamed from: l0, reason: collision with root package name */
    public CropImageView.k f2332l0;

    /* renamed from: m, reason: collision with root package name */
    public int f2333m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f2334m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2335n;

    /* renamed from: n0, reason: collision with root package name */
    public Rect f2336n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2337o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2338o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2339p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f2340p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2341q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f2342q0;

    /* renamed from: r, reason: collision with root package name */
    public float f2343r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f2344r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2345s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2346s0;

    /* renamed from: t, reason: collision with root package name */
    public int f2347t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f2348t0;

    /* renamed from: u, reason: collision with root package name */
    public int f2349u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2350u0;

    /* renamed from: v, reason: collision with root package name */
    public float f2351v;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f2352v0;

    /* renamed from: w, reason: collision with root package name */
    public int f2353w;

    /* renamed from: w0, reason: collision with root package name */
    public int f2354w0;

    /* renamed from: x, reason: collision with root package name */
    public float f2355x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2356x0;

    /* renamed from: y, reason: collision with root package name */
    public float f2357y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f2358y0;

    /* renamed from: z, reason: collision with root package name */
    public float f2359z;

    /* renamed from: z0, reason: collision with root package name */
    public String f2360z0;

    /* renamed from: E0, reason: collision with root package name */
    public static final b f2297E0 = new b(null);
    public static final Parcelable.Creator<l> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public l() {
        int i10;
        this.f2305D0 = BuildConfig.FLAVOR;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f2317b = true;
        this.f2316a = true;
        this.f2318c = CropImageView.d.RECTANGLE;
        this.f2319d = CropImageView.b.RECTANGLE;
        this.f2300B = -1;
        this.f2320e = TypedValue.applyDimension(1, 10.0f, displayMetrics);
        this.f2321f = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f2322g = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f2323h = CropImageView.e.ON_TOUCH;
        this.f2325i = CropImageView.l.FIT_CENTER;
        this.f2327j = true;
        this.f2331l = true;
        i10 = m.f2361a;
        this.f2333m = i10;
        this.f2335n = true;
        this.f2337o = false;
        this.f2339p = true;
        this.f2341q = 4;
        this.f2343r = 0.1f;
        this.f2345s = false;
        this.f2347t = 1;
        this.f2349u = 1;
        this.f2351v = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f2353w = Color.argb(170, 255, 255, 255);
        this.f2355x = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f2357y = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f2359z = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f2298A = -1;
        this.f2302C = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f2304D = Color.argb(170, 255, 255, 255);
        this.f2306E = Color.argb(119, 0, 0, 0);
        this.f2307F = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f2308G = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f2309H = 40;
        this.f2310I = 40;
        this.f2311J = 99999;
        this.f2312K = 99999;
        this.f2313X = BuildConfig.FLAVOR;
        this.f2314Y = 0;
        this.f2315Z = null;
        this.f2324h0 = Bitmap.CompressFormat.JPEG;
        this.f2326i0 = 90;
        this.f2328j0 = 0;
        this.f2330k0 = 0;
        this.f2332l0 = CropImageView.k.NONE;
        this.f2334m0 = false;
        this.f2336n0 = null;
        this.f2338o0 = -1;
        this.f2340p0 = true;
        this.f2342q0 = true;
        this.f2344r0 = false;
        this.f2346s0 = 90;
        this.f2348t0 = false;
        this.f2350u0 = false;
        this.f2352v0 = null;
        this.f2354w0 = 0;
        this.f2356x0 = false;
        this.f2358y0 = false;
        this.f2360z0 = null;
        this.f2299A0 = CollectionsKt.j();
        this.f2301B0 = TypedValue.applyDimension(2, 20.0f, displayMetrics);
        this.f2303C0 = -1;
        this.f2329k = false;
    }

    public final void a() {
        if (this.f2341q < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (this.f2322g < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        float f10 = this.f2343r;
        if (f10 < 0.0f || f10 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (this.f2347t <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f2349u <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f2351v < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (this.f2355x < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (this.f2302C < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (this.f2308G < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        int i10 = this.f2309H;
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        int i11 = this.f2310I;
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (this.f2311J < i10) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (this.f2312K < i11) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (this.f2328j0 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (this.f2330k0 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        int i12 = this.f2346s0;
        if (i12 < 0 || i12 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByte(this.f2317b ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f2316a ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f2318c.ordinal());
        dest.writeInt(this.f2319d.ordinal());
        dest.writeFloat(this.f2320e);
        dest.writeFloat(this.f2321f);
        dest.writeFloat(this.f2322g);
        dest.writeInt(this.f2323h.ordinal());
        dest.writeInt(this.f2325i.ordinal());
        dest.writeByte(this.f2327j ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f2331l ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f2333m);
        dest.writeByte(this.f2335n ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f2337o ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f2339p ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f2341q);
        dest.writeFloat(this.f2343r);
        dest.writeByte(this.f2345s ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f2347t);
        dest.writeInt(this.f2349u);
        dest.writeFloat(this.f2351v);
        dest.writeInt(this.f2353w);
        dest.writeFloat(this.f2355x);
        dest.writeFloat(this.f2357y);
        dest.writeFloat(this.f2359z);
        dest.writeInt(this.f2298A);
        dest.writeInt(this.f2300B);
        dest.writeFloat(this.f2302C);
        dest.writeInt(this.f2304D);
        dest.writeInt(this.f2306E);
        dest.writeInt(this.f2307F);
        dest.writeInt(this.f2308G);
        dest.writeInt(this.f2309H);
        dest.writeInt(this.f2310I);
        dest.writeInt(this.f2311J);
        dest.writeInt(this.f2312K);
        TextUtils.writeToParcel(this.f2313X, dest, i10);
        dest.writeInt(this.f2314Y);
        dest.writeParcelable(this.f2315Z, i10);
        dest.writeString(this.f2324h0.name());
        dest.writeInt(this.f2326i0);
        dest.writeInt(this.f2328j0);
        dest.writeInt(this.f2330k0);
        dest.writeInt(this.f2332l0.ordinal());
        dest.writeInt(this.f2334m0 ? 1 : 0);
        dest.writeParcelable(this.f2336n0, i10);
        dest.writeInt(this.f2338o0);
        dest.writeByte(this.f2340p0 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f2342q0 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f2344r0 ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f2346s0);
        dest.writeByte(this.f2348t0 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f2350u0 ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.f2352v0, dest, i10);
        dest.writeInt(this.f2354w0);
        dest.writeByte(this.f2356x0 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f2358y0 ? (byte) 1 : (byte) 0);
        dest.writeString(this.f2360z0);
        dest.writeStringList(this.f2299A0);
        dest.writeFloat(this.f2301B0);
        dest.writeInt(this.f2303C0);
        dest.writeString(this.f2305D0);
        dest.writeByte(this.f2329k ? (byte) 1 : (byte) 0);
    }

    protected l(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f2305D0 = BuildConfig.FLAVOR;
        this.f2317b = parcel.readByte() != 0;
        this.f2316a = parcel.readByte() != 0;
        this.f2318c = CropImageView.d.values()[parcel.readInt()];
        this.f2319d = CropImageView.b.values()[parcel.readInt()];
        this.f2320e = parcel.readFloat();
        this.f2321f = parcel.readFloat();
        this.f2322g = parcel.readFloat();
        this.f2323h = CropImageView.e.values()[parcel.readInt()];
        this.f2325i = CropImageView.l.values()[parcel.readInt()];
        this.f2327j = parcel.readByte() != 0;
        this.f2331l = parcel.readByte() != 0;
        this.f2333m = parcel.readInt();
        this.f2335n = parcel.readByte() != 0;
        this.f2337o = parcel.readByte() != 0;
        this.f2339p = parcel.readByte() != 0;
        this.f2341q = parcel.readInt();
        this.f2343r = parcel.readFloat();
        this.f2345s = parcel.readByte() != 0;
        this.f2347t = parcel.readInt();
        this.f2349u = parcel.readInt();
        this.f2351v = parcel.readFloat();
        this.f2353w = parcel.readInt();
        this.f2355x = parcel.readFloat();
        this.f2357y = parcel.readFloat();
        this.f2359z = parcel.readFloat();
        this.f2298A = parcel.readInt();
        this.f2300B = parcel.readInt();
        this.f2302C = parcel.readFloat();
        this.f2304D = parcel.readInt();
        this.f2306E = parcel.readInt();
        this.f2307F = parcel.readInt();
        this.f2308G = parcel.readInt();
        this.f2309H = parcel.readInt();
        this.f2310I = parcel.readInt();
        this.f2311J = parcel.readInt();
        this.f2312K = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        Object createFromParcel = creator.createFromParcel(parcel);
        Intrinsics.checkNotNullExpressionValue(createFromParcel, "CHAR_SEQUENCE_CREATOR.createFromParcel(parcel)");
        this.f2313X = (CharSequence) createFromParcel;
        this.f2314Y = parcel.readInt();
        this.f2315Z = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        String readString = parcel.readString();
        Intrinsics.d(readString);
        this.f2324h0 = Bitmap.CompressFormat.valueOf(readString);
        this.f2326i0 = parcel.readInt();
        this.f2328j0 = parcel.readInt();
        this.f2330k0 = parcel.readInt();
        this.f2332l0 = CropImageView.k.values()[parcel.readInt()];
        this.f2334m0 = parcel.readByte() != 0;
        this.f2336n0 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f2338o0 = parcel.readInt();
        this.f2340p0 = parcel.readByte() != 0;
        this.f2342q0 = parcel.readByte() != 0;
        this.f2344r0 = parcel.readByte() != 0;
        this.f2346s0 = parcel.readInt();
        this.f2348t0 = parcel.readByte() != 0;
        this.f2350u0 = parcel.readByte() != 0;
        this.f2352v0 = (CharSequence) creator.createFromParcel(parcel);
        this.f2354w0 = parcel.readInt();
        this.f2356x0 = parcel.readByte() != 0;
        this.f2358y0 = parcel.readByte() != 0;
        this.f2360z0 = parcel.readString();
        this.f2299A0 = parcel.createStringArrayList();
        this.f2301B0 = parcel.readFloat();
        this.f2303C0 = parcel.readInt();
        String readString2 = parcel.readString();
        Intrinsics.d(readString2);
        this.f2305D0 = readString2;
        this.f2329k = parcel.readByte() != 0;
    }
}
