package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f14278a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f14279b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14280c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14281d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0248a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f14282a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f14283b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f14284c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f14285d;

        public a a() {
            return new a(this.f14282a, this.f14283b, this.f14284c, this.f14285d);
        }

        public C0248a b(int i10) {
            this.f14283b = Integer.valueOf(i10);
            return this;
        }

        public C0248a c(int i10) {
            this.f14282a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f14278a = num;
        this.f14279b = num2;
        this.f14280c = num3;
        this.f14281d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f14278a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f14279b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f14280c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f14281d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
