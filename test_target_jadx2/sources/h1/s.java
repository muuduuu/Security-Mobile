package h1;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import i1.AbstractC3312b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.h;
import m.C3632c;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: o, reason: collision with root package name */
    public static final c f33883o = new c(null);

    /* renamed from: a, reason: collision with root package name */
    protected volatile l1.g f33884a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f33885b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f33886c;

    /* renamed from: d, reason: collision with root package name */
    private l1.h f33887d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33889f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33890g;

    /* renamed from: h, reason: collision with root package name */
    protected List f33891h;

    /* renamed from: k, reason: collision with root package name */
    private C3225c f33894k;

    /* renamed from: m, reason: collision with root package name */
    private final Map f33896m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f33897n;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.room.c f33888e = g();

    /* renamed from: i, reason: collision with root package name */
    private Map f33892i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    private final ReentrantReadWriteLock f33893j = new ReentrantReadWriteLock();

    /* renamed from: l, reason: collision with root package name */
    private final ThreadLocal f33895l = new ThreadLocal();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f33898a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f33899b;

        /* renamed from: c, reason: collision with root package name */
        private final String f33900c;

        /* renamed from: d, reason: collision with root package name */
        private final List f33901d;

        /* renamed from: e, reason: collision with root package name */
        private final List f33902e;

        /* renamed from: f, reason: collision with root package name */
        private List f33903f;

        /* renamed from: g, reason: collision with root package name */
        private Executor f33904g;

        /* renamed from: h, reason: collision with root package name */
        private Executor f33905h;

        /* renamed from: i, reason: collision with root package name */
        private h.c f33906i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f33907j;

        /* renamed from: k, reason: collision with root package name */
        private d f33908k;

        /* renamed from: l, reason: collision with root package name */
        private Intent f33909l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f33910m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f33911n;

        /* renamed from: o, reason: collision with root package name */
        private long f33912o;

        /* renamed from: p, reason: collision with root package name */
        private TimeUnit f33913p;

        /* renamed from: q, reason: collision with root package name */
        private final e f33914q;

        /* renamed from: r, reason: collision with root package name */
        private Set f33915r;

        /* renamed from: s, reason: collision with root package name */
        private Set f33916s;

        /* renamed from: t, reason: collision with root package name */
        private String f33917t;

        /* renamed from: u, reason: collision with root package name */
        private File f33918u;

        /* renamed from: v, reason: collision with root package name */
        private Callable f33919v;

        public a(Context context, Class klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f33898a = context;
            this.f33899b = klass;
            this.f33900c = str;
            this.f33901d = new ArrayList();
            this.f33902e = new ArrayList();
            this.f33903f = new ArrayList();
            this.f33908k = d.AUTOMATIC;
            this.f33910m = true;
            this.f33912o = -1L;
            this.f33914q = new e();
            this.f33915r = new LinkedHashSet();
        }

        public a a(b callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f33901d.add(callback);
            return this;
        }

        public a b(AbstractC3312b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f33916s == null) {
                this.f33916s = new HashSet();
            }
            for (AbstractC3312b abstractC3312b : migrations) {
                Set set = this.f33916s;
                Intrinsics.d(set);
                set.add(Integer.valueOf(abstractC3312b.f34126a));
                Set set2 = this.f33916s;
                Intrinsics.d(set2);
                set2.add(Integer.valueOf(abstractC3312b.f34127b));
            }
            this.f33914q.b((AbstractC3312b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a c() {
            this.f33907j = true;
            return this;
        }

        public s d() {
            Executor executor = this.f33904g;
            if (executor == null && this.f33905h == null) {
                Executor g10 = C3632c.g();
                this.f33905h = g10;
                this.f33904g = g10;
            } else if (executor != null && this.f33905h == null) {
                this.f33905h = executor;
            } else if (executor == null) {
                this.f33904g = this.f33905h;
            }
            Set set = this.f33916s;
            if (set != null) {
                Intrinsics.d(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (this.f33915r.contains(Integer.valueOf(intValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            h.c cVar = this.f33906i;
            if (cVar == null) {
                cVar = new m1.f();
            }
            if (cVar != null) {
                if (this.f33912o > 0) {
                    if (this.f33900c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f33912o;
                    TimeUnit timeUnit = this.f33913p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f33904g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar = new h1.e(cVar, new C3225c(j10, timeUnit, executor2));
                }
                String str = this.f33917t;
                if (str != null || this.f33918u != null || this.f33919v != null) {
                    if (this.f33900c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.f33918u;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.f33919v;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    cVar = new z(str, file, callable, cVar);
                }
            } else {
                cVar = null;
            }
            h.c cVar2 = cVar;
            if (cVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f33898a;
            String str2 = this.f33900c;
            e eVar = this.f33914q;
            List list = this.f33901d;
            boolean z10 = this.f33907j;
            d resolve$room_runtime_release = this.f33908k.resolve$room_runtime_release(context);
            Executor executor3 = this.f33904g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f33905h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            h1.h hVar = new h1.h(context, str2, cVar2, eVar, list, z10, resolve$room_runtime_release, executor3, executor4, this.f33909l, this.f33910m, this.f33911n, this.f33915r, this.f33917t, this.f33918u, this.f33919v, null, this.f33902e, this.f33903f);
            s sVar = (s) r.b(this.f33899b, "_Impl");
            sVar.t(hVar);
            return sVar;
        }

        public a e() {
            this.f33910m = false;
            this.f33911n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f33906i = cVar;
            return this;
        }

        public a g(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f33904g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(l1.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void b(l1.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(l1.g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return l1.c.b(activityManager);
        }

        public final d resolve$room_runtime_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Map f33920a = new LinkedHashMap();

        private final void a(AbstractC3312b abstractC3312b) {
            int i10 = abstractC3312b.f34126a;
            int i11 = abstractC3312b.f34127b;
            Map map = this.f33920a;
            Integer valueOf = Integer.valueOf(i10);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i11)) + " with " + abstractC3312b);
            }
            treeMap.put(Integer.valueOf(i11), abstractC3312b);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final List e(List list, boolean z10, int i10, int i11) {
            TreeMap treeMap;
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                    treeMap = (TreeMap) this.f33920a.get(Integer.valueOf(i10));
                    if (treeMap != null) {
                        return null;
                    }
                    for (Integer targetVersion : z10 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                        if (z10) {
                            int i12 = i10 + 1;
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int intValue = targetVersion.intValue();
                            if (i12 <= intValue && intValue <= i11) {
                                Object obj = treeMap.get(targetVersion);
                                Intrinsics.d(obj);
                                list.add(obj);
                                i10 = targetVersion.intValue();
                                z11 = true;
                                break;
                            }
                        } else {
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int intValue2 = targetVersion.intValue();
                            if (i11 <= intValue2 && intValue2 < i10) {
                                Object obj2 = treeMap.get(targetVersion);
                                Intrinsics.d(obj2);
                                list.add(obj2);
                                i10 = targetVersion.intValue();
                                z11 = true;
                                break;
                                break;
                            }
                        }
                    }
                    z11 = false;
                } else {
                    if (i10 <= i11) {
                        return list;
                    }
                    treeMap = (TreeMap) this.f33920a.get(Integer.valueOf(i10));
                    if (treeMap != null) {
                    }
                }
            } while (z11);
            return null;
        }

        public void b(AbstractC3312b... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (AbstractC3312b abstractC3312b : migrations) {
                a(abstractC3312b);
            }
        }

        public final boolean c(int i10, int i11) {
            Map f10 = f();
            if (!f10.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map map = (Map) f10.get(Integer.valueOf(i10));
            if (map == null) {
                map = G.h();
            }
            return map.containsKey(Integer.valueOf(i11));
        }

        public List d(int i10, int i11) {
            if (i10 == i11) {
                return CollectionsKt.j();
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map f() {
            return this.f33920a;
        }
    }

    public static abstract class f {
    }

    static final class g extends xc.m implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l1.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            s.this.u();
            return null;
        }
    }

    static final class h extends xc.m implements Function1 {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l1.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            s.this.v();
            return null;
        }
    }

    public s() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f33896m = synchronizedMap;
        this.f33897n = new LinkedHashMap();
    }

    public static /* synthetic */ Cursor A(s sVar, l1.j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return sVar.z(jVar, cancellationSignal);
    }

    private final Object E(Class cls, l1.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof i) {
            return E(cls, ((i) hVar).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        c();
        l1.g U02 = n().U0();
        m().w(U02);
        if (U02.K1()) {
            U02.K0();
        } else {
            U02.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        n().U0().b1();
        if (s()) {
            return;
        }
        m().o();
    }

    public Object B(Callable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        e();
        try {
            Object call = body.call();
            D();
            return call;
        } finally {
            i();
        }
    }

    public void C(Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        e();
        try {
            body.run();
            D();
        } finally {
            i();
        }
    }

    public void D() {
        n().U0().I0();
    }

    public void c() {
        if (!this.f33889f && x()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!s() && this.f33895l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        C3225c c3225c = this.f33894k;
        if (c3225c == null) {
            u();
        } else {
            c3225c.g(new g());
        }
    }

    public l1.k f(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        c();
        d();
        return n().U0().k0(sql);
    }

    protected abstract androidx.room.c g();

    protected abstract l1.h h(h1.h hVar);

    public void i() {
        C3225c c3225c = this.f33894k;
        if (c3225c == null) {
            v();
        } else {
            c3225c.g(new h());
        }
    }

    public List j(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.j();
    }

    public final Map k() {
        return this.f33896m;
    }

    public final Lock l() {
        ReentrantReadWriteLock.ReadLock readLock = this.f33893j.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public androidx.room.c m() {
        return this.f33888e;
    }

    public l1.h n() {
        l1.h hVar = this.f33887d;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.v("internalOpenHelper");
        return null;
    }

    public Executor o() {
        Executor executor = this.f33885b;
        if (executor != null) {
            return executor;
        }
        Intrinsics.v("internalQueryExecutor");
        return null;
    }

    public Set p() {
        return O.d();
    }

    protected Map q() {
        return G.h();
    }

    public Executor r() {
        Executor executor = this.f33886c;
        if (executor != null) {
            return executor;
        }
        Intrinsics.v("internalTransactionExecutor");
        return null;
    }

    public boolean s() {
        return n().U0().D1();
    }

    public void t(h1.h configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f33887d = h(configuration);
        Set p10 = p();
        BitSet bitSet = new BitSet();
        Iterator it = p10.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f33873r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (cls.isAssignableFrom(configuration.f33873r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f33892i.put(cls, configuration.f33873r.get(i10));
            } else {
                int size2 = configuration.f33873r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (AbstractC3312b abstractC3312b : j(this.f33892i)) {
                    if (!configuration.f33859d.c(abstractC3312b.f34126a, abstractC3312b.f34127b)) {
                        configuration.f33859d.b(abstractC3312b);
                    }
                }
                y yVar = (y) E(y.class, n());
                if (yVar != null) {
                    yVar.d(configuration);
                }
                C3226d c3226d = (C3226d) E(C3226d.class, n());
                if (c3226d != null) {
                    this.f33894k = c3226d.f33821b;
                    m().r(c3226d.f33821b);
                }
                boolean z10 = configuration.f33862g == d.WRITE_AHEAD_LOGGING;
                n().setWriteAheadLoggingEnabled(z10);
                this.f33891h = configuration.f33860e;
                this.f33885b = configuration.f33863h;
                this.f33886c = new D(configuration.f33864i);
                this.f33889f = configuration.f33861f;
                this.f33890g = z10;
                if (configuration.f33865j != null) {
                    if (configuration.f33857b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    m().s(configuration.f33856a, configuration.f33857b, configuration.f33865j);
                }
                Map q10 = q();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : q10.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f33872q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i13 = size3 - 1;
                                if (cls3.isAssignableFrom(configuration.f33872q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i13 < 0) {
                                    break;
                                } else {
                                    size3 = i13;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f33897n.put(cls3, configuration.f33872q.get(size3));
                    }
                }
                int size4 = configuration.f33872q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f33872q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    protected void w(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        m().l(db2);
    }

    public final boolean x() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean y() {
        l1.g gVar = this.f33884a;
        return gVar != null && gVar.isOpen();
    }

    public Cursor z(l1.j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        c();
        d();
        return cancellationSignal != null ? n().U0().r0(query, cancellationSignal) : n().U0().T(query);
    }
}
