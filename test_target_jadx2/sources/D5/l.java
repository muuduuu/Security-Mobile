package D5;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public class l extends f {

    /* renamed from: a, reason: collision with root package name */
    protected LinkedList f1263a;

    /* renamed from: b, reason: collision with root package name */
    protected transient Closeable f1264b;

    public l(Closeable closeable, String str) {
        super(str);
        this.f1264b = closeable;
        if (closeable instanceof com.fasterxml.jackson.core.h) {
            android.support.v4.media.session.b.a(closeable);
            throw null;
        }
    }

    public static l h(com.fasterxml.jackson.core.f fVar, String str) {
        return new l(fVar, str, null);
    }

    public static l i(com.fasterxml.jackson.core.f fVar, String str, Throwable th) {
        return new l(fVar, str, th);
    }

    public static l j(IOException iOException) {
        return new l(null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), T5.f.m(iOException)));
    }

    public static l n(Throwable th, a aVar) {
        Closeable closeable;
        l lVar;
        if (th instanceof l) {
            lVar = (l) th;
        } else {
            String m10 = T5.f.m(th);
            if (m10 == null || m10.isEmpty()) {
                m10 = "(was " + th.getClass().getName() + ")";
            }
            if (th instanceof com.fasterxml.jackson.core.c) {
                Object c10 = ((com.fasterxml.jackson.core.c) th).c();
                if (c10 instanceof Closeable) {
                    closeable = (Closeable) c10;
                    lVar = new l(closeable, m10, th);
                }
            }
            closeable = null;
            lVar = new l(closeable, m10, th);
        }
        lVar.l(aVar);
        return lVar;
    }

    public static l o(Throwable th, Object obj, int i10) {
        return n(th, new a(obj, i10));
    }

    public static l p(Throwable th, Object obj, String str) {
        return n(th, new a(obj, str));
    }

    @Override // com.fasterxml.jackson.core.c
    public Object c() {
        return this.f1264b;
    }

    @Override // D5.f
    public void e(Object obj, String str) {
        l(new a(obj, str));
    }

    protected void f(StringBuilder sb2) {
        LinkedList linkedList = this.f1263a;
        if (linkedList == null) {
            return;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb2.append(((a) it.next()).toString());
            if (it.hasNext()) {
                sb2.append("->");
            }
        }
    }

    protected String g() {
        String message = super.getMessage();
        if (this.f1263a == null) {
            return message;
        }
        StringBuilder sb2 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb2.append(" (through reference chain: ");
        StringBuilder k10 = k(sb2);
        k10.append(')');
        return k10.toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return g();
    }

    @Override // com.fasterxml.jackson.core.i, java.lang.Throwable
    public String getMessage() {
        return g();
    }

    public StringBuilder k(StringBuilder sb2) {
        f(sb2);
        return sb2;
    }

    public void l(a aVar) {
        if (this.f1263a == null) {
            this.f1263a = new LinkedList();
        }
        if (this.f1263a.size() < 1000) {
            this.f1263a.addFirst(aVar);
        }
    }

    public l m(Throwable th) {
        initCause(th);
        return this;
    }

    @Override // com.fasterxml.jackson.core.i, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        protected transient Object f1265a;

        /* renamed from: b, reason: collision with root package name */
        protected String f1266b;

        /* renamed from: c, reason: collision with root package name */
        protected int f1267c;

        /* renamed from: d, reason: collision with root package name */
        protected String f1268d;

        public a(Object obj, String str) {
            this.f1267c = -1;
            this.f1265a = obj;
            if (str == null) {
                throw new NullPointerException("Cannot pass null fieldName");
            }
            this.f1266b = str;
        }

        public String a() {
            if (this.f1268d == null) {
                StringBuilder sb2 = new StringBuilder();
                Object obj = this.f1265a;
                if (obj != null) {
                    Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i10 = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i10++;
                    }
                    sb2.append(cls.getName());
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        sb2.append("[]");
                    }
                } else {
                    sb2.append("UNKNOWN");
                }
                sb2.append('[');
                if (this.f1266b != null) {
                    sb2.append('\"');
                    sb2.append(this.f1266b);
                    sb2.append('\"');
                } else {
                    int i11 = this.f1267c;
                    if (i11 >= 0) {
                        sb2.append(i11);
                    } else {
                        sb2.append('?');
                    }
                }
                sb2.append(']');
                this.f1268d = sb2.toString();
            }
            return this.f1268d;
        }

        public String toString() {
            return a();
        }

        public a(Object obj, int i10) {
            this.f1265a = obj;
            this.f1267c = i10;
        }
    }

    public l(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this.f1264b = closeable;
        if (th instanceof com.fasterxml.jackson.core.c) {
            ((com.fasterxml.jackson.core.c) th).a();
        } else if (closeable instanceof com.fasterxml.jackson.core.h) {
            android.support.v4.media.session.b.a(closeable);
            throw null;
        }
    }
}
