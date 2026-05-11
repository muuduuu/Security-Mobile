package P8;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class n {
    public static com.google.gson.h a(S8.a aVar) {
        boolean z10;
        try {
            try {
                aVar.N();
                z10 = false;
                try {
                    return (com.google.gson.h) com.google.gson.internal.bind.l.f28596V.b(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return com.google.gson.j.f28655a;
                    }
                    throw new com.google.gson.o(e);
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
        } catch (S8.d e12) {
            throw new com.google.gson.o(e12);
        } catch (IOException e13) {
            throw new com.google.gson.i(e13);
        } catch (NumberFormatException e14) {
            throw new com.google.gson.o(e14);
        }
    }

    public static void b(com.google.gson.h hVar, S8.c cVar) {
        com.google.gson.internal.bind.l.f28596V.d(cVar, hVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    private static final class b extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f7620a;

        /* renamed from: b, reason: collision with root package name */
        private final a f7621b = new a();

        private static class a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            private char[] f7622a;

            /* renamed from: b, reason: collision with root package name */
            private String f7623b;

            private a() {
            }

            void a(char[] cArr) {
                this.f7622a = cArr;
                this.f7623b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f7622a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f7622a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f7622a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f7623b == null) {
                    this.f7623b = new String(this.f7622a);
                }
                return this.f7623b;
            }
        }

        b(Appendable appendable) {
            this.f7620a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            this.f7621b.a(cArr);
            this.f7620a.append(this.f7621b, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            this.f7620a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f7620a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) {
            this.f7620a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            Objects.requireNonNull(str);
            this.f7620a.append(str, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
