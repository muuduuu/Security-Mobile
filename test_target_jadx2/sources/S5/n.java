package S5;

import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class n implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f8771e;

    /* renamed from: f, reason: collision with root package name */
    private static final D5.j[] f8772f;

    /* renamed from: g, reason: collision with root package name */
    private static final n f8773g;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f8774a;

    /* renamed from: b, reason: collision with root package name */
    private final D5.j[] f8775b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f8776c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8777d;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f8778a;

        /* renamed from: b, reason: collision with root package name */
        private final D5.j[] f8779b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8780c;

        public a(Class cls, D5.j[] jVarArr, int i10) {
            this.f8778a = cls;
            this.f8779b = jVarArr;
            this.f8780c = i10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8780c == aVar.f8780c && this.f8778a == aVar.f8778a) {
                D5.j[] jVarArr = aVar.f8779b;
                int length = this.f8779b.length;
                if (length == jVarArr.length) {
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!this.f8779b[i10].equals(jVarArr[i10])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f8780c;
        }

        public String toString() {
            return this.f8778a.getName() + "<>";
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final TypeVariable[] f8781a = AbstractList.class.getTypeParameters();

        /* renamed from: b, reason: collision with root package name */
        private static final TypeVariable[] f8782b = Collection.class.getTypeParameters();

        /* renamed from: c, reason: collision with root package name */
        private static final TypeVariable[] f8783c = Iterable.class.getTypeParameters();

        /* renamed from: d, reason: collision with root package name */
        private static final TypeVariable[] f8784d = List.class.getTypeParameters();

        /* renamed from: e, reason: collision with root package name */
        private static final TypeVariable[] f8785e = ArrayList.class.getTypeParameters();

        /* renamed from: f, reason: collision with root package name */
        private static final TypeVariable[] f8786f = Map.class.getTypeParameters();

        /* renamed from: g, reason: collision with root package name */
        private static final TypeVariable[] f8787g = HashMap.class.getTypeParameters();

        /* renamed from: h, reason: collision with root package name */
        private static final TypeVariable[] f8788h = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable[] a(Class cls) {
            return cls == Collection.class ? f8782b : cls == List.class ? f8784d : cls == ArrayList.class ? f8785e : cls == AbstractList.class ? f8781a : cls == Iterable.class ? f8783c : cls.getTypeParameters();
        }

        public static TypeVariable[] b(Class cls) {
            return cls == Map.class ? f8786f : cls == HashMap.class ? f8787g : cls == LinkedHashMap.class ? f8788h : cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        f8771e = strArr;
        D5.j[] jVarArr = new D5.j[0];
        f8772f = jVarArr;
        f8773g = new n(strArr, jVarArr, null);
    }

    private n(String[] strArr, D5.j[] jVarArr, String[] strArr2) {
        strArr = strArr == null ? f8771e : strArr;
        this.f8774a = strArr;
        jVarArr = jVarArr == null ? f8772f : jVarArr;
        this.f8775b = jVarArr;
        if (strArr.length != jVarArr.length) {
            throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + jVarArr.length + ")");
        }
        int length = jVarArr.length;
        int i10 = 1;
        for (int i11 = 0; i11 < length; i11++) {
            i10 += this.f8775b[i11].hashCode();
        }
        this.f8776c = strArr2;
        this.f8777d = i10;
    }

    public static n b(Class cls, D5.j jVar) {
        TypeVariable[] a10 = b.a(cls);
        int length = a10 == null ? 0 : a10.length;
        if (length == 1) {
            return new n(new String[]{a10[0].getName()}, new D5.j[]{jVar}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static n c(Class cls, D5.j jVar, D5.j jVar2) {
        TypeVariable[] b10 = b.b(cls);
        int length = b10 == null ? 0 : b10.length;
        if (length == 2) {
            return new n(new String[]{b10[0].getName(), b10[1].getName()}, new D5.j[]{jVar, jVar2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static n d(Class cls, D5.j[] jVarArr) {
        String[] strArr;
        if (jVarArr == null) {
            jVarArr = f8772f;
        } else {
            int length = jVarArr.length;
            if (length == 1) {
                return b(cls, jVarArr[0]);
            }
            if (length == 2) {
                return c(cls, jVarArr[0], jVarArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = f8771e;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
        }
        if (strArr.length == jVarArr.length) {
            return new n(strArr, jVarArr, null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot create TypeBindings for class ");
        sb2.append(cls.getName());
        sb2.append(" with ");
        sb2.append(jVarArr.length);
        sb2.append(" type parameter");
        sb2.append(jVarArr.length == 1 ? BuildConfig.FLAVOR : "s");
        sb2.append(": class expects ");
        sb2.append(strArr.length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static n e(List list, List list2) {
        return (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) ? f8773g : new n((String[]) list.toArray(f8771e), (D5.j[]) list2.toArray(f8772f), null);
    }

    public static n f(Class cls, D5.j jVar) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return f8773g;
        }
        if (length == 1) {
            return new n(new String[]{typeParameters[0].getName()}, new D5.j[]{jVar}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static n g(Class cls, D5.j[] jVarArr) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return f8773g;
        }
        if (jVarArr == null) {
            jVarArr = f8772f;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = typeParameters[i10].getName();
        }
        if (length == jVarArr.length) {
            return new n(strArr, jVarArr, null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot create TypeBindings for class ");
        sb2.append(cls.getName());
        sb2.append(" with ");
        sb2.append(jVarArr.length);
        sb2.append(" type parameter");
        sb2.append(jVarArr.length == 1 ? BuildConfig.FLAVOR : "s");
        sb2.append(": class expects ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static n h() {
        return f8773g;
    }

    public Object a(Class cls) {
        return new a(cls, this.f8775b, this.f8777d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!T5.f.D(obj, getClass())) {
            return false;
        }
        n nVar = (n) obj;
        int length = this.f8775b.length;
        if (length != nVar.n()) {
            return false;
        }
        D5.j[] jVarArr = nVar.f8775b;
        for (int i10 = 0; i10 < length; i10++) {
            if (!jVarArr[i10].equals(this.f8775b[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f8777d;
    }

    public D5.j i(String str) {
        D5.j W10;
        int length = this.f8774a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(this.f8774a[i10])) {
                D5.j jVar = this.f8775b[i10];
                return (!(jVar instanceof k) || (W10 = ((k) jVar).W()) == null) ? jVar : W10;
            }
        }
        return null;
    }

    public D5.j j(int i10) {
        if (i10 < 0) {
            return null;
        }
        D5.j[] jVarArr = this.f8775b;
        if (i10 >= jVarArr.length) {
            return null;
        }
        return jVarArr[i10];
    }

    public List k() {
        D5.j[] jVarArr = this.f8775b;
        return jVarArr.length == 0 ? Collections.emptyList() : Arrays.asList(jVarArr);
    }

    public boolean l(String str) {
        String[] strArr = this.f8776c;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this.f8776c[length]));
        return true;
    }

    public boolean m() {
        return this.f8775b.length == 0;
    }

    public int n() {
        return this.f8775b.length;
    }

    protected D5.j[] o() {
        return this.f8775b;
    }

    public n p(String str) {
        String[] strArr = this.f8776c;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new n(this.f8774a, this.f8775b, strArr2);
    }

    public String toString() {
        if (this.f8775b.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('<');
        int length = this.f8775b.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(this.f8775b[i10].m());
        }
        sb2.append('>');
        return sb2.toString();
    }
}
