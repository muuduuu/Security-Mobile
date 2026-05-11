package S5;

import D5.B;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class m extends D5.j implements D5.n {

    /* renamed from: j, reason: collision with root package name */
    private static final n f8765j = n.h();

    /* renamed from: k, reason: collision with root package name */
    private static final D5.j[] f8766k = new D5.j[0];

    /* renamed from: f, reason: collision with root package name */
    protected final D5.j f8767f;

    /* renamed from: g, reason: collision with root package name */
    protected final D5.j[] f8768g;

    /* renamed from: h, reason: collision with root package name */
    protected final n f8769h;

    /* renamed from: i, reason: collision with root package name */
    volatile transient String f8770i;

    protected m(Class cls, n nVar, D5.j jVar, D5.j[] jVarArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, i10, obj, obj2, z10);
        this.f8769h = nVar == null ? f8765j : nVar;
        this.f8767f = jVar;
        this.f8768g = jVarArr;
    }

    protected static StringBuilder T(Class cls, StringBuilder sb2, boolean z10) {
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = name.charAt(i10);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb2.append(charAt);
            }
            if (z10) {
                sb2.append(';');
            }
        } else if (cls == Boolean.TYPE) {
            sb2.append('Z');
        } else if (cls == Byte.TYPE) {
            sb2.append('B');
        } else if (cls == Short.TYPE) {
            sb2.append('S');
        } else if (cls == Character.TYPE) {
            sb2.append('C');
        } else if (cls == Integer.TYPE) {
            sb2.append('I');
        } else if (cls == Long.TYPE) {
            sb2.append('J');
        } else if (cls == Float.TYPE) {
            sb2.append('F');
        } else if (cls == Double.TYPE) {
            sb2.append('D');
        } else {
            if (cls != Void.TYPE) {
                throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
            }
            sb2.append('V');
        }
        return sb2;
    }

    protected boolean U(int i10) {
        return this.f1258a.getTypeParameters().length == i10;
    }

    protected String V() {
        return this.f1258a.getName();
    }

    @Override // D5.n
    public void c(com.fasterxml.jackson.core.f fVar, B b10, M5.g gVar) {
        B5.b bVar = new B5.b(this, com.fasterxml.jackson.core.k.VALUE_STRING);
        gVar.g(fVar, bVar);
        e(fVar, b10);
        gVar.h(fVar, bVar);
    }

    @Override // B5.a
    public String d() {
        String str = this.f8770i;
        return str == null ? V() : str;
    }

    @Override // D5.n
    public void e(com.fasterxml.jackson.core.f fVar, B b10) {
        fVar.h2(d());
    }

    @Override // D5.j
    public D5.j f(int i10) {
        return this.f8769h.j(i10);
    }

    @Override // D5.j
    public int g() {
        return this.f8769h.n();
    }

    @Override // D5.j
    public final D5.j i(Class cls) {
        D5.j i10;
        D5.j[] jVarArr;
        if (cls == this.f1258a) {
            return this;
        }
        if (cls.isInterface() && (jVarArr = this.f8768g) != null) {
            int length = jVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                D5.j i12 = this.f8768g[i11].i(cls);
                if (i12 != null) {
                    return i12;
                }
            }
        }
        D5.j jVar = this.f8767f;
        if (jVar == null || (i10 = jVar.i(cls)) == null) {
            return null;
        }
        return i10;
    }

    @Override // D5.j
    public n j() {
        return this.f8769h;
    }

    @Override // D5.j
    public List o() {
        D5.j[] jVarArr = this.f8768g;
        if (jVarArr == null) {
            return Collections.emptyList();
        }
        int length = jVarArr.length;
        return length != 0 ? length != 1 ? Arrays.asList(jVarArr) : Collections.singletonList(jVarArr[0]) : Collections.emptyList();
    }

    @Override // D5.j
    public D5.j s() {
        return this.f8767f;
    }
}
