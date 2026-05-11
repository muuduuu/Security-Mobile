package com.airbnb.android.react.lottie;

import O1.AbstractC1031b;
import O1.B;
import O1.H;
import O1.I;
import O1.J;
import android.graphics.Typeface;
import android.net.Uri;
import android.widget.ImageView;
import c2.C1720c;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import g5.C3193c;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lc.o;
import lc.p;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f19972a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19973b;

    /* renamed from: c, reason: collision with root package name */
    private String f19974c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView.ScaleType f19975d;

    /* renamed from: e, reason: collision with root package name */
    private String f19976e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f19977f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f19978g;

    /* renamed from: h, reason: collision with root package name */
    private ReadableArray f19979h;

    /* renamed from: i, reason: collision with root package name */
    private ReadableArray f19980i;

    /* renamed from: j, reason: collision with root package name */
    private H f19981j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f19982k;

    /* renamed from: l, reason: collision with root package name */
    private String f19983l;

    /* renamed from: m, reason: collision with root package name */
    private String f19984m;

    /* renamed from: n, reason: collision with root package name */
    private String f19985n;

    /* renamed from: o, reason: collision with root package name */
    private Float f19986o;

    /* renamed from: p, reason: collision with root package name */
    private Boolean f19987p;

    /* renamed from: q, reason: collision with root package name */
    private Boolean f19988q;

    /* renamed from: r, reason: collision with root package name */
    private Float f19989r;

    public static final class a extends AbstractC1031b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f19990a;

        a(LottieAnimationView lottieAnimationView) {
            this.f19990a = lottieAnimationView;
        }

        @Override // O1.AbstractC1031b
        public Typeface a(String fontFamily) {
            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
            Typeface b10 = com.facebook.react.views.text.d.a().b(fontFamily, -1, -1, this.f19990a.getContext().getAssets());
            Intrinsics.checkNotNullExpressionValue(b10, "getTypeface(...)");
            return b10;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r4.equals("Regular") == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            r3 = 400;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        
            if (r4.equals(com.facebook.react.views.progressbar.ReactProgressBarViewManager.DEFAULT_STYLE) == false) goto L29;
         */
        @Override // O1.AbstractC1031b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Typeface b(String fontFamily, String fontStyle, String fontName) {
            int i10;
            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
            Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
            Intrinsics.checkNotNullParameter(fontName, "fontName");
            switch (fontStyle.hashCode()) {
                case -1994163307:
                    if (fontStyle.equals("Medium")) {
                        i10 = 500;
                        break;
                    }
                    i10 = -1;
                    break;
                case -1955878649:
                    break;
                case -1543850116:
                    break;
                case 2076325:
                    if (fontStyle.equals("Bold")) {
                        i10 = 700;
                        break;
                    }
                    i10 = -1;
                    break;
                case 2605753:
                    if (fontStyle.equals("Thin")) {
                        i10 = 100;
                        break;
                    }
                    i10 = -1;
                    break;
                case 64266207:
                    if (fontStyle.equals("Black")) {
                        i10 = 900;
                        break;
                    }
                    i10 = -1;
                    break;
                case 73417974:
                    if (fontStyle.equals("Light")) {
                        i10 = 200;
                        break;
                    }
                    i10 = -1;
                    break;
                default:
                    i10 = -1;
                    break;
            }
            Typeface b10 = com.facebook.react.views.text.d.a().b(fontName, -1, i10, this.f19990a.getContext().getAssets());
            Intrinsics.checkNotNullExpressionValue(b10, "getTypeface(...)");
            return b10;
        }
    }

    public h(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f19972a = new WeakReference(view);
        view.setFontAssetDelegate(new a(view));
    }

    private final void b(ReadableMap readableMap, LottieAnimationView lottieAnimationView) {
        int i10;
        List j10;
        if (readableMap.getType("color") == ReadableType.Map) {
            Integer color = ColorPropConverter.getColor(readableMap.getMap("color"), lottieAnimationView.getContext());
            Intrinsics.d(color);
            i10 = color.intValue();
        } else {
            i10 = readableMap.getInt("color");
        }
        String str = readableMap.getString("keypath") + ".**";
        String quote = Pattern.quote(".");
        Intrinsics.checkNotNullExpressionValue(quote, "quote(...)");
        List f10 = new Regex(quote).f(str, 0);
        if (!f10.isEmpty()) {
            ListIterator listIterator = f10.listIterator(f10.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    j10 = CollectionsKt.G0(f10, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        j10 = CollectionsKt.j();
        String[] strArr = (String[]) j10.toArray(new String[0]);
        lottieAnimationView.k(new U1.e((String[]) Arrays.copyOf(strArr, strArr.length)), B.f6863K, new C1720c(new I(i10)));
    }

    public final void a() {
        Object b10;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f19972a.get();
        if (lottieAnimationView == null) {
            return;
        }
        ReadableArray readableArray = this.f19980i;
        if (readableArray != null && readableArray.size() > 0) {
            J j10 = new J(lottieAnimationView);
            ReadableArray readableArray2 = this.f19980i;
            Intrinsics.d(readableArray2);
            int size = readableArray2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableArray readableArray3 = this.f19980i;
                Intrinsics.d(readableArray3);
                ReadableMap map = readableArray3.getMap(i10);
                j10.e(map.getString("find"), map.getString("replace"));
            }
            lottieAnimationView.setTextDelegate(j10);
        }
        String str = this.f19983l;
        if (str != null) {
            lottieAnimationView.F(str, String.valueOf(str.hashCode()));
            this.f19983l = null;
        }
        String str2 = this.f19984m;
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                lottieAnimationView.D(new FileInputStream(file), String.valueOf(str2.hashCode()));
            } else {
                lottieAnimationView.G(str2, String.valueOf(str2.hashCode()));
            }
            this.f19984m = null;
        }
        String str3 = this.f19985n;
        if (str3 != null) {
            File file2 = new File(str3);
            if (file2.exists()) {
                lottieAnimationView.E(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                this.f19985n = null;
                return;
            }
            try {
                o.a aVar = o.f37128b;
                b10 = o.b(Uri.parse(str3).getScheme());
            } catch (Throwable th) {
                o.a aVar2 = o.f37128b;
                b10 = o.b(p.a(th));
            }
            if (o.f(b10)) {
                b10 = null;
            }
            if (((String) b10) != null) {
                lottieAnimationView.setAnimationFromUrl(str3);
                this.f19985n = null;
                return;
            }
            int identifier = lottieAnimationView.getResources().getIdentifier(str3, "raw", lottieAnimationView.getContext().getPackageName());
            if (identifier == 0) {
                C3193c.a("Animation for " + str3 + " was not found in raw resources");
                return;
            }
            lottieAnimationView.setAnimation(identifier);
            this.f19973b = false;
            this.f19985n = null;
        }
        if (this.f19973b) {
            lottieAnimationView.setAnimation(this.f19974c);
            this.f19973b = false;
        }
        Float f10 = this.f19986o;
        if (f10 != null) {
            lottieAnimationView.setProgress(f10.floatValue());
            this.f19986o = null;
        }
        Boolean bool = this.f19987p;
        if (bool != null) {
            lottieAnimationView.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.f19987p = null;
        }
        Boolean bool2 = this.f19988q;
        if (bool2 != null && bool2.booleanValue() && !lottieAnimationView.t()) {
            lottieAnimationView.y();
        }
        Float f11 = this.f19989r;
        if (f11 != null) {
            lottieAnimationView.setSpeed(f11.floatValue());
            this.f19989r = null;
        }
        ImageView.ScaleType scaleType = this.f19975d;
        if (scaleType != null) {
            lottieAnimationView.setScaleType(scaleType);
            this.f19975d = null;
        }
        H h10 = this.f19981j;
        if (h10 != null) {
            lottieAnimationView.setRenderMode(h10);
            this.f19981j = null;
        }
        Integer num = this.f19982k;
        if (num != null) {
            lottieAnimationView.setLayerType(num.intValue(), null);
        }
        String str4 = this.f19976e;
        if (str4 != null) {
            lottieAnimationView.setImageAssetsFolder(str4);
            this.f19976e = null;
        }
        Boolean bool3 = this.f19977f;
        if (bool3 != null) {
            lottieAnimationView.p(bool3.booleanValue());
            this.f19977f = null;
        }
        Boolean bool4 = this.f19978g;
        if (bool4 != null) {
            lottieAnimationView.setSafeMode(bool4.booleanValue());
            this.f19978g = null;
        }
        ReadableArray readableArray4 = this.f19979h;
        if (readableArray4 == null || readableArray4.size() <= 0) {
            return;
        }
        int size2 = readableArray4.size();
        for (int i11 = 0; i11 < size2; i11++) {
            b(readableArray4.getMap(i11), lottieAnimationView);
        }
    }

    public final void c(String str) {
        this.f19983l = str;
    }

    public final void d(String str) {
        this.f19974c = str;
        this.f19973b = true;
    }

    public final void e(String str) {
        this.f19984m = str;
    }

    public final void f(Boolean bool) {
        this.f19988q = bool;
    }

    public final void g(ReadableArray readableArray) {
        this.f19979h = readableArray;
    }

    public final void h(Boolean bool) {
        this.f19977f = bool;
    }

    public final void i(Boolean bool) {
        this.f19978g = bool;
    }

    public final void j(String str) {
        this.f19976e = str;
    }

    public final void k(Integer num) {
        this.f19982k = num;
    }

    public final void l(Boolean bool) {
        this.f19987p = bool;
    }

    public final void m(Float f10) {
        this.f19986o = f10;
    }

    public final void n(H h10) {
        this.f19981j = h10;
    }

    public final void o(ImageView.ScaleType scaleType) {
        this.f19975d = scaleType;
    }

    public final void p(String str) {
        this.f19985n = str;
    }

    public final void q(Float f10) {
        this.f19989r = f10;
    }

    public final void r(ReadableArray readableArray) {
        this.f19980i = readableArray;
    }
}
