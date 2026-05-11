package com.facebook.react.views.text;

import a5.C1351a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.e0;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.InterfaceC1956m0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import e5.EnumC3081c;
import e5.EnumC3083e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
public class m extends D implements InterfaceC1956m0 {

    /* renamed from: v, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f22823v = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: h, reason: collision with root package name */
    private boolean f22824h;

    /* renamed from: i, reason: collision with root package name */
    private int f22825i;

    /* renamed from: j, reason: collision with root package name */
    private TextUtils.TruncateAt f22826j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22827k;

    /* renamed from: l, reason: collision with root package name */
    private float f22828l;

    /* renamed from: m, reason: collision with root package name */
    private float f22829m;

    /* renamed from: n, reason: collision with root package name */
    private float f22830n;

    /* renamed from: o, reason: collision with root package name */
    private int f22831o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22832p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22833q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22834r;

    /* renamed from: s, reason: collision with root package name */
    private e5.k f22835s;

    /* renamed from: t, reason: collision with root package name */
    private com.facebook.react.views.view.g f22836t;

    /* renamed from: u, reason: collision with root package name */
    private Spannable f22837u;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public m(Context context) {
        super(context);
        this.f22835s = e5.k.VISIBLE;
        t();
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof e0 ? (ReactContext) ((e0) context).getBaseContext() : (ReactContext) context;
    }

    private void s() {
        if (!Float.isNaN(this.f22828l)) {
            setTextSize(0, this.f22828l);
        }
        if (Float.isNaN(this.f22830n)) {
            return;
        }
        super.setLetterSpacing(this.f22830n);
    }

    private void t() {
        com.facebook.react.views.view.g gVar = this.f22836t;
        if (gVar != null) {
            gVar.a();
        }
        this.f22836t = new com.facebook.react.views.view.g(this);
        this.f22825i = Integer.MAX_VALUE;
        this.f22827k = false;
        this.f22831o = 0;
        this.f22832p = false;
        this.f22833q = false;
        this.f22834r = false;
        this.f22826j = TextUtils.TruncateAt.END;
        this.f22828l = Float.NaN;
        this.f22829m = Float.NaN;
        this.f22830n = 0.0f;
        this.f22835s = e5.k.VISIBLE;
        this.f22837u = null;
    }

    private static WritableMap u(int i10, int i11, int i12, int i13, int i14, int i15) {
        WritableMap createMap = Arguments.createMap();
        if (i10 == 8) {
            createMap.putString("visibility", "gone");
            createMap.putInt("index", i11);
        } else if (i10 == 0) {
            createMap.putString("visibility", "visible");
            createMap.putInt("index", i11);
            createMap.putDouble("left", C1944g0.e(i12));
            createMap.putDouble("top", C1944g0.e(i13));
            createMap.putDouble("right", C1944g0.e(i14));
            createMap.putDouble("bottom", C1944g0.e(i15));
        } else {
            createMap.putString("visibility", "unknown");
            createMap.putInt("index", i11);
        }
        return createMap;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (AbstractC1484a0.O(this)) {
            C1483a l10 = AbstractC1484a0.l(this);
            if (l10 instanceof G0.a) {
                return ((G0.a) l10).v(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.f22837u;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f22824h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o5.o oVar : (o5.o[]) spanned.getSpans(0, spanned.length(), o5.o.class)) {
                if (oVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f22833q);
        if (this.f22824h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o5.o oVar : (o5.o[]) spanned.getSpans(0, spanned.length(), o5.o.class)) {
                oVar.c();
            }
        }
    }

    @Override // androidx.appcompat.widget.D, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f22824h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o5.o oVar : (o5.o[]) spanned.getSpans(0, spanned.length(), o5.o.class)) {
                oVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        F4.c cVar = new F4.c("ReactTextView.onDraw");
        try {
            if (this.f22827k && getSpanned() != null && this.f22834r) {
                this.f22834r = false;
                Spannable spanned = getSpanned();
                float width = getWidth();
                com.facebook.yoga.p pVar = com.facebook.yoga.p.EXACTLY;
                s.a(spanned, width, pVar, getHeight(), pVar, this.f22829m, this.f22825i, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL);
                setText(getSpanned());
            }
            if (!G4.a.c()) {
                this.f22836t.d(canvas);
            } else if (this.f22835s != e5.k.VISIBLE) {
                C1931a.a(this, canvas);
            }
            super.onDraw(canvas);
            cVar.close();
        } catch (Throwable th) {
            try {
                cVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f22824h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o5.o oVar : (o5.o[]) spanned.getSpans(0, spanned.length(), o5.o.class)) {
                oVar.e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0102, code lost:
    
        if (r5 != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o5.p[] pVarArr;
        int i14;
        int i15;
        Spanned spanned;
        int lineRight;
        float lineWidth;
        int id2 = getId();
        if (!(getText() instanceof Spanned) || C1351a.a(id2) == 2) {
            return;
        }
        UIManagerModule uIManagerModule = (UIManagerModule) AbstractC4012a.c((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class));
        Spanned spanned2 = (Spanned) getText();
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        o5.p[] pVarArr2 = (o5.p[]) spanned2.getSpans(0, spanned2.length(), o5.p.class);
        ArrayList arrayList = this.f22832p ? new ArrayList(pVarArr2.length) : null;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int length = pVarArr2.length;
        int i18 = 0;
        while (i18 < length) {
            o5.p pVar = pVarArr2[i18];
            View resolveView = uIManagerModule.resolveView(pVar.b());
            int spanStart = spanned2.getSpanStart(pVar);
            int lineForOffset = layout.getLineForOffset(spanStart);
            if ((layout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) && lineForOffset < this.f22825i && spanStart < layout.getLineEnd(lineForOffset)) {
                int c10 = pVar.c();
                int a10 = pVar.a();
                pVarArr = pVarArr2;
                boolean isRtlCharAt = layout.isRtlCharAt(spanStart);
                i14 = length;
                i15 = id2;
                boolean z11 = layout.getParagraphDirection(lineForOffset) == -1;
                if (spanStart == spanned2.length() - 1) {
                    if (spanned2.length() > 0) {
                        spanned = spanned2;
                        if (spanned2.charAt(layout.getLineEnd(lineForOffset) - 1) == '\n') {
                            lineWidth = layout.getLineMax(lineForOffset);
                            if (z11) {
                                lineRight = (int) layout.getLineRight(lineForOffset);
                                lineRight -= c10;
                                int totalPaddingRight = lineRight + (!isRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                                int i19 = i10 + totalPaddingRight;
                                int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - a10;
                                int i20 = i11 + totalPaddingTop;
                                if (i16 > totalPaddingRight) {
                                }
                                int i21 = i19 + c10;
                                int i22 = i20 + a10;
                                resolveView.setVisibility(r14);
                                resolveView.layout(i19, i20, i21, i22);
                                if (!this.f22832p) {
                                }
                            } else {
                                lineRight = i16 - ((int) lineWidth);
                                int totalPaddingRight2 = lineRight + (!isRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                                int i192 = i10 + totalPaddingRight2;
                                int totalPaddingTop2 = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - a10;
                                int i202 = i11 + totalPaddingTop2;
                                int i23 = (i16 > totalPaddingRight2 || i17 <= totalPaddingTop2) ? 8 : 0;
                                int i212 = i192 + c10;
                                int i222 = i202 + a10;
                                resolveView.setVisibility(i23);
                                resolveView.layout(i192, i202, i212, i222);
                                if (!this.f22832p) {
                                    arrayList.add(u(i23, spanStart, i192, i202, i212, i222));
                                }
                            }
                        }
                    } else {
                        spanned = spanned2;
                    }
                    lineWidth = layout.getLineWidth(lineForOffset);
                    if (z11) {
                    }
                } else {
                    spanned = spanned2;
                    int primaryHorizontal = (int) (z11 == isRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart));
                    lineRight = z11 ? i16 - (((int) layout.getLineRight(lineForOffset)) - primaryHorizontal) : primaryHorizontal;
                }
            } else {
                i15 = id2;
                spanned = spanned2;
                pVarArr = pVarArr2;
                i14 = length;
                resolveView.setVisibility(8);
                if (this.f22832p) {
                    arrayList.add(u(8, spanStart, -1, -1, -1, -1));
                }
            }
            i18++;
            length = i14;
            pVarArr2 = pVarArr;
            id2 = i15;
            spanned2 = spanned;
        }
        int i24 = id2;
        if (this.f22832p) {
            Collections.sort(arrayList, new a());
            WritableArray createArray = Arguments.createArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                createArray.pushMap((WritableMap) it.next());
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putArray("inlineViews", createArray);
            if (uIManagerModule != null) {
                uIManagerModule.receiveEvent(i24, "topInlineViewLayout", createMap);
            }
        }
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        F4.c cVar = new F4.c("ReactTextView.onMeasure");
        try {
            super.onMeasure(i10, i11);
            cVar.close();
        } catch (Throwable th) {
            try {
                cVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f22824h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o5.o oVar : (o5.o[]) spanned.getSpans(0, spanned.length(), o5.o.class)) {
                oVar.f();
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1956m0
    public int reactTagForTouch(float f10, float f11) {
        int i10;
        CharSequence text = getText();
        int id2 = getId();
        int i11 = (int) f10;
        int i12 = (int) f11;
        Layout layout = getLayout();
        if (layout == null) {
            return id2;
        }
        int lineForVertical = layout.getLineForVertical(i12);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i11 >= lineLeft && i11 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i11);
                o5.k[] kVarArr = (o5.k[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, o5.k.class);
                if (kVarArr != null) {
                    int length = text.length();
                    for (int i13 = 0; i13 < kVarArr.length; i13++) {
                        int spanStart = spanned.getSpanStart(kVarArr[i13]);
                        int spanEnd = spanned.getSpanEnd(kVarArr[i13]);
                        if (spanEnd >= offsetForHorizontal && (i10 = spanEnd - spanStart) <= length) {
                            id2 = kVarArr[i13].a();
                            length = i10;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e10) {
                AbstractC1721a.m("ReactNative", "Crash in HorizontalMeasurementProvider: " + e10.getMessage());
            }
        }
        return id2;
    }

    public void setAdjustFontSizeToFit(boolean z10) {
        this.f22827k = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (G4.a.c()) {
            C1931a.i(this, Integer.valueOf(i10));
        } else {
            this.f22836t.e(i10);
        }
    }

    public void setBorderRadius(float f10) {
        x(f10, EnumC3081c.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        if (G4.a.c()) {
            C1931a.m(this, str == null ? null : EnumC3083e.fromString(str));
        } else {
            this.f22836t.i(str);
        }
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i10) {
        super.setBreakStrategy(i10);
        this.f22834r = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f22826j = truncateAt;
    }

    public void setFontSize(float f10) {
        this.f22828l = (float) (this.f22827k ? Math.ceil(C1944g0.i(f10)) : Math.ceil(C1944g0.g(f10)));
        s();
    }

    void setGravityHorizontal(int i10) {
        if (i10 == 0) {
            i10 = 8388611;
        }
        setGravity(i10 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i10) {
        if (i10 == 0) {
            i10 = 48;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i10) {
        super.setHyphenationFrequency(i10);
        this.f22834r = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z10) {
        super.setIncludeFontPadding(z10);
        this.f22834r = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        this.f22830n = C1944g0.g(f10) / this.f22828l;
        s();
    }

    public void setLinkifyMask(int i10) {
        this.f22831o = i10;
    }

    public void setMinimumFontSize(float f10) {
        this.f22829m = f10;
        this.f22834r = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z10) {
        this.f22832p = z10;
    }

    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = Integer.MAX_VALUE;
        }
        this.f22825i = i10;
        setMaxLines(i10);
        this.f22834r = true;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f22835s = e5.k.VISIBLE;
        } else {
            e5.k fromString = e5.k.fromString(str);
            if (fromString == null) {
                fromString = e5.k.VISIBLE;
            }
            this.f22835s = fromString;
        }
        this.f22836t.k(str);
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.f22837u = spannable;
        this.f22834r = true;
    }

    public void setText(i iVar) {
        int justificationMode;
        F4.c cVar = new F4.c("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.f22824h = iVar.b();
            if (getLayoutParams() == null) {
                setLayoutParams(f22823v);
            }
            Spannable i10 = iVar.i();
            int i11 = this.f22831o;
            if (i11 > 0) {
                Linkify.addLinks(i10, i11);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(i10);
            float f10 = iVar.f();
            float h10 = iVar.h();
            float g10 = iVar.g();
            float e10 = iVar.e();
            if (f10 != -1.0f && h10 != -1.0f && g10 != -1.0f && e10 != -1.0f) {
                setPadding((int) Math.floor(f10), (int) Math.floor(h10), (int) Math.floor(g10), (int) Math.floor(e10));
            }
            int j10 = iVar.j();
            if (j10 != getGravityHorizontal()) {
                setGravityHorizontal(j10);
            }
            if (getBreakStrategy() != iVar.k()) {
                setBreakStrategy(iVar.k());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                justificationMode = getJustificationMode();
                if (justificationMode != iVar.d()) {
                    setJustificationMode(iVar.d());
                }
            }
            requestLayout();
            cVar.close();
        } catch (Throwable th) {
            try {
                cVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z10) {
        this.f22833q = z10;
        super.setTextIsSelectable(z10);
    }

    void v() {
        t();
        if (G4.a.c()) {
            C1931a.h(this);
        }
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(f22823v);
        super.setText((CharSequence) null);
        s();
        setGravity(8388659);
        setNumberOfLines(this.f22825i);
        setAdjustFontSizeToFit(this.f22827k);
        setLinkifyMask(this.f22831o);
        setTextIsSelectable(this.f22833q);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.f22826j);
        setEnabled(true);
        if (i10 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        z();
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f22824h && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o5.o oVar : (o5.o[]) spanned.getSpans(0, spanned.length(), o5.o.class)) {
                if (oVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void w(int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(this, e5.j.values()[i10], num);
        } else {
            this.f22836t.f(i10, num);
        }
    }

    public void x(float f10, int i10) {
        if (G4.a.c()) {
            C1931a.l(this, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(C1944g0.e(f10), Y.POINT));
        } else {
            this.f22836t.h(f10, i10);
        }
    }

    public void y(int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(this, e5.j.values()[i10], Float.valueOf(C1944g0.e(f10)));
        } else {
            this.f22836t.j(i10, f10);
        }
    }

    public void z() {
        setEllipsize((this.f22825i == Integer.MAX_VALUE || this.f22827k) ? null : this.f22826j);
    }
}
