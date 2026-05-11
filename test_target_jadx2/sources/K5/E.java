package K5;

import D5.AbstractC0776b;
import D5.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.conscrypt.BuildConfig;
import v5.p;
import v5.u;
import v5.z;

/* loaded from: classes2.dex */
public class E extends s implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    private static final AbstractC0776b.a f5316m = AbstractC0776b.a.c(BuildConfig.FLAVOR);

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f5317b;

    /* renamed from: c, reason: collision with root package name */
    protected final F5.l f5318c;

    /* renamed from: d, reason: collision with root package name */
    protected final AbstractC0776b f5319d;

    /* renamed from: e, reason: collision with root package name */
    protected final D5.w f5320e;

    /* renamed from: f, reason: collision with root package name */
    protected final D5.w f5321f;

    /* renamed from: g, reason: collision with root package name */
    protected f f5322g;

    /* renamed from: h, reason: collision with root package name */
    protected f f5323h;

    /* renamed from: i, reason: collision with root package name */
    protected f f5324i;

    /* renamed from: j, reason: collision with root package name */
    protected f f5325j;

    /* renamed from: k, reason: collision with root package name */
    protected transient D5.v f5326k;

    /* renamed from: l, reason: collision with root package name */
    protected transient AbstractC0776b.a f5327l;

    class a implements g {
        a() {
        }

        @Override // K5.E.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Class[] a(AbstractC0928i abstractC0928i) {
            return E.this.f5319d.U(abstractC0928i);
        }
    }

    class b implements g {
        b() {
        }

        @Override // K5.E.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC0776b.a a(AbstractC0928i abstractC0928i) {
            return E.this.f5319d.G(abstractC0928i);
        }
    }

    class c implements g {
        c() {
        }

        @Override // K5.E.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(AbstractC0928i abstractC0928i) {
            return E.this.f5319d.h0(abstractC0928i);
        }
    }

    class d implements g {
        d() {
        }

        @Override // K5.E.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u.a a(AbstractC0928i abstractC0928i) {
            return E.this.f5319d.w(abstractC0928i);
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5332a;

        static {
            int[] iArr = new int[u.a.values().length];
            f5332a = iArr;
            try {
                iArr[u.a.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5332a[u.a.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5332a[u.a.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5332a[u.a.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Object f5333a;

        /* renamed from: b, reason: collision with root package name */
        public final f f5334b;

        /* renamed from: c, reason: collision with root package name */
        public final D5.w f5335c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f5336d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f5337e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f5338f;

        public f(Object obj, f fVar, D5.w wVar, boolean z10, boolean z11, boolean z12) {
            this.f5333a = obj;
            this.f5334b = fVar;
            D5.w wVar2 = (wVar == null || wVar.g()) ? null : wVar;
            this.f5335c = wVar2;
            if (z10) {
                if (wVar2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!wVar.e()) {
                    z10 = false;
                }
            }
            this.f5336d = z10;
            this.f5337e = z11;
            this.f5338f = z12;
        }

        protected f a(f fVar) {
            f fVar2 = this.f5334b;
            return fVar2 == null ? c(fVar) : c(fVar2.a(fVar));
        }

        public f b() {
            f fVar = this.f5334b;
            if (fVar == null) {
                return this;
            }
            f b10 = fVar.b();
            if (this.f5335c != null) {
                return b10.f5335c == null ? c(null) : c(b10);
            }
            if (b10.f5335c != null) {
                return b10;
            }
            boolean z10 = this.f5337e;
            return z10 == b10.f5337e ? c(b10) : z10 ? c(null) : b10;
        }

        public f c(f fVar) {
            return fVar == this.f5334b ? this : new f(this.f5333a, fVar, this.f5335c, this.f5336d, this.f5337e, this.f5338f);
        }

        public f d(Object obj) {
            return obj == this.f5333a ? this : new f(obj, this.f5334b, this.f5335c, this.f5336d, this.f5337e, this.f5338f);
        }

        public f e() {
            f e10;
            if (!this.f5338f) {
                f fVar = this.f5334b;
                return (fVar == null || (e10 = fVar.e()) == this.f5334b) ? this : c(e10);
            }
            f fVar2 = this.f5334b;
            if (fVar2 == null) {
                return null;
            }
            return fVar2.e();
        }

        public f f() {
            return this.f5334b == null ? this : new f(this.f5333a, null, this.f5335c, this.f5336d, this.f5337e, this.f5338f);
        }

        public f g() {
            f fVar = this.f5334b;
            f g10 = fVar == null ? null : fVar.g();
            return this.f5337e ? c(g10) : g10;
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.f5333a.toString(), Boolean.valueOf(this.f5337e), Boolean.valueOf(this.f5338f), Boolean.valueOf(this.f5336d));
            if (this.f5334b == null) {
                return format;
            }
            return format + ", " + this.f5334b.toString();
        }
    }

    private interface g {
        Object a(AbstractC0928i abstractC0928i);
    }

    public E(F5.l lVar, AbstractC0776b abstractC0776b, boolean z10, D5.w wVar) {
        this(lVar, abstractC0776b, z10, wVar, wVar);
    }

    private boolean B(f fVar) {
        while (fVar != null) {
            if (fVar.f5335c != null && fVar.f5336d) {
                return true;
            }
            fVar = fVar.f5334b;
        }
        return false;
    }

    private boolean C(f fVar) {
        while (fVar != null) {
            D5.w wVar = fVar.f5335c;
            if (wVar != null && wVar.e()) {
                return true;
            }
            fVar = fVar.f5334b;
        }
        return false;
    }

    private boolean D(f fVar) {
        while (fVar != null) {
            if (fVar.f5338f) {
                return true;
            }
            fVar = fVar.f5334b;
        }
        return false;
    }

    private boolean E(f fVar) {
        while (fVar != null) {
            if (fVar.f5337e) {
                return true;
            }
            fVar = fVar.f5334b;
        }
        return false;
    }

    private f F(f fVar, p pVar) {
        AbstractC0928i abstractC0928i = (AbstractC0928i) ((AbstractC0928i) fVar.f5333a).n(pVar);
        f fVar2 = fVar.f5334b;
        if (fVar2 != null) {
            fVar = fVar.c(F(fVar2, pVar));
        }
        return fVar.d(abstractC0928i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:36)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void G(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:36)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private Set H(f fVar, Set set) {
        while (fVar != null) {
            if (fVar.f5336d && fVar.f5335c != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(fVar.f5335c);
            }
            fVar = fVar.f5334b;
        }
        return set;
    }

    private p I(f fVar) {
        p i10 = ((AbstractC0928i) fVar.f5333a).i();
        f fVar2 = fVar.f5334b;
        return fVar2 != null ? p.f(i10, I(fVar2)) : i10;
    }

    private p L(int i10, f... fVarArr) {
        p I10 = I(fVarArr[i10]);
        do {
            i10++;
            if (i10 >= fVarArr.length) {
                return I10;
            }
        } while (fVarArr[i10] == null);
        return p.f(I10, L(i10, fVarArr));
    }

    private f N(f fVar) {
        return fVar == null ? fVar : fVar.e();
    }

    private f O(f fVar) {
        return fVar == null ? fVar : fVar.g();
    }

    private f S(f fVar) {
        return fVar == null ? fVar : fVar.b();
    }

    private static f j0(f fVar, f fVar2) {
        return fVar == null ? fVar2 : fVar2 == null ? fVar : fVar.a(fVar2);
    }

    @Override // K5.s
    public boolean A() {
        Boolean bool = (Boolean) e0(new c());
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected D5.v J(D5.v vVar, AbstractC0928i abstractC0928i) {
        v5.H h10;
        z.a h11;
        Boolean g10;
        Boolean p10;
        AbstractC0928i n10 = n();
        boolean z10 = true;
        v5.H h12 = null;
        if (abstractC0928i != null) {
            AbstractC0776b abstractC0776b = this.f5319d;
            if (abstractC0776b != null) {
                if (n10 != null && (p10 = abstractC0776b.p(abstractC0928i)) != null) {
                    if (p10.booleanValue()) {
                        vVar = vVar.e(v.a.b(n10));
                    }
                    z10 = false;
                }
                z.a P10 = this.f5319d.P(abstractC0928i);
                if (P10 != null) {
                    h12 = P10.f();
                    h10 = P10.e();
                    if (!z10 || h12 == null || h10 == null) {
                        F5.g j10 = this.f5318c.j(M(abstractC0928i));
                        h11 = j10.h();
                        if (h11 != null) {
                            if (h12 == null) {
                                h12 = h11.f();
                            }
                            if (h10 == null) {
                                h10 = h11.e();
                            }
                        }
                        if (z10 && n10 != null && (g10 = j10.g()) != null) {
                            if (g10.booleanValue()) {
                                vVar = vVar.e(v.a.c(n10));
                            }
                            z10 = false;
                        }
                    }
                }
            }
            h10 = null;
            if (!z10) {
            }
            F5.g j102 = this.f5318c.j(M(abstractC0928i));
            h11 = j102.h();
            if (h11 != null) {
            }
            if (z10) {
                if (g10.booleanValue()) {
                }
                z10 = false;
            }
        } else {
            h10 = null;
        }
        if (z10 || h12 == null || h10 == null) {
            z.a r10 = this.f5318c.r();
            if (h12 == null) {
                h12 = r10.f();
            }
            if (h10 == null) {
                h10 = r10.e();
            }
            if (z10) {
                if (Boolean.TRUE.equals(this.f5318c.n()) && n10 != null) {
                    vVar = vVar.e(v.a.a(n10));
                }
            }
        }
        return (h12 == null && h10 == null) ? vVar : vVar.f(h12, h10);
    }

    protected int K(j jVar) {
        String c10 = jVar.c();
        if (!c10.startsWith("get") || c10.length() <= 3) {
            return (!c10.startsWith("is") || c10.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    protected Class M(AbstractC0928i abstractC0928i) {
        if (abstractC0928i instanceof j) {
            j jVar = (j) abstractC0928i;
            if (jVar.u() > 0) {
                return jVar.q(0).q();
            }
        }
        return abstractC0928i.e().q();
    }

    protected j P(j jVar, j jVar2) {
        Class<?> j10 = jVar.j();
        Class<?> j11 = jVar2.j();
        if (j10 != j11) {
            if (j10.isAssignableFrom(j11)) {
                return jVar2;
            }
            if (j11.isAssignableFrom(j10)) {
                return jVar;
            }
        }
        int R10 = R(jVar2);
        int R11 = R(jVar);
        if (R10 != R11) {
            return R10 < R11 ? jVar2 : jVar;
        }
        AbstractC0776b abstractC0776b = this.f5319d;
        if (abstractC0776b == null) {
            return null;
        }
        return abstractC0776b.k0(this.f5318c, jVar, jVar2);
    }

    protected j Q(f fVar, f fVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar.f5333a);
        arrayList.add(fVar2.f5333a);
        for (f fVar3 = fVar2.f5334b; fVar3 != null; fVar3 = fVar3.f5334b) {
            j P10 = P((j) fVar.f5333a, (j) fVar3.f5333a);
            if (P10 != fVar.f5333a) {
                Object obj = fVar3.f5333a;
                if (P10 == obj) {
                    arrayList.clear();
                    fVar = fVar3;
                } else {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.f5325j = fVar.f();
            return (j) fVar.f5333a;
        }
        throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s", u(), (String) arrayList.stream().map(new Function() { // from class: K5.D
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((j) obj2).k();
            }
        }).collect(Collectors.joining(" vs "))));
    }

    protected int R(j jVar) {
        String c10 = jVar.c();
        return (!c10.startsWith("set") || c10.length() <= 3) ? 2 : 1;
    }

    public void T(E e10) {
        this.f5322g = j0(this.f5322g, e10.f5322g);
        this.f5323h = j0(this.f5323h, e10.f5323h);
        this.f5324i = j0(this.f5324i, e10.f5324i);
        this.f5325j = j0(this.f5325j, e10.f5325j);
    }

    public void U(m mVar, D5.w wVar, boolean z10, boolean z11, boolean z12) {
        this.f5323h = new f(mVar, this.f5323h, wVar, z10, z11, z12);
    }

    public void V(C0926g c0926g, D5.w wVar, boolean z10, boolean z11, boolean z12) {
        this.f5322g = new f(c0926g, this.f5322g, wVar, z10, z11, z12);
    }

    public void W(j jVar, D5.w wVar, boolean z10, boolean z11, boolean z12) {
        this.f5324i = new f(jVar, this.f5324i, wVar, z10, z11, z12);
    }

    public void X(j jVar, D5.w wVar, boolean z10, boolean z11, boolean z12) {
        this.f5325j = new f(jVar, this.f5325j, wVar, z10, z11, z12);
    }

    public boolean Y() {
        return D(this.f5322g) || D(this.f5324i) || D(this.f5325j) || D(this.f5323h);
    }

    public boolean Z() {
        return E(this.f5322g) || E(this.f5324i) || E(this.f5325j) || E(this.f5323h);
    }

    @Override // java.lang.Comparable
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public int compareTo(E e10) {
        if (this.f5323h != null) {
            if (e10.f5323h == null) {
                return -1;
            }
        } else if (e10.f5323h != null) {
            return 1;
        }
        return u().compareTo(e10.u());
    }

    @Override // K5.s
    public boolean b() {
        return (this.f5323h == null && this.f5325j == null && this.f5322g == null) ? false : true;
    }

    public Collection b0(Collection collection) {
        HashMap hashMap = new HashMap();
        G(collection, hashMap, this.f5322g);
        G(collection, hashMap, this.f5324i);
        G(collection, hashMap, this.f5325j);
        G(collection, hashMap, this.f5323h);
        return hashMap.values();
    }

    @Override // K5.s
    public p.b c() {
        AbstractC0928i n10 = n();
        AbstractC0776b abstractC0776b = this.f5319d;
        p.b C10 = abstractC0776b == null ? null : abstractC0776b.C(n10);
        return C10 == null ? p.b.c() : C10;
    }

    public u.a c0() {
        return (u.a) f0(new d(), u.a.AUTO);
    }

    @Override // K5.s
    public AbstractC0776b.a d() {
        AbstractC0776b.a aVar = this.f5327l;
        if (aVar != null) {
            if (aVar == f5316m) {
                return null;
            }
            return aVar;
        }
        AbstractC0776b.a aVar2 = (AbstractC0776b.a) e0(new b());
        this.f5327l = aVar2 == null ? f5316m : aVar2;
        return aVar2;
    }

    public Set d0() {
        Set H10 = H(this.f5323h, H(this.f5325j, H(this.f5324i, H(this.f5322g, null))));
        return H10 == null ? Collections.emptySet() : H10;
    }

    @Override // K5.s
    public Class[] e() {
        return (Class[]) e0(new a());
    }

    protected Object e0(g gVar) {
        f fVar;
        f fVar2;
        if (this.f5319d == null) {
            return null;
        }
        if (this.f5317b) {
            f fVar3 = this.f5324i;
            if (fVar3 != null) {
                r1 = gVar.a((AbstractC0928i) fVar3.f5333a);
            }
        } else {
            f fVar4 = this.f5323h;
            r1 = fVar4 != null ? gVar.a((AbstractC0928i) fVar4.f5333a) : null;
            if (r1 == null && (fVar = this.f5325j) != null) {
                r1 = gVar.a((AbstractC0928i) fVar.f5333a);
            }
        }
        return (r1 != null || (fVar2 = this.f5322g) == null) ? r1 : gVar.a((AbstractC0928i) fVar2.f5333a);
    }

    protected Object f0(g gVar, Object obj) {
        Object a10;
        Object a11;
        Object a12;
        Object a13;
        Object a14;
        Object a15;
        Object a16;
        Object a17;
        if (this.f5319d == null) {
            return null;
        }
        if (this.f5317b) {
            f fVar = this.f5324i;
            if (fVar != null && (a17 = gVar.a((AbstractC0928i) fVar.f5333a)) != null && a17 != obj) {
                return a17;
            }
            f fVar2 = this.f5322g;
            if (fVar2 != null && (a16 = gVar.a((AbstractC0928i) fVar2.f5333a)) != null && a16 != obj) {
                return a16;
            }
            f fVar3 = this.f5323h;
            if (fVar3 != null && (a15 = gVar.a((AbstractC0928i) fVar3.f5333a)) != null && a15 != obj) {
                return a15;
            }
            f fVar4 = this.f5325j;
            if (fVar4 == null || (a14 = gVar.a((AbstractC0928i) fVar4.f5333a)) == null || a14 == obj) {
                return null;
            }
            return a14;
        }
        f fVar5 = this.f5323h;
        if (fVar5 != null && (a13 = gVar.a((AbstractC0928i) fVar5.f5333a)) != null && a13 != obj) {
            return a13;
        }
        f fVar6 = this.f5325j;
        if (fVar6 != null && (a12 = gVar.a((AbstractC0928i) fVar6.f5333a)) != null && a12 != obj) {
            return a12;
        }
        f fVar7 = this.f5322g;
        if (fVar7 != null && (a11 = gVar.a((AbstractC0928i) fVar7.f5333a)) != null && a11 != obj) {
            return a11;
        }
        f fVar8 = this.f5324i;
        if (fVar8 == null || (a10 = gVar.a((AbstractC0928i) fVar8.f5333a)) == null || a10 == obj) {
            return null;
        }
        return a10;
    }

    public String g0() {
        return this.f5321f.c();
    }

    protected AbstractC0928i h0() {
        if (this.f5317b) {
            f fVar = this.f5324i;
            if (fVar != null) {
                return (AbstractC0928i) fVar.f5333a;
            }
            f fVar2 = this.f5322g;
            if (fVar2 != null) {
                return (AbstractC0928i) fVar2.f5333a;
            }
            return null;
        }
        f fVar3 = this.f5323h;
        if (fVar3 != null) {
            return (AbstractC0928i) fVar3.f5333a;
        }
        f fVar4 = this.f5325j;
        if (fVar4 != null) {
            return (AbstractC0928i) fVar4.f5333a;
        }
        f fVar5 = this.f5322g;
        if (fVar5 != null) {
            return (AbstractC0928i) fVar5.f5333a;
        }
        f fVar6 = this.f5324i;
        if (fVar6 != null) {
            return (AbstractC0928i) fVar6.f5333a;
        }
        return null;
    }

    public D5.j i0() {
        if (this.f5317b) {
            AbstractC0921b r10 = r();
            return (r10 == null && (r10 = p()) == null) ? S5.o.H() : r10.e();
        }
        AbstractC0921b o10 = o();
        if (o10 == null) {
            j x10 = x();
            if (x10 != null) {
                return x10.q(0);
            }
            o10 = p();
        }
        return (o10 == null && (o10 = r()) == null) ? S5.o.H() : o10.e();
    }

    public void k0(boolean z10) {
        if (z10) {
            f fVar = this.f5324i;
            if (fVar != null) {
                this.f5324i = F(this.f5324i, L(0, fVar, this.f5322g, this.f5323h, this.f5325j));
                return;
            }
            f fVar2 = this.f5322g;
            if (fVar2 != null) {
                this.f5322g = F(this.f5322g, L(0, fVar2, this.f5323h, this.f5325j));
                return;
            }
            return;
        }
        f fVar3 = this.f5323h;
        if (fVar3 != null) {
            this.f5323h = F(this.f5323h, L(0, fVar3, this.f5325j, this.f5322g, this.f5324i));
            return;
        }
        f fVar4 = this.f5325j;
        if (fVar4 != null) {
            this.f5325j = F(this.f5325j, L(0, fVar4, this.f5322g, this.f5324i));
            return;
        }
        f fVar5 = this.f5322g;
        if (fVar5 != null) {
            this.f5322g = F(this.f5322g, L(0, fVar5, this.f5324i));
        }
    }

    public void l0() {
        this.f5322g = N(this.f5322g);
        this.f5324i = N(this.f5324i);
        this.f5325j = N(this.f5325j);
        this.f5323h = N(this.f5323h);
    }

    public u.a m0(boolean z10, C c10) {
        u.a c02 = c0();
        if (c02 == null) {
            c02 = u.a.AUTO;
        }
        int i10 = e.f5332a[c02.ordinal()];
        if (i10 == 1) {
            if (c10 != null) {
                c10.j(u());
                Iterator it = d0().iterator();
                while (it.hasNext()) {
                    c10.j(((D5.w) it.next()).c());
                }
            }
            this.f5325j = null;
            this.f5323h = null;
            if (!this.f5317b) {
                this.f5322g = null;
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                this.f5324i = O(this.f5324i);
                this.f5323h = O(this.f5323h);
                if (!z10 || this.f5324i == null) {
                    this.f5322g = O(this.f5322g);
                    this.f5325j = O(this.f5325j);
                }
            } else {
                this.f5324i = null;
                if (this.f5317b) {
                    this.f5322g = null;
                }
            }
        }
        return c02;
    }

    public void n0() {
        this.f5322g = S(this.f5322g);
        this.f5324i = S(this.f5324i);
        this.f5325j = S(this.f5325j);
        this.f5323h = S(this.f5323h);
    }

    @Override // K5.s
    public m o() {
        f fVar = this.f5323h;
        if (fVar == null) {
            return null;
        }
        while (!(((m) fVar.f5333a).p() instanceof C0924e)) {
            fVar = fVar.f5334b;
            if (fVar == null) {
                return (m) this.f5323h.f5333a;
            }
        }
        return (m) fVar.f5333a;
    }

    public E o0(D5.w wVar) {
        return new E(this, wVar);
    }

    @Override // K5.s
    public C0926g p() {
        f fVar = this.f5322g;
        if (fVar == null) {
            return null;
        }
        C0926g c0926g = (C0926g) fVar.f5333a;
        for (f fVar2 = fVar.f5334b; fVar2 != null; fVar2 = fVar2.f5334b) {
            C0926g c0926g2 = (C0926g) fVar2.f5333a;
            Class<?> j10 = c0926g.j();
            Class j11 = c0926g2.j();
            if (j10 != j11) {
                if (j10.isAssignableFrom(j11)) {
                    c0926g = c0926g2;
                } else if (j11.isAssignableFrom(j10)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + u() + "\": " + c0926g.k() + " vs " + c0926g2.k());
        }
        return c0926g;
    }

    @Override // K5.s
    public D5.w q() {
        return this.f5320e;
    }

    @Override // K5.s
    public j r() {
        f fVar = this.f5324i;
        if (fVar == null) {
            return null;
        }
        f fVar2 = fVar.f5334b;
        if (fVar2 == null) {
            return (j) fVar.f5333a;
        }
        while (fVar2 != null) {
            Class<?> j10 = ((j) fVar.f5333a).j();
            Class j11 = ((j) fVar2.f5333a).j();
            if (j10 != j11) {
                if (!j10.isAssignableFrom(j11)) {
                    if (j11.isAssignableFrom(j10)) {
                        continue;
                        fVar2 = fVar2.f5334b;
                    }
                }
                fVar = fVar2;
                fVar2 = fVar2.f5334b;
            }
            int K10 = K((j) fVar2.f5333a);
            int K11 = K((j) fVar.f5333a);
            if (K10 == K11) {
                throw new IllegalArgumentException("Conflicting getter definitions for property \"" + u() + "\": " + ((j) fVar.f5333a).k() + " vs " + ((j) fVar2.f5333a).k());
            }
            if (K10 >= K11) {
                fVar2 = fVar2.f5334b;
            }
            fVar = fVar2;
            fVar2 = fVar2.f5334b;
        }
        this.f5324i = fVar.f();
        return (j) fVar.f5333a;
    }

    @Override // K5.s
    public D5.v s() {
        if (this.f5326k == null) {
            AbstractC0928i h02 = h0();
            if (h02 == null) {
                this.f5326k = D5.v.f1285j;
            } else {
                Boolean e02 = this.f5319d.e0(h02);
                String z10 = this.f5319d.z(h02);
                Integer E10 = this.f5319d.E(h02);
                String y10 = this.f5319d.y(h02);
                if (e02 == null && E10 == null && y10 == null) {
                    D5.v vVar = D5.v.f1285j;
                    if (z10 != null) {
                        vVar = vVar.d(z10);
                    }
                    this.f5326k = vVar;
                } else {
                    this.f5326k = D5.v.a(e02, z10, E10, y10);
                }
                if (!this.f5317b) {
                    this.f5326k = J(this.f5326k, h02);
                }
            }
        }
        return this.f5326k;
    }

    public String toString() {
        return "[Property '" + this.f5320e + "'; ctors: " + this.f5323h + ", field(s): " + this.f5322g + ", getter(s): " + this.f5324i + ", setter(s): " + this.f5325j + "]";
    }

    @Override // K5.s
    public String u() {
        D5.w wVar = this.f5320e;
        if (wVar == null) {
            return null;
        }
        return wVar.c();
    }

    @Override // K5.s
    public AbstractC0928i v() {
        if (this.f5317b) {
            return n();
        }
        AbstractC0928i t10 = t();
        return t10 == null ? n() : t10;
    }

    @Override // K5.s
    public Class w() {
        return i0().q();
    }

    @Override // K5.s
    public j x() {
        f fVar = this.f5325j;
        if (fVar == null) {
            return null;
        }
        f fVar2 = fVar.f5334b;
        if (fVar2 == null) {
            return (j) fVar.f5333a;
        }
        while (fVar2 != null) {
            j P10 = P((j) fVar.f5333a, (j) fVar2.f5333a);
            if (P10 != fVar.f5333a) {
                if (P10 != fVar2.f5333a) {
                    return Q(fVar, fVar2);
                }
                fVar = fVar2;
            }
            fVar2 = fVar2.f5334b;
        }
        this.f5325j = fVar.f();
        return (j) fVar.f5333a;
    }

    @Override // K5.s
    public D5.w y() {
        AbstractC0776b abstractC0776b;
        AbstractC0928i v10 = v();
        if (v10 == null || (abstractC0776b = this.f5319d) == null) {
            return null;
        }
        return abstractC0776b.V(v10);
    }

    @Override // K5.s
    public boolean z() {
        return C(this.f5322g) || C(this.f5324i) || C(this.f5325j) || B(this.f5323h);
    }

    protected E(F5.l lVar, AbstractC0776b abstractC0776b, boolean z10, D5.w wVar, D5.w wVar2) {
        this.f5318c = lVar;
        this.f5319d = abstractC0776b;
        this.f5321f = wVar;
        this.f5320e = wVar2;
        this.f5317b = z10;
    }

    protected E(E e10, D5.w wVar) {
        this.f5318c = e10.f5318c;
        this.f5319d = e10.f5319d;
        this.f5321f = e10.f5321f;
        this.f5320e = wVar;
        this.f5322g = e10.f5322g;
        this.f5323h = e10.f5323h;
        this.f5324i = e10.f5324i;
        this.f5325j = e10.f5325j;
        this.f5317b = e10.f5317b;
    }
}
