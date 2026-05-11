package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;
import s0.AbstractC4303b;

/* loaded from: classes.dex */
public abstract class s {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f15761a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f15762b;

        /* renamed from: c, reason: collision with root package name */
        private final A[] f15763c;

        /* renamed from: d, reason: collision with root package name */
        private final A[] f15764d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15765e;

        /* renamed from: f, reason: collision with root package name */
        boolean f15766f;

        /* renamed from: g, reason: collision with root package name */
        private final int f15767g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f15768h;

        /* renamed from: i, reason: collision with root package name */
        public int f15769i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f15770j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f15771k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f15772l;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.c(null, BuildConfig.FLAVOR, i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f15771k;
        }

        public boolean b() {
            return this.f15765e;
        }

        public Bundle c() {
            return this.f15761a;
        }

        public IconCompat d() {
            int i10;
            if (this.f15762b == null && (i10 = this.f15769i) != 0) {
                this.f15762b = IconCompat.c(null, BuildConfig.FLAVOR, i10);
            }
            return this.f15762b;
        }

        public A[] e() {
            return this.f15763c;
        }

        public int f() {
            return this.f15767g;
        }

        public boolean g() {
            return this.f15766f;
        }

        public CharSequence h() {
            return this.f15770j;
        }

        public boolean i() {
            return this.f15772l;
        }

        public boolean j() {
            return this.f15768h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, A[] aArr, A[] aArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f15766f = true;
            this.f15762b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f15769i = iconCompat.e();
            }
            this.f15770j = e.e(charSequence);
            this.f15771k = pendingIntent;
            this.f15761a = bundle == null ? new Bundle() : bundle;
            this.f15763c = aArr;
            this.f15764d = aArr2;
            this.f15765e = z10;
            this.f15767g = i10;
            this.f15766f = z11;
            this.f15768h = z12;
            this.f15772l = z13;
        }
    }

    public static class b extends g {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f15773e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f15774f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f15775g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f15776h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f15777i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.s$b$b, reason: collision with other inner class name */
        private static class C0260b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.s.g
        public void b(r rVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(rVar.a()).setBigContentTitle(this.f15828b);
            IconCompat iconCompat = this.f15773e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0260b.a(bigContentTitle, this.f15773e.m(rVar instanceof t ? ((t) rVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f15773e.d());
                }
            }
            if (this.f15775g) {
                if (this.f15774f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f15774f.m(rVar instanceof t ? ((t) rVar).f() : null));
                }
            }
            if (this.f15830d) {
                bigContentTitle.setSummaryText(this.f15829c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0260b.c(bigContentTitle, this.f15777i);
                C0260b.b(bigContentTitle, this.f15776h);
            }
        }

        @Override // androidx.core.app.s.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f15774f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f15775g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f15773e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends g {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f15778e;

        @Override // androidx.core.app.s.g
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.s.g
        public void b(r rVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(rVar.a()).setBigContentTitle(this.f15828b).bigText(this.f15778e);
            if (this.f15830d) {
                bigText.setSummaryText(this.f15829c);
            }
        }

        @Override // androidx.core.app.s.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f15778e = e.e(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class f extends g {

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f15826e = new ArrayList();

        @Override // androidx.core.app.s.g
        public void b(r rVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(rVar.a()).setBigContentTitle(this.f15828b);
            if (this.f15830d) {
                bigContentTitle.setSummaryText(this.f15829c);
            }
            Iterator it = this.f15826e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.s.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public f h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f15826e.add(e.e(charSequence));
            }
            return this;
        }
    }

    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        protected e f15827a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f15828b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f15829c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15830d = false;

        public void a(Bundle bundle) {
            if (this.f15830d) {
                bundle.putCharSequence("android.summaryText", this.f15829c);
            }
            CharSequence charSequence = this.f15828b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(r rVar);

        protected abstract String c();

        public RemoteViews d(r rVar) {
            return null;
        }

        public RemoteViews e(r rVar) {
            return null;
        }

        public RemoteViews f(r rVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f15827a != eVar) {
                this.f15827a = eVar;
                if (eVar != null) {
                    eVar.w(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC4303b.f40686b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC4303b.f40685a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    public static class e {

        /* renamed from: A, reason: collision with root package name */
        boolean f15779A;

        /* renamed from: B, reason: collision with root package name */
        boolean f15780B;

        /* renamed from: C, reason: collision with root package name */
        String f15781C;

        /* renamed from: D, reason: collision with root package name */
        Bundle f15782D;

        /* renamed from: E, reason: collision with root package name */
        int f15783E;

        /* renamed from: F, reason: collision with root package name */
        int f15784F;

        /* renamed from: G, reason: collision with root package name */
        Notification f15785G;

        /* renamed from: H, reason: collision with root package name */
        RemoteViews f15786H;

        /* renamed from: I, reason: collision with root package name */
        RemoteViews f15787I;

        /* renamed from: J, reason: collision with root package name */
        RemoteViews f15788J;

        /* renamed from: K, reason: collision with root package name */
        String f15789K;

        /* renamed from: L, reason: collision with root package name */
        int f15790L;

        /* renamed from: M, reason: collision with root package name */
        String f15791M;

        /* renamed from: N, reason: collision with root package name */
        long f15792N;

        /* renamed from: O, reason: collision with root package name */
        int f15793O;

        /* renamed from: P, reason: collision with root package name */
        int f15794P;

        /* renamed from: Q, reason: collision with root package name */
        boolean f15795Q;

        /* renamed from: R, reason: collision with root package name */
        Notification f15796R;

        /* renamed from: S, reason: collision with root package name */
        boolean f15797S;

        /* renamed from: T, reason: collision with root package name */
        Object f15798T;

        /* renamed from: U, reason: collision with root package name */
        public ArrayList f15799U;

        /* renamed from: a, reason: collision with root package name */
        public Context f15800a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f15801b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f15802c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f15803d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f15804e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f15805f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f15806g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f15807h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f15808i;

        /* renamed from: j, reason: collision with root package name */
        IconCompat f15809j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f15810k;

        /* renamed from: l, reason: collision with root package name */
        int f15811l;

        /* renamed from: m, reason: collision with root package name */
        int f15812m;

        /* renamed from: n, reason: collision with root package name */
        boolean f15813n;

        /* renamed from: o, reason: collision with root package name */
        boolean f15814o;

        /* renamed from: p, reason: collision with root package name */
        g f15815p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f15816q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f15817r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f15818s;

        /* renamed from: t, reason: collision with root package name */
        int f15819t;

        /* renamed from: u, reason: collision with root package name */
        int f15820u;

        /* renamed from: v, reason: collision with root package name */
        boolean f15821v;

        /* renamed from: w, reason: collision with root package name */
        String f15822w;

        /* renamed from: x, reason: collision with root package name */
        boolean f15823x;

        /* renamed from: y, reason: collision with root package name */
        String f15824y;

        /* renamed from: z, reason: collision with root package name */
        boolean f15825z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f15801b = new ArrayList();
            this.f15802c = new ArrayList();
            this.f15803d = new ArrayList();
            this.f15813n = true;
            this.f15825z = false;
            this.f15783E = 0;
            this.f15784F = 0;
            this.f15790L = 0;
            this.f15793O = 0;
            this.f15794P = 0;
            Notification notification = new Notification();
            this.f15796R = notification;
            this.f15800a = context;
            this.f15789K = str;
            notification.when = System.currentTimeMillis();
            this.f15796R.audioStreamType = -1;
            this.f15812m = 0;
            this.f15799U = new ArrayList();
            this.f15795Q = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void n(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f15796R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f15796R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e A(int i10) {
            this.f15784F = i10;
            return this;
        }

        public e B(long j10) {
            this.f15796R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f15801b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f15801b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new t(this).c();
        }

        public Bundle d() {
            if (this.f15782D == null) {
                this.f15782D = new Bundle();
            }
            return this.f15782D;
        }

        public e f(boolean z10) {
            n(16, z10);
            return this;
        }

        public e g(String str) {
            this.f15789K = str;
            return this;
        }

        public e h(int i10) {
            this.f15783E = i10;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f15806g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f15805f = e(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f15804e = e(charSequence);
            return this;
        }

        public e l(int i10) {
            Notification notification = this.f15796R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.f15796R.deleteIntent = pendingIntent;
            return this;
        }

        public e o(Bitmap bitmap) {
            this.f15809j = bitmap == null ? null : IconCompat.b(s.b(this.f15800a, bitmap));
            return this;
        }

        public e p(int i10, int i11, int i12) {
            Notification notification = this.f15796R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e q(boolean z10) {
            this.f15825z = z10;
            return this;
        }

        public e r(int i10) {
            this.f15811l = i10;
            return this;
        }

        public e s(int i10) {
            this.f15812m = i10;
            return this;
        }

        public e t(boolean z10) {
            this.f15813n = z10;
            return this;
        }

        public e u(int i10) {
            this.f15796R.icon = i10;
            return this;
        }

        public e v(Uri uri) {
            Notification notification = this.f15796R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e10 = a.e(a.c(a.b(), 4), 5);
            this.f15796R.audioAttributes = a.a(e10);
            return this;
        }

        public e w(g gVar) {
            if (this.f15815p != gVar) {
                this.f15815p = gVar;
                if (gVar != null) {
                    gVar.g(this);
                }
            }
            return this;
        }

        public e x(CharSequence charSequence) {
            this.f15816q = e(charSequence);
            return this;
        }

        public e y(CharSequence charSequence) {
            this.f15796R.tickerText = e(charSequence);
            return this;
        }

        public e z(long[] jArr) {
            this.f15796R.vibrate = jArr;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
