package K5;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class p implements T5.a {

    /* renamed from: a, reason: collision with root package name */
    protected HashMap f5421a;

    public p() {
    }

    public static p f(p pVar, p pVar2) {
        HashMap hashMap;
        HashMap hashMap2;
        if (pVar == null || (hashMap = pVar.f5421a) == null || hashMap.isEmpty()) {
            return pVar2;
        }
        if (pVar2 == null || (hashMap2 = pVar2.f5421a) == null || hashMap2.isEmpty()) {
            return pVar;
        }
        HashMap hashMap3 = new HashMap();
        for (Annotation annotation : pVar2.f5421a.values()) {
            hashMap3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : pVar.f5421a.values()) {
            hashMap3.put(annotation2.annotationType(), annotation2);
        }
        return new p(hashMap3);
    }

    public static p g(Class cls, Annotation annotation) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        return new p(hashMap);
    }

    @Override // T5.a
    public Annotation a(Class cls) {
        HashMap hashMap = this.f5421a;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    @Override // T5.a
    public boolean b(Class cls) {
        HashMap hashMap = this.f5421a;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    @Override // T5.a
    public boolean c(Class[] clsArr) {
        if (this.f5421a != null) {
            for (Class cls : clsArr) {
                if (this.f5421a.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean d(Annotation annotation) {
        if (this.f5421a == null) {
            this.f5421a = new HashMap();
        }
        Annotation annotation2 = (Annotation) this.f5421a.put(annotation.annotationType(), annotation);
        return annotation2 == null || !annotation2.equals(annotation);
    }

    public boolean e(Annotation annotation) {
        return d(annotation);
    }

    @Override // T5.a
    public int size() {
        HashMap hashMap = this.f5421a;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public String toString() {
        HashMap hashMap = this.f5421a;
        return hashMap == null ? "[null]" : hashMap.toString();
    }

    p(HashMap hashMap) {
        this.f5421a = hashMap;
    }
}
