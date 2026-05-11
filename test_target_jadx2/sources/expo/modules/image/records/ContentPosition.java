package expo.modules.image.records;

import Ta.s;
import android.graphics.Matrix;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import wc.p;
import xc.j;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u000f\u001a\u0004\u0018\u00010\f*\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2.\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u001dR(\u0010\"\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u001dR(\u0010%\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\u001d¨\u0006*"}, d2 = {"Lexpo/modules/image/records/ContentPosition;", "LAb/c;", "<init>", "()V", BuildConfig.FLAVOR, "Lexpo/modules/image/records/ContentPositionValue;", BuildConfig.FLAVOR, "isReverse", "Landroid/graphics/RectF;", "imageRect", "viewRect", "Lkotlin/Function5;", BuildConfig.FLAVOR, "Lexpo/modules/image/records/CalcAxisOffset;", "calcAxisOffset", "calcOffset", "(Ljava/lang/Object;ZLandroid/graphics/RectF;Landroid/graphics/RectF;Lwc/p;)Ljava/lang/Float;", "offsetX", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)F", "offsetY", "Landroid/graphics/Matrix;", "to", BuildConfig.FLAVOR, "apply$expo_image_release", "(Landroid/graphics/Matrix;Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "apply", "top", "Ljava/lang/Object;", "getTop", "()Ljava/lang/Object;", "getTop$annotations", "bottom", "getBottom", "getBottom$annotations", "right", "getRight", "getRight$annotations", "left", "getLeft", "getLeft$annotations", "Companion", C4870a.f43493a, "expo-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContentPosition implements Ab.c {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ContentPosition center = new ContentPosition();
    private final Object bottom;
    private final Object left;
    private final Object right;
    private final Object top;

    /* renamed from: expo.modules.image.records.ContentPosition$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ContentPosition a() {
            return ContentPosition.center;
        }

        private Companion() {
        }
    }

    /* synthetic */ class b extends j implements p {

        /* renamed from: j, reason: collision with root package name */
        public static final b f32670j = new b();

        b() {
            super(5, s.class, "calcXTranslation", "calcXTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        public final Float I(float f10, RectF p12, RectF p22, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            return Float.valueOf(s.b(f10, p12, p22, z10, z11));
        }

        @Override // wc.p
        public /* bridge */ /* synthetic */ Object x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return I(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    /* synthetic */ class c extends j implements p {

        /* renamed from: j, reason: collision with root package name */
        public static final c f32671j = new c();

        c() {
            super(5, s.class, "calcXTranslation", "calcXTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        public final Float I(float f10, RectF p12, RectF p22, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            return Float.valueOf(s.b(f10, p12, p22, z10, z11));
        }

        @Override // wc.p
        public /* bridge */ /* synthetic */ Object x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return I(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    /* synthetic */ class d extends j implements p {

        /* renamed from: j, reason: collision with root package name */
        public static final d f32672j = new d();

        d() {
            super(5, s.class, "calcYTranslation", "calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        public final Float I(float f10, RectF p12, RectF p22, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            return Float.valueOf(s.d(f10, p12, p22, z10, z11));
        }

        @Override // wc.p
        public /* bridge */ /* synthetic */ Object x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return I(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    /* synthetic */ class e extends j implements p {

        /* renamed from: j, reason: collision with root package name */
        public static final e f32673j = new e();

        e() {
            super(5, s.class, "calcYTranslation", "calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        public final Float I(float f10, RectF p12, RectF p22, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            return Float.valueOf(s.d(f10, p12, p22, z10, z11));
        }

        @Override // wc.p
        public /* bridge */ /* synthetic */ Object x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return I(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    private final Float calcOffset(Object obj, boolean z10, RectF rectF, RectF rectF2, p pVar) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Float) pVar.x(Float.valueOf((float) ((Number) obj).doubleValue()), rectF, rectF2, Boolean.FALSE, Boolean.valueOf(z10));
        }
        String str = (String) obj;
        return Float.valueOf(Intrinsics.b(str, "center") ? ((Number) pVar.x(Float.valueOf(50.0f), rectF, rectF2, Boolean.TRUE, Boolean.valueOf(z10))).floatValue() : ((Number) pVar.x(Float.valueOf(Float.parseFloat(StringsKt.p0(str, "%"))), rectF, rectF2, Boolean.TRUE, Boolean.valueOf(z10))).floatValue());
    }

    @Ab.b
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Ab.b
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Ab.b
    public static /* synthetic */ void getRight$annotations() {
    }

    @Ab.b
    public static /* synthetic */ void getTop$annotations() {
    }

    private final float offsetX(RectF imageRect, RectF viewRect) {
        Float calcOffset = calcOffset(this.left, false, imageRect, viewRect, b.f32670j);
        return (calcOffset == null && (calcOffset = calcOffset(this.right, true, imageRect, viewRect, c.f32671j)) == null) ? s.c(50.0f, imageRect, viewRect, true, false, 16, null) : calcOffset.floatValue();
    }

    private final float offsetY(RectF imageRect, RectF viewRect) {
        Float calcOffset = calcOffset(this.top, false, imageRect, viewRect, d.f32672j);
        return (calcOffset == null && (calcOffset = calcOffset(this.bottom, true, imageRect, viewRect, e.f32673j)) == null) ? s.e(50.0f, imageRect, viewRect, true, false, 16, null) : calcOffset.floatValue();
    }

    public final void apply$expo_image_release(Matrix to, RectF imageRect, RectF viewRect) {
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(imageRect, "imageRect");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        to.postTranslate(offsetX(imageRect, viewRect), offsetY(imageRect, viewRect));
    }

    public final Object getBottom() {
        return this.bottom;
    }

    public final Object getLeft() {
        return this.left;
    }

    public final Object getRight() {
        return this.right;
    }

    public final Object getTop() {
        return this.top;
    }
}
