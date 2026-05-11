package com.facebook.react.views.image;

import android.graphics.Shader;
import c3.AbstractC1721a;
import kotlin.jvm.internal.Intrinsics;
import y3.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22523a = new d();

    private d() {
    }

    public static final Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static final p.b b() {
        p.b CENTER_CROP = p.b.f45293i;
        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
        return CENTER_CROP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final p.b c(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        p.b FIT_XY = p.b.f45285a;
                        Intrinsics.checkNotNullExpressionValue(FIT_XY, "FIT_XY");
                        return FIT_XY;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        p.b CENTER_INSIDE = p.b.f45292h;
                        Intrinsics.checkNotNullExpressionValue(CENTER_INSIDE, "CENTER_INSIDE");
                        return CENTER_INSIDE;
                    }
                    break;
                case -934531685:
                    if (str.equals("repeat")) {
                        return i.f22561l.a();
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        p.b CENTER_CROP = p.b.f45293i;
                        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
                        return CENTER_CROP;
                    }
                    break;
                case 951526612:
                    if (str.equals("contain")) {
                        p.b FIT_CENTER = p.b.f45289e;
                        Intrinsics.checkNotNullExpressionValue(FIT_CENTER, "FIT_CENTER");
                        return FIT_CENTER;
                    }
                    break;
            }
        }
        if (str != null) {
            AbstractC1721a.J("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return b();
    }

    public static final Shader.TileMode d(String str) {
        if (Intrinsics.b("contain", str) || Intrinsics.b("cover", str) || Intrinsics.b("stretch", str) || Intrinsics.b("center", str)) {
            return Shader.TileMode.CLAMP;
        }
        if (Intrinsics.b("repeat", str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str != null) {
            AbstractC1721a.J("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return a();
    }
}
