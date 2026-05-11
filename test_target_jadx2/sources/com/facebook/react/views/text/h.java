package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1938d0;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.InterfaceC1969t0;
import com.facebook.react.uimanager.R0;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.Map;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
public class h extends c {

    /* renamed from: f0, reason: collision with root package name */
    private static final TextPaint f22806f0 = new TextPaint(1);

    /* renamed from: b0, reason: collision with root package name */
    private Spannable f22807b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f22808c0;

    /* renamed from: d0, reason: collision with root package name */
    private final com.facebook.yoga.o f22809d0;

    /* renamed from: e0, reason: collision with root package name */
    private final com.facebook.yoga.b f22810e0;

    class a implements com.facebook.yoga.o {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
        
            if (r2 > r21) goto L58;
         */
        @Override // com.facebook.yoga.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long W(com.facebook.yoga.r rVar, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2) {
            float f12;
            float f13 = f10;
            Spannable spannable = (Spannable) AbstractC4012a.d(h.this.f22807b0, "Spannable element has not been prepared in onBeforeLayout");
            Layout E12 = h.this.E1(spannable, f13, pVar);
            h hVar = h.this;
            int i10 = -1;
            int i11 = 0;
            int i12 = 1;
            if (hVar.f22776T) {
                int c10 = hVar.f22757A.c();
                int c11 = h.this.f22757A.c();
                float f14 = c10;
                int max = (int) Math.max(h.this.f22777U * f14, C1944g0.g(4.0f));
                while (c11 > max && ((h.this.f22764H != i10 && E12.getLineCount() > h.this.f22764H) || (pVar2 != com.facebook.yoga.p.UNDEFINED && E12.getHeight() > f11))) {
                    c11 -= Math.max(i12, (int) C1944g0.g(1.0f));
                    float f15 = c11 / f14;
                    o5.d[] dVarArr = (o5.d[]) spannable.getSpans(i11, spannable.length(), o5.d.class);
                    int length = dVarArr.length;
                    int i13 = i11;
                    while (i13 < length) {
                        o5.d dVar = dVarArr[i13];
                        spannable.setSpan(new o5.d((int) Math.max(dVar.getSize() * f15, max)), spannable.getSpanStart(dVar), spannable.getSpanEnd(dVar), spannable.getSpanFlags(dVar));
                        spannable.removeSpan(dVar);
                        i13++;
                        f15 = f15;
                    }
                    E12 = h.this.E1(spannable, f13, pVar);
                    i10 = -1;
                    i11 = 0;
                    i12 = 1;
                }
            }
            if (h.this.f22808c0) {
                F0 H10 = h.this.H();
                WritableArray a10 = com.facebook.react.views.text.b.a(spannable, E12, h.f22806f0, H10);
                WritableMap createMap = Arguments.createMap();
                createMap.putArray("lines", a10);
                if (H10.hasActiveReactInstance()) {
                    ((RCTEventEmitter) H10.getJSModule(RCTEventEmitter.class)).receiveEvent(h.this.r(), "topTextLayout", createMap);
                } else {
                    ReactSoftExceptionLogger.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
                }
            }
            int i14 = h.this.f22764H;
            int lineCount = i14 == -1 ? E12.getLineCount() : Math.min(i14, E12.getLineCount());
            if (pVar != com.facebook.yoga.p.EXACTLY) {
                float f16 = 0.0f;
                for (int i15 = 0; i15 < lineCount; i15++) {
                    float lineWidth = (spannable.length() <= 0 || spannable.charAt(E12.getLineEnd(i15) - 1) != '\n') ? E12.getLineWidth(i15) : E12.getLineMax(i15);
                    if (lineWidth > f16) {
                        f16 = lineWidth;
                    }
                }
                if (pVar != com.facebook.yoga.p.AT_MOST || f16 <= f13) {
                    f13 = f16;
                }
            }
            if (Build.VERSION.SDK_INT > 29) {
                f13 = (float) Math.ceil(f13);
            }
            if (pVar2 != com.facebook.yoga.p.EXACTLY) {
                f12 = E12.getLineBottom(lineCount - 1);
                if (pVar2 == com.facebook.yoga.p.AT_MOST) {
                }
                return com.facebook.yoga.q.a(f13, f12);
            }
            f12 = f11;
            return com.facebook.yoga.q.a(f13, f12);
        }
    }

    class b implements com.facebook.yoga.b {
        b() {
        }

        @Override // com.facebook.yoga.b
        public float a(com.facebook.yoga.r rVar, float f10, float f11) {
            Layout E12 = h.this.E1((Spannable) AbstractC4012a.d(h.this.f22807b0, "Spannable element has not been prepared in onBeforeLayout"), f10, com.facebook.yoga.p.EXACTLY);
            return E12.getLineBaseline(E12.getLineCount() - 1);
        }
    }

    public h(n nVar) {
        super(nVar);
        this.f22809d0 = new a();
        this.f22810e0 = new b();
        D1();
    }

    private int C1() {
        int i10 = this.f22765I;
        if (getLayoutDirection() != com.facebook.yoga.h.RTL) {
            return i10;
        }
        if (i10 == 5) {
            return 3;
        }
        if (i10 == 3) {
            return 5;
        }
        return i10;
    }

    private void D1() {
        if (u()) {
            return;
        }
        Y0(this.f22809d0);
        G0(this.f22810e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Layout E1(Spannable spannable, float f10, com.facebook.yoga.p pVar) {
        TextPaint textPaint = f22806f0;
        textPaint.setTextSize(this.f22757A.c());
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z10 = pVar == com.facebook.yoga.p.UNDEFINED || f10 < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int C12 = C1();
        if (C12 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (C12 != 3 && C12 == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (isBoring == null && (z10 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f10))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f22775S).setBreakStrategy(this.f22766J).setHyphenationFrequency(this.f22767K);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                hyphenationFrequency.setJustificationMode(this.f22768L);
            }
            if (i10 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
        if (isBoring != null && (z10 || isBoring.width <= f10)) {
            return BoringLayout.make(spannable, textPaint, Math.max(isBoring.width, 0), alignment2, 1.0f, 0.0f, isBoring, this.f22775S);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 29) {
            f10 = (float) Math.ceil(f10);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f10).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.f22775S).setBreakStrategy(this.f22766J).setHyphenationFrequency(this.f22767K);
        if (i11 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        return hyphenationFrequency2.build();
    }

    @Override // com.facebook.react.uimanager.C1971u0
    public void A0(R0 r02) {
        super.A0(r02);
        Spannable spannable = this.f22807b0;
        if (spannable != null) {
            r02.O(r(), new i(spannable, -1, this.f22782Z, l0(4), l0(1), l0(5), l0(3), C1(), this.f22766J, this.f22768L));
        }
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public void X(C1938d0 c1938d0) {
        this.f22807b0 = x1(this, null, true, c1938d0);
        y0();
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public Iterable o() {
        Map map = this.f22783a0;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) AbstractC4012a.d(this.f22807b0, "Spannable element has not been prepared in onBeforeLayout");
        o5.p[] pVarArr = (o5.p[]) spanned.getSpans(0, spanned.length(), o5.p.class);
        ArrayList arrayList = new ArrayList(pVarArr.length);
        for (o5.p pVar : pVarArr) {
            InterfaceC1969t0 interfaceC1969t0 = (InterfaceC1969t0) this.f22783a0.get(Integer.valueOf(pVar.b()));
            interfaceC1969t0.t();
            arrayList.add(interfaceC1969t0);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.C1971u0
    public boolean p0() {
        return true;
    }

    @Z4.a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z10) {
        this.f22808c0 = z10;
    }

    @Override // com.facebook.react.uimanager.C1971u0
    public boolean v0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.C1971u0
    public void y0() {
        super.y0();
        super.i();
    }
}
