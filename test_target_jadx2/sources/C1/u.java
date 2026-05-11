package C1;

import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC3735a;
import org.conscrypt.PSKKeyManager;
import x1.C5100d;
import x1.EnumC5097a;
import x1.z;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: x, reason: collision with root package name */
    public static final a f787x = new a(null);

    /* renamed from: y, reason: collision with root package name */
    private static final String f788y;

    /* renamed from: z, reason: collision with root package name */
    public static final InterfaceC3735a f789z;

    /* renamed from: a, reason: collision with root package name */
    public final String f790a;

    /* renamed from: b, reason: collision with root package name */
    public z.c f791b;

    /* renamed from: c, reason: collision with root package name */
    public String f792c;

    /* renamed from: d, reason: collision with root package name */
    public String f793d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f794e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.b f795f;

    /* renamed from: g, reason: collision with root package name */
    public long f796g;

    /* renamed from: h, reason: collision with root package name */
    public long f797h;

    /* renamed from: i, reason: collision with root package name */
    public long f798i;

    /* renamed from: j, reason: collision with root package name */
    public C5100d f799j;

    /* renamed from: k, reason: collision with root package name */
    public int f800k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC5097a f801l;

    /* renamed from: m, reason: collision with root package name */
    public long f802m;

    /* renamed from: n, reason: collision with root package name */
    public long f803n;

    /* renamed from: o, reason: collision with root package name */
    public long f804o;

    /* renamed from: p, reason: collision with root package name */
    public long f805p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f806q;

    /* renamed from: r, reason: collision with root package name */
    public x1.s f807r;

    /* renamed from: s, reason: collision with root package name */
    private int f808s;

    /* renamed from: t, reason: collision with root package name */
    private final int f809t;

    /* renamed from: u, reason: collision with root package name */
    private long f810u;

    /* renamed from: v, reason: collision with root package name */
    private int f811v;

    /* renamed from: w, reason: collision with root package name */
    private final int f812w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean z10, int i10, EnumC5097a backoffPolicy, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (j15 != Long.MAX_VALUE && z11) {
                return i11 == 0 ? j15 : kotlin.ranges.d.e(j15, 900000 + j11);
            }
            if (z10) {
                return j11 + kotlin.ranges.d.i(backoffPolicy == EnumC5097a.LINEAR ? i10 * j10 : (long) Math.scalb(j10, i10 - 1), 18000000L);
            }
            if (!z11) {
                if (j11 == -1) {
                    return Long.MAX_VALUE;
                }
                return j11 + j12;
            }
            long j16 = i11 == 0 ? j11 + j12 : j11 + j14;
            if (j13 != j14 && i11 == 0) {
                j16 += j14 - j13;
            }
            return j16;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f813a;

        /* renamed from: b, reason: collision with root package name */
        public z.c f814b;

        public b(String id2, z.c state) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f813a = id2;
            this.f814b = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f813a, bVar.f813a) && this.f814b == bVar.f814b;
        }

        public int hashCode() {
            return (this.f813a.hashCode() * 31) + this.f814b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f813a + ", state=" + this.f814b + ')';
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f815a;

        /* renamed from: b, reason: collision with root package name */
        private final z.c f816b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.work.b f817c;

        /* renamed from: d, reason: collision with root package name */
        private final long f818d;

        /* renamed from: e, reason: collision with root package name */
        private final long f819e;

        /* renamed from: f, reason: collision with root package name */
        private final long f820f;

        /* renamed from: g, reason: collision with root package name */
        private final C5100d f821g;

        /* renamed from: h, reason: collision with root package name */
        private final int f822h;

        /* renamed from: i, reason: collision with root package name */
        private EnumC5097a f823i;

        /* renamed from: j, reason: collision with root package name */
        private long f824j;

        /* renamed from: k, reason: collision with root package name */
        private long f825k;

        /* renamed from: l, reason: collision with root package name */
        private int f826l;

        /* renamed from: m, reason: collision with root package name */
        private final int f827m;

        /* renamed from: n, reason: collision with root package name */
        private final long f828n;

        /* renamed from: o, reason: collision with root package name */
        private final int f829o;

        /* renamed from: p, reason: collision with root package name */
        private final List f830p;

        /* renamed from: q, reason: collision with root package name */
        private final List f831q;

        public c(String id2, z.c state, androidx.work.b output, long j10, long j11, long j12, C5100d constraints, int i10, EnumC5097a backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List tags, List progress) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f815a = id2;
            this.f816b = state;
            this.f817c = output;
            this.f818d = j10;
            this.f819e = j11;
            this.f820f = j12;
            this.f821g = constraints;
            this.f822h = i10;
            this.f823i = backoffPolicy;
            this.f824j = j13;
            this.f825k = j14;
            this.f826l = i11;
            this.f827m = i12;
            this.f828n = j15;
            this.f829o = i13;
            this.f830p = tags;
            this.f831q = progress;
        }

        private final long a() {
            if (this.f816b == z.c.ENQUEUED) {
                return u.f787x.a(c(), this.f822h, this.f823i, this.f824j, this.f825k, this.f826l, d(), this.f818d, this.f820f, this.f819e, this.f828n);
            }
            return Long.MAX_VALUE;
        }

        private final z.b b() {
            long j10 = this.f819e;
            if (j10 != 0) {
                return new z.b(j10, this.f820f);
            }
            return null;
        }

        public final boolean c() {
            return this.f816b == z.c.ENQUEUED && this.f822h > 0;
        }

        public final boolean d() {
            return this.f819e != 0;
        }

        public final x1.z e() {
            androidx.work.b progress = !this.f831q.isEmpty() ? (androidx.work.b) this.f831q.get(0) : androidx.work.b.f18143c;
            UUID fromString = UUID.fromString(this.f815a);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(id)");
            z.c cVar = this.f816b;
            HashSet hashSet = new HashSet(this.f830p);
            androidx.work.b bVar = this.f817c;
            Intrinsics.checkNotNullExpressionValue(progress, "progress");
            return new x1.z(fromString, cVar, hashSet, bVar, progress, this.f822h, this.f827m, this.f821g, this.f818d, b(), a(), this.f829o);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.b(this.f815a, cVar.f815a) && this.f816b == cVar.f816b && Intrinsics.b(this.f817c, cVar.f817c) && this.f818d == cVar.f818d && this.f819e == cVar.f819e && this.f820f == cVar.f820f && Intrinsics.b(this.f821g, cVar.f821g) && this.f822h == cVar.f822h && this.f823i == cVar.f823i && this.f824j == cVar.f824j && this.f825k == cVar.f825k && this.f826l == cVar.f826l && this.f827m == cVar.f827m && this.f828n == cVar.f828n && this.f829o == cVar.f829o && Intrinsics.b(this.f830p, cVar.f830p) && Intrinsics.b(this.f831q, cVar.f831q);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f815a.hashCode() * 31) + this.f816b.hashCode()) * 31) + this.f817c.hashCode()) * 31) + Long.hashCode(this.f818d)) * 31) + Long.hashCode(this.f819e)) * 31) + Long.hashCode(this.f820f)) * 31) + this.f821g.hashCode()) * 31) + Integer.hashCode(this.f822h)) * 31) + this.f823i.hashCode()) * 31) + Long.hashCode(this.f824j)) * 31) + Long.hashCode(this.f825k)) * 31) + Integer.hashCode(this.f826l)) * 31) + Integer.hashCode(this.f827m)) * 31) + Long.hashCode(this.f828n)) * 31) + Integer.hashCode(this.f829o)) * 31) + this.f830p.hashCode()) * 31) + this.f831q.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f815a + ", state=" + this.f816b + ", output=" + this.f817c + ", initialDelay=" + this.f818d + ", intervalDuration=" + this.f819e + ", flexDuration=" + this.f820f + ", constraints=" + this.f821g + ", runAttemptCount=" + this.f822h + ", backoffPolicy=" + this.f823i + ", backoffDelayDuration=" + this.f824j + ", lastEnqueueTime=" + this.f825k + ", periodCount=" + this.f826l + ", generation=" + this.f827m + ", nextScheduleTimeOverride=" + this.f828n + ", stopReason=" + this.f829o + ", tags=" + this.f830p + ", progress=" + this.f831q + ')';
        }
    }

    static {
        String i10 = x1.n.i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"WorkSpec\")");
        f788y = i10;
        f789z = new InterfaceC3735a() { // from class: C1.t
            @Override // o.InterfaceC3735a
            public final Object apply(Object obj) {
                List b10;
                b10 = u.b((List) obj);
                return b10;
            }
        };
    }

    public u(String id2, z.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, C5100d constraints, int i10, EnumC5097a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, x1.s outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f790a = id2;
        this.f791b = state;
        this.f792c = workerClassName;
        this.f793d = inputMergerClassName;
        this.f794e = input;
        this.f795f = output;
        this.f796g = j10;
        this.f797h = j11;
        this.f798i = j12;
        this.f799j = constraints;
        this.f800k = i10;
        this.f801l = backoffPolicy;
        this.f802m = j13;
        this.f803n = j14;
        this.f804o = j15;
        this.f805p = j16;
        this.f806q = z10;
        this.f807r = outOfQuotaPolicy;
        this.f808s = i11;
        this.f809t = i12;
        this.f810u = j17;
        this.f811v = i13;
        this.f812w = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).e());
        }
        return arrayList;
    }

    public static /* synthetic */ u e(u uVar, String str, z.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, C5100d c5100d, int i10, EnumC5097a enumC5097a, long j13, long j14, long j15, long j16, boolean z10, x1.s sVar, int i11, int i12, long j17, int i13, int i14, int i15, Object obj) {
        String str4 = (i15 & 1) != 0 ? uVar.f790a : str;
        z.c cVar2 = (i15 & 2) != 0 ? uVar.f791b : cVar;
        String str5 = (i15 & 4) != 0 ? uVar.f792c : str2;
        String str6 = (i15 & 8) != 0 ? uVar.f793d : str3;
        androidx.work.b bVar3 = (i15 & 16) != 0 ? uVar.f794e : bVar;
        androidx.work.b bVar4 = (i15 & 32) != 0 ? uVar.f795f : bVar2;
        long j18 = (i15 & 64) != 0 ? uVar.f796g : j10;
        long j19 = (i15 & 128) != 0 ? uVar.f797h : j11;
        long j20 = (i15 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uVar.f798i : j12;
        C5100d c5100d2 = (i15 & 512) != 0 ? uVar.f799j : c5100d;
        return uVar.d(str4, cVar2, str5, str6, bVar3, bVar4, j18, j19, j20, c5100d2, (i15 & 1024) != 0 ? uVar.f800k : i10, (i15 & 2048) != 0 ? uVar.f801l : enumC5097a, (i15 & 4096) != 0 ? uVar.f802m : j13, (i15 & 8192) != 0 ? uVar.f803n : j14, (i15 & 16384) != 0 ? uVar.f804o : j15, (i15 & 32768) != 0 ? uVar.f805p : j16, (i15 & 65536) != 0 ? uVar.f806q : z10, (131072 & i15) != 0 ? uVar.f807r : sVar, (i15 & 262144) != 0 ? uVar.f808s : i11, (i15 & 524288) != 0 ? uVar.f809t : i12, (i15 & 1048576) != 0 ? uVar.f810u : j17, (i15 & 2097152) != 0 ? uVar.f811v : i13, (i15 & 4194304) != 0 ? uVar.f812w : i14);
    }

    public final long c() {
        return f787x.a(l(), this.f800k, this.f801l, this.f802m, this.f803n, this.f808s, m(), this.f796g, this.f798i, this.f797h, this.f810u);
    }

    public final u d(String id2, z.c state, String workerClassName, String inputMergerClassName, androidx.work.b input, androidx.work.b output, long j10, long j11, long j12, C5100d constraints, int i10, EnumC5097a backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, x1.s outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new u(id2, state, workerClassName, inputMergerClassName, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z10, outOfQuotaPolicy, i11, i12, j17, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.b(this.f790a, uVar.f790a) && this.f791b == uVar.f791b && Intrinsics.b(this.f792c, uVar.f792c) && Intrinsics.b(this.f793d, uVar.f793d) && Intrinsics.b(this.f794e, uVar.f794e) && Intrinsics.b(this.f795f, uVar.f795f) && this.f796g == uVar.f796g && this.f797h == uVar.f797h && this.f798i == uVar.f798i && Intrinsics.b(this.f799j, uVar.f799j) && this.f800k == uVar.f800k && this.f801l == uVar.f801l && this.f802m == uVar.f802m && this.f803n == uVar.f803n && this.f804o == uVar.f804o && this.f805p == uVar.f805p && this.f806q == uVar.f806q && this.f807r == uVar.f807r && this.f808s == uVar.f808s && this.f809t == uVar.f809t && this.f810u == uVar.f810u && this.f811v == uVar.f811v && this.f812w == uVar.f812w;
    }

    public final int f() {
        return this.f809t;
    }

    public final long g() {
        return this.f810u;
    }

    public final int h() {
        return this.f811v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.f790a.hashCode() * 31) + this.f791b.hashCode()) * 31) + this.f792c.hashCode()) * 31) + this.f793d.hashCode()) * 31) + this.f794e.hashCode()) * 31) + this.f795f.hashCode()) * 31) + Long.hashCode(this.f796g)) * 31) + Long.hashCode(this.f797h)) * 31) + Long.hashCode(this.f798i)) * 31) + this.f799j.hashCode()) * 31) + Integer.hashCode(this.f800k)) * 31) + this.f801l.hashCode()) * 31) + Long.hashCode(this.f802m)) * 31) + Long.hashCode(this.f803n)) * 31) + Long.hashCode(this.f804o)) * 31) + Long.hashCode(this.f805p)) * 31;
        boolean z10 = this.f806q;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((((((((hashCode + i10) * 31) + this.f807r.hashCode()) * 31) + Integer.hashCode(this.f808s)) * 31) + Integer.hashCode(this.f809t)) * 31) + Long.hashCode(this.f810u)) * 31) + Integer.hashCode(this.f811v)) * 31) + Integer.hashCode(this.f812w);
    }

    public final int i() {
        return this.f808s;
    }

    public final int j() {
        return this.f812w;
    }

    public final boolean k() {
        return !Intrinsics.b(C5100d.f44678j, this.f799j);
    }

    public final boolean l() {
        return this.f791b == z.c.ENQUEUED && this.f800k > 0;
    }

    public final boolean m() {
        return this.f797h != 0;
    }

    public final void n(long j10) {
        this.f810u = j10;
    }

    public final void o(int i10) {
        this.f811v = i10;
    }

    public final void p(long j10) {
        if (j10 < 900000) {
            x1.n.e().k(f788y, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        q(kotlin.ranges.d.e(j10, 900000L), kotlin.ranges.d.e(j10, 900000L));
    }

    public final void q(long j10, long j11) {
        if (j10 < 900000) {
            x1.n.e().k(f788y, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f797h = kotlin.ranges.d.e(j10, 900000L);
        if (j11 < 300000) {
            x1.n.e().k(f788y, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.f797h) {
            x1.n.e().k(f788y, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.f798i = kotlin.ranges.d.l(j11, 300000L, this.f797h);
    }

    public String toString() {
        return "{WorkSpec: " + this.f790a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ u(String str, z.c cVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j10, long j11, long j12, C5100d c5100d, int i10, EnumC5097a enumC5097a, long j13, long j14, long j15, long j16, boolean z10, x1.s sVar, int i11, int i12, long j17, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r4, str2, r6, r7, r8, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0L : j12, (i15 & 512) != 0 ? C5100d.f44678j : c5100d, (i15 & 1024) != 0 ? 0 : i10, (i15 & 2048) != 0 ? EnumC5097a.EXPONENTIAL : enumC5097a, (i15 & 4096) != 0 ? 30000L : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & 16384) != 0 ? 0L : j15, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? x1.s.RUN_AS_NON_EXPEDITED_WORK_REQUEST : sVar, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (i15 & 4194304) != 0 ? -256 : i14);
        String str4;
        androidx.work.b bVar3;
        androidx.work.b bVar4;
        z.c cVar2 = (i15 & 2) != 0 ? z.c.ENQUEUED : cVar;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "OverwritingInputMerger::class.java.name");
            str4 = name;
        } else {
            str4 = str3;
        }
        if ((i15 & 16) != 0) {
            androidx.work.b EMPTY = androidx.work.b.f18143c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            bVar3 = EMPTY;
        } else {
            bVar3 = bVar;
        }
        if ((i15 & 32) != 0) {
            androidx.work.b EMPTY2 = androidx.work.b.f18143c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            bVar4 = EMPTY2;
        } else {
            bVar4 = bVar2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388602, null);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String newId, u other) {
        this(newId, other.f791b, other.f792c, other.f793d, new androidx.work.b(other.f794e), new androidx.work.b(other.f795f), other.f796g, other.f797h, other.f798i, new C5100d(other.f799j), other.f800k, other.f801l, other.f802m, other.f803n, other.f804o, other.f805p, other.f806q, other.f807r, other.f808s, 0, other.f810u, other.f811v, other.f812w, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }
}
