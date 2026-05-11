package y5;

import com.fasterxml.jackson.core.n;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class h implements n, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final d f45349c = d.e();

    /* renamed from: a, reason: collision with root package name */
    protected final String f45350a;

    /* renamed from: b, reason: collision with root package name */
    protected char[] f45351b;

    public h(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f45350a = str;
    }

    @Override // com.fasterxml.jackson.core.n
    public final char[] a() {
        char[] cArr = this.f45351b;
        if (cArr != null) {
            return cArr;
        }
        char[] f10 = f45349c.f(this.f45350a);
        this.f45351b = f10;
        return f10;
    }

    @Override // com.fasterxml.jackson.core.n
    public int b(char[] cArr, int i10) {
        String str = this.f45350a;
        int length = str.length();
        if (i10 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i10);
        return length;
    }

    @Override // com.fasterxml.jackson.core.n
    public int c(char[] cArr, int i10) {
        char[] cArr2 = this.f45351b;
        if (cArr2 == null) {
            cArr2 = f45349c.f(this.f45350a);
            this.f45351b = cArr2;
        }
        int length = cArr2.length;
        if (i10 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i10, length);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f45350a.equals(((h) obj).f45350a);
    }

    @Override // com.fasterxml.jackson.core.n
    public final String getValue() {
        return this.f45350a;
    }

    public final int hashCode() {
        return this.f45350a.hashCode();
    }

    public final String toString() {
        return this.f45350a;
    }
}
