package o2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    private final Map f37847c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f37848d;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f37849d;

        /* renamed from: e, reason: collision with root package name */
        private static final Map f37850e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f37851a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map f37852b = f37850e;

        /* renamed from: c, reason: collision with root package name */
        private boolean f37853c = true;

        static {
            String g10 = g();
            f37849d = g10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g10)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g10)));
            }
            f37850e = Collections.unmodifiableMap(hashMap);
        }

        private Map d() {
            HashMap hashMap = new HashMap(this.f37852b.size());
            for (Map.Entry entry : this.f37852b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.f37851a) {
                this.f37851a = false;
                this.f37852b = d();
            }
        }

        private List f(String str) {
            List list = (List) this.f37852b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f37852b.put(str, arrayList);
            return arrayList;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(String str, String str2) {
            return b(str, new b(str2));
        }

        public a b(String str, j jVar) {
            if (this.f37853c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public k c() {
            this.f37851a = true;
            return new k(this.f37852b);
        }

        public a h(String str, j jVar) {
            e();
            if (jVar == null) {
                this.f37852b.remove(str);
            } else {
                List f10 = f(str);
                f10.clear();
                f10.add(jVar);
            }
            if (this.f37853c && "User-Agent".equalsIgnoreCase(str)) {
                this.f37853c = false;
            }
            return this;
        }
    }

    static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final String f37854a;

        b(String str) {
            this.f37854a = str;
        }

        @Override // o2.j
        public String a() {
            return this.f37854a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f37854a.equals(((b) obj).f37854a);
            }
            return false;
        }

        public int hashCode() {
            return this.f37854a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f37854a + "'}";
        }
    }

    k(Map map) {
        this.f37847c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(a10)) {
                sb2.append(a10);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f37847c.entrySet()) {
            String b10 = b((List) entry.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(entry.getKey(), b10);
            }
        }
        return hashMap;
    }

    @Override // o2.i
    public Map a() {
        if (this.f37848d == null) {
            synchronized (this) {
                try {
                    if (this.f37848d == null) {
                        this.f37848d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f37848d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f37847c.equals(((k) obj).f37847c);
        }
        return false;
    }

    public int hashCode() {
        return this.f37847c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f37847c + '}';
    }
}
