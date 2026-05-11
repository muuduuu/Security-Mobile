package P8;

import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d implements v, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final d f7576g = new d();

    /* renamed from: d, reason: collision with root package name */
    private boolean f7580d;

    /* renamed from: a, reason: collision with root package name */
    private double f7577a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private int f7578b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7579c = true;

    /* renamed from: e, reason: collision with root package name */
    private List f7581e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private List f7582f = Collections.emptyList();

    class a extends u {

        /* renamed from: a, reason: collision with root package name */
        private volatile u f7583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.gson.e f7586d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TypeToken f7587e;

        a(boolean z10, boolean z11, com.google.gson.e eVar, TypeToken typeToken) {
            this.f7584b = z10;
            this.f7585c = z11;
            this.f7586d = eVar;
            this.f7587e = typeToken;
        }

        private u e() {
            u uVar = this.f7583a;
            if (uVar != null) {
                return uVar;
            }
            u o10 = this.f7586d.o(d.this, this.f7587e);
            this.f7583a = o10;
            return o10;
        }

        @Override // com.google.gson.u
        public Object b(S8.a aVar) {
            if (!this.f7584b) {
                return e().b(aVar);
            }
            aVar.g1();
            return null;
        }

        @Override // com.google.gson.u
        public void d(S8.c cVar, Object obj) {
            if (this.f7585c) {
                cVar.r();
            } else {
                e().d(cVar, obj);
            }
        }
    }

    private static boolean i(Class cls) {
        return cls.isMemberClass() && !R8.a.n(cls);
    }

    private boolean k(O8.d dVar) {
        if (dVar != null) {
            return this.f7577a >= dVar.value();
        }
        return true;
    }

    private boolean l(O8.e eVar) {
        if (eVar != null) {
            return this.f7577a < eVar.value();
        }
        return true;
    }

    private boolean m(O8.d dVar, O8.e eVar) {
        return k(dVar) && l(eVar);
    }

    @Override // com.google.gson.v
    public u a(com.google.gson.e eVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean d10 = d(rawType, true);
        boolean d11 = d(rawType, false);
        if (d10 || d11) {
            return new a(d11, d10, eVar, typeToken);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(Class cls, boolean z10) {
        if (this.f7577a != -1.0d && !m((O8.d) cls.getAnnotation(O8.d.class), (O8.e) cls.getAnnotation(O8.e.class))) {
            return true;
        }
        if (!this.f7579c && i(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && R8.a.l(cls)) {
            return true;
        }
        Iterator it = (z10 ? this.f7581e : this.f7582f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public boolean h(Field field, boolean z10) {
        O8.a aVar;
        if ((this.f7578b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f7577a != -1.0d && !m((O8.d) field.getAnnotation(O8.d.class), (O8.e) field.getAnnotation(O8.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f7580d && ((aVar = (O8.a) field.getAnnotation(O8.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) || d(field.getType(), z10)) {
            return true;
        }
        List list = z10 ? this.f7581e : this.f7582f;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
