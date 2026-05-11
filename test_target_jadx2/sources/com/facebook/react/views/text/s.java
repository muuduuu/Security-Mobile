package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.C1944g0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o5.C3756a;
import x4.C5109a;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f22878a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f22879b;

    /* renamed from: c, reason: collision with root package name */
    private static final TextPaint f22880c;

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f22881d;

    static {
        C5109a c5109a = C5109a.f44774a;
        f22878a = false;
        f22879b = s.class.getSimpleName();
        f22880c = new TextPaint(1);
        f22881d = new ConcurrentHashMap();
    }

    public static void a(Spannable spannable, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, double d10, int i10, boolean z10, int i11, int i12, Layout.Alignment alignment) {
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, f22880c);
        Layout d11 = d(spannable, isBoring, f10, pVar, z10, i11, i12, alignment);
        int g10 = (int) (Double.isNaN(d10) ? C1944g0.g(4.0f) : d10);
        int i13 = 0;
        int i14 = g10;
        for (o5.d dVar : (o5.d[]) spannable.getSpans(0, spannable.length(), o5.d.class)) {
            i14 = Math.max(i14, dVar.getSize());
        }
        int i15 = i14;
        while (i15 > g10) {
            if ((i10 == -1 || i10 == 0 || d11.getLineCount() <= i10) && (pVar2 == com.facebook.yoga.p.UNDEFINED || d11.getHeight() <= f11)) {
                return;
            }
            int max = i15 - Math.max(1, (int) C1944g0.g(1.0f));
            float f12 = max / i14;
            o5.d[] dVarArr = (o5.d[]) spannable.getSpans(i13, spannable.length(), o5.d.class);
            int length = dVarArr.length;
            int i16 = i13;
            while (i16 < length) {
                o5.d dVar2 = dVarArr[i16];
                spannable.setSpan(new o5.d((int) Math.max(dVar2.getSize() * f12, g10)), spannable.getSpanStart(dVar2), spannable.getSpanEnd(dVar2), spannable.getSpanFlags(dVar2));
                spannable.removeSpan(dVar2);
                i16++;
                f12 = f12;
            }
            d11 = d(spannable, isBoring, f10, pVar, z10, i11, i12, alignment);
            i15 = max;
            i13 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0088, code lost:
    
        r21.add(new o5.m(r6, r8, new o5.f(r11)));
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(Context context, com.facebook.react.common.mapbuffer.a aVar, SpannableStringBuilder spannableStringBuilder, List list) {
        int count = aVar.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            com.facebook.react.common.mapbuffer.a x12 = aVar.x1(i10);
            int length = spannableStringBuilder.length();
            q a10 = q.a(x12.x1(5));
            spannableStringBuilder.append((CharSequence) t.apply(x12.getString(0), a10.f22860p));
            int length2 = spannableStringBuilder.length();
            int i11 = x12.C(1) ? x12.getInt(1) : -1;
            if (x12.C(2) && x12.getBoolean(2)) {
                list.add(new o5.m(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new o5.p(i11, (int) C1944g0.h(x12.getDouble(3)), (int) C1944g0.h(x12.getDouble(4)))));
            } else if (length2 >= length) {
                if ((r5 = a10.f22869y) != null) {
                    if (a10.f22846b) {
                        list.add(new o5.m(length, length2, new o5.g(a10.f22849e)));
                    }
                    if (a10.f22850f) {
                        list.add(new o5.m(length, length2, new o5.e(a10.f22851g)));
                    }
                    if (!Float.isNaN(a10.g())) {
                        list.add(new o5.m(length, length2, new o5.h(a10.g())));
                    }
                    if (!Float.isNaN(a10.f())) {
                        list.add(new o5.m(length, length2, new C3756a(a10.f())));
                    }
                    list.add(new o5.m(length, length2, new o5.d(a10.f22854j)));
                    if (a10.f22870z == -1 || a10.f22840A != -1 || a10.f22841B != null) {
                        list.add(new o5.m(length, length2, new o5.c(a10.f22870z, a10.f22840A, a10.f22842C, a10.f22841B, context.getAssets())));
                    }
                    if (a10.f22865u) {
                        list.add(new o5.m(length, length2, new o5.l()));
                    }
                    if (a10.f22866v) {
                        list.add(new o5.m(length, length2, new o5.j()));
                    }
                    if ((a10.f22861q == 0.0f || a10.f22862r != 0.0f || a10.f22863s != 0.0f) && Color.alpha(a10.f22864t) != 0) {
                        list.add(new o5.m(length, length2, new o5.n(a10.f22861q, a10.f22862r, a10.f22863s, a10.f22864t)));
                    }
                    if (!Float.isNaN(a10.b())) {
                        list.add(new o5.m(length, length2, new o5.b(a10.b())));
                    }
                    list.add(new o5.m(length, length2, new o5.k(i11)));
                } else {
                    if (a10.f22846b) {
                    }
                    if (a10.f22850f) {
                    }
                    if (!Float.isNaN(a10.g())) {
                    }
                    if (!Float.isNaN(a10.f())) {
                    }
                    list.add(new o5.m(length, length2, new o5.d(a10.f22854j)));
                    if (a10.f22870z == -1) {
                    }
                    list.add(new o5.m(length, length2, new o5.c(a10.f22870z, a10.f22840A, a10.f22842C, a10.f22841B, context.getAssets())));
                    if (a10.f22865u) {
                    }
                    if (a10.f22866v) {
                    }
                    if (a10.f22861q == 0.0f) {
                    }
                    list.add(new o5.m(length, length2, new o5.n(a10.f22861q, a10.f22862r, a10.f22863s, a10.f22864t)));
                    if (!Float.isNaN(a10.b())) {
                    }
                    list.add(new o5.m(length, length2, new o5.k(i11)));
                }
            }
        }
    }

    public static Layout c(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f10, float f11, n nVar) {
        Spannable g10 = g(context, aVar, nVar);
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(g10, f22880c);
        int i10 = q.i(aVar2.getString(2));
        boolean z10 = aVar2.C(4) ? aVar2.getBoolean(4) : true;
        int c10 = q.c(aVar2.getString(5));
        boolean z11 = aVar2.C(3) ? aVar2.getBoolean(3) : false;
        int i11 = aVar2.C(0) ? aVar2.getInt(0) : -1;
        Layout.Alignment h10 = h(aVar, g10);
        if (z11) {
            a(g10, f10, com.facebook.yoga.p.EXACTLY, f11, com.facebook.yoga.p.UNDEFINED, aVar2.C(6) ? aVar2.getDouble(6) : Double.NaN, i11, z10, i10, c10, h10);
        }
        return d(g10, isBoring, f10, com.facebook.yoga.p.EXACTLY, z10, i10, c10, h10);
    }

    private static Layout d(Spannable spannable, BoringLayout.Metrics metrics, float f10, com.facebook.yoga.p pVar, boolean z10, int i10, int i11, Layout.Alignment alignment) {
        int i12;
        int length = spannable.length();
        boolean z11 = pVar == com.facebook.yoga.p.UNDEFINED || f10 < 0.0f;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, f22880c) : Float.NaN;
        boolean isRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, length);
        if (metrics == null && (z11 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f10))) {
            if (pVar == com.facebook.yoga.p.EXACTLY) {
                desiredWidth = f10;
            }
            return StaticLayout.Builder.obtain(spannable, 0, length, f22880c, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR).build();
        }
        if (metrics == null || (!z11 && metrics.width > f10)) {
            StaticLayout.Builder textDirection = StaticLayout.Builder.obtain(spannable, 0, length, f22880c, (int) Math.ceil(f10)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (Build.VERSION.SDK_INT >= 28) {
                textDirection.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection.build();
        }
        int i13 = metrics.width;
        if (pVar == com.facebook.yoga.p.EXACTLY) {
            i13 = (int) Math.ceil(f10);
        }
        if (metrics.width < 0) {
            ReactSoftExceptionLogger.logSoftException(f22879b, new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
            i12 = 0;
        } else {
            i12 = i13;
        }
        return BoringLayout.make(spannable, f22880c, i12, alignment, 1.0f, 0.0f, metrics, z10);
    }

    private static Spannable e(Context context, com.facebook.react.common.mapbuffer.a aVar, n nVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        b(context, aVar.x1(2), spannableStringBuilder, arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((o5.m) arrayList.get((arrayList.size() - i10) - 1)).a(spannableStringBuilder, i10);
        }
        if (nVar != null) {
            nVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static void f(int i10) {
        if (f22878a) {
            AbstractC1721a.m(f22879b, "Delete cached spannable for tag[" + i10 + "]");
        }
        f22881d.remove(Integer.valueOf(i10));
    }

    public static Spannable g(Context context, com.facebook.react.common.mapbuffer.a aVar, n nVar) {
        if (!aVar.C(3)) {
            return e(context, aVar, nVar);
        }
        return (Spannable) f22881d.get(Integer.valueOf(aVar.getInt(3)));
    }

    public static Layout.Alignment h(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable) {
        if (!aVar.C(2)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        boolean z10 = j(aVar) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        Layout.Alignment alignment = z10 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        com.facebook.react.common.mapbuffer.a x12 = aVar.x1(2);
        if (x12.getCount() == 0) {
            return alignment;
        }
        com.facebook.react.common.mapbuffer.a x13 = x12.x1(0).x1(5);
        if (!x13.C(12)) {
            return alignment;
        }
        String string = x13.getString(12);
        if (string.equals("center")) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (string.equals("right")) {
            return z10 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return alignment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r4 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0015, code lost:
    
        if (r4 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
    
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable, int i10) {
        Layout.Alignment h10 = h(aVar, spannable);
        boolean isRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        if (h10 != Layout.Alignment.ALIGN_NORMAL) {
            if (h10 != Layout.Alignment.ALIGN_OPPOSITE) {
                if (h10 == Layout.Alignment.ALIGN_CENTER) {
                    return 1;
                }
                return i10;
            }
        }
    }

    public static boolean j(com.facebook.react.common.mapbuffer.a aVar) {
        if (!aVar.C(2)) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a x12 = aVar.x1(2);
        if (x12.getCount() == 0) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a x13 = x12.x1(0).x1(5);
        return x13.C(23) && q.e(x13.getString(23)) == 1;
    }

    public static WritableArray k(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f10, float f11) {
        Layout c10 = c(context, aVar, aVar2, f10, f11, null);
        return b.a(c10.getText(), c10, f22880c, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r5 > r21) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r3 > r23) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long l(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, n nVar, float[] fArr) {
        float f12;
        float f13;
        int i10;
        char c10;
        float f14;
        boolean z10;
        char c11;
        float lineWidth;
        Layout c12 = c(context, aVar, aVar2, f10, f11, nVar);
        Spannable spannable = (Spannable) c12.getText();
        if (spannable == null) {
            return 0L;
        }
        int i11 = 0;
        int i12 = -1;
        int i13 = aVar2.C(0) ? aVar2.getInt(0) : -1;
        int lineCount = (i13 == -1 || i13 == 0) ? c12.getLineCount() : Math.min(i13, c12.getLineCount());
        char c13 = '\n';
        boolean z11 = true;
        if (pVar != com.facebook.yoga.p.EXACTLY) {
            f12 = 0.0f;
            for (int i14 = 0; i14 < lineCount; i14++) {
                float lineWidth2 = (spannable.length() <= 0 || spannable.charAt(c12.getLineEnd(i14) - 1) != '\n') ? c12.getLineWidth(i14) : c12.getLineMax(i14);
                if (lineWidth2 > f12) {
                    f12 = lineWidth2;
                }
            }
            if (pVar == com.facebook.yoga.p.AT_MOST) {
            }
            if (Build.VERSION.SDK_INT > 29) {
                f12 = (float) Math.ceil(f12);
            }
            if (pVar2 != com.facebook.yoga.p.EXACTLY) {
                f13 = c12.getLineBottom(lineCount - 1);
                if (pVar2 == com.facebook.yoga.p.AT_MOST) {
                }
                i10 = 0;
                int i15 = 0;
                while (i10 < spannable.length()) {
                    int nextSpanTransition = spannable.nextSpanTransition(i10, spannable.length(), o5.p.class);
                    o5.p[] pVarArr = (o5.p[]) spannable.getSpans(i10, nextSpanTransition, o5.p.class);
                    int length = pVarArr.length;
                    int i16 = i11;
                    while (i16 < length) {
                        o5.p pVar3 = pVarArr[i16];
                        int spanStart = spannable.getSpanStart(pVar3);
                        int lineForOffset = c12.getLineForOffset(spanStart);
                        if (c12.getEllipsisCount(lineForOffset) <= 0 || spanStart < c12.getLineStart(lineForOffset) + c12.getEllipsisStart(lineForOffset) || spanStart >= c12.getLineEnd(lineForOffset)) {
                            float c14 = pVar3.c();
                            float a10 = pVar3.a();
                            boolean isRtlCharAt = c12.isRtlCharAt(spanStart);
                            boolean z12 = c12.getParagraphDirection(lineForOffset) == i12;
                            if (spanStart == spannable.length() - 1) {
                                if (spannable.length() > 0) {
                                    c11 = '\n';
                                    if (spannable.charAt(c12.getLineEnd(lineForOffset) - 1) == '\n') {
                                        lineWidth = c12.getLineMax(lineForOffset);
                                        f14 = !z12 ? f12 - lineWidth : c12.getLineRight(lineForOffset) - c14;
                                        c10 = c11;
                                    }
                                } else {
                                    c11 = '\n';
                                }
                                lineWidth = c12.getLineWidth(lineForOffset);
                                if (!z12) {
                                }
                                c10 = c11;
                            } else {
                                c10 = '\n';
                                float primaryHorizontal = z12 == isRtlCharAt ? c12.getPrimaryHorizontal(spanStart) : c12.getSecondaryHorizontal(spanStart);
                                float lineRight = (!z12 || isRtlCharAt) ? primaryHorizontal : f12 - (c12.getLineRight(lineForOffset) - primaryHorizontal);
                                f14 = isRtlCharAt ? lineRight - c14 : lineRight;
                            }
                            int i17 = i15 * 2;
                            fArr[i17] = C1944g0.e(c12.getLineBaseline(lineForOffset) - a10);
                            z10 = true;
                            fArr[i17 + 1] = C1944g0.e(f14);
                            i15++;
                        } else {
                            c10 = c13;
                            z10 = z11;
                        }
                        i16++;
                        z11 = z10;
                        i11 = 0;
                        c13 = c10;
                        i12 = -1;
                    }
                    i10 = nextSpanTransition;
                }
                float e10 = C1944g0.e(f12);
                float e11 = C1944g0.e(f13);
                if (f22878a) {
                    AbstractC1721a.m(f22879b, "TextMeasure call ('" + ((Object) spannable) + "'): w: " + f12 + " px - h: " + f13 + " px - w : " + e10 + " sp - h: " + e11 + " sp");
                }
                return com.facebook.yoga.q.a(e10, e11);
            }
            f13 = f11;
            i10 = 0;
            int i152 = 0;
            while (i10 < spannable.length()) {
            }
            float e102 = C1944g0.e(f12);
            float e112 = C1944g0.e(f13);
            if (f22878a) {
            }
            return com.facebook.yoga.q.a(e102, e112);
        }
        f12 = f10;
        if (Build.VERSION.SDK_INT > 29) {
        }
        if (pVar2 != com.facebook.yoga.p.EXACTLY) {
        }
        f13 = f11;
        i10 = 0;
        int i1522 = 0;
        while (i10 < spannable.length()) {
        }
        float e1022 = C1944g0.e(f12);
        float e1122 = C1944g0.e(f13);
        if (f22878a) {
        }
        return com.facebook.yoga.q.a(e1022, e1122);
    }

    public static void m(int i10, Spannable spannable) {
        if (f22878a) {
            AbstractC1721a.m(f22879b, "Set cached spannable for tag[" + i10 + "]: " + spannable.toString());
        }
        f22881d.put(Integer.valueOf(i10), spannable);
    }
}
