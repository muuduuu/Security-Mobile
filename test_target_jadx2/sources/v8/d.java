package v8;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import t8.InterfaceC4820a;
import t8.f;
import t8.g;
import u8.InterfaceC4873a;
import u8.InterfaceC4874b;

/* loaded from: classes2.dex */
public final class d implements InterfaceC4874b {

    /* renamed from: e, reason: collision with root package name */
    private static final t8.d f43998e = new t8.d() { // from class: v8.a
        @Override // t8.d
        public final void a(Object obj, Object obj2) {
            d.l(obj, (t8.e) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final f f43999f = new f() { // from class: v8.b
        @Override // t8.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).c((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final f f44000g = new f() { // from class: v8.c
        @Override // t8.f
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f44001h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f44002a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f44003b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private t8.d f44004c = f43998e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44005d = false;

    class a implements InterfaceC4820a {
        a() {
        }

        @Override // t8.InterfaceC4820a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f44002a, d.this.f44003b, d.this.f44004c, d.this.f44005d);
            eVar.h(obj, false);
            eVar.p();
        }

        @Override // t8.InterfaceC4820a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f44007a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f44007a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // t8.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.c(f44007a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f43999f);
        p(Boolean.class, f44000g);
        p(Date.class, f44001h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, t8.e eVar) {
        throw new t8.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.d(bool.booleanValue());
    }

    public InterfaceC4820a i() {
        return new a();
    }

    public d j(InterfaceC4873a interfaceC4873a) {
        interfaceC4873a.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f44005d = z10;
        return this;
    }

    @Override // u8.InterfaceC4874b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, t8.d dVar) {
        this.f44002a.put(cls, dVar);
        this.f44003b.remove(cls);
        return this;
    }

    public d p(Class cls, f fVar) {
        this.f44003b.put(cls, fVar);
        this.f44002a.remove(cls);
        return this;
    }
}
