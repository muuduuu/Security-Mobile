package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1557y;
import androidx.datastore.preferences.protobuf.C1558z;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.PSKKeyManager;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class T implements f0 {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f16306r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f16307s = p0.A();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f16308a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f16309b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16310c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16311d;

    /* renamed from: e, reason: collision with root package name */
    private final P f16312e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16313f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16314g;

    /* renamed from: h, reason: collision with root package name */
    private final a0 f16315h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f16316i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f16317j;

    /* renamed from: k, reason: collision with root package name */
    private final int f16318k;

    /* renamed from: l, reason: collision with root package name */
    private final int f16319l;

    /* renamed from: m, reason: collision with root package name */
    private final V f16320m;

    /* renamed from: n, reason: collision with root package name */
    private final D f16321n;

    /* renamed from: o, reason: collision with root package name */
    private final m0 f16322o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC1549p f16323p;

    /* renamed from: q, reason: collision with root package name */
    private final K f16324q;

    private T(int[] iArr, Object[] objArr, int i10, int i11, P p10, a0 a0Var, boolean z10, int[] iArr2, int i12, int i13, V v10, D d10, m0 m0Var, AbstractC1549p abstractC1549p, K k10) {
        this.f16308a = iArr;
        this.f16309b = objArr;
        this.f16310c = i10;
        this.f16311d = i11;
        this.f16314g = p10 instanceof AbstractC1555w;
        this.f16315h = a0Var;
        this.f16313f = abstractC1549p != null && abstractC1549p.e(p10);
        this.f16316i = z10;
        this.f16317j = iArr2;
        this.f16318k = i12;
        this.f16319l = i13;
        this.f16320m = v10;
        this.f16321n = d10;
        this.f16322o = m0Var;
        this.f16323p = abstractC1549p;
        this.f16312e = p10;
        this.f16324q = k10;
    }

    private boolean A(Object obj, int i10, int i11) {
        Map h10 = this.f16324q.h(p0.z(obj, R(i10)));
        if (h10.isEmpty()) {
            return true;
        }
        if (this.f16324q.c(r(i11)).f16299c.getJavaType() != r0.c.MESSAGE) {
            return true;
        }
        f0 f0Var = null;
        for (Object obj2 : h10.values()) {
            if (f0Var == null) {
                f0Var = b0.a().c(obj2.getClass());
            }
            if (!f0Var.f(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1555w) {
            return ((AbstractC1555w) obj).y();
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i10) {
        long Y10 = Y(i10) & 1048575;
        return p0.w(obj, Y10) == p0.w(obj2, Y10);
    }

    private boolean D(Object obj, int i10, int i11) {
        return p0.w(obj, (long) (Y(i11) & 1048575)) == i10;
    }

    private static boolean E(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static long F(Object obj, long j10) {
        return p0.x(obj, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x009c, code lost:
    
        r0 = r19.f16318k;
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00a2, code lost:
    
        if (r0 >= r19.f16319l) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00a4, code lost:
    
        r5 = o(r22, r19.f16317j[r0], r5, r20, r22);
        r0 = r0 + 1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00ba, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00bb, code lost:
    
        if (r5 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00bd, code lost:
    
        r7.o(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0604 A[Catch: all -> 0x0291, TRY_LEAVE, TryCatch #2 {all -> 0x0291, blocks: (B:42:0x05fe, B:44:0x0604, B:57:0x062d, B:117:0x028c, B:120:0x0294, B:121:0x02a5, B:122:0x02b6, B:123:0x02c7, B:124:0x02d8, B:125:0x02f9, B:126:0x030a, B:127:0x031b, B:128:0x032c, B:129:0x033d, B:130:0x034e, B:131:0x035f, B:132:0x0370, B:133:0x0381, B:134:0x0392, B:135:0x03a3, B:136:0x03b4, B:137:0x03c5, B:138:0x03d6, B:139:0x03f7, B:140:0x0408, B:141:0x0419, B:142:0x042d, B:143:0x0434, B:144:0x0445, B:145:0x0456, B:146:0x0467, B:147:0x0478, B:148:0x0489, B:149:0x049a, B:150:0x04ab, B:151:0x04bc, B:152:0x04d0, B:153:0x04e2, B:154:0x04f4, B:155:0x0506, B:156:0x0518, B:157:0x052d, B:158:0x053f, B:159:0x0551, B:160:0x0565, B:161:0x056f, B:162:0x0581, B:163:0x0593, B:164:0x05a5, B:165:0x05b7, B:166:0x05c9, B:167:0x05db, B:168:0x05ed), top: B:41:0x05fe }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x066d A[LOOP:4: B:76:0x0669->B:78:0x066d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0682  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void G(m0 m0Var, AbstractC1549p abstractC1549p, Object obj, e0 e0Var, C1548o c1548o) {
        m0 m0Var2;
        Object obj2;
        int i10;
        Object obj3;
        Object obj4;
        Object f10;
        C1548o c1548o2;
        m0 m0Var3 = m0Var;
        Object obj5 = obj;
        C1548o c1548o3 = c1548o;
        C1551s c1551s = null;
        Object obj6 = null;
        while (true) {
            try {
                int z10 = e0Var.z();
                int X10 = X(z10);
                if (X10 >= 0) {
                    obj2 = obj5;
                    try {
                        int k02 = k0(X10);
                        switch (j0(k02)) {
                            case 0:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.K(obj2, R(k02), e0Var.readDouble());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 1:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.L(obj2, R(k02), e0Var.readFloat());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 2:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.N(obj2, R(k02), e0Var.L());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 3:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.N(obj2, R(k02), e0Var.c());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 4:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.M(obj2, R(k02), e0Var.E());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 5:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.N(obj2, R(k02), e0Var.d());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 6:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.M(obj2, R(k02), e0Var.h());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 7:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.E(obj2, R(k02), e0Var.i());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 8:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                b0(obj2, k02, e0Var);
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 9:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                P p10 = (P) L(obj2, X10);
                                e0Var.o(p10, s(X10), c1548o2);
                                h0(obj2, X10, p10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.O(obj2, R(k02), e0Var.C());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 11:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.M(obj2, R(k02), e0Var.l());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 12:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                int s10 = e0Var.s();
                                q(X10);
                                p0.M(obj2, R(k02), s10);
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 13:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.M(obj2, R(k02), e0Var.H());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.N(obj2, R(k02), e0Var.j());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.M(obj2, R(k02), e0Var.v());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                p0.N(obj2, R(k02), e0Var.w());
                                e0(obj2, X10);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                P p11 = (P) L(obj2, X10);
                                e0Var.t(p11, s(X10), c1548o2);
                                h0(obj2, X10, p11);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 18:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.J(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 19:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.D(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.m(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.k(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.FACE_DETECTION_ERROR /* 22 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.p(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.N(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.u(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.LOW_STORAGE_ERROR /* 25 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.x(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 26:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                c0(obj2, k02, e0Var);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 27:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                a0(obj, k02, e0Var, s(X10), c1548o);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 28:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.I(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 29:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.g(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 30:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                List c10 = this.f16321n.c(obj2, R(k02));
                                e0Var.q(c10);
                                q(X10);
                                obj6 = h0.z(obj, z10, c10, null, obj6, m0Var);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.INSTRUCTION_ERROR /* 31 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.e(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 32:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.n(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.GPS_ACCESS_DENIED /* 33 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.b(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 34:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.f(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.J(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.D(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.INVALID_FILE_ERROR /* 37 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.m(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 38:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.k(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 39:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.p(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case RequestError.NETWORK_FAILURE /* 40 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.N(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case RequestError.NO_DEV_KEY /* 41 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.u(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.CONSENT_DENIED /* 42 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.x(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.ENCRYPTION_ERROR /* 43 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.g(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.SDK_CLOSE_ERROR /* 44 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                List c11 = this.f16321n.c(obj2, R(k02));
                                e0Var.q(c11);
                                q(X10);
                                obj6 = h0.z(obj, z10, c11, null, obj6, m0Var);
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.e(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 46:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.n(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 47:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.b(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 48:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                e0Var.f(this.f16321n.c(obj2, R(k02)));
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 49:
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                try {
                                    Z(obj, R(k02), e0Var, s(X10), c1548o);
                                } catch (C1558z.a unused) {
                                    try {
                                        if (!m0Var2.q(e0Var)) {
                                        }
                                        obj5 = obj2;
                                        c1548o3 = c1548o2;
                                        m0Var3 = m0Var2;
                                    } catch (Throwable th) {
                                        th = th;
                                        break;
                                    }
                                }
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 50:
                                c1548o2 = c1548o3;
                                try {
                                    H(obj, X10, r(X10), c1548o, e0Var);
                                    m0Var2 = m0Var3;
                                } catch (C1558z.a unused2) {
                                    m0Var2 = m0Var3;
                                    if (!m0Var2.q(e0Var)) {
                                        Object f11 = obj6 == null ? m0Var2.f(obj2) : obj6;
                                        try {
                                            if (!m0Var2.m(f11, e0Var, 0)) {
                                                Object obj7 = f11;
                                                for (int i11 = this.f16318k; i11 < this.f16319l; i11++) {
                                                    obj7 = o(obj, this.f16317j[i11], obj7, m0Var, obj);
                                                }
                                                if (obj7 != null) {
                                                    m0Var2.o(obj2, obj7);
                                                    return;
                                                }
                                                return;
                                            }
                                            obj6 = f11;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj6 = f11;
                                            obj3 = obj6;
                                            while (i10 < this.f16319l) {
                                            }
                                            if (obj3 != null) {
                                            }
                                            throw th;
                                        }
                                    } else if (!e0Var.G()) {
                                        Object obj8 = obj6;
                                        for (int i12 = this.f16318k; i12 < this.f16319l; i12++) {
                                            obj8 = o(obj, this.f16317j[i12], obj8, m0Var, obj);
                                        }
                                        if (obj8 != null) {
                                            m0Var2.o(obj2, obj8);
                                            return;
                                        }
                                        return;
                                    }
                                    obj5 = obj2;
                                    c1548o3 = c1548o2;
                                    m0Var3 = m0Var2;
                                }
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 51:
                                p0.O(obj2, R(k02), Double.valueOf(e0Var.readDouble()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 52:
                                p0.O(obj2, R(k02), Float.valueOf(e0Var.readFloat()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 53:
                                p0.O(obj2, R(k02), Long.valueOf(e0Var.L()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 54:
                                p0.O(obj2, R(k02), Long.valueOf(e0Var.c()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 55:
                                p0.O(obj2, R(k02), Integer.valueOf(e0Var.E()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 56:
                                p0.O(obj2, R(k02), Long.valueOf(e0Var.d()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 57:
                                p0.O(obj2, R(k02), Integer.valueOf(e0Var.h()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 58:
                                p0.O(obj2, R(k02), Boolean.valueOf(e0Var.i()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 59:
                                b0(obj2, k02, e0Var);
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                                P p12 = (P) M(obj2, z10, X10);
                                e0Var.o(p12, s(X10), c1548o3);
                                i0(obj2, z10, X10, p12);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 61:
                                p0.O(obj2, R(k02), e0Var.C());
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 62:
                                p0.O(obj2, R(k02), Integer.valueOf(e0Var.l()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 63:
                                int s11 = e0Var.s();
                                q(X10);
                                p0.O(obj2, R(k02), Integer.valueOf(s11));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 64:
                                p0.O(obj2, R(k02), Integer.valueOf(e0Var.H()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 65:
                                p0.O(obj2, R(k02), Long.valueOf(e0Var.j()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 66:
                                p0.O(obj2, R(k02), Integer.valueOf(e0Var.v()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 67:
                                p0.O(obj2, R(k02), Long.valueOf(e0Var.w()));
                                f0(obj2, z10, X10);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            case 68:
                                P p13 = (P) M(obj2, z10, X10);
                                e0Var.t(p13, s(X10), c1548o3);
                                i0(obj2, z10, X10, p13);
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                            default:
                                if (obj6 == null) {
                                    obj6 = m0Var3.f(obj2);
                                }
                                f10 = obj6;
                                try {
                                } catch (C1558z.a unused3) {
                                    obj6 = f10;
                                    c1548o2 = c1548o3;
                                    m0Var2 = m0Var3;
                                    if (!m0Var2.q(e0Var)) {
                                    }
                                    obj5 = obj2;
                                    c1548o3 = c1548o2;
                                    m0Var3 = m0Var2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj6 = f10;
                                    m0Var2 = m0Var3;
                                    obj3 = obj6;
                                    while (i10 < this.f16319l) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                if (!m0Var3.m(f10, e0Var, 0)) {
                                    Object obj9 = f10;
                                    for (int i13 = this.f16318k; i13 < this.f16319l; i13++) {
                                        obj9 = o(obj, this.f16317j[i13], obj9, m0Var, obj);
                                    }
                                    if (obj9 != null) {
                                        m0Var3.o(obj2, obj9);
                                        return;
                                    }
                                    return;
                                }
                                obj6 = f10;
                                c1548o2 = c1548o3;
                                m0Var2 = m0Var3;
                                obj5 = obj2;
                                c1548o3 = c1548o2;
                                m0Var3 = m0Var2;
                                break;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        m0Var2 = m0Var3;
                        obj3 = obj6;
                        for (i10 = this.f16318k; i10 < this.f16319l; i10++) {
                            obj3 = o(obj, this.f16317j[i10], obj3, m0Var, obj);
                        }
                        if (obj3 != null) {
                            m0Var2.o(obj2, obj3);
                        }
                        throw th;
                    }
                } else {
                    if (z10 == Integer.MAX_VALUE) {
                        Object obj10 = obj6;
                        for (int i14 = this.f16318k; i14 < this.f16319l; i14++) {
                            obj10 = o(obj, this.f16317j[i14], obj10, m0Var, obj);
                        }
                        if (obj10 != null) {
                            m0Var3.o(obj5, obj10);
                            return;
                        }
                        return;
                    }
                    try {
                        Object b10 = !this.f16313f ? null : abstractC1549p.b(c1548o3, this.f16312e, z10);
                        if (b10 != null) {
                            C1551s d10 = c1551s == null ? abstractC1549p.d(obj) : c1551s;
                            obj4 = obj5;
                            try {
                                obj6 = abstractC1549p.g(obj, e0Var, b10, c1548o, d10, obj6, m0Var);
                                c1551s = d10;
                            } catch (Throwable th5) {
                                th = th5;
                                obj2 = obj4;
                                m0Var2 = m0Var3;
                                obj3 = obj6;
                                while (i10 < this.f16319l) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                        } else {
                            obj4 = obj5;
                            if (!m0Var3.q(e0Var)) {
                                f10 = obj6 == null ? m0Var3.f(obj4) : obj6;
                                try {
                                    obj6 = f10;
                                    if (!m0Var3.m(f10, e0Var, 0)) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj2 = obj4;
                                    obj6 = f10;
                                    m0Var2 = m0Var3;
                                    obj3 = obj6;
                                    while (i10 < this.f16319l) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            } else if (e0Var.G()) {
                            }
                        }
                        obj5 = obj4;
                    } catch (Throwable th7) {
                        th = th7;
                        obj2 = obj5;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                m0Var2 = m0Var3;
                obj2 = obj5;
            }
        }
    }

    private final void H(Object obj, int i10, Object obj2, C1548o c1548o, e0 e0Var) {
        long R10 = R(k0(i10));
        Object z10 = p0.z(obj, R10);
        if (z10 == null) {
            z10 = this.f16324q.e(obj2);
            p0.O(obj, R10, z10);
        } else if (this.f16324q.g(z10)) {
            Object e10 = this.f16324q.e(obj2);
            this.f16324q.a(e10, z10);
            p0.O(obj, R10, e10);
            z10 = e10;
        }
        e0Var.r(this.f16324q.d(z10), this.f16324q.c(obj2), c1548o);
    }

    private void I(Object obj, Object obj2, int i10) {
        if (w(obj2, i10)) {
            long R10 = R(k0(i10));
            Unsafe unsafe = f16307s;
            Object object = unsafe.getObject(obj2, R10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i10) + " is present but null: " + obj2);
            }
            f0 s10 = s(i10);
            if (!w(obj, i10)) {
                if (B(object)) {
                    Object b10 = s10.b();
                    s10.a(b10, object);
                    unsafe.putObject(obj, R10, b10);
                } else {
                    unsafe.putObject(obj, R10, object);
                }
                e0(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, R10);
            if (!B(object2)) {
                Object b11 = s10.b();
                s10.a(b11, object2);
                unsafe.putObject(obj, R10, b11);
                object2 = b11;
            }
            s10.a(object2, object);
        }
    }

    private void J(Object obj, Object obj2, int i10) {
        int Q10 = Q(i10);
        if (D(obj2, Q10, i10)) {
            long R10 = R(k0(i10));
            Unsafe unsafe = f16307s;
            Object object = unsafe.getObject(obj2, R10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i10) + " is present but null: " + obj2);
            }
            f0 s10 = s(i10);
            if (!D(obj, Q10, i10)) {
                if (B(object)) {
                    Object b10 = s10.b();
                    s10.a(b10, object);
                    unsafe.putObject(obj, R10, b10);
                } else {
                    unsafe.putObject(obj, R10, object);
                }
                f0(obj, Q10, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, R10);
            if (!B(object2)) {
                Object b11 = s10.b();
                s10.a(b11, object2);
                unsafe.putObject(obj, R10, b11);
                object2 = b11;
            }
            s10.a(object2, object);
        }
    }

    private void K(Object obj, Object obj2, int i10) {
        int k02 = k0(i10);
        long R10 = R(k02);
        int Q10 = Q(i10);
        switch (j0(k02)) {
            case 0:
                if (w(obj2, i10)) {
                    p0.K(obj, R10, p0.u(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 1:
                if (w(obj2, i10)) {
                    p0.L(obj, R10, p0.v(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 2:
                if (w(obj2, i10)) {
                    p0.N(obj, R10, p0.x(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 3:
                if (w(obj2, i10)) {
                    p0.N(obj, R10, p0.x(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 4:
                if (w(obj2, i10)) {
                    p0.M(obj, R10, p0.w(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 5:
                if (w(obj2, i10)) {
                    p0.N(obj, R10, p0.x(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 6:
                if (w(obj2, i10)) {
                    p0.M(obj, R10, p0.w(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 7:
                if (w(obj2, i10)) {
                    p0.E(obj, R10, p0.p(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 8:
                if (w(obj2, i10)) {
                    p0.O(obj, R10, p0.z(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 9:
                I(obj, obj2, i10);
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                if (w(obj2, i10)) {
                    p0.O(obj, R10, p0.z(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 11:
                if (w(obj2, i10)) {
                    p0.M(obj, R10, p0.w(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 12:
                if (w(obj2, i10)) {
                    p0.M(obj, R10, p0.w(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case 13:
                if (w(obj2, i10)) {
                    p0.M(obj, R10, p0.w(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                if (w(obj2, i10)) {
                    p0.N(obj, R10, p0.x(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                if (w(obj2, i10)) {
                    p0.M(obj, R10, p0.w(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                if (w(obj2, i10)) {
                    p0.N(obj, R10, p0.x(obj2, R10));
                    e0(obj, i10);
                    break;
                }
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                I(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case HVError.INSTRUCTION_ERROR /* 31 */:
            case 32:
            case HVError.GPS_ACCESS_DENIED /* 33 */:
            case 34:
            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
            case HVError.INVALID_FILE_ERROR /* 37 */:
            case 38:
            case 39:
            case RequestError.NETWORK_FAILURE /* 40 */:
            case RequestError.NO_DEV_KEY /* 41 */:
            case HVError.CONSENT_DENIED /* 42 */:
            case HVError.ENCRYPTION_ERROR /* 43 */:
            case HVError.SDK_CLOSE_ERROR /* 44 */:
            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f16321n.a(obj, obj2, R10);
                break;
            case 50:
                h0.E(this.f16324q, obj, obj2, R10);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (D(obj2, Q10, i10)) {
                    p0.O(obj, R10, p0.z(obj2, R10));
                    f0(obj, Q10, i10);
                    break;
                }
                break;
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                J(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (D(obj2, Q10, i10)) {
                    p0.O(obj, R10, p0.z(obj2, R10));
                    f0(obj, Q10, i10);
                    break;
                }
                break;
            case 68:
                J(obj, obj2, i10);
                break;
        }
    }

    private Object L(Object obj, int i10) {
        f0 s10 = s(i10);
        long R10 = R(k0(i10));
        if (!w(obj, i10)) {
            return s10.b();
        }
        Object object = f16307s.getObject(obj, R10);
        if (B(object)) {
            return object;
        }
        Object b10 = s10.b();
        if (object != null) {
            s10.a(b10, object);
        }
        return b10;
    }

    private Object M(Object obj, int i10, int i11) {
        f0 s10 = s(i11);
        if (!D(obj, i10, i11)) {
            return s10.b();
        }
        Object object = f16307s.getObject(obj, R(k0(i11)));
        if (B(object)) {
            return object;
        }
        Object b10 = s10.b();
        if (object != null) {
            s10.a(b10, object);
        }
        return b10;
    }

    static T N(Class cls, N n10, V v10, D d10, m0 m0Var, AbstractC1549p abstractC1549p, K k10) {
        if (n10 instanceof d0) {
            return P((d0) n10, v10, d10, m0Var, abstractC1549p, k10);
        }
        android.support.v4.media.session.b.a(n10);
        return O(null, v10, d10, m0Var, abstractC1549p, k10);
    }

    static T O(j0 j0Var, V v10, D d10, m0 m0Var, AbstractC1549p abstractC1549p, K k10) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static T P(d0 d0Var, V v10, D d10, m0 m0Var, AbstractC1549p abstractC1549p, K k10) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        char charAt9;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        String str;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field d02;
        int i33;
        char charAt11;
        int i34;
        int i35;
        Object obj;
        Field d03;
        Object obj2;
        Field d04;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        String e10 = d0Var.e();
        int length = e10.length();
        char c10 = 55296;
        if (e10.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (e10.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int charAt16 = e10.charAt(i10);
        if (charAt16 >= 55296) {
            int i42 = charAt16 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                charAt15 = e10.charAt(i41);
                if (charAt15 < 55296) {
                    break;
                }
                i42 |= (charAt15 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            charAt16 = i42 | (charAt15 << i43);
            i41 = i39;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i14 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = f16306r;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt17 = e10.charAt(i41);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    charAt10 = e10.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                charAt17 = i45 | (charAt10 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int charAt18 = e10.charAt(i44);
            if (charAt18 >= 55296) {
                int i48 = charAt18 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    charAt9 = e10.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                charAt18 = i48 | (charAt9 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int charAt19 = e10.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    charAt8 = e10.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                charAt19 = i51 | (charAt8 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int charAt20 = e10.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    charAt7 = e10.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                charAt20 = i54 | (charAt7 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            charAt = e10.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    charAt6 = e10.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                charAt = i57 | (charAt6 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            charAt2 = e10.charAt(i56);
            if (charAt2 >= 55296) {
                int i60 = charAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    charAt5 = e10.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                charAt2 = i60 | (charAt5 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int charAt21 = e10.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    charAt4 = e10.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                charAt21 = i63 | (charAt4 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int charAt22 = e10.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    charAt3 = e10.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i66 |= (charAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                charAt22 = i66 | (charAt3 << i67);
                i65 = i16;
            }
            i11 = (charAt17 * 2) + charAt18;
            i12 = charAt17;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i13 = charAt22;
            i41 = i65;
            i14 = charAt19;
            i15 = charAt20;
        }
        Unsafe unsafe = f16307s;
        Object[] d11 = d0Var.d();
        Class<?> cls = d0Var.b().getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i68 = i13 + charAt2;
        int i69 = i13;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i41 < length) {
            int i73 = i41 + 1;
            int charAt23 = e10.charAt(i41);
            if (charAt23 >= c10) {
                int i74 = charAt23 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i38 = i75 + 1;
                    charAt14 = e10.charAt(i75);
                    if (charAt14 < c10) {
                        break;
                    }
                    i74 |= (charAt14 & 8191) << i76;
                    i76 += 13;
                    i75 = i38;
                }
                charAt23 = i74 | (charAt14 << i76);
                i24 = i38;
            } else {
                i24 = i73;
            }
            int i77 = i24 + 1;
            int charAt24 = e10.charAt(i24);
            if (charAt24 >= c10) {
                int i78 = charAt24 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i37 = i79 + 1;
                    charAt13 = e10.charAt(i79);
                    if (charAt13 < c10) {
                        break;
                    }
                    i78 |= (charAt13 & 8191) << i80;
                    i80 += 13;
                    i79 = i37;
                }
                charAt24 = i78 | (charAt13 << i80);
                i25 = i37;
            } else {
                i25 = i77;
            }
            int i81 = charAt24 & 255;
            int i82 = length;
            if ((charAt24 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i83 = i71;
            if (i81 >= 51) {
                int i84 = i25 + 1;
                int charAt25 = e10.charAt(i25);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        charAt12 = e10.charAt(i84);
                        if (charAt12 < c11) {
                            break;
                        }
                        i85 |= (charAt12 & 8191) << i86;
                        i86 += 13;
                        i84 = i36;
                        c11 = 55296;
                    }
                    charAt25 = i85 | (charAt12 << i86);
                    i84 = i36;
                }
                int i87 = i81 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i35 = i11 + 1;
                    objArr[((i72 / 3) * 2) + 1] = d11[i11];
                } else {
                    if (i87 == 12 && (d0Var.c().equals(a0.PROTO2) || (charAt24 & 2048) != 0)) {
                        i35 = i11 + 1;
                        objArr[((i72 / 3) * 2) + 1] = d11[i11];
                    }
                    int i89 = charAt25 * 2;
                    obj = d11[i89];
                    if (obj instanceof Field) {
                        d03 = d0(cls, (String) obj);
                        d11[i89] = d03;
                    } else {
                        d03 = (Field) obj;
                    }
                    i26 = i14;
                    i32 = (int) unsafe.objectFieldOffset(d03);
                    int i90 = i89 + 1;
                    obj2 = d11[i90];
                    if (obj2 instanceof Field) {
                        d04 = d0(cls, (String) obj2);
                        d11[i90] = d04;
                    } else {
                        d04 = (Field) obj2;
                    }
                    i27 = i15;
                    i28 = i11;
                    i30 = i88;
                    str = e10;
                    i29 = (int) unsafe.objectFieldOffset(d04);
                    i31 = 0;
                }
                i11 = i35;
                int i892 = charAt25 * 2;
                obj = d11[i892];
                if (obj instanceof Field) {
                }
                i26 = i14;
                i32 = (int) unsafe.objectFieldOffset(d03);
                int i902 = i892 + 1;
                obj2 = d11[i902];
                if (obj2 instanceof Field) {
                }
                i27 = i15;
                i28 = i11;
                i30 = i88;
                str = e10;
                i29 = (int) unsafe.objectFieldOffset(d04);
                i31 = 0;
            } else {
                i26 = i14;
                int i91 = i11 + 1;
                Field d05 = d0(cls, (String) d11[i11]);
                if (i81 == 9 || i81 == 17) {
                    i27 = i15;
                    objArr[((i72 / 3) * 2) + 1] = d05.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i27 = i15;
                        i34 = i11 + 2;
                        objArr[((i72 / 3) * 2) + 1] = d11[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i27 = i15;
                        if (d0Var.c() == a0.PROTO2 || (charAt24 & 2048) != 0) {
                            i34 = i11 + 2;
                            objArr[((i72 / 3) * 2) + 1] = d11[i91];
                        }
                    } else {
                        if (i81 == 50) {
                            int i92 = i69 + 1;
                            iArr[i69] = i72;
                            int i93 = (i72 / 3) * 2;
                            int i94 = i11 + 2;
                            objArr[i93] = d11[i91];
                            if ((charAt24 & 2048) != 0) {
                                i91 = i11 + 3;
                                objArr[i93 + 1] = d11[i94];
                                i69 = i92;
                            } else {
                                i69 = i92;
                                i91 = i94;
                            }
                        }
                        i27 = i15;
                    }
                    i91 = i34;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(d05);
                if ((charAt24 & 4096) == 0 || i81 > 17) {
                    str = e10;
                    i28 = i91;
                    i29 = 1048575;
                    i30 = i25;
                    i31 = 0;
                } else {
                    i30 = i25 + 1;
                    int charAt26 = e10.charAt(i25);
                    if (charAt26 >= 55296) {
                        int i95 = charAt26 & 8191;
                        int i96 = 13;
                        while (true) {
                            i33 = i30 + 1;
                            charAt11 = e10.charAt(i30);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i95 |= (charAt11 & 8191) << i96;
                            i96 += 13;
                            i30 = i33;
                        }
                        charAt26 = i95 | (charAt11 << i96);
                        i30 = i33;
                    }
                    int i97 = (i12 * 2) + (charAt26 / 32);
                    Object obj3 = d11[i97];
                    if (obj3 instanceof Field) {
                        d02 = (Field) obj3;
                    } else {
                        d02 = d0(cls, (String) obj3);
                        d11[i97] = d02;
                    }
                    str = e10;
                    i28 = i91;
                    i29 = (int) unsafe.objectFieldOffset(d02);
                    i31 = charAt26 % 32;
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i70] = objectFieldOffset;
                    i70++;
                }
                i32 = objectFieldOffset;
            }
            int i98 = i72 + 1;
            iArr2[i72] = charAt23;
            int i99 = i72 + 2;
            int i100 = i12;
            iArr2[i98] = i32 | (i81 << 20) | ((charAt24 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0);
            i72 += 3;
            iArr2[i99] = i29 | (i31 << 20);
            i41 = i30;
            e10 = str;
            i11 = i28;
            length = i82;
            i15 = i27;
            i71 = i83;
            i12 = i100;
            i14 = i26;
            c10 = 55296;
        }
        return new T(iArr2, objArr, i14, i15, d0Var.b(), d0Var.c(), false, iArr, i13, i68, v10, d10, m0Var, abstractC1549p, k10);
    }

    private int Q(int i10) {
        return this.f16308a[i10];
    }

    private static long R(int i10) {
        return i10 & 1048575;
    }

    private static boolean S(Object obj, long j10) {
        return ((Boolean) p0.z(obj, j10)).booleanValue();
    }

    private static double T(Object obj, long j10) {
        return ((Double) p0.z(obj, j10)).doubleValue();
    }

    private static float U(Object obj, long j10) {
        return ((Float) p0.z(obj, j10)).floatValue();
    }

    private static int V(Object obj, long j10) {
        return ((Integer) p0.z(obj, j10)).intValue();
    }

    private static long W(Object obj, long j10) {
        return ((Long) p0.z(obj, j10)).longValue();
    }

    private int X(int i10) {
        if (i10 < this.f16310c || i10 > this.f16311d) {
            return -1;
        }
        return g0(i10, 0);
    }

    private int Y(int i10) {
        return this.f16308a[i10 + 2];
    }

    private void Z(Object obj, long j10, e0 e0Var, f0 f0Var, C1548o c1548o) {
        e0Var.F(this.f16321n.c(obj, j10), f0Var, c1548o);
    }

    private void a0(Object obj, int i10, e0 e0Var, f0 f0Var, C1548o c1548o) {
        e0Var.K(this.f16321n.c(obj, R(i10)), f0Var, c1548o);
    }

    private void b0(Object obj, int i10, e0 e0Var) {
        if (v(i10)) {
            p0.O(obj, R(i10), e0Var.M());
        } else if (this.f16314g) {
            p0.O(obj, R(i10), e0Var.y());
        } else {
            p0.O(obj, R(i10), e0Var.C());
        }
    }

    private void c0(Object obj, int i10, e0 e0Var) {
        if (v(i10)) {
            e0Var.B(this.f16321n.c(obj, R(i10)));
        } else {
            e0Var.A(this.f16321n.c(obj, R(i10)));
        }
    }

    private static Field d0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(Object obj, int i10) {
        int Y10 = Y(i10);
        long j10 = 1048575 & Y10;
        if (j10 == 1048575) {
            return;
        }
        p0.M(obj, j10, (1 << (Y10 >>> 20)) | p0.w(obj, j10));
    }

    private void f0(Object obj, int i10, int i11) {
        p0.M(obj, Y(i11) & 1048575, i10);
    }

    private int g0(int i10, int i11) {
        int length = (this.f16308a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int Q10 = Q(i13);
            if (i10 == Q10) {
                return i13;
            }
            if (i10 < Q10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void h0(Object obj, int i10, Object obj2) {
        f16307s.putObject(obj, R(k0(i10)), obj2);
        e0(obj, i10);
    }

    private void i0(Object obj, int i10, int i11, Object obj2) {
        f16307s.putObject(obj, R(k0(i11)), obj2);
        f0(obj, i10, i11);
    }

    private boolean j(Object obj, Object obj2, int i10) {
        return w(obj, i10) == w(obj2, i10);
    }

    private static int j0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static boolean k(Object obj, long j10) {
        return p0.p(obj, j10);
    }

    private int k0(int i10) {
        return this.f16308a[i10 + 1];
    }

    private static void l(Object obj) {
        if (B(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void l0(Object obj, s0 s0Var) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i10;
        int i11;
        Map.Entry entry2;
        int i12;
        int i13;
        Map.Entry entry3;
        boolean z10;
        Map.Entry entry4;
        if (this.f16313f) {
            C1551s c10 = this.f16323p.c(obj);
            if (!c10.j()) {
                Iterator n10 = c10.n();
                entry = (Map.Entry) n10.next();
                it = n10;
                length = this.f16308a.length;
                Unsafe unsafe = f16307s;
                int i14 = 1048575;
                int i15 = 1048575;
                int i16 = 0;
                i10 = 0;
                while (i10 < length) {
                    int k02 = k0(i10);
                    int Q10 = Q(i10);
                    int j02 = j0(k02);
                    if (j02 <= 17) {
                        int i17 = this.f16308a[i10 + 2];
                        int i18 = i17 & i14;
                        if (i18 != i15) {
                            if (i18 == i14) {
                                entry4 = entry;
                                i16 = 0;
                            } else {
                                entry4 = entry;
                                i16 = unsafe.getInt(obj, i18);
                            }
                            i15 = i18;
                        } else {
                            entry4 = entry;
                        }
                        int i19 = 1 << (i17 >>> 20);
                        i11 = i15;
                        i12 = i19;
                        entry2 = entry4;
                    } else {
                        i11 = i15;
                        entry2 = entry;
                        i12 = 0;
                    }
                    int i20 = i16;
                    while (entry2 != null && this.f16323p.a(entry2) <= Q10) {
                        this.f16323p.j(s0Var, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long R10 = R(k02);
                    switch (j02) {
                        case 0:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.e(Q10, m(obj, R10));
                                break;
                            }
                        case 1:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.A(Q10, p(obj, R10));
                                break;
                            }
                        case 2:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.n(Q10, unsafe.getLong(obj, R10));
                                break;
                            }
                        case 3:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.l(Q10, unsafe.getLong(obj, R10));
                                break;
                            }
                        case 4:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.r(Q10, unsafe.getInt(obj, R10));
                                break;
                            }
                        case 5:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.h(Q10, unsafe.getLong(obj, R10));
                                break;
                            }
                        case 6:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.d(Q10, unsafe.getInt(obj, R10));
                                break;
                            }
                        case 7:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.o(Q10, k(obj, R10));
                                break;
                            }
                        case 8:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                o0(Q10, unsafe.getObject(obj, R10), s0Var);
                                break;
                            }
                        case 9:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.M(Q10, unsafe.getObject(obj, R10), s(i10));
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.L(Q10, (AbstractC1540g) unsafe.getObject(obj, R10));
                                break;
                            }
                        case 11:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.b(Q10, unsafe.getInt(obj, R10));
                                break;
                            }
                        case 12:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.D(Q10, unsafe.getInt(obj, R10));
                                break;
                            }
                        case 13:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.p(Q10, unsafe.getInt(obj, R10));
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.u(Q10, unsafe.getLong(obj, R10));
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.H(Q10, unsafe.getInt(obj, R10));
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            i13 = length;
                            entry3 = entry2;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.z(Q10, unsafe.getLong(obj, R10));
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            entry3 = entry2;
                            i13 = length;
                            if (!x(obj, i10, i11, i20, i12)) {
                                break;
                            } else {
                                s0Var.O(Q10, unsafe.getObject(obj, R10), s(i10));
                                break;
                            }
                        case 18:
                            z10 = false;
                            h0.N(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 19:
                            z10 = false;
                            h0.R(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            z10 = false;
                            h0.U(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            z10 = false;
                            h0.c0(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            z10 = false;
                            h0.T(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            z10 = false;
                            h0.Q(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            z10 = false;
                            h0.P(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            z10 = false;
                            h0.L(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 26:
                            h0.a0(Q(i10), (List) unsafe.getObject(obj, R10), s0Var);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 27:
                            h0.V(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, s(i10));
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 28:
                            h0.M(Q(i10), (List) unsafe.getObject(obj, R10), s0Var);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 29:
                            z10 = false;
                            h0.b0(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 30:
                            z10 = false;
                            h0.O(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            z10 = false;
                            h0.W(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 32:
                            z10 = false;
                            h0.X(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            z10 = false;
                            h0.Y(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 34:
                            z10 = false;
                            h0.Z(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, false);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            h0.N(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            h0.R(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            h0.U(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 38:
                            h0.c0(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 39:
                            h0.T(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            h0.Q(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            h0.P(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            h0.L(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            h0.b0(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            h0.O(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            h0.W(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 46:
                            h0.X(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 47:
                            h0.Y(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 48:
                            h0.Z(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, true);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 49:
                            h0.S(Q(i10), (List) unsafe.getObject(obj, R10), s0Var, s(i10));
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 50:
                            n0(s0Var, Q10, unsafe.getObject(obj, R10), i10);
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 51:
                            if (D(obj, Q10, i10)) {
                                s0Var.e(Q10, T(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 52:
                            if (D(obj, Q10, i10)) {
                                s0Var.A(Q10, U(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 53:
                            if (D(obj, Q10, i10)) {
                                s0Var.n(Q10, W(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 54:
                            if (D(obj, Q10, i10)) {
                                s0Var.l(Q10, W(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 55:
                            if (D(obj, Q10, i10)) {
                                s0Var.r(Q10, V(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 56:
                            if (D(obj, Q10, i10)) {
                                s0Var.h(Q10, W(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 57:
                            if (D(obj, Q10, i10)) {
                                s0Var.d(Q10, V(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 58:
                            if (D(obj, Q10, i10)) {
                                s0Var.o(Q10, S(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 59:
                            if (D(obj, Q10, i10)) {
                                o0(Q10, unsafe.getObject(obj, R10), s0Var);
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (D(obj, Q10, i10)) {
                                s0Var.M(Q10, unsafe.getObject(obj, R10), s(i10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 61:
                            if (D(obj, Q10, i10)) {
                                s0Var.L(Q10, (AbstractC1540g) unsafe.getObject(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 62:
                            if (D(obj, Q10, i10)) {
                                s0Var.b(Q10, V(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 63:
                            if (D(obj, Q10, i10)) {
                                s0Var.D(Q10, V(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 64:
                            if (D(obj, Q10, i10)) {
                                s0Var.p(Q10, V(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 65:
                            if (D(obj, Q10, i10)) {
                                s0Var.u(Q10, W(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 66:
                            if (D(obj, Q10, i10)) {
                                s0Var.H(Q10, V(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 67:
                            if (D(obj, Q10, i10)) {
                                s0Var.z(Q10, W(obj, R10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        case 68:
                            if (D(obj, Q10, i10)) {
                                s0Var.O(Q10, unsafe.getObject(obj, R10), s(i10));
                            }
                            i13 = length;
                            entry3 = entry2;
                            break;
                        default:
                            i13 = length;
                            entry3 = entry2;
                            break;
                    }
                    i10 += 3;
                    i15 = i11;
                    entry = entry3;
                    i16 = i20;
                    length = i13;
                    i14 = 1048575;
                }
                while (entry != null) {
                    this.f16323p.j(s0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                p0(this.f16322o, obj, s0Var);
            }
        }
        entry = null;
        it = null;
        length = this.f16308a.length;
        Unsafe unsafe2 = f16307s;
        int i142 = 1048575;
        int i152 = 1048575;
        int i162 = 0;
        i10 = 0;
        while (i10 < length) {
        }
        while (entry != null) {
        }
        p0(this.f16322o, obj, s0Var);
    }

    private static double m(Object obj, long j10) {
        return p0.u(obj, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m0(Object obj, s0 s0Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        p0(this.f16322o, obj, s0Var);
        if (this.f16313f) {
            C1551s c10 = this.f16323p.c(obj);
            if (!c10.j()) {
                it = c10.e();
                entry = (Map.Entry) it.next();
                for (length = this.f16308a.length - 3; length >= 0; length -= 3) {
                    int k02 = k0(length);
                    int Q10 = Q(length);
                    while (entry != null && this.f16323p.a(entry) > Q10) {
                        this.f16323p.j(s0Var, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (j0(k02)) {
                        case 0:
                            if (w(obj, length)) {
                                s0Var.e(Q10, m(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (w(obj, length)) {
                                s0Var.A(Q10, p(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (w(obj, length)) {
                                s0Var.n(Q10, F(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (w(obj, length)) {
                                s0Var.l(Q10, F(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (w(obj, length)) {
                                s0Var.r(Q10, u(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (w(obj, length)) {
                                s0Var.h(Q10, F(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (w(obj, length)) {
                                s0Var.d(Q10, u(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (w(obj, length)) {
                                s0Var.o(Q10, k(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (w(obj, length)) {
                                o0(Q10, p0.z(obj, R(k02)), s0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (w(obj, length)) {
                                s0Var.M(Q10, p0.z(obj, R(k02)), s(length));
                                break;
                            } else {
                                break;
                            }
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            if (w(obj, length)) {
                                s0Var.L(Q10, (AbstractC1540g) p0.z(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (w(obj, length)) {
                                s0Var.b(Q10, u(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (w(obj, length)) {
                                s0Var.D(Q10, u(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (w(obj, length)) {
                                s0Var.p(Q10, u(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            if (w(obj, length)) {
                                s0Var.u(Q10, F(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                            if (w(obj, length)) {
                                s0Var.H(Q10, u(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            if (w(obj, length)) {
                                s0Var.z(Q10, F(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            if (w(obj, length)) {
                                s0Var.O(Q10, p0.z(obj, R(k02)), s(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            h0.N(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case 19:
                            h0.R(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            h0.U(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            h0.c0(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVError.FACE_DETECTION_ERROR /* 22 */:
                            h0.T(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            h0.Q(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            h0.P(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVError.LOW_STORAGE_ERROR /* 25 */:
                            h0.L(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case 26:
                            h0.a0(Q(length), (List) p0.z(obj, R(k02)), s0Var);
                            break;
                        case 27:
                            h0.V(Q(length), (List) p0.z(obj, R(k02)), s0Var, s(length));
                            break;
                        case 28:
                            h0.M(Q(length), (List) p0.z(obj, R(k02)), s0Var);
                            break;
                        case 29:
                            h0.b0(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case 30:
                            h0.O(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVError.INSTRUCTION_ERROR /* 31 */:
                            h0.W(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case 32:
                            h0.X(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVError.GPS_ACCESS_DENIED /* 33 */:
                            h0.Y(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case 34:
                            h0.Z(Q(length), (List) p0.z(obj, R(k02)), s0Var, false);
                            break;
                        case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            h0.N(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            h0.R(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case HVError.INVALID_FILE_ERROR /* 37 */:
                            h0.U(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case 38:
                            h0.c0(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case 39:
                            h0.T(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            h0.Q(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            h0.P(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case HVError.CONSENT_DENIED /* 42 */:
                            h0.L(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case HVError.ENCRYPTION_ERROR /* 43 */:
                            h0.b0(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case HVError.SDK_CLOSE_ERROR /* 44 */:
                            h0.O(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            h0.W(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case 46:
                            h0.X(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case 47:
                            h0.Y(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case 48:
                            h0.Z(Q(length), (List) p0.z(obj, R(k02)), s0Var, true);
                            break;
                        case 49:
                            h0.S(Q(length), (List) p0.z(obj, R(k02)), s0Var, s(length));
                            break;
                        case 50:
                            n0(s0Var, Q10, p0.z(obj, R(k02)), length);
                            break;
                        case 51:
                            if (D(obj, Q10, length)) {
                                s0Var.e(Q10, T(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (D(obj, Q10, length)) {
                                s0Var.A(Q10, U(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (D(obj, Q10, length)) {
                                s0Var.n(Q10, W(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (D(obj, Q10, length)) {
                                s0Var.l(Q10, W(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (D(obj, Q10, length)) {
                                s0Var.r(Q10, V(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (D(obj, Q10, length)) {
                                s0Var.h(Q10, W(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (D(obj, Q10, length)) {
                                s0Var.d(Q10, V(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (D(obj, Q10, length)) {
                                s0Var.o(Q10, S(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (D(obj, Q10, length)) {
                                o0(Q10, p0.z(obj, R(k02)), s0Var);
                                break;
                            } else {
                                break;
                            }
                        case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                            if (D(obj, Q10, length)) {
                                s0Var.M(Q10, p0.z(obj, R(k02)), s(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (D(obj, Q10, length)) {
                                s0Var.L(Q10, (AbstractC1540g) p0.z(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (D(obj, Q10, length)) {
                                s0Var.b(Q10, V(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (D(obj, Q10, length)) {
                                s0Var.D(Q10, V(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (D(obj, Q10, length)) {
                                s0Var.p(Q10, V(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (D(obj, Q10, length)) {
                                s0Var.u(Q10, W(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (D(obj, Q10, length)) {
                                s0Var.H(Q10, V(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (D(obj, Q10, length)) {
                                s0Var.z(Q10, W(obj, R(k02)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (D(obj, Q10, length)) {
                                s0Var.O(Q10, p0.z(obj, R(k02)), s(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f16323p.j(s0Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    private boolean n(Object obj, Object obj2, int i10) {
        int k02 = k0(i10);
        long R10 = R(k02);
        switch (j0(k02)) {
            case 0:
                if (j(obj, obj2, i10) && Double.doubleToLongBits(p0.u(obj, R10)) == Double.doubleToLongBits(p0.u(obj2, R10))) {
                    break;
                }
                break;
            case 1:
                if (j(obj, obj2, i10) && Float.floatToIntBits(p0.v(obj, R10)) == Float.floatToIntBits(p0.v(obj2, R10))) {
                    break;
                }
                break;
            case 2:
                if (j(obj, obj2, i10) && p0.x(obj, R10) == p0.x(obj2, R10)) {
                    break;
                }
                break;
            case 3:
                if (j(obj, obj2, i10) && p0.x(obj, R10) == p0.x(obj2, R10)) {
                    break;
                }
                break;
            case 4:
                if (j(obj, obj2, i10) && p0.w(obj, R10) == p0.w(obj2, R10)) {
                    break;
                }
                break;
            case 5:
                if (j(obj, obj2, i10) && p0.x(obj, R10) == p0.x(obj2, R10)) {
                    break;
                }
                break;
            case 6:
                if (j(obj, obj2, i10) && p0.w(obj, R10) == p0.w(obj2, R10)) {
                    break;
                }
                break;
            case 7:
                if (j(obj, obj2, i10) && p0.p(obj, R10) == p0.p(obj2, R10)) {
                    break;
                }
                break;
            case 8:
                if (j(obj, obj2, i10) && h0.H(p0.z(obj, R10), p0.z(obj2, R10))) {
                    break;
                }
                break;
            case 9:
                if (j(obj, obj2, i10) && h0.H(p0.z(obj, R10), p0.z(obj2, R10))) {
                    break;
                }
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                if (j(obj, obj2, i10) && h0.H(p0.z(obj, R10), p0.z(obj2, R10))) {
                    break;
                }
                break;
            case 11:
                if (j(obj, obj2, i10) && p0.w(obj, R10) == p0.w(obj2, R10)) {
                    break;
                }
                break;
            case 12:
                if (j(obj, obj2, i10) && p0.w(obj, R10) == p0.w(obj2, R10)) {
                    break;
                }
                break;
            case 13:
                if (j(obj, obj2, i10) && p0.w(obj, R10) == p0.w(obj2, R10)) {
                    break;
                }
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                if (j(obj, obj2, i10) && p0.x(obj, R10) == p0.x(obj2, R10)) {
                    break;
                }
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                if (j(obj, obj2, i10) && p0.w(obj, R10) == p0.w(obj2, R10)) {
                    break;
                }
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                if (j(obj, obj2, i10) && p0.x(obj, R10) == p0.x(obj2, R10)) {
                    break;
                }
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                if (j(obj, obj2, i10) && h0.H(p0.z(obj, R10), p0.z(obj2, R10))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (C(obj, obj2, i10) && h0.H(p0.z(obj, R10), p0.z(obj2, R10))) {
                    break;
                }
                break;
        }
        return true;
    }

    private void n0(s0 s0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            s0Var.N(i10, this.f16324q.c(r(i11)), this.f16324q.h(obj));
        }
    }

    private Object o(Object obj, int i10, Object obj2, m0 m0Var, Object obj3) {
        Q(i10);
        if (p0.z(obj, R(k0(i10))) == null) {
            return obj2;
        }
        q(i10);
        return obj2;
    }

    private void o0(int i10, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.k(i10, (String) obj);
        } else {
            s0Var.L(i10, (AbstractC1540g) obj);
        }
    }

    private static float p(Object obj, long j10) {
        return p0.v(obj, j10);
    }

    private void p0(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.t(m0Var.g(obj), s0Var);
    }

    private AbstractC1557y.a q(int i10) {
        android.support.v4.media.session.b.a(this.f16309b[((i10 / 3) * 2) + 1]);
        return null;
    }

    private Object r(int i10) {
        return this.f16309b[(i10 / 3) * 2];
    }

    private f0 s(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.f16309b[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0 c10 = b0.a().c((Class) this.f16309b[i11 + 1]);
        this.f16309b[i11] = c10;
        return c10;
    }

    private int t(m0 m0Var, Object obj) {
        return m0Var.h(m0Var.g(obj));
    }

    private static int u(Object obj, long j10) {
        return p0.w(obj, j10);
    }

    private static boolean v(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean w(Object obj, int i10) {
        int Y10 = Y(i10);
        long j10 = 1048575 & Y10;
        if (j10 != 1048575) {
            return (p0.w(obj, j10) & (1 << (Y10 >>> 20))) != 0;
        }
        int k02 = k0(i10);
        long R10 = R(k02);
        switch (j0(k02)) {
            case 0:
                return Double.doubleToRawLongBits(p0.u(obj, R10)) != 0;
            case 1:
                return Float.floatToRawIntBits(p0.v(obj, R10)) != 0;
            case 2:
                return p0.x(obj, R10) != 0;
            case 3:
                return p0.x(obj, R10) != 0;
            case 4:
                return p0.w(obj, R10) != 0;
            case 5:
                return p0.x(obj, R10) != 0;
            case 6:
                return p0.w(obj, R10) != 0;
            case 7:
                return p0.p(obj, R10);
            case 8:
                Object z10 = p0.z(obj, R10);
                if (z10 instanceof String) {
                    return !((String) z10).isEmpty();
                }
                if (z10 instanceof AbstractC1540g) {
                    return !AbstractC1540g.f16347b.equals(z10);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.z(obj, R10) != null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return !AbstractC1540g.f16347b.equals(p0.z(obj, R10));
            case 11:
                return p0.w(obj, R10) != 0;
            case 12:
                return p0.w(obj, R10) != 0;
            case 13:
                return p0.w(obj, R10) != 0;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return p0.x(obj, R10) != 0;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return p0.w(obj, R10) != 0;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return p0.x(obj, R10) != 0;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return p0.z(obj, R10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean x(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? w(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean y(Object obj, int i10, f0 f0Var) {
        return f0Var.f(p0.z(obj, R(i10)));
    }

    private boolean z(Object obj, int i10, int i11) {
        List list = (List) p0.z(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        f0 s10 = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!s10.f(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f16308a.length; i10 += 3) {
            K(obj, obj2, i10);
        }
        h0.F(this.f16322o, obj, obj2);
        if (this.f16313f) {
            h0.D(this.f16323p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public Object b() {
        return this.f16320m.a(this.f16312e);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean c(Object obj, Object obj2) {
        int length = this.f16308a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f16322o.g(obj).equals(this.f16322o.g(obj2))) {
            return false;
        }
        if (this.f16313f) {
            return this.f16323p.c(obj).equals(this.f16323p.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int d(Object obj) {
        int i10;
        int f10;
        int length = this.f16308a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int k02 = k0(i12);
            int Q10 = Q(i12);
            long R10 = R(k02);
            int i13 = 37;
            switch (j0(k02)) {
                case 0:
                    i10 = i11 * 53;
                    f10 = AbstractC1557y.f(Double.doubleToLongBits(p0.u(obj, R10)));
                    i11 = i10 + f10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    f10 = Float.floatToIntBits(p0.v(obj, R10));
                    i11 = i10 + f10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    f10 = AbstractC1557y.f(p0.x(obj, R10));
                    i11 = i10 + f10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    f10 = AbstractC1557y.f(p0.x(obj, R10));
                    i11 = i10 + f10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, R10);
                    i11 = i10 + f10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    f10 = AbstractC1557y.f(p0.x(obj, R10));
                    i11 = i10 + f10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, R10);
                    i11 = i10 + f10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    f10 = AbstractC1557y.c(p0.p(obj, R10));
                    i11 = i10 + f10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    f10 = ((String) p0.z(obj, R10)).hashCode();
                    i11 = i10 + f10;
                    break;
                case 9:
                    Object z10 = p0.z(obj, R10);
                    if (z10 != null) {
                        i13 = z10.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i10 = i11 * 53;
                    f10 = p0.z(obj, R10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, R10);
                    i11 = i10 + f10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, R10);
                    i11 = i10 + f10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, R10);
                    i11 = i10 + f10;
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    i10 = i11 * 53;
                    f10 = AbstractC1557y.f(p0.x(obj, R10));
                    i11 = i10 + f10;
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    i10 = i11 * 53;
                    f10 = p0.w(obj, R10);
                    i11 = i10 + f10;
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    i10 = i11 * 53;
                    f10 = AbstractC1557y.f(p0.x(obj, R10));
                    i11 = i10 + f10;
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    Object z11 = p0.z(obj, R10);
                    if (z11 != null) {
                        i13 = z11.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 18:
                case 19:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case HVError.INSTRUCTION_ERROR /* 31 */:
                case 32:
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                case 34:
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                case HVError.INVALID_FILE_ERROR /* 37 */:
                case 38:
                case 39:
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case HVError.CONSENT_DENIED /* 42 */:
                case HVError.ENCRYPTION_ERROR /* 43 */:
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    f10 = p0.z(obj, R10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    f10 = p0.z(obj, R10).hashCode();
                    i11 = i10 + f10;
                    break;
                case 51:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC1557y.f(Double.doubleToLongBits(T(obj, R10)));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = Float.floatToIntBits(U(obj, R10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC1557y.f(W(obj, R10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC1557y.f(W(obj, R10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = V(obj, R10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC1557y.f(W(obj, R10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = V(obj, R10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC1557y.c(S(obj, R10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = ((String) p0.z(obj, R10)).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = p0.z(obj, R10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = p0.z(obj, R10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = V(obj, R10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = V(obj, R10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = V(obj, R10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC1557y.f(W(obj, R10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = V(obj, R10);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = AbstractC1557y.f(W(obj, R10));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (D(obj, Q10, i12)) {
                        i10 = i11 * 53;
                        f10 = p0.z(obj, R10).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f16322o.g(obj).hashCode();
        return this.f16313f ? (hashCode * 53) + this.f16323p.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void e(Object obj) {
        if (B(obj)) {
            if (obj instanceof AbstractC1555w) {
                AbstractC1555w abstractC1555w = (AbstractC1555w) obj;
                abstractC1555w.i();
                abstractC1555w.h();
                abstractC1555w.A();
            }
            int length = this.f16308a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int k02 = k0(i10);
                long R10 = R(k02);
                int j02 = j0(k02);
                if (j02 != 9) {
                    if (j02 != 60 && j02 != 68) {
                        switch (j02) {
                            case 18:
                            case 19:
                            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                            case HVError.FACE_DETECTION_ERROR /* 22 */:
                            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                            case HVError.LOW_STORAGE_ERROR /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case HVError.INSTRUCTION_ERROR /* 31 */:
                            case 32:
                            case HVError.GPS_ACCESS_DENIED /* 33 */:
                            case 34:
                            case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                            case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                            case HVError.INVALID_FILE_ERROR /* 37 */:
                            case 38:
                            case 39:
                            case RequestError.NETWORK_FAILURE /* 40 */:
                            case RequestError.NO_DEV_KEY /* 41 */:
                            case HVError.CONSENT_DENIED /* 42 */:
                            case HVError.ENCRYPTION_ERROR /* 43 */:
                            case HVError.SDK_CLOSE_ERROR /* 44 */:
                            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f16321n.b(obj, R10);
                                break;
                            case 50:
                                Unsafe unsafe = f16307s;
                                Object object = unsafe.getObject(obj, R10);
                                if (object != null) {
                                    unsafe.putObject(obj, R10, this.f16324q.b(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (D(obj, Q(i10), i10)) {
                        s(i10).e(f16307s.getObject(obj, R10));
                    }
                }
                if (w(obj, i10)) {
                    s(i10).e(f16307s.getObject(obj, R10));
                }
            }
            this.f16322o.j(obj);
            if (this.f16313f) {
                this.f16323p.f(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean f(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f16318k) {
            int i15 = this.f16317j[i14];
            int Q10 = Q(i15);
            int k02 = k0(i15);
            int i16 = this.f16308a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f16307s.getInt(obj, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (E(k02) && !x(obj, i15, i10, i11, i18)) {
                return false;
            }
            int j02 = j0(k02);
            if (j02 != 9 && j02 != 17) {
                if (j02 != 27) {
                    if (j02 == 60 || j02 == 68) {
                        if (D(obj, Q10, i15) && !y(obj, k02, s(i15))) {
                            return false;
                        }
                    } else if (j02 != 49) {
                        if (j02 == 50 && !A(obj, k02, i15)) {
                            return false;
                        }
                    }
                }
                if (!z(obj, k02, i15)) {
                    return false;
                }
            } else if (x(obj, i15, i10, i11, i18) && !y(obj, k02, s(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f16313f || this.f16323p.c(obj).k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(Object obj) {
        int i10;
        int i11;
        int i12;
        int h10;
        int c10;
        int E10;
        boolean z10;
        int f10;
        int i13;
        int O10;
        int Q10;
        Unsafe unsafe = f16307s;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i17 < this.f16308a.length) {
            int k02 = k0(i17);
            int j02 = j0(k02);
            int Q11 = Q(i17);
            int i19 = this.f16308a[i17 + 2];
            int i20 = i19 & i14;
            if (j02 <= 17) {
                if (i20 != i15) {
                    i16 = i20 == i14 ? 0 : unsafe.getInt(obj, i20);
                    i15 = i20;
                }
                i10 = i15;
                i11 = i16;
                i12 = 1 << (i19 >>> 20);
            } else {
                i10 = i15;
                i11 = i16;
                i12 = 0;
            }
            long R10 = R(k02);
            if (j02 < EnumC1552t.DOUBLE_LIST_PACKED.id() || j02 > EnumC1552t.SINT64_LIST_PACKED.id()) {
                i20 = 0;
            }
            switch (j02) {
                case 0:
                    if (!x(obj, i17, i10, i11, i12)) {
                        break;
                    } else {
                        h10 = AbstractC1543j.h(Q11, 0.0d);
                        i18 += h10;
                        break;
                    }
                case 1:
                    if (!x(obj, i17, i10, i11, i12)) {
                        break;
                    } else {
                        h10 = AbstractC1543j.p(Q11, 0.0f);
                        i18 += h10;
                        break;
                    }
                case 2:
                    if (!x(obj, i17, i10, i11, i12)) {
                        break;
                    } else {
                        h10 = AbstractC1543j.w(Q11, unsafe.getLong(obj, R10));
                        i18 += h10;
                        break;
                    }
                case 3:
                    if (!x(obj, i17, i10, i11, i12)) {
                        break;
                    } else {
                        h10 = AbstractC1543j.R(Q11, unsafe.getLong(obj, R10));
                        i18 += h10;
                        break;
                    }
                case 4:
                    if (!x(obj, i17, i10, i11, i12)) {
                        break;
                    } else {
                        h10 = AbstractC1543j.u(Q11, unsafe.getInt(obj, R10));
                        i18 += h10;
                        break;
                    }
                case 5:
                    if (!x(obj, i17, i10, i11, i12)) {
                        break;
                    } else {
                        h10 = AbstractC1543j.n(Q11, 0L);
                        i18 += h10;
                        break;
                    }
                case 6:
                    if (x(obj, i17, i10, i11, i12)) {
                        h10 = AbstractC1543j.l(Q11, 0);
                        i18 += h10;
                        break;
                    }
                    break;
                case 7:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = AbstractC1543j.c(Q11, true);
                        i18 += c10;
                    }
                    break;
                case 8:
                    if (x(obj, i17, i10, i11, i12)) {
                        Object object = unsafe.getObject(obj, R10);
                        c10 = object instanceof AbstractC1540g ? AbstractC1543j.f(Q11, (AbstractC1540g) object) : AbstractC1543j.M(Q11, (String) object);
                        i18 += c10;
                    }
                    break;
                case 9:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = h0.o(Q11, unsafe.getObject(obj, R10), s(i17));
                        i18 += c10;
                    }
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = AbstractC1543j.f(Q11, (AbstractC1540g) unsafe.getObject(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 11:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = AbstractC1543j.P(Q11, unsafe.getInt(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 12:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = AbstractC1543j.j(Q11, unsafe.getInt(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 13:
                    if (x(obj, i17, i10, i11, i12)) {
                        E10 = AbstractC1543j.E(Q11, 0);
                        i18 += E10;
                    }
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = AbstractC1543j.G(Q11, 0L);
                        i18 += c10;
                    }
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = AbstractC1543j.I(Q11, unsafe.getInt(obj, R10));
                        i18 += c10;
                    }
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = AbstractC1543j.K(Q11, unsafe.getLong(obj, R10));
                        i18 += c10;
                    }
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    if (x(obj, i17, i10, i11, i12)) {
                        c10 = AbstractC1543j.r(Q11, (P) unsafe.getObject(obj, R10), s(i17));
                        i18 += c10;
                    }
                    break;
                case 18:
                    c10 = h0.h(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += c10;
                    break;
                case 19:
                    z10 = false;
                    f10 = h0.f(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    z10 = false;
                    f10 = h0.m(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    z10 = false;
                    f10 = h0.x(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    z10 = false;
                    f10 = h0.k(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    z10 = false;
                    f10 = h0.h(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    z10 = false;
                    f10 = h0.f(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    z10 = false;
                    f10 = h0.a(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case 26:
                    c10 = h0.u(Q11, (List) unsafe.getObject(obj, R10));
                    i18 += c10;
                    break;
                case 27:
                    c10 = h0.p(Q11, (List) unsafe.getObject(obj, R10), s(i17));
                    i18 += c10;
                    break;
                case 28:
                    c10 = h0.c(Q11, (List) unsafe.getObject(obj, R10));
                    i18 += c10;
                    break;
                case 29:
                    c10 = h0.v(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += c10;
                    break;
                case 30:
                    z10 = false;
                    f10 = h0.d(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    z10 = false;
                    f10 = h0.f(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case 32:
                    z10 = false;
                    f10 = h0.h(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVError.GPS_ACCESS_DENIED /* 33 */:
                    z10 = false;
                    f10 = h0.q(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case 34:
                    z10 = false;
                    f10 = h0.s(Q11, (List) unsafe.getObject(obj, R10), false);
                    i18 += f10;
                    break;
                case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                    i13 = h0.i((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                    i13 = h0.g((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case HVError.INVALID_FILE_ERROR /* 37 */:
                    i13 = h0.n((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case 38:
                    i13 = h0.y((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case 39:
                    i13 = h0.l((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i13 = h0.i((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i13 = h0.g((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case HVError.CONSENT_DENIED /* 42 */:
                    i13 = h0.b((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case HVError.ENCRYPTION_ERROR /* 43 */:
                    i13 = h0.w((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case HVError.SDK_CLOSE_ERROR /* 44 */:
                    i13 = h0.e((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                    i13 = h0.g((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case 46:
                    i13 = h0.i((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case 47:
                    i13 = h0.r((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case 48:
                    i13 = h0.t((List) unsafe.getObject(obj, R10));
                    if (i13 > 0) {
                        if (this.f16316i) {
                            unsafe.putInt(obj, i20, i13);
                        }
                        O10 = AbstractC1543j.O(Q11);
                        Q10 = AbstractC1543j.Q(i13);
                        E10 = O10 + Q10 + i13;
                        i18 += E10;
                    }
                    break;
                case 49:
                    c10 = h0.j(Q11, (List) unsafe.getObject(obj, R10), s(i17));
                    i18 += c10;
                    break;
                case 50:
                    c10 = this.f16324q.f(Q11, unsafe.getObject(obj, R10), r(i17));
                    i18 += c10;
                    break;
                case 51:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.h(Q11, 0.0d);
                        i18 += c10;
                    }
                    break;
                case 52:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.p(Q11, 0.0f);
                        i18 += c10;
                    }
                    break;
                case 53:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.w(Q11, W(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 54:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.R(Q11, W(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 55:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.u(Q11, V(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 56:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.n(Q11, 0L);
                        i18 += c10;
                    }
                    break;
                case 57:
                    if (D(obj, Q11, i17)) {
                        E10 = AbstractC1543j.l(Q11, 0);
                        i18 += E10;
                    }
                    break;
                case 58:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.c(Q11, true);
                        i18 += c10;
                    }
                    break;
                case 59:
                    if (D(obj, Q11, i17)) {
                        Object object2 = unsafe.getObject(obj, R10);
                        c10 = object2 instanceof AbstractC1540g ? AbstractC1543j.f(Q11, (AbstractC1540g) object2) : AbstractC1543j.M(Q11, (String) object2);
                        i18 += c10;
                    }
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    if (D(obj, Q11, i17)) {
                        c10 = h0.o(Q11, unsafe.getObject(obj, R10), s(i17));
                        i18 += c10;
                    }
                    break;
                case 61:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.f(Q11, (AbstractC1540g) unsafe.getObject(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 62:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.P(Q11, V(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 63:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.j(Q11, V(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 64:
                    if (D(obj, Q11, i17)) {
                        E10 = AbstractC1543j.E(Q11, 0);
                        i18 += E10;
                    }
                    break;
                case 65:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.G(Q11, 0L);
                        i18 += c10;
                    }
                    break;
                case 66:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.I(Q11, V(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 67:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.K(Q11, W(obj, R10));
                        i18 += c10;
                    }
                    break;
                case 68:
                    if (D(obj, Q11, i17)) {
                        c10 = AbstractC1543j.r(Q11, (P) unsafe.getObject(obj, R10), s(i17));
                        i18 += c10;
                    }
                    break;
            }
            i17 += 3;
            i15 = i10;
            i16 = i11;
            i14 = 1048575;
        }
        int t10 = i18 + t(this.f16322o, obj);
        return this.f16313f ? t10 + this.f16323p.c(obj).h() : t10;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void h(Object obj, e0 e0Var, C1548o c1548o) {
        c1548o.getClass();
        l(obj);
        G(this.f16322o, this.f16323p, obj, e0Var, c1548o);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void i(Object obj, s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            m0(obj, s0Var);
        } else {
            l0(obj, s0Var);
        }
    }
}
