package com.facebook.react.uimanager;

import com.appsflyer.attribution.RequestError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f22147e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f22148f = {1, 2, 4, 8, 16, 32, 64, 128, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 512, 1024, 2048};

    /* renamed from: a, reason: collision with root package name */
    private final float f22149a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f22150b;

    /* renamed from: c, reason: collision with root package name */
    private int f22151c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22152d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }

        private a() {
        }
    }

    public D0(float f10, float[] spacing) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.f22149a = f10;
        this.f22150b = spacing;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i10) {
        float f10;
        int i11;
        if (i10 != 4 && i10 != 5) {
            switch (i10) {
                case 9:
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 11:
                    break;
                default:
                    f10 = this.f22149a;
                    break;
            }
            i11 = this.f22151c;
            if (i11 != 0) {
                return f10;
            }
            int[] iArr = f22148f;
            if ((iArr[i10] & i11) != 0) {
                return this.f22150b[i10];
            }
            if (this.f22152d) {
                char c10 = (i10 == 1 || i10 == 3) ? (char) 7 : (char) 6;
                if ((iArr[c10] & i11) != 0) {
                    return this.f22150b[c10];
                }
                if ((i11 & iArr[8]) != 0) {
                    return this.f22150b[8];
                }
            }
            return f10;
        }
        f10 = Float.NaN;
        i11 = this.f22151c;
        if (i11 != 0) {
        }
    }

    public final float b(int i10) {
        return this.f22150b[i10];
    }

    public final boolean c(int i10, float f10) {
        if (M.a(this.f22150b[i10], f10)) {
            return false;
        }
        this.f22150b[i10] = f10;
        int i11 = com.facebook.yoga.g.a(f10) ? (~f22148f[i10]) & this.f22151c : f22148f[i10] | this.f22151c;
        this.f22151c = i11;
        int[] iArr = f22148f;
        this.f22152d = ((iArr[8] & i11) == 0 && (iArr[7] & i11) == 0 && (iArr[6] & i11) == 0 && (i11 & iArr[9]) == 0) ? false : true;
        return true;
    }

    public D0() {
        this(0.0f, f22147e.b());
    }

    public D0(float f10) {
        this(f10, f22147e.b());
    }
}
