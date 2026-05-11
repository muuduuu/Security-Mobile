package com.swmansion.gesturehandler.react;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC1496g0;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ea.AbstractC3109d;
import ea.o;
import h5.D;
import h5.E;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@K4.a(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002=>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001e\u0010\u001aJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0017¢\u0006\u0004\b \u0010\u001aJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\"\u0010\u001aJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0017H\u0017¢\u0006\u0004\b$\u0010\u001aJ!\u0010'\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b-\u0010(J\u001f\u0010/\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010.\u001a\u00020%H\u0017¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u000eH\u0017¢\u0006\u0004\b2\u0010\u0012J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u0017\u00105\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000107H\u0014¢\u0006\u0004\b8\u00109R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lh5/E;", "<init>", "()V", BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/F0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/F0;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "view", BuildConfig.FLAVOR, "useDrawableOnForeground", BuildConfig.FLAVOR, "setForeground", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Z)V", "useBorderlessDrawable", "setBorderless", AppConstants.VIDEO_RECORDING_ENABLED, "setEnabled", BuildConfig.FLAVOR, Snapshot.BORDER_RADIUS, "setBorderRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;F)V", Snapshot.BORDER_TOP_LEFT_RADIUS, "setBorderTopLeftRadius", Snapshot.BORDER_TOP_RIGHT_RADIUS, "setBorderTopRightRadius", Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "setBorderBottomLeftRadius", Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, "setBorderBottomRightRadius", "borderWidth", "setBorderWidth", BuildConfig.FLAVOR, "borderColor", "setBorderColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;I)V", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;)V", "Lcom/facebook/react/uimanager/c1;", "getDelegate", "()Lcom/facebook/react/uimanager/c1;", "mDelegate", "Lcom/facebook/react/uimanager/c1;", "Companion", C4870a.f43493a, "b", "react-native-gesture-handler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> implements E {
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final c1 mDelegate = new D(this);

    public static final class a extends ViewGroup implements o.d {

        /* renamed from: v, reason: collision with root package name */
        private static a f29720v;

        /* renamed from: w, reason: collision with root package name */
        private static a f29721w;

        /* renamed from: a, reason: collision with root package name */
        private Integer f29723a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f29724b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f29725c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f29726d;

        /* renamed from: e, reason: collision with root package name */
        private float f29727e;

        /* renamed from: f, reason: collision with root package name */
        private float f29728f;

        /* renamed from: g, reason: collision with root package name */
        private float f29729g;

        /* renamed from: h, reason: collision with root package name */
        private float f29730h;

        /* renamed from: i, reason: collision with root package name */
        private float f29731i;

        /* renamed from: j, reason: collision with root package name */
        private float f29732j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f29733k;

        /* renamed from: l, reason: collision with root package name */
        private String f29734l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f29735m;

        /* renamed from: n, reason: collision with root package name */
        private int f29736n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f29737o;

        /* renamed from: p, reason: collision with root package name */
        private long f29738p;

        /* renamed from: q, reason: collision with root package name */
        private int f29739q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f29740r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f29741s;

        /* renamed from: t, reason: collision with root package name */
        public static final C0438a f29718t = new C0438a(null);

        /* renamed from: u, reason: collision with root package name */
        private static TypedValue f29719u = new TypedValue();

        /* renamed from: x, reason: collision with root package name */
        private static View.OnClickListener f29722x = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.a.l(view);
            }
        };

        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a, reason: collision with other inner class name */
        public static final class C0438a {
            public /* synthetic */ C0438a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0438a() {
            }
        }

        public a(Context context) {
            super(context);
            this.f29734l = "solid";
            this.f29735m = true;
            this.f29738p = -1L;
            this.f29739q = -1;
            setOnClickListener(f29722x);
            setClickable(true);
            setFocusable(true);
            this.f29737o = true;
            setClipChildren(false);
        }

        private final boolean getHasBorderRadii() {
            return (this.f29727e == 0.0f && this.f29728f == 0.0f && this.f29729g == 0.0f && this.f29730h == 0.0f && this.f29731i == 0.0f) ? false : true;
        }

        private final float[] h() {
            float f10 = this.f29728f;
            float f11 = this.f29729g;
            float f12 = this.f29731i;
            float f13 = this.f29730h;
            float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
            ArrayList arrayList = new ArrayList(8);
            for (int i10 = 0; i10 < 8; i10++) {
                float f14 = fArr[i10];
                if (f14 == 0.0f) {
                    f14 = this.f29727e;
                }
                arrayList.add(Float.valueOf(f14));
            }
            return CollectionsKt.L0(arrayList);
        }

        private final PathEffect i() {
            String str = this.f29734l;
            if (Intrinsics.b(str, "dotted")) {
                float f10 = this.f29732j;
                return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
            }
            if (!Intrinsics.b(str, "dashed")) {
                return null;
            }
            float f11 = this.f29732j;
            float f12 = 3;
            return new DashPathEffect(new float[]{f11 * f12, f11 * f12, f11 * f12, f11 * f12}, 0.0f);
        }

        private final Drawable j() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(h());
            }
            if (this.f29732j > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.f29732j);
                Integer num = this.f29733k;
                paint.setColor(num != null ? num.intValue() : -16777216);
                paint.setPathEffect(i());
            }
            return paintDrawable;
        }

        private final Drawable k() {
            ColorStateList colorStateList;
            Integer num = this.f29723a;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{R.attr.state_enabled}};
            Integer num2 = this.f29724b;
            Integer num3 = this.f29723a;
            if (num3 != null) {
                Intrinsics.d(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, f29719u, true);
                colorStateList = new ColorStateList(iArr, new int[]{f29719u.data});
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.f29726d ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) C1944g0.g(num2.intValue()));
            }
            return rippleDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(View view) {
        }

        private final j m() {
            j jVar = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof j) {
                    jVar = (j) parent;
                }
            }
            return jVar;
        }

        private final boolean n(Sequence sequence) {
            Iterator it = sequence.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.f29741s || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && n(AbstractC1496g0.a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        static /* synthetic */ boolean o(a aVar, Sequence sequence, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sequence = AbstractC1496g0.a(aVar);
            }
            return aVar.n(sequence);
        }

        private final void p() {
            if (f29720v == this) {
                f29720v = null;
                f29721w = this;
            }
        }

        private final boolean q() {
            if (o(this, null, 1, null)) {
                return false;
            }
            a aVar = f29720v;
            if (aVar == null) {
                f29720v = this;
                return true;
            }
            if (!this.f29735m) {
                if (!(aVar != null ? aVar.f29735m : false)) {
                    return true;
                }
            } else if (aVar == this) {
                return true;
            }
            return false;
        }

        private final void s(int i10, Drawable drawable, Drawable drawable2) {
            PaintDrawable paintDrawable = new PaintDrawable(i10);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(h());
            }
            setBackground(new LayerDrawable(drawable2 != null ? new Drawable[]{paintDrawable, drawable2, drawable} : new Drawable[]{paintDrawable, drawable}));
        }

        @Override // ea.o.d
        public boolean a() {
            return o.d.a.d(this);
        }

        @Override // ea.o.d
        public boolean b(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 3 || event.getAction() == 1 || event.getActionMasked() == 6) {
                return false;
            }
            boolean q10 = q();
            if (q10) {
                this.f29741s = true;
            }
            return q10;
        }

        @Override // ea.o.d
        public boolean c(AbstractC3109d abstractC3109d) {
            return o.d.a.e(this, abstractC3109d);
        }

        @Override // ea.o.d
        public boolean d() {
            return o.d.a.f(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f10, float f11) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f10, float f11) {
            a aVar = f29720v;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f10, f11);
            }
        }

        @Override // ea.o.d
        public void e(MotionEvent motionEvent) {
            o.d.a.c(this, motionEvent);
        }

        @Override // ea.o.d
        public void f(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            p();
            this.f29741s = false;
        }

        public final float getBorderBottomLeftRadius() {
            return this.f29730h;
        }

        public final float getBorderBottomRightRadius() {
            return this.f29731i;
        }

        public final Integer getBorderColor() {
            return this.f29733k;
        }

        public final float getBorderRadius() {
            return this.f29727e;
        }

        public final String getBorderStyle() {
            return this.f29734l;
        }

        public final float getBorderTopLeftRadius() {
            return this.f29728f;
        }

        public final float getBorderTopRightRadius() {
            return this.f29729g;
        }

        public final float getBorderWidth() {
            return this.f29732j;
        }

        public final boolean getExclusive() {
            return this.f29735m;
        }

        public final Integer getRippleColor() {
            return this.f29723a;
        }

        public final Integer getRippleRadius() {
            return this.f29724b;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f29726d;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f29725c;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            Intrinsics.checkNotNullParameter(ev, "ev");
            if (super.onInterceptTouchEvent(ev)) {
                return true;
            }
            onTouchEvent(ev);
            return isPressed();
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            this.f29740r = true;
            return super.onKeyUp(i10, keyEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            if (event.getAction() == 3) {
                p();
            }
            if (this.f29738p == eventTime && this.f29739q == action && action != 3) {
                return false;
            }
            this.f29738p = eventTime;
            this.f29739q = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (o(this, null, 1, null)) {
                return false;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (com.swmansion.gesturehandler.react.a.c(context)) {
                j m10 = m();
                if (m10 != null) {
                    m10.r(this);
                }
            } else if (this.f29740r) {
                j m11 = m();
                if (m11 != null) {
                    m11.r(this);
                }
                this.f29740r = false;
            }
            if (f29721w != this) {
                return false;
            }
            p();
            f29721w = null;
            return super.performClick();
        }

        public final void r() {
            if (this.f29737o) {
                this.f29737o = false;
                if (this.f29736n == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable k10 = k();
                Drawable j10 = j();
                if (getHasBorderRadii() && (k10 instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(h());
                    ((RippleDrawable) k10).setDrawableByLayerId(R.id.mask, paintDrawable);
                }
                if (this.f29725c) {
                    setForeground(k10);
                    int i10 = this.f29736n;
                    if (i10 != 0) {
                        s(i10, j10, null);
                        return;
                    }
                    return;
                }
                int i11 = this.f29736n;
                if (i11 == 0 && this.f29723a == null) {
                    setBackground(new LayerDrawable(new Drawable[]{k10, j10}));
                } else {
                    s(i11, j10, k10);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundColor(int i10) {
            this.f29736n = i10;
            this.f29737o = true;
        }

        public final void setBorderBottomLeftRadius(float f10) {
            this.f29730h = f10 * getResources().getDisplayMetrics().density;
            this.f29737o = true;
        }

        public final void setBorderBottomRightRadius(float f10) {
            this.f29731i = f10 * getResources().getDisplayMetrics().density;
            this.f29737o = true;
        }

        public final void setBorderColor(Integer num) {
            this.f29733k = num;
            this.f29737o = true;
        }

        public final void setBorderRadius(float f10) {
            this.f29727e = f10 * getResources().getDisplayMetrics().density;
            this.f29737o = true;
        }

        public final void setBorderStyle(String str) {
            this.f29734l = str;
            this.f29737o = true;
        }

        public final void setBorderTopLeftRadius(float f10) {
            this.f29728f = f10 * getResources().getDisplayMetrics().density;
            this.f29737o = true;
        }

        public final void setBorderTopRightRadius(float f10) {
            this.f29729g = f10 * getResources().getDisplayMetrics().density;
            this.f29737o = true;
        }

        public final void setBorderWidth(float f10) {
            this.f29732j = f10 * getResources().getDisplayMetrics().density;
            this.f29737o = true;
        }

        public final void setExclusive(boolean z10) {
            this.f29735m = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
        
            if (r0.f29735m == true) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            if (o(r3, null, 1, null) != false) goto L16;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void setPressed(boolean z10) {
            boolean z11;
            if (z10 && q()) {
                f29721w = this;
            }
            if (!this.f29735m) {
                a aVar = f29720v;
                z11 = true;
                if (aVar != null) {
                }
            }
            z11 = false;
            if (!z10 || f29720v == this || z11) {
                this.f29741s = z10;
                super.setPressed(z10);
            }
            if (z10 || f29720v != this) {
                return;
            }
            this.f29741s = false;
        }

        public final void setRippleColor(Integer num) {
            this.f29723a = num;
            this.f29737o = true;
        }

        public final void setRippleRadius(Integer num) {
            this.f29724b = num;
            this.f29737o = true;
        }

        public final void setTouched(boolean z10) {
            this.f29741s = z10;
        }

        public final void setUseBorderlessDrawable(boolean z10) {
            this.f29726d = z10;
        }

        public final void setUseDrawableOnForeground(boolean z10) {
            this.f29725c = z10;
            this.f29737o = true;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate, reason: from getter */
    protected c1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(F0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.r();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = Snapshot.BORDER_BOTTOM_LEFT_RADIUS)
    public void setBorderBottomLeftRadius(a view, float borderBottomLeftRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = Snapshot.BORDER_BOTTOM_RIGHT_RADIUS)
    public void setBorderBottomRightRadius(a view, float borderBottomRightRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // h5.E
    @Z4.a(name = "borderColor")
    public void setBorderColor(a view, Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = Snapshot.BORDER_RADIUS)
    public void setBorderRadius(a view, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // h5.E
    @Z4.a(name = "borderStyle")
    public void setBorderStyle(a view, String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = Snapshot.BORDER_TOP_LEFT_RADIUS)
    public void setBorderTopLeftRadius(a view, float borderTopLeftRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    @Z4.a(name = Snapshot.BORDER_TOP_RIGHT_RADIUS)
    public void setBorderTopRightRadius(a view, float borderTopRightRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // h5.E
    @Z4.a(name = "borderWidth")
    public void setBorderWidth(a view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderWidth(borderWidth);
    }

    @Override // h5.E
    @Z4.a(name = "borderless")
    public void setBorderless(a view, boolean useBorderlessDrawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // h5.E
    @Z4.a(name = AppConstants.VIDEO_RECORDING_ENABLED)
    public void setEnabled(a view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(enabled);
    }

    @Override // h5.E
    @Z4.a(name = "exclusive")
    public void setExclusive(a view, boolean exclusive) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // h5.E
    @Z4.a(name = "foreground")
    public void setForeground(a view, boolean useDrawableOnForeground) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // h5.E
    @Z4.a(name = "rippleColor")
    public void setRippleColor(a view, Integer rippleColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // h5.E
    @Z4.a(name = "rippleRadius")
    public void setRippleRadius(a view, int rippleRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // h5.E
    @Z4.a(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(a view, boolean touchSoundDisabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }
}
