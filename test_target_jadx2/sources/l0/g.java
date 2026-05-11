package L0;

import androidx.datastore.preferences.protobuf.AbstractC1534a;
import androidx.datastore.preferences.protobuf.AbstractC1555w;
import androidx.datastore.preferences.protobuf.AbstractC1557y;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC1555w implements Q {
    private static final g DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC1557y.b strings_ = AbstractC1555w.p();

    public static final class a extends AbstractC1555w.a implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a s(Iterable iterable) {
            m();
            ((g) this.f16474b).N(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1555w.H(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(Iterable iterable) {
        O();
        AbstractC1534a.b(iterable, this.strings_);
    }

    private void O() {
        AbstractC1557y.b bVar = this.strings_;
        if (bVar.N()) {
            return;
        }
        this.strings_ = AbstractC1555w.B(bVar);
    }

    public static g P() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public List Q() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1555w
    protected final Object o(AbstractC1555w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f5634a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC1555w.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y10 = PARSER;
                if (y10 == null) {
                    synchronized (g.class) {
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
