package L0;

import androidx.datastore.preferences.protobuf.AbstractC1555w;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class f extends AbstractC1555w implements Q {
    private static final f DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private J preferences_ = J.h();

    public static final class a extends AbstractC1555w.a implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a s(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            m();
            ((f) this.f16474b).N().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final I f5635a = I.d(r0.b.STRING, BuildConfig.FLAVOR, r0.b.MESSAGE, h.W());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1555w.H(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map N() {
        return P();
    }

    private J P() {
        if (!this.preferences_.n()) {
            this.preferences_ = this.preferences_.q();
        }
        return this.preferences_;
    }

    private J Q() {
        return this.preferences_;
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public static f S(InputStream inputStream) {
        return (f) AbstractC1555w.F(DEFAULT_INSTANCE, inputStream);
    }

    public Map O() {
        return Collections.unmodifiableMap(Q());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1555w
    protected final Object o(AbstractC1555w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f5634a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1555w.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f5635a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y10 = PARSER;
                if (y10 == null) {
                    synchronized (f.class) {
                        try {
                            y10 = PARSER;
                            if (y10 == null) {
                                y10 = new AbstractC1555w.b(DEFAULT_INSTANCE);
                                PARSER = y10;
                            }
                        } finally {
                        }
                    }
                }
                return y10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
