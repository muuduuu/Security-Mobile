package androidx.work.impl.background.systemalarm;

import C1.m;
import C1.u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.A;
import androidx.work.impl.B;
import androidx.work.impl.InterfaceC1620f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x1.InterfaceC5098b;
import x1.n;

/* loaded from: classes.dex */
public class b implements InterfaceC1620f {

    /* renamed from: f, reason: collision with root package name */
    private static final String f18262f = n.i("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f18263a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f18264b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f18265c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5098b f18266d;

    /* renamed from: e, reason: collision with root package name */
    private final B f18267e;

    b(Context context, InterfaceC5098b interfaceC5098b, B b10) {
        this.f18263a = context;
        this.f18266d = interfaceC5098b;
        this.f18267e = b10;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    static Intent c(Context context, m mVar, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, mVar);
    }

    static Intent d(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i10, g gVar) {
        n.e().a(f18262f, "Handling constraints changed " + intent);
        new c(this.f18263a, this.f18266d, i10, gVar).a();
    }

    private void h(Intent intent, int i10, g gVar) {
        synchronized (this.f18265c) {
            try {
                m p10 = p(intent);
                n e10 = n.e();
                String str = f18262f;
                e10.a(str, "Handing delay met for " + p10);
                if (this.f18264b.containsKey(p10)) {
                    n.e().a(str, "WorkSpec " + p10 + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    f fVar = new f(this.f18263a, i10, gVar, this.f18267e.d(p10));
                    this.f18264b.put(p10, fVar);
                    fVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(Intent intent, int i10) {
        m p10 = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        n.e().a(f18262f, "Handling onExecutionCompleted " + intent + ", " + i10);
        e(p10, z10);
    }

    private void j(Intent intent, int i10, g gVar) {
        n.e().a(f18262f, "Handling reschedule " + intent + ", " + i10);
        gVar.g().v();
    }

    private void k(Intent intent, int i10, g gVar) {
        m p10 = p(intent);
        n e10 = n.e();
        String str = f18262f;
        e10.a(str, "Handling schedule work for " + p10);
        WorkDatabase s10 = gVar.g().s();
        s10.e();
        try {
            u s11 = s10.K().s(p10.b());
            if (s11 == null) {
                n.e().k(str, "Skipping scheduling " + p10 + " because it's no longer in the DB");
                return;
            }
            if (s11.f791b.isFinished()) {
                n.e().k(str, "Skipping scheduling " + p10 + "because it is finished.");
                return;
            }
            long c10 = s11.c();
            if (s11.k()) {
                n.e().a(str, "Opportunistically setting an alarm for " + p10 + "at " + c10);
                a.c(this.f18263a, s10, p10, c10);
                gVar.f().b().execute(new g.b(gVar, a(this.f18263a), i10));
            } else {
                n.e().a(str, "Setting up Alarms for " + p10 + "at " + c10);
                a.c(this.f18263a, s10, p10, c10);
            }
            s10.D();
        } finally {
            s10.i();
        }
    }

    private void l(Intent intent, g gVar) {
        List<A> c10;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            c10 = new ArrayList(1);
            A b10 = this.f18267e.b(new m(string, i10));
            if (b10 != null) {
                c10.add(b10);
            }
        } else {
            c10 = this.f18267e.c(string);
        }
        for (A a10 : c10) {
            n.e().a(f18262f, "Handing stopWork work for " + string);
            gVar.i().e(a10);
            a.a(this.f18263a, gVar.g().s(), a10.a());
            gVar.e(a10.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static m p(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    @Override // androidx.work.impl.InterfaceC1620f
    public void e(m mVar, boolean z10) {
        synchronized (this.f18265c) {
            try {
                f fVar = (f) this.f18264b.remove(mVar);
                this.f18267e.b(mVar);
                if (fVar != null) {
                    fVar.g(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean n() {
        boolean z10;
        synchronized (this.f18265c) {
            z10 = !this.f18264b.isEmpty();
        }
        return z10;
    }

    void o(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, gVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, gVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            n.e().c(f18262f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, gVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, gVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
            return;
        }
        n.e().k(f18262f, "Ignoring intent " + intent);
    }
}
