package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class M extends AbstractC2391x {
    protected M() {
        this.f24681a.add(N.ASSIGN);
        this.f24681a.add(N.CONST);
        this.f24681a.add(N.CREATE_ARRAY);
        this.f24681a.add(N.CREATE_OBJECT);
        this.f24681a.add(N.EXPRESSION_LIST);
        this.f24681a.add(N.GET);
        this.f24681a.add(N.GET_INDEX);
        this.f24681a.add(N.GET_PROPERTY);
        this.f24681a.add(N.NULL);
        this.f24681a.add(N.SET_PROPERTY);
        this.f24681a.add(N.TYPEOF);
        this.f24681a.add(N.UNDEFINED);
        this.f24681a.add(N.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2391x
    public final InterfaceC2329q a(String str, Y1 y12, List list) {
        InterfaceC2329q a10;
        InterfaceC2329q a11;
        String str2;
        N n10 = N.ADD;
        int ordinal = AbstractC2412z2.e(str).ordinal();
        int i10 = 0;
        if (ordinal != 3) {
            if (ordinal == 14) {
                AbstractC2412z2.b(N.CONST.name(), 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                while (i10 < list.size() - 1) {
                    InterfaceC2329q a12 = y12.a((InterfaceC2329q) list.get(i10));
                    if (!(a12 instanceof C2364u)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", a12.getClass().getCanonicalName()));
                    }
                    y12.g(a12.a(), y12.a((InterfaceC2329q) list.get(i10 + 1)));
                    i10 += 2;
                }
                return InterfaceC2329q.f24620U;
            }
            if (ordinal == 24) {
                AbstractC2412z2.b(N.EXPRESSION_LIST.name(), 1, list);
                InterfaceC2329q interfaceC2329q = InterfaceC2329q.f24620U;
                while (i10 < list.size()) {
                    interfaceC2329q = y12.a((InterfaceC2329q) list.get(i10));
                    if (interfaceC2329q instanceof C2248h) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i10++;
                }
                return interfaceC2329q;
            }
            if (ordinal == 33) {
                AbstractC2412z2.a(N.GET.name(), 1, list);
                InterfaceC2329q a13 = y12.a((InterfaceC2329q) list.get(0));
                if (a13 instanceof C2364u) {
                    return y12.h(a13.a());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", a13.getClass().getCanonicalName()));
            }
            if (ordinal == 49) {
                AbstractC2412z2.a(N.NULL.name(), 0, list);
                return InterfaceC2329q.f24621V;
            }
            if (ordinal == 58) {
                AbstractC2412z2.a(N.SET_PROPERTY.name(), 3, list);
                InterfaceC2329q a14 = y12.a((InterfaceC2329q) list.get(0));
                InterfaceC2329q a15 = y12.a((InterfaceC2329q) list.get(1));
                a11 = y12.a((InterfaceC2329q) list.get(2));
                if (a14 == InterfaceC2329q.f24620U || a14 == InterfaceC2329q.f24621V) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", a15.a(), a14.a()));
                }
                if ((a14 instanceof C2230f) && (a15 instanceof C2266j)) {
                    ((C2230f) a14).D(a15.f().intValue(), a11);
                } else if (a14 instanceof InterfaceC2293m) {
                    ((InterfaceC2293m) a14).k(a15.a(), a11);
                    return a11;
                }
            } else {
                if (ordinal == 17) {
                    if (list.isEmpty()) {
                        return new C2230f();
                    }
                    C2230f c2230f = new C2230f();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2329q a16 = y12.a((InterfaceC2329q) it.next());
                        if (a16 instanceof C2248h) {
                            throw new IllegalStateException("Failed to evaluate array element");
                        }
                        c2230f.D(i10, a16);
                        i10++;
                    }
                    return c2230f;
                }
                if (ordinal == 18) {
                    if (list.isEmpty()) {
                        return new C2302n();
                    }
                    if (list.size() % 2 != 0) {
                        throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                    }
                    C2302n c2302n = new C2302n();
                    while (i10 < list.size() - 1) {
                        InterfaceC2329q a17 = y12.a((InterfaceC2329q) list.get(i10));
                        InterfaceC2329q a18 = y12.a((InterfaceC2329q) list.get(i10 + 1));
                        if ((a17 instanceof C2248h) || (a18 instanceof C2248h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        c2302n.k(a17.a(), a18);
                        i10 += 2;
                    }
                    return c2302n;
                }
                if (ordinal == 35 || ordinal == 36) {
                    AbstractC2412z2.a(N.GET_PROPERTY.name(), 2, list);
                    InterfaceC2329q a19 = y12.a((InterfaceC2329q) list.get(0));
                    InterfaceC2329q a20 = y12.a((InterfaceC2329q) list.get(1));
                    if ((a19 instanceof C2230f) && AbstractC2412z2.d(a20)) {
                        return ((C2230f) a19).B(a20.f().intValue());
                    }
                    if (a19 instanceof InterfaceC2293m) {
                        return ((InterfaceC2293m) a19).e(a20.a());
                    }
                    if (a19 instanceof C2364u) {
                        if ("length".equals(a20.a())) {
                            a11 = new C2266j(Double.valueOf(a19.a().length()));
                        } else if (AbstractC2412z2.d(a20) && a20.f().doubleValue() < a19.a().length()) {
                            a10 = new C2364u(String.valueOf(a19.a().charAt(a20.f().intValue())));
                        }
                    }
                    return InterfaceC2329q.f24620U;
                }
                switch (ordinal) {
                    case 62:
                        AbstractC2412z2.a(N.TYPEOF.name(), 1, list);
                        InterfaceC2329q a21 = y12.a((InterfaceC2329q) list.get(0));
                        if (a21 instanceof C2373v) {
                            str2 = "undefined";
                        } else if (a21 instanceof C2239g) {
                            str2 = "boolean";
                        } else if (a21 instanceof C2266j) {
                            str2 = "number";
                        } else if (a21 instanceof C2364u) {
                            str2 = "string";
                        } else if (a21 instanceof C2320p) {
                            str2 = "function";
                        } else {
                            if ((a21 instanceof r) || (a21 instanceof C2248h)) {
                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", a21));
                            }
                            str2 = "object";
                        }
                        a11 = new C2364u(str2);
                        break;
                    case 63:
                        AbstractC2412z2.a(N.UNDEFINED.name(), 0, list);
                        return InterfaceC2329q.f24620U;
                    case 64:
                        AbstractC2412z2.b(N.VAR.name(), 1, list);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            InterfaceC2329q a22 = y12.a((InterfaceC2329q) it2.next());
                            if (!(a22 instanceof C2364u)) {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", a22.getClass().getCanonicalName()));
                            }
                            y12.f(a22.a(), InterfaceC2329q.f24620U);
                        }
                        return InterfaceC2329q.f24620U;
                    default:
                        return super.b(str);
                }
            }
            return a11;
        }
        AbstractC2412z2.a(N.ASSIGN.name(), 2, list);
        InterfaceC2329q a23 = y12.a((InterfaceC2329q) list.get(0));
        if (!(a23 instanceof C2364u)) {
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", a23.getClass().getCanonicalName()));
        }
        if (!y12.d(a23.a())) {
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", a23.a()));
        }
        a10 = y12.a((InterfaceC2329q) list.get(1));
        y12.e(a23.a(), a10);
        return a10;
    }
}
