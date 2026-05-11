package w8;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import u8.InterfaceC4873a;
import u8.InterfaceC4874b;
import w8.h;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f44352a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f44353b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.d f44354c;

    public static final class a implements InterfaceC4874b {

        /* renamed from: d, reason: collision with root package name */
        private static final t8.d f44355d = new t8.d() { // from class: w8.g
            @Override // t8.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (t8.e) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f44356a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f44357b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private t8.d f44358c = f44355d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, t8.e eVar) {
            throw new t8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f44356a), new HashMap(this.f44357b), this.f44358c);
        }

        public a d(InterfaceC4873a interfaceC4873a) {
            interfaceC4873a.a(this);
            return this;
        }

        @Override // u8.InterfaceC4874b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, t8.d dVar) {
            this.f44356a.put(cls, dVar);
            this.f44357b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, t8.d dVar) {
        this.f44352a = map;
        this.f44353b = map2;
        this.f44354c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f44352a, this.f44353b, this.f44354c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
