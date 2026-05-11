package J2;

import J2.g;
import J2.k;
import android.util.Log;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private f f4437a;

    /* renamed from: b, reason: collision with root package name */
    private u f4438b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4439c = false;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4440a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4441b;

        static {
            int[] iArr = new int[j.values().length];
            f4441b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4441b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4441b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4441b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4441b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4441b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4441b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4441b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4441b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4441b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4441b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4441b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4441b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4441b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4441b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4441b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4441b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4441b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4441b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4441b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4441b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4441b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4441b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4441b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f4440a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4440a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4440a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: J2.b$b, reason: collision with other inner class name */
    private static class C0091b {

        /* renamed from: a, reason: collision with root package name */
        public final String f4442a;

        /* renamed from: b, reason: collision with root package name */
        final c f4443b;

        /* renamed from: c, reason: collision with root package name */
        public final String f4444c;

        C0091b(String str, c cVar, String str2) {
            this.f4442a = str;
            this.f4443b = cVar;
            this.f4444c = str2;
        }
    }

    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    private static class d extends k.i {

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f4445a;

            /* renamed from: b, reason: collision with root package name */
            public int f4446b;

            a(int i10, int i11) {
                this.f4445a = i10;
                this.f4446b = i11;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", BuildConfig.FLAVOR));
        }

        private int C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        private a D() {
            J2.c cVar;
            a aVar;
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            if (!f('(')) {
                return null;
            }
            A();
            int i11 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i12 = (!f('+') && f('-')) ? -1 : 1;
                    J2.c c10 = J2.c.c(this.f4747a, this.f4748b, this.f4749c, false);
                    if (c10 != null) {
                        this.f4748b = c10.a();
                    }
                    if (f('n') || f('N')) {
                        if (c10 == null) {
                            c10 = new J2.c(1L, this.f4748b);
                        }
                        A();
                        boolean f10 = f('+');
                        if (!f10 && (f10 = f('-'))) {
                            i11 = -1;
                        }
                        if (f10) {
                            A();
                            cVar = J2.c.c(this.f4747a, this.f4748b, this.f4749c, false);
                            if (cVar == null) {
                                this.f4748b = i10;
                                return null;
                            }
                            this.f4748b = cVar.a();
                        } else {
                            cVar = null;
                        }
                        int i13 = i11;
                        i11 = i12;
                        i12 = i13;
                    } else {
                        cVar = c10;
                        c10 = null;
                    }
                    aVar = new a(c10 == null ? 0 : i11 * c10.d(), cVar != null ? i12 * cVar.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.f4748b = i10;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String q10 = q();
            return q10 != null ? q10 : H();
        }

        private List G() {
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String H10 = H();
                if (H10 == null) {
                    this.f4748b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H10);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.f4748b = i10;
            return null;
        }

        private List K() {
            List list;
            List list2;
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            if (!f('(')) {
                return null;
            }
            A();
            List L10 = L();
            if (L10 == null) {
                this.f4748b = i10;
                return null;
            }
            if (!f(')')) {
                this.f4748b = i10;
                return null;
            }
            Iterator it = L10.iterator();
            while (it.hasNext() && (list = ((s) it.next()).f4461a) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((t) it2.next()).f4466d) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((g) it3.next()) instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return L10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void O(s sVar, t tVar) {
            g hVar;
            h hVar2;
            String H10 = H();
            if (H10 == null) {
                throw new J2.a("Invalid pseudo class");
            }
            j fromString = j.fromString(H10);
            a aVar = null;
            switch (a.f4441b[fromString.ordinal()]) {
                case 1:
                    hVar = new h(0, 1, true, false, null);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case 2:
                    hVar = new h(0, 1, false, false, null);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case 3:
                    hVar = new m(false, null);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.f4464b);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case 5:
                    hVar = new h(0, 1, false, true, tVar.f4464b);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case 6:
                    hVar = new m(true, tVar.f4464b);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case 7:
                    hVar = new n(aVar);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case 8:
                    hVar = new i(aVar);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case 9:
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 11:
                case 12:
                    boolean z10 = fromString == j.nth_child || fromString == j.nth_of_type;
                    boolean z11 = fromString == j.nth_of_type || fromString == j.nth_last_of_type;
                    a D10 = D();
                    if (D10 == null) {
                        throw new J2.a("Invalid or missing parameter section for pseudo class: " + H10);
                    }
                    h hVar3 = new h(D10.f4445a, D10.f4446b, z10, z11, tVar.f4464b);
                    sVar.b();
                    hVar2 = hVar3;
                    hVar = hVar2;
                    tVar.b(hVar);
                    return;
                case 13:
                    List K10 = K();
                    if (K10 == null) {
                        throw new J2.a("Invalid or missing parameter section for pseudo class: " + H10);
                    }
                    k kVar = new k(K10);
                    sVar.f4462b = kVar.b();
                    hVar2 = kVar;
                    hVar = hVar2;
                    tVar.b(hVar);
                    return;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    hVar = new o(aVar);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    G();
                    hVar = new l(H10);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                case 18:
                case 19:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    hVar = new l(H10);
                    sVar.b();
                    tVar.b(hVar);
                    return;
                default:
                    throw new J2.a("Unsupported pseudo class: " + H10);
            }
        }

        private int P() {
            int i10;
            if (h()) {
                return this.f4748b;
            }
            int i11 = this.f4748b;
            int charAt = this.f4747a.charAt(i11);
            if (charAt == 45) {
                charAt = a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i10 = i11;
            } else {
                int a10 = a();
                while (true) {
                    if ((a10 < 65 || a10 > 90) && ((a10 < 97 || a10 > 122) && !((a10 >= 48 && a10 <= 57) || a10 == 45 || a10 == 95))) {
                        break;
                    }
                    a10 = a();
                }
                i10 = this.f4748b;
            }
            this.f4748b = i11;
            return i10;
        }

        String F() {
            int C10;
            if (h()) {
                return null;
            }
            char charAt = this.f4747a.charAt(this.f4748b);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f4748b++;
            int intValue = l().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = l().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = l().intValue();
                        } else {
                            int C11 = C(intValue);
                            if (C11 != -1) {
                                for (int i10 = 1; i10 <= 5 && (C10 = C((intValue = l().intValue()))) != -1; i10++) {
                                    C11 = (C11 * 16) + C10;
                                }
                                sb2.append((char) C11);
                            }
                        }
                    }
                }
                sb2.append((char) intValue);
                intValue = l().intValue();
            }
            return sb2.toString();
        }

        String H() {
            int P10 = P();
            int i10 = this.f4748b;
            if (P10 == i10) {
                return null;
            }
            String substring = this.f4747a.substring(i10, P10);
            this.f4748b = P10;
            return substring;
        }

        String I() {
            char charAt;
            int C10;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (charAt = this.f4747a.charAt(this.f4748b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !k(charAt) && !Character.isISOControl((int) charAt)) {
                this.f4748b++;
                if (charAt == '\\') {
                    if (!h()) {
                        String str = this.f4747a;
                        int i10 = this.f4748b;
                        this.f4748b = i10 + 1;
                        charAt = str.charAt(i10);
                        if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                            int C11 = C(charAt);
                            if (C11 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (C10 = C(this.f4747a.charAt(this.f4748b))) != -1; i11++) {
                                    this.f4748b++;
                                    C11 = (C11 * 16) + C10;
                                }
                                sb2.append((char) C11);
                            }
                        }
                    }
                }
                sb2.append(charAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        String J() {
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            int charAt = this.f4747a.charAt(i10);
            int i11 = i10;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !j(charAt)) {
                if (!k(charAt)) {
                    i11 = this.f4748b + 1;
                }
                charAt = a();
            }
            if (this.f4748b > i10) {
                return this.f4747a.substring(i10, i11);
            }
            this.f4748b = i10;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        boolean M(s sVar) {
            e eVar;
            t tVar;
            String str;
            if (h()) {
                return false;
            }
            int i10 = this.f4748b;
            if (!sVar.f()) {
                if (f('>')) {
                    eVar = e.CHILD;
                    A();
                } else if (f('+')) {
                    eVar = e.FOLLOWS;
                    A();
                }
                if (f('*')) {
                    String H10 = H();
                    if (H10 != null) {
                        t tVar2 = new t(eVar, H10);
                        sVar.c();
                        tVar = tVar2;
                    } else {
                        tVar = null;
                    }
                } else {
                    tVar = new t(eVar, null);
                }
                while (!h()) {
                    if (!f('.')) {
                        if (!f('#')) {
                            if (!f('[')) {
                                if (!f(':')) {
                                    break;
                                }
                                if (tVar == null) {
                                    tVar = new t(eVar, null);
                                }
                                O(sVar, tVar);
                            } else {
                                if (tVar == null) {
                                    tVar = new t(eVar, null);
                                }
                                A();
                                String H11 = H();
                                if (H11 == null) {
                                    throw new J2.a("Invalid attribute simpleSelectors");
                                }
                                A();
                                c cVar = f('=') ? c.EQUALS : g("~=") ? c.INCLUDES : g("|=") ? c.DASHMATCH : null;
                                if (cVar != null) {
                                    A();
                                    str = E();
                                    if (str == null) {
                                        throw new J2.a("Invalid attribute simpleSelectors");
                                    }
                                    A();
                                } else {
                                    str = null;
                                }
                                if (!f(']')) {
                                    throw new J2.a("Invalid attribute simpleSelectors");
                                }
                                if (cVar == null) {
                                    cVar = c.EXISTS;
                                }
                                tVar.a(H11, cVar, str);
                                sVar.b();
                            }
                        } else {
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            String H12 = H();
                            if (H12 == null) {
                                throw new J2.a("Invalid \"#id\" simpleSelectors");
                            }
                            tVar.a("id", c.EQUALS, H12);
                            sVar.d();
                        }
                    } else {
                        if (tVar == null) {
                            tVar = new t(eVar, null);
                        }
                        String H13 = H();
                        if (H13 == null) {
                            throw new J2.a("Invalid \".class\" simpleSelectors");
                        }
                        tVar.a("class", c.EQUALS, H13);
                        sVar.b();
                    }
                }
                if (tVar == null) {
                    sVar.a(tVar);
                    return true;
                }
                this.f4748b = i10;
                return false;
            }
            eVar = null;
            if (f('*')) {
            }
            while (!h()) {
            }
            if (tVar == null) {
            }
        }

        String N() {
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            if (!g("url(")) {
                return null;
            }
            A();
            String F10 = F();
            if (F10 == null) {
                F10 = I();
            }
            if (F10 == null) {
                this.f4748b = i10;
                return null;
            }
            A();
            if (h() || g(")")) {
                return F10;
            }
            this.f4748b = i10;
            return null;
        }
    }

    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    private interface g {
        boolean a(q qVar, g.L l10);
    }

    private static class h implements g {

        /* renamed from: a, reason: collision with root package name */
        private int f4447a;

        /* renamed from: b, reason: collision with root package name */
        private int f4448b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4449c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4450d;

        /* renamed from: e, reason: collision with root package name */
        private String f4451e;

        h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f4447a = i10;
            this.f4448b = i11;
            this.f4449c = z10;
            this.f4450d = z11;
            this.f4451e = str;
        }

        @Override // J2.b.g
        public boolean a(q qVar, g.L l10) {
            int i10;
            int i11;
            String o10 = (this.f4450d && this.f4451e == null) ? l10.o() : this.f4451e;
            g.J j10 = l10.f4569b;
            if (j10 != null) {
                Iterator it = j10.a().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    g.L l11 = (g.L) ((g.N) it.next());
                    if (l11 == l10) {
                        i10 = i11;
                    }
                    if (o10 == null || l11.o().equals(o10)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f4449c ? i10 + 1 : i11 - i10;
            int i13 = this.f4447a;
            if (i13 == 0) {
                return i12 == this.f4448b;
            }
            int i14 = this.f4448b;
            if ((i12 - i14) % i13 == 0) {
                return Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.f4448b) == Integer.signum(this.f4447a);
            }
            return false;
        }

        public String toString() {
            String str = this.f4449c ? BuildConfig.FLAVOR : "last-";
            return this.f4450d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f4447a), Integer.valueOf(this.f4448b), this.f4451e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f4447a), Integer.valueOf(this.f4448b));
        }
    }

    private static class i implements g {
        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // J2.b.g
        public boolean a(q qVar, g.L l10) {
            return !(l10 instanceof g.J) || ((g.J) l10).a().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    private enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map<String, j> cache = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    cache.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j fromString(String str) {
            j jVar = cache.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    private static class k implements g {

        /* renamed from: a, reason: collision with root package name */
        private List f4452a;

        k(List list) {
            this.f4452a = list;
        }

        @Override // J2.b.g
        public boolean a(q qVar, g.L l10) {
            Iterator it = this.f4452a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, (s) it.next(), l10)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator it = this.f4452a.iterator();
            int i10 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i11 = ((s) it.next()).f4462b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f4452a + ")";
        }
    }

    private static class l implements g {

        /* renamed from: a, reason: collision with root package name */
        private String f4453a;

        l(String str) {
            this.f4453a = str;
        }

        @Override // J2.b.g
        public boolean a(q qVar, g.L l10) {
            return false;
        }

        public String toString() {
            return this.f4453a;
        }
    }

    private static class m implements g {

        /* renamed from: a, reason: collision with root package name */
        private boolean f4454a;

        /* renamed from: b, reason: collision with root package name */
        private String f4455b;

        public m(boolean z10, String str) {
            this.f4454a = z10;
            this.f4455b = str;
        }

        @Override // J2.b.g
        public boolean a(q qVar, g.L l10) {
            int i10;
            String o10 = (this.f4454a && this.f4455b == null) ? l10.o() : this.f4455b;
            g.J j10 = l10.f4569b;
            if (j10 != null) {
                Iterator it = j10.a().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    g.L l11 = (g.L) ((g.N) it.next());
                    if (o10 == null || l11.o().equals(o10)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f4454a ? String.format("only-of-type <%s>", this.f4455b) : String.format("only-child", new Object[0]);
        }
    }

    private static class n implements g {
        private n() {
        }

        @Override // J2.b.g
        public boolean a(q qVar, g.L l10) {
            return l10.f4569b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private static class o implements g {
        private o() {
        }

        @Override // J2.b.g
        public boolean a(q qVar, g.L l10) {
            return qVar != null && l10 == qVar.f4459a;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    static class p {

        /* renamed from: a, reason: collision with root package name */
        s f4456a;

        /* renamed from: b, reason: collision with root package name */
        g.E f4457b;

        /* renamed from: c, reason: collision with root package name */
        u f4458c;

        p(s sVar, g.E e10, u uVar) {
            this.f4456a = sVar;
            this.f4457b = e10;
            this.f4458c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f4456a) + " {...} (src=" + this.f4458c + ")";
        }
    }

    static class q {

        /* renamed from: a, reason: collision with root package name */
        g.L f4459a;

        q() {
        }

        public String toString() {
            g.L l10 = this.f4459a;
            return l10 != null ? String.format("<%s id=\"%s\">", l10.o(), this.f4459a.f4559c) : BuildConfig.FLAVOR;
        }
    }

    static class r {

        /* renamed from: a, reason: collision with root package name */
        private List f4460a = null;

        r() {
        }

        void a(p pVar) {
            if (this.f4460a == null) {
                this.f4460a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f4460a.size(); i10++) {
                if (((p) this.f4460a.get(i10)).f4456a.f4462b > pVar.f4456a.f4462b) {
                    this.f4460a.add(i10, pVar);
                    return;
                }
            }
            this.f4460a.add(pVar);
        }

        void b(r rVar) {
            if (rVar.f4460a == null) {
                return;
            }
            if (this.f4460a == null) {
                this.f4460a = new ArrayList(rVar.f4460a.size());
            }
            Iterator it = rVar.f4460a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        List c() {
            return this.f4460a;
        }

        boolean d() {
            List list = this.f4460a;
            return list == null || list.isEmpty();
        }

        void e(u uVar) {
            List list = this.f4460a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((p) it.next()).f4458c == uVar) {
                    it.remove();
                }
            }
        }

        int f() {
            List list = this.f4460a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f4460a == null) {
                return BuildConfig.FLAVOR;
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f4460a.iterator();
            while (it.hasNext()) {
                sb2.append(((p) it.next()).toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    private static class t {

        /* renamed from: a, reason: collision with root package name */
        e f4463a;

        /* renamed from: b, reason: collision with root package name */
        String f4464b;

        /* renamed from: c, reason: collision with root package name */
        List f4465c = null;

        /* renamed from: d, reason: collision with root package name */
        List f4466d = null;

        t(e eVar, String str) {
            this.f4463a = null;
            this.f4464b = null;
            this.f4463a = eVar == null ? e.DESCENDANT : eVar;
            this.f4464b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.f4465c == null) {
                this.f4465c = new ArrayList();
            }
            this.f4465c.add(new C0091b(str, cVar, str2));
        }

        void b(g gVar) {
            if (this.f4466d == null) {
                this.f4466d = new ArrayList();
            }
            this.f4466d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f4463a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f4464b;
            if (str == null) {
                str = "*";
            }
            sb2.append(str);
            List<C0091b> list = this.f4465c;
            if (list != null) {
                for (C0091b c0091b : list) {
                    sb2.append('[');
                    sb2.append(c0091b.f4442a);
                    int i10 = a.f4440a[c0091b.f4443b.ordinal()];
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(c0091b.f4444c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(c0091b.f4444c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(c0091b.f4444c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f4466d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb2.append(':');
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    enum u {
        Document,
        RenderOptions
    }

    b(f fVar, u uVar) {
        this.f4437a = fVar;
        this.f4438b = uVar;
    }

    private static int a(List list, int i10, g.L l10) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = list.get(i10);
        g.J j10 = l10.f4569b;
        if (obj != j10) {
            return -1;
        }
        Iterator it = j10.a().iterator();
        while (it.hasNext()) {
            if (((g.N) it.next()) == l10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List list, f fVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) {
        String H10 = dVar.H();
        dVar.A();
        if (H10 == null) {
            throw new J2.a("Invalid '@' rule");
        }
        if (!this.f4439c && H10.equals("media")) {
            List h10 = h(dVar);
            if (!dVar.f('{')) {
                throw new J2.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(h10, this.f4437a)) {
                this.f4439c = true;
                rVar.b(j(dVar));
                this.f4439c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new J2.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f4439c || !H10.equals("import")) {
            p("Ignoring @%s rule", H10);
            o(dVar);
        } else {
            String N10 = dVar.N();
            if (N10 == null) {
                N10 = dVar.F();
            }
            if (N10 == null) {
                throw new J2.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new J2.a("Invalid @media rule: expected '}' at end of rule set");
            }
            J2.g.k();
        }
        dVar.A();
    }

    public static List f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String r10 = dVar.r();
            if (r10 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r10);
                dVar.A();
            }
        }
        return arrayList;
    }

    private g.E g(d dVar) {
        g.E e10 = new g.E();
        do {
            String H10 = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new J2.a("Expected ':'");
            }
            dVar.A();
            String J10 = dVar.J();
            if (J10 == null) {
                throw new J2.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new J2.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            J2.k.S0(e10, H10, J10);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e10;
    }

    private static List h(d dVar) {
        String w10;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (w10 = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(w10));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) {
        List L10 = dVar.L();
        if (L10 == null || L10.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new J2.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        g.E g10 = g(dVar);
        dVar.A();
        Iterator it = L10.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), g10, this.f4438b));
        }
        return true;
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (J2.a e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i10, List list, int i11, g.L l10) {
        t e10 = sVar.e(i10);
        if (!n(qVar, e10, list, i11, l10)) {
            return false;
        }
        e eVar = e10.f4463a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11);
        }
        int a10 = a(list, i11, l10);
        if (a10 <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (g.L) l10.f4569b.a().get(a10 - 1));
    }

    static boolean l(q qVar, s sVar, g.L l10) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l10.f4569b; obj != null; obj = ((g.N) obj).f4569b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l10) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l10);
    }

    private static boolean m(q qVar, s sVar, int i10, List list, int i11) {
        t e10 = sVar.e(i10);
        g.L l10 = (g.L) list.get(i11);
        if (!n(qVar, e10, list, i11, l10)) {
            return false;
        }
        e eVar = e10.f4463a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11 - 1);
        }
        int a10 = a(list, i11, l10);
        if (a10 <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (g.L) l10.f4569b.a().get(a10 - 1));
    }

    private static boolean n(q qVar, t tVar, List list, int i10, g.L l10) {
        List list2;
        String str = tVar.f4464b;
        if (str != null && !str.equals(l10.o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0091b> list3 = tVar.f4465c;
        if (list3 != null) {
            for (C0091b c0091b : list3) {
                String str2 = c0091b.f4442a;
                str2.hashCode();
                if (str2.equals("id")) {
                    if (!c0091b.f4444c.equals(l10.f4559c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l10.f4563g) == null || !list2.contains(c0091b.f4444c)) {
                    return false;
                }
            }
        }
        List list4 = tVar.f4466d;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).a(qVar, l10)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i10 = 0;
        while (!dVar.h()) {
            int intValue = dVar.l().intValue();
            if (intValue == 59 && i10 == 0) {
                return;
            }
            if (intValue == 123) {
                i10++;
            } else if (intValue == 125 && i10 > 0 && i10 - 1 == 0) {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class s {

        /* renamed from: a, reason: collision with root package name */
        List f4461a;

        /* renamed from: b, reason: collision with root package name */
        int f4462b;

        private s() {
            this.f4461a = null;
            this.f4462b = 0;
        }

        void a(t tVar) {
            if (this.f4461a == null) {
                this.f4461a = new ArrayList();
            }
            this.f4461a.add(tVar);
        }

        void b() {
            this.f4462b += 1000;
        }

        void c() {
            this.f4462b++;
        }

        void d() {
            this.f4462b += HVFrameRecorder.BITRATE;
        }

        t e(int i10) {
            return (t) this.f4461a.get(i10);
        }

        boolean f() {
            List list = this.f4461a;
            return list == null || list.isEmpty();
        }

        int g() {
            List list = this.f4461a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f4461a.iterator();
            while (it.hasNext()) {
                sb2.append((t) it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f4462b);
            sb2.append(']');
            return sb2.toString();
        }

        /* synthetic */ s(a aVar) {
            this();
        }
    }
}
