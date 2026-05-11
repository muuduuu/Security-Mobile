package M0;

import I0.A;
import I0.C0838d;
import L0.f;
import L0.g;
import L0.h;
import M0.f;
import androidx.datastore.preferences.protobuf.AbstractC1540g;
import androidx.datastore.preferences.protobuf.AbstractC1555w;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lc.m;

/* loaded from: classes.dex */
public final class h implements A {

    /* renamed from: a, reason: collision with root package name */
    public static final h f5970a = new h();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5971a;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5971a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, L0.h hVar, c cVar) {
        h.b d02 = hVar.d0();
        switch (d02 == null ? -1 : a.f5971a[d02.ordinal()]) {
            case -1:
                throw new C0838d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new m();
            case 1:
                cVar.i(i.a(str), Boolean.valueOf(hVar.U()));
                return;
            case 2:
                cVar.i(i.d(str), Float.valueOf(hVar.Y()));
                return;
            case 3:
                cVar.i(i.c(str), Double.valueOf(hVar.X()));
                return;
            case 4:
                cVar.i(i.e(str), Integer.valueOf(hVar.Z()));
                return;
            case 5:
                cVar.i(i.f(str), Long.valueOf(hVar.a0()));
                return;
            case 6:
                f.a g10 = i.g(str);
                String b02 = hVar.b0();
                Intrinsics.checkNotNullExpressionValue(b02, "value.string");
                cVar.i(g10, b02);
                return;
            case 7:
                f.a h10 = i.h(str);
                List Q10 = hVar.c0().Q();
                Intrinsics.checkNotNullExpressionValue(Q10, "value.stringSet.stringsList");
                cVar.i(h10, CollectionsKt.S0(Q10));
                return;
            case 8:
                f.a b10 = i.b(str);
                byte[] D10 = hVar.V().D();
                Intrinsics.checkNotNullExpressionValue(D10, "value.bytes.toByteArray()");
                cVar.i(b10, D10);
                return;
            case 9:
                throw new C0838d("Value not set.", null, 2, null);
        }
    }

    private final L0.h f(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC1555w i10 = L0.h.e0().s(((Boolean) obj).booleanValue()).i();
            Intrinsics.checkNotNullExpressionValue(i10, "newBuilder().setBoolean(value).build()");
            return (L0.h) i10;
        }
        if (obj instanceof Float) {
            AbstractC1555w i11 = L0.h.e0().x(((Number) obj).floatValue()).i();
            Intrinsics.checkNotNullExpressionValue(i11, "newBuilder().setFloat(value).build()");
            return (L0.h) i11;
        }
        if (obj instanceof Double) {
            AbstractC1555w i12 = L0.h.e0().w(((Number) obj).doubleValue()).i();
            Intrinsics.checkNotNullExpressionValue(i12, "newBuilder().setDouble(value).build()");
            return (L0.h) i12;
        }
        if (obj instanceof Integer) {
            AbstractC1555w i13 = L0.h.e0().y(((Number) obj).intValue()).i();
            Intrinsics.checkNotNullExpressionValue(i13, "newBuilder().setInteger(value).build()");
            return (L0.h) i13;
        }
        if (obj instanceof Long) {
            AbstractC1555w i14 = L0.h.e0().z(((Number) obj).longValue()).i();
            Intrinsics.checkNotNullExpressionValue(i14, "newBuilder().setLong(value).build()");
            return (L0.h) i14;
        }
        if (obj instanceof String) {
            AbstractC1555w i15 = L0.h.e0().A((String) obj).i();
            Intrinsics.checkNotNullExpressionValue(i15, "newBuilder().setString(value).build()");
            return (L0.h) i15;
        }
        if (obj instanceof Set) {
            h.a e02 = L0.h.e0();
            g.a R10 = L0.g.R();
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC1555w i16 = e02.B(R10.s((Set) obj)).i();
            Intrinsics.checkNotNullExpressionValue(i16, "newBuilder()\n           …                 .build()");
            return (L0.h) i16;
        }
        if (obj instanceof byte[]) {
            AbstractC1555w i17 = L0.h.e0().v(AbstractC1540g.k((byte[]) obj)).i();
            Intrinsics.checkNotNullExpressionValue(i17, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (L0.h) i17;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // I0.A
    public Object c(InputStream inputStream, kotlin.coroutines.d dVar) {
        L0.f a10 = L0.d.f5633a.a(inputStream);
        c b10 = g.b(new f.b[0]);
        Map O10 = a10.O();
        Intrinsics.checkNotNullExpressionValue(O10, "preferencesProto.preferencesMap");
        for (Map.Entry entry : O10.entrySet()) {
            String name = (String) entry.getKey();
            L0.h value = (L0.h) entry.getValue();
            h hVar = f5970a;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            hVar.d(name, value, b10);
        }
        return b10.d();
    }

    @Override // I0.A
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f a() {
        return g.a();
    }

    @Override // I0.A
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object b(f fVar, OutputStream outputStream, kotlin.coroutines.d dVar) {
        Map a10 = fVar.a();
        f.a R10 = L0.f.R();
        for (Map.Entry entry : a10.entrySet()) {
            R10.s(((f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((L0.f) R10.i()).e(outputStream);
        return Unit.f36324a;
    }
}
