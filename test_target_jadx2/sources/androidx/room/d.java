package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import androidx.room.d;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f17801a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c f17802b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f17803c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f17804d;

    /* renamed from: e, reason: collision with root package name */
    private int f17805e;

    /* renamed from: f, reason: collision with root package name */
    public c.AbstractC0305c f17806f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.room.b f17807g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.room.a f17808h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f17809i;

    /* renamed from: j, reason: collision with root package name */
    private final ServiceConnection f17810j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f17811k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f17812l;

    public static final class a extends c.AbstractC0305c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0305c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0305c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (d.this.j().get()) {
                return;
            }
            try {
                androidx.room.b h10 = d.this.h();
                if (h10 != null) {
                    h10.X0(d.this.c(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class b extends a.AbstractBinderC0302a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l1(d this$0, String[] tables) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(tables, "$tables");
            this$0.e().m((String[]) Arrays.copyOf(tables, tables.length));
        }

        @Override // androidx.room.a
        public void w(final String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Executor d10 = d.this.d();
            final d dVar = d.this;
            d10.execute(new Runnable() { // from class: h1.q
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.l1(androidx.room.d.this, tables);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            d.this.m(b.a.p(service));
            d.this.d().execute(d.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            d.this.d().execute(d.this.g());
            d.this.m(null);
        }
    }

    public d(Context context, String name, Intent serviceIntent, androidx.room.c invalidationTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f17801a = name;
        this.f17802b = invalidationTracker;
        this.f17803c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f17804d = applicationContext;
        this.f17808h = new b();
        this.f17809i = new AtomicBoolean(false);
        c cVar = new c();
        this.f17810j = cVar;
        this.f17811k = new Runnable() { // from class: h1.o
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.d.n(androidx.room.d.this);
            }
        };
        this.f17812l = new Runnable() { // from class: h1.p
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.d.k(androidx.room.d.this);
            }
        };
        l(new a((String[]) invalidationTracker.k().keySet().toArray(new String[0])));
        applicationContext.bindService(serviceIntent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f17802b.p(this$0.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            androidx.room.b bVar = this$0.f17807g;
            if (bVar != null) {
                this$0.f17805e = bVar.E(this$0.f17808h, this$0.f17801a);
                this$0.f17802b.c(this$0.f());
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final int c() {
        return this.f17805e;
    }

    public final Executor d() {
        return this.f17803c;
    }

    public final androidx.room.c e() {
        return this.f17802b;
    }

    public final c.AbstractC0305c f() {
        c.AbstractC0305c abstractC0305c = this.f17806f;
        if (abstractC0305c != null) {
            return abstractC0305c;
        }
        Intrinsics.v("observer");
        return null;
    }

    public final Runnable g() {
        return this.f17812l;
    }

    public final androidx.room.b h() {
        return this.f17807g;
    }

    public final Runnable i() {
        return this.f17811k;
    }

    public final AtomicBoolean j() {
        return this.f17809i;
    }

    public final void l(c.AbstractC0305c abstractC0305c) {
        Intrinsics.checkNotNullParameter(abstractC0305c, "<set-?>");
        this.f17806f = abstractC0305c;
    }

    public final void m(androidx.room.b bVar) {
        this.f17807g = bVar;
    }
}
