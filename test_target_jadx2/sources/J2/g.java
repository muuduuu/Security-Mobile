package J2;

import J2.b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class g {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f4489g = true;

    /* renamed from: a, reason: collision with root package name */
    private F f4490a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f4491b = BuildConfig.FLAVOR;

    /* renamed from: c, reason: collision with root package name */
    private String f4492c = BuildConfig.FLAVOR;

    /* renamed from: d, reason: collision with root package name */
    private float f4493d = 96.0f;

    /* renamed from: e, reason: collision with root package name */
    private b.r f4494e = new b.r();

    /* renamed from: f, reason: collision with root package name */
    private Map f4495f = new HashMap();

    static class A extends C0870z {
        A() {
        }

        @Override // J2.g.C0870z, J2.g.N
        String o() {
            return "polygon";
        }
    }

    static class B extends AbstractC0856l {

        /* renamed from: o, reason: collision with root package name */
        C0860p f4496o;

        /* renamed from: p, reason: collision with root package name */
        C0860p f4497p;

        /* renamed from: q, reason: collision with root package name */
        C0860p f4498q;

        /* renamed from: r, reason: collision with root package name */
        C0860p f4499r;

        /* renamed from: s, reason: collision with root package name */
        C0860p f4500s;

        /* renamed from: t, reason: collision with root package name */
        C0860p f4501t;

        B() {
        }

        @Override // J2.g.N
        String o() {
            return "rect";
        }
    }

    static class E implements Cloneable {

        /* renamed from: A, reason: collision with root package name */
        Boolean f4503A;

        /* renamed from: B, reason: collision with root package name */
        Boolean f4504B;

        /* renamed from: C, reason: collision with root package name */
        O f4505C;

        /* renamed from: D, reason: collision with root package name */
        Float f4506D;

        /* renamed from: E, reason: collision with root package name */
        String f4507E;

        /* renamed from: F, reason: collision with root package name */
        a f4508F;

        /* renamed from: G, reason: collision with root package name */
        String f4509G;

        /* renamed from: H, reason: collision with root package name */
        O f4510H;

        /* renamed from: I, reason: collision with root package name */
        Float f4511I;

        /* renamed from: J, reason: collision with root package name */
        O f4512J;

        /* renamed from: K, reason: collision with root package name */
        Float f4513K;

        /* renamed from: X, reason: collision with root package name */
        i f4514X;

        /* renamed from: Y, reason: collision with root package name */
        e f4515Y;

        /* renamed from: a, reason: collision with root package name */
        long f4516a = 0;

        /* renamed from: b, reason: collision with root package name */
        O f4517b;

        /* renamed from: c, reason: collision with root package name */
        a f4518c;

        /* renamed from: d, reason: collision with root package name */
        Float f4519d;

        /* renamed from: e, reason: collision with root package name */
        O f4520e;

        /* renamed from: f, reason: collision with root package name */
        Float f4521f;

        /* renamed from: g, reason: collision with root package name */
        C0860p f4522g;

        /* renamed from: h, reason: collision with root package name */
        c f4523h;

        /* renamed from: i, reason: collision with root package name */
        d f4524i;

        /* renamed from: j, reason: collision with root package name */
        Float f4525j;

        /* renamed from: k, reason: collision with root package name */
        C0860p[] f4526k;

        /* renamed from: l, reason: collision with root package name */
        C0860p f4527l;

        /* renamed from: m, reason: collision with root package name */
        Float f4528m;

        /* renamed from: n, reason: collision with root package name */
        C0851f f4529n;

        /* renamed from: o, reason: collision with root package name */
        List f4530o;

        /* renamed from: p, reason: collision with root package name */
        C0860p f4531p;

        /* renamed from: q, reason: collision with root package name */
        Integer f4532q;

        /* renamed from: r, reason: collision with root package name */
        b f4533r;

        /* renamed from: s, reason: collision with root package name */
        EnumC0092g f4534s;

        /* renamed from: t, reason: collision with root package name */
        h f4535t;

        /* renamed from: u, reason: collision with root package name */
        f f4536u;

        /* renamed from: v, reason: collision with root package name */
        Boolean f4537v;

        /* renamed from: w, reason: collision with root package name */
        C0848c f4538w;

        /* renamed from: x, reason: collision with root package name */
        String f4539x;

        /* renamed from: y, reason: collision with root package name */
        String f4540y;

        /* renamed from: z, reason: collision with root package name */
        String f4541z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* renamed from: J2.g$E$g, reason: collision with other inner class name */
        public enum EnumC0092g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E a() {
            E e10 = new E();
            e10.f4516a = -1L;
            C0851f c0851f = C0851f.f4609b;
            e10.f4517b = c0851f;
            a aVar = a.NonZero;
            e10.f4518c = aVar;
            Float valueOf = Float.valueOf(1.0f);
            e10.f4519d = valueOf;
            e10.f4520e = null;
            e10.f4521f = valueOf;
            e10.f4522g = new C0860p(1.0f);
            e10.f4523h = c.Butt;
            e10.f4524i = d.Miter;
            e10.f4525j = Float.valueOf(4.0f);
            e10.f4526k = null;
            e10.f4527l = new C0860p(0.0f);
            e10.f4528m = valueOf;
            e10.f4529n = c0851f;
            e10.f4530o = null;
            e10.f4531p = new C0860p(12.0f, d0.pt);
            e10.f4532q = 400;
            e10.f4533r = b.Normal;
            e10.f4534s = EnumC0092g.None;
            e10.f4535t = h.LTR;
            e10.f4536u = f.Start;
            Boolean bool = Boolean.TRUE;
            e10.f4537v = bool;
            e10.f4538w = null;
            e10.f4539x = null;
            e10.f4540y = null;
            e10.f4541z = null;
            e10.f4503A = bool;
            e10.f4504B = bool;
            e10.f4505C = c0851f;
            e10.f4506D = valueOf;
            e10.f4507E = null;
            e10.f4508F = aVar;
            e10.f4509G = null;
            e10.f4510H = null;
            e10.f4511I = valueOf;
            e10.f4512J = null;
            e10.f4513K = valueOf;
            e10.f4514X = i.None;
            e10.f4515Y = e.auto;
            return e10;
        }

        void b(boolean z10) {
            Boolean bool = Boolean.TRUE;
            this.f4503A = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f4537v = bool;
            this.f4538w = null;
            this.f4507E = null;
            this.f4528m = Float.valueOf(1.0f);
            this.f4505C = C0851f.f4609b;
            this.f4506D = Float.valueOf(1.0f);
            this.f4509G = null;
            this.f4510H = null;
            this.f4511I = Float.valueOf(1.0f);
            this.f4512J = null;
            this.f4513K = Float.valueOf(1.0f);
            this.f4514X = i.None;
        }

        protected Object clone() {
            E e10 = (E) super.clone();
            C0860p[] c0860pArr = this.f4526k;
            if (c0860pArr != null) {
                e10.f4526k = (C0860p[]) c0860pArr.clone();
            }
            return e10;
        }
    }

    static class F extends R {

        /* renamed from: q, reason: collision with root package name */
        C0860p f4542q;

        /* renamed from: r, reason: collision with root package name */
        C0860p f4543r;

        /* renamed from: s, reason: collision with root package name */
        C0860p f4544s;

        /* renamed from: t, reason: collision with root package name */
        C0860p f4545t;

        /* renamed from: u, reason: collision with root package name */
        public String f4546u;

        F() {
        }

        @Override // J2.g.N
        String o() {
            return "svg";
        }
    }

    interface G {
        Set b();

        void c(Set set);

        String d();

        void e(Set set);

        void g(Set set);

        Set i();

        void j(String str);

        void l(Set set);

        Set m();

        Set n();
    }

    static abstract class H extends K implements J, G {

        /* renamed from: i, reason: collision with root package name */
        List f4547i = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        Set f4548j = null;

        /* renamed from: k, reason: collision with root package name */
        String f4549k = null;

        /* renamed from: l, reason: collision with root package name */
        Set f4550l = null;

        /* renamed from: m, reason: collision with root package name */
        Set f4551m = null;

        /* renamed from: n, reason: collision with root package name */
        Set f4552n = null;

        H() {
        }

        @Override // J2.g.J
        public List a() {
            return this.f4547i;
        }

        @Override // J2.g.G
        public Set b() {
            return null;
        }

        @Override // J2.g.G
        public void c(Set set) {
            this.f4551m = set;
        }

        @Override // J2.g.G
        public String d() {
            return this.f4549k;
        }

        @Override // J2.g.G
        public void e(Set set) {
            this.f4552n = set;
        }

        @Override // J2.g.G
        public void g(Set set) {
            this.f4548j = set;
        }

        @Override // J2.g.J
        public void h(N n10) {
            this.f4547i.add(n10);
        }

        @Override // J2.g.G
        public Set i() {
            return this.f4548j;
        }

        @Override // J2.g.G
        public void j(String str) {
            this.f4549k = str;
        }

        @Override // J2.g.G
        public void l(Set set) {
            this.f4550l = set;
        }

        @Override // J2.g.G
        public Set m() {
            return this.f4551m;
        }

        @Override // J2.g.G
        public Set n() {
            return this.f4552n;
        }
    }

    static abstract class I extends K implements G {

        /* renamed from: i, reason: collision with root package name */
        Set f4553i = null;

        /* renamed from: j, reason: collision with root package name */
        String f4554j = null;

        /* renamed from: k, reason: collision with root package name */
        Set f4555k = null;

        /* renamed from: l, reason: collision with root package name */
        Set f4556l = null;

        /* renamed from: m, reason: collision with root package name */
        Set f4557m = null;

        I() {
        }

        @Override // J2.g.G
        public Set b() {
            return this.f4555k;
        }

        @Override // J2.g.G
        public void c(Set set) {
            this.f4556l = set;
        }

        @Override // J2.g.G
        public String d() {
            return this.f4554j;
        }

        @Override // J2.g.G
        public void e(Set set) {
            this.f4557m = set;
        }

        @Override // J2.g.G
        public void g(Set set) {
            this.f4553i = set;
        }

        @Override // J2.g.G
        public Set i() {
            return this.f4553i;
        }

        @Override // J2.g.G
        public void j(String str) {
            this.f4554j = str;
        }

        @Override // J2.g.G
        public void l(Set set) {
            this.f4555k = set;
        }

        @Override // J2.g.G
        public Set m() {
            return this.f4556l;
        }

        @Override // J2.g.G
        public Set n() {
            return this.f4557m;
        }
    }

    interface J {
        List a();

        void h(N n10);
    }

    static abstract class K extends L {

        /* renamed from: h, reason: collision with root package name */
        C0847b f4558h = null;

        K() {
        }
    }

    static abstract class L extends N {

        /* renamed from: c, reason: collision with root package name */
        String f4559c = null;

        /* renamed from: d, reason: collision with root package name */
        Boolean f4560d = null;

        /* renamed from: e, reason: collision with root package name */
        E f4561e = null;

        /* renamed from: f, reason: collision with root package name */
        E f4562f = null;

        /* renamed from: g, reason: collision with root package name */
        List f4563g = null;

        L() {
        }

        public String toString() {
            return o();
        }
    }

    static class M extends AbstractC0854j {

        /* renamed from: m, reason: collision with root package name */
        C0860p f4564m;

        /* renamed from: n, reason: collision with root package name */
        C0860p f4565n;

        /* renamed from: o, reason: collision with root package name */
        C0860p f4566o;

        /* renamed from: p, reason: collision with root package name */
        C0860p f4567p;

        M() {
        }

        @Override // J2.g.N
        String o() {
            return "linearGradient";
        }
    }

    static class N {

        /* renamed from: a, reason: collision with root package name */
        g f4568a;

        /* renamed from: b, reason: collision with root package name */
        J f4569b;

        N() {
        }

        abstract String o();
    }

    static abstract class O implements Cloneable {
        O() {
        }
    }

    static abstract class P extends H {

        /* renamed from: o, reason: collision with root package name */
        e f4570o = null;

        P() {
        }
    }

    static class Q extends AbstractC0854j {

        /* renamed from: m, reason: collision with root package name */
        C0860p f4571m;

        /* renamed from: n, reason: collision with root package name */
        C0860p f4572n;

        /* renamed from: o, reason: collision with root package name */
        C0860p f4573o;

        /* renamed from: p, reason: collision with root package name */
        C0860p f4574p;

        /* renamed from: q, reason: collision with root package name */
        C0860p f4575q;

        Q() {
        }

        @Override // J2.g.N
        String o() {
            return "radialGradient";
        }
    }

    static abstract class R extends P {

        /* renamed from: p, reason: collision with root package name */
        C0847b f4576p;

        R() {
        }
    }

    static class S extends C0857m {
        S() {
        }

        @Override // J2.g.C0857m, J2.g.N
        String o() {
            return "switch";
        }
    }

    static class T extends R implements InterfaceC0864t {
        T() {
        }

        @Override // J2.g.N
        String o() {
            return "symbol";
        }
    }

    static class U extends Y implements X {

        /* renamed from: o, reason: collision with root package name */
        String f4577o;

        /* renamed from: p, reason: collision with root package name */
        private b0 f4578p;

        U() {
        }

        @Override // J2.g.X
        public b0 f() {
            return this.f4578p;
        }

        @Override // J2.g.N
        String o() {
            return "tref";
        }

        public void p(b0 b0Var) {
            this.f4578p = b0Var;
        }
    }

    static class V extends a0 implements X {

        /* renamed from: s, reason: collision with root package name */
        private b0 f4579s;

        V() {
        }

        @Override // J2.g.X
        public b0 f() {
            return this.f4579s;
        }

        @Override // J2.g.N
        String o() {
            return "tspan";
        }

        public void p(b0 b0Var) {
            this.f4579s = b0Var;
        }
    }

    static class W extends a0 implements b0, InterfaceC0858n {

        /* renamed from: s, reason: collision with root package name */
        Matrix f4580s;

        W() {
        }

        @Override // J2.g.InterfaceC0858n
        public void k(Matrix matrix) {
            this.f4580s = matrix;
        }

        @Override // J2.g.N
        String o() {
            return "text";
        }
    }

    interface X {
        b0 f();
    }

    static abstract class Y extends H {
        Y() {
        }

        @Override // J2.g.H, J2.g.J
        public void h(N n10) {
            if (n10 instanceof X) {
                this.f4547i.add(n10);
                return;
            }
            throw new j("Text content elements cannot contain " + n10 + " elements.");
        }
    }

    static class Z extends Y implements X {

        /* renamed from: o, reason: collision with root package name */
        String f4581o;

        /* renamed from: p, reason: collision with root package name */
        C0860p f4582p;

        /* renamed from: q, reason: collision with root package name */
        private b0 f4583q;

        Z() {
        }

        @Override // J2.g.X
        public b0 f() {
            return this.f4583q;
        }

        @Override // J2.g.N
        String o() {
            return "textPath";
        }

        public void p(b0 b0Var) {
            this.f4583q = b0Var;
        }
    }

    /* renamed from: J2.g$a, reason: case insensitive filesystem */
    static /* synthetic */ class C0846a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4584a;

        static {
            int[] iArr = new int[d0.values().length];
            f4584a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4584a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4584a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4584a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4584a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4584a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4584a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4584a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4584a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static abstract class a0 extends Y {

        /* renamed from: o, reason: collision with root package name */
        List f4585o;

        /* renamed from: p, reason: collision with root package name */
        List f4586p;

        /* renamed from: q, reason: collision with root package name */
        List f4587q;

        /* renamed from: r, reason: collision with root package name */
        List f4588r;

        a0() {
        }
    }

    interface b0 {
    }

    /* renamed from: J2.g$c, reason: case insensitive filesystem */
    static class C0848c {

        /* renamed from: a, reason: collision with root package name */
        C0860p f4593a;

        /* renamed from: b, reason: collision with root package name */
        C0860p f4594b;

        /* renamed from: c, reason: collision with root package name */
        C0860p f4595c;

        /* renamed from: d, reason: collision with root package name */
        C0860p f4596d;

        C0848c(C0860p c0860p, C0860p c0860p2, C0860p c0860p3, C0860p c0860p4) {
            this.f4593a = c0860p;
            this.f4594b = c0860p2;
            this.f4595c = c0860p3;
            this.f4596d = c0860p4;
        }
    }

    static class c0 extends N implements X {

        /* renamed from: c, reason: collision with root package name */
        String f4597c;

        /* renamed from: d, reason: collision with root package name */
        private b0 f4598d;

        c0(String str) {
            this.f4597c = str;
        }

        @Override // J2.g.X
        public b0 f() {
            return this.f4598d;
        }

        public String toString() {
            return "TextChild: '" + this.f4597c + "'";
        }
    }

    /* renamed from: J2.g$d, reason: case insensitive filesystem */
    static class C0849d extends AbstractC0856l {

        /* renamed from: o, reason: collision with root package name */
        C0860p f4599o;

        /* renamed from: p, reason: collision with root package name */
        C0860p f4600p;

        /* renamed from: q, reason: collision with root package name */
        C0860p f4601q;

        C0849d() {
        }

        @Override // J2.g.N
        String o() {
            return "circle";
        }
    }

    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* renamed from: J2.g$e, reason: case insensitive filesystem */
    static class C0850e extends C0857m implements InterfaceC0864t {

        /* renamed from: p, reason: collision with root package name */
        Boolean f4603p;

        C0850e() {
        }

        @Override // J2.g.C0857m, J2.g.N
        String o() {
            return "clipPath";
        }
    }

    static class e0 extends C0857m {

        /* renamed from: p, reason: collision with root package name */
        String f4604p;

        /* renamed from: q, reason: collision with root package name */
        C0860p f4605q;

        /* renamed from: r, reason: collision with root package name */
        C0860p f4606r;

        /* renamed from: s, reason: collision with root package name */
        C0860p f4607s;

        /* renamed from: t, reason: collision with root package name */
        C0860p f4608t;

        e0() {
        }

        @Override // J2.g.C0857m, J2.g.N
        String o() {
            return "use";
        }
    }

    /* renamed from: J2.g$f, reason: case insensitive filesystem */
    static class C0851f extends O {

        /* renamed from: b, reason: collision with root package name */
        static final C0851f f4609b = new C0851f(-16777216);

        /* renamed from: c, reason: collision with root package name */
        static final C0851f f4610c = new C0851f(0);

        /* renamed from: a, reason: collision with root package name */
        int f4611a;

        C0851f(int i10) {
            this.f4611a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f4611a));
        }
    }

    static class f0 extends R implements InterfaceC0864t {
        f0() {
        }

        @Override // J2.g.N
        String o() {
            return "view";
        }
    }

    /* renamed from: J2.g$g, reason: collision with other inner class name */
    static class C0093g extends O {

        /* renamed from: a, reason: collision with root package name */
        private static C0093g f4612a = new C0093g();

        private C0093g() {
        }

        static C0093g a() {
            return f4612a;
        }
    }

    /* renamed from: J2.g$h, reason: case insensitive filesystem */
    static class C0852h extends C0857m implements InterfaceC0864t {
        C0852h() {
        }

        @Override // J2.g.C0857m, J2.g.N
        String o() {
            return "defs";
        }
    }

    /* renamed from: J2.g$i, reason: case insensitive filesystem */
    static class C0853i extends AbstractC0856l {

        /* renamed from: o, reason: collision with root package name */
        C0860p f4613o;

        /* renamed from: p, reason: collision with root package name */
        C0860p f4614p;

        /* renamed from: q, reason: collision with root package name */
        C0860p f4615q;

        /* renamed from: r, reason: collision with root package name */
        C0860p f4616r;

        C0853i() {
        }

        @Override // J2.g.N
        String o() {
            return "ellipse";
        }
    }

    /* renamed from: J2.g$j, reason: case insensitive filesystem */
    static abstract class AbstractC0854j extends L implements J {

        /* renamed from: h, reason: collision with root package name */
        List f4617h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        Boolean f4618i;

        /* renamed from: j, reason: collision with root package name */
        Matrix f4619j;

        /* renamed from: k, reason: collision with root package name */
        EnumC0855k f4620k;

        /* renamed from: l, reason: collision with root package name */
        String f4621l;

        AbstractC0854j() {
        }

        @Override // J2.g.J
        public List a() {
            return this.f4617h;
        }

        @Override // J2.g.J
        public void h(N n10) {
            if (n10 instanceof D) {
                this.f4617h.add(n10);
                return;
            }
            throw new j("Gradient elements cannot contain " + n10 + " elements.");
        }
    }

    /* renamed from: J2.g$k, reason: case insensitive filesystem */
    enum EnumC0855k {
        pad,
        reflect,
        repeat
    }

    /* renamed from: J2.g$l, reason: case insensitive filesystem */
    static abstract class AbstractC0856l extends I implements InterfaceC0858n {

        /* renamed from: n, reason: collision with root package name */
        Matrix f4622n;

        AbstractC0856l() {
        }

        @Override // J2.g.InterfaceC0858n
        public void k(Matrix matrix) {
            this.f4622n = matrix;
        }
    }

    /* renamed from: J2.g$m, reason: case insensitive filesystem */
    static class C0857m extends H implements InterfaceC0858n {

        /* renamed from: o, reason: collision with root package name */
        Matrix f4623o;

        C0857m() {
        }

        @Override // J2.g.InterfaceC0858n
        public void k(Matrix matrix) {
            this.f4623o = matrix;
        }

        @Override // J2.g.N
        String o() {
            return "group";
        }
    }

    /* renamed from: J2.g$n, reason: case insensitive filesystem */
    interface InterfaceC0858n {
        void k(Matrix matrix);
    }

    /* renamed from: J2.g$o, reason: case insensitive filesystem */
    static class C0859o extends P implements InterfaceC0858n {

        /* renamed from: p, reason: collision with root package name */
        String f4624p;

        /* renamed from: q, reason: collision with root package name */
        C0860p f4625q;

        /* renamed from: r, reason: collision with root package name */
        C0860p f4626r;

        /* renamed from: s, reason: collision with root package name */
        C0860p f4627s;

        /* renamed from: t, reason: collision with root package name */
        C0860p f4628t;

        /* renamed from: u, reason: collision with root package name */
        Matrix f4629u;

        C0859o() {
        }

        @Override // J2.g.InterfaceC0858n
        public void k(Matrix matrix) {
            this.f4629u = matrix;
        }

        @Override // J2.g.N
        String o() {
            return "image";
        }
    }

    /* renamed from: J2.g$q, reason: case insensitive filesystem */
    static class C0861q extends AbstractC0856l {

        /* renamed from: o, reason: collision with root package name */
        C0860p f4632o;

        /* renamed from: p, reason: collision with root package name */
        C0860p f4633p;

        /* renamed from: q, reason: collision with root package name */
        C0860p f4634q;

        /* renamed from: r, reason: collision with root package name */
        C0860p f4635r;

        C0861q() {
        }

        @Override // J2.g.N
        String o() {
            return "line";
        }
    }

    /* renamed from: J2.g$r, reason: case insensitive filesystem */
    static class C0862r extends R implements InterfaceC0864t {

        /* renamed from: q, reason: collision with root package name */
        boolean f4636q;

        /* renamed from: r, reason: collision with root package name */
        C0860p f4637r;

        /* renamed from: s, reason: collision with root package name */
        C0860p f4638s;

        /* renamed from: t, reason: collision with root package name */
        C0860p f4639t;

        /* renamed from: u, reason: collision with root package name */
        C0860p f4640u;

        /* renamed from: v, reason: collision with root package name */
        Float f4641v;

        C0862r() {
        }

        @Override // J2.g.N
        String o() {
            return "marker";
        }
    }

    /* renamed from: J2.g$s, reason: case insensitive filesystem */
    static class C0863s extends H implements InterfaceC0864t {

        /* renamed from: o, reason: collision with root package name */
        Boolean f4642o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f4643p;

        /* renamed from: q, reason: collision with root package name */
        C0860p f4644q;

        /* renamed from: r, reason: collision with root package name */
        C0860p f4645r;

        /* renamed from: s, reason: collision with root package name */
        C0860p f4646s;

        /* renamed from: t, reason: collision with root package name */
        C0860p f4647t;

        C0863s() {
        }

        @Override // J2.g.N
        String o() {
            return "mask";
        }
    }

    /* renamed from: J2.g$t, reason: case insensitive filesystem */
    interface InterfaceC0864t {
    }

    /* renamed from: J2.g$u, reason: case insensitive filesystem */
    static class C0865u extends O {

        /* renamed from: a, reason: collision with root package name */
        String f4648a;

        /* renamed from: b, reason: collision with root package name */
        O f4649b;

        C0865u(String str, O o10) {
            this.f4648a = str;
            this.f4649b = o10;
        }

        public String toString() {
            return this.f4648a + " " + this.f4649b;
        }
    }

    /* renamed from: J2.g$v, reason: case insensitive filesystem */
    static class C0866v extends AbstractC0856l {

        /* renamed from: o, reason: collision with root package name */
        C0867w f4650o;

        /* renamed from: p, reason: collision with root package name */
        Float f4651p;

        C0866v() {
        }

        @Override // J2.g.N
        String o() {
            return "path";
        }
    }

    /* renamed from: J2.g$w, reason: case insensitive filesystem */
    static class C0867w implements InterfaceC0868x {

        /* renamed from: b, reason: collision with root package name */
        private int f4653b = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f4655d = 0;

        /* renamed from: a, reason: collision with root package name */
        private byte[] f4652a = new byte[8];

        /* renamed from: c, reason: collision with root package name */
        private float[] f4654c = new float[16];

        C0867w() {
        }

        private void f(byte b10) {
            int i10 = this.f4653b;
            byte[] bArr = this.f4652a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f4652a = bArr2;
            }
            byte[] bArr3 = this.f4652a;
            int i11 = this.f4653b;
            this.f4653b = i11 + 1;
            bArr3[i11] = b10;
        }

        private void g(int i10) {
            float[] fArr = this.f4654c;
            if (fArr.length < this.f4655d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f4654c = fArr2;
            }
        }

        @Override // J2.g.InterfaceC0868x
        public void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f4654c;
            int i10 = this.f4655d;
            int i11 = i10 + 1;
            this.f4655d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f4655d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f4655d = i13;
            fArr[i12] = f12;
            this.f4655d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // J2.g.InterfaceC0868x
        public void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f4654c;
            int i10 = this.f4655d;
            int i11 = i10 + 1;
            this.f4655d = i11;
            fArr[i10] = f10;
            this.f4655d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // J2.g.InterfaceC0868x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f4654c;
            int i10 = this.f4655d;
            int i11 = i10 + 1;
            this.f4655d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f4655d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f4655d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f4655d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f4655d = i15;
            fArr[i14] = f14;
            this.f4655d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // J2.g.InterfaceC0868x
        public void close() {
            f((byte) 8);
        }

        @Override // J2.g.InterfaceC0868x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f4654c;
            int i10 = this.f4655d;
            int i11 = i10 + 1;
            this.f4655d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f4655d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f4655d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f4655d = i14;
            fArr[i13] = f13;
            this.f4655d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // J2.g.InterfaceC0868x
        public void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f4654c;
            int i10 = this.f4655d;
            int i11 = i10 + 1;
            this.f4655d = i11;
            fArr[i10] = f10;
            this.f4655d = i10 + 2;
            fArr[i11] = f11;
        }

        void h(InterfaceC0868x interfaceC0868x) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f4653b; i11++) {
                byte b10 = this.f4652a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f4654c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    interfaceC0868x.b(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f4654c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    interfaceC0868x.e(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f4654c;
                    float f12 = fArr3[i10];
                    float f13 = fArr3[i10 + 1];
                    float f14 = fArr3[i10 + 2];
                    float f15 = fArr3[i10 + 3];
                    int i14 = i10 + 5;
                    float f16 = fArr3[i10 + 4];
                    i10 += 6;
                    interfaceC0868x.c(f12, f13, f14, f15, f16, fArr3[i14]);
                } else if (b10 == 3) {
                    float[] fArr4 = this.f4654c;
                    float f17 = fArr4[i10];
                    float f18 = fArr4[i10 + 1];
                    int i15 = i10 + 3;
                    float f19 = fArr4[i10 + 2];
                    i10 += 4;
                    interfaceC0868x.a(f17, f18, f19, fArr4[i15]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f4654c;
                    float f20 = fArr5[i10];
                    float f21 = fArr5[i10 + 1];
                    float f22 = fArr5[i10 + 2];
                    int i16 = i10 + 4;
                    float f23 = fArr5[i10 + 3];
                    i10 += 5;
                    interfaceC0868x.d(f20, f21, f22, z10, z11, f23, fArr5[i16]);
                } else {
                    interfaceC0868x.close();
                }
            }
        }

        boolean i() {
            return this.f4653b == 0;
        }
    }

    /* renamed from: J2.g$x, reason: case insensitive filesystem */
    interface InterfaceC0868x {
        void a(float f10, float f11, float f12, float f13);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void e(float f10, float f11);
    }

    /* renamed from: J2.g$y, reason: case insensitive filesystem */
    static class C0869y extends R implements InterfaceC0864t {

        /* renamed from: q, reason: collision with root package name */
        Boolean f4656q;

        /* renamed from: r, reason: collision with root package name */
        Boolean f4657r;

        /* renamed from: s, reason: collision with root package name */
        Matrix f4658s;

        /* renamed from: t, reason: collision with root package name */
        C0860p f4659t;

        /* renamed from: u, reason: collision with root package name */
        C0860p f4660u;

        /* renamed from: v, reason: collision with root package name */
        C0860p f4661v;

        /* renamed from: w, reason: collision with root package name */
        C0860p f4662w;

        /* renamed from: x, reason: collision with root package name */
        String f4663x;

        C0869y() {
        }

        @Override // J2.g.N
        String o() {
            return "pattern";
        }
    }

    /* renamed from: J2.g$z, reason: case insensitive filesystem */
    static class C0870z extends AbstractC0856l {

        /* renamed from: o, reason: collision with root package name */
        float[] f4664o;

        C0870z() {
        }

        @Override // J2.g.N
        String o() {
            return "polyline";
        }
    }

    g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", BuildConfig.FLAVOR).replace("\\A", "\n");
    }

    private C0847b e(float f10) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float f11;
        d0 d0Var5;
        F f12 = this.f4490a;
        C0860p c0860p = f12.f4544s;
        C0860p c0860p2 = f12.f4545t;
        if (c0860p == null || c0860p.m() || (d0Var = c0860p.f4631b) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C0847b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float b10 = c0860p.b(f10);
        if (c0860p2 == null) {
            C0847b c0847b = this.f4490a.f4576p;
            f11 = c0847b != null ? (c0847b.f4592d * b10) / c0847b.f4591c : b10;
        } else {
            if (c0860p2.m() || (d0Var5 = c0860p2.f4631b) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C0847b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f11 = c0860p2.b(f10);
        }
        return new C0847b(0.0f, 0.0f, b10, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L i(J j10, String str) {
        L i10;
        L l10 = (L) j10;
        if (str.equals(l10.f4559c)) {
            return l10;
        }
        for (Object obj : j10.a()) {
            if (obj instanceof L) {
                L l11 = (L) obj;
                if (str.equals(l11.f4559c)) {
                    return l11;
                }
                if ((obj instanceof J) && (i10 = i((J) obj, str)) != null) {
                    return i10;
                }
            }
        }
        return null;
    }

    static i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new k().z(inputStream, f4489g);
    }

    void a(b.r rVar) {
        this.f4494e.b(rVar);
    }

    void b() {
        this.f4494e.e(b.u.RenderOptions);
    }

    List d() {
        return this.f4494e.c();
    }

    public float f() {
        if (this.f4490a != null) {
            return e(this.f4493d).f4592d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f10 = this.f4490a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C0847b c0847b = f10.f4576p;
        if (c0847b == null) {
            return null;
        }
        return c0847b.d();
    }

    public float h() {
        if (this.f4490a != null) {
            return e(this.f4493d).f4591c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f4490a.f4559c)) {
            return this.f4490a;
        }
        if (this.f4495f.containsKey(str)) {
            return (L) this.f4495f.get(str);
        }
        L i10 = i(this.f4490a, str);
        this.f4495f.put(str, i10);
        return i10;
    }

    F m() {
        return this.f4490a;
    }

    boolean n() {
        return !this.f4494e.d();
    }

    public Picture o() {
        return q(null);
    }

    public Picture p(int i10, int i11, f fVar) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i10, i11);
        if (fVar == null || fVar.f4488f == null) {
            fVar = fVar == null ? new f() : new f(fVar);
            fVar.g(0.0f, 0.0f, i10, i11);
        }
        new h(beginRecording, this.f4493d).G0(this, fVar);
        picture.endRecording();
        return picture;
    }

    public Picture q(f fVar) {
        C0860p c0860p;
        C0847b c0847b = (fVar == null || !fVar.e()) ? this.f4490a.f4576p : fVar.f4486d;
        if (fVar != null && fVar.f()) {
            return p((int) Math.ceil(fVar.f4488f.b()), (int) Math.ceil(fVar.f4488f.c()), fVar);
        }
        F f10 = this.f4490a;
        C0860p c0860p2 = f10.f4544s;
        if (c0860p2 != null) {
            d0 d0Var = c0860p2.f4631b;
            d0 d0Var2 = d0.percent;
            if (d0Var != d0Var2 && (c0860p = f10.f4545t) != null && c0860p.f4631b != d0Var2) {
                return p((int) Math.ceil(c0860p2.b(this.f4493d)), (int) Math.ceil(this.f4490a.f4545t.b(this.f4493d)), fVar);
            }
        }
        if (c0860p2 != null && c0847b != null) {
            return p((int) Math.ceil(c0860p2.b(this.f4493d)), (int) Math.ceil((c0847b.f4592d * r1) / c0847b.f4591c), fVar);
        }
        C0860p c0860p3 = f10.f4545t;
        if (c0860p3 == null || c0847b == null) {
            return p(512, 512, fVar);
        }
        return p((int) Math.ceil((c0847b.f4591c * r1) / c0847b.f4592d), (int) Math.ceil(c0860p3.b(this.f4493d)), fVar);
    }

    N r(String str) {
        if (str == null) {
            return null;
        }
        String c10 = c(str);
        if (c10.length() <= 1 || !c10.startsWith("#")) {
            return null;
        }
        return j(c10.substring(1));
    }

    void s(String str) {
        this.f4492c = str;
    }

    public void t(float f10) {
        F f11 = this.f4490a;
        if (f11 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f11.f4545t = new C0860p(f10);
    }

    public void u(float f10, float f11, float f12, float f13) {
        F f14 = this.f4490a;
        if (f14 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f14.f4576p = new C0847b(f10, f11, f12, f13);
    }

    public void v(float f10) {
        F f11 = this.f4490a;
        if (f11 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f11.f4544s = new C0860p(f10);
    }

    void w(F f10) {
        this.f4490a = f10;
    }

    void x(String str) {
        this.f4491b = str;
    }

    /* renamed from: J2.g$p, reason: case insensitive filesystem */
    static class C0860p implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        float f4630a;

        /* renamed from: b, reason: collision with root package name */
        d0 f4631b;

        C0860p(float f10, d0 d0Var) {
            this.f4630a = f10;
            this.f4631b = d0Var;
        }

        float a() {
            return this.f4630a;
        }

        float b(float f10) {
            int i10 = C0846a.f4584a[this.f4631b.ordinal()];
            if (i10 == 1) {
                return this.f4630a;
            }
            switch (i10) {
                case 4:
                    return this.f4630a * f10;
                case 5:
                    return (this.f4630a * f10) / 2.54f;
                case 6:
                    return (this.f4630a * f10) / 25.4f;
                case 7:
                    return (this.f4630a * f10) / 72.0f;
                case 8:
                    return (this.f4630a * f10) / 6.0f;
                default:
                    return this.f4630a;
            }
        }

        float d(h hVar) {
            if (this.f4631b != d0.percent) {
                return i(hVar);
            }
            C0847b S10 = hVar.S();
            if (S10 == null) {
                return this.f4630a;
            }
            float f10 = S10.f4591c;
            if (f10 == S10.f4592d) {
                return (this.f4630a * f10) / 100.0f;
            }
            return (this.f4630a * ((float) (Math.sqrt((f10 * f10) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        float h(h hVar, float f10) {
            return this.f4631b == d0.percent ? (this.f4630a * f10) / 100.0f : i(hVar);
        }

        float i(h hVar) {
            switch (C0846a.f4584a[this.f4631b.ordinal()]) {
                case 9:
                    C0847b S10 = hVar.S();
                    if (S10 != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.f4630a;
        }

        float k(h hVar) {
            if (this.f4631b != d0.percent) {
                return i(hVar);
            }
            C0847b S10 = hVar.S();
            return S10 == null ? this.f4630a : (this.f4630a * S10.f4592d) / 100.0f;
        }

        boolean l() {
            return this.f4630a < 0.0f;
        }

        boolean m() {
            return this.f4630a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f4630a) + this.f4631b;
        }

        C0860p(float f10) {
            this.f4630a = f10;
            this.f4631b = d0.px;
        }
    }

    /* renamed from: J2.g$b, reason: case insensitive filesystem */
    static class C0847b {

        /* renamed from: a, reason: collision with root package name */
        float f4589a;

        /* renamed from: b, reason: collision with root package name */
        float f4590b;

        /* renamed from: c, reason: collision with root package name */
        float f4591c;

        /* renamed from: d, reason: collision with root package name */
        float f4592d;

        C0847b(float f10, float f11, float f12, float f13) {
            this.f4589a = f10;
            this.f4590b = f11;
            this.f4591c = f12;
            this.f4592d = f13;
        }

        static C0847b a(float f10, float f11, float f12, float f13) {
            return new C0847b(f10, f11, f12 - f10, f13 - f11);
        }

        float b() {
            return this.f4589a + this.f4591c;
        }

        float c() {
            return this.f4590b + this.f4592d;
        }

        RectF d() {
            return new RectF(this.f4589a, this.f4590b, b(), c());
        }

        void e(C0847b c0847b) {
            float f10 = c0847b.f4589a;
            if (f10 < this.f4589a) {
                this.f4589a = f10;
            }
            float f11 = c0847b.f4590b;
            if (f11 < this.f4590b) {
                this.f4590b = f11;
            }
            if (c0847b.b() > b()) {
                this.f4591c = c0847b.b() - this.f4589a;
            }
            if (c0847b.c() > c()) {
                this.f4592d = c0847b.c() - this.f4590b;
            }
        }

        public String toString() {
            return "[" + this.f4589a + " " + this.f4590b + " " + this.f4591c + " " + this.f4592d + "]";
        }

        C0847b(C0847b c0847b) {
            this.f4589a = c0847b.f4589a;
            this.f4590b = c0847b.f4590b;
            this.f4591c = c0847b.f4591c;
            this.f4592d = c0847b.f4592d;
        }
    }

    static class C extends L implements J {
        C() {
        }

        @Override // J2.g.J
        public List a() {
            return Collections.emptyList();
        }

        @Override // J2.g.N
        String o() {
            return "solidColor";
        }

        @Override // J2.g.J
        public void h(N n10) {
        }
    }

    static class D extends L implements J {

        /* renamed from: h, reason: collision with root package name */
        Float f4502h;

        D() {
        }

        @Override // J2.g.J
        public List a() {
            return Collections.emptyList();
        }

        @Override // J2.g.N
        String o() {
            return "stop";
        }

        @Override // J2.g.J
        public void h(N n10) {
        }
    }
}
