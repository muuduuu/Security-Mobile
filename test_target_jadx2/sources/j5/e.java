package J5;

import D5.j;
import D5.o;
import D5.z;
import R5.C1138k;
import T5.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public class e implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f4782c = Node.class;

    /* renamed from: d, reason: collision with root package name */
    private static final Class f4783d = Document.class;

    /* renamed from: e, reason: collision with root package name */
    public static final e f4784e;

    /* renamed from: a, reason: collision with root package name */
    private final Map f4785a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f4786b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        try {
            a.a();
        } catch (Throwable unused) {
        }
        f4784e = new e();
    }

    protected e() {
        HashMap hashMap = new HashMap();
        this.f4785a = hashMap;
        hashMap.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        hashMap.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap hashMap2 = new HashMap();
        this.f4786b = hashMap2;
        hashMap2.put("java.sql.Timestamp", C1138k.f8500f);
        hashMap2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        hashMap2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        hashMap2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        hashMap2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    private boolean a(Class cls, Class cls2) {
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    private boolean c(Class cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }

    private Object d(Class cls, j jVar) {
        try {
            return f.k(cls, false);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + f.C(jVar) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    private Object e(String str, j jVar) {
        try {
            return d(Class.forName(str), jVar);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to find class `" + str + "` for handling values of type " + f.C(jVar) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    public o b(z zVar, j jVar, D5.c cVar) {
        Object e10;
        Class q10 = jVar.q();
        if (a(q10, f4782c)) {
            return (o) e("com.fasterxml.jackson.databind.ext.DOMSerializer", jVar);
        }
        String name = q10.getName();
        Object obj = this.f4786b.get(name);
        if (obj != null) {
            return obj instanceof o ? (o) obj : (o) e((String) obj, jVar);
        }
        if ((!name.startsWith("javax.xml.") && !c(q10, "javax.xml.")) || (e10 = e("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", jVar)) == null) {
            return null;
        }
        android.support.v4.media.session.b.a(e10);
        throw null;
    }
}
