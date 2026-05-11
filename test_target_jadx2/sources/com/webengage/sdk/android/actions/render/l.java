package com.webengage.sdk.android.actions.render;

import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.WebEngageConstant;

/* loaded from: classes2.dex */
class l {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30395a;

        static {
            int[] iArr = new int[WebEngageConstant.STYLE.values().length];
            f30395a = iArr;
            try {
                iArr[WebEngageConstant.STYLE.BIG_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30395a[WebEngageConstant.STYLE.BIG_PICTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30395a[WebEngageConstant.STYLE.CAROUSEL_V1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30395a[WebEngageConstant.STYLE.RATING_V1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30395a[WebEngageConstant.STYLE.TIMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30395a[WebEngageConstant.STYLE.PROGRESS_BAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30395a[WebEngageConstant.STYLE.BIG_TIMER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30395a[WebEngageConstant.STYLE.OVERLAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static CustomPushRender a(WebEngageConstant.STYLE style) {
        switch (a.f30395a[style.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new C2953b();
            case 3:
                return new d();
            case 4:
                return new m();
            case 5:
            case 6:
            case 7:
                return new p();
            case 8:
                return new h();
            default:
                return null;
        }
    }

    static CustomPushRerender b(WebEngageConstant.STYLE style) {
        switch (a.f30395a[style.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new C2953b();
            case 3:
                return new d();
            case 4:
                return new m();
            case 5:
            case 6:
            case 7:
                return new p();
            case 8:
                return new h();
            default:
                return null;
        }
    }
}
