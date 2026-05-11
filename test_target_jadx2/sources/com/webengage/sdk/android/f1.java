package com.webengage.sdk.android;

import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.webengage.sdk.android.f3;
import com.webengage.sdk.android.j3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import u5.C4870a;
import ze.C5283h;

/* loaded from: classes2.dex */
public class f1 {

    /* renamed from: k, reason: collision with root package name */
    public static int f30521k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static int f30522l = 3;

    /* renamed from: m, reason: collision with root package name */
    public static int f30523m = 10;

    /* renamed from: n, reason: collision with root package name */
    private static final Map<String, String> f30524n;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, u3> f30525a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30526b;

    /* renamed from: c, reason: collision with root package name */
    private ze.s f30527c;

    /* renamed from: d, reason: collision with root package name */
    private x0 f30528d;

    /* renamed from: e, reason: collision with root package name */
    private int f30529e;

    /* renamed from: f, reason: collision with root package name */
    private int f30530f;

    /* renamed from: g, reason: collision with root package name */
    private float f30531g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f30532h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30533i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30534j;

    public interface a {
        boolean a();
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f30524n = linkedHashMap;
        linkedHashMap.put("\r\n", "\n");
        linkedHashMap.put("\r", "\n");
        linkedHashMap.put("\n", "<br>");
        linkedHashMap.put("&gt;", ">");
        linkedHashMap.put("&lt;", "<");
        linkedHashMap.put("&bull;", "•");
        linkedHashMap.put("&#39;", "'");
        linkedHashMap.put("&euro;", "€");
        linkedHashMap.put("&#36;", "$");
        linkedHashMap.put("&nbsp;", " ");
        linkedHashMap.put("&rsquo;", "'");
        linkedHashMap.put("&lsquo;", "'");
        linkedHashMap.put("&ldquo;", "\"");
        linkedHashMap.put("&rdquo;", "\"");
        linkedHashMap.put("&ndash;", "-");
        linkedHashMap.put("&#95;", "_");
        linkedHashMap.put("&copy;", "&#169;");
        linkedHashMap.put("&divide;", "&#247;");
        linkedHashMap.put("&micro;", "&#181;");
        linkedHashMap.put("&middot;", "&#183;");
        linkedHashMap.put("&para;", "&#182;");
        linkedHashMap.put("&plusmn;", "&#177;");
        linkedHashMap.put("&reg;", "&#174;");
        linkedHashMap.put("&sect;", "&#167;");
        linkedHashMap.put("&trade;", "&#153;");
        linkedHashMap.put("&yen;", "&#165;");
        linkedHashMap.put("&pound;", "£");
        linkedHashMap.put("&raquo;", ">>");
        linkedHashMap.put("&laquo;", "<<");
        linkedHashMap.put("&hellip;", "...");
        linkedHashMap.put("&agrave;", "à");
        linkedHashMap.put("&egrave;", "è");
        linkedHashMap.put("&igrave;", "ì");
        linkedHashMap.put("&ograve;", "ò");
        linkedHashMap.put("&ugrave;", "ù");
        linkedHashMap.put("&aacute;", "á");
        linkedHashMap.put("&eacute;", "é");
        linkedHashMap.put("&iacute;", "í");
        linkedHashMap.put("&oacute;", "ó");
        linkedHashMap.put("&uacute;", "ú");
        linkedHashMap.put("&Agrave;", "À");
        linkedHashMap.put("&Egrave;", "È");
        linkedHashMap.put("&Igrave;", "Ì");
        linkedHashMap.put("&Ograve;", "Ò");
        linkedHashMap.put("&Ugrave;", "Ù");
        linkedHashMap.put("&Aacute;", "Á");
        linkedHashMap.put("&Eacute;", "É");
        linkedHashMap.put("&Iacute;", "Í");
        linkedHashMap.put("&Oacute;", "Ó");
        linkedHashMap.put("&Uacute;", "Ú");
        linkedHashMap.put("<h1>", "<h1 style=\"font-weight:bold\">");
        linkedHashMap.put("<h2>", "<h2 style=\"font-weight:bold\">");
    }

    public f1(int i10, float f10) {
        this(a(), new s3(), i10, f10);
    }

    private void g() {
        u3 k3Var = new k3(new f3().a(f3.c.ITALIC));
        a("i", k3Var);
        a("em", k3Var);
        a("cite", k3Var);
        a("dfn", k3Var);
        u3 k3Var2 = new k3(new f3().a(f3.d.BOLD));
        a("b", k3Var2);
        a("bold", k3Var2);
        a("strong", k3Var2);
        a("u", new b4());
        f3 f3Var = new f3();
        j3.a aVar = j3.a.EM;
        a("blockquote", new k3(f3Var.e(new j3(2.0f, aVar))));
        f3 f3Var2 = new f3();
        f3.b bVar = f3.b.BLOCK;
        u3 pVar = new p(a(new k3(f3Var2.a(bVar))));
        a("ul", pVar);
        a("ol", pVar);
        u3 a10 = a(new x1());
        a("tt", a10);
        a(AppConstants.RETAKE_ERROR_CODE, a10);
        a("style", new i3());
        u3 a2Var = new a2(1, a(new k3()));
        a("br", a2Var);
        a("br/", a2Var);
        f3.a valueOf = f3.a.valueOf("solid".toUpperCase());
        a("hr", new d1(a(new k3(new f3().a(bVar)))));
        u3 pVar2 = new p(a(new k3(new f3().a(bVar).d(new j3(4)).a(valueOf).b(Integer.valueOf(this.f30529e)))));
        f3 d10 = new f3().a(f3.b.INLINE).d(new j3(1.0f, aVar));
        u3 pVar3 = new p(a(new k3(d10)));
        a("p", pVar2);
        a("div", pVar2);
        a("span", pVar3);
        t3 t3Var = new t3();
        t3Var.a(this.f30531g * 0.83f);
        t3Var.a(this.f30530f);
        Boolean bool = this.f30532h;
        if (bool != null) {
            t3Var.a(bool.booleanValue());
        }
        a("table", t3Var);
        a("h1", a(new c1(2.0f, 0.5f)));
        a("h2", a(new c1(1.5f, 0.6f)));
        a("h3", a(new c1(1.17f, 0.7f)));
        a("h4", a(new c1(1.12f, 0.8f)));
        a("h5", a(new c1(0.83f, 0.9f)));
        a("h6", a(new c1(0.75f, 1.0f)));
        a("pre", new g2());
        a("big", new k3(new f3().b(new j3(1.25f, aVar))));
        a("small", new k3(new f3().b(new j3(0.8f, aVar))));
        a("sub", new l3());
        a("sup", new p3());
        a("center", new k3(new f3().a(f3.e.CENTER)));
        a("li", new p1(a(new k3(d10))));
        a(C4870a.f43493a, new o1());
        a("font", new w0());
    }

    public Spannable a(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            str = c(str);
        }
        return a(this.f30527c.h(str), (a) null);
    }

    public u0 b(String str) {
        return this.f30528d.a(str);
    }

    public float c() {
        return this.f30531g;
    }

    public boolean d() {
        return this.f30533i;
    }

    public boolean e() {
        return this.f30526b;
    }

    public boolean f() {
        return this.f30534j;
    }

    public f1(ze.s sVar, x0 x0Var, int i10, float f10) {
        this.f30526b = false;
        this.f30532h = null;
        this.f30533i = true;
        this.f30534j = true;
        a(sVar, x0Var);
        b(i10);
        b(f10);
        a(f10);
        g();
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : f30524n.entrySet()) {
            str = str.replace(entry.getKey(), entry.getValue()).replace(entry.getKey().toUpperCase(), entry.getValue());
        }
        return str;
    }

    public Spannable a(ze.D d10, a aVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        b3 b3Var = new b3();
        a(spannableStringBuilder, d10, b3Var, aVar);
        b3Var.a(this, spannableStringBuilder);
        return spannableStringBuilder;
    }

    public x0 b() {
        return this.f30528d;
    }

    private static k3 a(k3 k3Var) {
        return new g3(new C2956d(k3Var));
    }

    public void b(float f10) {
        this.f30531g = f10;
    }

    private static ze.s a() {
        ze.s sVar = new ze.s();
        C5283h p10 = sVar.p();
        p10.E(true);
        p10.P(true);
        p10.J(true);
        p10.I(false);
        p10.O(true);
        p10.N(true);
        p10.L(true);
        p10.H(true);
        p10.R(false);
        p10.K("script,title");
        return sVar;
    }

    public void b(int i10) {
        this.f30530f = i10;
    }

    private void a(float f10) {
        Paint paint = new Paint();
        paint.setTextSize(f10);
        f30521k = Math.round(paint.measureText("4."));
        f30522l = Math.round(paint.measureText("•"));
        f30523m = Math.round(paint.measureText(" "));
    }

    public void a(int i10) {
        this.f30529e = i10;
    }

    private void a(SpannableStringBuilder spannableStringBuilder, Object obj, b3 b3Var, a aVar) {
        a(aVar);
        String a10 = w3.a(((ze.l) obj).d(), true);
        if (e()) {
            a10 = a10.replace((char) 160, ' ');
        }
        if (a10.length() > 0) {
            spannableStringBuilder.append((CharSequence) a10);
        }
    }

    private void a(SpannableStringBuilder spannableStringBuilder, ze.D d10, b3 b3Var, a aVar) {
        a(aVar);
        u3 u3Var = this.f30525a.get(d10.e());
        if (u3Var == null) {
            u3Var = new k3();
            u3Var.a(this);
        }
        u3 u3Var2 = u3Var;
        int length = spannableStringBuilder.length();
        u3Var2.a(d10, spannableStringBuilder, b3Var);
        if (!u3Var2.b()) {
            for (Object obj : d10.k()) {
                if (obj instanceof ze.l) {
                    a(spannableStringBuilder, obj, b3Var, aVar);
                } else if (obj instanceof ze.D) {
                    a(spannableStringBuilder, (ze.D) obj, b3Var, aVar);
                }
            }
        }
        u3Var2.a(d10, spannableStringBuilder, length, spannableStringBuilder.length(), b3Var);
    }

    private void a(a aVar) {
        if (aVar != null && aVar.a()) {
            throw new f2();
        }
    }

    public void a(String str, u3 u3Var) {
        this.f30525a.put(str, u3Var);
        u3Var.a(this);
    }

    private void a(ze.s sVar, x0 x0Var) {
        this.f30525a = new HashMap();
        this.f30527c = sVar;
        this.f30528d = x0Var;
    }
}
