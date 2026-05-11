package com.webengage.sdk.android;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import com.webengage.sdk.android.f3;
import com.webengage.sdk.android.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final float f31011a = Resources.getSystem().getDisplayMetrics().densityDpi / 160;

    class a implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Float f31012a;

        a(Float f10) {
            this.f31012a = f10;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.b(new j3(this.f31012a.floatValue(), j3.a.EM));
        }
    }

    public interface a0 {
        boolean a(ze.D d10);
    }

    class b implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31013a;

        b(j3 j3Var) {
            this.f31013a = j3Var;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.d(this.f31013a);
        }
    }

    class c implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31014a;

        c(j3 j3Var) {
            this.f31014a = j3Var;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.c(this.f31014a);
        }
    }

    class d implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31015a;

        d(j3 j3Var) {
            this.f31015a = j3Var;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.g(this.f31015a);
        }
    }

    class e implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31016a;

        e(j3 j3Var) {
            this.f31016a = j3Var;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.e(this.f31016a);
        }
    }

    class f implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31017a;

        f(j3 j3Var) {
            this.f31017a = j3Var;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.f(this.f31017a);
        }
    }

    class g implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31018a;

        g(j3 j3Var) {
            this.f31018a = j3Var;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.h(this.f31018a);
        }
    }

    class h implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f3.b f31019a;

        h(f3.b bVar) {
            this.f31019a = bVar;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(this.f31019a);
        }
    }

    class i implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f3.a f31020a;

        i(f3.a aVar) {
            this.f31020a = aVar;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(this.f31020a);
        }
    }

    class j implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f31021a;

        j(Integer num) {
            this.f31021a = num;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.b(this.f31021a);
        }
    }

    class k implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f31022a;

        k(Integer num) {
            this.f31022a = num;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.c(this.f31022a);
        }
    }

    class l implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31023a;

        l(j3 j3Var) {
            this.f31023a = j3Var;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(this.f31023a);
        }
    }

    class m implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f31024a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3 f31025b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.a f31026c;

        m(Integer num, j3 j3Var, f3.a aVar) {
            this.f31024a = num;
            this.f31025b = j3Var;
            this.f31026c = aVar;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            Integer num = this.f31024a;
            if (num != null) {
                f3Var = f3Var.b(num);
            }
            j3 j3Var = this.f31025b;
            if (j3Var != null) {
                f3Var = f3Var.a(j3Var);
            }
            f3.a aVar = this.f31026c;
            return aVar != null ? f3Var.a(aVar) : f3Var;
        }
    }

    class n implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3 f31028b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j3 f31029c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j3 f31030d;

        n(j3 j3Var, j3 j3Var2, j3 j3Var3, j3 j3Var4) {
            this.f31027a = j3Var;
            this.f31028b = j3Var2;
            this.f31029c = j3Var3;
            this.f31030d = j3Var4;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            j3 j3Var = this.f31027a;
            if (j3Var != null) {
                f3Var = f3Var.d(j3Var);
            }
            j3 j3Var2 = this.f31028b;
            if (j3Var2 != null) {
                f3Var = f3Var.g(j3Var2);
            }
            j3 j3Var3 = this.f31029c;
            if (j3Var3 != null) {
                f3Var = f3Var.e(j3Var3);
            }
            j3 j3Var4 = this.f31030d;
            return j3Var4 != null ? f3Var.f(j3Var4) : f3Var;
        }
    }

    class o implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f31031a;

        o(Integer num) {
            this.f31031a = num;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.c(this.f31031a);
        }
    }

    class p implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f31032a;

        p(Integer num) {
            this.f31032a = num;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(this.f31032a);
        }
    }

    class q implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f3.e f31033a;

        q(f3.e eVar) {
            this.f31033a = eVar;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(this.f31033a);
        }
    }

    class r implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f3.f f31034a;

        r(f3.f fVar) {
            this.f31034a = fVar;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(this.f31034a);
        }
    }

    class s implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f3.d f31035a;

        s(f3.d dVar) {
            this.f31035a = dVar;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(this.f31035a);
        }
    }

    class t implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f3.c f31036a;

        t(f3.c cVar) {
            this.f31036a = cVar;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(this.f31036a);
        }
    }

    class u implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31037a;

        u(String str) {
            this.f31037a = str;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.a(f1Var.b(this.f31037a));
        }
    }

    /* renamed from: com.webengage.sdk.android.v$v, reason: collision with other inner class name */
    class C0448v implements y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f31038a;

        C0448v(j3 j3Var) {
            this.f31038a = j3Var;
        }

        @Override // com.webengage.sdk.android.v.y
        public f3 a(f3 f3Var, f1 f1Var) {
            return f3Var.b(this.f31038a);
        }
    }

    private static class w implements a0 {

        /* renamed from: a, reason: collision with root package name */
        private String f31039a;

        /* renamed from: b, reason: collision with root package name */
        private String f31040b;

        private w(String str) {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                this.f31039a = split[0];
                this.f31040b = split[1];
            }
        }

        @Override // com.webengage.sdk.android.v.a0
        public boolean a(ze.D d10) {
            String l10;
            if (d10 == null) {
                return false;
            }
            String str = this.f31039a;
            return (str == null || str.length() <= 0 || this.f31039a.equals(d10.e())) && (l10 = d10.l("class")) != null && l10.equals(this.f31040b);
        }

        /* synthetic */ w(String str, k kVar) {
            this(str);
        }
    }

    private static class x implements a0 {

        /* renamed from: a, reason: collision with root package name */
        private final String f31041a;

        private x(String str) {
            this.f31041a = str.substring(1);
        }

        @Override // com.webengage.sdk.android.v.a0
        public boolean a(ze.D d10) {
            String l10;
            return (d10 == null || (l10 = d10.l("id")) == null || !l10.equals(this.f31041a)) ? false : true;
        }

        /* synthetic */ x(String str, k kVar) {
            this(str);
        }
    }

    public interface y {
        f3 a(f3 f3Var, f1 f1Var);
    }

    private static class z implements a0 {

        /* renamed from: a, reason: collision with root package name */
        private final String f31042a;

        private z(String str) {
            this.f31042a = str.trim();
        }

        @Override // com.webengage.sdk.android.v.a0
        public boolean a(ze.D d10) {
            return d10 != null && this.f31042a.equalsIgnoreCase(d10.e());
        }

        /* synthetic */ z(String str, k kVar) {
            this(str);
        }
    }

    private static float a(int i10) {
        if (i10 == 1) {
            return 0.6f;
        }
        if (i10 == 2) {
            return 0.8f;
        }
        if (i10 == 4) {
            return 1.2f;
        }
        if (i10 == 5) {
            return 1.4f;
        }
        if (i10 != 6) {
            return i10 != 7 ? 1.0f : 1.8f;
        }
        return 1.6f;
    }

    private static y b(String str) {
        Integer num = null;
        f3.a aVar = null;
        j3 j3Var = null;
        for (String str2 : str.split("\\s")) {
            if (j3Var != null || (j3Var = j3.a(str2)) == null) {
                if (num == null) {
                    try {
                        num = c(str2);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (aVar == null) {
                    try {
                        aVar = f3.a.valueOf(str2.toUpperCase());
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
        }
        return new m(num, j3Var, aVar);
    }

    public static Integer c(String str) {
        if (str.length() == 4 && str.startsWith("#")) {
            StringBuilder sb2 = new StringBuilder("#");
            for (int i10 = 1; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                sb2.append(str.charAt(i10));
            }
            str = sb2.toString();
        }
        return Integer.valueOf(Color.parseColor(str));
    }

    private static y d(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String[] split = str.split("\\s");
        if (split.length != 1) {
            if (split.length == 2) {
                str3 = split[0];
                str2 = split[1];
                str5 = str2;
                str4 = str3;
            } else if (split.length == 3) {
                str3 = split[0];
                str5 = split[1];
                str4 = split[2];
                str2 = str5;
            } else if (split.length == 4) {
                str3 = split[0];
                String str6 = split[1];
                str4 = split[2];
                str5 = split[3];
                str2 = str6;
            } else {
                str2 = BuildConfig.FLAVOR;
            }
            return new n(j3.a(str4), j3.a(str3), j3.a(str5), j3.a(str2));
        }
        str2 = split[0];
        str3 = str2;
        str5 = str3;
        str4 = str5;
        return new n(j3.a(str4), j3.a(str3), j3.a(str5), j3.a(str2));
    }

    private static int a(Float f10) {
        return (int) TypedValue.applyDimension(2, f10.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    private static int a(int[] iArr) {
        return Color.rgb(iArr[0], iArr[1], iArr[2]);
    }

    public static b0 a(s2 s2Var, f1 f1Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<y2> it = s2Var.b().iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        f3 f3Var = new f3();
        for (h2 h2Var : s2Var.a()) {
            y a10 = a(h2Var.a(), h2Var.b());
            if (a10 != null) {
                arrayList2.add(a10);
                f3Var = a10.a(f3Var, f1Var);
            }
        }
        return new b0(f1Var, arrayList, arrayList2, s2Var.toString());
    }

    private static a0 a(String str) {
        k kVar = null;
        return str.indexOf(46) != -1 ? new w(str, kVar) : str.startsWith("#") ? new x(str, kVar) : new z(str, kVar);
    }

    public static y a(String str, String str2) {
        StringBuilder sb2;
        String str3;
        j3 a10;
        j3 a11;
        j3 a12;
        j3 a13;
        j3 a14;
        j3 a15;
        if ("color".equals(str)) {
            try {
                if (!str2.contains("rgb")) {
                    return new o(c(str2));
                }
                String[] split = str2.replaceAll(" ", BuildConfig.FLAVOR).replace("rgb(", BuildConfig.FLAVOR).replace(")", BuildConfig.FLAVOR).split(",");
                int[] iArr = new int[3];
                for (int i10 = 0; i10 < split.length; i10++) {
                    iArr[i10] = Integer.parseInt(split[i10]);
                }
                return new k(Integer.valueOf(a(iArr)));
            } catch (IllegalArgumentException unused) {
                sb2 = new StringBuilder();
            }
        } else {
            if (!"background-color".equals(str)) {
                String str4 = "Can't parse alignment: ";
                if ("align".equals(str) || "text-align".equals(str)) {
                    try {
                        return new q(f3.e.valueOf(str2.toUpperCase()));
                    } catch (IllegalArgumentException unused2) {
                        sb2 = new StringBuilder();
                    }
                } else {
                    if (!"text-decoration".equals(str)) {
                        if ("font-weight".equals(str)) {
                            try {
                                return new s(f3.d.valueOf(str2.toUpperCase()));
                            } catch (IllegalArgumentException unused3) {
                                sb2 = new StringBuilder();
                                str3 = "Can't parse font-weight: ";
                            }
                        } else if ("font-style".equals(str)) {
                            try {
                                return new t(f3.c.valueOf(str2.toUpperCase()));
                            } catch (IllegalArgumentException unused4) {
                                sb2 = new StringBuilder();
                                str3 = "Can't parse font-style: ";
                            }
                        } else {
                            if ("font-family".equals(str)) {
                                return new u(str2);
                            }
                            if ("font-size".equals(str)) {
                                j3 a16 = j3.a(str2);
                                if (a16 != null) {
                                    if (a16.c().equals(j3.a.PX)) {
                                        a16.a(Integer.valueOf((int) (a16.b() * f31011a)));
                                    }
                                    if (a16.c().equals(j3.a.PT)) {
                                        a16.a(Integer.valueOf(a(Float.valueOf(a16.b()))));
                                    }
                                    return new C0448v(a16);
                                }
                                try {
                                    return new a(Float.valueOf(a(Integer.parseInt(str2))));
                                } catch (NumberFormatException unused5) {
                                    sb2 = new StringBuilder();
                                    str3 = "Can't parse font-size: ";
                                }
                            } else {
                                if ("margin-bottom".equals(str) && (a15 = j3.a(str2)) != null) {
                                    return new b(a15);
                                }
                                if ("line-height".equals(str) && (a14 = j3.a(str2)) != null) {
                                    return new c(a14);
                                }
                                if ("margin-top".equals(str) && (a13 = j3.a(str2)) != null) {
                                    return new d(a13);
                                }
                                if ("margin-left".equals(str) && (a12 = j3.a(str2)) != null) {
                                    return new e(a12);
                                }
                                if ("margin-right".equals(str) && (a11 = j3.a(str2)) != null) {
                                    return new f(a11);
                                }
                                if ("margin".equals(str)) {
                                    return d(str2);
                                }
                                if ("text-indent".equals(str) && (a10 = j3.a(str2)) != null) {
                                    return new g(a10);
                                }
                                if ("display".equals(str)) {
                                    try {
                                        return new h(f3.b.valueOf(str2.toUpperCase()));
                                    } catch (IllegalArgumentException unused6) {
                                        sb2 = new StringBuilder();
                                        str3 = "Can't parse display-value: ";
                                    }
                                } else if ("border-style".equals(str)) {
                                    try {
                                        return new i(f3.a.valueOf(str2.toUpperCase()));
                                    } catch (IllegalArgumentException unused7) {
                                        sb2 = new StringBuilder();
                                        str3 = "Could not parse border-style ";
                                    }
                                } else {
                                    str4 = "Could not parse border-color ";
                                    if ("border-color".equals(str)) {
                                        try {
                                            return new j(c(str2));
                                        } catch (IllegalArgumentException unused8) {
                                            sb2 = new StringBuilder();
                                        }
                                    } else {
                                        if (!"border-width".equals(str)) {
                                            if ("border".equals(str)) {
                                                return b(str2);
                                            }
                                            return null;
                                        }
                                        j3 a17 = j3.a(str2);
                                        if (a17 != null) {
                                            return new l(a17);
                                        }
                                        sb2 = new StringBuilder();
                                    }
                                }
                            }
                        }
                        sb2.append(str3);
                        sb2.append(str2);
                        Logger.e("WebEngage", sb2.toString());
                        return null;
                    }
                    try {
                        return new r(f3.f.valueOf((str2.equals("line-through") ? "linethrough" : str2).toUpperCase()));
                    } catch (IllegalArgumentException unused9) {
                        sb2 = new StringBuilder();
                    }
                }
                sb2.append(str4);
                sb2.append(str2);
                Logger.e("WebEngage", sb2.toString());
                return null;
            }
            try {
                return new p(c(str2));
            } catch (IllegalArgumentException unused10) {
                sb2 = new StringBuilder();
            }
        }
        sb2.append("Can't parse colour definition: ");
        sb2.append(str2);
        Logger.e("WebEngage", sb2.toString());
        return null;
    }

    public static List<a0> a(y2 y2Var) {
        ArrayList arrayList = new ArrayList();
        String[] split = y2Var.toString().split("\\s");
        for (int length = split.length - 1; length >= 0; length--) {
            arrayList.add(a(split[length]));
        }
        return arrayList;
    }
}
