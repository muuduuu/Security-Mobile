package S0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f8675a;

    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f8676a;

        /* renamed from: b, reason: collision with root package name */
        private final d f8677b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8678c = true;

        a(TextView textView) {
            this.f8676a = textView;
            this.f8677b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f8677b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f8677b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray g10 = g(inputFilterArr);
            if (g10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g10.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (g10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f8676a.setFilters(a(this.f8676a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new h(transformationMethod);
        }

        @Override // S0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f8678c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // S0.f.b
        public boolean b() {
            return this.f8678c;
        }

        @Override // S0.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // S0.f.b
        void d(boolean z10) {
            this.f8678c = z10;
            l();
            k();
        }

        @Override // S0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f8678c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f8678c = z10;
        }

        void l() {
            this.f8676a.setTransformationMethod(e(this.f8676a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z10);

        abstract void d(boolean z10);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f8679a;

        c(TextView textView) {
            this.f8679a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.i();
        }

        @Override // S0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f8679a.a(inputFilterArr);
        }

        @Override // S0.f.b
        public boolean b() {
            return this.f8679a.b();
        }

        @Override // S0.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f8679a.c(z10);
        }

        @Override // S0.f.b
        void d(boolean z10) {
            if (f()) {
                this.f8679a.i(z10);
            } else {
                this.f8679a.d(z10);
            }
        }

        @Override // S0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f8679a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        y0.f.h(textView, "textView cannot be null");
        if (z10) {
            this.f8675a = new a(textView);
        } else {
            this.f8675a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f8675a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f8675a.b();
    }

    public void c(boolean z10) {
        this.f8675a.c(z10);
    }

    public void d(boolean z10) {
        this.f8675a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f8675a.e(transformationMethod);
    }
}
