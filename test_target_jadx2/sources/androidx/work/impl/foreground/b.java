package androidx.work.impl.foreground;

import C1.m;
import C1.u;
import C1.x;
import Jd.InterfaceC0915w0;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.InterfaceC1620f;
import androidx.work.impl.P;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import x1.C5104h;
import x1.n;
import z1.AbstractC5238b;
import z1.AbstractC5242f;
import z1.C5241e;
import z1.InterfaceC5240d;

/* loaded from: classes.dex */
public class b implements InterfaceC5240d, InterfaceC1620f {

    /* renamed from: k, reason: collision with root package name */
    static final String f18341k = n.i("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    private Context f18342a;

    /* renamed from: b, reason: collision with root package name */
    private P f18343b;

    /* renamed from: c, reason: collision with root package name */
    private final E1.b f18344c;

    /* renamed from: d, reason: collision with root package name */
    final Object f18345d = new Object();

    /* renamed from: e, reason: collision with root package name */
    m f18346e;

    /* renamed from: f, reason: collision with root package name */
    final Map f18347f;

    /* renamed from: g, reason: collision with root package name */
    final Map f18348g;

    /* renamed from: h, reason: collision with root package name */
    final Map f18349h;

    /* renamed from: i, reason: collision with root package name */
    final C5241e f18350i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC0315b f18351j;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18352a;

        a(String str) {
            this.f18352a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u g10 = b.this.f18343b.p().g(this.f18352a);
            if (g10 == null || !g10.k()) {
                return;
            }
            synchronized (b.this.f18345d) {
                b.this.f18348g.put(x.a(g10), g10);
                b bVar = b.this;
                b.this.f18349h.put(x.a(g10), AbstractC5242f.b(bVar.f18350i, g10, bVar.f18344c.a(), b.this));
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    interface InterfaceC0315b {
        void b(int i10, int i11, Notification notification);

        void c(int i10, Notification notification);

        void d(int i10);

        void stop();
    }

    b(Context context) {
        this.f18342a = context;
        P n10 = P.n(context);
        this.f18343b = n10;
        this.f18344c = n10.t();
        this.f18346e = null;
        this.f18347f = new LinkedHashMap();
        this.f18349h = new HashMap();
        this.f18348g = new HashMap();
        this.f18350i = new C5241e(this.f18343b.r());
        this.f18343b.p().e(this);
    }

    public static Intent c(Context context, m mVar, C5104h c5104h) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c5104h.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c5104h.a());
        intent.putExtra("KEY_NOTIFICATION", c5104h.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent f(Context context, m mVar, C5104h c5104h) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", c5104h.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c5104h.a());
        intent.putExtra("KEY_NOTIFICATION", c5104h.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        n.e().f(f18341k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f18343b.i(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n.e().a(f18341k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f18351j == null) {
            return;
        }
        this.f18347f.put(mVar, new C5104h(intExtra, notification, intExtra2));
        if (this.f18346e == null) {
            this.f18346e = mVar;
            this.f18351j.b(intExtra, intExtra2, notification);
            return;
        }
        this.f18351j.c(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f18347f.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= ((C5104h) ((Map.Entry) it.next()).getValue()).a();
        }
        C5104h c5104h = (C5104h) this.f18347f.get(this.f18346e);
        if (c5104h != null) {
            this.f18351j.b(c5104h.c(), i10, c5104h.b());
        }
    }

    private void j(Intent intent) {
        n.e().f(f18341k, "Started foreground service " + intent);
        this.f18344c.d(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // z1.InterfaceC5240d
    public void d(u uVar, AbstractC5238b abstractC5238b) {
        if (abstractC5238b instanceof AbstractC5238b.C0670b) {
            String str = uVar.f790a;
            n.e().a(f18341k, "Constraints unmet for WorkSpec " + str);
            this.f18343b.x(x.a(uVar));
        }
    }

    @Override // androidx.work.impl.InterfaceC1620f
    public void e(m mVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f18345d) {
            try {
                InterfaceC0915w0 interfaceC0915w0 = ((u) this.f18348g.remove(mVar)) != null ? (InterfaceC0915w0) this.f18349h.remove(mVar) : null;
                if (interfaceC0915w0 != null) {
                    interfaceC0915w0.d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5104h c5104h = (C5104h) this.f18347f.remove(mVar);
        if (mVar.equals(this.f18346e)) {
            if (this.f18347f.size() > 0) {
                Iterator it = this.f18347f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f18346e = (m) entry.getKey();
                if (this.f18351j != null) {
                    C5104h c5104h2 = (C5104h) entry.getValue();
                    this.f18351j.b(c5104h2.c(), c5104h2.a(), c5104h2.b());
                    this.f18351j.d(c5104h2.c());
                }
            } else {
                this.f18346e = null;
            }
        }
        InterfaceC0315b interfaceC0315b = this.f18351j;
        if (c5104h == null || interfaceC0315b == null) {
            return;
        }
        n.e().a(f18341k, "Removing Notification (id: " + c5104h.c() + ", workSpecId: " + mVar + ", notificationType: " + c5104h.a());
        interfaceC0315b.d(c5104h.c());
    }

    void k(Intent intent) {
        n.e().f(f18341k, "Stopping foreground service");
        InterfaceC0315b interfaceC0315b = this.f18351j;
        if (interfaceC0315b != null) {
            interfaceC0315b.stop();
        }
    }

    void l() {
        this.f18351j = null;
        synchronized (this.f18345d) {
            try {
                Iterator it = this.f18349h.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC0915w0) it.next()).d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18343b.p().p(this);
    }

    void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    void n(InterfaceC0315b interfaceC0315b) {
        if (this.f18351j != null) {
            n.e().c(f18341k, "A callback already exists.");
        } else {
            this.f18351j = interfaceC0315b;
        }
    }
}
