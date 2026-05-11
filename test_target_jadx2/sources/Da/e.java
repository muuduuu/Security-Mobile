package Da;

/* loaded from: classes2.dex */
public class e extends a {
    public e(String str) {
        super("Module '" + str + "' not found. Are you sure all modules are linked correctly?");
    }

    @Override // Da.a
    public String a() {
        return "E_MODULE_NOT_FOUND";
    }
}
