package Db;

import Db.J;
import android.net.Uri;
import android.os.Bundle;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public interface C {

    public static final class a implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Uri uri = (Uri) obj;
            if (uri != null) {
                return K.n(uri);
            }
            return null;
        }
    }

    public static final class b implements C {
        @Override // Db.C
        public Object a(Object obj) {
            return J.b(J.f1409a, obj, null, true, 2, null);
        }
    }

    public static final class c implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Object[] objArr = (Object[]) obj;
            if (objArr != null) {
                return K.h(objArr, J.b.f1410a);
            }
            return null;
        }
    }

    public static final class d implements C {
        @Override // Db.C
        public Object a(Object obj) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr != null) {
                return K.i(zArr, J.b.f1410a);
            }
            return null;
        }
    }

    public static final class e implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                return K.k(bundle, J.b.f1410a);
            }
            return null;
        }
    }

    public static final class f implements C {
        @Override // Db.C
        public Object a(Object obj) {
            byte[] bArr = (byte[]) obj;
            if (bArr != null) {
                return FollyDynamicExtensionConverter.INSTANCE.put(bArr);
            }
            return null;
        }
    }

    public static final class g implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Collection collection = (Collection) obj;
            if (collection != null) {
                return K.r(collection);
            }
            return null;
        }
    }

    public static final class h implements C {
        @Override // Db.C
        public Object a(Object obj) {
            double[] dArr = (double[]) obj;
            if (dArr != null) {
                return K.e(dArr, J.b.f1410a);
            }
            return null;
        }
    }

    public static final class i implements C {
        @Override // Db.C
        public Object a(Object obj) {
            kotlin.time.a aVar = (kotlin.time.a) obj;
            if (aVar != null) {
                return Double.valueOf(kotlin.time.a.F(aVar.J(), Id.b.SECONDS));
            }
            return null;
        }
    }

    public static final class j implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Enum r12 = (Enum) obj;
            if (r12 != null) {
                return K.m(r12);
            }
            return null;
        }
    }

    public static final class k implements C {
        @Override // Db.C
        public Object a(Object obj) {
            File file = (File) obj;
            if (file != null) {
                return K.o(file);
            }
            return null;
        }
    }

    public static final class l implements C {
        @Override // Db.C
        public Object a(Object obj) {
            float[] fArr = (float[]) obj;
            if (fArr != null) {
                return K.f(fArr, J.b.f1410a);
            }
            return null;
        }
    }

    public static final class m implements C {
        @Override // Db.C
        public Object a(Object obj) {
            int[] iArr = (int[]) obj;
            if (iArr != null) {
                return K.g(iArr, J.b.f1410a);
            }
            return null;
        }
    }

    public static final class n implements C {
        @Override // Db.C
        public Object a(Object obj) {
            if (((Long) obj) != null) {
                return Double.valueOf(r3.longValue());
            }
            return null;
        }
    }

    public static final class o implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                return K.t(map);
            }
            return null;
        }
    }

    public static final class p implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Pair pair = (Pair) obj;
            if (pair != null) {
                return K.d(pair, J.b.f1410a);
            }
            return null;
        }
    }

    public static final class r implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Cb.i iVar = (Cb.i) obj;
            if (iVar != null) {
                return iVar.c();
            }
            return null;
        }
    }

    public static final class s implements C {
        @Override // Db.C
        public Object a(Object obj) {
            Ab.c cVar = (Ab.c) obj;
            if (cVar != null) {
                return K.j(cVar, J.b.f1410a);
            }
            return null;
        }
    }

    public static final class t implements C {
        @Override // Db.C
        public Object a(Object obj) {
            URI uri = (URI) obj;
            if (uri != null) {
                return K.p(uri);
            }
            return null;
        }
    }

    public static final class u implements C {
        @Override // Db.C
        public Object a(Object obj) {
            URL url = (URL) obj;
            if (url != null) {
                return K.q(url);
            }
            return null;
        }
    }

    Object a(Object obj);

    public static final class q implements C {
        @Override // Db.C
        public Object a(Object obj) {
            return obj;
        }
    }
}
