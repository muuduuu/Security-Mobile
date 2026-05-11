package K5;

import K5.AbstractC0920a;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class w extends AbstractC0920a {

    /* renamed from: a, reason: collision with root package name */
    protected final F5.l f5444a;

    /* renamed from: b, reason: collision with root package name */
    protected final C0922c f5445b;

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f5446c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f5447d;

    /* renamed from: e, reason: collision with root package name */
    protected final String f5448e;

    /* renamed from: f, reason: collision with root package name */
    protected final String f5449f;

    public interface a {
    }

    public static class b extends AbstractC0920a.AbstractC0101a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        protected final String f5450a;

        /* renamed from: b, reason: collision with root package name */
        protected final String f5451b;

        /* renamed from: c, reason: collision with root package name */
        protected final String f5452c;

        /* renamed from: d, reason: collision with root package name */
        protected final String f5453d;

        public b() {
            this("set", "with", "get", "is", null);
        }

        @Override // K5.AbstractC0920a.AbstractC0101a
        public AbstractC0920a a(F5.l lVar, C0922c c0922c) {
            return new w(lVar, c0922c, this.f5450a, this.f5452c, this.f5453d, null);
        }

        @Override // K5.AbstractC0920a.AbstractC0101a
        public AbstractC0920a b(F5.l lVar, C0922c c0922c) {
            return new c(lVar, c0922c);
        }

        protected b(String str, String str2, String str3, String str4, a aVar) {
            this.f5450a = str;
            this.f5451b = str2;
            this.f5452c = str3;
            this.f5453d = str4;
        }
    }

    public static class c extends w {

        /* renamed from: g, reason: collision with root package name */
        protected final Set f5454g;

        public c(F5.l lVar, C0922c c0922c) {
            super(lVar, c0922c, null, "get", "is", null);
            this.f5454g = new HashSet();
            for (String str : L5.a.a(c0922c.d())) {
                this.f5454g.add(str);
            }
        }

        @Override // K5.w, K5.AbstractC0920a
        public String c(j jVar, String str) {
            return this.f5454g.contains(str) ? str : super.c(jVar, str);
        }
    }

    protected w(F5.l lVar, C0922c c0922c, String str, String str2, String str3, a aVar) {
        this.f5444a = lVar;
        this.f5445b = c0922c;
        this.f5446c = lVar.D(D5.q.USE_STD_BEAN_NAMING);
        this.f5449f = str;
        this.f5447d = str2;
        this.f5448e = str3;
    }

    @Override // K5.AbstractC0920a
    public String a(j jVar, String str) {
        if (this.f5448e == null) {
            return null;
        }
        Class d10 = jVar.d();
        if ((d10 == Boolean.class || d10 == Boolean.TYPE) && str.startsWith(this.f5448e)) {
            return this.f5446c ? h(str, 2) : g(str, 2);
        }
        return null;
    }

    @Override // K5.AbstractC0920a
    public String b(j jVar, String str) {
        String str2 = this.f5449f;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.f5446c ? h(str, this.f5449f.length()) : g(str, this.f5449f.length());
    }

    @Override // K5.AbstractC0920a
    public String c(j jVar, String str) {
        String str2 = this.f5447d;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (e(jVar)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && f(jVar)) {
            return null;
        }
        return this.f5446c ? h(str, this.f5447d.length()) : g(str, this.f5447d.length());
    }

    protected boolean e(j jVar) {
        Class d10 = jVar.d();
        if (!d10.isArray()) {
            return false;
        }
        String name = d10.getComponentType().getName();
        if (name.contains(".cglib")) {
            return name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib");
        }
        return false;
    }

    protected boolean f(j jVar) {
        return jVar.d().getName().startsWith("groovy.lang");
    }

    protected String g(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char charAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        while (true) {
            i10++;
            if (i10 >= length) {
                break;
            }
            char charAt2 = str.charAt(i10);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb2.append((CharSequence) str, i10, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    protected String h(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char charAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i10);
        }
        int i11 = i10 + 1;
        if (i11 < length && Character.isUpperCase(str.charAt(i11))) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        sb2.append((CharSequence) str, i11, length);
        return sb2.toString();
    }

    @Override // K5.AbstractC0920a
    public String d(C0926g c0926g, String str) {
        return str;
    }
}
