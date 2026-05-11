package Db;

import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.EitherOfFour;
import expo.modules.kotlin.types.EitherOfThree;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import vc.AbstractC5011a;
import xc.C5142C;

/* loaded from: classes2.dex */
public final class a0 implements X {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f1433a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f1434b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f1435c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f1436d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f1437e;

    public static final class a extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1438b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1438b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1438b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (long[]) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            ReadableArray asArray = value.asArray();
            int size = asArray.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = (long) asArray.getDouble(i10);
            }
            return jArr;
        }
    }

    public static final class b extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1439b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1439b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1439b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (double[]) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            ReadableArray asArray = value.asArray();
            int size = asArray.size();
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = asArray.getDouble(i10);
            }
            return dArr;
        }
    }

    public static final class c extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1440b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1440b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1440b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (float[]) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            ReadableArray asArray = value.asArray();
            int size = asArray.size();
            float[] fArr = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                fArr[i10] = (float) asArray.getDouble(i10);
            }
            return fArr;
        }
    }

    public static final class d extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1441b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1441b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1441b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (boolean[]) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            ReadableArray asArray = value.asArray();
            int size = asArray.size();
            boolean[] zArr = new boolean[size];
            for (int i10 = 0; i10 < size; i10++) {
                zArr[i10] = asArray.getBoolean(i10);
            }
            return zArr;
        }
    }

    public static final class e extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1442b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1442b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1442b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (Integer) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Integer.valueOf((int) value.asDouble());
        }
    }

    public static final class f extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1443b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1443b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (Long) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Long.valueOf((long) value.asDouble());
        }
    }

    public static final class g extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1444b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1444b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (Double) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Double.valueOf(value.asDouble());
        }
    }

    public static final class h extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1445b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1445b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1445b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (Float) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Float.valueOf((float) value.asDouble());
        }
    }

    public static final class i extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1446b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1446b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (Boolean) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Boolean.valueOf(value.asBoolean());
        }
    }

    public static final class j extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1447b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1447b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1447b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (String) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.asString();
        }
    }

    public static final class k extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1448b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1448b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1448b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (ReadableArray) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.asArray();
        }
    }

    public static final class l extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1449b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1449b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1449b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (ReadableMap) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.asMap();
        }
    }

    public static final class m extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1450b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1450b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1450b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (int[]) value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            ReadableArray asArray = value.asArray();
            int size = asArray.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = asArray.getInt(i10);
            }
            return iArr;
        }
    }

    public static final class n extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1451b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1451b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new expo.modules.kotlin.exception.B(C5142C.b(Object.class));
        }
    }

    public static final class o extends AbstractC0812v {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpectedType f1452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(boolean z10, ExpectedType expectedType) {
            super(z10);
            this.f1452b = expectedType;
        }

        @Override // Db.W
        public ExpectedType b() {
            return this.f1452b;
        }

        @Override // Db.AbstractC0812v
        public Object e(Object value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        @Override // Db.AbstractC0812v
        public Object f(Dynamic value, C3862a c3862a) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new expo.modules.kotlin.exception.B(C5142C.b(Object.class));
        }
    }

    static {
        a0 a0Var = new a0();
        f1433a = a0Var;
        f1434b = a0Var.b(false);
        f1435c = a0Var.b(true);
        f1436d = new LinkedHashMap();
        f1437e = 8;
    }

    private a0() {
    }

    private final Map b(boolean z10) {
        expo.modules.kotlin.jni.a aVar = expo.modules.kotlin.jni.a.INT;
        e eVar = new e(z10, new ExpectedType(aVar));
        expo.modules.kotlin.jni.a aVar2 = expo.modules.kotlin.jni.a.LONG;
        f fVar = new f(z10, new ExpectedType(aVar2));
        expo.modules.kotlin.jni.a aVar3 = expo.modules.kotlin.jni.a.DOUBLE;
        g gVar = new g(z10, new ExpectedType(aVar3));
        expo.modules.kotlin.jni.a aVar4 = expo.modules.kotlin.jni.a.FLOAT;
        h hVar = new h(z10, new ExpectedType(aVar4));
        expo.modules.kotlin.jni.a aVar5 = expo.modules.kotlin.jni.a.BOOLEAN;
        i iVar = new i(z10, new ExpectedType(aVar5));
        Pair a10 = lc.t.a(C5142C.b(Integer.TYPE), eVar);
        Pair a11 = lc.t.a(C5142C.b(Integer.class), eVar);
        Pair a12 = lc.t.a(C5142C.b(Long.TYPE), fVar);
        Pair a13 = lc.t.a(C5142C.b(Long.class), fVar);
        Pair a14 = lc.t.a(C5142C.b(Double.TYPE), gVar);
        Pair a15 = lc.t.a(C5142C.b(Double.class), gVar);
        Pair a16 = lc.t.a(C5142C.b(Float.TYPE), hVar);
        Pair a17 = lc.t.a(C5142C.b(Float.class), hVar);
        Pair a18 = lc.t.a(C5142C.b(Boolean.TYPE), iVar);
        Pair a19 = lc.t.a(C5142C.b(Boolean.class), iVar);
        Pair a20 = lc.t.a(C5142C.b(String.class), new j(z10, new ExpectedType(expo.modules.kotlin.jni.a.STRING)));
        Pair a21 = lc.t.a(C5142C.b(ReadableArray.class), new k(z10, new ExpectedType(expo.modules.kotlin.jni.a.READABLE_ARRAY)));
        Pair a22 = lc.t.a(C5142C.b(ReadableMap.class), new l(z10, new ExpectedType(expo.modules.kotlin.jni.a.READABLE_MAP)));
        kotlin.reflect.d b10 = C5142C.b(int[].class);
        ExpectedType.Companion companion = ExpectedType.INSTANCE;
        Map k10 = kotlin.collections.G.k(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, lc.t.a(b10, new m(z10, companion.d(aVar))), lc.t.a(C5142C.b(long[].class), new a(z10, companion.d(aVar2))), lc.t.a(C5142C.b(double[].class), new b(z10, companion.d(aVar3))), lc.t.a(C5142C.b(float[].class), new c(z10, companion.d(aVar4))), lc.t.a(C5142C.b(boolean[].class), new d(z10, companion.d(aVar5))), lc.t.a(C5142C.b(byte[].class), new C0799h(z10)), lc.t.a(C5142C.b(JavaScriptValue.class), new n(z10, new ExpectedType(expo.modules.kotlin.jni.a.JS_VALUE))), lc.t.a(C5142C.b(JavaScriptObject.class), new o(z10, new ExpectedType(expo.modules.kotlin.jni.a.JS_OBJECT))), lc.t.a(C5142C.b(Cb.h.class), new I(z10)), lc.t.a(C5142C.b(Cb.f.class), new G(z10)), lc.t.a(C5142C.b(Cb.g.class), new H(z10)), lc.t.a(C5142C.b(Cb.n.class), new e0(z10)), lc.t.a(C5142C.b(Cb.o.class), new f0(z10)), lc.t.a(C5142C.b(Cb.l.class), new c0(z10)), lc.t.a(C5142C.b(Cb.m.class), new d0(z10)), lc.t.a(C5142C.b(Cb.c.class), new D(z10)), lc.t.a(C5142C.b(Cb.d.class), new E(z10)), lc.t.a(C5142C.b(Cb.a.class), new C0797f(z10)), lc.t.a(C5142C.b(Cb.b.class), new C0798g(z10)), lc.t.a(C5142C.b(Cb.j.class), new b0(z10)), lc.t.a(C5142C.b(URL.class), new Gb.b(z10)), lc.t.a(C5142C.b(Uri.class), new Gb.c(z10)), lc.t.a(C5142C.b(URI.class), new Gb.a(z10)), lc.t.a(C5142C.b(File.class), new Fb.a(z10)), lc.t.a(C5142C.b(kotlin.time.a.class), new C0811u(z10)), lc.t.a(C5142C.b(Object.class), new C0793b(z10)), lc.t.a(C5142C.b(Unit.class), new h0()), lc.t.a(C5142C.b(Ca.b.class), new S(z10)));
        return Build.VERSION.SDK_INT >= 26 ? kotlin.collections.G.n(k10, kotlin.collections.G.k(lc.t.a(C5142C.b(Y.a()), new Fb.b(z10)), lc.t.a(C5142C.b(Color.class), new C0801j(z10)), lc.t.a(C5142C.b(Z.a()), new C0809s(z10)))) : k10;
    }

    private final W c(kotlin.reflect.o oVar) {
        return oVar.p() ? (W) f1435c.get(oVar.j()) : (W) f1434b.get(oVar.j());
    }

    private final W d(kotlin.reflect.o oVar, Class cls) {
        if (Either.class.isAssignableFrom(cls)) {
            return EitherOfFour.class.isAssignableFrom(cls) ? new C0813w(this, oVar) : EitherOfThree.class.isAssignableFrom(cls) ? new C0814x(this, oVar) : new C0815y(this, oVar);
        }
        return null;
    }

    @Override // Db.X
    public W a(kotlin.reflect.o type) {
        Intrinsics.checkNotNullParameter(type, "type");
        W c10 = c(type);
        if (c10 != null) {
            return c10;
        }
        kotlin.reflect.e j10 = type.j();
        kotlin.reflect.d dVar = j10 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j10 : null;
        if (dVar == null) {
            throw new expo.modules.kotlin.exception.v(type);
        }
        Class b10 = AbstractC5011a.b(dVar);
        if (b10.isArray() || Object[].class.isAssignableFrom(b10)) {
            return new C0795d(this, type);
        }
        if (List.class.isAssignableFrom(b10)) {
            return new N(this, type);
        }
        if (Map.class.isAssignableFrom(b10)) {
            return new O(this, type);
        }
        if (Pair.class.isAssignableFrom(b10)) {
            return new Q(this, type);
        }
        if (Set.class.isAssignableFrom(b10)) {
            return new V(this, type);
        }
        if (b10.isEnum()) {
            return new B(dVar, type.p());
        }
        Map map = f1436d;
        W w10 = (W) map.get(type);
        if (w10 != null) {
            return w10;
        }
        if (Ab.c.class.isAssignableFrom(b10)) {
            Ab.d dVar2 = new Ab.d(this, type);
            map.put(type, dVar2);
            return dVar2;
        }
        if (View.class.isAssignableFrom(b10)) {
            return new expo.modules.kotlin.views.r(type);
        }
        if (SharedRef.class.isAssignableFrom(b10)) {
            return new Bb.e(type);
        }
        if (SharedObject.class.isAssignableFrom(b10)) {
            return new Bb.d(type);
        }
        if (JavaScriptFunction.class.isAssignableFrom(b10)) {
            return new L(type);
        }
        W d10 = d(type, b10);
        if (d10 != null) {
            return d10;
        }
        throw new expo.modules.kotlin.exception.v(type);
    }
}
