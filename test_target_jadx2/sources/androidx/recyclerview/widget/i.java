package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    final a f17730a;

    interface a {
        void a(a.b bVar);

        a.b b(int i10, int i11, int i12, Object obj);
    }

    i(a aVar) {
        this.f17730a = aVar;
    }

    private int a(List list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f17598a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        int i12 = bVar.f17601d;
        int i13 = bVar2.f17599b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f17599b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f17599b = i15 + bVar2.f17601d;
        }
        int i16 = bVar2.f17599b;
        if (i16 <= i12) {
            bVar.f17601d = i12 + bVar2.f17601d;
        }
        bVar2.f17599b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List list, int i10, int i11) {
        a.b bVar = (a.b) list.get(i10);
        a.b bVar2 = (a.b) list.get(i11);
        int i12 = bVar2.f17598a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            f(list, i10, bVar, i11, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int a10 = a(list);
            if (a10 == -1) {
                return;
            } else {
                d(list, a10, a10 + 1);
            }
        }
    }

    void e(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        boolean z10;
        int i12 = bVar.f17599b;
        int i13 = bVar.f17601d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f17599b == i12 && bVar2.f17601d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f17599b == i13 + 1 && bVar2.f17601d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f17599b;
        if (i13 < i14) {
            bVar2.f17599b = i14 - 1;
        } else {
            int i15 = bVar2.f17601d;
            if (i13 < i14 + i15) {
                bVar2.f17601d = i15 - 1;
                bVar.f17598a = 2;
                bVar.f17601d = 1;
                if (bVar2.f17601d == 0) {
                    list.remove(i11);
                    this.f17730a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f17599b;
        int i17 = bVar2.f17599b;
        a.b bVar3 = null;
        if (i16 <= i17) {
            bVar2.f17599b = i17 + 1;
        } else {
            int i18 = bVar2.f17601d;
            if (i16 < i17 + i18) {
                bVar3 = this.f17730a.b(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f17601d = bVar.f17599b - bVar2.f17599b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f17730a.a(bVar);
            return;
        }
        if (z10) {
            if (bVar3 != null) {
                int i19 = bVar.f17599b;
                if (i19 > bVar3.f17599b) {
                    bVar.f17599b = i19 - bVar3.f17601d;
                }
                int i20 = bVar.f17601d;
                if (i20 > bVar3.f17599b) {
                    bVar.f17601d = i20 - bVar3.f17601d;
                }
            }
            int i21 = bVar.f17599b;
            if (i21 > bVar2.f17599b) {
                bVar.f17599b = i21 - bVar2.f17601d;
            }
            int i22 = bVar.f17601d;
            if (i22 > bVar2.f17599b) {
                bVar.f17601d = i22 - bVar2.f17601d;
            }
        } else {
            if (bVar3 != null) {
                int i23 = bVar.f17599b;
                if (i23 >= bVar3.f17599b) {
                    bVar.f17599b = i23 - bVar3.f17601d;
                }
                int i24 = bVar.f17601d;
                if (i24 >= bVar3.f17599b) {
                    bVar.f17601d = i24 - bVar3.f17601d;
                }
            }
            int i25 = bVar.f17599b;
            if (i25 >= bVar2.f17599b) {
                bVar.f17599b = i25 - bVar2.f17601d;
            }
            int i26 = bVar.f17601d;
            if (i26 >= bVar2.f17599b) {
                bVar.f17601d = i26 - bVar2.f17601d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f17599b != bVar.f17601d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVar3 != null) {
            list.add(i10, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void f(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        a.b b10;
        int i12;
        int i13;
        int i14 = bVar.f17601d;
        int i15 = bVar2.f17599b;
        a.b bVar3 = null;
        if (i14 < i15) {
            bVar2.f17599b = i15 - 1;
        } else {
            int i16 = bVar2.f17601d;
            if (i14 < i15 + i16) {
                bVar2.f17601d = i16 - 1;
                b10 = this.f17730a.b(4, bVar.f17599b, 1, bVar2.f17600c);
                i12 = bVar.f17599b;
                i13 = bVar2.f17599b;
                if (i12 > i13) {
                    bVar2.f17599b = i13 + 1;
                } else {
                    int i17 = bVar2.f17601d;
                    if (i12 < i13 + i17) {
                        int i18 = (i13 + i17) - i12;
                        bVar3 = this.f17730a.b(4, i12 + 1, i18, bVar2.f17600c);
                        bVar2.f17601d -= i18;
                    }
                }
                list.set(i11, bVar);
                if (bVar2.f17601d <= 0) {
                    list.set(i10, bVar2);
                } else {
                    list.remove(i10);
                    this.f17730a.a(bVar2);
                }
                if (b10 != null) {
                    list.add(i10, b10);
                }
                if (bVar3 == null) {
                    list.add(i10, bVar3);
                    return;
                }
                return;
            }
        }
        b10 = null;
        i12 = bVar.f17599b;
        i13 = bVar2.f17599b;
        if (i12 > i13) {
        }
        list.set(i11, bVar);
        if (bVar2.f17601d <= 0) {
        }
        if (b10 != null) {
        }
        if (bVar3 == null) {
        }
    }
}
