package com.google.firebase.remoteconfig.internal;

import D7.AbstractC0789m;
import D7.InterfaceC0779c;
import D7.InterfaceC0786j;
import android.text.format.DateUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.t;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m8.InterfaceC3657a;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: j, reason: collision with root package name */
    public static final long f28360j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    static final int[] f28361k = {2, 4, 8, 16, 32, 64, 128, PSKKeyManager.MAX_KEY_LENGTH_BYTES};

    /* renamed from: a, reason: collision with root package name */
    private final B8.f f28362a;

    /* renamed from: b, reason: collision with root package name */
    private final A8.b f28363b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f28364c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f28365d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f28366e;

    /* renamed from: f, reason: collision with root package name */
    private final f f28367f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f28368g;

    /* renamed from: h, reason: collision with root package name */
    private final t f28369h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f28370i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Date f28371a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28372b;

        /* renamed from: c, reason: collision with root package name */
        private final g f28373c;

        /* renamed from: d, reason: collision with root package name */
        private final String f28374d;

        private a(Date date, int i10, g gVar, String str) {
            this.f28371a = date;
            this.f28372b = i10;
            this.f28373c = gVar;
            this.f28374d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.h(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public g d() {
            return this.f28373c;
        }

        String e() {
            return this.f28374d;
        }

        int f() {
            return this.f28372b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        b(String str) {
            this.value = str;
        }

        String getValue() {
            return this.value;
        }
    }

    public m(B8.f fVar, A8.b bVar, Executor executor, com.google.android.gms.common.util.f fVar2, Random random, f fVar3, ConfigFetchHttpClient configFetchHttpClient, t tVar, Map map) {
        this.f28362a = fVar;
        this.f28363b = bVar;
        this.f28364c = executor;
        this.f28365d = fVar2;
        this.f28366e = random;
        this.f28367f = fVar3;
        this.f28368g = configFetchHttpClient;
        this.f28369h = tVar;
        this.f28370i = map;
    }

    private t.a A(int i10, Date date) {
        if (t(i10)) {
            B(date);
        }
        return this.f28369h.b();
    }

    private void B(Date date) {
        int b10 = this.f28369h.b().b() + 1;
        this.f28369h.m(b10, new Date(date.getTime() + q(b10)));
    }

    private void C(Task task, Date date) {
        if (task.isSuccessful()) {
            this.f28369h.u(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof J8.r) {
            this.f28369h.v();
        } else {
            this.f28369h.t();
        }
    }

    private boolean f(long j10, Date date) {
        Date g10 = this.f28369h.g();
        if (g10.equals(t.f28425f)) {
            return false;
        }
        return date.before(new Date(g10.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private J8.t g(J8.t tVar) {
        String str;
        int b10 = tVar.b();
        if (b10 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (b10 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (b10 == 429) {
                throw new J8.p("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (b10 != 500) {
                switch (b10) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new J8.t(tVar.b(), "Fetch failed: " + str, tVar);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a k(String str, String str2, Date date, Map map) {
        try {
            a fetch = this.f28368g.fetch(this.f28368g.d(), str, str2, s(), this.f28369h.f(), map, p(), date, this.f28369h.c());
            if (fetch.d() != null) {
                this.f28369h.q(fetch.d().k());
            }
            if (fetch.e() != null) {
                this.f28369h.p(fetch.e());
            }
            this.f28369h.k();
            return fetch;
        } catch (J8.t e10) {
            t.a A10 = A(e10.b(), date);
            if (z(A10, e10.b())) {
                throw new J8.r(A10.a().getTime());
            }
            throw g(e10);
        }
    }

    private Task l(String str, String str2, Date date, Map map) {
        try {
            final a k10 = k(str, str2, date, map);
            return k10.f() != 0 ? AbstractC0789m.g(k10) : this.f28367f.k(k10.d()).o(this.f28364c, new InterfaceC0786j() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // D7.InterfaceC0786j
                public final Task a(Object obj) {
                    Task v10;
                    v10 = m.v(m.a.this, (g) obj);
                    return v10;
                }
            });
        } catch (J8.q e10) {
            return AbstractC0789m.f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Task u(Task task, long j10, final Map map) {
        Task j11;
        final Date date = new Date(this.f28365d.a());
        if (task.isSuccessful() && f(j10, date)) {
            return AbstractC0789m.g(a.c(date));
        }
        Date o10 = o(date);
        if (o10 != null) {
            j11 = AbstractC0789m.f(new J8.r(h(o10.getTime() - date.getTime()), o10.getTime()));
        } else {
            final Task id2 = this.f28362a.getId();
            final Task a10 = this.f28362a.a(false);
            j11 = AbstractC0789m.k(id2, a10).j(this.f28364c, new InterfaceC0779c() { // from class: com.google.firebase.remoteconfig.internal.j
                @Override // D7.InterfaceC0779c
                public final Object a(Task task2) {
                    Task w10;
                    w10 = m.this.w(id2, a10, date, map, task2);
                    return w10;
                }
            });
        }
        return j11.j(this.f28364c, new InterfaceC0779c() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // D7.InterfaceC0779c
            public final Object a(Task task2) {
                Task x10;
                x10 = m.this.x(date, task2);
                return x10;
            }
        });
    }

    private Date o(Date date) {
        Date a10 = this.f28369h.b().a();
        if (date.before(a10)) {
            return a10;
        }
        return null;
    }

    private Long p() {
        InterfaceC3657a interfaceC3657a = (InterfaceC3657a) this.f28363b.get();
        if (interfaceC3657a == null) {
            return null;
        }
        return (Long) interfaceC3657a.a(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f28361k;
        return (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f28366e.nextInt((int) r0);
    }

    private Map s() {
        HashMap hashMap = new HashMap();
        InterfaceC3657a interfaceC3657a = (InterfaceC3657a) this.f28363b.get();
        if (interfaceC3657a == null) {
            return hashMap;
        }
        for (Map.Entry entry : interfaceC3657a.a(false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task v(a aVar, g gVar) {
        return AbstractC0789m.g(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task w(Task task, Task task2, Date date, Map map, Task task3) {
        return !task.isSuccessful() ? AbstractC0789m.f(new J8.p("Firebase Installations failed to get installation ID for fetch.", task.getException())) : !task2.isSuccessful() ? AbstractC0789m.f(new J8.p("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : l((String) task.getResult(), ((com.google.firebase.installations.g) task2.getResult()).b(), date, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task x(Date date, Task task) {
        C(task, date);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task y(Map map, Task task) {
        return u(task, 0L, map);
    }

    private boolean z(t.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    public Task i() {
        return j(this.f28369h.i());
    }

    public Task j(final long j10) {
        final HashMap hashMap = new HashMap(this.f28370i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.getValue() + "/1");
        return this.f28367f.e().j(this.f28364c, new InterfaceC0779c() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                Task u10;
                u10 = m.this.u(j10, hashMap, task);
                return u10;
            }
        });
    }

    public Task n(b bVar, int i10) {
        final HashMap hashMap = new HashMap(this.f28370i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.getValue() + "/" + i10);
        return this.f28367f.e().j(this.f28364c, new InterfaceC0779c() { // from class: com.google.firebase.remoteconfig.internal.i
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                Task y10;
                y10 = m.this.y(hashMap, task);
                return y10;
            }
        });
    }

    public long r() {
        return this.f28369h.h();
    }
}
