package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.s;
import androidx.core.graphics.drawable.IconCompat;
import j0.C3477b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class t implements r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15831a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f15832b;

    /* renamed from: c, reason: collision with root package name */
    private final s.e f15833c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f15834d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f15835e;

    /* renamed from: f, reason: collision with root package name */
    private final List f15836f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f15837g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f15838h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f15839i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    t(s.e eVar) {
        int i10;
        this.f15833c = eVar;
        Context context = eVar.f15800a;
        this.f15831a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15832b = e.a(context, eVar.f15789K);
        } else {
            this.f15832b = new Notification.Builder(eVar.f15800a);
        }
        Notification notification = eVar.f15796R;
        this.f15832b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f15808i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f15804e).setContentText(eVar.f15805f).setContentInfo(eVar.f15810k).setContentIntent(eVar.f15806g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f15807h, (notification.flags & 128) != 0).setNumber(eVar.f15811l).setProgress(eVar.f15819t, eVar.f15820u, eVar.f15821v);
        Notification.Builder builder = this.f15832b;
        IconCompat iconCompat = eVar.f15809j;
        c.b(builder, iconCompat == null ? null : iconCompat.m(context));
        this.f15832b.setSubText(eVar.f15816q).setUsesChronometer(eVar.f15814o).setPriority(eVar.f15812m);
        Iterator it = eVar.f15801b.iterator();
        while (it.hasNext()) {
            b((s.a) it.next());
        }
        Bundle bundle = eVar.f15782D;
        if (bundle != null) {
            this.f15837g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f15834d = eVar.f15786H;
        this.f15835e = eVar.f15787I;
        this.f15832b.setShowWhen(eVar.f15813n);
        a.i(this.f15832b, eVar.f15825z);
        a.g(this.f15832b, eVar.f15822w);
        a.j(this.f15832b, eVar.f15824y);
        a.h(this.f15832b, eVar.f15823x);
        this.f15838h = eVar.f15793O;
        b.b(this.f15832b, eVar.f15781C);
        b.c(this.f15832b, eVar.f15783E);
        b.f(this.f15832b, eVar.f15784F);
        b.d(this.f15832b, eVar.f15785G);
        b.e(this.f15832b, notification.sound, notification.audioAttributes);
        List e10 = i11 < 28 ? e(g(eVar.f15802c), eVar.f15799U) : eVar.f15799U;
        if (e10 != null && !e10.isEmpty()) {
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                b.a(this.f15832b, (String) it2.next());
            }
        }
        this.f15839i = eVar.f15788J;
        if (eVar.f15803d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f15803d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), u.a((s.a) eVar.f15803d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f15837g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f15798T;
        if (obj != null) {
            c.c(this.f15832b, obj);
        }
        this.f15832b.setExtras(eVar.f15782D);
        d.e(this.f15832b, eVar.f15818s);
        RemoteViews remoteViews = eVar.f15786H;
        if (remoteViews != null) {
            d.c(this.f15832b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f15787I;
        if (remoteViews2 != null) {
            d.b(this.f15832b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f15788J;
        if (remoteViews3 != null) {
            d.d(this.f15832b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f15832b, eVar.f15790L);
            e.e(this.f15832b, eVar.f15817r);
            e.f(this.f15832b, eVar.f15791M);
            e.g(this.f15832b, eVar.f15792N);
            e.d(this.f15832b, eVar.f15793O);
            if (eVar.f15780B) {
                e.c(this.f15832b, eVar.f15779A);
            }
            if (!TextUtils.isEmpty(eVar.f15789K)) {
                this.f15832b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it3 = eVar.f15802c.iterator();
            if (it3.hasNext()) {
                android.support.v4.media.session.b.a(it3.next());
                throw null;
            }
        }
        if (i13 >= 29) {
            g.a(this.f15832b, eVar.f15795Q);
            g.b(this.f15832b, s.d.a(null));
        }
        if (i13 >= 31 && (i10 = eVar.f15794P) != 0) {
            h.b(this.f15832b, i10);
        }
        if (eVar.f15797S) {
            if (this.f15833c.f15823x) {
                this.f15838h = 2;
            } else {
                this.f15838h = 1;
            }
            this.f15832b.setVibrate(null);
            this.f15832b.setSound(null);
            int i14 = notification.defaults & (-4);
            notification.defaults = i14;
            this.f15832b.setDefaults(i14);
            if (i13 >= 26) {
                if (TextUtils.isEmpty(this.f15833c.f15822w)) {
                    a.g(this.f15832b, "silent");
                }
                e.d(this.f15832b, this.f15838h);
            }
        }
    }

    private void b(s.a aVar) {
        IconCompat d10 = aVar.d();
        Notification.Action.Builder a10 = c.a(d10 != null ? d10.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : A.b(aVar.e())) {
                a.c(a10, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(a10, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(a10, aVar.f());
        }
        if (i10 >= 29) {
            g.c(a10, aVar.j());
        }
        if (i10 >= 31) {
            h.a(a10, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a10, bundle);
        a.a(this.f15832b, a.d(a10));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C3477b c3477b = new C3477b(list.size() + list2.size());
        c3477b.addAll(list);
        c3477b.addAll(list2);
        return new ArrayList(c3477b);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.r
    public Notification.Builder a() {
        return this.f15832b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        s.g gVar = this.f15833c.f15815p;
        if (gVar != null) {
            gVar.b(this);
        }
        RemoteViews e10 = gVar != null ? gVar.e(this) : null;
        Notification d11 = d();
        if (e10 != null) {
            d11.contentView = e10;
        } else {
            RemoteViews remoteViews = this.f15833c.f15786H;
            if (remoteViews != null) {
                d11.contentView = remoteViews;
            }
        }
        if (gVar != null && (d10 = gVar.d(this)) != null) {
            d11.bigContentView = d10;
        }
        if (gVar != null && (f10 = this.f15833c.f15815p.f(this)) != null) {
            d11.headsUpContentView = f10;
        }
        if (gVar != null && (a10 = s.a(d11)) != null) {
            gVar.a(a10);
        }
        return d11;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f15832b.build();
        }
        Notification build = this.f15832b.build();
        if (this.f15838h != 0) {
            if (a.f(build) != null && (build.flags & 512) != 0 && this.f15838h == 2) {
                h(build);
            }
            if (a.f(build) != null && (build.flags & 512) == 0 && this.f15838h == 1) {
                h(build);
            }
        }
        return build;
    }

    Context f() {
        return this.f15831a;
    }
}
