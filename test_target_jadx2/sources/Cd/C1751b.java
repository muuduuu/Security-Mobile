package cd;

import Kc.a0;
import Sc.B;
import bd.t;
import cd.C1750a;
import hd.AbstractC3305a;
import id.C3367b;
import id.f;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import md.C3679f;

/* renamed from: cd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1751b implements t.c {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f19449j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map f19450k;

    /* renamed from: a, reason: collision with root package name */
    private int[] f19451a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f19452b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f19453c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f19454d = null;

    /* renamed from: e, reason: collision with root package name */
    private String[] f19455e = null;

    /* renamed from: f, reason: collision with root package name */
    private String[] f19456f = null;

    /* renamed from: g, reason: collision with root package name */
    private String[] f19457g = null;

    /* renamed from: h, reason: collision with root package name */
    private C1750a.EnumC0347a f19458h = null;

    /* renamed from: i, reason: collision with root package name */
    private String[] f19459i = null;

    /* renamed from: cd.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0349b implements t.b {

        /* renamed from: a, reason: collision with root package name */
        private final List f19460a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // bd.t.b
        public void a() {
            g((String[]) this.f19460a.toArray(new String[0]));
        }

        @Override // bd.t.b
        public t.a b(C3367b c3367b) {
            if (c3367b != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // bd.t.b
        public void c(C3367b c3367b, f fVar) {
            if (c3367b == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // bd.t.b
        public void d(Object obj) {
            if (obj instanceof String) {
                this.f19460a.add((String) obj);
            }
        }

        @Override // bd.t.b
        public void e(C3679f c3679f) {
            if (c3679f == null) {
                f(2);
            }
        }

        protected abstract void g(String[] strArr);
    }

    static {
        try {
            f19449j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f19449j = false;
        }
        HashMap hashMap = new HashMap();
        f19450k = hashMap;
        hashMap.put(C3367b.m(new id.c("kotlin.jvm.internal.KotlinClass")), C1750a.EnumC0347a.CLASS);
        hashMap.put(C3367b.m(new id.c("kotlin.jvm.internal.KotlinFileFacade")), C1750a.EnumC0347a.FILE_FACADE);
        hashMap.put(C3367b.m(new id.c("kotlin.jvm.internal.KotlinMultifileClass")), C1750a.EnumC0347a.MULTIFILE_CLASS);
        hashMap.put(C3367b.m(new id.c("kotlin.jvm.internal.KotlinMultifileClassPart")), C1750a.EnumC0347a.MULTIFILE_CLASS_PART);
        hashMap.put(C3367b.m(new id.c("kotlin.jvm.internal.KotlinSyntheticClass")), C1750a.EnumC0347a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        C1750a.EnumC0347a enumC0347a = this.f19458h;
        return enumC0347a == C1750a.EnumC0347a.CLASS || enumC0347a == C1750a.EnumC0347a.FILE_FACADE || enumC0347a == C1750a.EnumC0347a.MULTIFILE_CLASS_PART;
    }

    @Override // bd.t.c
    public t.a b(C3367b c3367b, a0 a0Var) {
        C1750a.EnumC0347a enumC0347a;
        if (c3367b == null) {
            d(0);
        }
        if (a0Var == null) {
            d(1);
        }
        id.c b10 = c3367b.b();
        if (b10.equals(B.f8943a)) {
            return new c();
        }
        if (b10.equals(B.f8962t)) {
            return new d();
        }
        if (f19449j || this.f19458h != null || (enumC0347a = (C1750a.EnumC0347a) f19450k.get(c3367b)) == null) {
            return null;
        }
        this.f19458h = enumC0347a;
        return new e();
    }

    public C1750a m(hd.e eVar) {
        if (this.f19458h == null || this.f19451a == null) {
            return null;
        }
        hd.e eVar2 = new hd.e(this.f19451a, (this.f19453c & 8) != 0);
        if (!eVar2.h(eVar)) {
            this.f19457g = this.f19455e;
            this.f19455e = null;
        } else if (o() && this.f19455e == null) {
            return null;
        }
        String[] strArr = this.f19459i;
        return new C1750a(this.f19458h, eVar2, this.f19455e, this.f19457g, this.f19456f, this.f19452b, this.f19453c, this.f19454d, strArr != null ? AbstractC3305a.e(strArr) : null);
    }

    public C1750a n() {
        return m(hd.e.f34067i);
    }

    /* renamed from: cd.b$c */
    private class c implements t.a {

        /* renamed from: cd.b$c$a */
        class a extends AbstractC0349b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // cd.C1751b.AbstractC0349b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C1751b.this.f19455e = strArr;
            }
        }

        /* renamed from: cd.b$c$b, reason: collision with other inner class name */
        class C0350b extends AbstractC0349b {
            C0350b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // cd.C1751b.AbstractC0349b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C1751b.this.f19456f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private t.b h() {
            return new a();
        }

        private t.b i() {
            return new C0350b();
        }

        @Override // bd.t.a
        public void b(f fVar, C3679f c3679f) {
            if (c3679f == null) {
                g(0);
            }
        }

        @Override // bd.t.a
        public t.b c(f fVar) {
            String c10 = fVar != null ? fVar.c() : null;
            if ("d1".equals(c10)) {
                return h();
            }
            if ("d2".equals(c10)) {
                return i();
            }
            return null;
        }

        @Override // bd.t.a
        public void d(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String c10 = fVar.c();
            if ("k".equals(c10)) {
                if (obj instanceof Integer) {
                    C1751b.this.f19458h = C1750a.EnumC0347a.getById(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(c10)) {
                if (obj instanceof int[]) {
                    C1751b.this.f19451a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(c10)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    C1751b.this.f19452b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(c10)) {
                if (obj instanceof Integer) {
                    C1751b.this.f19453c = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(c10) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                C1751b.this.f19454d = str2;
            }
        }

        @Override // bd.t.a
        public t.a e(f fVar, C3367b c3367b) {
            if (c3367b != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // bd.t.a
        public void f(f fVar, C3367b c3367b, f fVar2) {
            if (c3367b == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // bd.t.a
        public void a() {
        }
    }

    /* renamed from: cd.b$d */
    private class d implements t.a {

        /* renamed from: cd.b$d$a */
        class a extends AbstractC0349b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // cd.C1751b.AbstractC0349b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C1751b.this.f19459i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private t.b h() {
            return new a();
        }

        @Override // bd.t.a
        public void b(f fVar, C3679f c3679f) {
            if (c3679f == null) {
                g(0);
            }
        }

        @Override // bd.t.a
        public t.b c(f fVar) {
            if ("b".equals(fVar != null ? fVar.c() : null)) {
                return h();
            }
            return null;
        }

        @Override // bd.t.a
        public t.a e(f fVar, C3367b c3367b) {
            if (c3367b != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // bd.t.a
        public void f(f fVar, C3367b c3367b, f fVar2) {
            if (c3367b == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // bd.t.a
        public void a() {
        }

        @Override // bd.t.a
        public void d(f fVar, Object obj) {
        }
    }

    /* renamed from: cd.b$e */
    private class e implements t.a {

        /* renamed from: cd.b$e$a */
        class a extends AbstractC0349b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // cd.C1751b.AbstractC0349b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C1751b.this.f19455e = strArr;
            }
        }

        /* renamed from: cd.b$e$b, reason: collision with other inner class name */
        class C0351b extends AbstractC0349b {
            C0351b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // cd.C1751b.AbstractC0349b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                C1751b.this.f19456f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private t.b h() {
            return new a();
        }

        private t.b i() {
            return new C0351b();
        }

        @Override // bd.t.a
        public void b(f fVar, C3679f c3679f) {
            if (c3679f == null) {
                g(0);
            }
        }

        @Override // bd.t.a
        public t.b c(f fVar) {
            String c10 = fVar != null ? fVar.c() : null;
            if ("data".equals(c10) || "filePartClassNames".equals(c10)) {
                return h();
            }
            if ("strings".equals(c10)) {
                return i();
            }
            return null;
        }

        @Override // bd.t.a
        public void d(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String c10 = fVar.c();
            if ("version".equals(c10)) {
                if (obj instanceof int[]) {
                    C1751b.this.f19451a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(c10)) {
                C1751b.this.f19452b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // bd.t.a
        public t.a e(f fVar, C3367b c3367b) {
            if (c3367b != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // bd.t.a
        public void f(f fVar, C3367b c3367b, f fVar2) {
            if (c3367b == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // bd.t.a
        public void a() {
        }
    }

    @Override // bd.t.c
    public void a() {
    }
}
