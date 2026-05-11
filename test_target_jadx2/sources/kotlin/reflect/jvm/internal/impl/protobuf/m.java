package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class m extends AbstractList implements RandomAccess, n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f36528b = new m().K();

    /* renamed from: a, reason: collision with root package name */
    private final List f36529a;

    public m() {
        this.f36529a = new ArrayList();
    }

    private static d e(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.m((String) obj) : d.j((byte[]) obj);
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).I() : j.b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public n K() {
        return new w(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void U1(d dVar) {
        this.f36529a.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f36529a.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f36529a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f36529a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String I10 = dVar.I();
            if (dVar.w()) {
                this.f36529a.set(i10, I10);
            }
            return I10;
        }
        byte[] bArr = (byte[]) obj;
        String b10 = j.b(bArr);
        if (j.a(bArr)) {
            this.f36529a.set(i10, b10);
        }
        return b10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object remove = this.f36529a.remove(i10);
        ((AbstractList) this).modCount++;
        return h(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return h(this.f36529a.set(i10, str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public List o() {
        return Collections.unmodifiableList(this.f36529a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36529a.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public d y1(int i10) {
        Object obj = this.f36529a.get(i10);
        d e10 = e(obj);
        if (e10 != obj) {
            this.f36529a.set(i10, e10);
        }
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof n) {
            collection = ((n) collection).o();
        }
        boolean addAll = this.f36529a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public m(n nVar) {
        this.f36529a = new ArrayList(nVar.size());
        addAll(nVar);
    }
}
