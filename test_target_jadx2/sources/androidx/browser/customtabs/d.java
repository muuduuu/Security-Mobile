package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import androidx.core.app.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f14291a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f14292b;

    private static class a {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f14295c;

        /* renamed from: d, reason: collision with root package name */
        private Bundle f14296d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f14297e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray f14298f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f14299g;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f14293a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0248a f14294b = new a.C0248a();

        /* renamed from: h, reason: collision with root package name */
        private int f14300h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f14301i = true;

        private void c() {
            String a10 = a.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundleExtra = this.f14293a.hasExtra("com.android.browser.headers") ? this.f14293a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a10);
            this.f14293a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void e(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            g.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f14293a.putExtras(bundle);
        }

        public b a() {
            f(1);
            return this;
        }

        public d b() {
            if (!this.f14293a.hasExtra("android.support.customtabs.extra.SESSION")) {
                e(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f14295c;
            if (arrayList != null) {
                this.f14293a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f14297e;
            if (arrayList2 != null) {
                this.f14293a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f14293a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f14301i);
            this.f14293a.putExtras(this.f14294b.a().a());
            Bundle bundle = this.f14299g;
            if (bundle != null) {
                this.f14293a.putExtras(bundle);
            }
            if (this.f14298f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f14298f);
                this.f14293a.putExtras(bundle2);
            }
            this.f14293a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f14300h);
            c();
            return new d(this.f14293a, this.f14296d);
        }

        public b d(int i10) {
            this.f14294b.b(i10);
            return this;
        }

        public b f(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f14300h = i10;
            if (i10 == 1) {
                this.f14293a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f14293a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f14293a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public b g(boolean z10) {
            this.f14293a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public b h(int i10) {
            this.f14294b.c(i10);
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f14291a = intent;
        this.f14292b = bundle;
    }
}
