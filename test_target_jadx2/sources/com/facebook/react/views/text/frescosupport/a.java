package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.Locale;
import n5.AbstractC3708a;
import o5.o;
import v3.AbstractC4922b;

/* loaded from: classes2.dex */
class a extends AbstractC3708a {

    /* renamed from: A, reason: collision with root package name */
    private Uri f22787A;

    /* renamed from: B, reason: collision with root package name */
    private ReadableMap f22788B;

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC4922b f22789C;

    /* renamed from: D, reason: collision with root package name */
    private final Object f22790D;

    /* renamed from: F, reason: collision with root package name */
    private String f22792F;

    /* renamed from: E, reason: collision with root package name */
    private float f22791E = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    private float f22793G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    private int f22794H = 0;

    public a(AbstractC4922b abstractC4922b, Object obj) {
        this.f22789C = abstractC4922b;
        this.f22790D = obj;
    }

    private static Uri A1(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    public Uri B1() {
        return this.f22787A;
    }

    @Z4.a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f22788B = readableMap;
    }

    @Override // com.facebook.react.uimanager.V
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f22793G = (float) dynamic.asDouble();
        } else {
            AbstractC1721a.J("ReactNative", "Inline images must not have percentage based height");
            this.f22793G = Float.NaN;
        }
    }

    @Z4.a(name = "resizeMode")
    public void setResizeMode(String str) {
        this.f22792F = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
    
        if (r1.getScheme() == null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Z4.a(name = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSource(ReadableArray readableArray) {
        Uri parse;
        Uri uri = null;
        String string = (readableArray == null || readableArray.size() == 0) ? null : readableArray.getMap(0).getString("uri");
        if (string != null) {
            try {
                parse = Uri.parse(string);
            } catch (Exception unused) {
            }
        }
        if (uri != this.f22787A) {
            y0();
        }
        this.f22787A = uri;
        uri = parse;
        if (uri == null) {
            uri = A1(H(), string);
        }
        if (uri != this.f22787A) {
        }
        this.f22787A = uri;
        if (uri == null) {
        }
        if (uri != this.f22787A) {
        }
        this.f22787A = uri;
    }

    @Z4.a(customType = "Color", name = "tintColor")
    public void setTintColor(int i10) {
        this.f22794H = i10;
    }

    @Override // com.facebook.react.uimanager.V
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f22791E = (float) dynamic.asDouble();
        } else {
            AbstractC1721a.J("ReactNative", "Inline images must not have percentage based width");
            this.f22791E = Float.NaN;
        }
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public boolean u() {
        return true;
    }

    @Override // n5.AbstractC3708a
    public o w1() {
        return new b(H().getResources(), (int) Math.ceil(this.f22793G), (int) Math.ceil(this.f22791E), this.f22794H, B1(), z1(), y1(), x1(), this.f22792F);
    }

    public Object x1() {
        return this.f22790D;
    }

    public AbstractC4922b y1() {
        return this.f22789C;
    }

    public ReadableMap z1() {
        return this.f22788B;
    }
}
