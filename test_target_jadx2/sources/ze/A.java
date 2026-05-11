package ze;

import com.reactnativegooglesignin.RNGoogleSigninModule;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: f, reason: collision with root package name */
    public static final A f45857f = new a(true, true);

    /* renamed from: a, reason: collision with root package name */
    private Map f45858a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map f45859b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private boolean f45860c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45861d;

    /* renamed from: e, reason: collision with root package name */
    private int f45862e;

    static class a extends A {
        a(boolean z10, boolean z11) {
            super(z10, z11);
        }
    }

    public A(boolean z10, boolean z11) {
        this.f45860c = z10;
        this.f45861d = z11;
        a(new B("null", 0, BuildConfig.FLAVOR, true));
        a(new B("nbsp", 160, null, true));
        a(new B("iexcl", 161, null, true));
        a(new B("cent", 162, null, true));
        a(new B("pound", 163, null, true));
        a(new B("curren", 164, null, true));
        a(new B("yen", 165, null, true));
        a(new B("brvbar", 166, null, true));
        a(new B("sect", 167, null, true));
        a(new B("uml", 168, null, true));
        a(new B("copy", 169, null, true));
        a(new B("ordf", 170, null, true));
        a(new B("laquo", 171, null, true));
        a(new B("not", 172, null, true));
        a(new B("shy", 173, null, true));
        a(new B("reg", 174, null, true));
        a(new B("macr", 175, null, true));
        a(new B("deg", 176, null, true));
        a(new B("plusmn", 177, null, true));
        a(new B("sup2", 178, null, true));
        a(new B("sup3", 179, null, true));
        a(new B("acute", 180, null, true));
        a(new B("micro", 181, null, true));
        a(new B("para", 182, null, true));
        a(new B("middot", 183, null, true));
        a(new B("cedil", 184, null, true));
        a(new B("sup1", 185, null, true));
        a(new B("ordm", 186, null, true));
        a(new B("raquo", 187, null, true));
        a(new B("frac14", 188, null, true));
        a(new B("frac12", 189, null, true));
        a(new B("frac34", 190, null, true));
        a(new B("iquest", 191, null, true));
        a(new B("Agrave", 192, null, true));
        a(new B("Aacute", 193, null, true));
        a(new B("Acirc", 194, null, true));
        a(new B("Atilde", 195, null, true));
        a(new B("Auml", 196, null, true));
        a(new B("Aring", 197, null, true));
        a(new B("AElig", 198, null, true));
        a(new B("Ccedil", 199, null, true));
        a(new B("Egrave", 200, null, true));
        a(new B("Eacute", 201, null, true));
        a(new B("Ecirc", 202, null, true));
        a(new B("Euml", 203, null, true));
        a(new B("Igrave", 204, null, true));
        a(new B("Iacute", 205, null, true));
        a(new B("Icirc", 206, null, true));
        a(new B("Iuml", 207, null, true));
        a(new B("ETH", 208, null, true));
        a(new B("Ntilde", 209, null, true));
        a(new B("Ograve", 210, null, true));
        a(new B("Oacute", 211, null, true));
        a(new B("Ocirc", 212, null, true));
        a(new B("Otilde", 213, null, true));
        a(new B("Ouml", 214, null, true));
        a(new B("times", 215, null, true));
        a(new B("Oslash", 216, null, true));
        a(new B("Ugrave", 217, null, true));
        a(new B("Uacute", 218, null, true));
        a(new B("Ucirc", 219, null, true));
        a(new B("Uuml", 220, null, true));
        a(new B("Yacute", 221, null, true));
        a(new B("THORN", 222, null, true));
        a(new B("szlig", 223, null, true));
        a(new B("agrave", 224, null, true));
        a(new B("aacute", 225, null, true));
        a(new B("acirc", 226, null, true));
        a(new B("atilde", 227, null, true));
        a(new B("auml", 228, null, true));
        a(new B("aring", 229, null, true));
        a(new B("aelig", 230, null, true));
        a(new B("ccedil", 231, null, true));
        a(new B("egrave", 232, null, true));
        a(new B("eacute", 233, null, true));
        a(new B("ecirc", 234, null, true));
        a(new B("euml", 235, null, true));
        a(new B("igrave", 236, null, true));
        a(new B("iacute", 237, null, true));
        a(new B("icirc", 238, null, true));
        a(new B("iuml", 239, null, true));
        a(new B("eth", 240, null, true));
        a(new B("ntilde", 241, null, true));
        a(new B("ograve", 242, null, true));
        a(new B("oacute", 243, null, true));
        a(new B("ocirc", 244, null, true));
        a(new B("otilde", 245, null, true));
        a(new B("ouml", 246, null, true));
        a(new B("divide", 247, null, true));
        a(new B("oslash", 248, null, true));
        a(new B("ugrave", 249, null, true));
        a(new B("uacute", 250, null, true));
        a(new B("ucirc", 251, null, true));
        a(new B("uuml", 252, null, true));
        a(new B("yacute", 253, null, true));
        a(new B("thorn", 254, null, true));
        a(new B("yuml", 255, null, true));
        a(new B("OElig", 338, null, true));
        a(new B("oelig", 339, null, true));
        a(new B("Scaron", 352, null, true));
        a(new B("scaron", 353, null, true));
        a(new B("Yuml", 376, null, true));
        a(new B("fnof", 402, null, true));
        a(new B("circ", 710, null, true));
        a(new B("tilde", 732, null, true));
        if (this.f45860c) {
            a(new B("Alpha", 913, null, true));
            a(new B("Beta", 914, null, true));
            a(new B("Gamma", 915, null, true));
            a(new B("Delta", 916, null, true));
            a(new B("Epsilon", 917, null, true));
            a(new B("Zeta", 918, null, true));
            a(new B("Eta", 919, null, true));
            a(new B("Theta", 920, null, true));
            a(new B("Iota", 921, null, true));
            a(new B("Kappa", 922, null, true));
            a(new B("Lambda", 923, null, true));
            a(new B("Mu", 924, null, true));
            a(new B("Nu", 925, null, true));
            a(new B("Xi", 926, null, true));
            a(new B("Omicron", 927, null, true));
            a(new B("Pi", 928, null, true));
            a(new B("Rho", 929, null, true));
            a(new B("Sigma", 931, null, true));
            a(new B("Tau", 932, null, true));
            a(new B("Upsilon", 933, null, true));
            a(new B("Phi", 934, null, true));
            a(new B("Chi", 935, null, true));
            a(new B("Psi", 936, null, true));
            a(new B("Omega", 937, null, true));
            a(new B("alpha", 945, null, true));
            a(new B("beta", 946, null, true));
            a(new B("gamma", 947, null, true));
            a(new B("delta", 948, null, true));
            a(new B("epsilon", 949, null, true));
            a(new B("zeta", 950, null, true));
            a(new B("eta", 951, null, true));
            a(new B("theta", 952, null, true));
            a(new B("iota", 953, null, true));
            a(new B("kappa", 954, null, true));
            a(new B("lambda", 955, null, true));
            a(new B("mu", 956, null, true));
            a(new B("nu", 957, null, true));
            a(new B("xi", 958, null, true));
            a(new B("omicron", 959, null, true));
            a(new B("pi", 960, null, true));
            a(new B("rho", 961, null, true));
            a(new B("sigmaf", 962, null, true));
            a(new B("sigma", 963, null, true));
            a(new B("tau", 964, null, true));
            a(new B("upsilon", 965, null, true));
            a(new B("phi", 966, null, true));
            a(new B("chi", 967, null, true));
            a(new B("psi", 968, null, true));
            a(new B("omega", 969, null, true));
            a(new B("thetasym", 977, null, true));
            a(new B("upsih", 978, null, true));
            a(new B("piv", 982, null, true));
        }
        a(new B("ensp", 8194, null, true));
        a(new B("emsp", 8195, null, true));
        a(new B("thinsp", 8201, null, true));
        a(new B("zwnj", 8204, null, true));
        a(new B("zwj", 8205, null, true));
        a(new B("lrm", 8206, null, true));
        a(new B("rlm", 8207, null, true));
        a(new B("ndash", 8211, null, true));
        a(new B("mdash", 8212, null, true));
        a(new B("lsquo", 8216, null, true));
        a(new B("rsquo", 8217, null, true));
        a(new B("sbquo", 8218, null, true));
        a(new B("ldquo", 8220, null, true));
        a(new B("rdquo", 8221, null, true));
        a(new B("bdquo", 8222, null, true));
        a(new B("dagger", 8224, null, true));
        a(new B("Dagger", 8225, null, true));
        a(new B("bull", 8226, null, true));
        a(new B("hellip", 8230, null, true));
        a(new B("permil", 8240, null, true));
        a(new B("prime", 8242, null, true));
        a(new B("Prime", 8243, null, true));
        a(new B("lsaquo", 8249, null, true));
        a(new B("rsaquo", 8250, null, true));
        a(new B("oline", 8254, null, true));
        a(new B("frasl", 8260, null, true));
        a(new B("euro", 8364, null, true));
        a(new B("image", 8465, null, true));
        a(new B("weierp", 8472, null, true));
        a(new B("real", 8476, null, true));
        a(new B("trade", 8482, null, true));
        a(new B("alefsym", 8501, null, true));
        a(new B("larr", 8592, null, true));
        a(new B("uarr", 8593, null, true));
        a(new B("rarr", 8594, null, true));
        a(new B("darr", 8595, null, true));
        a(new B("harr", 8596, null, true));
        a(new B("crarr", 8629, null, true));
        a(new B("lArr", 8656, null, true));
        a(new B("uArr", 8657, null, true));
        a(new B("rArr", 8658, null, true));
        a(new B("dArr", 8659, null, true));
        a(new B("hArr", 8660, null, true));
        if (this.f45861d) {
            a(new B("forall", 8704, null, true));
            a(new B("part", 8706, null, true));
            a(new B("exist", 8707, null, true));
            a(new B("empty", 8709, null, true));
            a(new B("nabla", 8711, null, true));
            a(new B("isin", 8712, null, true));
            a(new B("notin", 8713, null, true));
            a(new B("ni", 8715, null, true));
            a(new B("prod", 8719, null, true));
            a(new B("sum", 8721, null, true));
            a(new B("minus", 8722, null, true));
            a(new B("lowast", 8727, null, true));
            a(new B("radic", 8730, null, true));
            a(new B("prop", 8733, null, true));
            a(new B("infin", 8734, null, true));
            a(new B("ang", 8736, null, true));
            a(new B("and", 8743, null, true));
            a(new B("or", 8744, null, true));
            a(new B("cap", 8745, null, true));
            a(new B("cup", 8746, null, true));
            a(new B("int", 8747, null, true));
            a(new B("there4", 8756, null, true));
            a(new B("sim", 8764, null, true));
            a(new B("cong", 8773, null, true));
            a(new B("asymp", 8776, null, true));
            a(new B("ne", 8800, null, true));
            a(new B("equiv", 8801, null, true));
            a(new B("le", 8804, null, true));
            a(new B("ge", 8805, null, true));
            a(new B("sub", 8834, null, true));
            a(new B("sup", 8835, null, true));
            a(new B("nsub", 8836, null, true));
            a(new B("sube", 8838, null, true));
            a(new B("supe", 8839, null, true));
            a(new B("oplus", 8853, null, true));
            a(new B("otimes", 8855, null, true));
            a(new B("perp", 8869, null, true));
            a(new B("sdot", 8901, null, true));
            a(new B("lceil", 8968, null, true));
            a(new B("rceil", 8969, null, true));
            a(new B("lfloor", 8970, null, true));
            a(new B("rfloor", 8971, null, true));
            a(new B("lang", RNGoogleSigninModule.RC_SIGN_IN, null, true));
            a(new B("rang", 9002, null, true));
            a(new B("loz", 9674, null, true));
            a(new B("spades", 9824, null, true));
            a(new B("clubs", 9827, null, true));
            a(new B("hearts", 9829, null, true));
            a(new B("diams", 9830, null, true));
        }
        a(new B("amp", 38, null, false));
        a(new B("lt", 60, null, false));
        a(new B("gt", 62, null, false));
        a(new B("quot", 34, null, false));
        a(new B("apos", 39, "'", false));
    }

    private void a(B b10) {
        B b11 = (B) this.f45858a.put(b10.g(), b10);
        if (b11 != null) {
            throw new t("replaced " + b11 + " with " + b10);
        }
        B b12 = (B) this.f45859b.put(Integer.valueOf(b10.h()), b10);
        if (b12 == null) {
            this.f45862e = Math.max(this.f45862e, b10.g().length());
            return;
        }
        throw new t("replaced " + b12 + " with " + b10);
    }

    public int b() {
        return this.f45862e;
    }

    public B c(String str) {
        if (str.length() == 0) {
            return null;
        }
        int i10 = str.charAt(0) == '&' ? 1 : 0;
        int indexOf = str.indexOf(59);
        return (B) this.f45858a.get(indexOf < 0 ? str.substring(i10) : str.substring(i10, indexOf));
    }

    public B d(int i10) {
        return (B) this.f45859b.get(Integer.valueOf(i10));
    }
}
