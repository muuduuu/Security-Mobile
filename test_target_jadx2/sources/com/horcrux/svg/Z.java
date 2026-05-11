package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import java.text.Bidi;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class Z extends m0 {

    /* renamed from: q, reason: collision with root package name */
    private Path f28993q;

    /* renamed from: r, reason: collision with root package name */
    String f28994r;

    /* renamed from: s, reason: collision with root package name */
    private a0 f28995s;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f28996t;

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList f28997u;

    /* renamed from: v, reason: collision with root package name */
    private final AssetManager f28998v;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28999a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f29000b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f29001c;

        static {
            int[] iArr = new int[b0.values().length];
            f29001c = iArr;
            try {
                iArr[b0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29001c[b0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29001c[b0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29001c[b0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29001c[b0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29001c[b0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29001c[b0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29001c[b0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29001c[b0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29001c[b0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29001c[b0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29001c[b0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29001c[b0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29001c[b0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29001c[b0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29001c[b0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[h0.values().length];
            f29000b = iArr2;
            try {
                iArr2[h0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f29000b[h0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[f0.values().length];
            f28999a = iArr3;
            try {
                iArr3[f0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f28999a[f0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f28999a[f0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public Z(ReactContext reactContext) {
        super(reactContext);
        this.f28996t = new ArrayList();
        this.f28997u = new ArrayList();
        this.f28998v = this.mContext.getResources().getAssets();
    }

    private void T(Paint paint, C2919v c2919v) {
        int i10 = Build.VERSION.SDK_INT;
        double d10 = c2919v.f29078n;
        paint.setLetterSpacing((float) (d10 / (c2919v.f29065a * this.mScale)));
        if (d10 == 0.0d && c2919v.f29073i == d0.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + c2919v.f29071g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c2919v.f29071g);
        }
        if (i10 >= 26) {
            paint.setFontVariationSettings("'wght' " + c2919v.f29070f + c2919v.f29072h);
        }
    }

    private void U(Paint paint, C2919v c2919v) {
        int i10 = 0;
        boolean z10 = c2919v.f29069e == e0.Bold || c2919v.f29070f >= 550;
        boolean z11 = c2919v.f29067c == c0.italic;
        if (z10 && z11) {
            i10 = 3;
        } else if (z10) {
            i10 = 1;
        } else if (z11) {
            i10 = 2;
        }
        int i11 = c2919v.f29070f;
        String str = c2919v.f29066b;
        Typeface typeface = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                Y.a();
                Typeface.Builder a10 = X.a(this.f28998v, str2);
                a10.setFontVariationSettings("'wght' " + i11 + c2919v.f29072h);
                a10.setWeight(i11);
                a10.setItalic(z11);
                typeface = a10.build();
                if (typeface == null) {
                    Y.a();
                    Typeface.Builder a11 = X.a(this.f28998v, str3);
                    a11.setFontVariationSettings("'wght' " + i11 + c2919v.f29072h);
                    a11.setWeight(i11);
                    a11.setItalic(z11);
                    typeface = a11.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f28998v, str2), i10);
                    } catch (Exception unused) {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f28998v, str3), i10);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = com.facebook.react.views.text.d.a().c(str, i10, this.f28998v);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i11, z11);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (c2919v.f29065a * this.mScale));
        paint.setLetterSpacing(0.0f);
    }

    private void V(Canvas canvas, Paint paint) {
        C2921x v10 = v();
        x();
        C2919v b10 = v10.b();
        TextPaint textPaint = new TextPaint(paint);
        U(textPaint, b10);
        T(textPaint, b10);
        double c10 = v10.c();
        int i10 = a.f28999a[b10.f29074j.ordinal()];
        StaticLayout Y10 = Y(textPaint, i10 != 2 ? i10 != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, true, new SpannableString(this.f28994r), (int) K.a(this.f29038f, canvas.getWidth(), 0.0d, this.mScale, c10));
        int lineAscent = Y10.getLineAscent(0);
        float l10 = (float) v10.l(0.0d);
        float m10 = (float) (v10.m() + lineAscent);
        w();
        canvas.save();
        canvas.translate(l10, m10);
        Y10.draw(canvas);
        canvas.restore();
    }

    private double W(SVGLength sVGLength, double d10, double d11) {
        return K.a(sVGLength, d10, 0.0d, this.mScale, d11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path X(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        boolean z10;
        double d10;
        boolean[] zArr;
        boolean z11;
        int i10;
        C2922y c2922y;
        Paint paint2;
        double d11;
        double d12;
        C2921x c2921x;
        Path path;
        float[] fArr;
        C2922y c2922y2;
        Paint paint3;
        boolean z12;
        double d13;
        double d14;
        boolean z13;
        int i11;
        SVGLength sVGLength;
        double d15;
        boolean z14;
        double d16;
        String D10;
        b0 C10;
        int i12;
        int i13;
        boolean z15;
        double d17;
        String str2;
        int i14;
        char c10;
        double d18;
        Matrix matrix;
        Z z16;
        int i15;
        float[] fArr2;
        C2921x c2921x2;
        int i16;
        PathMeasure pathMeasure2;
        int i17;
        Path path2;
        C2922y c2922y3;
        float[] fArr3;
        double d19;
        double d20;
        boolean z17;
        Paint paint4;
        int i18;
        float[] fArr4;
        int i19;
        double d21;
        double d22;
        boolean z18;
        C2921x c2921x3;
        double d23;
        boolean z19;
        Path path3;
        Path b10;
        int i20;
        int i21;
        int i22;
        double d24;
        Z z20 = this;
        int length = str.length();
        Path path4 = new Path();
        z20.f28996t.clear();
        z20.f28997u.clear();
        if (length == 0) {
            return path4;
        }
        boolean z21 = z20.f28995s != null;
        if (z21) {
            PathMeasure pathMeasure3 = new PathMeasure(z20.f28995s.W(canvas, paint), false);
            double length2 = pathMeasure3.getLength();
            boolean isClosed = pathMeasure3.isClosed();
            if (length2 == 0.0d) {
                return path4;
            }
            pathMeasure = pathMeasure3;
            d10 = length2;
            z10 = isClosed;
        } else {
            pathMeasure = null;
            z10 = false;
            d10 = 0.0d;
        }
        C2921x v10 = v();
        C2919v b11 = v10.b();
        z20.U(paint, b11);
        C2922y c2922y4 = new C2922y(paint);
        boolean[] zArr2 = new boolean[length];
        char[] charArray = str.toCharArray();
        PathMeasure pathMeasure4 = pathMeasure;
        double d25 = b11.f29076l;
        double d26 = b11.f29077m;
        double d27 = b11.f29078n;
        boolean z22 = b11.f29079o;
        if (d27 == 0.0d) {
            zArr = zArr2;
            if (b11.f29073i == d0.normal) {
                z11 = true;
                i10 = Build.VERSION.SDK_INT;
                if (z11) {
                    c2922y = c2922y4;
                    paint2 = paint;
                    StringBuilder sb2 = new StringBuilder();
                    d11 = d25;
                    sb2.append("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ");
                    sb2.append(b11.f29071g);
                    paint2.setFontFeatureSettings(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    c2922y = c2922y4;
                    sb3.append("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ");
                    sb3.append(b11.f29071g);
                    paint2 = paint;
                    paint2.setFontFeatureSettings(sb3.toString());
                    d11 = d25;
                }
                if (i10 >= 26) {
                    paint2.setFontVariationSettings("'wght' " + b11.f29070f + b11.f29072h);
                }
                ReadableMap readableMap = b11.f29068d;
                float[] fArr5 = new float[length];
                paint2.getTextWidths(str, fArr5);
                f0 f0Var = b11.f29074j;
                double F10 = G().F(paint2);
                double Z10 = z20.Z(f0Var, F10);
                double c11 = v10.c();
                if (z21) {
                    d12 = F10;
                    c2921x = v10;
                    path = path4;
                    fArr = fArr5;
                    c2922y2 = c2922y;
                    paint3 = paint2;
                    z12 = z22;
                    d13 = d10;
                    d14 = 0.0d;
                    z13 = false;
                    i11 = 1;
                } else {
                    boolean z23 = z20.f28995s.T() == j0.sharp;
                    int i23 = z20.f28995s.U() == k0.right ? -1 : 1;
                    d12 = F10;
                    c2921x = v10;
                    path = path4;
                    c2922y2 = c2922y;
                    paint3 = paint2;
                    fArr = fArr5;
                    z12 = z22;
                    d13 = d10;
                    double W10 = W(z20.f28995s.V(), d10, c11);
                    Z10 += W10;
                    if (z10) {
                        d14 = W10 + (f0Var == f0.middle ? -(d13 / 2.0d) : 0.0d);
                        d10 = d14 + d13;
                    } else {
                        d10 = d13;
                        d14 = 0.0d;
                    }
                    z13 = z23;
                    i11 = i23;
                }
                sVGLength = z20.f29039g;
                double d28 = 1.0d;
                if (sVGLength == null) {
                    d16 = d13;
                    z14 = z13;
                    d15 = d14;
                    double a10 = K.a(sVGLength, canvas.getWidth(), 0.0d, z20.mScale, c11);
                    if (a10 < 0.0d) {
                        throw new IllegalArgumentException("Negative textLength value");
                    }
                    if (a.f29000b[z20.f29041i.ordinal()] != 2) {
                        d27 += (a10 - d12) / (length - 1);
                    } else {
                        d28 = a10 / d12;
                    }
                } else {
                    d15 = d14;
                    z14 = z13;
                    d16 = d13;
                }
                double d29 = d27;
                double d30 = i11;
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                double d31 = d28 * d30;
                double d32 = fontMetrics.descent;
                float f10 = fontMetrics.leading;
                double d33 = d10;
                int i24 = i11;
                double d34 = f10 + d32;
                int i25 = i24;
                double d35 = d30;
                double d36 = (-fontMetrics.ascent) + f10;
                double d37 = -fontMetrics.top;
                double d38 = d37 + d34;
                D10 = D();
                C10 = C();
                if (C10 != null) {
                    switch (a.f29001c[C10.ordinal()]) {
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                            i12 = 0;
                            d37 = -d32;
                            break;
                        case 5:
                            break;
                        case 7:
                            i12 = 0;
                            paint3.getTextBounds("x", 0, 1, new Rect());
                            d37 = r0.height() / 2.0d;
                            break;
                        case 8:
                            d34 = (d36 - d32) / 2.0d;
                            d37 = d34;
                            i12 = 0;
                            break;
                        case 9:
                            d24 = 0.5d;
                            d34 = d36 * d24;
                            d37 = d34;
                            i12 = 0;
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            d24 = 0.8d;
                            d34 = d36 * d24;
                            d37 = d34;
                            i12 = 0;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            d37 = d36;
                            i12 = 0;
                            break;
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            d37 = d34;
                            i12 = 0;
                            break;
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            d34 = d38 / 2.0d;
                            d37 = d34;
                            i12 = 0;
                            break;
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            i12 = 0;
                            break;
                        default:
                            d37 = 0.0d;
                            i12 = 0;
                            break;
                    }
                    if (D10 != null && !D10.isEmpty() && (i21 = a.f29001c[C10.ordinal()]) != 14 && i21 != 16) {
                        switch (D10.hashCode()) {
                            case -1720785339:
                                if (D10.equals("baseline")) {
                                    i22 = i12;
                                    break;
                                }
                                i22 = -1;
                                break;
                            case 114240:
                                if (D10.equals("sub")) {
                                    i22 = 1;
                                    break;
                                }
                                i22 = -1;
                                break;
                            case 109801339:
                                if (D10.equals("super")) {
                                    i22 = 2;
                                    break;
                                }
                                i22 = -1;
                                break;
                            default:
                                i22 = -1;
                                break;
                        }
                        switch (i22) {
                            case 0:
                                break;
                            case 1:
                                if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                    int i26 = readableMap.getInt("unitsPerEm");
                                    ReadableMap map = readableMap.getMap("tables");
                                    if (map.hasKey("os2")) {
                                        ReadableMap map2 = map.getMap("os2");
                                        if (map2.hasKey("ySubscriptYOffset")) {
                                            d37 += ((z20.mScale * c11) * map2.getDouble("ySubscriptYOffset")) / i26;
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                    int i27 = readableMap.getInt("unitsPerEm");
                                    ReadableMap map3 = readableMap.getMap("tables");
                                    if (map3.hasKey("os2")) {
                                        ReadableMap map4 = map3.getMap("os2");
                                        if (map4.hasKey("ySuperscriptYOffset")) {
                                            d37 -= ((z20.mScale * c11) * map4.getDouble("ySuperscriptYOffset")) / i27;
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                float f11 = z20.mScale;
                                d37 -= K.b(D10, f11 * c11, f11, c11);
                                break;
                        }
                    }
                    Matrix matrix2 = new Matrix();
                    Matrix matrix3 = new Matrix();
                    Matrix matrix4 = new Matrix();
                    float[] fArr6 = new float[9];
                    float[] fArr7 = new float[9];
                    i13 = i12;
                    double d39 = d11;
                    while (i13 < length) {
                        char c12 = charArray[i13];
                        String valueOf = String.valueOf(c12);
                        boolean z24 = zArr[i13];
                        if (z24) {
                            d17 = d39;
                            str2 = org.conscrypt.BuildConfig.FLAVOR;
                            z15 = false;
                        } else {
                            int i28 = i13;
                            String str3 = valueOf;
                            z15 = false;
                            while (true) {
                                int i29 = i28 + 1;
                                if (i29 < length && fArr[i29] <= 0.0f) {
                                    str3 = str3 + charArray[i29];
                                    zArr[i29] = true;
                                    i28 = i29;
                                    d39 = d39;
                                    z15 = true;
                                }
                            }
                            d17 = d39;
                            str2 = str3;
                        }
                        double measureText = paint3.measureText(str2) * d28;
                        if (z12) {
                            i14 = length;
                        } else {
                            i14 = length;
                            d17 = (fArr[i13] * d28) - measureText;
                        }
                        boolean z25 = c12 == ' ';
                        double d40 = measureText + (z25 ? d26 : 0.0d) + d29;
                        if (z24) {
                            c10 = c12;
                            d18 = 0.0d;
                        } else {
                            c10 = c12;
                            d18 = d17 + d40;
                        }
                        double l10 = c2921x.l(d18);
                        double d41 = d37;
                        double m10 = c2921x.m();
                        double i30 = c2921x.i();
                        double j10 = c2921x.j();
                        double k10 = c2921x.k();
                        if (z24 || z25) {
                            matrix = matrix2;
                            z16 = z20;
                            i15 = i13;
                            fArr2 = fArr7;
                            c2921x2 = c2921x;
                            i16 = i25;
                            pathMeasure2 = pathMeasure4;
                            i17 = i14;
                            path2 = path;
                            c2922y3 = c2922y2;
                            fArr3 = fArr;
                            d19 = d16;
                            d20 = d35;
                            z17 = false;
                            paint4 = paint;
                        } else {
                            double d42 = measureText * d35;
                            double d43 = (Z10 + ((l10 + i30) * d35)) - (d40 * d35);
                            if (z21) {
                                double d44 = d43 + d42;
                                double d45 = d42 / 2.0d;
                                i18 = i13;
                                float[] fArr8 = fArr7;
                                double d46 = d43 + d45;
                                if (d46 <= d33 && d46 >= d15) {
                                    if (z14) {
                                        PathMeasure pathMeasure5 = pathMeasure4;
                                        pathMeasure5.getMatrix((float) d46, matrix3, 3);
                                        c2921x3 = c2921x;
                                        fArr4 = fArr8;
                                        d22 = d16;
                                        pathMeasure2 = pathMeasure5;
                                        matrix = matrix2;
                                    } else {
                                        PathMeasure pathMeasure6 = pathMeasure4;
                                        c2921x3 = c2921x;
                                        pathMeasure2 = pathMeasure6;
                                        if (d43 < 0.0d) {
                                            pathMeasure2.getMatrix(0.0f, matrix2, 3);
                                            matrix2.preTranslate((float) d43, 0.0f);
                                            i20 = 1;
                                        } else {
                                            float f12 = (float) d43;
                                            i20 = 1;
                                            pathMeasure2.getMatrix(f12, matrix2, 1);
                                        }
                                        pathMeasure2.getMatrix((float) d46, matrix3, i20);
                                        if (d44 > d16) {
                                            d22 = d16;
                                            pathMeasure2.getMatrix((float) d22, matrix4, 3);
                                            matrix4.preTranslate((float) (d44 - d22), 0.0f);
                                        } else {
                                            d22 = d16;
                                            pathMeasure2.getMatrix((float) d44, matrix4, i20);
                                        }
                                        matrix2.getValues(fArr6);
                                        fArr4 = fArr8;
                                        matrix4.getValues(fArr4);
                                        matrix = matrix2;
                                        matrix3.preRotate((float) (Math.atan2(fArr4[5] - fArr6[5], fArr4[2] - fArr6[2]) * 57.29577951308232d * d35));
                                        d45 = d45;
                                    }
                                    matrix3.preTranslate((float) (-d45), (float) (j10 + d41));
                                    d21 = d31;
                                    i19 = i25;
                                    matrix3.preScale((float) d21, i19);
                                    matrix3.postTranslate(0.0f, (float) m10);
                                    d23 = k10;
                                    z18 = true;
                                } else {
                                    paint4 = paint;
                                    z16 = z20;
                                    c2921x2 = c2921x;
                                    i16 = i25;
                                    pathMeasure2 = pathMeasure4;
                                    fArr2 = fArr8;
                                    i17 = i14;
                                    i15 = i18;
                                    path2 = path;
                                    c2922y3 = c2922y2;
                                    fArr3 = fArr;
                                    d20 = d35;
                                    z17 = false;
                                    matrix = matrix2;
                                    d19 = d16;
                                }
                            } else {
                                matrix = matrix2;
                                i18 = i13;
                                fArr4 = fArr7;
                                i19 = i25;
                                d21 = d31;
                                d22 = d16;
                                z18 = true;
                                PathMeasure pathMeasure7 = pathMeasure4;
                                c2921x3 = c2921x;
                                pathMeasure2 = pathMeasure7;
                                matrix3.setTranslate((float) d43, (float) (m10 + j10 + d41));
                                d23 = k10;
                            }
                            matrix3.preRotate((float) d23);
                            if (z15) {
                                Path path5 = new Path();
                                i16 = i19;
                                path3 = path;
                                i17 = i14;
                                d31 = d21;
                                d19 = d22;
                                boolean z26 = z18;
                                fArr3 = fArr;
                                i15 = i18;
                                z17 = false;
                                fArr2 = fArr4;
                                z19 = z26;
                                d20 = d35;
                                paint.getTextPath(str2, 0, str2.length(), 0.0f, 0.0f, path5);
                                b10 = path5;
                                c2922y3 = c2922y2;
                            } else {
                                fArr2 = fArr4;
                                d31 = d21;
                                i16 = i19;
                                d19 = d22;
                                z19 = z18;
                                i17 = i14;
                                char c13 = c10;
                                i15 = i18;
                                path3 = path;
                                c2922y3 = c2922y2;
                                fArr3 = fArr;
                                d20 = d35;
                                z17 = false;
                                b10 = c2922y3.b(c13, str2);
                            }
                            RectF rectF = new RectF();
                            b10.computeBounds(rectF, z19);
                            if (rectF.width() == 0.0f) {
                                canvas.save();
                                c2921x2 = c2921x3;
                                canvas.concat(matrix3);
                                z16 = this;
                                z16.f28996t.add(str2);
                                z16.f28997u.add(new Matrix(matrix3));
                                paint4 = paint;
                                canvas.drawText(str2, 0.0f, 0.0f, paint4);
                                canvas.restore();
                                path2 = path3;
                            } else {
                                z16 = this;
                                paint4 = paint;
                                c2921x2 = c2921x3;
                                b10.transform(matrix3);
                                path2 = path3;
                                path2.addPath(b10);
                            }
                        }
                        d16 = d19;
                        path = path2;
                        c2922y2 = c2922y3;
                        z20 = z16;
                        paint3 = paint4;
                        pathMeasure4 = pathMeasure2;
                        fArr = fArr3;
                        fArr7 = fArr2;
                        matrix2 = matrix;
                        i25 = i16;
                        d37 = d41;
                        d35 = d20;
                        i13 = i15 + 1;
                        c2921x = c2921x2;
                        length = i17;
                        d39 = d17;
                    }
                    return path;
                }
                i12 = 0;
                d37 = 0.0d;
                if (D10 != null) {
                    switch (D10.hashCode()) {
                        case -1720785339:
                            break;
                        case 114240:
                            break;
                        case 109801339:
                            break;
                    }
                    switch (i22) {
                    }
                }
                Matrix matrix22 = new Matrix();
                Matrix matrix32 = new Matrix();
                Matrix matrix42 = new Matrix();
                float[] fArr62 = new float[9];
                float[] fArr72 = new float[9];
                i13 = i12;
                double d392 = d11;
                while (i13 < length) {
                }
                return path;
            }
        } else {
            zArr = zArr2;
        }
        z11 = false;
        i10 = Build.VERSION.SDK_INT;
        if (z11) {
        }
        if (i10 >= 26) {
        }
        ReadableMap readableMap2 = b11.f29068d;
        float[] fArr52 = new float[length];
        paint2.getTextWidths(str, fArr52);
        f0 f0Var2 = b11.f29074j;
        double F102 = G().F(paint2);
        double Z102 = z20.Z(f0Var2, F102);
        double c112 = v10.c();
        if (z21) {
        }
        sVGLength = z20.f29039g;
        double d282 = 1.0d;
        if (sVGLength == null) {
        }
        double d292 = d27;
        double d302 = i11;
        Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
        double d312 = d282 * d302;
        double d322 = fontMetrics2.descent;
        float f102 = fontMetrics2.leading;
        double d332 = d10;
        int i242 = i11;
        double d342 = f102 + d322;
        int i252 = i242;
        double d352 = d302;
        double d362 = (-fontMetrics2.ascent) + f102;
        double d372 = -fontMetrics2.top;
        double d382 = d372 + d342;
        D10 = D();
        C10 = C();
        if (C10 != null) {
        }
        i12 = 0;
        d372 = 0.0d;
        if (D10 != null) {
        }
        Matrix matrix222 = new Matrix();
        Matrix matrix322 = new Matrix();
        Matrix matrix422 = new Matrix();
        float[] fArr622 = new float[9];
        float[] fArr722 = new float[9];
        i13 = i12;
        double d3922 = d11;
        while (i13 < length) {
        }
        return path;
    }

    private StaticLayout Y(TextPaint textPaint, Layout.Alignment alignment, boolean z10, SpannableString spannableString, int i10) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    private double Z(f0 f0Var, double d10) {
        int i10 = a.f28999a[f0Var.ordinal()];
        if (i10 == 2) {
            return (-d10) / 2.0d;
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return -d10;
    }

    private void b0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == a0.class) {
                this.f28995s = (a0) parent;
                return;
            } else {
                if (!(parent instanceof m0)) {
                    return;
                }
            }
        }
    }

    public static String c0(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            bArr[i10] = (byte) bidi.getRunLevel(i10);
            numArr[i10] = Integer.valueOf(i10);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < runCount; i11++) {
            int intValue = numArr[i11].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb2.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    @Override // com.horcrux.svg.m0
    double F(Paint paint) {
        if (!Double.isNaN(this.f29048p)) {
            return this.f29048p;
        }
        String str = this.f28994r;
        double d10 = 0.0d;
        if (str == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof m0) {
                    d10 += ((m0) childAt).F(paint);
                }
            }
            this.f29048p = d10;
            return d10;
        }
        if (str.length() == 0) {
            this.f29048p = 0.0d;
            return 0.0d;
        }
        C2919v b10 = v().b();
        U(paint, b10);
        T(paint, b10);
        double measureText = paint.measureText(str);
        this.f29048p = measureText;
        return measureText;
    }

    public void a0(String str) {
        this.f28994r = str;
        invalidate();
    }

    @Override // com.horcrux.svg.m0, com.horcrux.svg.VirtualView
    void clearCache() {
        this.f28993q = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.m0, com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f28994r == null) {
            clip(canvas, paint);
            r(canvas, paint, f10);
            return;
        }
        SVGLength sVGLength = this.f29038f;
        if (sVGLength != null && sVGLength.f28946a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f10)) {
                V(canvas, paint);
            }
            if (setupStrokePaint(paint, f10 * this.strokeOpacity)) {
                V(canvas, paint);
                return;
            }
            return;
        }
        int size = this.f28996t.size();
        if (size > 0) {
            U(paint, v().b());
            for (int i10 = 0; i10 < size; i10++) {
                String str = (String) this.f28996t.get(i10);
                Matrix matrix = (Matrix) this.f28997u.get(i10);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        s(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.m0, com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f28993q;
        if (path != null) {
            return path;
        }
        if (this.f28994r == null) {
            Path E10 = E(canvas, paint);
            this.f28993q = E10;
            return E10;
        }
        b0();
        x();
        this.f28993q = X(c0(this.f28994r), paint, canvas);
        w();
        return this.f28993q;
    }

    @Override // com.horcrux.svg.C2923z, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        Region region;
        if (this.f28994r == null) {
            return super.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.mStrokeRegion) != null && region.contains(round, round2))) {
                if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.m0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f28993q = null;
        super.invalidate();
    }
}
