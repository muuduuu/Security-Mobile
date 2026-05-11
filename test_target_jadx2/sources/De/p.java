package De;

import Td.A;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class p {

    class a extends p {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // De.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                p.this.a(xVar, it.next());
            }
        }
    }

    class b extends p {
        b() {
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                p.this.a(xVar, Array.get(obj, i10));
            }
        }
    }

    static final class c extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1699a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1700b;

        /* renamed from: c, reason: collision with root package name */
        private final De.f f1701c;

        c(Method method, int i10, De.f fVar) {
            this.f1699a = method;
            this.f1700b = i10;
            this.f1701c = fVar;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            if (obj == null) {
                throw E.o(this.f1699a, this.f1700b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                xVar.l((Td.E) this.f1701c.a(obj));
            } catch (IOException e10) {
                throw E.p(this.f1699a, e10, this.f1700b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d extends p {

        /* renamed from: a, reason: collision with root package name */
        private final String f1702a;

        /* renamed from: b, reason: collision with root package name */
        private final De.f f1703b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1704c;

        d(String str, De.f fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f1702a = str;
            this.f1703b = fVar;
            this.f1704c = z10;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f1703b.a(obj)) == null) {
                return;
            }
            xVar.a(this.f1702a, str, this.f1704c);
        }
    }

    static final class e extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1705a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1706b;

        /* renamed from: c, reason: collision with root package name */
        private final De.f f1707c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1708d;

        e(Method method, int i10, De.f fVar, boolean z10) {
            this.f1705a = method;
            this.f1706b = i10;
            this.f1707c = fVar;
            this.f1708d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // De.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Map map) {
            if (map == null) {
                throw E.o(this.f1705a, this.f1706b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw E.o(this.f1705a, this.f1706b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw E.o(this.f1705a, this.f1706b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f1707c.a(value);
                if (str2 == null) {
                    throw E.o(this.f1705a, this.f1706b, "Field map value '" + value + "' converted to null by " + this.f1707c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                xVar.a(str, str2, this.f1708d);
            }
        }
    }

    static final class f extends p {

        /* renamed from: a, reason: collision with root package name */
        private final String f1709a;

        /* renamed from: b, reason: collision with root package name */
        private final De.f f1710b;

        f(String str, De.f fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f1709a = str;
            this.f1710b = fVar;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f1710b.a(obj)) == null) {
                return;
            }
            xVar.b(this.f1709a, str);
        }
    }

    static final class g extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1711a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1712b;

        /* renamed from: c, reason: collision with root package name */
        private final De.f f1713c;

        g(Method method, int i10, De.f fVar) {
            this.f1711a = method;
            this.f1712b = i10;
            this.f1713c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // De.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Map map) {
            if (map == null) {
                throw E.o(this.f1711a, this.f1712b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw E.o(this.f1711a, this.f1712b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw E.o(this.f1711a, this.f1712b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                xVar.b(str, (String) this.f1713c.a(value));
            }
        }
    }

    static final class h extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1714a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1715b;

        h(Method method, int i10) {
            this.f1714a = method;
            this.f1715b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // De.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Td.v vVar) {
            if (vVar == null) {
                throw E.o(this.f1714a, this.f1715b, "Headers parameter must not be null.", new Object[0]);
            }
            xVar.c(vVar);
        }
    }

    static final class i extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1716a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1717b;

        /* renamed from: c, reason: collision with root package name */
        private final Td.v f1718c;

        /* renamed from: d, reason: collision with root package name */
        private final De.f f1719d;

        i(Method method, int i10, Td.v vVar, De.f fVar) {
            this.f1716a = method;
            this.f1717b = i10;
            this.f1718c = vVar;
            this.f1719d = fVar;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                xVar.d(this.f1718c, (Td.E) this.f1719d.a(obj));
            } catch (IOException e10) {
                throw E.o(this.f1716a, this.f1717b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    static final class j extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1720a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1721b;

        /* renamed from: c, reason: collision with root package name */
        private final De.f f1722c;

        /* renamed from: d, reason: collision with root package name */
        private final String f1723d;

        j(Method method, int i10, De.f fVar, String str) {
            this.f1720a = method;
            this.f1721b = i10;
            this.f1722c = fVar;
            this.f1723d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // De.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Map map) {
            if (map == null) {
                throw E.o(this.f1720a, this.f1721b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw E.o(this.f1720a, this.f1721b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw E.o(this.f1720a, this.f1721b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                xVar.d(Td.v.t("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f1723d), (Td.E) this.f1722c.a(value));
            }
        }
    }

    static final class k extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1724a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1725b;

        /* renamed from: c, reason: collision with root package name */
        private final String f1726c;

        /* renamed from: d, reason: collision with root package name */
        private final De.f f1727d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f1728e;

        k(Method method, int i10, String str, De.f fVar, boolean z10) {
            this.f1724a = method;
            this.f1725b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f1726c = str;
            this.f1727d = fVar;
            this.f1728e = z10;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            if (obj != null) {
                xVar.f(this.f1726c, (String) this.f1727d.a(obj), this.f1728e);
                return;
            }
            throw E.o(this.f1724a, this.f1725b, "Path parameter \"" + this.f1726c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l extends p {

        /* renamed from: a, reason: collision with root package name */
        private final String f1729a;

        /* renamed from: b, reason: collision with root package name */
        private final De.f f1730b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1731c;

        l(String str, De.f fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f1729a = str;
            this.f1730b = fVar;
            this.f1731c = z10;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f1730b.a(obj)) == null) {
                return;
            }
            xVar.g(this.f1729a, str, this.f1731c);
        }
    }

    static final class m extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1732a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1733b;

        /* renamed from: c, reason: collision with root package name */
        private final De.f f1734c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1735d;

        m(Method method, int i10, De.f fVar, boolean z10) {
            this.f1732a = method;
            this.f1733b = i10;
            this.f1734c = fVar;
            this.f1735d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // De.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Map map) {
            if (map == null) {
                throw E.o(this.f1732a, this.f1733b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw E.o(this.f1732a, this.f1733b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw E.o(this.f1732a, this.f1733b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f1734c.a(value);
                if (str2 == null) {
                    throw E.o(this.f1732a, this.f1733b, "Query map value '" + value + "' converted to null by " + this.f1734c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                xVar.g(str, str2, this.f1735d);
            }
        }
    }

    static final class n extends p {

        /* renamed from: a, reason: collision with root package name */
        private final De.f f1736a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1737b;

        n(De.f fVar, boolean z10) {
            this.f1736a = fVar;
            this.f1737b = z10;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            if (obj == null) {
                return;
            }
            xVar.g((String) this.f1736a.a(obj), null, this.f1737b);
        }
    }

    static final class o extends p {

        /* renamed from: a, reason: collision with root package name */
        static final o f1738a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // De.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, A.c cVar) {
            if (cVar != null) {
                xVar.e(cVar);
            }
        }
    }

    /* renamed from: De.p$p, reason: collision with other inner class name */
    static final class C0032p extends p {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1739a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1740b;

        C0032p(Method method, int i10) {
            this.f1739a = method;
            this.f1740b = i10;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            if (obj == null) {
                throw E.o(this.f1739a, this.f1740b, "@Url parameter is null.", new Object[0]);
            }
            xVar.m(obj);
        }
    }

    static final class q extends p {

        /* renamed from: a, reason: collision with root package name */
        final Class f1741a;

        q(Class cls) {
            this.f1741a = cls;
        }

        @Override // De.p
        void a(x xVar, Object obj) {
            xVar.h(this.f1741a, obj);
        }
    }

    p() {
    }

    abstract void a(x xVar, Object obj);

    final p b() {
        return new b();
    }

    final p c() {
        return new a();
    }
}
