package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    final j0.i f17754a = new j0.i();

    /* renamed from: b, reason: collision with root package name */
    final j0.f f17755b = new j0.f();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static y0.d f17756d = new Pools$SimplePool(20);

        /* renamed from: a, reason: collision with root package name */
        int f17757a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.m.b f17758b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.m.b f17759c;

        private a() {
        }

        static void a() {
            while (f17756d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f17756d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f17757a = 0;
            aVar.f17758b = null;
            aVar.f17759c = null;
            f17756d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.F f10);

        void b(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void c(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void d(RecyclerView.F f10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);
    }

    q() {
    }

    private RecyclerView.m.b l(RecyclerView.F f10, int i10) {
        a aVar;
        RecyclerView.m.b bVar;
        int d10 = this.f17754a.d(f10);
        if (d10 >= 0 && (aVar = (a) this.f17754a.j(d10)) != null) {
            int i11 = aVar.f17757a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f17757a = i12;
                if (i10 == 4) {
                    bVar = aVar.f17758b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f17759c;
                }
                if ((i12 & 12) == 0) {
                    this.f17754a.h(d10);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.F f10, RecyclerView.m.b bVar) {
        a aVar = (a) this.f17754a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f17754a.put(f10, aVar);
        }
        aVar.f17757a |= 2;
        aVar.f17758b = bVar;
    }

    void b(RecyclerView.F f10) {
        a aVar = (a) this.f17754a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f17754a.put(f10, aVar);
        }
        aVar.f17757a |= 1;
    }

    void c(long j10, RecyclerView.F f10) {
        this.f17755b.l(j10, f10);
    }

    void d(RecyclerView.F f10, RecyclerView.m.b bVar) {
        a aVar = (a) this.f17754a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f17754a.put(f10, aVar);
        }
        aVar.f17759c = bVar;
        aVar.f17757a |= 8;
    }

    void e(RecyclerView.F f10, RecyclerView.m.b bVar) {
        a aVar = (a) this.f17754a.get(f10);
        if (aVar == null) {
            aVar = a.b();
            this.f17754a.put(f10, aVar);
        }
        aVar.f17758b = bVar;
        aVar.f17757a |= 4;
    }

    void f() {
        this.f17754a.clear();
        this.f17755b.a();
    }

    RecyclerView.F g(long j10) {
        return (RecyclerView.F) this.f17755b.h(j10);
    }

    boolean h(RecyclerView.F f10) {
        a aVar = (a) this.f17754a.get(f10);
        return (aVar == null || (aVar.f17757a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.F f10) {
        a aVar = (a) this.f17754a.get(f10);
        return (aVar == null || (aVar.f17757a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.F f10) {
        p(f10);
    }

    RecyclerView.m.b m(RecyclerView.F f10) {
        return l(f10, 8);
    }

    RecyclerView.m.b n(RecyclerView.F f10) {
        return l(f10, 4);
    }

    void o(b bVar) {
        for (int size = this.f17754a.size() - 1; size >= 0; size--) {
            RecyclerView.F f10 = (RecyclerView.F) this.f17754a.f(size);
            a aVar = (a) this.f17754a.h(size);
            int i10 = aVar.f17757a;
            if ((i10 & 3) == 3) {
                bVar.a(f10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.b bVar2 = aVar.f17758b;
                if (bVar2 == null) {
                    bVar.a(f10);
                } else {
                    bVar.c(f10, bVar2, aVar.f17759c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.b(f10, aVar.f17758b, aVar.f17759c);
            } else if ((i10 & 12) == 12) {
                bVar.d(f10, aVar.f17758b, aVar.f17759c);
            } else if ((i10 & 4) != 0) {
                bVar.c(f10, aVar.f17758b, null);
            } else if ((i10 & 8) != 0) {
                bVar.b(f10, aVar.f17758b, aVar.f17759c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.F f10) {
        a aVar = (a) this.f17754a.get(f10);
        if (aVar == null) {
            return;
        }
        aVar.f17757a &= -2;
    }

    void q(RecyclerView.F f10) {
        int o10 = this.f17755b.o() - 1;
        while (true) {
            if (o10 < 0) {
                break;
            }
            if (f10 == this.f17755b.p(o10)) {
                this.f17755b.n(o10);
                break;
            }
            o10--;
        }
        a aVar = (a) this.f17754a.remove(f10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
