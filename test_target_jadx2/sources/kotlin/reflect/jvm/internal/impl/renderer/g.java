package kotlin.reflect.jvm.internal.impl.renderer;

import Kc.j0;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.reflect.jvm.internal.impl.renderer.f;
import kotlin.text.StringsKt;
import xc.C5142C;
import xc.o;
import xc.u;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: Y, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f36613Y = {C5142C.e(new o(C5142C.b(g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C5142C.e(new o(C5142C.b(g.class), "withDefinedIn", "getWithDefinedIn()Z")), C5142C.e(new o(C5142C.b(g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C5142C.e(new o(C5142C.b(g.class), "modifiers", "getModifiers()Ljava/util/Set;")), C5142C.e(new o(C5142C.b(g.class), "startFromName", "getStartFromName()Z")), C5142C.e(new o(C5142C.b(g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C5142C.e(new o(C5142C.b(g.class), "debugMode", "getDebugMode()Z")), C5142C.e(new o(C5142C.b(g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C5142C.e(new o(C5142C.b(g.class), "verbose", "getVerbose()Z")), C5142C.e(new o(C5142C.b(g.class), "unitReturnType", "getUnitReturnType()Z")), C5142C.e(new o(C5142C.b(g.class), "withoutReturnType", "getWithoutReturnType()Z")), C5142C.e(new o(C5142C.b(g.class), "enhancedTypes", "getEnhancedTypes()Z")), C5142C.e(new o(C5142C.b(g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C5142C.e(new o(C5142C.b(g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C5142C.e(new o(C5142C.b(g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), C5142C.e(new o(C5142C.b(g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C5142C.e(new o(C5142C.b(g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C5142C.e(new o(C5142C.b(g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C5142C.e(new o(C5142C.b(g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C5142C.e(new o(C5142C.b(g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), C5142C.e(new o(C5142C.b(g.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), C5142C.e(new o(C5142C.b(g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C5142C.e(new o(C5142C.b(g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C5142C.e(new o(C5142C.b(g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C5142C.e(new o(C5142C.b(g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C5142C.e(new o(C5142C.b(g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C5142C.e(new o(C5142C.b(g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C5142C.e(new o(C5142C.b(g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C5142C.e(new o(C5142C.b(g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C5142C.e(new o(C5142C.b(g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C5142C.e(new o(C5142C.b(g.class), "receiverAfterName", "getReceiverAfterName()Z")), C5142C.e(new o(C5142C.b(g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C5142C.e(new o(C5142C.b(g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C5142C.e(new o(C5142C.b(g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C5142C.e(new o(C5142C.b(g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C5142C.e(new o(C5142C.b(g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C5142C.e(new o(C5142C.b(g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C5142C.e(new o(C5142C.b(g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C5142C.e(new o(C5142C.b(g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C5142C.e(new o(C5142C.b(g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C5142C.e(new o(C5142C.b(g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C5142C.e(new o(C5142C.b(g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C5142C.e(new o(C5142C.b(g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C5142C.e(new o(C5142C.b(g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C5142C.e(new o(C5142C.b(g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C5142C.e(new o(C5142C.b(g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C5142C.e(new o(C5142C.b(g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C5142C.e(new o(C5142C.b(g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), C5142C.e(new o(C5142C.b(g.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* renamed from: A, reason: collision with root package name */
    private final Ac.d f36614A;

    /* renamed from: B, reason: collision with root package name */
    private final Ac.d f36615B;

    /* renamed from: C, reason: collision with root package name */
    private final Ac.d f36616C;

    /* renamed from: D, reason: collision with root package name */
    private final Ac.d f36617D;

    /* renamed from: E, reason: collision with root package name */
    private final Ac.d f36618E;

    /* renamed from: F, reason: collision with root package name */
    private final Ac.d f36619F;

    /* renamed from: G, reason: collision with root package name */
    private final Ac.d f36620G;

    /* renamed from: H, reason: collision with root package name */
    private final Ac.d f36621H;

    /* renamed from: I, reason: collision with root package name */
    private final Ac.d f36622I;

    /* renamed from: J, reason: collision with root package name */
    private final Ac.d f36623J;

    /* renamed from: K, reason: collision with root package name */
    private final Ac.d f36624K;

    /* renamed from: L, reason: collision with root package name */
    private final Ac.d f36625L;

    /* renamed from: M, reason: collision with root package name */
    private final Ac.d f36626M;

    /* renamed from: N, reason: collision with root package name */
    private final Ac.d f36627N;

    /* renamed from: O, reason: collision with root package name */
    private final Ac.d f36628O;

    /* renamed from: P, reason: collision with root package name */
    private final Ac.d f36629P;

    /* renamed from: Q, reason: collision with root package name */
    private final Ac.d f36630Q;

    /* renamed from: R, reason: collision with root package name */
    private final Ac.d f36631R;

    /* renamed from: S, reason: collision with root package name */
    private final Ac.d f36632S;

    /* renamed from: T, reason: collision with root package name */
    private final Ac.d f36633T;

    /* renamed from: U, reason: collision with root package name */
    private final Ac.d f36634U;

    /* renamed from: V, reason: collision with root package name */
    private final Ac.d f36635V;

    /* renamed from: W, reason: collision with root package name */
    private final Ac.d f36636W;

    /* renamed from: X, reason: collision with root package name */
    private final Ac.d f36637X;

    /* renamed from: a, reason: collision with root package name */
    private boolean f36638a;

    /* renamed from: b, reason: collision with root package name */
    private final Ac.d f36639b = n0(b.c.f36577a);

    /* renamed from: c, reason: collision with root package name */
    private final Ac.d f36640c;

    /* renamed from: d, reason: collision with root package name */
    private final Ac.d f36641d;

    /* renamed from: e, reason: collision with root package name */
    private final Ac.d f36642e;

    /* renamed from: f, reason: collision with root package name */
    private final Ac.d f36643f;

    /* renamed from: g, reason: collision with root package name */
    private final Ac.d f36644g;

    /* renamed from: h, reason: collision with root package name */
    private final Ac.d f36645h;

    /* renamed from: i, reason: collision with root package name */
    private final Ac.d f36646i;

    /* renamed from: j, reason: collision with root package name */
    private final Ac.d f36647j;

    /* renamed from: k, reason: collision with root package name */
    private final Ac.d f36648k;

    /* renamed from: l, reason: collision with root package name */
    private final Ac.d f36649l;

    /* renamed from: m, reason: collision with root package name */
    private final Ac.d f36650m;

    /* renamed from: n, reason: collision with root package name */
    private final Ac.d f36651n;

    /* renamed from: o, reason: collision with root package name */
    private final Ac.d f36652o;

    /* renamed from: p, reason: collision with root package name */
    private final Ac.d f36653p;

    /* renamed from: q, reason: collision with root package name */
    private final Ac.d f36654q;

    /* renamed from: r, reason: collision with root package name */
    private final Ac.d f36655r;

    /* renamed from: s, reason: collision with root package name */
    private final Ac.d f36656s;

    /* renamed from: t, reason: collision with root package name */
    private final Ac.d f36657t;

    /* renamed from: u, reason: collision with root package name */
    private final Ac.d f36658u;

    /* renamed from: v, reason: collision with root package name */
    private final Ac.d f36659v;

    /* renamed from: w, reason: collision with root package name */
    private final Ac.d f36660w;

    /* renamed from: x, reason: collision with root package name */
    private final Ac.d f36661x;

    /* renamed from: y, reason: collision with root package name */
    private final Ac.d f36662y;

    /* renamed from: z, reason: collision with root package name */
    private final Ac.d f36663z;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36664a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(j0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "...";
        }
    }

    public static final class b extends Ac.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f36665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, g gVar) {
            super(obj);
            this.f36665b = gVar;
        }

        @Override // Ac.b
        protected boolean d(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (this.f36665b.l0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f36666a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(AbstractC5197E it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    public g() {
        Boolean bool = Boolean.TRUE;
        this.f36640c = n0(bool);
        this.f36641d = n0(bool);
        this.f36642e = n0(e.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f36643f = n0(bool2);
        this.f36644g = n0(bool2);
        this.f36645h = n0(bool2);
        this.f36646i = n0(bool2);
        this.f36647j = n0(bool2);
        this.f36648k = n0(bool);
        this.f36649l = n0(bool2);
        this.f36650m = n0(bool2);
        this.f36651n = n0(bool2);
        this.f36652o = n0(bool);
        this.f36653p = n0(bool);
        this.f36654q = n0(bool2);
        this.f36655r = n0(bool2);
        this.f36656s = n0(bool2);
        this.f36657t = n0(bool2);
        this.f36658u = n0(bool2);
        this.f36659v = n0(null);
        this.f36660w = n0(bool2);
        this.f36661x = n0(bool2);
        this.f36662y = n0(c.f36666a);
        this.f36663z = n0(a.f36664a);
        this.f36614A = n0(bool);
        this.f36615B = n0(j.RENDER_OPEN);
        this.f36616C = n0(c.l.a.f36600a);
        this.f36617D = n0(m.PLAIN);
        this.f36618E = n0(k.ALL);
        this.f36619F = n0(bool2);
        this.f36620G = n0(bool2);
        this.f36621H = n0(l.DEBUG);
        this.f36622I = n0(bool2);
        this.f36623J = n0(bool2);
        this.f36624K = n0(O.d());
        this.f36625L = n0(h.f36667a.a());
        this.f36626M = n0(null);
        this.f36627N = n0(kotlin.reflect.jvm.internal.impl.renderer.a.NO_ARGUMENTS);
        this.f36628O = n0(bool2);
        this.f36629P = n0(bool);
        this.f36630Q = n0(bool);
        this.f36631R = n0(bool2);
        this.f36632S = n0(bool);
        this.f36633T = n0(bool);
        this.f36634U = n0(bool2);
        this.f36635V = n0(bool2);
        this.f36636W = n0(bool2);
        this.f36637X = n0(bool);
    }

    private final Ac.d n0(Object obj) {
        Ac.a aVar = Ac.a.f412a;
        return new b(obj, this);
    }

    public boolean A() {
        return ((Boolean) this.f36632S.a(this, f36613Y[43])).booleanValue();
    }

    public boolean B() {
        return f.a.a(this);
    }

    public boolean C() {
        return f.a.b(this);
    }

    public boolean D() {
        return ((Boolean) this.f36658u.a(this, f36613Y[19])).booleanValue();
    }

    public boolean E() {
        return ((Boolean) this.f36637X.a(this, f36613Y[48])).booleanValue();
    }

    public Set F() {
        return (Set) this.f36642e.a(this, f36613Y[3]);
    }

    public boolean G() {
        return ((Boolean) this.f36651n.a(this, f36613Y[12])).booleanValue();
    }

    public j H() {
        return (j) this.f36615B.a(this, f36613Y[26]);
    }

    public k I() {
        return (k) this.f36618E.a(this, f36613Y[29]);
    }

    public boolean J() {
        return ((Boolean) this.f36633T.a(this, f36613Y[44])).booleanValue();
    }

    public boolean K() {
        return ((Boolean) this.f36635V.a(this, f36613Y[46])).booleanValue();
    }

    public l L() {
        return (l) this.f36621H.a(this, f36613Y[32]);
    }

    public Function1 M() {
        return (Function1) this.f36659v.a(this, f36613Y[20]);
    }

    public boolean N() {
        return ((Boolean) this.f36619F.a(this, f36613Y[30])).booleanValue();
    }

    public boolean O() {
        return ((Boolean) this.f36620G.a(this, f36613Y[31])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.f36654q.a(this, f36613Y[15])).booleanValue();
    }

    public boolean Q() {
        return ((Boolean) this.f36629P.a(this, f36613Y[40])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f36622I.a(this, f36613Y[33])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f36653p.a(this, f36613Y[14])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f36652o.a(this, f36613Y[13])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f36655r.a(this, f36613Y[16])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f36631R.a(this, f36613Y[42])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f36630Q.a(this, f36613Y[41])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f36614A.a(this, f36613Y[25])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f36644g.a(this, f36613Y[5])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f36643f.a(this, f36613Y[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void a(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f36625L.b(this, f36613Y[36], set);
    }

    public m a0() {
        return (m) this.f36617D.a(this, f36613Y[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void b(boolean z10) {
        this.f36643f.b(this, f36613Y[4], Boolean.valueOf(z10));
    }

    public Function1 b0() {
        return (Function1) this.f36662y.a(this, f36613Y[23]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void c(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f36642e.b(this, f36613Y[3], set);
    }

    public boolean c0() {
        return ((Boolean) this.f36657t.a(this, f36613Y[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void d(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f36618E.b(this, f36613Y[29], kVar);
    }

    public boolean d0() {
        return ((Boolean) this.f36648k.a(this, f36613Y[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void e(boolean z10) {
        this.f36640c.b(this, f36613Y[1], Boolean.valueOf(z10));
    }

    public c.l e0() {
        return (c.l) this.f36616C.a(this, f36613Y[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean f() {
        return ((Boolean) this.f36650m.a(this, f36613Y[11])).booleanValue();
    }

    public boolean f0() {
        return ((Boolean) this.f36647j.a(this, f36613Y[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void g(kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f36639b.b(this, f36613Y[0], bVar);
    }

    public boolean g0() {
        return ((Boolean) this.f36640c.a(this, f36613Y[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void h(boolean z10) {
        this.f36661x.b(this, f36613Y[22], Boolean.valueOf(z10));
    }

    public boolean h0() {
        return ((Boolean) this.f36641d.a(this, f36613Y[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void i(boolean z10) {
        this.f36645h.b(this, f36613Y[6], Boolean.valueOf(z10));
    }

    public boolean i0() {
        return ((Boolean) this.f36649l.a(this, f36613Y[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void j(boolean z10) {
        this.f36620G.b(this, f36613Y[31], Boolean.valueOf(z10));
    }

    public boolean j0() {
        return ((Boolean) this.f36661x.a(this, f36613Y[22])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void k(boolean z10) {
        this.f36619F.b(this, f36613Y[30], Boolean.valueOf(z10));
    }

    public boolean k0() {
        return ((Boolean) this.f36660w.a(this, f36613Y[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void l(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.f36617D.b(this, f36613Y[28], mVar);
    }

    public final boolean l0() {
        return this.f36638a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public Set m() {
        return (Set) this.f36625L.a(this, f36613Y[36]);
    }

    public final void m0() {
        this.f36638a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public boolean n() {
        return ((Boolean) this.f36645h.a(this, f36613Y[6])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public kotlin.reflect.jvm.internal.impl.renderer.a o() {
        return (kotlin.reflect.jvm.internal.impl.renderer.a) this.f36627N.a(this, f36613Y[38]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.f
    public void p(boolean z10) {
        this.f36660w.b(this, f36613Y[21], Boolean.valueOf(z10));
    }

    public final g q() {
        g gVar = new g();
        Field[] declaredFields = g.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                Ac.b bVar = obj instanceof Ac.b ? (Ac.b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    StringsKt.F(name, "is", false, 2, null);
                    kotlin.reflect.d b10 = C5142C.b(g.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        name3 = upperCase + substring;
                    }
                    sb2.append(name3);
                    field.set(gVar, gVar.n0(bVar.a(this, new u(b10, name2, sb2.toString()))));
                }
            }
        }
        return gVar;
    }

    public boolean r() {
        return ((Boolean) this.f36656s.a(this, f36613Y[17])).booleanValue();
    }

    public boolean s() {
        return ((Boolean) this.f36628O.a(this, f36613Y[39])).booleanValue();
    }

    public Function1 t() {
        return (Function1) this.f36626M.a(this, f36613Y[37]);
    }

    public boolean u() {
        return ((Boolean) this.f36636W.a(this, f36613Y[47])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.f36646i.a(this, f36613Y[7])).booleanValue();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.b w() {
        return (kotlin.reflect.jvm.internal.impl.renderer.b) this.f36639b.a(this, f36613Y[0]);
    }

    public Function1 x() {
        return (Function1) this.f36663z.a(this, f36613Y[24]);
    }

    public boolean y() {
        return ((Boolean) this.f36623J.a(this, f36613Y[34])).booleanValue();
    }

    public Set z() {
        return (Set) this.f36624K.a(this, f36613Y[35]);
    }
}
