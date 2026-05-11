package l1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3598a implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0544a f36992c = new C0544a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f36993a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f36994b;

    /* renamed from: l1.a$a, reason: collision with other inner class name */
    public static final class C0544a {
        public /* synthetic */ C0544a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.s1(i10);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.P0(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.m0(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.m0(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.G0(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.G0(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.G0(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.G0(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.b0(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.G0(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        private C0544a() {
        }
    }

    public C3598a(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f36993a = query;
        this.f36994b = objArr;
    }

    @Override // l1.j
    public void a(i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f36992c.b(statement, this.f36994b);
    }

    @Override // l1.j
    public String b() {
        return this.f36993a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3598a(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
