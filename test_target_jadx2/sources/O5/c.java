package o5;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends MetricAffectingSpan implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final a f37937f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f37938a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37939b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37940c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37941d;

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f37942e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Paint paint, int i10, int i11, String str, String str2, AssetManager assetManager) {
            Typeface a10 = com.facebook.react.views.text.o.a(paint.getTypeface(), i10, i11, str2, assetManager);
            Intrinsics.checkNotNullExpressionValue(a10, "applyStyles(...)");
            paint.setFontFeatureSettings(str);
            paint.setTypeface(a10);
            paint.setSubpixelText(true);
        }

        private a() {
        }
    }

    public c(int i10, int i11, String str, String str2, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f37938a = i10;
        this.f37939b = i11;
        this.f37940c = str;
        this.f37941d = str2;
        this.f37942e = assetManager;
    }

    public final String a() {
        return this.f37941d;
    }

    public final String b() {
        return this.f37940c;
    }

    public final int c() {
        int i10 = this.f37938a;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final int d() {
        int i10 = this.f37939b;
        if (i10 == -1) {
            return 400;
        }
        return i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        f37937f.b(ds, this.f37938a, this.f37939b, this.f37940c, this.f37941d, this.f37942e);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        f37937f.b(paint, this.f37938a, this.f37939b, this.f37940c, this.f37941d, this.f37942e);
    }
}
