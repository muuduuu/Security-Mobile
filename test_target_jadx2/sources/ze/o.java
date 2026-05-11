package ze;

import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public class o extends AbstractC5276a implements InterfaceC5277b {

    /* renamed from: d, reason: collision with root package name */
    private String f45977d;

    /* renamed from: e, reason: collision with root package name */
    private String f45978e;

    /* renamed from: f, reason: collision with root package name */
    private String f45979f;

    /* renamed from: g, reason: collision with root package name */
    private String f45980g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f45981h = null;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f45982i = null;

    public o(String str, String str2, String str3, String str4) {
        this.f45977d = str;
        this.f45978e = str2 != null ? str2.toUpperCase() : str2;
        this.f45979f = d(str3);
        this.f45980g = d(str4);
        h();
    }

    private String d(String str) {
        return str != null ? str.replace('>', ' ').replace('<', ' ').replace('&', ' ').replace('\'', ' ').replace('\"', ' ') : str;
    }

    private void h() {
        if (!"public".equalsIgnoreCase(this.f45978e) && !"system".equalsIgnoreCase(this.f45978e) && "html".equalsIgnoreCase(this.f45977d) && this.f45978e == null) {
            this.f45981h = 60;
            this.f45982i = Boolean.TRUE;
        }
        if ("public".equalsIgnoreCase(this.f45978e)) {
            if ("-//W3C//DTD HTML 4.0//EN".equals(f())) {
                this.f45981h = 10;
                if ("http://www.w3.org/TR/REC-html40/strict.dtd".equals(this.f45980g) || BuildConfig.FLAVOR.equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
            if ("-//W3C//DTD HTML 4.01//EN".equals(f())) {
                this.f45981h = 21;
                if ("http://www.w3.org/TR/html4/strict.dtd".equals(this.f45980g) || BuildConfig.FLAVOR.equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
            if ("-//W3C//DTD HTML 4.01 Transitional//EN".equals(f())) {
                this.f45981h = 22;
                if ("http://www.w3.org/TR/html4/loose.dtd".equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
            if ("-//W3C//DTD HTML 4.01 Frameset//EN".equals(f())) {
                this.f45981h = 23;
                if ("http://www.w3.org/TR/html4/frameset.dtd".equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
            if ("-//W3C//DTD XHTML 1.0 Strict//EN".equals(f())) {
                this.f45981h = 31;
                if ("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd".equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
            if ("-//W3C//DTD XHTML 1.0 Transitional//EN".equals(f())) {
                this.f45981h = 32;
                if ("http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd".equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
            if ("-//W3C//DTD XHTML 1.0 Frameset//EN".equals(f())) {
                this.f45981h = 33;
                if ("http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd".equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
            if ("-//W3C//DTD XHTML 1.1//EN".equals(f())) {
                this.f45981h = 40;
                if ("http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd".equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
            if ("-//W3C//DTD XHTML Basic 1.1//EN".equals(f())) {
                this.f45981h = 41;
                if ("http://www.w3.org/TR/xhtml11/DTD/xhtml-basic11.dtd".equals(g())) {
                    this.f45982i = Boolean.TRUE;
                } else {
                    this.f45982i = Boolean.FALSE;
                }
            }
        }
        if ("system".equalsIgnoreCase(this.f45978e) && "about:legacy-compat".equals(f())) {
            this.f45981h = 61;
            this.f45982i = Boolean.TRUE;
        }
        if (this.f45981h == null) {
            this.f45981h = 0;
            this.f45982i = Boolean.FALSE;
        }
    }

    public String e() {
        String str;
        if (this.f45981h.intValue() == 0 && this.f45977d == null) {
            return "<!DOCTYPE>";
        }
        if (this.f45981h.intValue() == 0) {
            str = "<!DOCTYPE " + this.f45977d;
        } else if (this.f45981h.intValue() >= 30) {
            str = "<!DOCTYPE html";
        } else {
            str = "<!DOCTYPE HTML";
        }
        if (this.f45978e != null) {
            String str2 = str + " " + this.f45978e + " \"" + this.f45979f + "\"";
            if (BuildConfig.FLAVOR.equals(this.f45980g)) {
                str = str2;
            } else {
                str = str2 + " \"" + this.f45980g + "\"";
            }
        }
        return str + ">";
    }

    public String f() {
        return this.f45979f;
    }

    public String g() {
        return this.f45980g;
    }

    public String toString() {
        return e();
    }

    public o(String str, String str2, String str3, String str4, String str5) {
        this.f45977d = str;
        this.f45978e = str2 != null ? str2.toUpperCase() : str2;
        this.f45979f = d(str3);
        this.f45980g = d(str5);
        h();
    }
}
