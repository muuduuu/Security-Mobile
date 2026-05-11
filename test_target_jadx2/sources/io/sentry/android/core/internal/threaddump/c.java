package io.sentry.android.core.internal.threaddump;

import io.sentry.K1;
import io.sentry.L1;
import io.sentry.P1;
import io.sentry.R1;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f34894d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f34895e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f34896f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f34897g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f34898h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f34899i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f34900j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f34901k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f34902l = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f34903m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f34904n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f34905o = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f34906p = Pattern.compile("\\s+");

    /* renamed from: a, reason: collision with root package name */
    private final P1 f34907a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34908b;

    /* renamed from: c, reason: collision with root package name */
    private final R1 f34909c;

    public c(P1 p12, boolean z10) {
        this.f34907a = p12;
        this.f34908b = z10;
        this.f34909c = new R1(p12);
    }

    private void a(x xVar, L1 l12) {
        Map k10 = xVar.k();
        if (k10 == null) {
            k10 = new HashMap();
        }
        L1 l13 = (L1) k10.get(l12.f());
        if (l13 != null) {
            l13.l(Math.max(l13.g(), l12.g()));
        } else {
            k10.put(l12.f(), new L1(l12));
        }
        xVar.t(k10);
    }

    private Integer b(Matcher matcher, int i10, Integer num) {
        String group = matcher.group(i10);
        return (group == null || group.length() == 0) ? num : Integer.valueOf(Integer.parseInt(group));
    }

    private Long c(Matcher matcher, int i10, Long l10) {
        String group = matcher.group(i10);
        return (group == null || group.length() == 0) ? l10 : Long.valueOf(Long.parseLong(group));
    }

    private Integer d(Matcher matcher, int i10, Integer num) {
        String group = matcher.group(i10);
        if (group == null || group.length() == 0) {
            return num;
        }
        int parseInt = Integer.parseInt(group);
        return parseInt >= 0 ? Integer.valueOf(parseInt) : num;
    }

    private boolean e(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    private w g(b bVar, x xVar) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f34896f.matcher(BuildConfig.FLAVOR);
        Matcher matcher3 = f34897g.matcher(BuildConfig.FLAVOR);
        Matcher matcher4 = f34898h.matcher(BuildConfig.FLAVOR);
        Matcher matcher5 = f34899i.matcher(BuildConfig.FLAVOR);
        Matcher matcher6 = f34900j.matcher(BuildConfig.FLAVOR);
        Matcher matcher7 = f34902l.matcher(BuildConfig.FLAVOR);
        Matcher matcher8 = f34901k.matcher(BuildConfig.FLAVOR);
        Matcher matcher9 = f34904n.matcher(BuildConfig.FLAVOR);
        Matcher matcher10 = f34903m.matcher(BuildConfig.FLAVOR);
        Matcher matcher11 = f34905o.matcher(BuildConfig.FLAVOR);
        Matcher matcher12 = f34906p.matcher(BuildConfig.FLAVOR);
        v vVar = null;
        while (true) {
            if (!bVar.a()) {
                break;
            }
            a b10 = bVar.b();
            if (b10 == null) {
                this.f34907a.getLogger().c(K1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = b10.f34889b;
            Matcher matcher13 = matcher12;
            if (e(matcher2, str)) {
                v vVar2 = new v();
                vVar2.y(matcher2.group(1));
                vVar2.s(matcher2.group(2));
                vVar2.u(b(matcher2, 3, null));
                arrayList.add(vVar2);
            } else if (e(matcher3, str)) {
                v vVar3 = new v();
                vVar3.y(matcher3.group(1));
                vVar3.s(matcher3.group(2));
                arrayList.add(vVar3);
            } else {
                matcher = matcher2;
                if (e(matcher4, str)) {
                    vVar = new v();
                    String format = String.format("%s.%s", matcher4.group(1), matcher4.group(2));
                    vVar.w(format);
                    vVar.s(matcher4.group(3));
                    vVar.r(matcher4.group(4));
                    vVar.u(d(matcher4, 5, null));
                    vVar.t(this.f34909c.b(format));
                    arrayList.add(vVar);
                } else if (e(matcher5, str)) {
                    vVar = new v();
                    String format2 = String.format("%s.%s", matcher5.group(1), matcher5.group(2));
                    vVar.w(format2);
                    vVar.s(matcher5.group(3));
                    vVar.t(this.f34909c.b(format2));
                    arrayList.add(vVar);
                } else if (e(matcher6, str)) {
                    if (vVar != null) {
                        L1 l12 = new L1();
                        l12.l(1);
                        l12.h(matcher6.group(1));
                        l12.j(matcher6.group(2));
                        l12.i(matcher6.group(3));
                        vVar.v(l12);
                        a(xVar, l12);
                    }
                } else if (e(matcher7, str)) {
                    if (vVar != null) {
                        L1 l13 = new L1();
                        l13.l(2);
                        l13.h(matcher7.group(1));
                        l13.j(matcher7.group(2));
                        l13.i(matcher7.group(3));
                        vVar.v(l13);
                        a(xVar, l13);
                    }
                } else if (!e(matcher8, str)) {
                    if (!e(matcher9, str)) {
                        if (!e(matcher10, str)) {
                            if (!e(matcher11, str)) {
                                if (str.length() == 0) {
                                    break;
                                }
                                matcher12 = matcher13;
                                if (e(matcher12, str)) {
                                    break;
                                }
                                matcher2 = matcher;
                            } else if (vVar != null) {
                                L1 l14 = new L1();
                                l14.l(8);
                                vVar.v(l14);
                                a(xVar, l14);
                            }
                        } else if (vVar != null) {
                            L1 l15 = new L1();
                            l15.l(8);
                            l15.h(matcher10.group(1));
                            l15.j(matcher10.group(2));
                            l15.i(matcher10.group(3));
                            vVar.v(l15);
                            a(xVar, l15);
                        }
                    } else if (vVar != null) {
                        L1 l16 = new L1();
                        l16.l(8);
                        l16.h(matcher9.group(1));
                        l16.j(matcher9.group(2));
                        l16.i(matcher9.group(3));
                        l16.k(c(matcher9, 4, null));
                        vVar.v(l16);
                        a(xVar, l16);
                    }
                    matcher12 = matcher13;
                    matcher2 = matcher;
                } else if (vVar != null) {
                    L1 l17 = new L1();
                    l17.l(4);
                    l17.h(matcher8.group(1));
                    l17.j(matcher8.group(2));
                    l17.i(matcher8.group(3));
                    vVar.v(l17);
                    a(xVar, l17);
                }
                matcher12 = matcher13;
                matcher2 = matcher;
            }
            matcher = matcher2;
            matcher12 = matcher13;
            vVar = null;
            matcher2 = matcher;
        }
        Collections.reverse(arrayList);
        w wVar = new w(arrayList);
        wVar.e(Boolean.TRUE);
        return wVar;
    }

    private x h(b bVar) {
        x xVar = new x();
        Matcher matcher = f34894d.matcher(BuildConfig.FLAVOR);
        Matcher matcher2 = f34895e.matcher(BuildConfig.FLAVOR);
        if (!bVar.a()) {
            return null;
        }
        a b10 = bVar.b();
        boolean z10 = false;
        if (b10 == null) {
            this.f34907a.getLogger().c(K1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (e(matcher, b10.f34889b)) {
            Long c10 = c(matcher, 4, null);
            if (c10 == null) {
                this.f34907a.getLogger().c(K1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            xVar.u(c10);
            xVar.w(matcher.group(1));
            String group = matcher.group(5);
            if (group != null) {
                if (group.contains(" ")) {
                    xVar.z(group.substring(0, group.indexOf(32)));
                } else {
                    xVar.z(group);
                }
            }
        } else if (e(matcher2, b10.f34889b)) {
            Long c11 = c(matcher2, 3, null);
            if (c11 == null) {
                this.f34907a.getLogger().c(K1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            xVar.u(c11);
            xVar.w(matcher2.group(1));
        }
        String m10 = xVar.m();
        if (m10 != null) {
            boolean equals = m10.equals("main");
            xVar.v(Boolean.valueOf(equals));
            xVar.q(Boolean.valueOf(equals));
            if (equals && !this.f34908b) {
                z10 = true;
            }
            xVar.r(Boolean.valueOf(z10));
        }
        xVar.y(g(bVar, xVar));
        return xVar;
    }

    public List f(b bVar) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f34894d.matcher(BuildConfig.FLAVOR);
        Matcher matcher2 = f34895e.matcher(BuildConfig.FLAVOR);
        while (bVar.a()) {
            a b10 = bVar.b();
            if (b10 == null) {
                this.f34907a.getLogger().c(K1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList;
            }
            String str = b10.f34889b;
            if (e(matcher, str) || e(matcher2, str)) {
                bVar.d();
                x h10 = h(bVar);
                if (h10 != null) {
                    arrayList.add(h10);
                }
            }
        }
        return arrayList;
    }
}
